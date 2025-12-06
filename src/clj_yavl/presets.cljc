(ns clj-yavl.presets
  (:require [clj-yavl.api :as api]))

(defmulti unit-spec
  "Generates a Vega-Lite spec based on the :type key in the options map."
  :type)

(defn- with-title [spec title]
  (if title
    (assoc spec :title title)
    spec))

(defmethod unit-spec :xyplot
  [{:keys [x y mark color size title data-schema] :or {mark :point}}]
  (let [encodings (cond-> {:x x :y y}
                    color (assoc :color color)
                    size (assoc :size size))
        common-specs {:mark mark}]
    (-> (api/base-plot encodings common-specs {:data-schema data-schema})
        (with-title title))))

(defmethod unit-spec :pie
  [{:keys [category value inner-radius title data-schema]}]
  (let [encodings {:theta {:field value :type "quantitative" :stack true}
                   :color {:field category :type "nominal"}}
        mark-def (cond-> {:type "arc"}
                   inner-radius (assoc :innerRadius inner-radius))
        common-specs {:mark mark-def}]
    (-> (api/base-plot encodings common-specs {:data-schema data-schema})
        (with-title title))))

(defmethod unit-spec :bar
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
