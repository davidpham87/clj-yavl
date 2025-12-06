(ns clj-yavl.api-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.api :as api]))

(deftest tooltip-def-test
  (let [dataset-schema [:vector
                        [:map
                         [:name string?]
                         [:age int?]
                         [:salary double?]
                         [:date inst?]
                         [:is-active boolean?]]]]
    (testing "Generates correct tooltip definitions"
      (let [keys ["name" "age" "salary" "date"]
            result (api/tooltip-def keys dataset-schema)]
        (is (= 4 (count result)))
        (is (= {:field "name" :type "nominal"} (nth result 0)))
        (is (= {:field "age" :type "quantitative" :format "s"} (nth result 1)))
        (is (= {:field "salary" :type "quantitative" :format "s"} (nth result 2)))
        (is (= {:field "date" :type "temporal"} (nth result 3)))))

    (testing "Handles missing fields gracefully"
      (let [keys ["non-existent"]
            result (api/tooltip-def keys dataset-schema)]
        (is (= [{:field "non-existent" :type nil}] result))))))
