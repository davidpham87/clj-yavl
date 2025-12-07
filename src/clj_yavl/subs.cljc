(ns clj-yavl.subs
  (:require [clj-yavl.presets :as presets]
            [clojure.edn :as edn]
            [clj-yavl.io :as io]
            [clj-yavl.core :as-alias core]))

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
