(ns clj-yavl.subs
  (:require [clj-yavl.presets :as presets]
            [clojure.edn :as edn]
            [clj-yavl.io :as io]
            [re-frame.core :as rf]
            [clj-yavl.core :as-alias core]
            [clj-yavl.db :as db]))

(defn unit-spec-ids
  [db _]
  (keys (get-in db [:user-input :unit-specs])))

(defn unit-spec
  [db [_ id]]
  (get-in db [:user-input :unit-specs id]))

(defn all-unit-specs
  [db _]
  (get-in db [:user-input :unit-specs]))

(defn compiled-unit-spec-fn
  [spec _]
  (when spec
    (let [{:keys [type input]} spec]
      (try
        (presets/unit-spec (assoc input :type type))
        (catch #?(:clj Exception :cljs :default) e
          {:error (str "Error compiling spec: " e)})))))

(defn user-input-root
  [db _]
  (get-in db [:user-input :vega-lite :default]))

(defn config-input
  [root]
  (::core/config-input root))

(defn config-mode
  [root]
  (::core/config-mode root))

(defn parsed-config
  [[input mode] _]
  (try
    (if (= mode :json)
      (io/read-json-str input {:key-fn keyword})
      (edn/read-string input))
    (catch #?(:clj Exception :cljs :default) _ nil)))

(defn top-level-prop
  [config [_ prop-key]]
  (get config prop-key))

;; DataScript Subscriptions

(defn ds-db
  [db _]
  (get-in db [:user-input :vega-lite :default ::core/ds-db]))

(defn mark
  [ds-db _]
  (when ds-db
    (let [m (db/pull ds-db [:mark/type :mark/def] [:vl/id "default"])]
      ;; Wait, :vl/mark is a ref. We need to follow it.
      ;; Or pull from the root.
      (let [root (db/pull ds-db [{:vl/mark [:mark/type :mark/def]}] [:vl/id "default"])]
        (get-in root [:vl/mark :mark/type])))))

(defn encoding
  [ds-db _]
  (when ds-db
    (let [root (db/pull ds-db [{:vl/encoding [{:encoding/channels [:channel/name :channel/field :channel/type :channel/def]}]}] [:vl/id "default"])]
      (into {} (map (fn [c]
                      [(:channel/name c) (merge (:channel/def c)
                                                (select-keys c [:channel/field :channel/type]))])
                    (get-in root [:vl/encoding :encoding/channels]))))))

(defn tooltip
  [ds-db _]
  (when ds-db
    (:vl/tooltip (db/pull ds-db [:vl/tooltip] [:vl/id "default"]))))

(rf/reg-sub
 ::dataset-url-input
 (fn [db _]
   (get-in db [:user-input :dataset-url-input] "")))

(rf/reg-sub
 ::dataset-list
 (fn [db _]
   (get-in db [:user-input :dataset-list] [])))

(rf/reg-sub
 ::inferred-schema
 (fn [db _]
   (get-in db [::core/vega-lite ::core/inferred-schema])))
