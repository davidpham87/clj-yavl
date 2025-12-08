(ns clj-yavl.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.api :as api]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clojure.test.check.properties :as prop]
            [clojure.test.check.generators :as gen]
            [malli.core :as m]
            [malli.generator :as mg]
            [clojure.string :as str]))

(def cars-schema
  [:vector
   [:map
    [:Name string?]
    [:Miles_per_Gallon number?]
    [:Year inst?]
    [:Origin [:enum "USA" "Europe" "Japan"]]]])

(deftest base-plot-test
  (testing "base-plot with simple string encodings and type inference"
    (let [encodings {:x "Miles_per_Gallon" :y "Origin" :color "Name"}
          common-specs {:mark "point" :data {:url "data/cars.json"}}
          charts-opts {:data-schema cars-schema}
          result (api/base-plot encodings common-specs charts-opts)]
      (is (= "point" (:mark result)))
      (is (= "quantitative" (get-in result [:encoding :x :type])))
      (is (= "Miles_per_Gallon" (get-in result [:encoding :x :field])))
      (is (= "nominal" (get-in result [:encoding :y :type])))
      (is (= "Origin" (get-in result [:encoding :y :field])))
      (is (= "nominal" (get-in result [:encoding :color :type])))
      (is (= "Name" (get-in result [:encoding :color :field])))))

  (testing "base-plot defaults"
    (let [result (api/base-plot {} {:mark "bar"} {})]
      (is (= 400 (:width result)))
      (is (= 300 (:height result)))
      (is (vector? (get-in result [:config :range :category])))
      (is (= 4 (count (get-in result [:config :range :category])))) ;; Google colors
      (is (= 12 (get-in result [:config :axis :labelFontSize])))
      (is (= 14 (get-in result [:config :axis :titleFontSize])))))

  (testing "base-plot defaults can be overridden"
    (let [result (api/base-plot {} {:mark "bar" :width 800 :height 600} {})]
      (is (= 800 (:width result)))
      (is (= 600 (:height result)))))

  (testing "base-plot with explicit encoding map overrides inference"
    (let [encodings {:x {:field "Miles_per_Gallon" :type "ordinal"}}
          common-specs {:mark "bar"}
          charts-opts {:data-schema cars-schema}
          result (api/base-plot encodings common-specs charts-opts)]
      (is (= "ordinal" (get-in result [:encoding :x :type])))))

  (testing "base-plot with missing field in schema (no inference)"
    (let [encodings {:x "UnknownField"}
          common-specs {:mark "line"}
          charts-opts {:data-schema cars-schema}
          result (api/base-plot encodings common-specs charts-opts)]
      (is (= "UnknownField" (get-in result [:encoding :x :field])))
      (is (nil? (get-in result [:encoding :x :type])))))

  (testing "base-plot with different marks"
    (doseq [mark ["point" "line" "bar"]]
      (let [result (api/base-plot {:x "Miles_per_Gallon"} {:mark mark} {:data-schema cars-schema})]
        (is (= mark (:mark result))))))

  (testing "base-plot with temporal type"
    (let [encodings {:x "Year"}
          common-specs {:mark "point"}
          charts-opts {:data-schema cars-schema}
          result (api/base-plot encodings common-specs charts-opts)]
      (is (= "temporal" (get-in result [:encoding :x :type]))))))

(deftest transforms-test
  (testing "rename-column-values"
    (let [result (api/rename-column-values "origin" {"USA" "United States" "UK" "United Kingdom"})
          expr (:calculate result)
          as (:as result)]
      (is (= "origin" as))
      ;; Check for presence of replacement logic.
      ;; Exact string match depends on map iteration order, so check parts.
      (is (str/includes? expr "datum['origin'] == 'USA' ? 'United States'"))
      (is (str/includes? expr "datum['origin'] == 'UK' ? 'United Kingdom'"))
      (is (str/ends-with? expr ": datum['origin']"))))

  (testing "transform-map"
    (let [result (api/transform-map "new_col" "datum.a * 2")]
      (is (= "new_col" (:as result)))
      (is (= "datum.a * 2" (:calculate result)))))

  (testing "transform-filter"
    (let [result (api/transform-filter "datum.a > 10")]
      (is (= "datum.a > 10" (:filter result))))))

;; Generative Testing Helpers using Malli Generators

(def field-name-gen
  (gen/fmap (fn [s] (str "f_" s)) (gen/not-empty gen/string-alphanumeric)))

(def simple-type-gen
  (mg/generator [:enum 'int? 'integer? 'number? 'double? 'float? 'string? 'boolean? 'inst?]))

(def enum-type-gen
  (mg/generator [:tuple [:= :enum] [:vector {:min 1 :max 3} [:string {:min 1}]]]))

(def field-type-gen
  (gen/one-of [simple-type-gen enum-type-gen]))

(def dataset-schema-gen
  (gen/fmap (fn [fields]
              [:vector (into [:map] fields)])
            (gen/map field-name-gen field-type-gen {:min-elements 1 :max-elements 5})))

(def encoding-channel-gen
  (mg/generator [:enum :x :y :color :size :shape :text]))

(defn encodings-gen [schema]
  (let [map-schema (second schema)
        fields (map first (rest map-schema)) ;; keys
        field-names (map name fields)]
    (gen/map encoding-channel-gen (gen/elements field-names))))

(def schema-and-encodings-gen
  (gen/bind dataset-schema-gen
            (fn [schema]
              (gen/fmap (fn [encs] [schema encs])
                        (encodings-gen schema)))))

(defn expected-vl-type [malli-type]
  (let [t (if (vector? malli-type) (first malli-type) malli-type)]
    (cond
      (#{'int? 'integer? 'number? 'double? 'float? :int :double :number :float} t) "quantitative"
      (#{'string? :string} t) "nominal"
      (#{'boolean? :boolean} t) "nominal"
      (#{'inst? 'time? :inst :time} t) "temporal"
      (= :enum t) "nominal"
      :else nil)))

(defspec base-plot-generative-test 100
  (prop/for-all [[schema encodings] schema-and-encodings-gen]
    (let [common-specs {:mark "point"}
          charts-opts {:data-schema schema}
          result (api/base-plot encodings common-specs charts-opts)
          res-encoding (:encoding result)]
      (and
        (map? result)
        (every? (fn [[k v]]
                  (let [field (:field v)
                        type (:type v)
                        ;; Extract field type from schema
                        map-items (rest (second schema))
                        field-schema (some (fn [[fk fv]] (when (= (name fk) field) fv)) map-items)]
                    (= type (expected-vl-type field-schema))))
                res-encoding)))))
