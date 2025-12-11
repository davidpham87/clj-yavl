(ns simplify-schema-test
  (:require [clojure.test :refer [deftest is run-tests testing]]
            [malli.core :as m]
            [malli.generator :as mg]
            [clj-yavl.schema.vega-lite.unit :as v1-unit]
            [clj-yavl.schema2.vega-lite.unit :as v2-unit]
            [clj-yavl.schema.vega-lite.mark :as v1-mark]
            [clj-yavl.schema2.vega-lite.mark :as v2-mark]))

(deftest schema-equivalence-test
  (let [schema1 v1-unit/TopLevelUnitSpec
        schema2 v2-unit/TopLevelUnitSpec]

    (testing "Validation of V1 sample against V2 (MarkDef)"
      (let [mark-schema1 v1-mark/MarkDef
            mark-schema2 v2-mark/MarkDef]
        (dotimes [_ 10]
          (let [sample (mg/generate mark-schema1 {:size 3})]
             (is (m/validate mark-schema2 sample) "Sample from V1 MarkDef should be valid in V2")))))

    (testing "Validation of V2 sample against V1 (MarkDef)"
      (let [mark-schema1 v1-mark/MarkDef
            mark-schema2 v2-mark/MarkDef]
        (dotimes [_ 10]
          (let [sample (mg/generate mark-schema2 {:size 3})]
             (is (m/validate mark-schema1 sample) "Sample from V2 MarkDef should be valid in V1")))))

    (testing "Equivalence of TopLevelUnitSpec (validation only, no generation)"
      (let [simple-spec {:data {:values [{:a 1}]}
                         :mark "bar"
                         :encoding {:x {:field "a" :type "quantitative"}}}]
        (is (= (m/validate schema1 simple-spec)
               (m/validate schema2 simple-spec)) "Both schemas should validate a simple spec same way")))))

(defn -main []
  (run-tests 'simplify-schema-test))
