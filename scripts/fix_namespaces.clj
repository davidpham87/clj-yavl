(ns fix-namespaces
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))

(defn fix-file [f]
  (let [content (slurp f)
        new-content (str/replace content #"clj-yavl\.schema\.vega-lite" "clj-yavl.schema2.vega-lite")]
    (spit f new-content)))

(defn process-dir [dir]
  (let [files (->> (file-seq (io/file dir))
                   (filter #(and (.isFile %) (.endsWith (.getName %) ".cljc"))))]
    (doseq [f files]
      (fix-file f))))

(process-dir "src/clj_yavl/schema2")
