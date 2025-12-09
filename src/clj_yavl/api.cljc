(ns clj-yavl.api
  (:require [malli.core :as m]
            [clojure.string :as str])
  (:refer-clojure :exclude [repeat]))

;; Google Corporate Colors
(def google-colors
  ["#4285F4" "#DB4437" "#F4B400" "#0F9D58"])

(def default-config
  {:config {:range {:category google-colors} ;; [:scale :range] - Google corporate colors
            :axis {:labelFontSize 12 :titleFontSize 14}
            :header {:labelFontSize 12 :titleFontSize 14}
            :legend {:labelFontSize 12 :titleFontSize 14}
            :text {:fontSize 12}}
   :width 400
   :height 300})

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

(defn- get-field-props
  "Finds the properties for a specific field within a dataset schema."
  [dataset-schema field-name]
  (let [schema (m/schema dataset-schema)
        t (m/type schema)
        ;; Unwrap collection type if present
        map-schema (if (#{:vector :sequential :set :list} t)
                     (first (m/children schema))
                     schema)]
    (when (= (m/type map-schema) :map)
      (some (fn [[k props _]]
              (when (= (name k) field-name)
                props))
            (m/children map-schema)))))

(defn- infer-type-for-field
  [dataset-schema field-name]
  (when-let [field-schema (get-field-schema dataset-schema field-name)]
    (infer-vl-type field-schema)))

(defn rename-column-values
  "Creates a Vega-Lite calculate transform to rename values in a column.
   Values not in the mapping are left unchanged.

   Args:
     col-name: The name of the column (string).
     mapping: A map of {old-value new-value}.

   Returns:
     A map representing a Vega-Lite calculate transform."
  [col-name mapping]
  (let [escape-val (fn [v] (str/replace (str v) "'" "\\'"))
        expression (str/join " : "
                             (concat
                              (map (fn [[old new]]
                                     (str "datum['" col-name "'] == '" (escape-val old) "' ? '" (escape-val new) "'"))
                                   mapping)
                              [(str "datum['" col-name "']")]))]
    {:calculate expression :as col-name}))

(defn transform-map
  "Creates a Vega-Lite calculate transform (map operation).

   Args:
     new-col: The name of the new column (string).
     expression: The Vega expression string.

   Returns:
     A map representing a Vega-Lite calculate transform."
  [new-col expression]
  {:calculate expression :as new-col})

(defn transform-filter
  "Creates a Vega-Lite filter transform.

   Args:
     predicate: The Vega expression string for filtering.

   Returns:
     A map representing a Vega-Lite filter transform."
  [predicate]
  {:filter predicate})

(defn tooltip-def
  "Generates a tooltip definition (vector of field definitions) for Vega-Lite.

   Args:
     keys: A sequence of field names (strings).
     dataset-schema: The Malli schema of the dataset.

   Returns:
     A vector of maps, where each map matches StringFieldDef."
  [keys dataset-schema]
  (vec
   (for [k keys]
     (let [inferred-type (infer-type-for-field dataset-schema k)
           field-props (get-field-props dataset-schema k)
           custom-format (:format field-props)
           field-def {:field k
                      :type inferred-type}]
       (cond
         custom-format (assoc field-def :format custom-format)
         (= inferred-type "quantitative") (assoc field-def :format "s")
         :else field-def)))))

(defn wrap-with-facet
  "Wraps a Vega-Lite spec with a facet operator.
   Lifts :config to the top level.

   opts keys: :row, :column, :facet, :columns"
  [spec {:keys [row column facet columns]}]
  (if (or row column facet)
    (let [config (:config spec)
          ;; We keep width/height in the child spec (cell size)
          inner-spec (dissoc spec :config)
          facet-prop (if facet
                       (let [base (if (map? facet) facet {:field facet})]
                         (cond-> base
                           columns (assoc :columns columns)))
                       ;; else row/column
                       (cond-> {}
                         row (assoc :row (if (map? row) row {:field row}))
                         column (assoc :column (if (map? column) column {:field column}))))
          res {:facet facet-prop
               :spec inner-spec}]
      (cond-> res
        config (assoc :config config)))
    spec))

(defn wrap-with-repeat
  "Wraps a Vega-Lite spec with a repeat operator.
   Lifts :config to the top level.

   opts keys: :repeat, :columns (if repeat is array)"
  [spec {:keys [repeat columns]}]
  (if repeat
    (let [config (:config spec)
          inner-spec (dissoc spec :config)
          repeat-prop (cond
                        (and (map? repeat) (or (:row repeat) (:column repeat))) repeat
                        (vector? repeat) repeat
                        (string? repeat) [repeat]
                        :else repeat)
          res (cond-> {:repeat repeat-prop
                       :spec inner-spec}
                (and (vector? repeat-prop) columns) (assoc :columns columns))]
      (cond-> res
        config (assoc :config config)))
    spec))

(defn add-transforms
  "Adds transform operations to a Vega-Lite spec.

   opts keys: :transform (vector of maps), :calculate (map or vector of maps)"
  [spec {:keys [transform calculate]}]
  (let [calc-transforms (when calculate
                          (if (vector? calculate)
                            calculate
                            [calculate]))
        existing (or (:transform spec) [])
        additional (concat (or transform []) (or calc-transforms []))
        all-transforms (vec (concat existing additional))]
    (if (seq all-transforms)
      (assoc spec :transform all-transforms)
      spec)))

(defn- deep-merge
  "Recursively merges maps."
  [& maps]
  (apply merge-with (fn [x y]
                      (if (and (map? x) (map? y))
                        (deep-merge x y)
                        y))
         maps))

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
         encodings)
        ;; Merge defaults into common-specs
        final-specs (deep-merge default-config common-specs)]
    (merge final-specs
           (when (seq processed-encodings)
             {:encoding processed-encodings}))))

(defn- lift-config-from-specs
  "Helper to lift and merge :config from a list of specs.
   Returns [merged-config specs-without-config]."
  [specs]
  (let [configs (keep :config specs)
        merged-config (when (seq configs) (apply deep-merge configs))
        clean-specs (mapv #(dissoc % :config) specs)]
    [merged-config clean-specs]))

(defn layer
  "Creates a Layered View (LayerSpec) from a sequence of specs.
   Lifts and merges :config from children to the top level."
  [specs]
  (let [[config children] (lift-config-from-specs specs)]
    (cond-> {:layer children}
      config (assoc :config config))))

(defn hconcat
  "Creates a Horizontally Concatenated View (HConcatSpec).
   Lifts and merges :config from children to the top level."
  [specs]
  (let [[config children] (lift-config-from-specs specs)]
    (cond-> {:hconcat children}
      config (assoc :config config))))

(defn vconcat
  "Creates a Vertically Concatenated View (VConcatSpec).
   Lifts and merges :config from children to the top level."
  [specs]
  (let [[config children] (lift-config-from-specs specs)]
    (cond-> {:vconcat children}
      config (assoc :config config))))

(defn concat-specs
  "Creates a General Concatenated View (ConcatSpec).
   Lifts and merges :config from children to the top level."
  [specs]
  (let [[config children] (lift-config-from-specs specs)]
    (cond-> {:concat children}
      config (assoc :config config))))

(defn spec
  "Returns the provided map as a Vega-Lite specification.
   Useful for explicit clarity or future validation."
  [m]
  m)

;; Aliases for consistency and ease of use
(def facet wrap-with-facet)
(def repeat wrap-with-repeat)
