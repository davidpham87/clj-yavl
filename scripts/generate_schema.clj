(require '[clj-yavl.json-schema :as parser])
(require '[cheshire.core :as json])
(require '[clojure.pprint :as pprint])
(require '[clojure.string :as str])

(println "Reading Vega-Lite schema...")
(def json-str (slurp "resources/vega-lite-v6.json"))
(def json-data (json/parse-string json-str keyword))

(println "Transforming to Malli schema...")
(def result (parser/transform json-data))
(def registry (:registry result))
(def schema-body (:schema result))
(def ks (keys registry))

(println "Writing to src/clj_yavl/schema/vega_lite.cljc...")
(spit "src/clj_yavl/schema/vega_lite.cljc"
      (str "(ns clj-yavl.schema.vega-lite\n"
           "  (:require [malli.core :as m]))\n\n"

           ";; Forward declarations\n"
           (str/join "\n"
             (for [partition (partition-all 100 ks)]
               (str "(declare " (str/join " " partition) ")")))
           "\n\n"

           ";; Registry definitions\n"
           (str/join "\n"
             (for [[k v] registry]
               (str "(def " k "\n  " (with-out-str (pprint/pprint v)) ")\n")))
           "\n"

           ";; Top Level Schema\n"
           "(def schema\n  " (with-out-str (pprint/pprint schema-body)) ")"))

(println "Done.")
