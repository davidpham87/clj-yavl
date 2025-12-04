(ns migrate-primitives
  (:require [clojure.pprint :as pp]
            [clojure.walk :as walk]
            [clojure.java.io :as io]
            [clojure.string :as str]))

(def vega-file "src/clj_yavl/schema/vega_lite.cljc")
(def prim-file "src/clj_yavl/schema/vega_lite/primitives.cljc")

(defn has-ref? [form]
  (let [found (atom false)]
    (walk/prewalk (fn [x]
                    (when (and (vector? x) (= (first x) :ref))
                      (reset! found true))
                    x)
                  form)
    @found))

(defn is-def? [form]
  (and (list? form) (= (first form) 'def)))

(defn is-alias? [form]
  (and (is-def? form)
       (symbol? (nth form 2))
       (str/starts-with? (str (nth form 2)) "primitives/")))

(defn read-forms [file]
  (let [rdr (java.io.PushbackReader. (io/reader file))
        forms (atom [])]
    (try
      (loop []
        (let [form (read rdr false ::eof)]
          (when (not= form ::eof)
            (swap! forms conj form)
            (recur))))
      (catch Exception e
        (println "Error reading:" e)
        (println "Last form:" (last @forms))))
    @forms))

(defn -main []
  (let [vega-forms (read-forms vega-file)
        prim-forms (read-forms prim-file)

        new-prims (atom [])
        new-vega-forms (atom [])]

    ;; Process Vega forms
    (doseq [form vega-forms]
      (cond
        ;; Keep ns
        (and (list? form) (= (first form) 'ns))
        (swap! new-vega-forms conj form)

        ;; Keep declare
        (and (list? form) (= (first form) 'declare))
        (swap! new-vega-forms conj form)

        ;; Definitions
        (is-def? form)
        (let [name (second form)
              val (nth form 2)]
          (cond
            ;; Already alias? Keep it.
            (is-alias? form)
            (swap! new-vega-forms conj form)

            ;; Has ref? Keep it.
            (has-ref? val)
            (swap! new-vega-forms conj form)

            ;; Primitive! Move it.
            :else
            (do
              (println "Moving:" name)
              (swap! new-prims conj form)
              (swap! new-vega-forms conj `(def ~name ~(symbol (str "primitives/" name)))))))

        ;; Other top level forms?
        :else
        (swap! new-vega-forms conj form)))

    ;; Write primitives
    (with-open [w (io/writer prim-file)]
      ;; Write ns from original prim file first
      (pp/pprint (first prim-forms) w)
      (binding [*print-namespace-maps* false]
        (doseq [form (rest prim-forms)]
           (pp/pprint form w))
        (doseq [form @new-prims]
           (pp/pprint form w))))

    ;; Write vega
    (with-open [w (io/writer vega-file)]
      (binding [*print-namespace-maps* false]
        (doseq [form @new-vega-forms]
           (pp/pprint form w))))))

(-main)
