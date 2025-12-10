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
      (is (= :layer (first (keys (dissoc res :config)))))
      (is (= 2 (count (:layer res))))
      (is (= (:config spec1) (:config res))) ; Assuming presets have same default config
      (is (nil? (-> res :layer first :config))))))

(deftest concat-preset-test
  (testing "hconcat operator with presets"
    (let [spec1 (presets/unit-spec {:type :xyplot :x "a" :y "b"})
          spec2 (presets/unit-spec {:type :bar :x "c" :y "d"})
          res (api/hconcat [spec1 spec2])]
      (is (m/validate vls/schema res))
      (is (= :hconcat (first (keys (dissoc res :config)))))
      (is (= 2 (count (:hconcat res))))
      (is (nil? (-> res :hconcat first :config)))))

  (testing "vconcat operator with presets"
    (let [spec1 (presets/unit-spec {:type :xyplot :x "a" :y "b"})
          spec2 (presets/unit-spec {:type :bar :x "c" :y "d"})
          res (api/vconcat [spec1 spec2])]
      (is (m/validate vls/schema res))
      (is (= :vconcat (first (keys (dissoc res :config)))))
      (is (= 2 (count (:vconcat res))))))

  (testing "concat (general) operator with presets"
    (let [spec1 (presets/unit-spec {:type :xyplot :x "a" :y "b"})
          spec2 (presets/unit-spec {:type :bar :x "c" :y "d"})
          res (api/concat-specs [spec1 spec2])]
      (is (m/validate vls/schema res))
      (is (= :concat (first (keys (dissoc res :config)))))
      (is (= 2 (count (:concat res)))))))

(deftest facet-preset-test
  (testing "facet operator with presets"
    (let [spec (presets/unit-spec {:type :xyplot :x "a" :y "b"})
          res (api/facet spec {:row "r" :column "c"})]
      (is (m/validate vls/schema res))
      (is (:facet res))
      (is (= {:row {:field "r"} :column {:field "c"}} (:facet res)))
      (is (= (dissoc spec :config) (:spec res)))
      (is (= (:config spec) (:config res))))))

(deftest repeat-preset-test
  (testing "repeat operator with presets"
    (let [spec (presets/unit-spec {:type :xyplot :x "a" :y {:repeat "row"}})
          res (api/repeat spec {:repeat {:row ["b" "c"]}})]
      (is (m/validate vls/schema res))
      (is (:repeat res))
      (is (= {:row ["b" "c"]} (:repeat res)))
      (is (= (dissoc spec :config) (:spec res)))
      (is (= (:config spec) (:config res))))))
