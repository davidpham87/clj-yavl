(ns example.json-schema-test
  (:require #?(:clj [clojure.test :refer [deftest is testing]]
               :cljs [cljs.test :refer [deftest is testing]])
            [example.json-schema :as sut]
            [malli.core :as m]
            [malli.json-schema :as json-schema]
            #?(:clj [cheshire.core :as json])))

(defn read-json [path]
  #?(:clj (json/parse-string (slurp path) keyword)
     :cljs (let [fs (js/require "fs")
                 content (.readFileSync fs path "utf8")]
             (js->clj (js/JSON.parse content) :keywordize-keys true))))

(deftest vega-lite-roundtrip-test
  (testing "Optional property structure"
    (let [json {:definitions {} :type "object" :properties {:a {:type "string"}}}
          res (sut/transform json)
          schema (:schema res)]
      ;; The parser adds {:closed false} by default for objects with properties unless additionalProperties is false
      (is (= [:map {:closed false} [:a {:optional true} string?]] schema))))

  (testing "Can parse Vega-Lite v6 schema"
    (let [json-data (read-json "resources/vega-lite-v6.json")
          {:keys [schema registry]} (sut/transform json-data)]

      (is (some? schema) "Schema should not be nil")
      (is (map? registry) "Registry should be a map")
      (is (not-empty registry) "Registry should not be empty")

      (testing "Malli schema validity"
        (let [wrapped-schema [:schema {:registry registry} schema]
              ms (m/schema wrapped-schema)]
           (is (some? ms) "Malli schema instance created")))

      (testing "JSON Schema roundtrip"
        (let [wrapped-schema [:schema {:registry registry} schema]
              ms (m/schema wrapped-schema)
              js (json-schema/transform ms)]
          (is (some? js) "Generated JSON schema should not be nil")
          (is (map? js) "Generated JSON schema should be a map"))))))
