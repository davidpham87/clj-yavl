(ns simplify-local
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

(defn collect-vector-children [forms]
  (let [collected (atom [])]
    (walk/postwalk
     (fn [x]
       (when (and (vector? x)
                  (keyword? (first x))
                  (= :map (first x))
                  (map? (second x))
                  (:closed (second x)))
         (doseq [child (drop 2 x)]
           (when (vector? child)
             (swap! collected conj child))))
       x)
     forms)
    @collected))

(defn simplify-file [f]
  (let [forms (read-file f)
        all-children (collect-vector-children forms)
        freqs (frequencies all-children)
        ;; Use regular map instead of sorted-map to avoid comparison issues with vectors/maps
        duplicates (into {} (filter (fn [[k v]] (> v 1)) freqs))
        common-defs (keys duplicates)
        ;; Sort manually if possible for stability, but regular sort might fail on complex nested structures.
        ;; Let's try to sort by string representation.
        sorted-common-defs (sort-by str common-defs)

        ;; Create meaningful keys if possible (e.g. use first keyword)
        common-map (into {} (map-indexed (fn [i val]
                                           (let [key-name (if (keyword? (first val))
                                                            (name (first val))
                                                            (str "field-" i))]
                                             [(keyword key-name) val]))
                                         sorted-common-defs))

        val-to-key (into {} (map (fn [[k v]] [v k]) common-map))]

    (if (empty? common-map)
      (println "No common fields found in" f)
      (do
        (println "Found" (count common-map) "common fields in" f)

        (let [new-forms (map (fn [form]
                               (walk/postwalk
                                (fn [x]
                                  (if (and (vector? x)
                                           (keyword? (first x))
                                           (= :map (first x))
                                           (map? (second x))
                                           (:closed (second x)))
                                    ;; Found map schema
                                    (let [children (drop 2 x)
                                          {static-children false dynamic-children true}
                                          (group-by (fn [child] (contains? val-to-key child)) children)]

                                      (if (seq dynamic-children)
                                        (list 'into
                                              (vec (concat (take 2 x) static-children))
                                              (vec (map (fn [child]
                                                          (list 'get 'common-map (get val-to-key child)))
                                                        dynamic-children)))
                                        x))
                                    x))
                                form))
                             forms)

              ns-form (first new-forms)
              rest-forms (rest new-forms)
              ;; Use sorted map for output stability
              sorted-common-map (into (sorted-map) common-map)
              common-def `(def ~'common-map ~sorted-common-map)]

          (spit f (with-out-str
                    (pprint/pprint ns-form)
                    (println)
                    (pprint/pprint common-def)
                    (println)
                    (doseq [rf rest-forms]
                      (pprint/pprint rf)
                      (println)))))))))

(simplify-file "src/clj_yavl/schema2/vega_lite.cljc")
