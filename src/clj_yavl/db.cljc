(ns clj-yavl.db
  (:require [datascript.core :as d]))

(def vega-lite-schema
  {:vl/id       {:db/unique :db.unique/identity}
   :vl/mark     {:db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   :vl/encoding {:db/valueType :db.type/ref :db/cardinality :db.cardinality/one}
   :vl/tooltip  {:db/cardinality :db.cardinality/one}

   :mark/type   {:db/cardinality :db.cardinality/one}
   :mark/def    {:db/cardinality :db.cardinality/one} ;; Store extra mark props as map

   :encoding/channels {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}

   :channel/name  {:db/cardinality :db.cardinality/one}
   :channel/field {:db/cardinality :db.cardinality/one}
   :channel/type  {:db/cardinality :db.cardinality/one}
   :channel/def   {:db/cardinality :db.cardinality/one} ;; Store other props as map
   })

(defn init-db
  ([] (init-db vega-lite-schema))
  ([schema] (d/create-conn schema)))

(defn transact [conn tx-data]
  (d/transact! conn tx-data))

(defn pull [db selector eid]
  (d/pull db selector eid))

(defn q [query db & args]
  (apply d/q query db args))

(defn config->tx-data
  "Converts a Vega-Lite config map to transaction data.
   'id' identifies the top-level config entity."
  [id config]
  (let [mark (get config "mark" (get config :mark))
        encoding (get config "encoding" (get config :encoding))
        tooltip (get config "tooltip" (get config :tooltip))

        mark-eid -2
        encoding-eid -3

        tx (cond-> [{:vl/id id
                     :vl/tooltip tooltip}]
             ;; Mark
             mark
             (conj {:db/id mark-eid
                    :mark/type (if (map? mark) (get mark "type" (get mark :type)) mark)
                    :mark/def (when (map? mark) mark)})
             mark
             (conj {:db/id [:vl/id id] :vl/mark mark-eid})

             ;; Encoding
             encoding
             (into (let [channels (vec (map-indexed
                                         (fn [i [k v]]
                                           {:db/id (- -10 i)
                                            :channel/name (name k)
                                            :channel/field (get v "field" (get v :field))
                                            :channel/type (get v "type" (get v :type))
                                            :channel/def v})
                                         encoding))]
                     (conj channels
                           {:db/id encoding-eid
                            :encoding/channels (map :db/id channels)}
                           {:db/id [:vl/id id] :vl/encoding encoding-eid}))))]
    tx))

(defn pull-config
  "Reconstructs the Vega-Lite config map from the DB."
  [db id]
  (let [entity (d/pull db
                       [:vl/tooltip
                        {:vl/mark [:mark/type :mark/def]}
                        {:vl/encoding [{:encoding/channels [:channel/name :channel/field :channel/type :channel/def]}]}]
                       [:vl/id id])]
    (when entity
      (cond-> {}
        (:vl/mark entity)
        (assoc "mark" (let [{:keys [mark/type mark/def]} (:vl/mark entity)]
                        (if def
                          (assoc def "type" type)
                          type)))

        (:vl/encoding entity)
        (assoc "encoding" (into {} (map (fn [{:keys [channel/name channel/def channel/field channel/type]}]
                                          [name (cond-> (or def {})
                                                  field (assoc "field" field)
                                                  type (assoc "type" type))])
                                        (get-in entity [:vl/encoding :encoding/channels]))))

        (:vl/tooltip entity)
        (assoc "tooltip" (:vl/tooltip entity))))))
