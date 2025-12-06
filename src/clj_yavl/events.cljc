(ns clj-yavl.events
  (:require [clj-yavl.presets :as presets]
            [clojure.edn :as edn]
            [babashka.json :as json]
            [clojure.pprint :refer [pprint]]))

(def default-config-json "{\n  \"$schema\": \"https://vega.github.io/schema/vega-lite/v5.json\",\n  \"mark\": \"bar\",\n  \"encoding\": {\n    \"x\": {\"field\": \"col1\", \"type\": \"ordinal\"},\n    \"y\": {\"field\": \"col2\", \"type\": \"quantitative\"}\n  }\n}")

(defn initialize-db
  [db _]
  (let [user-input-exists? (get-in db [:user-input :vega-lite])
        component-state-exists? (:clj-yavl.core/vega-lite db) ;; Using keyword directly as we might not have the alias here
        unit-specs-exists? (get-in db [:user-input :unit-specs])]
    (cond-> db
      (not user-input-exists?)
      (assoc-in [:user-input :vega-lite]
                {:saved-configs {}
                 :default {:clj-yavl.core/data-input ""
                           :clj-yavl.core/config-input default-config-json
                           :clj-yavl.core/config-mode :json
                           :clj-yavl.core/active-config-name nil}})

      (not component-state-exists?)
      (assoc :clj-yavl.core/vega-lite
             {:clj-yavl.core/format :csv
              :clj-yavl.core/structure :columnar
              :clj-yavl.core/parsed-data nil
              :clj-yavl.core/inferred-schema nil
              :clj-yavl.core/active-left-tab :config})

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
  (assoc-in db [:user-input :vega-lite :default :clj-yavl.core/config-input] val))

(defn set-config-mode
  [db [_ new-mode]]
  (let [user-input (get-in db [:user-input :vega-lite :default])
        current-mode (:clj-yavl.core/config-mode user-input)
        current-input (:clj-yavl.core/config-input user-input)
        new-input (cond
                    (and (= current-mode :json) (= new-mode :edn))
                    (try
                      (let [obj (json/read-str current-input {:key-fn keyword})
                            edn-data obj]
                        (with-out-str (pprint edn-data)))
                      (catch #?(:clj Exception :cljs :default) _ current-input))

                    (and (= current-mode :edn) (= new-mode :json))
                    (try
                      (let [edn-data (edn/read-string current-input)]
                        (json/write-str edn-data {:indent 2}))
                      (catch #?(:clj Exception :cljs :default) _ current-input))

                    :else current-input)]
    (-> db
        (assoc-in [:user-input :vega-lite :default :clj-yavl.core/config-mode] new-mode)
        (assoc-in [:user-input :vega-lite :default :clj-yavl.core/config-input] new-input))))

(defn set-top-level-prop
  [db [_ prop-key value]]
  (let [user-input (get-in db [:user-input :vega-lite :default])
        mode (:clj-yavl.core/config-mode user-input)
        input (:clj-yavl.core/config-input user-input)]
    (try
      (let [parsed (if (= mode :json)
                     (json/read-str input {:key-fn keyword})
                     (edn/read-string input))
            updated (assoc parsed prop-key value)
            new-input (if (= mode :json)
                        (json/write-str updated {:indent 2})
                        (with-out-str (pprint updated)))]
        (assoc-in db [:user-input :vega-lite :default :clj-yavl.core/config-input] new-input))
      (catch #?(:clj Exception :cljs :default) _ db))))
