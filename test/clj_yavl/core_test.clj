(ns clj-yavl.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.core :as core]))

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
          result (core/base-plot encodings common-specs charts-opts)]
      (is (= "point" (:mark result)))
      (is (= "quantitative" (get-in result [:encoding :x :type])))
      (is (= "Miles_per_Gallon" (get-in result [:encoding :x :field])))
      (is (= "nominal" (get-in result [:encoding :y :type]))) ;; Enum -> Nominal
      (is (= "Origin" (get-in result [:encoding :y :field])))
      (is (= "nominal" (get-in result [:encoding :color :type])))
      (is (= "Name" (get-in result [:encoding :color :field])))))

  (testing "base-plot with explicit encoding map overrides inference"
    (let [encodings {:x {:field "Miles_per_Gallon" :type "ordinal"}}
          common-specs {:mark "bar"}
          charts-opts {:data-schema cars-schema}
          result (core/base-plot encodings common-specs charts-opts)]
      (is (= "ordinal" (get-in result [:encoding :x :type])))))

  (testing "base-plot with missing field in schema (no inference)"
    (let [encodings {:x "UnknownField"}
          common-specs {:mark "line"}
          charts-opts {:data-schema cars-schema}
          result (core/base-plot encodings common-specs charts-opts)]
      (is (= "UnknownField" (get-in result [:encoding :x :field])))
      (is (nil? (get-in result [:encoding :x :type])))))

  (testing "base-plot with different marks"
    (doseq [mark ["point" "line" "bar"]]
      (let [result (core/base-plot {:x "Miles_per_Gallon"} {:mark mark} {:data-schema cars-schema})]
        (is (= mark (:mark result))))))

  (testing "base-plot with temporal type"
    (let [encodings {:x "Year"}
          common-specs {:mark "point"}
          charts-opts {:data-schema cars-schema}
          result (core/base-plot encodings common-specs charts-opts)]
      (is (= "temporal" (get-in result [:encoding :x :type]))))))
