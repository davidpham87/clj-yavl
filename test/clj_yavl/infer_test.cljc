(ns clj-yavl.infer-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.infer :as infer]
            [malli.core :as m]))

(deftest infer-schema-test
  (testing "Infer schema from simple data"
    (let [data [{:a 1 :b "s" :c true}]]
      (is (= [:map [:a :int] [:b :string] [:c :boolean]]
             (vec (cons :map (sort-by first (rest (infer/infer-schema data)))))))))

  (testing "Infer schema from empty data"
    (is (= [:map] (infer/infer-schema []))))

  (testing "Infer schema mixed numbers"
    (let [data [{:a 1.5 :b 2}]]
      (is (= [:map [:a :double] [:b :int]]
             (vec (cons :map (sort-by first (rest (infer/infer-schema data)))))))))

  (testing "Infer schema with different types in rows (uses first 10 rows)"
    (let [data [{:a 1} {:a "s"}]]
      (is (= [:map [:a :string]] (infer/infer-schema data)))))

  (testing "Infer schema with mixed ints and doubles"
    (let [data [{:a 1} {:a 1.5}]]
      (is (= [:map [:a :double]] (infer/infer-schema data))))))
