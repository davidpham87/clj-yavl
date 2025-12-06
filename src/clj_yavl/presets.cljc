(ns clj-yavl.presets
  (:require [clj-yavl.api :as api]))

(defn- with-title [spec title]
  (if title
    (assoc spec :title title)
    spec))

(defn xy-plot
  "Generates an XY plot spec (Point, Line, Area).

   Args:
     input: map with keys:
       - :x (field name or encoding map)
       - :y (field name or encoding map)
       - :mark (string/keyword, e.g. :point, :line, :area) - default :point
       - :color (optional field name or encoding map)
       - :size (optional field name or encoding map)
       - :title (optional string)
       - :data-schema (optional Malli schema for type inference)

   Returns:
     Vega-Lite spec map."
  [{:keys [x y mark color size title data-schema] :or {mark :point}}]
  (let [encodings (cond-> {:x x :y y}
                    color (assoc :color color)
                    size (assoc :size size))
        common-specs {:mark mark}]
    (-> (api/base-plot encodings common-specs {:data-schema data-schema})
        (with-title title))))

(defn pie-chart
  "Generates a Pie or Doughnut chart spec.

   Args:
     input: map with keys:
       - :category (field name for color)
       - :value (field name for theta)
       - :inner-radius (optional number for doughnut)
       - :title (optional string)
       - :data-schema (optional Malli schema)

   Returns:
     Vega-Lite spec map."
  [{:keys [category value inner-radius title data-schema]}]
  (let [encodings {:theta {:field value :type "quantitative" :stack true}
                   :color {:field category :type "nominal"}}
        mark-def (cond-> {:type "arc"}
                   inner-radius (assoc :innerRadius inner-radius))
        common-specs {:mark mark-def}]
    (-> (api/base-plot encodings common-specs {:data-schema data-schema})
        (with-title title))))

(defn bar-chart
  "Generates a Bar chart spec, optionally grouped.

   Args:
     input: map with keys:
       - :x (field name for x-axis)
       - :y (field name for y-axis)
       - :color (optional field name for color)
       - :group (optional field name for grouping/offset)
       - :grouped? (boolean, if true uses :group for xOffset)
       - :orientation (optional :vertical or :horizontal, default :vertical)
       - :title (optional string)
       - :data-schema (optional Malli schema)

   Returns:
     Vega-Lite spec map."
  [{:keys [x y color group grouped? orientation title data-schema] :or {orientation :vertical}}]
  (let [is-horizontal (= orientation :horizontal)
        ;; For vertical bar: x is categorical usually, y is quantitative
        ;; For grouped vertical: x is main group, xOffset is subgroup (group param)

        base-encodings (cond-> {}
                         x (assoc :x x)
                         y (assoc :y y)
                         color (assoc :color color))

        encodings (if (and grouped? group)
                    (if is-horizontal
                      (assoc base-encodings :yOffset {:field group}) ;; Grouped horizontal bars use yOffset
                      (assoc base-encodings :xOffset {:field group})) ;; Grouped vertical bars use xOffset
                    base-encodings)

        common-specs {:mark "bar"}]
    (-> (api/base-plot encodings common-specs {:data-schema data-schema})
        (with-title title))))
