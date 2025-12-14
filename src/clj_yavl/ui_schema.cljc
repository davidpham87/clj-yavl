(ns clj-yavl.ui-schema
  (:require [malli.core :as m]
            [clojure.string :as str]
            [clj-yavl.infer :as infer]))

(defn- get-fields
  [data-schema]
  (let [schema (m/schema data-schema)
        t (m/type schema)
        map-schema (if (#{:vector :sequential :set :list} t)
                     (if (seq (m/children schema))
                       (let [child (first (m/children schema))]
                         (if (m/schema? child)
                           child
                           (try (m/schema child)
                                (catch #?(:clj Exception
                                          :cljs js/Error)
                                  _
                                  nil))))
                       nil)
                     schema)]
    (if (and map-schema (= (m/type map-schema) :map))
      (let [children (m/children map-schema)]
        (mapv (fn [child]
                (if (vector? child)
                  (name (first child))
                  ;; Fallback if child format is unexpected
                  (str child)))
          children))
      [])))

(defn- extract-as-fields
  [transform]
  (let [as (:as transform)]
    (cond (string? as) [as]
          (vector? as) as
          :else [])))

(defn- get-transform-fields
  [opts]
  (let [transforms (concat (:transform opts)
                           (if (vector? (:calculate opts))
                             (:calculate opts)
                             [(:calculate opts)]))]
    (reduce (fn [acc t] (if t (into acc (extract-as-fields t)) acc))
      []
      transforms)))

(defn- field-select [fields] {:property :field, :type :select, :options fields})

(defn- type-select
  [current-type]
  {:property :type,
   :type :select,
   :options ["quantitative" "nominal" "temporal" "ordinal"],
   :default (or current-type "nominal")})

(defn- encoding-def
  [fields current-field-opts]
  {:field (field-select fields),
   :type (type-select (get current-field-opts :type)),
   :title {:property :title, :type :text-input}})

(def presets
  {:xyplot {:args [:x :y :mark :color :size],
            :def (fn [fields current-opts]
                   {:x (encoding-def fields (get current-opts :x)),
                    :y (encoding-def fields (get current-opts :y)),
                    :mark {:value {:property :value,
                                   :type :select,
                                   :options ["point" "line" "area" "bar"
                                             "circle" "square" "tick" "rect"]}},
                    :color (encoding-def fields (get current-opts :color)),
                    :size (encoding-def fields (get current-opts :size))})},
   :pie {:args [:category :value :inner-radius],
         :def (fn [fields current-opts]
                {:category (encoding-def fields (get current-opts :category)),
                 :value (encoding-def fields (get current-opts :value)),
                 :inner-radius {:value {:property :value,
                                        :type :number-input}}})},
   :bar {:args [:x :y :color :group :grouped? :orientation],
         :def (fn [fields current-opts]
                {:x (encoding-def fields (get current-opts :x)),
                 :y (encoding-def fields (get current-opts :y)),
                 :color (encoding-def fields (get current-opts :color)),
                 :group (field-select fields),
                 :grouped? {:value {:property :value, :type :boolean}},
                 :orientation {:value {:property :value,
                                       :type :select,
                                       :options [:vertical :horizontal]}}})}})

(def common-args [:title :width :height :facet :repeat :transform])

(defn- common-def
  [fields]
  {:title {:value {:property :value, :type :text-input}},
   :width {:value {:property :value, :type :number-input}},
   :height {:value {:property :value, :type :number-input}},
   :facet {:field (field-select fields),
           :columns {:property :columns, :type :number-input}},
   :repeat {:row {:property :row, :type :multi-select, :options fields},
            :column {:property :column, :type :multi-select, :options fields}},
   :transform {:value {:property :value, :type :json-editor}}})

(defn generate-ui-schema
  [preset-key data-schema & [current-opts]]
  (let [schema-fields (get-fields data-schema)
        transform-fields (get-transform-fields current-opts)
        all-fields (distinct (concat schema-fields transform-fields))
        preset (get presets preset-key)
        preset-def ((:def preset) all-fields)
        common (common-def all-fields)]
    (vec
      (concat
        (for [arg (:args preset)]
          (let [arg-opts (get current-opts arg)]
            {:scope :preset,
             :arg arg,
             :main (-> (get preset-def arg)
                       (update :field assoc :current-val (get arg-opts :field))
                       (update :type
                               (fn [type-map]
                                 (assoc type-map
                                   :current-type (get arg-opts :type)))))
             :advanced {}}))
        (for [arg common-args]
          (let [arg-opts (get current-opts arg)]
            {:scope :common,
             :arg arg,
             :main (-> (get common arg)
                       (update :field assoc :current-val (get arg-opts :field))
                       (update :type
                               (fn [type-map]
                                 (assoc type-map
                                   :current-type (get arg-opts :type)))))
             :advanced {}}))))))
