(ns simplify-schema
  (:require [clojure.java.io :as io]
            [clojure.walk :as walk]
            [clojure.string :as str]
            [clojure.pprint :as pprint]))

(defn read-file [f]
  (let [reader (java.io.PushbackReader. (io/reader f))]
    (loop [forms []]
      (let [form (try (read reader)
                      (catch Exception e nil))]
        (if form
          (recur (conj forms form))
          forms)))))

(defn parse-ns [forms]
  (let [ns-form (first forms)]
    (if (and (list? ns-form) (= 'ns (first ns-form)))
      (let [ns-name (str (second ns-form))
            require-form (first (filter #(and (list? %) (= :require (first %))) ns-form))
            aliases (reduce (fn [acc req]
                              (cond
                                (vector? req) (let [full-ns (str (first req))
                                                    as-opt (some #{:as} req)
                                                    alias (if as-opt
                                                            (second (drop-while #(not= % :as) req))
                                                            nil)]
                                                (if alias
                                                  (assoc acc (str alias) full-ns)
                                                  acc))
                                :else acc))
                            {}
                            (rest require-form))]
        {:name ns-name :aliases aliases})
      {:name "user" :aliases {}})))

(defn resolve-symbol [sym ns-info]
  (let [s-str (str sym)
        parts (str/split s-str #"/")]
    (if (= 1 (count parts))
      (symbol (:name ns-info) s-str)
      (let [alias (first parts)
            name-part (second parts)
            full-ns (get (:aliases ns-info) alias)]
        (if full-ns
          (symbol full-ns name-part)
          sym ;; Unknown alias, keep as is (or fully qualified already)
          )))))

(defn resolve-form [form ns-info]
  (walk/postwalk
   (fn [x]
     (if (and (list? x) (= 'var (first x)))
       (let [sym (second x)]
         (list 'var (resolve-symbol sym ns-info)))
       x))
   form))

(defn collect-vector-children [forms ns-info]
  (let [collected (atom #{})]
    (walk/postwalk
     (fn [x]
       (when (and (vector? x)
                  (keyword? (first x))
                  (= :map (first x))
                  (map? (second x))
                  (:closed (second x)))
         (doseq [child (drop 2 x)]
           (when (vector? child)
             (let [resolved (resolve-form child ns-info)]
               (swap! collected conj resolved)))))
       x)
     forms)
    @collected))

(defn safe-dep? [def-val]
  (let [refs (atom #{})]
    (walk/postwalk
     (fn [x]
       (when (and (list? x) (= 'var (first x)))
         (swap! refs conj (second x)))
       x)
     def-val)
    (every? (fn [sym]
              (let [ns-name (namespace sym)]
                (or (nil? ns-name)
                    (#{"clojure.core"
                       "clj-yavl.schema2.vega-lite.primitives"
                       "clj-yavl.schema2.vega-lite.expr"
                       "clj-yavl.schema2.vega-lite.common"} ns-name))))
            @refs)))

(defn process-files [dir]
  (let [files (->> (file-seq (io/file dir))
                   (filter #(and (.isFile %) (.endsWith (.getName %) ".cljc")
                                 (not= (.getName %) "common_fields.cljc"))))
        file-data (map (fn [f]
                         (let [forms (read-file f)
                               ns-info (parse-ns forms)]
                           {:file f
                            :forms forms
                            :ns-info ns-info
                            :defs (collect-vector-children forms ns-info)}))
                       files)
        all-defs (apply concat (map :defs file-data))]

    (println "Found" (count all-defs) "total definitions instances.")
    (let [unique-defs (set all-defs)]
       (println "Found" (count unique-defs) "unique resolved definitions.")

      (let [grouped (group-by first unique-defs)
            single-def-keys (filter (fn [[k v]] (= 1 (count v))) grouped)

            safe-single-defs (filter (fn [[k v]] (safe-dep? (first v))) single-def-keys)

            common-defs-map (into {} (map (fn [[k v]] [k (first v)]) safe-single-defs))]

        (println "Found" (count single-def-keys) "keys with a single definition.")
        (println "Found" (count common-defs-map) "keys with safe dependencies.")
        common-defs-map))))

(defn generate-common-fields-file [common-defs dir]
  (let [sorted-defs (sort-by key common-defs)
        file-path (io/file dir "common_fields.cljc")
        ns-decl '(ns clj-yavl.schema2.vega-lite.common-fields
                   (:require [clj-yavl.schema2.vega-lite.primitives :as primitives]
                             [clj-yavl.schema2.vega-lite.expr :as expr]
                             [clj-yavl.schema2.vega-lite.common :as common]))
        map-def `(def ~'common-map
                   ~(into (sorted-map) common-defs))]

    (spit file-path (with-out-str
                      (pprint/pprint ns-decl)
                      (println)
                      (pprint/pprint map-def)))))

(defn rewrite-files [dir common-defs]
  (let [excluded-files #{"common_fields.cljc" "primitives.cljc" "expr.cljc" "common.cljc"}
        files (->> (file-seq (io/file dir))
                   (filter #(and (.isFile %) (.endsWith (.getName %) ".cljc")
                                 (not (contains? excluded-files (.getName %))))))]
    (doseq [f files]
      (let [forms (read-file f)
            ns-info (parse-ns forms)
            needs-rewrite? (atom false)]

        ;; Walk to detect need for rewrite (only care about vectors inside map schemas)
        ;; Actually we can just do the transformation directly.
        ;; But wait, we need to handle the vector wrapping.

        (let [new-ns-form (let [ns-form (first forms)]
                              (if (and (list? ns-form) (= 'ns (first ns-form)))
                                (let [req-clause (or (first (filter #(and (list? %) (= :require (first %))) ns-form))
                                                     '(:require))
                                      already-req? (some #(and (vector? %) (= 'clj-yavl.schema2.vega-lite.common-fields (first %))) (rest req-clause))
                                      new-req-clause (if already-req?
                                                       req-clause
                                                       (concat req-clause [['clj-yavl.schema2.vega-lite.common-fields :as 'common-fields]]))]
                                  (concat (take-while #(not (and (list? %) (= :require (first %)))) ns-form)
                                          [new-req-clause]
                                          (rest (drop-while #(not (and (list? %) (= :require (first %)))) ns-form))))
                                ns-form))

              transformed-forms (map (fn [form]
                                       (if (= 'ns (first form))
                                         new-ns-form
                                         (walk/postwalk
                                          (fn [x]
                                            (if (and (vector? x)
                                                     (keyword? (first x))
                                                     (= :map (first x))
                                                     (map? (second x))
                                                     (:closed (second x)))
                                              ;; Found a map schema. Process its children.
                                              (let [children (drop 2 x)
                                                    {static-children false dynamic-children true}
                                                    (group-by (fn [child]
                                                                (and (vector? child)
                                                                     (keyword? (first child))
                                                                     (let [resolved (resolve-form child ns-info)]
                                                                       (and (contains? common-defs (first child))
                                                                            (= resolved (get common-defs (first child)))))))
                                                              children)]

                                                (if (seq dynamic-children)
                                                  (do
                                                    (reset! needs-rewrite? true)
                                                    ;; Construct (into [:map {:closed true} static...] [ (get...) ... ])
                                                    (list 'into
                                                          (vec (concat (take 2 x) static-children))
                                                          (vec (map (fn [child]
                                                                      (list 'get 'common-fields/common-map (first child)))
                                                                    dynamic-children))))
                                                  x))
                                              x))
                                          form)))
                                     forms)]
          (when @needs-rewrite?
            (spit f (with-out-str
                      (doseq [tf transformed-forms]
                        (pprint/pprint tf)
                        (println))))))))))

(def dir "src/clj_yavl/schema2/vega_lite")
(let [common-defs (process-files dir)]
  (generate-common-fields-file common-defs dir)
  (rewrite-files dir common-defs))
