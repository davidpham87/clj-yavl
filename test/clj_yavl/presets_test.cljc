(ns clj-yavl.presets-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.presets :as presets]))

(deftest xy-plot-test
  (testing "Basic XY plot"
    (let [spec (presets/xy-plot {:x "A" :y "B" :mark :point :title "My Plot"})]
      (is (= "point" (get-in spec [:mark])))
      (is (= "My Plot" (:title spec)))
      (is (= "A" (get-in spec [:encoding :x :field])))
      (is (= "B" (get-in spec [:encoding :y :field])))))

  (testing "XY plot with encoding maps"
    (let [spec (presets/xy-plot {:x {:field "A" :type "quantitative"}
                                 :y {:field "B" :type "nominal"}})]
      (is (= "quantitative" (get-in spec [:encoding :x :type])))
      (is (= "nominal" (get-in spec [:encoding :y :type]))))))

(deftest pie-chart-test
  (testing "Basic Pie chart"
    (let [spec (presets/pie-chart {:category "C" :value "V" :title "Pie"})]
      (is (= "arc" (get-in spec [:mark :type])))
      (is (= "V" (get-in spec [:encoding :theta :field])))
      (is (= "C" (get-in spec [:encoding :color :field])))))

  (testing "Doughnut chart"
    (let [spec (presets/pie-chart {:category "C" :value "V" :inner-radius 50})]
      (is (= 50 (get-in spec [:mark :innerRadius]))))))

(deftest bar-chart-test
  (testing "Basic Bar chart"
    (let [spec (presets/bar-chart {:x "X" :y "Y"})]
      (is (= "bar" (:mark spec)))
      (is (= "X" (get-in spec [:encoding :x :field])))))

  (testing "Grouped Bar chart"
    (let [spec (presets/bar-chart {:x "X" :y "Y" :group "G" :grouped? true})]
      (is (= "G" (get-in spec [:encoding :xOffset :field])))))

  (testing "Grouped Horizontal Bar chart"
    (let [spec (presets/bar-chart {:x "X" :y "Y" :group "G" :grouped? true :orientation :horizontal})]
      (is (= "G" (get-in spec [:encoding :yOffset :field]))))))
