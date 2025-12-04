(require '[clj-yavl.json-schema :as parser])
(require '[cheshire.core :as json])
(require '[clojure.pprint :as pprint])
(require '[clojure.string :as str])
(require '[clojure.walk :as walk])

(defn get-deps [schema]
  (let [deps (atom #{})]
    (walk/postwalk
      (fn [x]
        (when (and (vector? x) (= :ref (first x)))
          (let [args (if (map? (second x)) (nth x 2) (second x))]
            (when (and (seq? args) (= 'var (first args)))
              (swap! deps conj (second args)))))
        x)
      schema)
    @deps))

(defn topo-sort [registry]
  (let [deps-map (into {} (for [[k v] registry] [k (get-deps v)]))
        visited (atom #{})
        result (atom [])
        visiting (atom #{})]

    (letfn [(visit [n]
              (when-not (@visited n)
                (if (@visiting n)
                  nil ;; cycle
                  (do
                    (swap! visiting conj n)
                    (doseq [dep (get deps-map n)]
                      (when (contains? registry dep)
                        (visit dep)))
                    (swap! visiting disj n)
                    (swap! visited conj n)
                    (swap! result conj n)))))]

      (doseq [k (sort (keys registry))]
        (visit k))
      @result)))

(println "Reading Vega-Lite schema...")
(def json-file "resources/vega-lite-v6.json")
(when-not (.exists (java.io.File. json-file))
  (println "Downloading schema...")
  (spit json-file (slurp "https://vega.github.io/schema/vega-lite/v6.json")))

(def json-str (slurp json-file))
(def json-data (json/parse-string json-str keyword))

(println "Transforming to Malli schema...")
(def result (parser/transform json-data))
(def registry (:registry result))
(def schema-body (:schema result))
(def sorted-ks (topo-sort registry))

(println "Writing to src/clj_yavl/schema/vega_lite.cljc...")
(spit "src/clj_yavl/schema/vega_lite.cljc"
      (str "(ns clj-yavl.schema.vega-lite\n"
           "  (:require [malli.core :as m]))\n\n"

           ";; Forward declarations\n"
           (str/join "\n"
             (for [partition (partition-all 100 sorted-ks)]
               (str "(declare " (str/join " " partition) ")")))
           "\n\n"

           ";; Registry definitions (Topological Order)\n"
           (str/join "\n"
             (for [k sorted-ks]
               (str "(def " k "\n  " (with-out-str (pprint/pprint (get registry k))) ")\n")))
           "\n"

           ";; Top Level Schema\n"
           "(def schema\n  " (with-out-str (pprint/pprint schema-body)) ")"))

(println "Done.")
