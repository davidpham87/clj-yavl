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
  [{:keys [x y mark color size title data-schema width height config] :or {mark :point}}]
  (let [encodings (cond-> {:x x :y y}
                    color (assoc :color color)
                    size (assoc :size size))
        mark (if (keyword? mark) (name mark) mark)
        common-specs (cond-> {:mark mark}
                       width (assoc :width width)
                       height (assoc :height height)
                       config (assoc :config config))]
    (-> (api/base-plot encodings common-specs {:data-schema data-schema})
        (with-title title))))

(defmethod unit-spec :facet
  [{:keys [x y mark color size row column facet columns title data-schema width height config] :or {mark :point}}]
  (let [encodings (cond-> {:x x :y y}
                    color (assoc :color color)
                    size (assoc :size size)
                    row (assoc :row row)
                    column (assoc :column column)
                    facet (assoc :facet (let [base (if (map? facet) facet {:field facet})]
                                          (cond-> base
                                            columns (assoc :columns columns)))))
        mark (if (keyword? mark) (name mark) mark)
        common-specs (cond-> {:mark mark}
                       width (assoc :width width)
                       height (assoc :height height)
                       config (assoc :config config))]
    (-> (api/base-plot encodings common-specs {:data-schema data-schema})
        (with-title title))))

(defmethod unit-spec :pie
  [{:keys [category value inner-radius title data-schema width height config]}]
  (let [encodings {:theta {:field value :type "quantitative" :stack true}
                   :color {:field category :type "nominal"}}
        mark-def (cond-> {:type "arc"}
                   inner-radius (assoc :innerRadius inner-radius))
        common-specs (cond-> {:mark mark-def}
                       width (assoc :width width)
                       height (assoc :height height)
                       config (assoc :config config))]
    (-> (api/base-plot encodings common-specs {:data-schema data-schema})
        (with-title title))))

(defmethod unit-spec :bar
  [{:keys [x y color group grouped? orientation title data-schema width height config] :or {orientation :vertical}}]
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

        common-specs (cond-> {:mark "bar"}
                       width (assoc :width width)
                       height (assoc :height height)
                       config (assoc :config config))]
    (-> (api/base-plot encodings common-specs {:data-schema data-schema})
        (with-title title))))
