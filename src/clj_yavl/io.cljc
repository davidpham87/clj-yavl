(ns clj-yavl.io
  (:require #?(:clj [babashka.json :as json])))

(defn read-json-str
  "Reads a JSON string and returns a Clojure data structure.
   Options:
   :key-fn - a function to apply to keys (e.g. keyword)
   CLJ: uses babashka.json
   CLJS: uses js/JSON.parse and js->clj"
  ([s] (read-json-str s nil))
  ([s {:keys [key-fn] :as _opts}]
   #?(:clj (json/read-str s _opts)
      :cljs (let [js-obj (js/JSON.parse s)]
              (js->clj js-obj :keywordize-keys (= key-fn keyword))))))

(defn write-json-str
  "Writes a Clojure data structure to a JSON string.
   Options:
   :indent - true or a number of spaces for indentation (not fully supported in CLJS default JSON)
   CLJ: uses babashka.json
   CLJS: uses js/JSON.stringify"
  ([data] (write-json-str data nil))
  ([data {:keys [indent] :as _opts}]
   #?(:clj (json/write-str data _opts)
      :cljs (if indent
              (js/JSON.stringify (clj->js data) nil (if (number? indent) indent 2))
              (js/JSON.stringify (clj->js data))))))
