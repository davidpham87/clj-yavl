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
    ;; schema is [:ref #'TopLevelSpec]
    (is (vector? generated/schema))
    (is (= :ref (first generated/schema)))

    (testing "Malli validation of generated schema"
      (is (some? (m/schema generated/schema))))))

(deftest vega-lite-roundtrip-test
  (testing "Optional property structure"
    (let [json {:definitions {} :type "object" :properties {:a {:type "string"}}}
          res (sut/transform json)
          schema (:schema res)]
      ;; Expanded optional keys (no mu/optional-keys in raw output)
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
      ;; Note: registry keys are sanitized symbols
      )))
