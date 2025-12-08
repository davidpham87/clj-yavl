(ns clj-yavl.events
  (:require [clj-yavl.presets :as presets]
            [clojure.edn :as edn]
            [clj-yavl.io :as io]
            [clojure.pprint :refer [pprint]]
            [clj-yavl.core :as-alias core]
            [clj-yavl.db :as db]))

(def default-config-json "{\n  \"$schema\": \"https://vega.github.io/schema/vega-lite/v5.json\",\n  \"mark\": \"bar\",\n  \"encoding\": {\n    \"x\": {\"field\": \"col1\", \"type\": \"ordinal\"},\n    \"y\": {\"field\": \"col2\", \"type\": \"quantitative\"}\n  }\n}")

(defn initialize-db
  [db _]
  (let [user-input-exists? (get-in db [:user-input :vega-lite])
        component-state-exists? (::core/vega-lite db)
        unit-specs-exists? (get-in db [:user-input :unit-specs])

        ;; Initialize DataScript
        ds-conn (db/init-db)
        ;; Load default config into DS
        default-config (io/read-json-str default-config-json {:key-fn keyword})
        _ (db/transact ds-conn (db/config->tx-data "default" default-config))
        ds-db @ds-conn]

    (cond-> db
      (not user-input-exists?)
      (assoc-in [:user-input :vega-lite]
                {:saved-configs {}
                 :default {::core/data-input ""
                           ::core/config-input default-config-json
                           ::core/config-mode :json
                           ::core/active-config-name nil
                           ::core/ds-db ds-db}}) ;; Store DB value

      (not component-state-exists?)
      (assoc ::core/vega-lite
             {::core/format :csv
              ::core/structure :columnar
              ::core/parsed-data nil
              ::core/inferred-schema nil
              ::core/active-left-tab :config})

      (not unit-specs-exists?)
      (assoc-in [:user-input :unit-specs] {}))))

(defn init-unit-spec
  [db [_ id type initial-input]]
  (assoc-in db [:user-input :unit-specs id]
            {:type type
             :input (or initial-input {})}))

(defn remove-unit-spec
  [db [_ id]]
  (update-in db [:user-input :unit-specs] dissoc id))

(defn update-unit-spec-input
  [db [_ id field value]]
  (assoc-in db [:user-input :unit-specs id :input field] value))

(defn set-unit-spec-input
  [db [_ id input]]
  (assoc-in db [:user-input :unit-specs id :input] input))

(defn set-config-input
  [db [_ val]]
  ;; When text changes, update DS
  ;; Note: This is a heavy operation for every keystroke.
  ;; Ideally we debounce or only do it on blur/valid JSON.
  ;; For now, we attempt to parse and if valid, update DS.
  (let [mode (get-in db [:user-input :vega-lite :default ::core/config-mode])
        parsed (try
                 (if (= mode :json)
                   (io/read-json-str val {:key-fn keyword})
                   (edn/read-string val))
                 (catch #?(:clj Exception :cljs :default) _ nil))]
    (cond-> (assoc-in db [:user-input :vega-lite :default ::core/config-input] val)
      parsed
      (update-in [:user-input :vega-lite :default ::core/ds-db]
                 (fn [old-db]
                   ;; We need to re-create or update.
                   ;; Since we don't have a smart diff yet, let's create a new DB for simplicity
                   ;; or retract everything for "default" and re-insert.
                   ;; Retracting recursively is hard without helper.
                   ;; Let's just create a new DB for now to ensure consistency.
                   (let [conn (db/init-db)]
                     (db/transact conn (db/config->tx-data "default" parsed))
                     @conn))))))

(defn set-config-mode
  [db [_ new-mode]]
  (let [user-input (get-in db [:user-input :vega-lite :default])
        current-mode (::core/config-mode user-input)
        current-input (::core/config-input user-input)
        new-input (cond
                    (and (= current-mode :json) (= new-mode :edn))
                    (try
                      (let [obj (io/read-json-str current-input {:key-fn keyword})
                            edn-data obj]
                        (with-out-str (pprint edn-data)))
                      (catch #?(:clj Exception :cljs :default) _ current-input))

                    (and (= current-mode :edn) (= new-mode :json))
                    (try
                      (let [edn-data (edn/read-string current-input)]
                        (io/write-json-str edn-data {:indent 2}))
                      (catch #?(:clj Exception :cljs :default) _ current-input))

                    :else current-input)]
    (-> db
        (assoc-in [:user-input :vega-lite :default ::core/config-mode] new-mode)
        (assoc-in [:user-input :vega-lite :default ::core/config-input] new-input))))

(defn set-top-level-prop
  [db [_ prop-key value]]
  ;; When setting a prop via UI (old way), we should probably use the new DS way.
  ;; But to maintain backward compatibility or migrate, let's keep this but also update DS.
  (let [user-input (get-in db [:user-input :vega-lite :default])
        mode (::core/config-mode user-input)
        input (::core/config-input user-input)]
    (try
      (let [parsed (if (= mode :json)
                     (io/read-json-str input {:key-fn keyword})
                     (edn/read-string input))
            updated (assoc parsed prop-key value)
            new-input (if (= mode :json)
                        (io/write-json-str updated {:indent 2})
                        (with-out-str (pprint updated)))]
        (-> db
            (assoc-in [:user-input :vega-lite :default ::core/config-input] new-input)
            (update-in [:user-input :vega-lite :default ::core/ds-db]
                       (fn [_]
                         (let [conn (db/init-db)]
                           (db/transact conn (db/config->tx-data "default" updated))
                           @conn)))))
      (catch #?(:clj Exception :cljs :default) _ db))))

;; New Events for Granular Editing via DataScript

(defn- sync-config-from-db
  "Helper to update text config from DS."
  [db]
  (let [ds-db (get-in db [:user-input :vega-lite :default ::core/ds-db])
        config (db/pull-config ds-db "default")
        mode (get-in db [:user-input :vega-lite :default ::core/config-mode])
        new-input (if (= mode :json)
                    (io/write-json-str config {:indent 2})
                    (with-out-str (pprint config)))]
    (assoc-in db [:user-input :vega-lite :default ::core/config-input] new-input)))

(defn update-mark
  [db [_ mark-type]]
  ;; We need to transact into the DS DB stored in app-db.
  ;; Since app-db stores the value, we need to 'edit' it.
  ;; d/with works on db values.
  (let [ds-db (get-in db [:user-input :vega-lite :default ::core/ds-db])
        ;; We need to know the entity ID for the mark or create it.
        ;; Since we don't have easy entity lookup here without query, let's use a standard query or assumption.
        ;; Or better, re-transact the mark part using the same "default" id logic.
        ;; But config->tx-data regenerates everything.

        ;; Let's try to query for the mark entity.
        mark-eid (ffirst (db/q '[:find ?e :where [?root :vl/mark ?e] [?root :vl/id "default"]] ds-db))

        tx-data (if mark-eid
                  [{:db/id mark-eid :mark/type mark-type}]
                  (let [new-mark-id -1]
                    [{:db/id [:vl/id "default"] :vl/mark new-mark-id}
                     {:db/id new-mark-id :mark/type mark-type}]))

        new-ds-db (db/with ds-db tx-data)]

    (-> db
        (assoc-in [:user-input :vega-lite :default ::core/ds-db] new-ds-db)
        (sync-config-from-db))))

(defn update-channel-field
  [db [_ channel field]]
  (let [ds-db (get-in db [:user-input :vega-lite :default ::core/ds-db])
        ;; Find channel entity
        channel-eid (ffirst (db/q '[:find ?c
                                    :in $ ?channel-name
                                    :where
                                    [?root :vl/encoding ?enc]
                                    [?root :vl/id "default"]
                                    [?enc :encoding/channels ?c]
                                    [?c :channel/name ?channel-name]]
                                  ds-db (name channel)))

        tx-data (if channel-eid
                  [{:db/id channel-eid :channel/field field}]
                  ;; If channel doesn't exist, we must create it and link to encoding
                  (let [enc-eid (ffirst (db/q '[:find ?e :where [?root :vl/encoding ?e] [?root :vl/id "default"]] ds-db))
                        new-chan-id -1]
                     (if enc-eid
                       [{:db/id enc-eid :encoding/channels new-chan-id}
                        {:db/id new-chan-id :channel/name (name channel) :channel/field field}]
                       ;; If encoding doesn't exist either
                       (let [new-enc-id -2]
                         [{:db/id [:vl/id "default"] :vl/encoding new-enc-id}
                          {:db/id new-enc-id :encoding/channels new-chan-id}
                          {:db/id new-chan-id :channel/name (name channel) :channel/field field}]))))

        new-ds-db (db/with ds-db tx-data)]
    (-> db
        (assoc-in [:user-input :vega-lite :default ::core/ds-db] new-ds-db)
        (sync-config-from-db))))

(defn update-tooltip
  [db [_ tooltip-def]]
  (let [ds-db (get-in db [:user-input :vega-lite :default ::core/ds-db])
        tx-data [{:db/id [:vl/id "default"] :vl/tooltip tooltip-def}]
        new-ds-db (db/with ds-db tx-data)]
    (-> db
        (assoc-in [:user-input :vega-lite :default ::core/ds-db] new-ds-db)
        (sync-config-from-db))))
