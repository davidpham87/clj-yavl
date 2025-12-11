(ns clj-yavl.ui-schema-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.ui-schema :as sut]))

(deftest generate-ui-schema-test
  (testing "extracts fields from malli schema"
    (let [schema [:map [:a :int] [:b :string]]
          res (sut/generate-ui-schema :xyplot schema)
          x-arg (first (filter #(= :x (:arg %)) res))
          options (get-in x-arg [:main :field :options])]
      (println "Options:" options)
      (is (= #{"a" "b"} (set options)))))

  (testing "extracts fields from transforms"
    (let [schema [:map [:a :int]]
          opts {:transform [{:calculate "datum.a * 2" :as "c"}]}
          res (sut/generate-ui-schema :xyplot schema opts)
          x-arg (first (filter #(= :x (:arg %)) res))
          options (get-in x-arg [:main :field :options])]
      (println "Options transform:" options)
      (is (= #{"a" "c"} (set options)))))

  (testing "includes common args"
    (let [res (sut/generate-ui-schema :xyplot [:map])]
      (is (some #(= :facet (:arg %)) res))
      (is (some #(= :repeat (:arg %)) res)))))
