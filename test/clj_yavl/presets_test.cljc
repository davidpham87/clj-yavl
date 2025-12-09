(ns clj-yavl.presets-test
  (:require [clojure.test :refer [deftest is testing] :include-macros true]
            [clj-yavl.presets :as presets]))

(deftest xy-plot-test
  (testing "Basic XY plot"
    (let [spec (presets/unit-spec {:type :xyplot :x "A" :y "B" :mark :point :title "My Plot"})]
      (is (= "point" (get-in spec [:mark])))
      (is (= "My Plot" (:title spec)))
      (is (= "A" (get-in spec [:encoding :x :field])))
      (is (= "B" (get-in spec [:encoding :y :field])))))

  (testing "XY plot with encoding maps"
    (let [spec (presets/unit-spec {:type :xyplot
                                   :x {:field "A" :type "quantitative"}
                                   :y {:field "B" :type "nominal"}})]
      (is (= "quantitative" (get-in spec [:encoding :x :type])))
      (is (= "nominal" (get-in spec [:encoding :y :type])))))

  (testing "XY plot with faceting"
    (let [spec (presets/unit-spec {:type :xyplot :x "A" :y "B" :row "R" :column "C"})]
      (is (= "R" (get-in spec [:facet :row :field])))
      (is (= "C" (get-in spec [:facet :column :field])))
      (is (some? (:spec spec)))))

  (testing "XY plot with wrapped facet"
    (let [spec (presets/unit-spec {:type :xyplot :x "A" :y "B" :facet "F" :columns 2})]
      (is (= "F" (get-in spec [:facet :field])))
      (is (= 2 (get-in spec [:facet :columns])))
      (is (some? (:spec spec))))))

(deftest pie-chart-test
  (testing "Basic Pie chart"
    (let [spec (presets/unit-spec {:type :pie :category "C" :value "V" :title "Pie"})]
      (is (= "arc" (get-in spec [:mark :type])))
      (is (= "V" (get-in spec [:encoding :theta :field])))
      (is (= "C" (get-in spec [:encoding :color :field])))))

  (testing "Doughnut chart"
    (let [spec (presets/unit-spec {:type :pie :category "C" :value "V" :inner-radius 50})]
      (is (= 50 (get-in spec [:mark :innerRadius])))))

  (testing "Faceted Pie chart"
    (let [spec (presets/unit-spec {:type :pie :category "C" :value "V" :facet "F"})]
      (is (= "F" (get-in spec [:facet :field]))))))

(deftest bar-chart-test
  (testing "Basic Bar chart"
    (let [spec (presets/unit-spec {:type :bar :x "X" :y "Y"})]
      (is (= "bar" (:mark spec)))
      (is (= "X" (get-in spec [:encoding :x :field])))))

  (testing "Grouped Bar chart"
    (let [spec (presets/unit-spec {:type :bar :x "X" :y "Y" :group "G" :grouped? true})]
      (is (= "G" (get-in spec [:encoding :xOffset :field])))))

  (testing "Grouped Horizontal Bar chart"
    (let [spec (presets/unit-spec {:type :bar :x "X" :y "Y" :group "G" :grouped? true :orientation :horizontal})]
      (is (= "G" (get-in spec [:encoding :yOffset :field])))))

  (testing "Faceted Bar chart"
    (let [spec (presets/unit-spec {:type :bar :x "X" :y "Y" :row "R"})]
      (is (= "R" (get-in spec [:facet :row :field]))))))
