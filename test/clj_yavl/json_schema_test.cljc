(ns clj-yavl.json-schema-test
  (:require #?(:clj [clojure.test :refer [deftest is testing]]
               :cljs [cljs.test :refer [deftest is testing]])
            [clj-yavl.json-schema :as sut]
            [clj-yavl.schema.vega-lite :as generated]
            [malli.core :as m]
            [malli.json-schema :as json-schema]
            #?(:clj [cheshire.core :as json])))

(defn read-json [path]
  #?(:clj (json/parse-string (slurp path) keyword)
     :cljs (let [fs (js/require "fs")
                 content (.readFileSync fs path "utf8")]
             (js->clj (js/JSON.parse content) :keywordize-keys true))))

(deftest generated-schema-test
  (testing "Generated schema file is valid"
    (is (map? generated/schema))
    (let [{:keys [schema registry]} generated/schema]
       (is (some? schema))
       (is (not-empty registry))
       (testing "Malli validation of generated schema"
         (is (some? (m/schema [:schema {:registry registry} schema])))))))

(deftest vega-lite-roundtrip-test
  (testing "Optional property structure"
    (let [json {:definitions {} :type "object" :properties {:a {:type "string"}}}
          res (sut/transform json)
          schema (:schema res)]
      ;; The parser adds {:closed false} by default for objects with properties unless additionalProperties is false
      ;; Expanded optional keys.
      (is (= [:map {:closed false} [:a {:optional true} 'string?]] schema))))

  (testing "Optimization of anyOf enums"
    (let [json {:anyOf [{:const "a"} {:const "b"} {:type "string"}]}
          res (sut/transform json)
          schema (:schema res)]
      (is (= [:or 'string? [:enum "a" "b"]] schema))))

  (testing "Optimization of allOf to :and"
    (let [json {:allOf [{:type "object"} {:type "object"}]}
          res (sut/transform json)
          schema (:schema res)]
      ;; Empty objects are [:map-of 'any? 'any?]
      (is (= [:and [:map-of 'any? 'any?] [:map-of 'any? 'any?]] schema))))

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
