(ns clj-yavl.infer
  (:require [malli.core :as m]
            [clojure.string :as str]))

(defn- infer-type [value]
  (cond
    (integer? value) :int
    (number? value) :double
    (boolean? value) :boolean
    (string? value) :string
    (inst? value) :inst
    :else :any))

(defn infer-schema
  "Infers a Malli schema from a list of data maps.
   Uses the first 10 items to determine keys and types, prioritizing more specific types."
  [data]
  (if (seq data)
    (let [sample (take 10 data)
          keys-set (into #{} (mapcat keys sample))
          props (for [k keys-set]
                  (let [values (keep #(get % k) sample)
                        types (into #{} (map infer-type values))
                        final-type (cond
                                     (contains? types :string) :string ;; If any string, treat as string (e.g. mixed types)
                                     (contains? types :any) :any
                                     (contains? types :double) :double
                                     (contains? types :int) :int
                                     (contains? types :inst) :inst
                                     (contains? types :boolean) :boolean
                                     :else :any)]
                    [k final-type]))]
      (into [:map] props))
    [:map]))
