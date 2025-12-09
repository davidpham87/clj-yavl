(ns clj-yavl.db-integration-test
  (:require [clojure.test :refer [deftest is testing]]
            [clj-yavl.db :as db]
            [clojure.java.io :as io]
            [clojure.data.json :as json]
            [clojure.walk :as walk]
            [clj-yavl.presets :as presets]))

(defn read-json-file [file]
  (try
    (json/read-str (slurp file) :key-fn keyword)
    (catch Exception e
      (println "Error reading" file ":" (.getMessage e))
      nil)))

(defn get-example-specs []
  (let [dir (io/file "test-resources/vega-lite/examples/specs")
        files (filter #(and (.isFile %) (.endsWith (.getName %) ".vl.json"))
                      (file-seq dir))]
    files))

;; Keys supported by the current clj-yavl.db implementation
(def supported-keys #{:mark :encoding :tooltip})

(defn filter-supported [config]
  (select-keys config supported-keys))

(defn normalize-keys [m]
  (walk/postwalk (fn [x] (if (map? x)
                           (update-keys x #(if (keyword? %) (name %) %))
                           x))
                 m))

(defn remove-nils [m]
  (walk/postwalk
   (fn [x]
     (if (map? x)
       (into {} (remove (comp nil? val)) x)
       x))
   m))

(deftest vega-lite-examples-round-trip-test
  (testing "Round trip for real Vega-Lite examples"
    (let [files (take 20 (get-example-specs)) ;; Test with first 20 examples to start
          conn (db/init-db)]
      (doseq [file files]
        (let [filename (.getName file)
              original-config (read-json-file file)]
          (when original-config
            (testing (str "File: " filename)
              (let [tx-data (db/config->tx-data filename original-config)]
                (db/transact conn tx-data)

                (let [db @conn
                      pulled-config (db/pull-config db filename)
                      ;; Normalize keys to strings for comparison since pull-config returns strings
                      ;; Also remove nils from original because DB drops them
                      original-subset (remove-nils (normalize-keys (filter-supported original-config)))
                      pulled-subset (normalize-keys pulled-config)]

                  ;; Only compare if there is something to compare
                  (when (seq original-subset)
                    (is (= original-subset pulled-subset)
                        (str "Mismatch in " filename))))))))))))

(deftest unit-spec-creation-test
  (testing "Create unit-specs and verify DB persistence"
    (let [conn (db/init-db)

          ;; Example 1: Bar Chart
          bar-chart-spec (presets/unit-spec
                          {:type :bar
                           :x {:field :category :type :nominal}
                           :y {:field :amount :type :quantitative}
                           :data {:values [{:category "A" :amount 28}
                                           {:category "B" :amount 55}]}})

          ;; Example 2: Point Chart (XY Plot)
          point-chart-spec (presets/unit-spec
                            {:type :xyplot
                             :mark :point
                             :x {:field :x :type :quantitative}
                             :y {:field :y :type :quantitative}
                             :data {:values [{:x 1 :y 1} {:x 2 :y 2}]}})

          specs {"bar-1" bar-chart-spec
                 "point-1" point-chart-spec}]

      (doseq [[id spec] specs]
        (let [tx-data (db/config->tx-data id spec)]
          (db/transact conn tx-data)

          (let [db @conn
                pulled-config (db/pull-config db id)
                original-subset (normalize-keys (filter-supported spec))
                pulled-subset (normalize-keys pulled-config)]

            (is (= original-subset pulled-subset)
                (str "Mismatch in generated spec " id))))))))

(deftest granular-update-test
  (testing "Granular updates to the config via transactions"
    (let [conn (db/init-db)
          id "granular-test"
          initial-config {:mark :bar
                          :encoding {:x {:field :a :type :nominal}
                                     :y {:field :b :type :quantitative}}}

          ;; 1. Transact initial config
          _ (db/transact conn (db/config->tx-data id initial-config))

          db-after-init @conn
          init-pulled (db/pull-config db-after-init id)]

      (is (= :bar (get init-pulled "mark")))

      ;; 2. Update mark to "point"
      ;; To do this via Datascript, we need to know the entity ID of the mark or the config.
      ;; db/config->tx-data handles full replacement logic (creating new entities),
      ;; but for granular update we might want to retract/add or update attributes.
      ;; However, the easiest way to "update" in this system seems to be re-transacting the modified config
      ;; or manually constructing tx-data if we know the schema.

      ;; Let's try updating by finding the mark entity and changing its type.
      (let [config-eid [:vl/id id]
            mark-eid (ffirst (db/q '[:find ?m :in $ ?id :where [?c :vl/id ?id] [?c :vl/mark ?m]]
                                   db-after-init id))]

        (is (some? mark-eid) "Mark entity should exist")

        ;; Transaction to update mark type
        (db/transact conn [{:db/id mark-eid
                            :mark/type "point"}])

        (let [updated-pulled (db/pull-config @conn id)]
          (is (= "point" (get updated-pulled "mark")) "Mark should be updated to point")
          (is (= (get init-pulled "encoding") (get updated-pulled "encoding")) "Encoding should remain unchanged")))

      ;; 3. Update encoding field
      (let [encoding-eid (ffirst (db/q '[:find ?e :in $ ?id :where [?c :vl/id ?id] [?c :vl/encoding ?e]]
                                       @conn id))
            x-channel-eid (ffirst (db/q '[:find ?c :in $ ?e :where [?e :encoding/channels ?c] [?c :channel/name "x"]]
                                        @conn encoding-eid))]

        (is (some? x-channel-eid) "X channel entity should exist")

        (db/transact conn [{:db/id x-channel-eid
                            :channel/field "new_field"}])

        (let [updated-pulled (db/pull-config @conn id)]
          (is (= "new_field" (get-in updated-pulled ["encoding" "x" "field"])) "X channel field should be updated"))))))
