(ns clj-yavl.db-full-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.db :as db]
            [clj-yavl.api :as api]
            [clojure.walk :as walk]))

(deftest round-trip-complex-spec-test
  (let [;; Create a complex spec using API
        layer1 (api/base-plot
                {:x "date" :y "price" :color "symbol"}
                {:mark "line"}
                {:data-schema [:map [:date :string] [:price :int] [:symbol :string]]})
        layer2 (api/base-plot
                {:x "date" :y "price"}
                {:mark {:type "point" :filled true}}
                {:data-schema [:map [:date :string] [:price :int]]})

        layered-spec (api/layer [layer1 layer2])

        ;; Wrap in facet
        faceted-spec (api/facet layered-spec {:row "symbol"})

        ;; Add top-level props and resolve
        final-spec (assoc faceted-spec
                          :title {:text "Stock Prices" :subtitle "2023"}
                          :background "white"
                          :resolve {:scale {:y "independent"}}
                          :width 500
                          :height 300)

        ;; Normalize keys to string for comparison (API produces keywords, DB pulls keywordized internal structure but we want to check semantic equivalence)
        ;; Actually API produces mixed keys (base-plot uses keywords).
        ;; Let's keywordize everything for comparison.
        expected-spec (walk/keywordize-keys final-spec)

        conn (db/init-db)
        id "chart-1"]

    (testing "Transact complex spec"
      (let [tx-data (db/config->tx-data id final-spec)]
        (db/transact conn tx-data)
        (is (not (empty? tx-data)))))

    (testing "Pull complex spec"
      (let [pulled-spec (db/pull-config @conn id)
            ;; We need to massage pulled spec slightly because DB roundtrip might change some details
            ;; e.g. "mark": "line" might become "mark": {:type "line"} depending on normalization.
            ;; Also keys are strings in pulled spec usually (reconstructed).
            normalized-pulled (walk/keywordize-keys pulled-spec)]

        ;; Check specific parts
        (is (= (:background expected-spec) (:background normalized-pulled)))
        (is (= (:width expected-spec) (:width normalized-pulled)))
        (is (= (:height expected-spec) (:height normalized-pulled)))

        ;; Check Title
        (is (= "Stock Prices" (get-in normalized-pulled [:title :text])))

        ;; Check Resolve
        (is (= {:scale {:y "independent"}} (:resolve normalized-pulled)))

        ;; Check Facet
        (is (= {:row {:field "symbol"}} (:facet normalized-pulled)))

        ;; Check Spec (nested)
        (let [inner-spec (:spec normalized-pulled)]
          (is (some? inner-spec))
          (is (vector? (:layer inner-spec)))
          (is (= 2 (count (:layer inner-spec))))

          ;; Check Layer 1
          (let [l1 (first (:layer inner-spec))]
            (is (= "line" (or (:type (:mark l1)) (:mark l1))))
            (is (= "date" (get-in l1 [:encoding :x :field])))
            (is (= "symbol" (get-in l1 [:encoding :color :field]))))

          ;; Check Layer 2
          (let [l2 (second (:layer inner-spec))]
            (is (= "point" (:type (:mark l2))))
            (is (= true (:filled (:mark l2))))))))))

(deftest round-trip-repeat-spec-test
  (let [base (api/base-plot
              {:x {:field {:repeat "repeat"} :type "quantitative"}
               :y "price"}
              {:mark "bar"}
              {})
        repeat-spec (api/repeat base {:repeat ["a" "b"]})
        conn (db/init-db)
        id "chart-repeat"]

    (db/transact conn (db/config->tx-data id repeat-spec))

    (let [pulled (walk/keywordize-keys (db/pull-config @conn id))]
      (is (= ["a" "b"] (:repeat pulled)))
      (is (= "bar" (or (:type (:mark (:spec pulled))) (:mark (:spec pulled))))))))

(deftest round-trip-hconcat-spec-test
  (let [s1 (api/base-plot {:x "a"} {:mark "point"} {})
        s2 (api/base-plot {:x "b"} {:mark "bar"} {})
        concat-spec (api/hconcat [s1 s2])
        conn (db/init-db)
        id "chart-hconcat"]

    (db/transact conn (db/config->tx-data id concat-spec))

    (let [pulled (walk/keywordize-keys (db/pull-config @conn id))]
      (is (vector? (:hconcat pulled)))
      (is (= 2 (count (:hconcat pulled))))
      (is (= "point" (or (:type (:mark (first (:hconcat pulled)))) (:mark (first (:hconcat pulled))))))
      (is (= "bar" (or (:type (:mark (second (:hconcat pulled)))) (:mark (second (:hconcat pulled)))))))))
