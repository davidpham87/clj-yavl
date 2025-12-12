(ns clj-yavl.api-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.api :as api]))

(deftest default-config-test
  (testing "Google corporate colors are set in default config"
    (is (= {:config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                     :axis {:labelFontSize 12 :titleFontSize 14}
                     :header {:labelFontSize 12 :titleFontSize 14}
                     :legend {:labelFontSize 12 :titleFontSize 14}
                     :text {:fontSize 12}}
            :width 400
            :height 300}
           api/default-config))))

(deftest base-plot-defaults-test
  (testing "base-plot applies defaults"
    (is (= {:data nil
            :mark "point"
            :config {:range {:category ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"]}
                     :axis {:labelFontSize 12 :titleFontSize 14}
                     :header {:labelFontSize 12 :titleFontSize 14}
                     :legend {:labelFontSize 12 :titleFontSize 14}
                     :text {:fontSize 12}}
            :width 400
            :height 300}
           (api/base-plot {} {:mark "point"} {})))))
