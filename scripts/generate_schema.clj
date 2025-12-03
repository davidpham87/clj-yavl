(require '[clj-yavl.json-schema :as parser])
(require '[cheshire.core :as json])
(require '[clojure.pprint :as pprint])

(println "Reading Vega-Lite schema...")
(def json-str (slurp "resources/vega-lite-v6.json"))
(def json-data (json/parse-string json-str keyword))

(println "Transforming to Malli schema...")
(def result (parser/transform json-data))
(def registry (:registry result))
(def schema-body (:schema result))

(println "Writing to src/clj_yavl/schema/vega_lite.cljc...")
(spit "src/clj_yavl/schema/vega_lite.cljc"
      (str "(ns clj-yavl.schema.vega-lite)\n\n"
           "(def schema\n"
           "  {:schema " (with-out-str (pprint/pprint schema-body)) "\n"
           "   :registry " (with-out-str (pprint/pprint registry)) "})"))

(println "Done.")
