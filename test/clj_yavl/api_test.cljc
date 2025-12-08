(ns clj-yavl.api-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.api :as api]))

(deftest default-config-test
  (testing "Google corporate colors are set in default config"
    (let [expected-colors ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]]
      (is (= expected-colors (get-in api/default-config [:config :range :category])))))

  (testing "Font sizes are set in default config"
    (is (= 12 (get-in api/default-config [:config :axis :labelFontSize])))
    (is (= 14 (get-in api/default-config [:config :axis :titleFontSize])))
    (is (= 12 (get-in api/default-config [:config :legend :labelFontSize])))
    (is (= 12 (get-in api/default-config [:config :text :fontSize])))))

(deftest base-plot-defaults-test
  (testing "base-plot applies defaults"
    (let [spec (api/base-plot {} {:mark "point"} {})]
      (is (= ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]
             (get-in spec [:config :range :category])))
      (is (= 12 (get-in spec [:config :axis :labelFontSize]))))))
