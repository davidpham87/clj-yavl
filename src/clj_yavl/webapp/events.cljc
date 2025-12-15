(ns clj-yavl.webapp.events
  (:require [clj-yavl.presets :as presets]
            [clojure.edn :as edn]
            [clj-yavl.io :as io]
            [clojure.pprint :refer [pprint]]
            [clojure.string :as str]
            [re-frame.core :as rf]
            [clj-yavl.webapp.core :as-alias core]
            [clj-yavl.db :as db]
            [bb-web-ds-tools.components.malli :as bb-malli]
            [malli.core :as m]
            #?(:cljs ["papaparse" :as Papa])))

(def default-config-json "{\n  \"$schema\": \"https://vega.github.io/schema/vega-lite/v5.json\",\n  \"mark\": \"bar\",\n  \"encoding\": {\n    \"x\": {\"field\": \"col1\", \"type\": \"ordinal\"},\n    \"y\": {\"field\": \"col2\", \"type\": \"quantitative\"}\n  }\n}")

(defn- init-default-state [ds-db]
  {:user-input {:vega-lite {:saved-configs {}
                            :default {::core/data-input ""
                                      ::core/config-input default-config-json
                                      ::core/config-mode :json
                                      ::core/active-config-name nil
                                      ::core/ds-db ds-db}}
                :ui-builder {:preset-key :xyplot :opts {}}
                :unit-specs {}
                :dataset-list []}
   ::core/vega-lite {::core/format :csv
                     ::core/structure :columnar
                     ::core/parsed-data nil
                     ::core/inferred-schema nil
                     ::core/active-left-tab :config}})

(defn initialize-db
  [db _]
  (let [ds-conn (db/init-db)
        default-config (io/read-json-str default-config-json {:key-fn keyword})
        _ (db/transact ds-conn (db/config->tx-data "default" default-config))
        ds-db @ds-conn]
    (if (empty? db)
      (init-default-state ds-db)
      (cond-> db
        (not (get-in db [:user-input :vega-lite]))
        (assoc-in [:user-input :vega-lite] (get-in (init-default-state ds-db) [:user-input :vega-lite]))
        (not (get-in db [:user-input :ui-builder]))
        (assoc-in [:user-input :ui-builder] {:preset-key :xyplot :opts {}})
        (not (::core/vega-lite db))
        (assoc ::core/vega-lite {::core/format :csv ::core/structure :columnar ::core/parsed-data nil ::core/inferred-schema nil ::core/active-left-tab :config})
        (not (get-in db [:user-input :unit-specs]))
        (assoc-in [:user-input :unit-specs] {})
        (not (get-in db [:user-input :dataset-list]))
        (assoc-in [:user-input :dataset-list] [])))))

(defn- sync-config!
  [db]
  (let [opts (get-in db [:user-input :ui-builder :opts])
        preset-key (get-in db [:user-input :ui-builder :preset-key])
        schema (get-in db [::core/vega-lite ::core/inferred-schema])
        spec (presets/unit-spec (assoc opts :type preset-key :data-schema schema))
        json-str (io/write-json-str spec {:indent 2})]
    (assoc-in db [:user-input :vega-lite :default ::core/config-input] json-str)))

(rf/reg-event-db
 ::set-ui-preset
 (fn [db [_ preset]]
   (-> db
       (assoc-in [:user-input :ui-builder :preset-key] preset)
       (sync-config!))))

(rf/reg-event-db
 ::update-ui-option
 (fn [db [_ arg prop value]]
   (-> db
       (assoc-in [:user-input :ui-builder :opts arg prop] value)
       (sync-config!))))

(defonce debug-atom (atom {}))

(defn entry-def->type [x]
  (let [entry-type (last x)
        field-type (m/type entry-type)]
    (-> (if (= field-type :maybe)
          (m/type (first (m/children entry-type)))
          field-type))))

(defn- get-vega-type [m-type]
  (case m-type
    :int "quantitative"
    :double "quantitative"
    :string "nominal"
    :boolean "nominal"
    :inst "temporal"
    :enum "nominal"
    "nominal"))

(defn- to-title-case [s]
  (when s
    (-> s
        (str/replace #"[_.\-]" " ")
        (str/replace #"([a-z])([A-Z])" "$1 $2")
        (str/split #"\s+")
        (->> (map str/capitalize)
             (str/join " ")))))

(rf/reg-event-db
 ::update-field-selection
 (fn [db [_ arg prop value]]
   (let [schema (get-in db [::core/vega-lite ::core/inferred-schema])
         m-type (when schema
                  (let [field-spec (first (filter #(= (name (first %)) value)
                                                  (m/children (m/schema schema))))]
                    (swap! debug-atom assoc :field-spec field-spec)
                    (entry-def->type field-spec)))
         vega-type (get-vega-type m-type)

         current-opts (get-in db [:user-input :ui-builder :opts])
         current-arg-opts (get current-opts arg)
         current-field (:field current-arg-opts)
         current-title (get-in current-arg-opts [:title])

         new-title-candidate (to-title-case value)
         old-default-title (when current-field (to-title-case current-field))

         should-update-title? (or (str/blank? current-title)
                                  (= current-title old-default-title))]

     (-> db
         (assoc-in [:user-input :ui-builder :opts arg prop] value)
         (assoc-in [:user-input :ui-builder :opts arg :type] vega-type)
         (cond-> should-update-title?
           (assoc-in [:user-input :ui-builder :opts arg :title] new-title-candidate))
         (sync-config!)))))

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

(defn- parse-input [val mode]
  (try
    (if (= mode :json)
      (io/read-json-str val {:key-fn keyword})
      (edn/read-string val))
    (catch #?(:clj Exception :cljs :default) _ nil)))

(defn- update-ds-with-config [db config]
   (update-in db [:user-input :vega-lite :default ::core/ds-db]
                 (fn [old-db]
                   (let [conn (db/init-db)]
                     (db/transact conn (db/config->tx-data "default" config))
                     @conn))))

(defn set-config-input
  [db [_ val]]
  (let [mode (get-in db [:user-input :vega-lite :default ::core/config-mode])
        parsed (parse-input val mode)]
    (cond-> (assoc-in db [:user-input :vega-lite :default ::core/config-input] val)
      parsed
      (update-ds-with-config parsed))))

(defn- convert-input [input current-mode new-mode]
  (cond
    (and (= current-mode :json) (= new-mode :edn))
    (try
      (with-out-str (pprint (io/read-json-str input {:key-fn keyword})))
      (catch #?(:clj Exception :cljs :default) _ input))

    (and (= current-mode :edn) (= new-mode :json))
    (try
      (io/write-json-str (edn/read-string input) {:indent 2})
      (catch #?(:clj Exception :cljs :default) _ input))

    :else input))

(defn set-config-mode
  [db [_ new-mode]]
  (let [user-input (get-in db [:user-input :vega-lite :default])
        current-mode (::core/config-mode user-input)
        current-input (::core/config-input user-input)
        new-input (convert-input current-input current-mode new-mode)]
    (-> db
        (assoc-in [:user-input :vega-lite :default ::core/config-mode] new-mode)
        (assoc-in [:user-input :vega-lite :default ::core/config-input] new-input))))

(defn set-top-level-prop
  [db [_ prop-key value]]
  (let [user-input (get-in db [:user-input :vega-lite :default])
        mode (::core/config-mode user-input)
        input (::core/config-input user-input)]
    (try
      (let [parsed (parse-input input mode)
            updated (assoc parsed prop-key value)
            new-input (if (= mode :json)
                        (io/write-json-str updated {:indent 2})
                        (with-out-str (pprint updated)))]
        (-> db
            (assoc-in [:user-input :vega-lite :default ::core/config-input] new-input)
            (update-ds-with-config updated)))
      (catch #?(:clj Exception :cljs :default) _ db))))

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
  (let [ds-db (get-in db [:user-input :vega-lite :default ::core/ds-db])
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

(rf/reg-event-db
 ::set-dataset-url-input
 (fn [db [_ val]]
   (assoc-in db [:user-input :dataset-url-input] val)))

(rf/reg-event-fx
 ::fetch-dataset
 (fn [{:keys [db]} [_ url]]
   {:promise/fetch {:url url
                    :on-success [::fetch-dataset-success]
                    :on-failure [::fetch-dataset-failure]}}))

(defn- process-fetched-data [parsed data mode]
   (let [updated (when parsed (assoc parsed :data {:values data}))
         inferred-schema (when (and (seq data) (map? (first data)))
                           (let [result (bb-malli/infer-schema data)]
                             (when (:success result)
                               (edn/read-string (:schema-str result)))))
         new-input (when updated
                     (if (= mode :json)
                       (io/write-json-str updated {:indent 2})
                       (with-out-str (pprint updated))))]
     {:new-input new-input :inferred-schema inferred-schema :updated updated}))

(rf/reg-event-db
 ::fetch-dataset-success
 (fn [db [_ data]]
   (let [user-input (get-in db [:user-input :vega-lite :default])
         mode (::core/config-mode user-input)
         input (::core/config-input user-input)
         parsed (parse-input input mode)
         {:keys [new-input inferred-schema updated]} (process-fetched-data parsed data mode)]
     (if new-input
       (-> db
           (assoc-in [:user-input :vega-lite :default ::core/config-input] new-input)
           (assoc-in [::core/vega-lite ::core/inferred-schema] inferred-schema)
           (update-ds-with-config updated))
       db))))

(rf/reg-event-db
 ::fetch-dataset-failure
 (fn [db [_ err]]
   #?(:cljs (js/console.error "Failed to fetch dataset:" err))
   db))

;; Custom Effect for Fetching
(rf/reg-fx
 :promise/fetch
 (fn [{:keys [url on-success on-failure]}]
   #?(:cljs
      (let [is-csv (or (str/ends-with? (str/lower-case url) ".csv")
                       (str/starts-with? url "csv:"))]
        (-> (js/fetch url)
            (.then (fn [resp]
                     (if (.-ok resp)
                       (if is-csv (.text resp) (.json resp))
                       (js/Promise.reject (str "Error: " (.-statusText resp))))))
            (.then (fn [result]
                     (if is-csv
                       (let [parsed (Papa/parse result #js {:header true :dynamicTyping true})]
                         (rf/dispatch (conj on-success (js->clj (.-data parsed) :keywordize-keys true))))
                       (rf/dispatch (conj on-success (js->clj result :keywordize-keys true))))))
            (.catch (fn [err]
                      (rf/dispatch (conj on-failure err)))))))))

(defn- create-channel-tx [ds-db channel field]
  (let [channel-eid (ffirst (db/q '[:find ?c
                                    :in $ ?channel-name
                                    :where [?root :vl/encoding ?enc] [?root :vl/id "default"]
                                           [?enc :encoding/channels ?c] [?c :channel/name ?channel-name]]
                                  ds-db (name channel)))]
    (if channel-eid
      [{:db/id channel-eid :channel/field field}]
      (let [enc-eid (ffirst (db/q '[:find ?e :where [?root :vl/encoding ?e] [?root :vl/id "default"]] ds-db))
            new-chan-id -1]
        (if enc-eid
          [{:db/id enc-eid :encoding/channels new-chan-id}
           {:db/id new-chan-id :channel/name (name channel) :channel/field field}]
          (let [new-enc-id -2]
            [{:db/id [:vl/id "default"] :vl/encoding new-enc-id}
             {:db/id new-enc-id :encoding/channels new-chan-id}
             {:db/id new-chan-id :channel/name (name channel) :channel/field field}]))))))

(defn update-channel-field
  [db [_ channel field]]
  (let [ds-db (get-in db [:user-input :vega-lite :default ::core/ds-db])
        tx-data (create-channel-tx ds-db channel field)
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

(rf/reg-event-fx
 ::fetch-dataset-list
 (fn [{:keys [db]} _]
   {:promise/fetch {:url "https://cdn.jsdelivr.net/npm/vega-datasets/datapackage.json"
                    :on-success [::fetch-dataset-list-success]
                    :on-failure [::fetch-dataset-list-failure]}}))

(rf/reg-event-db
 ::fetch-dataset-list-success
 (fn [db [_ datapackage]]
   (assoc-in db [:user-input :dataset-list] (:resources datapackage))))

(rf/reg-event-db
 ::fetch-dataset-list-failure
 (fn [db [_ err]]
   #?(:cljs (js/console.error "Failed to fetch dataset list:" err))
   db))
