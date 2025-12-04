(ns clj-yavl.api
  (:require [malli.core :as m]))

(defn- infer-vl-type
  "Infers the Vega-Lite type from a Malli schema node."
  [schema-node]
  (let [t (m/type schema-node)]
    (cond
      (#{'int? 'integer? 'number? 'double? 'float? :int :double :number :float} t) "quantitative"
      (#{'string? :string} t) "nominal"
      (#{'boolean? :boolean} t) "nominal"
      (#{'inst? 'time? :inst :time} t) "temporal"
      (= :enum t) "nominal"
      :else nil)))

(defn- get-field-schema
  "Finds the schema for a specific field within a dataset schema.
   Handles schema being a Map or a Collection of Map."
  [dataset-schema field-name]
  (let [schema (m/schema dataset-schema)
        t (m/type schema)
        ;; Unwrap collection type if present to get to the item schema
        map-schema (if (#{:vector :sequential :set :list} t)
                     (first (m/children schema))
                     schema)]
    (when (= (m/type map-schema) :map)
      (some (fn [[k _ v]]
              (when (= (name k) field-name)
                v))
            (m/children map-schema)))))

(defn- infer-type-for-field
  [dataset-schema field-name]
  (when-let [field-schema (get-field-schema dataset-schema field-name)]
    (infer-vl-type field-schema)))

(defn base-plot
  "Generates a Vega-Lite spec.

   Args:
   - encodings: map of channel (keyword) to encoding definition (map) or field name (string).
   - common-specs: TopLevelSpec (map) defining global values (mark, data, etc.).
   - charts-opts: map with optional keys:
     - :data-schema -> Malli schema of the dataset."
  [encodings common-specs charts-opts]
  (let [data-schema (:data-schema charts-opts)
        processed-encodings
        (reduce-kv
         (fn [acc channel value]
           (let [encoding-def (if (string? value)
                                {:field value}
                                value)
                 field (:field encoding-def)
                 ;; Infer type if field is present and type is missing
                 inferred-type (when (and data-schema field (not (:type encoding-def)))
                                 (infer-type-for-field data-schema field))
                 final-def (cond-> encoding-def
                             inferred-type (assoc :type inferred-type))]
             (assoc acc channel final-def)))
         {}
         encodings)]
    (merge common-specs
           (when (seq processed-encodings)
             {:encoding processed-encodings}))))
