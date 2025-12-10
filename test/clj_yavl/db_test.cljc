(ns clj-yavl.db-test
  (:require [clojure.test :refer [deftest is testing]]
            [clojure.walk :as walk]
            [clj-yavl.db :as db]
            [datascript.core :as d]
            [malli.core :as m]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure.test.check.clojure-test :refer [defspec]]
            [clj-yavl.schema.vega-lite :as vega-lite]))

;; Keys supported by the current clj-yavl.db implementation
;; We only test round-trip for these because the DB logic currently only persists them
(def supported-keys #{:mark :encoding :tooltip})

(defn filter-supported [config]
  (select-keys config supported-keys))

;; Define a restricted generator for Vega-Lite configs to avoid OOM
;; This generator creates valid but simple Unit Specs which are the most common case
(def valid-mark-gen
  (gen/elements ["bar" "point" "line" "area" "circle" "square" "tick" "rect" "rule" "text"]))

(def valid-type-gen
  (gen/elements ["quantitative" "ordinal" "nominal" "temporal"]))

(def field-name-gen
  (gen/not-empty gen/string-alphanumeric))

(def encoding-channel-gen
  (gen/hash-map
   :field field-name-gen
   :type valid-type-gen
   :axis (gen/one-of [(gen/return nil) (gen/hash-map :title field-name-gen)])
   :scale (gen/one-of [(gen/return nil) (gen/hash-map :zero gen/boolean)])))

(def encoding-gen
  (gen/map (gen/elements [:x :y :color :size :shape])
           encoding-channel-gen
           {:min-elements 1 :max-elements 3}))

(def simple-unit-spec-gen
  (gen/hash-map
   :$schema (gen/return "https://vega.github.io/schema/vega-lite/v5.json")
   :description (gen/one-of [(gen/return nil) gen/string-ascii])
   :mark valid-mark-gen
   :encoding encoding-gen
   :data (gen/return nil)))

(defspec round-trip-generative-test
  100 ;; Run 100 iterations
  (prop/for-all [config simple-unit-spec-gen]
    (let [conn (db/init-db)
          ;; Normalize keys to string for the DB input (as typically comes from JSON)
          config-strs (walk/stringify-keys config)
          tx-data (db/config->tx-data "test-id" config-strs)]

      (db/transact conn tx-data)

      (let [db @conn
            pulled (db/pull-config db "test-id")
            ;; Normalize pulled config:
            ;; 1. Remove nils (DB doesn't store them)
            ;; 2. Keywordize keys for validation if needed, but pull-config returns strings
            pulled-normalized (walk/keywordize-keys pulled)

            ;; Prepare original for comparison:
            ;; 1. Filter only supported keys (mark, encoding, tooltip)
            ;; 2. Remove nils
            ;; 3. Walk to ensure structure matches (though stringify-keys already did this)
            original-filtered (filter-supported config)
            original-normalized (walk/postwalk
                                 (fn [x] (if (map? x) (into {} (remove (comp nil? val) x)) x))
                                 original-filtered)]

        (= original-normalized pulled-normalized)))))

(deftest normalized-config-test
  (testing "Datascript round trip with normalized config"
    (let [conn (db/init-db)
          ;; A simple normalized config example
          config {"$schema" "https://vega.github.io/schema/vega-lite/v5.json"
                  "description" "A simple bar chart with embedded data."
                  "data" {"values" [{"a" "A" "b" 28} {"a" "B" "b" 55} {"a" "C" "b" 43}
                                    {"a" "D" "b" 91} {"a" "E" "b" 81} {"a" "F" "b" 53}
                                    {"a" "G" "b" 19} {"a" "H" "b" 87} {"a" "I" "b" 52}]}
                  "mark" "bar"
                  "encoding" {"x" {"field" "a" "type" "nominal" "axis" {"labelAngle" 0}}
                              "y" {"field" "b" "type" "quantitative"}}}
          tx-data [{:db/id -1
                    :config config}]]

      (db/transact conn tx-data)

      (let [db @conn
            eid (ffirst (db/q '[:find ?e :where [?e :config _]] db))
            pulled (db/pull db [:config] eid)]

        (is (= config (:config pulled)) "Pulled config should match normalized config")
        (is (m/validate vega-lite/schema (walk/keywordize-keys (:config pulled))) "Pulled config should be valid Vega-Lite")))))

(deftest minimal-config-test
  (testing "Datascript round trip with minimal config and unique ID"
    (let [schema {:chart/id {:db/unique :db.unique/identity}}
          conn (db/init-db schema)
          config {"$schema" "https://vega.github.io/schema/vega-lite/v5.json"
                  "data" nil
                  "mark" "point"
                  "encoding" {"x" {"field" "a" "type" "quantitative"}
                              "y" {"field" "b" "type" "quantitative"}}}
          tx-data [{:chart/id "my-chart"
                    :config config}]]

      (db/transact conn tx-data)

      (let [db @conn
            pulled (db/pull db [:config] [:chart/id "my-chart"])]

        (is (= config (:config pulled)) "Pulled config should match minimal config")
        (is (m/validate vega-lite/schema (walk/keywordize-keys (:config pulled))) "Pulled config should be valid Vega-Lite")))))
