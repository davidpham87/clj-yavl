(require '[clj-yavl.json-schema :as parser])
(require '[cheshire.core :as json])
(require '[clojure.pprint :as pprint])

(println "Reading Vega-Lite schema...")
(def json-str (slurp "resources/vega-lite-v6.json"))
(def json-data (json/parse-string json-str keyword))

(println "Transforming to Malli schema...")
(def schema-data (parser/transform json-data))

(println "Writing to src/clj_yavl/schema/vega_lite.cljc...")
(spit "src/clj_yavl/schema/vega_lite.cljc"
      (str "(ns clj-yavl.schema.vega-lite)\n\n"
           "(def schema\n  "
           (with-out-str (pprint/pprint schema-data))
           ")"))

(println "Done.")
