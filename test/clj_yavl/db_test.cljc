(ns clj-yavl.db-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.db :as db]
            [datascript.core :as d]
            [malli.core :as m]
            [malli.generator :as mg]
            [clj-yavl.schema.vega-lite :as vega-lite]))

(comment
  (deftest round-trip-test
    (testing "Datascript round trip with Malli generated config"
      (let [conn (db/init-db)
            ;; Generate a random Vega-Lite config using Malli schema
            ;; Using a smaller size to avoid massive configs and slow generation
            config (mg/generate vega-lite/schema {:size 10})
            ;; Use a temp id for the new entity
            tx-data [{:db/id -1
                      :config config}]]

        (db/transact conn tx-data)

        (let [db @conn
              ;; Query to find the entity ID
              eid (ffirst (db/q '[:find ?e :where [?e :config _]] db))
              ;; Pull the entity
              pulled (db/pull db [:config] eid)]

          (is (= config (:config pulled)) "Pulled config should match generated config"))))))

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

        (is (= config (:config pulled)) "Pulled config should match normalized config")))))

(deftest minimal-config-test
  (testing "Datascript round trip with minimal config and unique ID"
    (let [schema {:chart/id {:db/unique :db.unique/identity}}
          conn (db/init-db schema)
          config {"$schema" "https://vega.github.io/schema/vega-lite/v5.json"
                  "mark" "point"
                  "encoding" {"x" {"field" "a" "type" "quantitative"}
                              "y" {"field" "b" "type" "quantitative"}}}
          tx-data [{:chart/id "my-chart"
                    :config config}]]

      (db/transact conn tx-data)

      (let [db @conn
            pulled (db/pull db [:config] [:chart/id "my-chart"])]

        (is (= config (:config pulled)) "Pulled config should match minimal config")))))
