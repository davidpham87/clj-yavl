(ns clj-yavl.api-composition-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.api :as api]
            [clj-yavl.presets :as presets]
            [clj-yavl.schema.vega-lite :as vls]
            [malli.core :as m]))

(deftest layer-preset-test
  (testing "layer operator with presets"
    (let [spec1 (presets/unit-spec {:type :xyplot :x "a" :y "b" :mark "point"})
          spec2 (presets/unit-spec {:type :xyplot :x "a" :y "c" :mark "line"})
          res (api/layer [spec1 spec2])]
      (is (m/validate vls/schema res))
      (is (= {:layer
              [{:data nil
                :mark "point"
                :encoding {:x {:field "a"} :y {:field "b"}}}
               {:data nil
                :mark "line"
                :encoding {:x {:field "a"} :y {:field "c"}}}]
              :config
              {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
               :axis {:labelFontSize 12 :titleFontSize 14}
               :header {:labelFontSize 12 :titleFontSize 14}
               :legend {:labelFontSize 12 :titleFontSize 14}
               :text {:fontSize 12}}}
             res)))))

(deftest concat-preset-test
  (testing "hconcat operator with presets"
    (let [spec1 (presets/unit-spec {:type :xyplot :x "a" :y "b"})
          spec2 (presets/unit-spec {:type :bar :x "c" :y "d"})
          res (api/hconcat [spec1 spec2])]
      (is (m/validate vls/schema res))
      (is (= {:hconcat
              [{:data nil
                :width 400
                :height 300
                :mark "point"
                :encoding {:x {:field "a"} :y {:field "b"}}}
               {:data nil
                :width 400
                :height 300
                :mark "bar"
                :encoding {:x {:field "c"} :y {:field "d"}}}]
              :config
              {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
               :axis {:labelFontSize 12 :titleFontSize 14}
               :header {:labelFontSize 12 :titleFontSize 14}
               :legend {:labelFontSize 12 :titleFontSize 14}
               :text {:fontSize 12}}}
             res))))

  (testing "vconcat operator with presets"
    (let [spec1 (presets/unit-spec {:type :xyplot :x "a" :y "b"})
          spec2 (presets/unit-spec {:type :bar :x "c" :y "d"})
          res (api/vconcat [spec1 spec2])]
      (is (m/validate vls/schema res))
      (is (= {:vconcat
              [{:data nil
                :width 400
                :height 300
                :mark "point"
                :encoding {:x {:field "a"} :y {:field "b"}}}
               {:data nil
                :width 400
                :height 300
                :mark "bar"
                :encoding {:x {:field "c"} :y {:field "d"}}}]
              :config
              {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
               :axis {:labelFontSize 12 :titleFontSize 14}
               :header {:labelFontSize 12 :titleFontSize 14}
               :legend {:labelFontSize 12 :titleFontSize 14}
               :text {:fontSize 12}}}
             res))))

  (testing "concat (general) operator with presets"
    (let [spec1 (presets/unit-spec {:type :xyplot :x "a" :y "b"})
          spec2 (presets/unit-spec {:type :bar :x "c" :y "d"})
          res (api/concat-specs [spec1 spec2])]
      (is (m/validate vls/schema res))
      (is (= {:concat
              [{:data nil
                :width 400
                :height 300
                :mark "point"
                :encoding {:x {:field "a"} :y {:field "b"}}}
               {:data nil
                :width 400
                :height 300
                :mark "bar"
                :encoding {:x {:field "c"} :y {:field "d"}}}]
              :config
              {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
               :axis {:labelFontSize 12 :titleFontSize 14}
               :header {:labelFontSize 12 :titleFontSize 14}
               :legend {:labelFontSize 12 :titleFontSize 14}
               :text {:fontSize 12}}}
             res)))))

(deftest facet-preset-test
  (testing "facet operator with presets"
    (let [spec (presets/unit-spec {:type :xyplot :x "a" :y "b"})
          res (api/facet spec {:row "r" :column "c"})]
      (is (m/validate vls/schema res))
      (is (= {:facet {:row {:field "r"} :column {:field "c"}}
              :spec
              {:width 400
               :height 300
               :mark "point"
               :encoding {:x {:field "a"} :y {:field "b"}}}
              :config
              {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
               :axis {:labelFontSize 12 :titleFontSize 14}
               :header {:labelFontSize 12 :titleFontSize 14}
               :legend {:labelFontSize 12 :titleFontSize 14}
               :text {:fontSize 12}}
              :data nil}
             res)))))

(deftest repeat-preset-test
  (testing "repeat operator with presets"
    (let [spec (presets/unit-spec {:type :xyplot :x "a" :y {:field {:repeat "row"}}})
          res (api/repeat spec {:repeat {:row ["b" "c"]}})]
      (is (m/validate vls/schema res))
      (is (= {:repeat {:row ["b" "c"]}
              :spec
              {:data nil
               :width 400
               :height 300
               :mark "point"
               :encoding {:x {:field "a"} :y {:field {:repeat "row"}}}}
              :config
              {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
               :axis {:labelFontSize 12 :titleFontSize 14}
               :header {:labelFontSize 12 :titleFontSize 14}
               :legend {:labelFontSize 12 :titleFontSize 14}
               :text {:fontSize 12}}}
             res)))))
