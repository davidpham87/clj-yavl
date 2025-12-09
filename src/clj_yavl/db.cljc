(ns clj-yavl.db
  (:require [datascript.core :as d]
            [clojure.walk :as walk]))

(def vega-lite-schema
  {;; Top Level
   :vl/id          {:db/unique :db.unique/identity}
   :vl/mark        {:db/valueType :db.type/ref}
   :vl/encoding    {:db/valueType :db.type/ref}
   :vl/data        {:db/valueType :db.type/ref}
   :vl/transform   {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   :vl/projection  {:db/valueType :db.type/ref}
   :vl/selection   {:db/valueType :db.type/ref}
   :vl/config      {:db/valueType :db.type/ref}
   :vl/resolve     {:db/valueType :db.type/ref}
   :vl/facet       {:db/valueType :db.type/ref}
   :vl/repeat      {:db/valueType :db.type/ref}
   :vl/layer       {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   :vl/concat      {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   :vl/hconcat     {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   :vl/vconcat     {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   :vl/spec        {:db/valueType :db.type/ref}
   :vl/title       {:db/valueType :db.type/ref}
   :vl/params      {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   :vl/tooltip     {} ;; Keep existing scalar/blob behavior for compatibility

   ;; Top Level Properties (Scalar/Blob)
   :vl/align {} :vl/autosize {} :vl/background {} :vl/bounds {} :vl/center {}
   :vl/columns {} :vl/datasets {} :vl/description {} :vl/height {} :vl/name {}
   :vl/padding {} :vl/spacing {} :vl/usermeta {} :vl/view {} :vl/width {}

   ;; Mark
   :mark/type      {}
   :mark/def       {} ;; Keep existing blob behavior
   :mark/clip      {:db/valueType :db.type/ref} ;; ExprRef or boolean
   :mark/color     {:db/valueType :db.type/ref} ;; Gradient/Color/ExprRef
   :mark/fill      {:db/valueType :db.type/ref}
   :mark/stroke    {:db/valueType :db.type/ref}
   :mark/tooltip   {:db/valueType :db.type/ref} ;; TooltipContent

   ;; Mark Properties (Scalar/Blob)
   :mark/align {} :mark/angle {} :mark/aria {} :mark/ariaRole {}
   :mark/ariaRoleDescription {} :mark/aspect {} :mark/baseline {} :mark/blend {}
   :mark/cornerRadius {} :mark/cornerRadiusBottomLeft {} :mark/cornerRadiusBottomRight {}
   :mark/cornerRadiusTopLeft {} :mark/cornerRadiusTopRight {} :mark/cursor {}
   :mark/description {} :mark/dir {} :mark/dx {} :mark/dy {} :mark/ellipsis {}
   :mark/endAngle {} :mark/fillOpacity {} :mark/filled {} :mark/font {} :mark/fontSize {}
   :mark/fontStyle {} :mark/fontWeight {} :mark/height {} :mark/href {} :mark/innerRadius {}
   :mark/interpolate {} :mark/invalid {} :mark/limit {} :mark/line {} :mark/lineBreak {}
   :mark/lineHeight {} :mark/opacity {} :mark/order {} :mark/orient {} :mark/outerRadius {}
   :mark/padAngle {} :mark/point {} :mark/radius {} :mark/radius2 {} :mark/radius2Offset {}
   :mark/radiusOffset {} :mark/shape {} :mark/size {} :mark/smooth {} :mark/startAngle {}
   :mark/strokeCap {} :mark/strokeDash {} :mark/strokeDashOffset {} :mark/strokeJoin {}
   :mark/strokeMiterLimit {} :mark/strokeOffset {} :mark/strokeOpacity {} :mark/strokeWidth {}
   :mark/style {} :mark/tension {} :mark/text {} :mark/theta {} :mark/theta2 {}
   :mark/theta2Offset {} :mark/thetaOffset {} :mark/timeUnitBandPosition {}
   :mark/timeUnitBandSize {} :mark/url {} :mark/width {} :mark/x {} :mark/x2 {}
   :mark/x2Offset {} :mark/xOffset {} :mark/y {} :mark/y2 {} :mark/y2Offset {} :mark/yOffset {}

   ;; Encoding
   :encoding/channels {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}

   ;; Channel
   :channel/name   {}
   :channel/field  {}
   :channel/type   {}
   :channel/def    {} ;; Keep existing blob behavior
   :channel/axis   {:db/valueType :db.type/ref}
   :channel/scale  {:db/valueType :db.type/ref}
   :channel/legend {:db/valueType :db.type/ref}
   :channel/bin    {:db/valueType :db.type/ref}
   :channel/sort   {:db/valueType :db.type/ref}
   :channel/condition {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   :channel/impute {:db/valueType :db.type/ref}
   :channel/header {:db/valueType :db.type/ref}

   ;; Channel Properties (Scalar/Blob)
   :channel/aggregate {} :channel/band {} :channel/format {} :channel/formatType {}
   :channel/stack {} :channel/timeUnit {} :channel/title {} :channel/value {}

   ;; Axis
   :axis/title     {:db/valueType :db.type/ref} ;; Title object
   :axis/labelAlign {:db/valueType :db.type/ref} ;; Conditional
   :axis/labelBaseline {:db/valueType :db.type/ref}
   :axis/labelColor {:db/valueType :db.type/ref}
   :axis/labelFont {:db/valueType :db.type/ref}
   :axis/labelFontSize {:db/valueType :db.type/ref}
   :axis/labelFontStyle {:db/valueType :db.type/ref}
   :axis/labelFontWeight {:db/valueType :db.type/ref}
   :axis/gridColor {:db/valueType :db.type/ref}
   :axis/gridDash {:db/valueType :db.type/ref}
   :axis/gridDashOffset {:db/valueType :db.type/ref}
   :axis/gridOpacity {:db/valueType :db.type/ref}
   :axis/gridWidth {:db/valueType :db.type/ref}
   :axis/tickColor {:db/valueType :db.type/ref}
   :axis/tickDash {:db/valueType :db.type/ref}
   :axis/tickDashOffset {:db/valueType :db.type/ref}
   :axis/tickOpacity {:db/valueType :db.type/ref}
   :axis/tickSize {:db/valueType :db.type/ref}
   :axis/tickWidth {:db/valueType :db.type/ref}

   ;; Axis Properties (Scalar/Blob)
   :axis/aria {} :axis/bandPosition {} :axis/description {} :axis/domain {} :axis/domainCap {}
   :axis/domainColor {} :axis/domainDash {} :axis/domainDashOffset {} :axis/domainOpacity {}
   :axis/domainWidth {} :axis/format {} :axis/formatType {} :axis/grid {} :axis/gridCap {}
   :axis/labelAngle {} :axis/labelBound {} :axis/labelExpr {} :axis/labelFlush {}
   :axis/labelFlushOffset {} :axis/labelLimit {} :axis/labelLineHeight {} :axis/labelOffset {}
   :axis/labelOpacity {} :axis/labelOverlap {} :axis/labelPadding {} :axis/labelSeparation {}
   :axis/labels {} :axis/maxExtent {} :axis/minExtent {} :axis/offset {} :axis/orient {}
   :axis/position {} :axis/style {} :axis/tickBand {} :axis/tickCap {} :axis/tickCount {}
   :axis/tickExtra {} :axis/tickMinStep {} :axis/tickOffset {} :axis/tickRound {} :axis/ticks {}
   :axis/titleAlign {} :axis/titleAnchor {} :axis/titleAngle {} :axis/titleBaseline {}
   :axis/titleColor {} :axis/titleFont {} :axis/titleFontSize {} :axis/titleFontStyle {}
   :axis/titleFontWeight {} :axis/titleLimit {} :axis/titleLineHeight {} :axis/titleOpacity {}
   :axis/titlePadding {} :axis/titleX {} :axis/titleY {} :axis/translate {} :axis/values {}
   :axis/zindex {}

   ;; Scale
   :scale/domain   {:db/valueType :db.type/ref} ;; ParameterExtent or DomainUnionWith
   :scale/bins     {:db/valueType :db.type/ref}
   :scale/interpolate {:db/valueType :db.type/ref}
   :scale/scheme   {:db/valueType :db.type/ref}

   ;; Scale Properties (Scalar/Blob)
   :scale/align {} :scale/base {} :scale/clamp {} :scale/constant {} :scale/domainMax {}
   :scale/domainMid {} :scale/domainMin {} :scale/domainRaw {} :scale/exponent {}
   :scale/nice {} :scale/padding {} :scale/paddingInner {} :scale/paddingOuter {}
   :scale/range {} :scale/rangeMax {} :scale/rangeMin {} :scale/reverse {} :scale/round {}
   :scale/type {} :scale/zero {}

   ;; Legend
   :legend/title   {:db/valueType :db.type/ref}
   :legend/tickCount {:db/valueType :db.type/ref}

   ;; Legend Properties (Scalar/Blob)
   :legend/aria {} :legend/clipHeight {} :legend/columnPadding {} :legend/columns {}
   :legend/cornerRadius {} :legend/description {} :legend/direction {} :legend/fillColor {}
   :legend/format {} :legend/formatType {} :legend/gradientLength {} :legend/gradientOpacity {}
   :legend/gradientStrokeColor {} :legend/gradientStrokeWidth {} :legend/gradientThickness {}
   :legend/gridAlign {} :legend/labelAlign {} :legend/labelBaseline {} :legend/labelColor {}
   :legend/labelExpr {} :legend/labelFont {} :legend/labelFontSize {} :legend/labelFontStyle {}
   :legend/labelFontWeight {} :legend/labelLimit {} :legend/labelOffset {} :legend/labelOpacity {}
   :legend/labelOverlap {} :legend/labelPadding {} :legend/labelSeparation {} :legend/legendX {}
   :legend/legendY {} :legend/offset {} :legend/orient {} :legend/padding {} :legend/rowPadding {}
   :legend/strokeColor {} :legend/symbolDash {} :legend/symbolDashOffset {}
   :legend/symbolFillColor {} :legend/symbolLimit {} :legend/symbolOffset {}
   :legend/symbolOpacity {} :legend/symbolSize {} :legend/symbolStrokeColor {}
   :legend/symbolStrokeWidth {} :legend/symbolType {} :legend/tickMinStep {}
   :legend/titleAlign {} :legend/titleAnchor {} :legend/titleBaseline {} :legend/titleColor {}
   :legend/titleFont {} :legend/titleFontSize {} :legend/titleFontStyle {}
   :legend/titleFontWeight {} :legend/titleLimit {} :legend/titleLineHeight {}
   :legend/titleOpacity {} :legend/titleOrient {} :legend/titlePadding {} :legend/type {}
   :legend/values {} :legend/zindex {}

   ;; Data
   :data/format    {:db/valueType :db.type/ref}
   :data/values    {} ;; Blob
   :data/url       {}
   :data/name      {}
   :data/generator {}

   ;; Transform (Common Container Props)
   :transform/aggregate    {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   :transform/bin          {:db/valueType :db.type/ref}
   :transform/calculate    {}
   :transform/filter       {:db/valueType :db.type/ref} ;; PredicateComposition
   :transform/flatten      {}
   :transform/fold         {}
   :transform/impute       {:db/valueType :db.type/ref}
   :transform/joinaggregate {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   :transform/loess        {:db/valueType :db.type/ref}
   :transform/lookup       {}
   :transform/pivot        {}
   :transform/quantile     {:db/valueType :db.type/ref}
   :transform/regression   {:db/valueType :db.type/ref}
   :transform/sample       {:db/valueType :db.type/ref}
   :transform/stack        {:db/valueType :db.type/ref}
   :transform/timeUnit     {:db/valueType :db.type/ref}
   :transform/window       {:db/valueType :db.type/ref :db/cardinality :db.cardinality/many}
   :transform/as           {}
   :transform/groupby      {}
   :transform/on           {}
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

(defn with [db tx-data]
  (d/with db tx-data))

(defn- remove-nils [m]
  (walk/postwalk
   (fn [x]
     (if (map? x)
       (into {} (remove (comp nil? val)) x)
       x))
   m))

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
    (remove-nils tx)))

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
