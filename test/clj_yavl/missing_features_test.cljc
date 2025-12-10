(ns clj-yavl.missing-features-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.api :as api]
            [malli.core :as m]
            [clj-yavl.schema.vega-lite :as vls]))

(deftest test-resolve-in-layer
  (testing "Layer with resolve"
    (let [layer-spec (api/layer [{:mark "bar"} {:mark "line"}]
                                :resolve {:scale {:y "independent"}})]
      (is (= {:layer [{:mark "bar"} {:mark "line"}]
              :resolve {:scale {:y "independent"}}}
             layer-spec))
      ;; Validate against schema
      (is (m/validate vls/schema layer-spec) (pr-str (m/explain vls/schema layer-spec))))))

(deftest test-resolve-in-hconcat
  (testing "HConcat with resolve"
    (let [spec (api/hconcat [{:mark "bar"} {:mark "line"}]
                            :resolve {:scale {:y "shared"}})]
      (is (= {:hconcat [{:mark "bar"} {:mark "line"}]
              :resolve {:scale {:y "shared"}}}
             spec))
      (is (m/validate vls/schema spec) (pr-str (m/explain vls/schema spec))))))

(deftest test-resolve-in-vconcat
  (testing "VConcat with resolve"
    (let [spec (api/vconcat [{:mark "bar"} {:mark "line"}]
                            :resolve {:legend {:color "independent"}})]
      (is (= {:vconcat [{:mark "bar"} {:mark "line"}]
              :resolve {:legend {:color "independent"}}}
             spec))
      (is (m/validate vls/schema spec) (pr-str (m/explain vls/schema spec))))))

(deftest test-resolve-in-facet
  (testing "Facet with resolve"
    (let [base-spec {:mark "point" :encoding {:x {:field "a"} :y {:field "b"}} :data nil}
          spec (api/wrap-with-facet base-spec
                                    {:column "c"
                                     :resolve {:scale {:x "independent"}}})]
      (is (= {:facet {:column {:field "c"}}
              :spec {:mark "point" :encoding {:x {:field "a"} :y {:field "b"}}}
              :resolve {:scale {:x "independent"}}
              :data nil}
             spec))
      (is (m/validate vls/schema spec) (pr-str (m/explain vls/schema spec))))))

(deftest test-resolve-in-repeat
  (testing "Repeat with resolve"
    (let [base-spec {:mark "point" :encoding {:x {:field "a"} :y {:field "b"}} :data nil}
          spec (api/wrap-with-repeat base-spec
                                     {:repeat ["a" "b"]
                                      :resolve {:scale {:y "shared"}}})]
      (is (= {:repeat ["a" "b"]
              :spec {:mark "point" :encoding {:x {:field "a"} :y {:field "b"}} :data nil}
              :resolve {:scale {:y "shared"}}}
             spec))
      (is (m/validate vls/schema spec) (pr-str (m/explain vls/schema spec))))))

(deftest test-add-params
  (testing "Add params to spec"
    (let [base-spec {:mark "point" :encoding {:x {:field "a"} :y {:field "b"}} :data nil}
          params [{:name "brush" :select "interval"}]
          spec (api/add-params base-spec params)]
      (is (= {:mark "point"
              :encoding {:x {:field "a"} :y {:field "b"}}
              :data nil
              :params [{:name "brush" :select "interval"}]}
             spec))
      (is (m/validate vls/schema spec) (pr-str (m/explain vls/schema spec))))))
