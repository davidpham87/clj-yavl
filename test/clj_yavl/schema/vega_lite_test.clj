(ns clj-yavl.schema.vega-lite-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.schema.vega-lite :as vls]
            [malli.core :as m]
            [malli.error :as me]
            [cheshire.core :as json]
            [clojure.java.io :as io]))

(def normalized-specs-path "test-resources/vega-lite/examples/specs/normalized")

(defn get-json-files [path]
  (filter #(and (.isFile %) (.endsWith (.getName %) ".json"))
          (file-seq (io/file path))))

(deftest validate-all-normalized-examples
  (let [files (get-json-files normalized-specs-path)
        validator (m/validator vls/schema)]
    (println "Found" (count files) "examples.")
    (doseq [file files]
      (testing (str "Validating " (.getName file))
        (let [json-content (json/parse-string (slurp file) true)]
          (if (validator json-content)
            (is true)
            (let [explanation (m/explain vls/schema json-content)]
               (println "Failed:" (.getName file))
               (println (me/humanize explanation))
               (is false (str "Validation failed for " (.getName file))))))))))
