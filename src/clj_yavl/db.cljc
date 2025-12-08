(ns clj-yavl.db
  (:require [datascript.core :as d]))

(defn init-db
  ([] (init-db {}))
  ([schema] (d/create-conn schema)))

(defn transact [conn tx-data]
  (d/transact! conn tx-data))

(defn pull [db selector eid]
  (d/pull db selector eid))

(defn q [query db & args]
  (apply d/q query db args))
