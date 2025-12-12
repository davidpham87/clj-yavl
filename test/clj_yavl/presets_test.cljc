(ns clj-yavl.presets-test
  (:require [clojure.test :refer [deftest is testing] :include-macros true]
            [clj-yavl.presets :as presets]
            [clj-yavl.schema.vega-lite :as vls]
            [malli.core :as m]))

(deftest xy-plot-test
  (testing "Basic XY plot"
    (let [spec (presets/unit-spec {:type :xyplot :x "A" :y "B" :mark :point :title "My Plot"})]
      (is (m/validate vls/schema spec))
      (is (= {:data nil
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :width 400
              :height 300
              :mark "point"
              :encoding {:x {:field "A"} :y {:field "B"}}
              :title "My Plot"}
             spec))))

  (testing "XY plot with encoding maps"
    (let [spec (presets/unit-spec {:type :xyplot
                                   :x {:field "A" :type "quantitative"}
                                   :y {:field "B" :type "nominal"}})]
      (is (m/validate vls/schema spec))
      (is (= {:data nil
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :width 400
              :height 300
              :mark "point"
              :encoding {:x {:field "A" :type "quantitative"}
                         :y {:field "B" :type "nominal"}}}
             spec))))

  (testing "XY plot with faceting"
    (let [spec (presets/unit-spec {:type :xyplot :x "A" :y "B" :row "R" :column "C"})]
      (is (m/validate vls/schema spec))
      (is (= {:facet {:row {:field "R"} :column {:field "C"}}
              :spec {:width 400
                     :height 300
                     :mark "point"
                     :encoding {:x {:field "A"} :y {:field "B"}}}
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :data nil}
             spec))))

  (testing "XY plot with wrapped facet"
    (let [spec (presets/unit-spec {:type :xyplot :x "A" :y "B" :facet "F" :columns 2})]
      (is (m/validate vls/schema spec))
      (is (= {:facet {:field "F"}
              :spec {:width 400
                     :height 300
                     :mark "point"
                     :encoding {:x {:field "A"} :y {:field "B"}}}
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :columns 2
              :data nil}
             spec)))))

(deftest pie-chart-test
  (testing "Basic Pie chart"
    (let [spec (presets/unit-spec {:type :pie :category "C" :value "V" :title "Pie"})]
      (is (m/validate vls/schema spec))
      (is (= {:data nil
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :width 400
              :height 300
              :mark {:type "arc"}
              :encoding {:theta {:field "V" :type "quantitative" :stack true}
                         :color {:field "C" :type "nominal"}}
              :title "Pie"}
             spec))))

  (testing "Doughnut chart"
    (let [spec (presets/unit-spec {:type :pie :category "C" :value "V" :inner-radius 50})]
      (is (m/validate vls/schema spec))
      (is (= {:data nil
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :width 400
              :height 300
              :mark {:type "arc" :innerRadius 50}
              :encoding {:theta {:field "V" :type "quantitative" :stack true}
                         :color {:field "C" :type "nominal"}}}
             spec))))

  (testing "Faceted Pie chart"
    (let [spec (presets/unit-spec {:type :pie :category "C" :value "V" :facet "F"})]
      (is (m/validate vls/schema spec))
      (is (= {:facet {:field "F"}
              :spec {:width 400
                     :height 300
                     :mark {:type "arc"}
                     :encoding {:theta {:field "V" :type "quantitative" :stack true}
                                :color {:field "C" :type "nominal"}}}
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :data nil}
             spec)))))

(deftest bar-chart-test
  (testing "Basic Bar chart"
    (let [spec (presets/unit-spec {:type :bar :x "X" :y "Y"})]
      (is (m/validate vls/schema spec))
      (is (= {:data nil
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :width 400
              :height 300
              :mark "bar"
              :encoding {:x {:field "X"} :y {:field "Y"}}}
             spec))))

  (testing "Grouped Bar chart"
    (let [spec (presets/unit-spec {:type :bar :x "X" :y "Y" :group "G" :grouped? true})]
      (is (m/validate vls/schema spec))
      (is (= {:data nil
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :width 400
              :height 300
              :mark "bar"
              :encoding {:x {:field "X"} :y {:field "Y"} :xOffset {:field "G"}}}
             spec))))

  (testing "Grouped Horizontal Bar chart"
    (let [spec (presets/unit-spec {:type :bar :x "X" :y "Y" :group "G" :grouped? true :orientation :horizontal})]
      (is (m/validate vls/schema spec))
      (is (= {:data nil
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :width 400
              :height 300
              :mark "bar"
              :encoding {:x {:field "X"} :y {:field "Y"} :yOffset {:field "G"}}}
             spec))))

  (testing "Faceted Bar chart"
    (let [spec (presets/unit-spec {:type :bar :x "X" :y "Y" :row "R"})]
      (is (m/validate vls/schema spec))
      (is (= {:facet {:row {:field "R"}}
              :spec {:width 400
                     :height 300
                     :mark "bar"
                     :encoding {:x {:field "X"} :y {:field "Y"}}}
              :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                       :axis {:labelFontSize 12 :titleFontSize 14}
                       :header {:labelFontSize 12 :titleFontSize 14}
                       :legend {:labelFontSize 12 :titleFontSize 14}
                       :text {:fontSize 12}}
              :data nil}
             spec)))))
