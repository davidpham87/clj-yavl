(ns clj-yavl.schema.vega-lite
  (:require [malli.core :as m]
            [clj-yavl.schema.vega-lite.primitives :as primitives]))
(declare PredicateComposition Spec Stream Geometry ConcatSpec_GenericSpec_)

(def FieldName primitives/FieldName)

(def ArgminDef [:map {:closed true} [:argmin [:ref #'FieldName]]])

(def NonArgAggregateOp primitives/NonArgAggregateOp)

(def ArgmaxDef [:map {:closed true} [:argmax [:ref #'FieldName]]])

(def Aggregate
  [:or [:ref #'NonArgAggregateOp] [:ref #'ArgmaxDef] [:ref #'ArgminDef]])

(def AggregateOp primitives/AggregateOp)

(def AggregatedFieldDef
  [:map {:closed true} [:as [:ref #'FieldName]]
   [:field {:optional true} [:ref #'FieldName]] [:op [:ref #'AggregateOp]]])

(def AggregateTransform
  [:map {:closed true} [:aggregate [:vector [:ref #'AggregatedFieldDef]]]
   [:groupby {:optional true} [:vector [:ref #'FieldName]]]])

(def Align primitives/Align)

(def SortByChannel primitives/SortByChannel)

(def SortByChannelDesc primitives/SortByChannelDesc)

(def SortOrder primitives/SortOrder)

(def AllSortString
  [:or [:ref #'SortOrder] [:ref #'SortByChannel] [:ref #'SortByChannelDesc]])

(def StrokeJoin primitives/StrokeJoin)

(def FontStyle primitives/FontStyle)

(def ColorName primitives/ColorName)

(def HexColor primitives/HexColor)

(def Color [:or [:ref #'ColorName] [:ref #'HexColor] string?])

(def GradientStop
  [:map {:closed true} [:color [:ref #'Color]] [:offset number?]])

(def RadialGradient
  [:map {:closed true} [:stops [:vector [:ref #'GradientStop]]]
   [:y1 {:optional true} number?] [:r2 {:optional true} number?]
   [:r1 {:optional true} number?] [:id {:optional true} string?]
   [:gradient [:= "radial"]] [:x1 {:optional true} number?]
   [:y2 {:optional true} number?] [:x2 {:optional true} number?]])

(def LinearGradient
  [:map {:closed true} [:gradient [:= "linear"]] [:id {:optional true} string?]
   [:stops [:vector [:ref #'GradientStop]]] [:x1 {:optional true} number?]
   [:x2 {:optional true} number?] [:y1 {:optional true} number?]
   [:y2 {:optional true} number?]])

(def Gradient [:or [:ref #'LinearGradient] [:ref #'RadialGradient]])

(def Blend primitives/Blend)

(def Cursor primitives/Cursor)

(def TextDirection primitives/TextDirection)

(def Orientation primitives/Orientation)

(def Interpolate primitives/Interpolate)

(def Baseline primitives/Baseline)

(def TextBaseline
  [:or [:ref #'Baseline] [:enum "alphabetic" "line-top" "line-bottom"]])

(def TooltipContent primitives/TooltipContent)

(def StrokeCap primitives/StrokeCap)

(def SymbolShape primitives/SymbolShape)

(def FontWeight primitives/FontWeight)

(def URI primitives/URI)

(def MarkInvalidDataMode primitives/MarkInvalidDataMode)

(def Text primitives/Text)

(def ExprRef primitives/ExprRef)

(def OverlayMarkDef
  [:map {:closed true}
   [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:baseline {:optional true} [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:y2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:cornerRadiusBottomRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
   [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:stroke {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:clip {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
   [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radiusOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandSize {:optional true} number?]
   [:fill {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:time {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
   [:width {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'Orientation]]
   [:x2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandPosition {:optional true} number?]
   [:interpolate {:optional true} [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:size {:optional true} [:or number? [:ref #'ExprRef]]]
   [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:style {:optional true} [:or string? [:vector string?]]]
   [:thetaOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:shape {:optional true}
    [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
   [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:order {:optional true} [:or nil? boolean?]]
   [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadiusBottomLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:yOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:cornerRadiusTopRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
   [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:filled {:optional true} boolean?]
   [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:tooltip {:optional true}
    [:or number? string? boolean? nil? [:ref #'TooltipContent]
     [:ref #'ExprRef]]]
   [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:height {:optional true} [:or number? [:ref #'ExprRef]]]
   [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]
   [:xOffset {:optional true} [:or number? [:ref #'ExprRef]]]])

(def RelativeBandSize primitives/RelativeBandSize)

(def Mark primitives/Mark)

(def MarkDef
  [:map {:closed true}
   [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:baseline {:optional true} [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:y2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:cornerRadiusBottomRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
   [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:discreteBandSize {:optional true} [:or number? [:ref #'RelativeBandSize]]]
   [:thickness {:optional true} number?]
   [:stroke {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:clip {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
   [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:binSpacing {:optional true} number?]
   [:radiusOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandSize {:optional true} number?]
   [:fill {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:time {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
   [:bandSize {:optional true} number?]
   [:width {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'RelativeBandSize]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
   [:type [:ref #'Mark]] [:continuousBandSize {:optional true} number?]
   [:cornerRadiusEnd {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'Orientation]]
   [:x2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandPosition {:optional true} number?]
   [:interpolate {:optional true} [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:size {:optional true} [:or number? [:ref #'ExprRef]]]
   [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:style {:optional true} [:or string? [:vector string?]]]
   [:thetaOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:line {:optional true} [:or boolean? [:ref #'OverlayMarkDef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:minBandSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:shape {:optional true}
    [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
   [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:order {:optional true} [:or nil? boolean?]]
   [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadiusBottomLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:point {:optional true}
    [:or boolean? [:ref #'OverlayMarkDef] [:enum "transparent"]]]
   [:yOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:cornerRadiusTopRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
   [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:filled {:optional true} boolean?]
   [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:tooltip {:optional true}
    [:or number? string? boolean? nil? [:ref #'TooltipContent]
     [:ref #'ExprRef]]]
   [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:height {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'RelativeBandSize]]]
   [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]
   [:xOffset {:optional true} [:or number? [:ref #'ExprRef]]]])

(def ErrorBar primitives/ErrorBar)

(def ErrorBand primitives/ErrorBand)

(def BoxPlot primitives/BoxPlot)

(def CompositeMark [:or [:ref #'BoxPlot] [:ref #'ErrorBar] [:ref #'ErrorBand]])

(def LineConfig
  [:map {:closed true}
   [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:baseline {:optional true} [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:cornerRadiusBottomRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
   [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:stroke {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
   [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandSize {:optional true} number?]
   [:fill {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:time {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
   [:width {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'Orientation]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandPosition {:optional true} number?]
   [:interpolate {:optional true} [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:size {:optional true} [:or number? [:ref #'ExprRef]]]
   [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:shape {:optional true}
    [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
   [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:order {:optional true} [:or nil? boolean?]]
   [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadiusBottomLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:point {:optional true}
    [:or boolean? [:ref #'OverlayMarkDef] [:enum "transparent"]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:cornerRadiusTopRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
   [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:filled {:optional true} boolean?]
   [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:tooltip {:optional true}
    [:or number? string? boolean? nil? [:ref #'TooltipContent]
     [:ref #'ExprRef]]]
   [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:height {:optional true} [:or number? [:ref #'ExprRef]]]
   [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def RectConfig
  [:map {:closed true}
   [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:baseline {:optional true} [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:cornerRadiusBottomRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
   [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:discreteBandSize {:optional true} [:or number? [:ref #'RelativeBandSize]]]
   [:stroke {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
   [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:binSpacing {:optional true} number?]
   [:timeUnitBandSize {:optional true} number?]
   [:fill {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:time {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
   [:width {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
   [:continuousBandSize {:optional true} number?]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'Orientation]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandPosition {:optional true} number?]
   [:interpolate {:optional true} [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:size {:optional true} [:or number? [:ref #'ExprRef]]]
   [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:minBandSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:shape {:optional true}
    [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
   [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:order {:optional true} [:or nil? boolean?]]
   [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadiusBottomLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:cornerRadiusTopRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
   [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:filled {:optional true} boolean?]
   [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:tooltip {:optional true}
    [:or number? string? boolean? nil? [:ref #'TooltipContent]
     [:ref #'ExprRef]]]
   [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:height {:optional true} [:or number? [:ref #'ExprRef]]]
   [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def TickConfig
  [:map {:closed true}
   [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:baseline {:optional true} [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:cornerRadiusBottomRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
   [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:discreteBandSize {:optional true} [:or number? [:ref #'RelativeBandSize]]]
   [:thickness {:optional true} number?]
   [:stroke {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
   [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:binSpacing {:optional true} number?]
   [:timeUnitBandSize {:optional true} number?]
   [:fill {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:time {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
   [:bandSize {:optional true} number?]
   [:width {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
   [:continuousBandSize {:optional true} number?]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'Orientation]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandPosition {:optional true} number?]
   [:interpolate {:optional true} [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:size {:optional true} [:or number? [:ref #'ExprRef]]]
   [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:minBandSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:shape {:optional true}
    [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
   [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:order {:optional true} [:or nil? boolean?]]
   [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadiusBottomLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:cornerRadiusTopRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
   [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:filled {:optional true} boolean?]
   [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:tooltip {:optional true}
    [:or number? string? boolean? nil? [:ref #'TooltipContent]
     [:ref #'ExprRef]]]
   [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:height {:optional true} [:or number? [:ref #'ExprRef]]]
   [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def BarConfig
  [:map {:closed true}
   [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:baseline {:optional true} [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:cornerRadiusBottomRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
   [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:discreteBandSize {:optional true} [:or number? [:ref #'RelativeBandSize]]]
   [:stroke {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
   [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:binSpacing {:optional true} number?]
   [:timeUnitBandSize {:optional true} number?]
   [:fill {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:time {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
   [:width {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
   [:continuousBandSize {:optional true} number?]
   [:cornerRadiusEnd {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'Orientation]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandPosition {:optional true} number?]
   [:interpolate {:optional true} [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:size {:optional true} [:or number? [:ref #'ExprRef]]]
   [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:minBandSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:shape {:optional true}
    [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
   [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:order {:optional true} [:or nil? boolean?]]
   [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadiusBottomLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:cornerRadiusTopRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
   [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:filled {:optional true} boolean?]
   [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:tooltip {:optional true}
    [:or number? string? boolean? nil? [:ref #'TooltipContent]
     [:ref #'ExprRef]]]
   [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:height {:optional true} [:or number? [:ref #'ExprRef]]]
   [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def MarkConfig
  [:map {:closed true}
   [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:baseline {:optional true} [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:cornerRadiusBottomRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
   [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:stroke {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
   [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandSize {:optional true} number?]
   [:fill {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:time {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
   [:width {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'Orientation]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandPosition {:optional true} number?]
   [:interpolate {:optional true} [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:size {:optional true} [:or number? [:ref #'ExprRef]]]
   [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:shape {:optional true}
    [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
   [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:order {:optional true} [:or nil? boolean?]]
   [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadiusBottomLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:cornerRadiusTopRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
   [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:filled {:optional true} boolean?]
   [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:tooltip {:optional true}
    [:or number? string? boolean? nil? [:ref #'TooltipContent]
     [:ref #'ExprRef]]]
   [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:height {:optional true} [:or number? [:ref #'ExprRef]]]
   [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def AreaConfig
  [:map {:closed true}
   [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:baseline {:optional true} [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:cornerRadiusBottomRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
   [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:stroke {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
   [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandSize {:optional true} number?]
   [:fill {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:time {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
   [:width {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'Orientation]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:timeUnitBandPosition {:optional true} number?]
   [:interpolate {:optional true} [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:size {:optional true} [:or number? [:ref #'ExprRef]]]
   [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:line {:optional true} [:or boolean? [:ref #'OverlayMarkDef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:shape {:optional true}
    [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
   [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:order {:optional true} [:or nil? boolean?]]
   [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadiusBottomLeft {:optional true} [:or number? [:ref #'ExprRef]]]
   [:point {:optional true}
    [:or boolean? [:ref #'OverlayMarkDef] [:enum "transparent"]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:cornerRadiusTopRight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
   [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
   [:filled {:optional true} boolean?]
   [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
   [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
   [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
   [:tooltip {:optional true}
    [:or number? string? boolean? nil? [:ref #'TooltipContent]
     [:ref #'ExprRef]]]
   [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:height {:optional true} [:or number? [:ref #'ExprRef]]]
   [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def AnyMarkConfig
  [:or [:ref #'MarkConfig] [:ref #'AreaConfig] [:ref #'BarConfig]
   [:ref #'RectConfig] [:ref #'LineConfig] [:ref #'TickConfig]])

(def ErrorBarExtent primitives/ErrorBarExtent)

(def ErrorBandDef
  [:map {:closed true} [:clip {:optional true} boolean?]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:tension {:optional true} number?]
   [:band {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:type [:ref #'ErrorBand]] [:orient {:optional true} [:ref #'Orientation]]
   [:interpolate {:optional true} [:ref #'Interpolate]]
   [:borders {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:opacity {:optional true} number?]
   [:extent {:optional true} [:ref #'ErrorBarExtent]]])

(def BoxPlotDef
  [:map {:closed true} [:clip {:optional true} boolean?]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:rule {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:box {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:type [:ref #'BoxPlot]]
   [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
   [:orient {:optional true} [:ref #'Orientation]]
   [:outliers {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:size {:optional true} number?]
   [:median {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:opacity {:optional true} number?]
   [:extent {:optional true} [:or number? [:enum "min-max"]]]
   [:ticks {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]])

(def ErrorBarDef
  [:map {:closed true} [:thickness {:optional true} number?]
   [:clip {:optional true} boolean?]
   [:color {:optional true}
    [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
   [:rule {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:type [:ref #'ErrorBar]] [:orient {:optional true} [:ref #'Orientation]]
   [:size {:optional true} number?] [:opacity {:optional true} number?]
   [:extent {:optional true} [:ref #'ErrorBarExtent]]
   [:ticks {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]])

(def CompositeMarkDef
  [:or [:ref #'BoxPlotDef] [:ref #'ErrorBarDef] [:ref #'ErrorBandDef]])

(def AnyMark
  [:or [:ref #'CompositeMark] [:ref #'CompositeMarkDef] [:ref #'Mark]
   [:ref #'MarkDef]])

(def AutosizeType primitives/AutosizeType)

(def AutoSizeParams
  [:map {:closed true} [:contains {:optional true} [:enum "content" "padding"]]
   [:resize {:optional true} boolean?]
   [:type {:optional true} [:ref #'AutosizeType]]])

(def LogicalNot_Predicate_
  [:map {:closed true, :json-schema/original-name "LogicalNot<Predicate>"}
   [:not [:ref #'PredicateComposition]]])

(def LogicalOr_Predicate_
  [:map {:closed true, :json-schema/original-name "LogicalOr<Predicate>"}
   [:or [:vector [:ref #'PredicateComposition]]]])

(def Day primitives/Day)

(def Month primitives/Month)

(def DateTime
  [:map {:closed true} [:quarter {:optional true} number?]
   [:day {:optional true} [:or [:ref #'Day] string?]]
   [:date {:optional true} number?] [:utc {:optional true} boolean?]
   [:month {:optional true} [:or [:ref #'Month] string?]]
   [:seconds {:optional true} number?] [:year {:optional true} number?]
   [:hours {:optional true} number?] [:milliseconds {:optional true} number?]
   [:minutes {:optional true} number?]])

(def BinnedTimeUnit primitives/BinnedTimeUnit)

(def LocalMultiTimeUnit primitives/LocalMultiTimeUnit)

(def UtcMultiTimeUnit primitives/UtcMultiTimeUnit)

(def MultiTimeUnit [:or [:ref #'LocalMultiTimeUnit] [:ref #'UtcMultiTimeUnit]])

(def UtcSingleTimeUnit primitives/UtcSingleTimeUnit)

(def LocalSingleTimeUnit primitives/LocalSingleTimeUnit)

(def SingleTimeUnit
  [:or [:ref #'LocalSingleTimeUnit] [:ref #'UtcSingleTimeUnit]])

(def TimeUnit [:or [:ref #'SingleTimeUnit] [:ref #'MultiTimeUnit]])

(def TimeUnitParams
  [:map {:closed true} [:binned {:optional true} boolean?]
   [:maxbins {:optional true} number?] [:step {:optional true} number?]
   [:unit {:optional true} [:ref #'TimeUnit]] [:utc {:optional true} boolean?]])

(def FieldEqualPredicate
  [:map {:closed true}
   [:equal [:or string? number? boolean? [:ref #'DateTime] [:ref #'ExprRef]]]
   [:field [:ref #'FieldName]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]])

(def FieldGTEPredicate
  [:map {:closed true} [:field [:ref #'FieldName]]
   [:gte [:or string? number? [:ref #'DateTime] [:ref #'ExprRef]]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]])

(def FieldValidPredicate
  [:map {:closed true} [:field [:ref #'FieldName]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:valid boolean?]])

(def FieldGTPredicate
  [:map {:closed true} [:field [:ref #'FieldName]]
   [:gt [:or string? number? [:ref #'DateTime] [:ref #'ExprRef]]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]])

(def FieldRangePredicate
  [:map {:closed true} [:field [:ref #'FieldName]]
   [:range
    [:or [:vector [:or number? nil? [:ref #'DateTime] [:ref #'ExprRef]]]
     [:ref #'ExprRef]]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]])

(def FieldLTEPredicate
  [:map {:closed true} [:field [:ref #'FieldName]]
   [:lte [:or string? number? [:ref #'DateTime] [:ref #'ExprRef]]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]])

(def FieldLTPredicate
  [:map {:closed true} [:field [:ref #'FieldName]]
   [:lt [:or string? number? [:ref #'DateTime] [:ref #'ExprRef]]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]])

(def ParameterName primitives/ParameterName)

(def ParameterPredicate
  [:map {:closed true} [:empty {:optional true} boolean?]
   [:param [:ref #'ParameterName]]])

(def FieldOneOfPredicate
  [:map {:closed true} [:field [:ref #'FieldName]]
   [:oneOf
    [:or [:vector string?] [:vector number?] [:vector boolean?]
     [:vector [:ref #'DateTime]]]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]])

(def Predicate
  [:or [:ref #'FieldEqualPredicate] [:ref #'FieldRangePredicate]
   [:ref #'FieldOneOfPredicate] [:ref #'FieldLTPredicate]
   [:ref #'FieldGTPredicate] [:ref #'FieldLTEPredicate]
   [:ref #'FieldGTEPredicate] [:ref #'FieldValidPredicate]
   [:ref #'ParameterPredicate] string?])

(def LogicalAnd_Predicate_
  [:map {:closed true, :json-schema/original-name "LogicalAnd<Predicate>"}
   [:and [:vector [:ref #'PredicateComposition]]]])

(def PredicateComposition
  [:or
   [:ref {:json-schema/original-name "LogicalNot<Predicate>"}
    #'LogicalNot_Predicate_]
   [:ref {:json-schema/original-name "LogicalAnd<Predicate>"}
    #'LogicalAnd_Predicate_]
   [:ref {:json-schema/original-name "LogicalOr<Predicate>"}
    #'LogicalOr_Predicate_] [:ref #'Predicate]])

(def ConditionalPredicate__ValueDef__Color_null___ExprRef__
  [:or
   {:json-schema/original-name
      "ConditionalPredicate<(ValueDef<(Color|null)>|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or [:ref #'Color] nil?]]]
   [:map {:closed true} [:expr string?] [:test [:ref #'PredicateComposition]]]])

(def ConditionalAxisProperty__Color_null__
  [:or {:json-schema/original-name "ConditionalAxisProperty<(Color|null)>"}
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(Color|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(Color|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]]]]
    [:value [:or [:ref #'Color] nil?]]]
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(Color|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(Color|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]]]]
    [:expr string?]]])

(def ConditionalAxisColor
  [:ref {:json-schema/original-name "ConditionalAxisProperty<(Color|null)>"}
   #'ConditionalAxisProperty__Color_null__])

(def TimeInterval primitives/TimeInterval)

(def TimeIntervalStep
  [:map {:closed true} [:interval [:ref #'TimeInterval]] [:step number?]])

(def ConditionalPredicate__ValueDef__Align_null___ExprRef__
  [:or
   {:json-schema/original-name
      "ConditionalPredicate<(ValueDef<(Align|null)>|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or [:ref #'Align] nil?]]]
   [:map {:closed true} [:expr string?] [:test [:ref #'PredicateComposition]]]])

(def ConditionalAxisProperty__Align_null__
  [:or {:json-schema/original-name "ConditionalAxisProperty<(Align|null)>"}
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(Align|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(Align|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]]]]
    [:value [:or [:ref #'Align] nil?]]]
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(Align|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(Align|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]]]]
    [:expr string?]]])

(def ConditionalAxisLabelAlign
  [:ref {:json-schema/original-name "ConditionalAxisProperty<(Align|null)>"}
   #'ConditionalAxisProperty__Align_null__])

(def ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__
  [:or
   {:json-schema/original-name
      "ConditionalPredicate<(ValueDef<(TextBaseline|null)>|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or [:ref #'TextBaseline] nil?]]]
   [:map {:closed true} [:expr string?] [:test [:ref #'PredicateComposition]]]])

(def ConditionalAxisProperty__TextBaseline_null__
  [:or
   {:json-schema/original-name "ConditionalAxisProperty<(TextBaseline|null)>"}
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(TextBaseline|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(TextBaseline|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]]]]
    [:value [:or [:ref #'TextBaseline] nil?]]]
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(TextBaseline|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(TextBaseline|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]]]]
    [:expr string?]]])

(def ConditionalAxisLabelBaseline
  [:ref
   {:json-schema/original-name "ConditionalAxisProperty<(TextBaseline|null)>"}
   #'ConditionalAxisProperty__TextBaseline_null__])

(def TitleAnchor primitives/TitleAnchor)

(def ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__
  [:or
   {:json-schema/original-name
      "ConditionalPredicate<(ValueDef<(FontStyle|null)>|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or [:ref #'FontStyle] nil?]]]
   [:map {:closed true} [:expr string?] [:test [:ref #'PredicateComposition]]]])

(def ConditionalAxisProperty__FontStyle_null__
  [:or {:json-schema/original-name "ConditionalAxisProperty<(FontStyle|null)>"}
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(FontStyle|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(FontStyle|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]]]]
    [:value [:or [:ref #'FontStyle] nil?]]]
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(FontStyle|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(FontStyle|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]]]]
    [:expr string?]]])

(def ConditionalAxisLabelFontStyle
  [:ref {:json-schema/original-name "ConditionalAxisProperty<(FontStyle|null)>"}
   #'ConditionalAxisProperty__FontStyle_null__])

(def LabelOverlap primitives/LabelOverlap)

(def ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__
  [:or
   {:json-schema/original-name
      "ConditionalPredicate<(ValueDef<(FontWeight|null)>|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or [:ref #'FontWeight] nil?]]]
   [:map {:closed true} [:expr string?] [:test [:ref #'PredicateComposition]]]])

(def ConditionalAxisProperty__FontWeight_null__
  [:or {:json-schema/original-name "ConditionalAxisProperty<(FontWeight|null)>"}
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(FontWeight|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(FontWeight|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]]]]
    [:value [:or [:ref #'FontWeight] nil?]]]
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(FontWeight|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(FontWeight|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]]]]
    [:expr string?]]])

(def ConditionalAxisLabelFontWeight
  [:ref
   {:json-schema/original-name "ConditionalAxisProperty<(FontWeight|null)>"}
   #'ConditionalAxisProperty__FontWeight_null__])

(def AxisOrient primitives/AxisOrient)

(def Dict primitives/Dict)

(def TimeFormatSpecifier primitives/TimeFormatSpecifier)

(def Format [:or string? [:ref #'TimeFormatSpecifier] [:ref #'Dict]])

(def ConditionalPredicate__ValueDef__number_null___ExprRef__
  [:or
   {:json-schema/original-name
      "ConditionalPredicate<(ValueDef<(number|null)>|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or number? nil?]]]
   [:map {:closed true} [:expr string?] [:test [:ref #'PredicateComposition]]]])

(def ConditionalAxisProperty__number_null__
  [:or {:json-schema/original-name "ConditionalAxisProperty<(number|null)>"}
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(number|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__number_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(number|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__number_null___ExprRef__]]]]
    [:value [:or number? nil?]]]
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(number|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__number_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(number|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__number_null___ExprRef__]]]]
    [:expr string?]]])

(def ConditionalAxisNumber
  [:ref {:json-schema/original-name "ConditionalAxisProperty<(number|null)>"}
   #'ConditionalAxisProperty__number_null__])

(def ConditionalPredicate__ValueDef__number___null___ExprRef__
  [:or
   {:json-schema/original-name
      "ConditionalPredicate<(ValueDef<(number[]|null)>|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or [:vector number?] nil?]]]
   [:map {:closed true} [:expr string?] [:test [:ref #'PredicateComposition]]]])

(def ConditionalAxisProperty__number___null__
  [:or {:json-schema/original-name "ConditionalAxisProperty<(number[]|null)>"}
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(number[]|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__number___null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(number[]|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__number___null___ExprRef__]]]]
    [:value [:or [:vector number?] nil?]]]
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(number[]|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__number___null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(number[]|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__number___null___ExprRef__]]]]
    [:expr string?]]])

(def ConditionalAxisNumberArray
  [:ref {:json-schema/original-name "ConditionalAxisProperty<(number[]|null)>"}
   #'ConditionalAxisProperty__number___null__])

(def ConditionalPredicate__ValueDef__string_null___ExprRef__
  [:or
   {:json-schema/original-name
      "ConditionalPredicate<(ValueDef<(string|null)>|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or string? nil?]]]
   [:map {:closed true} [:expr string?] [:test [:ref #'PredicateComposition]]]])

(def ConditionalAxisProperty__string_null__
  [:or {:json-schema/original-name "ConditionalAxisProperty<(string|null)>"}
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(string|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__string_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(string|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__string_null___ExprRef__]]]]
    [:value [:or string? nil?]]]
   [:map {:closed true}
    [:condition
     [:or
      [:ref
       {:json-schema/original-name
          "ConditionalPredicate<(ValueDef<(string|null)>|ExprRef)>"}
       #'ConditionalPredicate__ValueDef__string_null___ExprRef__]
      [:vector
       [:ref
        {:json-schema/original-name
           "ConditionalPredicate<(ValueDef<(string|null)>|ExprRef)>"}
        #'ConditionalPredicate__ValueDef__string_null___ExprRef__]]]]
    [:expr string?]]])

(def ConditionalAxisString
  [:ref {:json-schema/original-name "ConditionalAxisProperty<(string|null)>"}
   #'ConditionalAxisProperty__string_null__])

(def Axis
  [:map {:closed true}
   [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:gridDash {:optional true}
    [:or [:vector number?] [:ref #'ExprRef]
     [:ref #'ConditionalAxisNumberArray]]]
   [:domainOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labels {:optional true} boolean?]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:format {:optional true} [:ref #'Format]]
   [:labelFlushOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]
     [:ref #'ConditionalAxisLabelBaseline]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:tickBand {:optional true} [:or [:ref #'ExprRef] [:enum "center" "extent"]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gridOpacity {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelOverlap {:optional true} [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:domainDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:tickWidth {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:labelOpacity {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:domainColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:grid {:optional true} boolean?]
   [:labelPadding {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:labelLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:tickExtra {:optional true} boolean?]
   [:titleX {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickOpacity {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:tickDashOffset {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:tickCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:labelFlush {:optional true} [:or boolean? number?]]
   [:titleAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOffset {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:tickRound {:optional true} boolean?]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:or [:ref #'AxisOrient] [:ref #'ExprRef]]]
   [:tickMinStep {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickDash {:optional true}
    [:or [:vector number?] [:ref #'ExprRef]
     [:ref #'ConditionalAxisNumberArray]]]
   [:titleAnchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:labelColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]
     [:ref #'ConditionalAxisColor]]]
   [:domainCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:style {:optional true} [:or string? [:vector string?]]]
   [:labelAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleY {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelExpr {:optional true} string?]
   [:minExtent {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickCount {:optional true}
    [:or number? [:ref #'TimeInterval] [:ref #'TimeIntervalStep]
     [:ref #'ExprRef]]] [:formatType {:optional true} string?]
   [:titleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:tickSize {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:gridDashOffset {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:gridWidth {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:values {:optional true}
    [:or [:vector number?] [:vector string?] [:vector boolean?]
     [:vector [:ref #'DateTime]] [:ref #'ExprRef]]]
   [:labelFont {:optional true}
    [:or string? [:ref #'ExprRef] [:ref #'ConditionalAxisString]]]
   [:maxExtent {:optional true} [:or number? [:ref #'ExprRef]]]
   [:bandPosition {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gridCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:translate {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ticks {:optional true} boolean?]
   [:position {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelAlign {:optional true}
    [:or [:ref #'Align] [:ref #'ExprRef] [:ref #'ConditionalAxisLabelAlign]]]
   [:domain {:optional true} boolean?]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]
     [:ref #'ConditionalAxisLabelFontWeight]]]
   [:labelBound {:optional true} [:or [:or number? boolean?] [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true}
    [:or [:ref #'FontStyle] [:ref #'ExprRef]
     [:ref #'ConditionalAxisLabelFontStyle]]]
   [:labelFontSize {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:zindex {:optional true} number?]
   [:gridColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]
     [:ref #'ConditionalAxisColor]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:domainDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]
     [:ref #'ConditionalAxisColor]]]
   [:domainWidth {:optional true} [:or number? [:ref #'ExprRef]]]])

(def AxisConfig
  [:map {:closed true}
   [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:disable {:optional true} boolean?]
   [:gridDash {:optional true}
    [:or [:vector number?] [:ref #'ExprRef]
     [:ref #'ConditionalAxisNumberArray]]]
   [:domainOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labels {:optional true} boolean?]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:format {:optional true} [:ref #'Format]]
   [:labelFlushOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]
     [:ref #'ConditionalAxisLabelBaseline]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:tickBand {:optional true} [:or [:ref #'ExprRef] [:enum "center" "extent"]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gridOpacity {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelOverlap {:optional true} [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:domainDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:tickWidth {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:labelOpacity {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:domainColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:grid {:optional true} boolean?]
   [:labelPadding {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:labelLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:tickExtra {:optional true} boolean?]
   [:titleX {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickOpacity {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:tickDashOffset {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:tickCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:labelFlush {:optional true} [:or boolean? number?]]
   [:titleAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOffset {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:tickRound {:optional true} boolean?]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:or [:ref #'AxisOrient] [:ref #'ExprRef]]]
   [:tickMinStep {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickDash {:optional true}
    [:or [:vector number?] [:ref #'ExprRef]
     [:ref #'ConditionalAxisNumberArray]]]
   [:titleAnchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:labelColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]
     [:ref #'ConditionalAxisColor]]]
   [:domainCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:style {:optional true} [:or string? [:vector string?]]]
   [:labelAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleY {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelExpr {:optional true} string?]
   [:minExtent {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickCount {:optional true}
    [:or number? [:ref #'TimeInterval] [:ref #'TimeIntervalStep]
     [:ref #'ExprRef]]] [:formatType {:optional true} string?]
   [:titleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:tickSize {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:gridDashOffset {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:gridWidth {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:values {:optional true}
    [:or [:vector number?] [:vector string?] [:vector boolean?]
     [:vector [:ref #'DateTime]] [:ref #'ExprRef]]]
   [:labelFont {:optional true}
    [:or string? [:ref #'ExprRef] [:ref #'ConditionalAxisString]]]
   [:maxExtent {:optional true} [:or number? [:ref #'ExprRef]]]
   [:bandPosition {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gridCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:translate {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ticks {:optional true} boolean?]
   [:position {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelAlign {:optional true}
    [:or [:ref #'Align] [:ref #'ExprRef] [:ref #'ConditionalAxisLabelAlign]]]
   [:domain {:optional true} boolean?]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]
     [:ref #'ConditionalAxisLabelFontWeight]]]
   [:labelBound {:optional true} [:or [:or number? boolean?] [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true}
    [:or [:ref #'FontStyle] [:ref #'ExprRef]
     [:ref #'ConditionalAxisLabelFontStyle]]]
   [:labelFontSize {:optional true}
    [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
   [:zindex {:optional true} number?]
   [:gridColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]
     [:ref #'ConditionalAxisColor]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:domainDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]
     [:ref #'ConditionalAxisColor]]]
   [:domainWidth {:optional true} [:or number? [:ref #'ExprRef]]]])

(def ResolveMode primitives/ResolveMode)

(def AxisResolveMap
  [:map {:closed true} [:x {:optional true} [:ref #'ResolveMode]]
   [:y {:optional true} [:ref #'ResolveMode]]])

(def BBox primitives/BBox)

(def TitleFrame primitives/TitleFrame)

(def TitleOrient primitives/TitleOrient)

(def BaseTitleNoValueRefs
  [:map {:closed true} [:baseline {:optional true} [:ref #'TextBaseline]]
   [:align {:optional true} [:ref #'Align]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:frame {:optional true}
    [:or [:or [:ref #'TitleFrame] string?] [:ref #'ExprRef]]]
   [:color {:optional true} [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:subtitleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:subtitleFontStyle {:optional true}
    [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:or [:ref #'TitleOrient] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:subtitleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:subtitleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:subtitlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:anchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:subtitleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:zindex {:optional true} [:or number? [:ref #'ExprRef]]]
   [:subtitleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]])

(def SingleDefUnitChannel primitives/SingleDefUnitChannel)

(def ParameterExtent
  [:or
   [:map {:closed true} [:field {:optional true} [:ref #'FieldName]]
    [:param [:ref #'ParameterName]]]
   [:map {:closed true}
    [:encoding {:optional true} [:ref #'SingleDefUnitChannel]]
    [:param [:ref #'ParameterName]]]])

(def BinExtent [:or [:vector number?] [:ref #'ParameterExtent]])

(def BinParams
  [:map {:closed true} [:maxbins {:optional true} number?]
   [:divide {:optional true} [:vector number?]]
   [:steps {:optional true} [:vector number?]]
   [:minstep {:optional true} number?]
   [:extent {:optional true} [:ref #'BinExtent]]
   [:binned {:optional true} boolean?] [:nice {:optional true} boolean?]
   [:anchor {:optional true} number?] [:base {:optional true} number?]
   [:step {:optional true} number?]])

(def BinTransform
  [:map {:closed true}
   [:as [:or [:ref #'FieldName] [:vector [:ref #'FieldName]]]]
   [:bin [:or [:ref #'BinParams] [:enum true]]] [:field [:ref #'FieldName]]])

(def Element primitives/Element)

(def BindCheckbox
  [:map {:closed true} [:debounce {:optional true} number?]
   [:element {:optional true} [:ref #'Element]] [:input [:= "checkbox"]]
   [:name {:optional true} string?]])

(def BindDirect
  [:map {:closed true} [:debounce {:optional true} number?]
   [:element [:or [:ref #'Element] [:map {:closed true}]]]
   [:event {:optional true} string?]])

(def BindInput
  [:map {:closed true} [:autocomplete {:optional true} string?]
   [:debounce {:optional true} number?]
   [:element {:optional true} [:ref #'Element]]
   [:input {:optional true} string?] [:name {:optional true} string?]
   [:placeholder {:optional true} string?]])

(def BindRadioSelect
  [:map {:closed true} [:debounce {:optional true} number?]
   [:element {:optional true} [:ref #'Element]]
   [:input [:enum "radio" "select"]]
   [:labels {:optional true} [:vector string?]] [:name {:optional true} string?]
   [:options [:vector any?]]])

(def BindRange
  [:map {:closed true} [:debounce {:optional true} number?]
   [:element {:optional true} [:ref #'Element]] [:input [:= "range"]]
   [:max {:optional true} number?] [:min {:optional true} number?]
   [:name {:optional true} string?] [:step {:optional true} number?]])

(def Binding
  [:or [:ref #'BindCheckbox] [:ref #'BindRadioSelect] [:ref #'BindRange]
   [:ref #'BindInput] [:ref #'BindDirect]])

(def BoxPlotConfig
  [:map {:closed true}
   [:box {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:extent {:optional true} [:or number? [:enum "min-max"]]]
   [:median {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:outliers {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:rule {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:size {:optional true} number?]
   [:ticks {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]])

(def BrushConfig
  [:map {:closed true} [:cursor {:optional true} [:ref #'Cursor]]
   [:fill {:optional true} [:ref #'Color]]
   [:fillOpacity {:optional true} number?]
   [:stroke {:optional true} [:ref #'Color]]
   [:strokeDash {:optional true} [:vector number?]]
   [:strokeDashOffset {:optional true} number?]
   [:strokeOpacity {:optional true} number?]
   [:strokeWidth {:optional true} number?]])

(def CalculateTransform
  [:map {:closed true} [:as [:ref #'FieldName]] [:calculate string?]])

(def Categorical primitives/Categorical)

(def StandardType primitives/StandardType)

(def ConditionalPredicate_ValueDef__Gradient_string_null_ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name
      "ConditionalPredicate<ValueDef<(Gradient|string|null|ExprRef)>>"}
   [:test [:ref #'PredicateComposition]]
   [:value [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]])

(def ConditionalParameter_ValueDef__Gradient_string_null_ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name
      "ConditionalParameter<ValueDef<(Gradient|string|null|ExprRef)>>"}
   [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
   [:value [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]])

(def ConditionalValueDef__Gradient_string_null_ExprRef__
  [:or
   {:json-schema/original-name
      "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
   [:ref
    {:json-schema/original-name
       "ConditionalPredicate<ValueDef<(Gradient|string|null|ExprRef)>>"}
    #'ConditionalPredicate_ValueDef__Gradient_string_null_ExprRef___]
   [:ref
    {:json-schema/original-name
       "ConditionalParameter<ValueDef<(Gradient|string|null|ExprRef)>>"}
    #'ConditionalParameter_ValueDef__Gradient_string_null_ExprRef___]])

(def RepeatRef primitives/RepeatRef)

(def Field [:or [:ref #'FieldName] [:ref #'RepeatRef]])

(def ScaleInterpolateParams primitives/ScaleInterpolateParams)

(def Cyclical primitives/Cyclical)

(def SequentialMultiHue primitives/SequentialMultiHue)

(def Diverging primitives/Diverging)

(def SequentialSingleHue primitives/SequentialSingleHue)

(def ColorScheme
  [:or [:ref #'Categorical] [:ref #'SequentialSingleHue]
   [:ref #'SequentialMultiHue] [:ref #'Diverging] [:ref #'Cyclical]])

(def SchemeParams
  [:map {:closed true} [:count {:optional true} number?]
   [:extent {:optional true} [:vector number?]] [:name [:ref #'ColorScheme]]])

(def DomainUnionWith
  [:map {:closed true}
   [:unionWith [:vector [:or number? string? boolean? [:ref #'DateTime]]]]])

(def RangeEnum primitives/RangeEnum)

(def ScaleBinParams primitives/ScaleBinParams)

(def ScaleBins [:or [:vector number?] [:ref #'ScaleBinParams]])

(def ScaleInterpolateEnum primitives/ScaleInterpolateEnum)

(def FieldRange primitives/FieldRange)

(def ScaleType primitives/ScaleType)

(def Scale
  [:map {:closed true} [:zero {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:exponent {:optional true} [:or number? [:ref #'ExprRef]]]
   [:paddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:align {:optional true} [:or number? [:ref #'ExprRef]]]
   [:domainRaw {:optional true} [:ref #'ExprRef]]
   [:constant {:optional true} [:or number? [:ref #'ExprRef]]]
   [:bins {:optional true} [:ref #'ScaleBins]]
   [:paddingOuter {:optional true} [:or number? [:ref #'ExprRef]]]
   [:type {:optional true} [:ref #'ScaleType]]
   [:interpolate {:optional true}
    [:or [:ref #'ScaleInterpolateEnum] [:ref #'ExprRef]
     [:ref #'ScaleInterpolateParams]]]
   [:domainMax {:optional true}
    [:or number? [:ref #'DateTime] [:ref #'ExprRef]]]
   [:round {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:rangeMax {:optional true} [:or number? string? [:ref #'ExprRef]]]
   [:rangeMin {:optional true} [:or number? string? [:ref #'ExprRef]]]
   [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:nice {:optional true}
    [:or boolean? number? [:ref #'TimeInterval] [:ref #'TimeIntervalStep]
     [:ref #'ExprRef]]]
   [:domainMin {:optional true}
    [:or number? [:ref #'DateTime] [:ref #'ExprRef]]]
   [:domain {:optional true}
    [:or
     [:vector
      [:or nil? string? number? boolean? [:ref #'DateTime] [:ref #'ExprRef]]]
     [:ref #'ParameterExtent] [:ref #'DomainUnionWith] [:ref #'ExprRef]
     [:enum "unaggregated"]]]
   [:base {:optional true} [:or number? [:ref #'ExprRef]]]
   [:clamp {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:scheme {:optional true}
    [:or [:ref #'ColorScheme] [:ref #'SchemeParams] [:ref #'ExprRef]]]
   [:reverse {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:range {:optional true}
    [:or [:ref #'RangeEnum] [:ref #'FieldRange]
     [:vector [:or number? string? [:vector number?] [:ref #'ExprRef]]]]]
   [:domainMid {:optional true} [:or number? [:ref #'ExprRef]]]])

(def EncodingSortField
  [:map {:closed true} [:field {:optional true} [:ref #'Field]]
   [:op {:optional true} [:ref #'NonArgAggregateOp]]
   [:order {:optional true} [:or [:ref #'SortOrder] nil?]]])

(def SortArray
  [:or [:vector number?] [:vector string?] [:vector boolean?]
   [:vector [:ref #'DateTime]]])

(def SortByEncoding
  [:map {:closed true} [:encoding [:ref #'SortByChannel]]
   [:order {:optional true} [:or [:ref #'SortOrder] nil?]]])

(def Sort
  [:or [:ref #'SortArray] [:ref #'AllSortString] [:ref #'EncodingSortField]
   [:ref #'SortByEncoding] nil?])

(def LayoutAlign primitives/LayoutAlign)

(def TickCount [:or number? [:ref #'TimeInterval] [:ref #'TimeIntervalStep]])

(def Orient primitives/Orient)

(def LegendOrient primitives/LegendOrient)

(def Legend
  [:map {:closed true}
   [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:gridAlign {:optional true} [:or [:ref #'LayoutAlign] [:ref #'ExprRef]]]
   [:symbolSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:format {:optional true} [:ref #'Format]]
   [:gradientOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelOverlap {:optional true} [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
   [:gradientStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientThickness {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columns {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columnPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:clipHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:symbolDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:type {:optional true} [:enum "symbol" "gradient"]]
   [:labelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'LegendOrient]]
   [:tickMinStep {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAnchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:gradientStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:labelColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:symbolFillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:labelExpr {:optional true} string?]
   [:titleOrient {:optional true} [:or [:ref #'Orient] [:ref #'ExprRef]]]
   [:tickCount {:optional true} [:or [:ref #'TickCount] [:ref #'ExprRef]]]
   [:formatType {:optional true} string?]
   [:titleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legendX {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:symbolOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:values {:optional true}
    [:or [:vector number?] [:vector string?] [:vector boolean?]
     [:vector [:ref #'DateTime]] [:ref #'ExprRef]]]
   [:gradientLength {:optional true} [:or number? [:ref #'ExprRef]]]
   [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:strokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:rowPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:symbolType {:optional true} [:or [:ref #'SymbolShape] [:ref #'ExprRef]]]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:zindex {:optional true} number?]
   [:direction {:optional true} [:ref #'Orientation]]
   [:symbolStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:legendY {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolLimit {:optional true} [:or number? [:ref #'ExprRef]]]])

(def FieldOrDatumDefWithCondition_MarkPropFieldDef__Gradient_string_null__
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<MarkPropFieldDef,(Gradient|string|null)>"}
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition {:optional true}
    [:or
     [:ref
      {:json-schema/original-name
         "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
      #'ConditionalValueDef__Gradient_string_null_ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name
          "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
       #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]])

(def Type primitives/Type)

(def PrimitiveValue primitives/PrimitiveValue)

(def ConditionalParameter_MarkPropFieldOrDatumDef_
  [:or
   {:json-schema/original-name "ConditionalParameter<MarkPropFieldOrDatumDef>"}
   [:map {:closed true} [:scale {:optional true} [:or [:ref #'Scale] nil?]]
    [:legend {:optional true} [:or [:ref #'Legend] nil?]]
    [:field {:optional true} [:ref #'Field]]
    [:type {:optional true} [:ref #'StandardType]]
    [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
    [:title {:optional true} [:or [:ref #'Text] nil?]]
    [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
    [:bandPosition {:optional true} number?]
    [:timeUnit {:optional true}
     [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
    [:aggregate {:optional true} [:ref #'Aggregate]]
    [:sort {:optional true} [:ref #'Sort]]]
   [:map {:closed true} [:bandPosition {:optional true} number?]
    [:datum {:optional true}
     [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
      [:ref #'RepeatRef]]] [:empty {:optional true} boolean?]
    [:legend {:optional true} [:or [:ref #'Legend] nil?]]
    [:param [:ref #'ParameterName]]
    [:scale {:optional true} [:or [:ref #'Scale] nil?]]
    [:title {:optional true} [:or [:ref #'Text] nil?]]
    [:type {:optional true} [:ref #'Type]]]])

(def ConditionalPredicate_MarkPropFieldOrDatumDef_
  [:or
   {:json-schema/original-name "ConditionalPredicate<MarkPropFieldOrDatumDef>"}
   [:map {:closed true} [:scale {:optional true} [:or [:ref #'Scale] nil?]]
    [:legend {:optional true} [:or [:ref #'Legend] nil?]]
    [:field {:optional true} [:ref #'Field]]
    [:type {:optional true} [:ref #'StandardType]]
    [:title {:optional true} [:or [:ref #'Text] nil?]]
    [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
    [:bandPosition {:optional true} number?]
    [:timeUnit {:optional true}
     [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
    [:aggregate {:optional true} [:ref #'Aggregate]]
    [:test [:ref #'PredicateComposition]]
    [:sort {:optional true} [:ref #'Sort]]]
   [:map {:closed true} [:bandPosition {:optional true} number?]
    [:datum {:optional true}
     [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
      [:ref #'RepeatRef]]] [:legend {:optional true} [:or [:ref #'Legend] nil?]]
    [:scale {:optional true} [:or [:ref #'Scale] nil?]]
    [:test [:ref #'PredicateComposition]]
    [:title {:optional true} [:or [:ref #'Text] nil?]]
    [:type {:optional true} [:ref #'Type]]]])

(def ConditionalMarkPropFieldOrDatumDef
  [:or
   [:ref
    {:json-schema/original-name "ConditionalPredicate<MarkPropFieldOrDatumDef>"}
    #'ConditionalPredicate_MarkPropFieldOrDatumDef_]
   [:ref
    {:json-schema/original-name "ConditionalParameter<MarkPropFieldOrDatumDef>"}
    #'ConditionalParameter_MarkPropFieldOrDatumDef_]])

(def ValueDefWithCondition_MarkPropFieldOrDatumDef__Gradient_string_null__
  [:map
   {:closed true,
    :json-schema/original-name
      "ValueDefWithCondition<MarkPropFieldOrDatumDef,(Gradient|string|null)>"}
   [:condition {:optional true}
    [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
     [:ref
      {:json-schema/original-name
         "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
      #'ConditionalValueDef__Gradient_string_null_ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name
          "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
       #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]
   [:value {:optional true}
    [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]])

(def FieldOrDatumDefWithCondition_DatumDef__Gradient_string_null__
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<DatumDef,(Gradient|string|null)>"}
   [:bandPosition {:optional true} number?]
   [:condition {:optional true}
    [:or
     [:ref
      {:json-schema/original-name
         "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
      #'ConditionalValueDef__Gradient_string_null_ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name
          "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
       #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]] [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def MarkPropDef__Gradient_string_null__
  [:or {:json-schema/original-name "MarkPropDef<(Gradient|string|null)>"}
   [:ref
    {:json-schema/original-name
       "FieldOrDatumDefWithCondition<MarkPropFieldDef,(Gradient|string|null)>"}
    #'FieldOrDatumDefWithCondition_MarkPropFieldDef__Gradient_string_null__]
   [:ref
    {:json-schema/original-name
       "FieldOrDatumDefWithCondition<DatumDef,(Gradient|string|null)>"}
    #'FieldOrDatumDefWithCondition_DatumDef__Gradient_string_null__]
   [:ref
    {:json-schema/original-name
       "ValueDefWithCondition<MarkPropFieldOrDatumDef,(Gradient|string|null)>"}
    #'ValueDefWithCondition_MarkPropFieldOrDatumDef__Gradient_string_null__]])

(def ColorDef
  [:ref {:json-schema/original-name "MarkPropDef<(Gradient|string|null)>"}
   #'MarkPropDef__Gradient_string_null__])

(def CompositionConfig primitives/CompositionConfig)

(def RowCol_number_ primitives/RowCol_number_)

(def InlineDataset primitives/InlineDataset)

(def Parse primitives/Parse)

(def CsvDataFormat
  [:map {:closed true} [:parse {:optional true} [:or [:ref #'Parse] nil?]]
   [:type {:optional true} [:enum "csv" "tsv"]]])

(def JsonDataFormat
  [:map {:closed true} [:parse {:optional true} [:or [:ref #'Parse] nil?]]
   [:property {:optional true} string?] [:type {:optional true} [:= "json"]]])

(def TopoDataFormat
  [:map {:closed true} [:feature {:optional true} string?]
   [:mesh {:optional true} string?]
   [:parse {:optional true} [:or [:ref #'Parse] nil?]]
   [:type {:optional true} [:= "topojson"]]])

(def DsvDataFormat
  [:map {:closed true} [:delimiter string?]
   [:parse {:optional true} [:or [:ref #'Parse] nil?]]
   [:type {:optional true} [:= "dsv"]]])

(def DataFormat
  [:or [:ref #'CsvDataFormat] [:ref #'DsvDataFormat] [:ref #'JsonDataFormat]
   [:ref #'TopoDataFormat]])

(def InlineData
  [:map {:closed true} [:format {:optional true} [:ref #'DataFormat]]
   [:name {:optional true} string?] [:values [:ref #'InlineDataset]]])

(def NamedData
  [:map {:closed true} [:format {:optional true} [:ref #'DataFormat]]
   [:name string?]])

(def UrlData
  [:map {:closed true} [:format {:optional true} [:ref #'DataFormat]]
   [:name {:optional true} string?] [:url string?]])

(def DataSource [:or [:ref #'UrlData] [:ref #'InlineData] [:ref #'NamedData]])

(def Vector2_number_ primitives/Vector2_number_)

(def Vector2_Vector2_number__
  [:vector {:json-schema/original-name "Vector2<Vector2<number>>"}
   [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]])

(def GraticuleParams
  [:map {:closed true}
   [:extent {:optional true}
    [:ref {:json-schema/original-name "Vector2<Vector2<number>>"}
     #'Vector2_Vector2_number__]]
   [:extentMajor {:optional true}
    [:ref {:json-schema/original-name "Vector2<Vector2<number>>"}
     #'Vector2_Vector2_number__]]
   [:extentMinor {:optional true}
    [:ref {:json-schema/original-name "Vector2<Vector2<number>>"}
     #'Vector2_Vector2_number__]] [:precision {:optional true} number?]
   [:step {:optional true}
    [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]]
   [:stepMajor {:optional true}
    [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]]
   [:stepMinor {:optional true}
    [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]]])

(def GraticuleGenerator
  [:map {:closed true} [:graticule [:or [:ref #'GraticuleParams] [:enum true]]]
   [:name {:optional true} string?]])

(def SequenceParams
  [:map {:closed true} [:as {:optional true} [:ref #'FieldName]]
   [:start number?] [:step {:optional true} number?] [:stop number?]])

(def SequenceGenerator
  [:map {:closed true} [:name {:optional true} string?]
   [:sequence [:ref #'SequenceParams]]])

(def SphereGenerator primitives/SphereGenerator)

(def Generator
  [:or [:ref #'SequenceGenerator] [:ref #'SphereGenerator]
   [:ref #'GraticuleGenerator]])

(def Data [:or [:ref #'DataSource] [:ref #'Generator]])

(def PivotTransform
  [:map {:closed true} [:groupby {:optional true} [:vector [:ref #'FieldName]]]
   [:limit {:optional true} number?] [:op {:optional true} [:ref #'AggregateOp]]
   [:pivot [:ref #'FieldName]] [:value [:ref #'FieldName]]])

(def DensityTransform
  [:map {:closed true} [:maxsteps {:optional true} number?]
   [:cumulative {:optional true} boolean?] [:counts {:optional true} boolean?]
   [:as {:optional true} [:vector [:ref #'FieldName]]]
   [:steps {:optional true} number?] [:bandwidth {:optional true} number?]
   [:minsteps {:optional true} number?]
   [:groupby {:optional true} [:vector [:ref #'FieldName]]]
   [:extent {:optional true} [:vector number?]]
   [:resolve {:optional true} [:enum "independent" "shared"]]
   [:density [:ref #'FieldName]]])

(def FoldTransform
  [:map {:closed true} [:as {:optional true} [:vector [:ref #'FieldName]]]
   [:fold [:vector [:ref #'FieldName]]]])

(def SortField
  [:map {:closed true} [:field [:ref #'FieldName]]
   [:order {:optional true} [:or [:ref #'SortOrder] nil?]]])

(def WindowOnlyOp primitives/WindowOnlyOp)

(def WindowFieldDef
  [:map {:closed true} [:as [:ref #'FieldName]]
   [:field {:optional true} [:ref #'FieldName]]
   [:op [:or [:ref #'AggregateOp] [:ref #'WindowOnlyOp]]]
   [:param {:optional true} number?]])

(def WindowTransform
  [:map {:closed true} [:frame {:optional true} [:vector [:or nil? number?]]]
   [:groupby {:optional true} [:vector [:ref #'FieldName]]]
   [:ignorePeers {:optional true} boolean?]
   [:sort {:optional true} [:vector [:ref #'SortField]]]
   [:window [:vector [:ref #'WindowFieldDef]]]])

(def FilterTransform
  [:map {:closed true} [:filter [:ref #'PredicateComposition]]])

(def ExtentTransform
  [:map {:closed true} [:extent [:ref #'FieldName]]
   [:param [:ref #'ParameterName]]])

(def FlattenTransform
  [:map {:closed true} [:as {:optional true} [:vector [:ref #'FieldName]]]
   [:flatten [:vector [:ref #'FieldName]]]])

(def JoinAggregateFieldDef
  [:map {:closed true} [:as [:ref #'FieldName]]
   [:field {:optional true} [:ref #'FieldName]] [:op [:ref #'AggregateOp]]])

(def JoinAggregateTransform
  [:map {:closed true} [:groupby {:optional true} [:vector [:ref #'FieldName]]]
   [:joinaggregate [:vector [:ref #'JoinAggregateFieldDef]]]])

(def LookupData
  [:map {:closed true} [:data [:ref #'Data]]
   [:fields {:optional true} [:vector [:ref #'FieldName]]]
   [:key [:ref #'FieldName]]])

(def LookupSelection
  [:map {:closed true} [:fields {:optional true} [:vector [:ref #'FieldName]]]
   [:key [:ref #'FieldName]] [:param [:ref #'ParameterName]]])

(def LookupTransform
  [:map {:closed true}
   [:as {:optional true} [:or [:ref #'FieldName] [:vector [:ref #'FieldName]]]]
   [:default {:optional true} any?]
   [:from [:or [:ref #'LookupData] [:ref #'LookupSelection]]]
   [:lookup string?]])

(def LoessTransform
  [:map {:closed true} [:as {:optional true} [:vector [:ref #'FieldName]]]
   [:bandwidth {:optional true} number?]
   [:groupby {:optional true} [:vector [:ref #'FieldName]]]
   [:loess [:ref #'FieldName]] [:on [:ref #'FieldName]]])

(def StackTransform
  [:map {:closed true}
   [:as [:or [:ref #'FieldName] [:vector [:ref #'FieldName]]]]
   [:groupby [:vector [:ref #'FieldName]]]
   [:offset {:optional true} [:enum "zero" "center" "normalize"]]
   [:sort {:optional true} [:vector [:ref #'SortField]]]
   [:stack [:ref #'FieldName]]])

(def QuantileTransform
  [:map {:closed true} [:as {:optional true} [:vector [:ref #'FieldName]]]
   [:groupby {:optional true} [:vector [:ref #'FieldName]]]
   [:probs {:optional true} [:vector number?]] [:quantile [:ref #'FieldName]]
   [:step {:optional true} number?]])

(def TimeUnitTransformParams
  [:map {:closed true} [:maxbins {:optional true} number?]
   [:step {:optional true} number?] [:unit {:optional true} [:ref #'TimeUnit]]
   [:utc {:optional true} boolean?]])

(def TimeUnitTransform
  [:map {:closed true} [:as [:ref #'FieldName]] [:field [:ref #'FieldName]]
   [:timeUnit [:or [:ref #'TimeUnit] [:ref #'TimeUnitTransformParams]]]])

(def SampleTransform primitives/SampleTransform)

(def RegressionTransform
  [:map {:closed true} [:as {:optional true} [:vector [:ref #'FieldName]]]
   [:extent {:optional true} [:vector number?]]
   [:groupby {:optional true} [:vector [:ref #'FieldName]]]
   [:method {:optional true} [:enum "linear" "log" "exp" "pow" "quad" "poly"]]
   [:on [:ref #'FieldName]] [:order {:optional true} number?]
   [:params {:optional true} boolean?] [:regression [:ref #'FieldName]]])

(def ImputeMethod primitives/ImputeMethod)

(def ImputeSequence primitives/ImputeSequence)

(def ImputeTransform
  [:map {:closed true} [:frame {:optional true} [:vector [:or nil? number?]]]
   [:groupby {:optional true} [:vector [:ref #'FieldName]]]
   [:impute [:ref #'FieldName]] [:key [:ref #'FieldName]]
   [:keyvals {:optional true} [:or [:vector any?] [:ref #'ImputeSequence]]]
   [:method {:optional true} [:ref #'ImputeMethod]]
   [:value {:optional true} any?]])

(def Transform
  [:or [:ref #'AggregateTransform] [:ref #'BinTransform]
   [:ref #'CalculateTransform] [:ref #'DensityTransform]
   [:ref #'ExtentTransform] [:ref #'FilterTransform] [:ref #'FlattenTransform]
   [:ref #'FoldTransform] [:ref #'ImputeTransform]
   [:ref #'JoinAggregateTransform] [:ref #'LoessTransform]
   [:ref #'LookupTransform] [:ref #'QuantileTransform]
   [:ref #'RegressionTransform] [:ref #'TimeUnitTransform]
   [:ref #'SampleTransform] [:ref #'StackTransform] [:ref #'WindowTransform]
   [:ref #'PivotTransform]])

(def ScaleResolveMap
  [:map {:closed true} [:y {:optional true} [:ref #'ResolveMode]]
   [:strokeOpacity {:optional true} [:ref #'ResolveMode]]
   [:stroke {:optional true} [:ref #'ResolveMode]]
   [:color {:optional true} [:ref #'ResolveMode]]
   [:fill {:optional true} [:ref #'ResolveMode]]
   [:strokeDash {:optional true} [:ref #'ResolveMode]]
   [:time {:optional true} [:ref #'ResolveMode]]
   [:fillOpacity {:optional true} [:ref #'ResolveMode]]
   [:angle {:optional true} [:ref #'ResolveMode]]
   [:theta {:optional true} [:ref #'ResolveMode]]
   [:radius {:optional true} [:ref #'ResolveMode]]
   [:size {:optional true} [:ref #'ResolveMode]]
   [:strokeWidth {:optional true} [:ref #'ResolveMode]]
   [:opacity {:optional true} [:ref #'ResolveMode]]
   [:shape {:optional true} [:ref #'ResolveMode]]
   [:yOffset {:optional true} [:ref #'ResolveMode]]
   [:x {:optional true} [:ref #'ResolveMode]]
   [:xOffset {:optional true} [:ref #'ResolveMode]]])

(def LegendResolveMap
  [:map {:closed true} [:strokeOpacity {:optional true} [:ref #'ResolveMode]]
   [:stroke {:optional true} [:ref #'ResolveMode]]
   [:color {:optional true} [:ref #'ResolveMode]]
   [:fill {:optional true} [:ref #'ResolveMode]]
   [:strokeDash {:optional true} [:ref #'ResolveMode]]
   [:time {:optional true} [:ref #'ResolveMode]]
   [:fillOpacity {:optional true} [:ref #'ResolveMode]]
   [:angle {:optional true} [:ref #'ResolveMode]]
   [:size {:optional true} [:ref #'ResolveMode]]
   [:strokeWidth {:optional true} [:ref #'ResolveMode]]
   [:opacity {:optional true} [:ref #'ResolveMode]]
   [:shape {:optional true} [:ref #'ResolveMode]]])

(def Resolve
  [:map {:closed true} [:axis {:optional true} [:ref #'AxisResolveMap]]
   [:legend {:optional true} [:ref #'LegendResolveMap]]
   [:scale {:optional true} [:ref #'ScaleResolveMap]]])

(def TitleParams
  [:map {:closed true} [:baseline {:optional true} [:ref #'TextBaseline]]
   [:align {:optional true} [:ref #'Align]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:frame {:optional true}
    [:or [:or [:ref #'TitleFrame] string?] [:ref #'ExprRef]]]
   [:color {:optional true} [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:subtitleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:subtitleFontStyle {:optional true}
    [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:or [:ref #'TitleOrient] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:style {:optional true} [:or string? [:vector string?]]]
   [:subtitleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:subtitle {:optional true} [:ref #'Text]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:subtitleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:subtitlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:anchor {:optional true} [:ref #'TitleAnchor]]
   [:subtitleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:zindex {:optional true} number?]
   [:subtitleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:text [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def HConcatSpec_GenericSpec_
  [:map {:closed true, :json-schema/original-name "HConcatSpec<GenericSpec>"}
   [:description {:optional true} string?]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:hconcat [:vector [:ref #'Spec]]] [:name {:optional true} string?]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true} boolean?]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:spacing {:optional true} number?]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def NonNormalizedSpec [:ref #'Spec])

(def RepeatMapping primitives/RepeatMapping)

(def RowCol_LayoutAlign_
  [:map {:closed true, :json-schema/original-name "RowCol<LayoutAlign>"}
   [:column {:optional true} [:ref #'LayoutAlign]]
   [:row {:optional true} [:ref #'LayoutAlign]]])

(def RowCol_boolean_ primitives/RowCol_boolean_)

(def NonLayerRepeatSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:columns {:optional true} number?] [:name {:optional true} string?]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:spec [:ref #'NonNormalizedSpec]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:repeat [:or [:vector string?] [:ref #'RepeatMapping]]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def SecondaryFieldDef
  [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?] [:bin {:optional true} nil?]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]])

(def ValueDef__number__width___height__ExprRef__
  [:map
   {:closed true,
    :json-schema/original-name
      "ValueDef<(number|\"width\"|\"height\"|ExprRef)>"}
   [:value [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]])

(def PositionValueDef
  [:ref
   {:json-schema/original-name
      "ValueDef<(number|\"width\"|\"height\"|ExprRef)>"}
   #'ValueDef__number__width___height__ExprRef__])

(def DatumDef
  [:map {:closed true} [:bandPosition {:optional true} number?]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]] [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def Position2Def
  [:or [:ref #'SecondaryFieldDef] [:ref #'DatumDef] [:ref #'PositionValueDef]])

(def ConditionalParameter_ValueDef__string_null_ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name
      "ConditionalParameter<ValueDef<(string|null|ExprRef)>>"}
   [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
   [:value [:or string? nil? [:ref #'ExprRef]]]])

(def ConditionalPredicate_ValueDef__string_null_ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name
      "ConditionalPredicate<ValueDef<(string|null|ExprRef)>>"}
   [:test [:ref #'PredicateComposition]]
   [:value [:or string? nil? [:ref #'ExprRef]]]])

(def ConditionalValueDef__string_null_ExprRef__
  [:or {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
   [:ref
    {:json-schema/original-name
       "ConditionalPredicate<ValueDef<(string|null|ExprRef)>>"}
    #'ConditionalPredicate_ValueDef__string_null_ExprRef___]
   [:ref
    {:json-schema/original-name
       "ConditionalParameter<ValueDef<(string|null|ExprRef)>>"}
    #'ConditionalParameter_ValueDef__string_null_ExprRef___]])

(def ValueDefWithCondition_MarkPropFieldOrDatumDef__string_null__
  [:map
   {:closed true,
    :json-schema/original-name
      "ValueDefWithCondition<MarkPropFieldOrDatumDef,(string|null)>"}
   [:condition {:optional true}
    [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
     [:ref
      {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
      #'ConditionalValueDef__string_null_ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
       #'ConditionalValueDef__string_null_ExprRef__]]]]
   [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]])

(def StringValueDefWithCondition
  [:ref
   {:json-schema/original-name
      "ValueDefWithCondition<MarkPropFieldOrDatumDef,(string|null)>"}
   #'ValueDefWithCondition_MarkPropFieldOrDatumDef__string_null__])

(def ConditionalPredicate_ValueDef_number__
  [:map
   {:closed true,
    :json-schema/original-name "ConditionalPredicate<ValueDef<number>>"}
   [:test [:ref #'PredicateComposition]] [:value number?]])

(def ConditionalParameter_ValueDef_number__
  [:map
   {:closed true,
    :json-schema/original-name "ConditionalParameter<ValueDef<number>>"}
   [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
   [:value number?]])

(def ConditionalValueDef_number_
  [:or {:json-schema/original-name "ConditionalValueDef<number>"}
   [:ref {:json-schema/original-name "ConditionalPredicate<ValueDef<number>>"}
    #'ConditionalPredicate_ValueDef_number__]
   [:ref {:json-schema/original-name "ConditionalParameter<ValueDef<number>>"}
    #'ConditionalParameter_ValueDef_number__]])

(def OrderValueDef
  [:map {:closed true}
   [:condition {:optional true}
    [:or
     [:ref {:json-schema/original-name "ConditionalValueDef<number>"}
      #'ConditionalValueDef_number_]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<number>"}
       #'ConditionalValueDef_number_]]]]
   [:value [:or number? [:ref #'ExprRef]]]])

(def ConditionalParameter_ValueDef__number___ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name
      "ConditionalParameter<ValueDef<(number[]|ExprRef)>>"}
   [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
   [:value [:or [:vector number?] [:ref #'ExprRef]]]])

(def ConditionalPredicate_ValueDef__number___ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name
      "ConditionalPredicate<ValueDef<(number[]|ExprRef)>>"}
   [:test [:ref #'PredicateComposition]]
   [:value [:or [:vector number?] [:ref #'ExprRef]]]])

(def ConditionalValueDef__number___ExprRef__
  [:or {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
   [:ref
    {:json-schema/original-name
       "ConditionalPredicate<ValueDef<(number[]|ExprRef)>>"}
    #'ConditionalPredicate_ValueDef__number___ExprRef___]
   [:ref
    {:json-schema/original-name
       "ConditionalParameter<ValueDef<(number[]|ExprRef)>>"}
    #'ConditionalParameter_ValueDef__number___ExprRef___]])

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_number___
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<MarkPropFieldDef,number[]>"}
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition {:optional true}
    [:or
     [:ref
      {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
      #'ConditionalValueDef__number___ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
       #'ConditionalValueDef__number___ExprRef__]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]])

(def FieldOrDatumDefWithCondition_DatumDef_number___
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<DatumDef,number[]>"}
   [:bandPosition {:optional true} number?]
   [:condition {:optional true}
    [:or
     [:ref
      {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
      #'ConditionalValueDef__number___ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
       #'ConditionalValueDef__number___ExprRef__]]]]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]] [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def ValueDefWithCondition_MarkPropFieldOrDatumDef_number___
  [:map
   {:closed true,
    :json-schema/original-name
      "ValueDefWithCondition<MarkPropFieldOrDatumDef,number[]>"}
   [:condition {:optional true}
    [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
     [:ref
      {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
      #'ConditionalValueDef__number___ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
       #'ConditionalValueDef__number___ExprRef__]]]]
   [:value {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]])

(def MarkPropDef_number___
  [:or {:json-schema/original-name "MarkPropDef<number[]>"}
   [:ref
    {:json-schema/original-name
       "FieldOrDatumDefWithCondition<MarkPropFieldDef,number[]>"}
    #'FieldOrDatumDefWithCondition_MarkPropFieldDef_number___]
   [:ref
    {:json-schema/original-name
       "FieldOrDatumDefWithCondition<DatumDef,number[]>"}
    #'FieldOrDatumDefWithCondition_DatumDef_number___]
   [:ref
    {:json-schema/original-name
       "ValueDefWithCondition<MarkPropFieldOrDatumDef,number[]>"}
    #'ValueDefWithCondition_MarkPropFieldOrDatumDef_number___]])

(def NumericArrayMarkPropDef
  [:ref {:json-schema/original-name "MarkPropDef<number[]>"}
   #'MarkPropDef_number___])

(def ValueDef_number_ primitives/ValueDef_number_)

(def ScaleFieldDef
  [:map {:closed true} [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]])

(def ScaleDatumDef
  [:map {:closed true} [:bandPosition {:optional true} number?]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def OffsetDef
  [:or [:ref #'ScaleFieldDef] [:ref #'ScaleDatumDef]
   [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]])

(def ConditionalParameter_ValueDef__Text_ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name "ConditionalParameter<ValueDef<(Text|ExprRef)>>"}
   [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
   [:value [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def ConditionalPredicate_ValueDef__Text_ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name "ConditionalPredicate<ValueDef<(Text|ExprRef)>>"}
   [:test [:ref #'PredicateComposition]]
   [:value [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def ConditionalValueDef__Text_ExprRef__
  [:or {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
   [:ref
    {:json-schema/original-name
       "ConditionalPredicate<ValueDef<(Text|ExprRef)>>"}
    #'ConditionalPredicate_ValueDef__Text_ExprRef___]
   [:ref
    {:json-schema/original-name
       "ConditionalParameter<ValueDef<(Text|ExprRef)>>"}
    #'ConditionalParameter_ValueDef__Text_ExprRef___]])

(def FieldOrDatumDefWithCondition_StringDatumDef_Text_
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<StringDatumDef,Text>"}
   [:bandPosition {:optional true} number?]
   [:condition {:optional true}
    [:or
     [:ref {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
      #'ConditionalValueDef__Text_ExprRef__]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
       #'ConditionalValueDef__Text_ExprRef__]]]]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]] [:format {:optional true} [:ref #'Format]]
   [:formatType {:optional true} string?]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def FieldOrDatumDefWithCondition_StringFieldDef_Text_
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<StringFieldDef,Text>"}
   [:format {:optional true} [:ref #'Format]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:formatType {:optional true} string?]
   [:condition {:optional true}
    [:or
     [:ref {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
      #'ConditionalValueDef__Text_ExprRef__]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
       #'ConditionalValueDef__Text_ExprRef__]]]]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]])

(def ConditionalParameter_StringFieldDef_
  [:map
   {:closed true,
    :json-schema/original-name "ConditionalParameter<StringFieldDef>"}
   [:format {:optional true} [:ref #'Format]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:formatType {:optional true} string?]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]])

(def ConditionalPredicate_StringFieldDef_
  [:map
   {:closed true,
    :json-schema/original-name "ConditionalPredicate<StringFieldDef>"}
   [:format {:optional true} [:ref #'Format]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:formatType {:optional true} string?]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:test [:ref #'PredicateComposition]]])

(def ConditionalStringFieldDef
  [:or
   [:ref {:json-schema/original-name "ConditionalPredicate<StringFieldDef>"}
    #'ConditionalPredicate_StringFieldDef_]
   [:ref {:json-schema/original-name "ConditionalParameter<StringFieldDef>"}
    #'ConditionalParameter_StringFieldDef_]])

(def ValueDefWithCondition_StringFieldDef_Text_
  [:map
   {:closed true,
    :json-schema/original-name "ValueDefWithCondition<StringFieldDef,Text>"}
   [:condition {:optional true}
    [:or [:ref #'ConditionalStringFieldDef]
     [:ref {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
      #'ConditionalValueDef__Text_ExprRef__]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
       #'ConditionalValueDef__Text_ExprRef__]]]]
   [:value {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def TextDef
  [:or
   [:ref
    {:json-schema/original-name
       "FieldOrDatumDefWithCondition<StringFieldDef,Text>"}
    #'FieldOrDatumDefWithCondition_StringFieldDef_Text_]
   [:ref
    {:json-schema/original-name
       "FieldOrDatumDefWithCondition<StringDatumDef,Text>"}
    #'FieldOrDatumDefWithCondition_StringDatumDef_Text_]
   [:ref
    {:json-schema/original-name "ValueDefWithCondition<StringFieldDef,Text>"}
    #'ValueDefWithCondition_StringFieldDef_Text_]])

(def TypedFieldDef
  [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

(def FieldDefWithoutScale [:ref #'TypedFieldDef])

(def OrderOnlyDef
  [:map {:closed true} [:sort {:optional true} [:ref #'SortOrder]]])

(def ConditionalParameter_ValueDef__number_ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name
      "ConditionalParameter<ValueDef<(number|ExprRef)>>"}
   [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
   [:value [:or number? [:ref #'ExprRef]]]])

(def ConditionalPredicate_ValueDef__number_ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name
      "ConditionalPredicate<ValueDef<(number|ExprRef)>>"}
   [:test [:ref #'PredicateComposition]]
   [:value [:or number? [:ref #'ExprRef]]]])

(def ConditionalValueDef__number_ExprRef__
  [:or {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
   [:ref
    {:json-schema/original-name
       "ConditionalPredicate<ValueDef<(number|ExprRef)>>"}
    #'ConditionalPredicate_ValueDef__number_ExprRef___]
   [:ref
    {:json-schema/original-name
       "ConditionalParameter<ValueDef<(number|ExprRef)>>"}
    #'ConditionalParameter_ValueDef__number_ExprRef___]])

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_number_
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<MarkPropFieldDef,number>"}
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition {:optional true}
    [:or
     [:ref {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
      #'ConditionalValueDef__number_ExprRef__]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]])

(def ValueDefWithCondition_MarkPropFieldOrDatumDef_number_
  [:map
   {:closed true,
    :json-schema/original-name
      "ValueDefWithCondition<MarkPropFieldOrDatumDef,number>"}
   [:condition {:optional true}
    [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
     [:ref {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
      #'ConditionalValueDef__number_ExprRef__]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]]]]
   [:value {:optional true} [:or number? [:ref #'ExprRef]]]])

(def FieldOrDatumDefWithCondition_DatumDef_number_
  [:map
   {:closed true,
    :json-schema/original-name "FieldOrDatumDefWithCondition<DatumDef,number>"}
   [:bandPosition {:optional true} number?]
   [:condition {:optional true}
    [:or
     [:ref {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
      #'ConditionalValueDef__number_ExprRef__]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]]]]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]] [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def MarkPropDef_number_
  [:or {:json-schema/original-name "MarkPropDef<number>"}
   [:ref
    {:json-schema/original-name
       "FieldOrDatumDefWithCondition<MarkPropFieldDef,number>"}
    #'FieldOrDatumDefWithCondition_MarkPropFieldDef_number_]
   [:ref
    {:json-schema/original-name "FieldOrDatumDefWithCondition<DatumDef,number>"}
    #'FieldOrDatumDefWithCondition_DatumDef_number_]
   [:ref
    {:json-schema/original-name
       "ValueDefWithCondition<MarkPropFieldOrDatumDef,number>"}
    #'ValueDefWithCondition_MarkPropFieldOrDatumDef_number_]])

(def NumericMarkPropDef
  [:ref {:json-schema/original-name "MarkPropDef<number>"}
   #'MarkPropDef_number_])

(def StackOffset primitives/StackOffset)

(def PositionDatumDefBase
  [:map {:closed true} [:bandPosition {:optional true} number?]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def PositionFieldDefBase
  [:map {:closed true} [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]])

(def PolarDef
  [:or [:ref #'PositionFieldDefBase] [:ref #'PositionDatumDefBase]
   [:ref #'PositionValueDef]])

(def LatLongFieldDef
  [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?] [:bin {:optional true} nil?]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:= "quantitative"]]])

(def LatLongDef [:or [:ref #'LatLongFieldDef] [:ref #'DatumDef]])

(def TimeFieldDef
  [:map {:closed true} [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:rescale {:optional true} boolean?] [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]])

(def TimeDef [:ref #'TimeFieldDef])

(def ConditionalParameter_ValueDef__string_ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name
      "ConditionalParameter<ValueDef<(string|ExprRef)>>"}
   [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
   [:value [:or string? [:ref #'ExprRef]]]])

(def ConditionalPredicate_ValueDef__string_ExprRef___
  [:map
   {:closed true,
    :json-schema/original-name
      "ConditionalPredicate<ValueDef<(string|ExprRef)>>"}
   [:test [:ref #'PredicateComposition]]
   [:value [:or string? [:ref #'ExprRef]]]])

(def ConditionalValueDef__string_ExprRef__
  [:or {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
   [:ref
    {:json-schema/original-name
       "ConditionalPredicate<ValueDef<(string|ExprRef)>>"}
    #'ConditionalPredicate_ValueDef__string_ExprRef___]
   [:ref
    {:json-schema/original-name
       "ConditionalParameter<ValueDef<(string|ExprRef)>>"}
    #'ConditionalParameter_ValueDef__string_ExprRef___]])

(def FieldOrDatumDefWithCondition_StringFieldDef_string_
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<StringFieldDef,string>"}
   [:format {:optional true} [:ref #'Format]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:formatType {:optional true} string?]
   [:condition {:optional true}
    [:or
     [:ref {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
      #'ConditionalValueDef__string_ExprRef__]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
       #'ConditionalValueDef__string_ExprRef__]]]]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]])

(def StringFieldDefWithCondition
  [:ref
   {:json-schema/original-name
      "FieldOrDatumDefWithCondition<StringFieldDef,string>"}
   #'FieldOrDatumDefWithCondition_StringFieldDef_string_])

(def OrderFieldDef
  [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:field {:optional true} [:ref #'Field]]
   [:sort {:optional true} [:ref #'SortOrder]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

(def StringFieldDef
  [:map {:closed true} [:format {:optional true} [:ref #'Format]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:formatType {:optional true} string?]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]])

(def TypeForShape primitives/TypeForShape)

(def ConditionalParameter_MarkPropFieldOrDatumDef_TypeForShape__
  [:or
   {:json-schema/original-name
      "ConditionalParameter<MarkPropFieldOrDatumDef<TypeForShape>>"}
   [:map {:closed true} [:scale {:optional true} [:or [:ref #'Scale] nil?]]
    [:legend {:optional true} [:or [:ref #'Legend] nil?]]
    [:field {:optional true} [:ref #'Field]]
    [:type {:optional true} [:ref #'TypeForShape]]
    [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
    [:title {:optional true} [:or [:ref #'Text] nil?]]
    [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
    [:bandPosition {:optional true} number?]
    [:timeUnit {:optional true}
     [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
    [:aggregate {:optional true} [:ref #'Aggregate]]
    [:sort {:optional true} [:ref #'Sort]]]
   [:map {:closed true} [:bandPosition {:optional true} number?]
    [:datum {:optional true}
     [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
      [:ref #'RepeatRef]]] [:empty {:optional true} boolean?]
    [:legend {:optional true} [:or [:ref #'Legend] nil?]]
    [:param [:ref #'ParameterName]]
    [:scale {:optional true} [:or [:ref #'Scale] nil?]]
    [:title {:optional true} [:or [:ref #'Text] nil?]]
    [:type {:optional true} [:ref #'Type]]]])

(def ConditionalPredicate_MarkPropFieldOrDatumDef_TypeForShape__
  [:or
   {:json-schema/original-name
      "ConditionalPredicate<MarkPropFieldOrDatumDef<TypeForShape>>"}
   [:map {:closed true} [:scale {:optional true} [:or [:ref #'Scale] nil?]]
    [:legend {:optional true} [:or [:ref #'Legend] nil?]]
    [:field {:optional true} [:ref #'Field]]
    [:type {:optional true} [:ref #'TypeForShape]]
    [:title {:optional true} [:or [:ref #'Text] nil?]]
    [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
    [:bandPosition {:optional true} number?]
    [:timeUnit {:optional true}
     [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
    [:aggregate {:optional true} [:ref #'Aggregate]]
    [:test [:ref #'PredicateComposition]]
    [:sort {:optional true} [:ref #'Sort]]]
   [:map {:closed true} [:bandPosition {:optional true} number?]
    [:datum {:optional true}
     [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
      [:ref #'RepeatRef]]] [:legend {:optional true} [:or [:ref #'Legend] nil?]]
    [:scale {:optional true} [:or [:ref #'Scale] nil?]]
    [:test [:ref #'PredicateComposition]]
    [:title {:optional true} [:or [:ref #'Text] nil?]]
    [:type {:optional true} [:ref #'Type]]]])

(def ConditionalMarkPropFieldOrDatumDef_TypeForShape_
  [:or
   {:json-schema/original-name
      "ConditionalMarkPropFieldOrDatumDef<TypeForShape>"}
   [:ref
    {:json-schema/original-name
       "ConditionalPredicate<MarkPropFieldOrDatumDef<TypeForShape>>"}
    #'ConditionalPredicate_MarkPropFieldOrDatumDef_TypeForShape__]
   [:ref
    {:json-schema/original-name
       "ConditionalParameter<MarkPropFieldOrDatumDef<TypeForShape>>"}
    #'ConditionalParameter_MarkPropFieldOrDatumDef_TypeForShape__]])

(def ValueDefWithCondition_MarkPropFieldOrDatumDef_TypeForShape___string_null__
  [:map
   {:closed true,
    :json-schema/original-name
      "ValueDefWithCondition<MarkPropFieldOrDatumDef<TypeForShape>,(string|null)>"}
   [:condition {:optional true}
    [:or
     [:ref
      {:json-schema/original-name
         "ConditionalMarkPropFieldOrDatumDef<TypeForShape>"}
      #'ConditionalMarkPropFieldOrDatumDef_TypeForShape_]
     [:ref
      {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
      #'ConditionalValueDef__string_null_ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
       #'ConditionalValueDef__string_null_ExprRef__]]]]
   [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]])

(def FieldOrDatumDefWithCondition_DatumDef__string_null__
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<DatumDef,(string|null)>"}
   [:bandPosition {:optional true} number?]
   [:condition {:optional true}
    [:or
     [:ref
      {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
      #'ConditionalValueDef__string_null_ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
       #'ConditionalValueDef__string_null_ExprRef__]]]]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]] [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_TypeForShape___string_null__
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<MarkPropFieldDef<TypeForShape>,(string|null)>"}
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'TypeForShape]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition {:optional true}
    [:or
     [:ref
      {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
      #'ConditionalValueDef__string_null_ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
       #'ConditionalValueDef__string_null_ExprRef__]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]])

(def MarkPropDef__string_null__TypeForShape_
  [:or {:json-schema/original-name "MarkPropDef<(string|null),TypeForShape>"}
   [:ref
    {:json-schema/original-name
       "FieldOrDatumDefWithCondition<MarkPropFieldDef<TypeForShape>,(string|null)>"}
    #'FieldOrDatumDefWithCondition_MarkPropFieldDef_TypeForShape___string_null__]
   [:ref
    {:json-schema/original-name
       "FieldOrDatumDefWithCondition<DatumDef,(string|null)>"}
    #'FieldOrDatumDefWithCondition_DatumDef__string_null__]
   [:ref
    {:json-schema/original-name
       "ValueDefWithCondition<MarkPropFieldOrDatumDef<TypeForShape>,(string|null)>"}
    #'ValueDefWithCondition_MarkPropFieldOrDatumDef_TypeForShape___string_null__]])

(def ShapeDef
  [:ref {:json-schema/original-name "MarkPropDef<(string|null),TypeForShape>"}
   #'MarkPropDef__string_null__TypeForShape_])

(def ImputeParams
  [:map {:closed true} [:frame {:optional true} [:vector [:or nil? number?]]]
   [:keyvals {:optional true} [:or [:vector any?] [:ref #'ImputeSequence]]]
   [:method {:optional true} [:ref #'ImputeMethod]]
   [:value {:optional true} any?]])

(def PositionFieldDef
  [:map {:closed true} [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:impute {:optional true} [:or [:ref #'ImputeParams] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:axis {:optional true} [:or [:ref #'Axis] nil?]]
   [:sort {:optional true} [:ref #'Sort]]])

(def PositionDatumDef
  [:map {:closed true} [:axis {:optional true} [:or [:ref #'Axis] nil?]]
   [:bandPosition {:optional true} number?]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:impute {:optional true} [:or [:ref #'ImputeParams] nil?]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def PositionDef
  [:or [:ref #'PositionFieldDef] [:ref #'PositionDatumDef]
   [:ref #'PositionValueDef]])

(def Encoding
  [:map {:closed true} [:y {:optional true} [:ref #'PositionDef]]
   [:description {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition]]]
   [:strokeOpacity {:optional true} [:ref #'NumericMarkPropDef]]
   [:xError2 {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:stroke {:optional true} [:ref #'ColorDef]]
   [:color {:optional true} [:ref #'ColorDef]]
   [:key {:optional true} [:ref #'FieldDefWithoutScale]]
   [:longitude2 {:optional true} [:ref #'Position2Def]]
   [:fill {:optional true} [:ref #'ColorDef]]
   [:strokeDash {:optional true} [:ref #'NumericArrayMarkPropDef]]
   [:time {:optional true} [:ref #'TimeDef]]
   [:longitude {:optional true} [:ref #'LatLongDef]]
   [:fillOpacity {:optional true} [:ref #'NumericMarkPropDef]]
   [:angle {:optional true} [:ref #'NumericMarkPropDef]]
   [:theta {:optional true} [:ref #'PolarDef]]
   [:radius {:optional true} [:ref #'PolarDef]]
   [:theta2 {:optional true} [:ref #'Position2Def]]
   [:size {:optional true} [:ref #'NumericMarkPropDef]]
   [:yError {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:strokeWidth {:optional true} [:ref #'NumericMarkPropDef]]
   [:opacity {:optional true} [:ref #'NumericMarkPropDef]]
   [:shape {:optional true} [:ref #'ShapeDef]]
   [:url {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition]]]
   [:latitude {:optional true} [:ref #'LatLongDef]]
   [:order {:optional true}
    [:or [:ref #'OrderFieldDef] [:ref #'OrderValueDef] [:ref #'OrderOnlyDef]
     [:vector [:ref #'OrderFieldDef]]]]
   [:xError {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:yError2 {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:yOffset {:optional true} [:ref #'OffsetDef]]
   [:x {:optional true} [:ref #'PositionDef]]
   [:y2 {:optional true} [:ref #'Position2Def]]
   [:radius2 {:optional true} [:ref #'Position2Def]]
   [:x2 {:optional true} [:ref #'Position2Def]]
   [:latitude2 {:optional true} [:ref #'Position2Def]]
   [:href {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition]]]
   [:tooltip {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition] [:vector [:ref #'StringFieldDef]]
     nil?]] [:text {:optional true} [:ref #'TextDef]]
   [:xOffset {:optional true} [:ref #'OffsetDef]]
   [:detail {:optional true}
    [:or [:ref #'FieldDefWithoutScale]
     [:vector [:ref #'FieldDefWithoutScale]]]]])

(def Dict_SelectionInitInterval_ primitives/Dict_SelectionInitInterval_)

(def SelectionInitIntervalMapping
  [:ref {:json-schema/original-name "Dict<SelectionInitInterval>"}
   #'Dict_SelectionInitInterval_])

(def Expr primitives/Expr)

(def EventType primitives/EventType)

(def MarkType primitives/MarkType)

(def WindowEventType [:or [:ref #'EventType] string?])

(def EventStream
  [:or
   [:map {:closed true} [:markname {:optional true} string?]
    [:debounce {:optional true} number?] [:consume {:optional true} boolean?]
    [:between {:optional true} [:vector [:ref #'Stream]]]
    [:type [:ref #'EventType]] [:source {:optional true} [:enum "view" "scope"]]
    [:filter {:optional true} [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
    [:marktype {:optional true} [:ref #'MarkType]]
    [:throttle {:optional true} number?]]
   [:map {:closed true} [:markname {:optional true} string?]
    [:debounce {:optional true} number?] [:consume {:optional true} boolean?]
    [:between {:optional true} [:vector [:ref #'Stream]]]
    [:type [:ref #'WindowEventType]] [:source [:= "window"]]
    [:filter {:optional true} [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
    [:marktype {:optional true} [:ref #'MarkType]]
    [:throttle {:optional true} number?]]])

(def DerivedStream
  [:map {:closed true} [:between {:optional true} [:vector [:ref #'Stream]]]
   [:consume {:optional true} boolean?] [:debounce {:optional true} number?]
   [:filter {:optional true} [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
   [:markname {:optional true} string?]
   [:marktype {:optional true} [:ref #'MarkType]] [:stream [:ref #'Stream]]
   [:throttle {:optional true} number?]])

(def MergedStream
  [:map {:closed true} [:between {:optional true} [:vector [:ref #'Stream]]]
   [:consume {:optional true} boolean?] [:debounce {:optional true} number?]
   [:filter {:optional true} [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
   [:markname {:optional true} string?]
   [:marktype {:optional true} [:ref #'MarkType]]
   [:merge [:vector [:ref #'Stream]]] [:throttle {:optional true} number?]])

(def Stream
  [:or [:ref #'EventStream] [:ref #'DerivedStream] [:ref #'MergedStream]])

(def LegendStreamBinding
  [:map {:closed true} [:legend [:or string? [:ref #'Stream]]]])

(def LegendBinding [:or [:ref #'LegendStreamBinding] [:enum "legend"]])

(def SelectionResolution primitives/SelectionResolution)

(def IntervalSelectionConfig
  [:map {:closed true} [:zoom {:optional true} [:or string? boolean?]]
   [:mark {:optional true} [:ref #'BrushConfig]]
   [:fields {:optional true} [:vector [:ref #'FieldName]]]
   [:type [:= "interval"]]
   [:encodings {:optional true} [:vector [:ref #'SingleDefUnitChannel]]]
   [:resolve {:optional true} [:ref #'SelectionResolution]]
   [:translate {:optional true} [:or string? boolean?]]
   [:on {:optional true} [:or [:ref #'Stream] string?]]
   [:clear {:optional true} [:or [:ref #'Stream] string? boolean?]]])

(def PointSelectionConfig
  [:map {:closed true}
   [:clear {:optional true} [:or [:ref #'Stream] string? boolean?]]
   [:encodings {:optional true} [:vector [:ref #'SingleDefUnitChannel]]]
   [:fields {:optional true} [:vector [:ref #'FieldName]]]
   [:nearest {:optional true} boolean?]
   [:on {:optional true} [:or [:ref #'Stream] string?]]
   [:resolve {:optional true} [:ref #'SelectionResolution]]
   [:toggle {:optional true} [:or string? boolean?]] [:type [:= "point"]]])

(def SelectionInit [:or [:ref #'PrimitiveValue] [:ref #'DateTime]])

(def SelectionType primitives/SelectionType)

(def Dict_SelectionInit_ primitives/Dict_SelectionInit_)

(def SelectionInitMapping
  [:ref {:json-schema/original-name "Dict<SelectionInit>"}
   #'Dict_SelectionInit_])

(def SelectionParameter
  [:map {:closed true}
   [:bind {:optional true}
    [:or [:ref #'Binding] [:ref #'LegendBinding] [:map-of any? any?]
     [:enum "scales"]]] [:name [:ref #'ParameterName]]
   [:select
    [:or [:ref #'SelectionType] [:ref #'PointSelectionConfig]
     [:ref #'IntervalSelectionConfig]]]
   [:value {:optional true}
    [:or [:ref #'SelectionInit] [:ref #'SelectionInitIntervalMapping]
     [:vector [:ref #'SelectionInitMapping]]]]])

(def ProjectionType primitives/ProjectionType)

(def Vector3_number_ primitives/Vector3_number_)

(def GeoJsonProperties primitives/GeoJsonProperties)

(def Position primitives/Position)

(def Polygon
  [:map {:closed true} [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:vector [:vector [:ref #'Position]]]] [:type [:= "Polygon"]]])

(def LineString
  [:map {:closed true} [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:vector [:ref #'Position]]] [:type [:= "LineString"]]])

(def GeometryCollection
  [:map {:closed true} [:bbox {:optional true} [:ref #'BBox]]
   [:geometries [:vector [:ref #'Geometry]]] [:type [:= "GeometryCollection"]]])

(def Point
  [:map {:closed true} [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:ref #'Position]] [:type [:= "Point"]]])

(def MultiPolygon
  [:map {:closed true} [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:vector [:vector [:vector [:ref #'Position]]]]]
   [:type [:= "MultiPolygon"]]])

(def MultiLineString
  [:map {:closed true} [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:vector [:vector [:ref #'Position]]]]
   [:type [:= "MultiLineString"]]])

(def MultiPoint
  [:map {:closed true} [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:vector [:ref #'Position]]] [:type [:= "MultiPoint"]]])

(def Geometry
  [:or [:ref #'Point] [:ref #'MultiPoint] [:ref #'LineString]
   [:ref #'MultiLineString] [:ref #'Polygon] [:ref #'MultiPolygon]
   [:ref #'GeometryCollection]])

(def Feature
  [:map {:closed true} [:bbox {:optional true} [:ref #'BBox]]
   [:geometry [:ref #'Geometry]] [:id {:optional true} [:or string? number?]]
   [:properties [:ref #'GeoJsonProperties]] [:type [:= "Feature"]]])

(def GeoJsonFeature [:ref #'Feature])

(def Feature_Geometry_GeoJsonProperties_
  [:map
   {:closed true,
    :json-schema/original-name "Feature<Geometry,GeoJsonProperties>"}
   [:bbox {:optional true} [:ref #'BBox]] [:geometry [:ref #'Geometry]]
   [:id {:optional true} [:or string? number?]]
   [:properties [:ref #'GeoJsonProperties]] [:type [:= "Feature"]]])

(def FeatureCollection
  [:map {:closed true} [:bbox {:optional true} [:ref #'BBox]]
   [:features
    [:vector
     [:ref {:json-schema/original-name "Feature<Geometry,GeoJsonProperties>"}
      #'Feature_Geometry_GeoJsonProperties_]]]
   [:type [:= "FeatureCollection"]]])

(def GeoJsonFeatureCollection [:ref #'FeatureCollection])

(def Fit
  [:or [:ref #'GeoJsonFeature] [:ref #'GeoJsonFeatureCollection]
   [:vector [:ref #'GeoJsonFeature]]])

(def Projection
  [:map {:closed true}
   [:clipExtent {:optional true}
    [:or
     [:ref {:json-schema/original-name "Vector2<Vector2<number>>"}
      #'Vector2_Vector2_number__] [:ref #'ExprRef]]]
   [:reflectY {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:fit {:optional true}
    [:or [:ref #'Fit] [:ref #'ExprRef] [:vector [:ref #'Fit]]]]
   [:scale {:optional true} [:or number? [:ref #'ExprRef]]]
   [:parallel {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fraction {:optional true} [:or number? [:ref #'ExprRef]]]
   [:precision {:optional true} [:or number? [:ref #'ExprRef]]]
   [:type {:optional true} [:or [:ref #'ProjectionType] [:ref #'ExprRef]]]
   [:tilt {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:size {:optional true}
    [:or [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]
     [:ref #'ExprRef]]]
   [:clipAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:center {:optional true}
    [:or [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]
     [:ref #'ExprRef]]]
   [:pointRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lobes {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ratio {:optional true} [:or number? [:ref #'ExprRef]]]
   [:extent {:optional true}
    [:or
     [:ref {:json-schema/original-name "Vector2<Vector2<number>>"}
      #'Vector2_Vector2_number__] [:ref #'ExprRef]]]
   [:coefficient {:optional true} [:or number? [:ref #'ExprRef]]]
   [:translate {:optional true}
    [:or [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]
     [:ref #'ExprRef]]]
   [:rotate {:optional true}
    [:or
     [:or
      [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]
      [:ref {:json-schema/original-name "Vector3<number>"} #'Vector3_number_]]
     [:ref #'ExprRef]]]
   [:distance {:optional true} [:or number? [:ref #'ExprRef]]]
   [:parallels {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:reflectX {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:spacing {:optional true} [:or number? [:ref #'ExprRef]]]])

(def StepFor primitives/StepFor)

(def Step
  [:map {:closed true} [:for {:optional true} [:ref #'StepFor]]
   [:step number?]])

(def ViewBackground
  [:map {:closed true}
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:stroke {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
   [:fill {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:cursor {:optional true} [:ref #'Cursor]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:style {:optional true} [:or string? [:vector string?]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]])

(def UnitSpecWithFrame
  [:map {:closed true} [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'Encoding]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:mark [:ref #'AnyMark]] [:name {:optional true} string?]
   [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:params {:optional true} [:vector [:ref #'SelectionParameter]]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:projection {:optional true} [:ref #'Projection]]
   [:view {:optional true} [:ref #'ViewBackground]]
   [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def SharedEncoding
  [:map {:closed true}
   [:y {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:impute {:optional true} [:or [:ref #'ImputeParams] nil?]]
     [:value {:optional true}
      [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true}
      [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
     [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:axis {:optional true} [:or [:ref #'Axis] nil?]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:description {:optional true}
    [:map {:closed true} [:format {:optional true} [:ref #'Format]]
     [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:ref #'StandardType]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:formatType {:optional true} string?]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
         #'ConditionalValueDef__string_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
          #'ConditionalValueDef__string_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(string|null|ExprRef)>"}
         #'ConditionalValueDef__string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(string|null|ExprRef)>"}
          #'ConditionalValueDef__string_null_ExprRef__]]]]]
     [:bin {:optional true}
      [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]]]
   [:strokeOpacity {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true} [:or number? [:ref #'ExprRef]]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:xError2 {:optional true}
    [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
     [:bandPosition {:optional true} number?] [:bin {:optional true} nil?]
     [:field {:optional true} [:ref #'Field]]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:value {:optional true} number?]]]
   [:stroke {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true}
      [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
         #'ConditionalValueDef__Gradient_string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
          #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
         #'ConditionalValueDef__Gradient_string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
          #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:color {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true}
      [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
         #'ConditionalValueDef__Gradient_string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
          #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
         #'ConditionalValueDef__Gradient_string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
          #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:key {:optional true}
    [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
     [:bandPosition {:optional true} number?]
     [:bin {:optional true}
      [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
     [:field {:optional true} [:ref #'Field]]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:type {:optional true} [:ref #'StandardType]]]]
   [:longitude2 {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]]
     [:value {:optional true}
      [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:ref #'Type]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true} nil?] [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]]]
   [:fill {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true}
      [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
         #'ConditionalValueDef__Gradient_string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
          #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
         #'ConditionalValueDef__Gradient_string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
          #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:strokeDash {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
         #'ConditionalValueDef__number___ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
          #'ConditionalValueDef__number___ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
         #'ConditionalValueDef__number___ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
          #'ConditionalValueDef__number___ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:time {:optional true}
    [:map {:closed true} [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:rescale {:optional true} boolean?]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:ref #'StandardType]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:longitude {:optional true}
    [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
     [:bandPosition {:optional true} number?] [:bin {:optional true} nil?]
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:field {:optional true} [:ref #'Field]]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:type {:optional true} [:or [:ref #'Type] [:enum "quantitative"]]]]]
   [:fillOpacity {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true} [:or number? [:ref #'ExprRef]]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:angle {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true} [:or number? [:ref #'ExprRef]]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:theta {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true}
      [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true}
      [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
     [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:radius {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true}
      [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true}
      [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
     [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:theta2 {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]]
     [:value {:optional true}
      [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:ref #'Type]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true} nil?] [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]]]
   [:size {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true} [:or number? [:ref #'ExprRef]]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:yError {:optional true}
    [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
     [:bandPosition {:optional true} number?] [:bin {:optional true} nil?]
     [:field {:optional true} [:ref #'Field]]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:value {:optional true} number?]]]
   [:strokeWidth {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true} [:or number? [:ref #'ExprRef]]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:opacity {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true} [:or number? [:ref #'ExprRef]]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
         #'ConditionalValueDef__number_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
          #'ConditionalValueDef__number_ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:shape {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]
     [:legend {:optional true} [:or [:ref #'Legend] nil?]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'TypeForShape] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(string|null|ExprRef)>"}
         #'ConditionalValueDef__string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(string|null|ExprRef)>"}
          #'ConditionalValueDef__string_null_ExprRef__]]]
       [:or
        [:ref
         {:json-schema/original-name
            "ConditionalMarkPropFieldOrDatumDef<TypeForShape>"}
         #'ConditionalMarkPropFieldOrDatumDef_TypeForShape_]
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(string|null|ExprRef)>"}
         #'ConditionalValueDef__string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(string|null|ExprRef)>"}
          #'ConditionalValueDef__string_null_ExprRef__]]]]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:url {:optional true}
    [:map {:closed true} [:format {:optional true} [:ref #'Format]]
     [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:ref #'StandardType]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:formatType {:optional true} string?]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
         #'ConditionalValueDef__string_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
          #'ConditionalValueDef__string_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(string|null|ExprRef)>"}
         #'ConditionalValueDef__string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(string|null|ExprRef)>"}
          #'ConditionalValueDef__string_null_ExprRef__]]]]]
     [:bin {:optional true}
      [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]]]
   [:latitude {:optional true}
    [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
     [:bandPosition {:optional true} number?] [:bin {:optional true} nil?]
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:field {:optional true} [:ref #'Field]]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:type {:optional true} [:or [:ref #'Type] [:enum "quantitative"]]]]]
   [:order {:optional true}
    [:or [:ref #'OrderFieldDef] [:ref #'OrderValueDef] [:ref #'OrderOnlyDef]
     [:vector [:ref #'OrderFieldDef]]]]
   [:xError {:optional true}
    [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
     [:bandPosition {:optional true} number?] [:bin {:optional true} nil?]
     [:field {:optional true} [:ref #'Field]]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:value {:optional true} number?]]]
   [:yError2 {:optional true}
    [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
     [:bandPosition {:optional true} number?] [:bin {:optional true} nil?]
     [:field {:optional true} [:ref #'Field]]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:value {:optional true} number?]]]
   [:yOffset {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true} number?] [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:x {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:impute {:optional true} [:or [:ref #'ImputeParams] nil?]]
     [:value {:optional true}
      [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true}
      [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
     [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:axis {:optional true} [:or [:ref #'Axis] nil?]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:y2 {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]]
     [:value {:optional true}
      [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:ref #'Type]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true} nil?] [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]]]
   [:radius2 {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]]
     [:value {:optional true}
      [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:ref #'Type]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true} nil?] [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]]]
   [:x2 {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]]
     [:value {:optional true}
      [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:ref #'Type]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true} nil?] [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]]]
   [:latitude2 {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]]
     [:value {:optional true}
      [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:ref #'Type]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true} nil?] [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]]]
   [:href {:optional true}
    [:map {:closed true} [:format {:optional true} [:ref #'Format]]
     [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:ref #'StandardType]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:formatType {:optional true} string?]
     [:condition {:optional true}
      [:or
       [:or
        [:ref
         {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
         #'ConditionalValueDef__string_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
          #'ConditionalValueDef__string_ExprRef__]]]
       [:or [:ref #'ConditionalMarkPropFieldOrDatumDef]
        [:ref
         {:json-schema/original-name
            "ConditionalValueDef<(string|null|ExprRef)>"}
         #'ConditionalValueDef__string_null_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name
             "ConditionalValueDef<(string|null|ExprRef)>"}
          #'ConditionalValueDef__string_null_ExprRef__]]]]]
     [:bin {:optional true}
      [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]]]
   [:tooltip {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition] [:vector [:ref #'StringFieldDef]]
     nil?]]
   [:text {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:format {:optional true} [:ref #'Format]]
     [:value {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]
     [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:formatType {:optional true} string?]
     [:condition {:optional true}
      [:or
       [:or
        [:ref {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
         #'ConditionalValueDef__Text_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
          #'ConditionalValueDef__Text_ExprRef__]]]
       [:or [:ref #'ConditionalStringFieldDef]
        [:ref {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
         #'ConditionalValueDef__Text_ExprRef__]
        [:vector
         [:ref
          {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
          #'ConditionalValueDef__Text_ExprRef__]]]]]
     [:bin {:optional true}
      [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]]]
   [:xOffset {:optional true}
    [:map {:closed true}
     [:datum {:optional true}
      [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
       [:ref #'RepeatRef]]] [:scale {:optional true} [:or [:ref #'Scale] nil?]]
     [:value {:optional true} number?] [:field {:optional true} [:ref #'Field]]
     [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
     [:bandPosition {:optional true} number?]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:aggregate {:optional true} [:ref #'Aggregate]]
     [:sort {:optional true} [:ref #'Sort]]]]
   [:detail {:optional true}
    [:or [:ref #'FieldDefWithoutScale]
     [:vector [:ref #'FieldDefWithoutScale]]]]])

(def GenericUnitSpec_Encoding_AnyMark_
  [:map
   {:closed true,
    :json-schema/original-name "GenericUnitSpec<Encoding,AnyMark>"}
   [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'Encoding]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:mark [:ref #'AnyMark]] [:name {:optional true} string?]
   [:params {:optional true} [:vector [:ref #'SelectionParameter]]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:projection {:optional true} [:ref #'Projection]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def UnitSpec
  [:ref {:json-schema/original-name "GenericUnitSpec<Encoding,AnyMark>"}
   #'GenericUnitSpec_Encoding_AnyMark_])

(def LayerSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'SharedEncoding]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:name {:optional true} string?]
   [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:layer [:vector [:or [:ref #'LayerSpec] [:ref #'UnitSpec]]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:projection {:optional true} [:ref #'Projection]]
   [:view {:optional true} [:ref #'ViewBackground]]
   [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def LayerRepeatMapping primitives/LayerRepeatMapping)

(def LayerRepeatSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:columns {:optional true} number?] [:name {:optional true} string?]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:spec [:or [:ref #'LayerSpec] [:ref #'UnitSpecWithFrame]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:repeat [:ref #'LayerRepeatMapping]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def RepeatSpec [:or [:ref #'NonLayerRepeatSpec] [:ref #'LayerRepeatSpec]])

(def Header
  [:map {:closed true}
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labels {:optional true} boolean?]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:format {:optional true} [:ref #'Format]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleAngle {:optional true} number?]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'Orient]]
   [:titleAnchor {:optional true} [:ref #'TitleAnchor]]
   [:labelColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:labelAngle {:optional true} number?]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelExpr {:optional true} string?]
   [:titleOrient {:optional true} [:ref #'Orient]]
   [:formatType {:optional true} string?]
   [:titleColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelAnchor {:optional true} [:ref #'TitleAnchor]]
   [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelOrient {:optional true} [:ref #'Orient]]
   [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]])

(def FacetFieldDef
  [:map {:closed true} [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:header {:optional true} [:or [:ref #'Header] nil?]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true}
    [:or [:ref #'SortArray] [:ref #'SortOrder] [:ref #'EncodingSortField]
     nil?]]])

(def FacetEncodingFieldDef
  [:map {:closed true}
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]] [:columns {:optional true} number?]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:header {:optional true} [:or [:ref #'Header] nil?]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true}
    [:or [:ref #'SortArray] [:ref #'SortOrder] [:ref #'EncodingSortField] nil?]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]])

(def RowColumnEncodingFieldDef
  [:map {:closed true} [:align {:optional true} [:ref #'LayoutAlign]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:header {:optional true} [:or [:ref #'Header] nil?]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:center {:optional true} boolean?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true}
    [:or [:ref #'SortArray] [:ref #'SortOrder] [:ref #'EncodingSortField] nil?]]
   [:spacing {:optional true} number?]])

(def FacetedEncoding
  [:map {:closed true} [:y {:optional true} [:ref #'PositionDef]]
   [:description {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition]]]
   [:strokeOpacity {:optional true} [:ref #'NumericMarkPropDef]]
   [:xError2 {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:stroke {:optional true} [:ref #'ColorDef]]
   [:color {:optional true} [:ref #'ColorDef]]
   [:key {:optional true} [:ref #'FieldDefWithoutScale]]
   [:longitude2 {:optional true} [:ref #'Position2Def]]
   [:fill {:optional true} [:ref #'ColorDef]]
   [:strokeDash {:optional true} [:ref #'NumericArrayMarkPropDef]]
   [:time {:optional true} [:ref #'TimeDef]]
   [:facet {:optional true} [:ref #'FacetEncodingFieldDef]]
   [:longitude {:optional true} [:ref #'LatLongDef]]
   [:fillOpacity {:optional true} [:ref #'NumericMarkPropDef]]
   [:angle {:optional true} [:ref #'NumericMarkPropDef]]
   [:theta {:optional true} [:ref #'PolarDef]]
   [:radius {:optional true} [:ref #'PolarDef]]
   [:theta2 {:optional true} [:ref #'Position2Def]]
   [:size {:optional true} [:ref #'NumericMarkPropDef]]
   [:column {:optional true} [:ref #'RowColumnEncodingFieldDef]]
   [:yError {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:strokeWidth {:optional true} [:ref #'NumericMarkPropDef]]
   [:opacity {:optional true} [:ref #'NumericMarkPropDef]]
   [:shape {:optional true} [:ref #'ShapeDef]]
   [:url {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition]]]
   [:latitude {:optional true} [:ref #'LatLongDef]]
   [:order {:optional true}
    [:or [:ref #'OrderFieldDef] [:ref #'OrderValueDef] [:ref #'OrderOnlyDef]
     [:vector [:ref #'OrderFieldDef]]]]
   [:xError {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:yError2 {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:yOffset {:optional true} [:ref #'OffsetDef]]
   [:x {:optional true} [:ref #'PositionDef]]
   [:y2 {:optional true} [:ref #'Position2Def]]
   [:radius2 {:optional true} [:ref #'Position2Def]]
   [:x2 {:optional true} [:ref #'Position2Def]]
   [:latitude2 {:optional true} [:ref #'Position2Def]]
   [:href {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition]]]
   [:tooltip {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition] [:vector [:ref #'StringFieldDef]]
     nil?]] [:row {:optional true} [:ref #'RowColumnEncodingFieldDef]]
   [:text {:optional true} [:ref #'TextDef]]
   [:xOffset {:optional true} [:ref #'OffsetDef]]
   [:detail {:optional true}
    [:or [:ref #'FieldDefWithoutScale]
     [:vector [:ref #'FieldDefWithoutScale]]]]])

(def FacetedUnitSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'FacetedEncoding]]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:mark [:ref #'AnyMark]] [:name {:optional true} string?]
   [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:params {:optional true} [:vector [:ref #'SelectionParameter]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:projection {:optional true} [:ref #'Projection]]
   [:view {:optional true} [:ref #'ViewBackground]]
   [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def FacetMapping
  [:map {:closed true} [:column {:optional true} [:ref #'FacetFieldDef]]
   [:row {:optional true} [:ref #'FacetFieldDef]]])

(def FacetSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:columns {:optional true} number?] [:name {:optional true} string?]
   [:facet [:or [:ref #'FacetFieldDef] [:ref #'FacetMapping]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:spec [:or [:ref #'LayerSpec] [:ref #'FacetedUnitSpec]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def VConcatSpec_GenericSpec_
  [:map {:closed true, :json-schema/original-name "VConcatSpec<GenericSpec>"}
   [:description {:optional true} string?]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:name {:optional true} string?]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true} boolean?]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:vconcat [:vector [:ref #'Spec]]] [:spacing {:optional true} number?]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def Spec
  [:or [:ref #'FacetedUnitSpec] [:ref #'LayerSpec] [:ref #'RepeatSpec]
   [:ref #'FacetSpec]
   [:ref {:json-schema/original-name "ConcatSpec<GenericSpec>"}
    #'ConcatSpec_GenericSpec_]
   [:ref {:json-schema/original-name "VConcatSpec<GenericSpec>"}
    #'VConcatSpec_GenericSpec_]
   [:ref {:json-schema/original-name "HConcatSpec<GenericSpec>"}
    #'HConcatSpec_GenericSpec_]])

(def ConcatSpec_GenericSpec_
  [:map {:closed true, :json-schema/original-name "ConcatSpec<GenericSpec>"}
   [:description {:optional true} string?]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:concat [:vector [:ref #'Spec]]] [:columns {:optional true} number?]
   [:name {:optional true} string?]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def RangeRawArray primitives/RangeRawArray)

(def RangeRaw
  [:vector [:or nil? boolean? string? number? [:ref #'RangeRawArray]]])

(def RangeScheme
  [:or [:ref #'RangeEnum] [:ref #'RangeRaw]
   [:map {:closed true} [:count {:optional true} number?]
    [:extent {:optional true} [:vector number?]]
    [:scheme [:or string? [:vector string?] [:ref #'ColorScheme]]]]])

(def RangeConfig
  [:map {:closed false}
   [:category {:optional true}
    [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
   [:diverging {:optional true}
    [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
   [:heatmap {:optional true}
    [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
   [:ordinal {:optional true}
    [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
   [:ramp {:optional true} [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
   [:symbol {:optional true} [:vector [:ref #'SymbolShape]]]])

(def LegendConfig
  [:map {:closed true}
   [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:disable {:optional true} boolean?]
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:gridAlign {:optional true} [:or [:ref #'LayoutAlign] [:ref #'ExprRef]]]
   [:symbolSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientDirection {:optional true}
    [:or [:ref #'Orientation] [:ref #'ExprRef]]]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelOverlap {:optional true} [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
   [:gradientStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientThickness {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:layout {:optional true} [:ref #'ExprRef]]
   [:labelOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columns {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columnPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:clipHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:gradientVerticalMaxLength {:optional true} number?]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:symbolDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:unselectedOpacity {:optional true} number?]
   [:labelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'LegendOrient]]
   [:gradientLabelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAnchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:gradientStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:labelColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:title {:optional true} nil?]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:symbolFillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:gradientVerticalMinLength {:optional true} number?]
   [:titleOrient {:optional true} [:or [:ref #'Orient] [:ref #'ExprRef]]]
   [:tickCount {:optional true} [:or [:ref #'TickCount] [:ref #'ExprRef]]]
   [:symbolDirection {:optional true}
    [:or [:ref #'Orientation] [:ref #'ExprRef]]]
   [:titleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientHorizontalMaxLength {:optional true} number?]
   [:symbolBaseFillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:legendX {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:symbolOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientLength {:optional true} [:or number? [:ref #'ExprRef]]]
   [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:strokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:gradientLabelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:rowPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:symbolType {:optional true} [:or [:ref #'SymbolShape] [:ref #'ExprRef]]]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:symbolBaseStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:gradientHorizontalMinLength {:optional true} number?]
   [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:zindex {:optional true} [:or number? [:ref #'ExprRef]]]
   [:direction {:optional true} [:ref #'Orientation]]
   [:symbolStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:legendY {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolLimit {:optional true} [:or number? [:ref #'ExprRef]]]])

(def IntervalSelectionConfigWithoutType
  [:map {:closed true}
   [:clear {:optional true} [:or [:ref #'Stream] string? boolean?]]
   [:encodings {:optional true} [:vector [:ref #'SingleDefUnitChannel]]]
   [:fields {:optional true} [:vector [:ref #'FieldName]]]
   [:mark {:optional true} [:ref #'BrushConfig]]
   [:on {:optional true} [:or [:ref #'Stream] string?]]
   [:resolve {:optional true} [:ref #'SelectionResolution]]
   [:translate {:optional true} [:or string? boolean?]]
   [:zoom {:optional true} [:or string? boolean?]]])

(def PointSelectionConfigWithoutType
  [:map {:closed true}
   [:clear {:optional true} [:or [:ref #'Stream] string? boolean?]]
   [:encodings {:optional true} [:vector [:ref #'SingleDefUnitChannel]]]
   [:fields {:optional true} [:vector [:ref #'FieldName]]]
   [:nearest {:optional true} boolean?]
   [:on {:optional true} [:or [:ref #'Stream] string?]]
   [:resolve {:optional true} [:ref #'SelectionResolution]]
   [:toggle {:optional true} [:or string? boolean?]]])

(def SelectionConfig
  [:map {:closed true}
   [:interval {:optional true} [:ref #'IntervalSelectionConfigWithoutType]]
   [:point {:optional true} [:ref #'PointSelectionConfigWithoutType]]])

(def ProjectionConfig [:ref #'Projection])

(def TopLevelSelectionParameter
  [:map {:closed true}
   [:bind {:optional true}
    [:or [:ref #'Binding] [:ref #'LegendBinding] [:map-of any? any?]
     [:enum "scales"]]] [:name [:ref #'ParameterName]]
   [:select
    [:or [:ref #'SelectionType] [:ref #'PointSelectionConfig]
     [:ref #'IntervalSelectionConfig]]]
   [:value {:optional true}
    [:or [:ref #'SelectionInit] [:ref #'SelectionInitIntervalMapping]
     [:vector [:ref #'SelectionInitMapping]]]]
   [:views {:optional true} [:vector string?]]])

(def VariableParameter
  [:map {:closed true} [:bind {:optional true} [:ref #'Binding]]
   [:expr {:optional true} [:ref #'Expr]] [:name [:ref #'ParameterName]]
   [:react {:optional true} boolean?] [:value {:optional true} any?]])

(def TopLevelParameter
  [:or [:ref #'VariableParameter] [:ref #'TopLevelSelectionParameter]])

(def HeaderConfig
  [:map {:closed true}
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labels {:optional true} boolean?]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:format {:optional true} [:ref #'Format]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleAngle {:optional true} number?]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'Orient]]
   [:titleAnchor {:optional true} [:ref #'TitleAnchor]]
   [:labelColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:title {:optional true} nil?] [:labelAngle {:optional true} number?]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelExpr {:optional true} string?]
   [:titleOrient {:optional true} [:ref #'Orient]]
   [:formatType {:optional true} string?]
   [:titleColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelAnchor {:optional true} [:ref #'TitleAnchor]]
   [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelOrient {:optional true} [:ref #'Orient]]
   [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]])

(def ErrorBarConfig
  [:map {:closed true} [:extent {:optional true} [:ref #'ErrorBarExtent]]
   [:rule {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:size {:optional true} number?] [:thickness {:optional true} number?]
   [:ticks {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]])

(def ErrorBandConfig
  [:map {:closed true}
   [:band {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:borders {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
   [:extent {:optional true} [:ref #'ErrorBarExtent]]
   [:interpolate {:optional true} [:ref #'Interpolate]]
   [:tension {:optional true} number?]])

(def Padding primitives/Padding)

(def FormatConfig primitives/FormatConfig)

(def Vector2_string_ primitives/Vector2_string_)

(def Vector12_string_ primitives/Vector12_string_)

(def Vector7_string_ primitives/Vector7_string_)

(def TimeLocale
  [:map {:closed true} [:date string?] [:dateTime string?]
   [:days
    [:ref {:json-schema/original-name "Vector7<string>"} #'Vector7_string_]]
   [:months
    [:ref {:json-schema/original-name "Vector12<string>"} #'Vector12_string_]]
   [:periods
    [:ref {:json-schema/original-name "Vector2<string>"} #'Vector2_string_]]
   [:shortDays
    [:ref {:json-schema/original-name "Vector7<string>"} #'Vector7_string_]]
   [:shortMonths
    [:ref {:json-schema/original-name "Vector12<string>"} #'Vector12_string_]]
   [:time string?]])

(def Vector10_string_ primitives/Vector10_string_)

(def NumberLocale
  [:map {:closed true}
   [:currency
    [:ref {:json-schema/original-name "Vector2<string>"} #'Vector2_string_]]
   [:decimal string?] [:grouping [:vector number?]]
   [:minus {:optional true} string?] [:nan {:optional true} string?]
   [:numerals {:optional true}
    [:ref {:json-schema/original-name "Vector10<string>"} #'Vector10_string_]]
   [:percent {:optional true} string?] [:thousands string?]])

(def Locale
  [:map {:closed true} [:number {:optional true} [:ref #'NumberLocale]]
   [:time {:optional true} [:ref #'TimeLocale]]])

(def ViewConfig
  [:map {:closed true}
   [:discreteHeight {:optional true}
    [:or number? [:map {:closed true} [:step number?]]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:stroke {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
   [:clip {:optional true} boolean?]
   [:discreteWidth {:optional true}
    [:or number? [:map {:closed true} [:step number?]]]]
   [:fill {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:cursor {:optional true} [:ref #'Cursor]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:continuousWidth {:optional true} number?]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:continuousHeight {:optional true} number?]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:step {:optional true} number?]])

(def StyleConfigIndex
  [:map {:closed false} [:tick {:optional true} [:ref #'TickConfig]]
   [:geoshape {:optional true} [:ref #'MarkConfig]]
   [:group-title {:optional true} [:ref #'MarkConfig]]
   [:arc {:optional true} [:ref #'RectConfig]]
   [:mark {:optional true} [:ref #'MarkConfig]]
   [:bar {:optional true} [:ref #'BarConfig]]
   [:rule {:optional true} [:ref #'MarkConfig]]
   [:guide-label {:optional true} [:ref #'MarkConfig]]
   [:circle {:optional true} [:ref #'MarkConfig]]
   [:trail {:optional true} [:ref #'LineConfig]]
   [:line {:optional true} [:ref #'LineConfig]]
   [:square {:optional true} [:ref #'MarkConfig]]
   [:image {:optional true} [:ref #'RectConfig]]
   [:point {:optional true} [:ref #'MarkConfig]]
   [:area {:optional true} [:ref #'AreaConfig]]
   [:group-subtitle {:optional true} [:ref #'MarkConfig]]
   [:guide-title {:optional true} [:ref #'MarkConfig]]
   [:rect {:optional true} [:ref #'RectConfig]]
   [:text {:optional true} [:ref #'MarkConfig]]])

(def ScaleInvalidDataShowAsValue__strokeWidth__
  primitives/ScaleInvalidDataShowAsValue__strokeWidth__)

(def ScaleInvalidDataShowAs__strokeWidth__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeWidth\">"}
   [:ref
    {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"strokeWidth\">"}
    #'ScaleInvalidDataShowAsValue__strokeWidth__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__angle__
  primitives/ScaleInvalidDataShowAsValue__angle__)

(def ScaleInvalidDataShowAs__angle__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"angle\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"angle\">"}
    #'ScaleInvalidDataShowAsValue__angle__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__radius__
  primitives/ScaleInvalidDataShowAsValue__radius__)

(def ScaleInvalidDataShowAs__radius__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"radius\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"radius\">"}
    #'ScaleInvalidDataShowAsValue__radius__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__strokeOpacity__
  primitives/ScaleInvalidDataShowAsValue__strokeOpacity__)

(def ScaleInvalidDataShowAs__strokeOpacity__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeOpacity\">"}
   [:ref
    {:json-schema/original-name
       "ScaleInvalidDataShowAsValue<\"strokeOpacity\">"}
    #'ScaleInvalidDataShowAsValue__strokeOpacity__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__yOffset__
  primitives/ScaleInvalidDataShowAsValue__yOffset__)

(def ScaleInvalidDataShowAs__yOffset__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"yOffset\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"yOffset\">"}
    #'ScaleInvalidDataShowAsValue__yOffset__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__fill__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"fill\">"}
   [:value {:optional true} [:or [:ref #'Color] [:ref #'Gradient] nil?]]])

(def ScaleInvalidDataShowAs__fill__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"fill\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"fill\">"}
    #'ScaleInvalidDataShowAsValue__fill__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__theta__
  primitives/ScaleInvalidDataShowAsValue__theta__)

(def ScaleInvalidDataShowAs__theta__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"theta\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"theta\">"}
    #'ScaleInvalidDataShowAsValue__theta__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__time__
  primitives/ScaleInvalidDataShowAsValue__time__)

(def ScaleInvalidDataShowAs__time__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"time\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"time\">"}
    #'ScaleInvalidDataShowAsValue__time__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__color__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"color\">"}
   [:value {:optional true} [:or [:ref #'Color] [:ref #'Gradient]]]])

(def ScaleInvalidDataShowAs__color__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"color\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"color\">"}
    #'ScaleInvalidDataShowAsValue__color__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__size__
  primitives/ScaleInvalidDataShowAsValue__size__)

(def ScaleInvalidDataShowAs__size__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"size\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"size\">"}
    #'ScaleInvalidDataShowAsValue__size__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__shape__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"shape\">"}
   [:value {:optional true} [:or [:ref #'SymbolShape] string?]]])

(def ScaleInvalidDataShowAs__shape__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"shape\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"shape\">"}
    #'ScaleInvalidDataShowAsValue__shape__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__stroke__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"stroke\">"}
   [:value {:optional true} [:or [:ref #'Color] [:ref #'Gradient] nil?]]])

(def ScaleInvalidDataShowAs__stroke__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"stroke\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"stroke\">"}
    #'ScaleInvalidDataShowAsValue__stroke__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__xOffset__
  primitives/ScaleInvalidDataShowAsValue__xOffset__)

(def ScaleInvalidDataShowAs__xOffset__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"xOffset\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"xOffset\">"}
    #'ScaleInvalidDataShowAsValue__xOffset__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__strokeDash__
  primitives/ScaleInvalidDataShowAsValue__strokeDash__)

(def ScaleInvalidDataShowAs__strokeDash__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeDash\">"}
   [:ref
    {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"strokeDash\">"}
    #'ScaleInvalidDataShowAsValue__strokeDash__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__y__
  primitives/ScaleInvalidDataShowAsValue__y__)

(def ScaleInvalidDataShowAs__y__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"y\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"y\">"}
    #'ScaleInvalidDataShowAsValue__y__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__x__
  primitives/ScaleInvalidDataShowAsValue__x__)

(def ScaleInvalidDataShowAs__x__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"x\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"x\">"}
    #'ScaleInvalidDataShowAsValue__x__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__fillOpacity__
  primitives/ScaleInvalidDataShowAsValue__fillOpacity__)

(def ScaleInvalidDataShowAs__fillOpacity__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"fillOpacity\">"}
   [:ref
    {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"fillOpacity\">"}
    #'ScaleInvalidDataShowAsValue__fillOpacity__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__opacity__
  primitives/ScaleInvalidDataShowAsValue__opacity__)

(def ScaleInvalidDataShowAs__opacity__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"opacity\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"opacity\">"}
    #'ScaleInvalidDataShowAsValue__opacity__] [:enum "zero-or-min"]])

(def ScaleInvalidDataConfig
  [:map {:closed true}
   [:y {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"y\">"}
     #'ScaleInvalidDataShowAs__y__]]
   [:strokeOpacity {:optional true}
    [:ref
     {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeOpacity\">"}
     #'ScaleInvalidDataShowAs__strokeOpacity__]]
   [:stroke {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"stroke\">"}
     #'ScaleInvalidDataShowAs__stroke__]]
   [:color {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"color\">"}
     #'ScaleInvalidDataShowAs__color__]]
   [:fill {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"fill\">"}
     #'ScaleInvalidDataShowAs__fill__]]
   [:strokeDash {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeDash\">"}
     #'ScaleInvalidDataShowAs__strokeDash__]]
   [:time {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"time\">"}
     #'ScaleInvalidDataShowAs__time__]]
   [:fillOpacity {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"fillOpacity\">"}
     #'ScaleInvalidDataShowAs__fillOpacity__]]
   [:angle {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"angle\">"}
     #'ScaleInvalidDataShowAs__angle__]]
   [:theta {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"theta\">"}
     #'ScaleInvalidDataShowAs__theta__]]
   [:radius {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"radius\">"}
     #'ScaleInvalidDataShowAs__radius__]]
   [:size {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"size\">"}
     #'ScaleInvalidDataShowAs__size__]]
   [:strokeWidth {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeWidth\">"}
     #'ScaleInvalidDataShowAs__strokeWidth__]]
   [:opacity {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"opacity\">"}
     #'ScaleInvalidDataShowAs__opacity__]]
   [:shape {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"shape\">"}
     #'ScaleInvalidDataShowAs__shape__]]
   [:yOffset {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"yOffset\">"}
     #'ScaleInvalidDataShowAs__yOffset__]]
   [:x {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"x\">"}
     #'ScaleInvalidDataShowAs__x__]]
   [:xOffset {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"xOffset\">"}
     #'ScaleInvalidDataShowAs__xOffset__]]])

(def ScaleConfig
  [:map {:closed true} [:zero {:optional true} boolean?]
   [:bandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:barBandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:xReverse {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:maxOpacity {:optional true} number?]
   [:quantizeCount {:optional true} number?]
   [:rectBandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:continuousPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:bandWithNestedOffsetPaddingOuter {:optional true}
    [:or number? [:ref #'ExprRef]]] [:quantileCount {:optional true} number?]
   [:useUnaggregatedDomain {:optional true} boolean?]
   [:invalid {:optional true} [:ref #'ScaleInvalidDataConfig]]
   [:maxBandSize {:optional true} number?]
   [:bandPaddingOuter {:optional true} [:or number? [:ref #'ExprRef]]]
   [:minSize {:optional true} number?]
   [:animationDuration {:optional true} number?]
   [:round {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:offsetBandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tickBandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:minFontSize {:optional true} number?]
   [:offsetBandPaddingOuter {:optional true} [:or number? [:ref #'ExprRef]]]
   [:minBandSize {:optional true} number?]
   [:maxStrokeWidth {:optional true} number?]
   [:maxFontSize {:optional true} number?]
   [:minOpacity {:optional true} number?] [:maxSize {:optional true} number?]
   [:bandWithNestedOffsetPaddingInner {:optional true}
    [:or number? [:ref #'ExprRef]]]
   [:clamp {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:framesPerSecond {:optional true} number?]
   [:minStrokeWidth {:optional true} number?]
   [:pointPadding {:optional true} [:or number? [:ref #'ExprRef]]]])

(def TitleConfig [:ref #'BaseTitleNoValueRefs])

(def Config
  [:map {:closed true} [:tick {:optional true} [:ref #'TickConfig]]
   [:axisTemporal {:optional true} [:ref #'AxisConfig]]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:headerColumn {:optional true} [:ref #'HeaderConfig]]
   [:normalizedNumberFormat {:optional true} string?]
   [:axisTop {:optional true} [:ref #'AxisConfig]]
   [:tooltipFormat {:optional true} [:ref #'FormatConfig]]
   [:headerRow {:optional true} [:ref #'HeaderConfig]]
   [:axisLeft {:optional true} [:ref #'AxisConfig]]
   [:geoshape {:optional true} [:ref #'MarkConfig]]
   [:errorbar {:optional true} [:ref #'ErrorBarConfig]]
   [:axisY {:optional true} [:ref #'AxisConfig]]
   [:arc {:optional true} [:ref #'RectConfig]]
   [:axisYBand {:optional true} [:ref #'AxisConfig]]
   [:scale {:optional true} [:ref #'ScaleConfig]]
   [:locale {:optional true} [:ref #'Locale]]
   [:mark {:optional true} [:ref #'MarkConfig]]
   [:bar {:optional true} [:ref #'BarConfig]]
   [:concat {:optional true} [:ref #'CompositionConfig]]
   [:axisQuantitative {:optional true} [:ref #'AxisConfig]]
   [:axisXBand {:optional true} [:ref #'AxisConfig]]
   [:countTitle {:optional true} string?]
   [:rule {:optional true} [:ref #'MarkConfig]]
   [:axisYDiscrete {:optional true} [:ref #'AxisConfig]]
   [:facet {:optional true} [:ref #'CompositionConfig]]
   [:circle {:optional true} [:ref #'MarkConfig]]
   [:axisBottom {:optional true} [:ref #'AxisConfig]]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:legend {:optional true} [:ref #'LegendConfig]]
   [:timeFormatType {:optional true} string?]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:axisBand {:optional true} [:ref #'AxisConfig]]
   [:header {:optional true} [:ref #'HeaderConfig]]
   [:font {:optional true} string?]
   [:trail {:optional true} [:ref #'LineConfig]]
   [:title {:optional true} [:ref #'TitleConfig]]
   [:axisX {:optional true} [:ref #'AxisConfig]]
   [:fieldTitle {:optional true} [:enum "verbal" "functional" "plain"]]
   [:axisPoint {:optional true} [:ref #'AxisConfig]]
   [:axisYTemporal {:optional true} [:ref #'AxisConfig]]
   [:numberFormat {:optional true} string?]
   [:normalizedNumberFormatType {:optional true} string?]
   [:style {:optional true} [:ref #'StyleConfigIndex]]
   [:axisYQuantitative {:optional true} [:ref #'AxisConfig]]
   [:axisXTemporal {:optional true} [:ref #'AxisConfig]]
   [:axisRight {:optional true} [:ref #'AxisConfig]]
   [:errorband {:optional true} [:ref #'ErrorBandConfig]]
   [:axisXQuantitative {:optional true} [:ref #'AxisConfig]]
   [:axisXPoint {:optional true} [:ref #'AxisConfig]]
   [:aria {:optional true} boolean?]
   [:line {:optional true} [:ref #'LineConfig]]
   [:axisXDiscrete {:optional true} [:ref #'AxisConfig]]
   [:square {:optional true} [:ref #'MarkConfig]]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:customFormatTypes {:optional true} boolean?]
   [:image {:optional true} [:ref #'RectConfig]]
   [:point {:optional true} [:ref #'MarkConfig]]
   [:area {:optional true} [:ref #'AreaConfig]]
   [:headerFacet {:optional true} [:ref #'HeaderConfig]]
   [:axis {:optional true} [:ref #'AxisConfig]]
   [:axisYPoint {:optional true} [:ref #'AxisConfig]]
   [:selection {:optional true} [:ref #'SelectionConfig]]
   [:rect {:optional true} [:ref #'RectConfig]]
   [:timeFormat {:optional true} string?]
   [:projection {:optional true} [:ref #'ProjectionConfig]]
   [:boxplot {:optional true} [:ref #'BoxPlotConfig]]
   [:view {:optional true} [:ref #'ViewConfig]]
   [:range {:optional true} [:ref #'RangeConfig]]
   [:numberFormatType {:optional true} string?]
   [:axisDiscrete {:optional true} [:ref #'AxisConfig]]
   [:text {:optional true} [:ref #'MarkConfig]]])

(def Dict_InlineDataset_ primitives/Dict_InlineDataset_)

(def Datasets
  [:ref {:json-schema/original-name "Dict<InlineDataset>"}
   #'Dict_InlineDataset_])

(def ParseValue primitives/ParseValue)

(def Vector2_DateTime_
  [:vector {:json-schema/original-name "Vector2<DateTime>"} [:ref #'DateTime]])

(def Vector2_boolean_ primitives/Vector2_boolean_)

(def SelectionInitInterval
  [:or [:ref {:json-schema/original-name "Vector2<boolean>"} #'Vector2_boolean_]
   [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]
   [:ref {:json-schema/original-name "Vector2<string>"} #'Vector2_string_]
   [:ref {:json-schema/original-name "Vector2<DateTime>"} #'Vector2_DateTime_]])

(def TopLevelConcatSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]] [:datasets {:optional true} [:ref #'Datasets]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:usermeta {:optional true} [:ref #'Dict]]
   [:config {:optional true} [:ref #'Config]]
   [:concat [:vector [:ref #'NonNormalizedSpec]]]
   [:columns {:optional true} number?] [:name {:optional true} string?]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:$schema {:optional true} string?]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def TopLevelFacetSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]] [:datasets {:optional true} [:ref #'Datasets]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:usermeta {:optional true} [:ref #'Dict]]
   [:config {:optional true} [:ref #'Config]]
   [:columns {:optional true} number?] [:name {:optional true} string?]
   [:facet [:or [:ref #'FacetFieldDef] [:ref #'FacetMapping]]]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:spec [:or [:ref #'LayerSpec] [:ref #'UnitSpecWithFrame]]]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:$schema {:optional true} string?]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data [:or [:ref #'Data] nil?]]])

(def TopLevelHConcatSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:datasets {:optional true} [:ref #'Datasets]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:hconcat [:vector [:ref #'NonNormalizedSpec]]]
   [:usermeta {:optional true} [:ref #'Dict]]
   [:config {:optional true} [:ref #'Config]] [:name {:optional true} string?]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true} boolean?]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:$schema {:optional true} string?] [:spacing {:optional true} number?]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def TopLevelLayerSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'SharedEncoding]]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:datasets {:optional true} [:ref #'Datasets]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:usermeta {:optional true} [:ref #'Dict]]
   [:config {:optional true} [:ref #'Config]] [:name {:optional true} string?]
   [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:layer [:vector [:or [:ref #'LayerSpec] [:ref #'UnitSpec]]]]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:$schema {:optional true} string?]
   [:projection {:optional true} [:ref #'Projection]]
   [:view {:optional true} [:ref #'ViewBackground]]
   [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def TopLevelRepeatSpec
  [:or
   [:map {:closed true} [:description {:optional true} string?]
    [:autosize {:optional true}
     [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
    [:align {:optional true}
     [:or [:ref #'LayoutAlign]
      [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
       #'RowCol_LayoutAlign_]]] [:datasets {:optional true} [:ref #'Datasets]]
    [:transform {:optional true} [:vector [:ref #'Transform]]]
    [:usermeta {:optional true} [:ref #'Dict]]
    [:config {:optional true} [:ref #'Config]]
    [:columns {:optional true} number?] [:name {:optional true} string?]
    [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
    [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
    [:bounds {:optional true} [:enum "full" "flush"]]
    [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
    [:center {:optional true}
     [:or boolean?
      [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
    [:spec [:ref #'NonNormalizedSpec]]
    [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
    [:resolve {:optional true} [:ref #'Resolve]]
    [:repeat [:or [:vector string?] [:ref #'RepeatMapping]]]
    [:$schema {:optional true} string?]
    [:spacing {:optional true}
     [:or number?
      [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
    [:data {:optional true} [:or [:ref #'Data] nil?]]]
   [:map {:closed true} [:description {:optional true} string?]
    [:autosize {:optional true}
     [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
    [:align {:optional true}
     [:or [:ref #'LayoutAlign]
      [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
       #'RowCol_LayoutAlign_]]] [:datasets {:optional true} [:ref #'Datasets]]
    [:transform {:optional true} [:vector [:ref #'Transform]]]
    [:usermeta {:optional true} [:ref #'Dict]]
    [:config {:optional true} [:ref #'Config]]
    [:columns {:optional true} number?] [:name {:optional true} string?]
    [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
    [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
    [:bounds {:optional true} [:enum "full" "flush"]]
    [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
    [:center {:optional true}
     [:or boolean?
      [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
    [:spec [:or [:ref #'LayerSpec] [:ref #'UnitSpecWithFrame]]]
    [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
    [:resolve {:optional true} [:ref #'Resolve]]
    [:repeat [:ref #'LayerRepeatMapping]] [:$schema {:optional true} string?]
    [:spacing {:optional true}
     [:or number?
      [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
    [:data {:optional true} [:or [:ref #'Data] nil?]]]])

(def TopLevelVConcatSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:datasets {:optional true} [:ref #'Datasets]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:usermeta {:optional true} [:ref #'Dict]]
   [:config {:optional true} [:ref #'Config]] [:name {:optional true} string?]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true} boolean?]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:$schema {:optional true} string?]
   [:vconcat [:vector [:ref #'NonNormalizedSpec]]]
   [:spacing {:optional true} number?]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def TopLevelUnitSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'FacetedEncoding]]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]] [:datasets {:optional true} [:ref #'Datasets]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:usermeta {:optional true} [:ref #'Dict]]
   [:config {:optional true} [:ref #'Config]] [:mark [:ref #'AnyMark]]
   [:name {:optional true} string?]
   [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:$schema {:optional true} string?]
   [:projection {:optional true} [:ref #'Projection]]
   [:view {:optional true} [:ref #'ViewBackground]]
   [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data [:or [:ref #'Data] nil?]]])

(def TopLevelSpec
  [:or [:ref #'TopLevelUnitSpec] [:ref #'TopLevelFacetSpec]
   [:ref #'TopLevelLayerSpec] [:ref #'TopLevelRepeatSpec]
   [:ref #'TopLevelConcatSpec] [:ref #'TopLevelVConcatSpec]
   [:ref #'TopLevelHConcatSpec]])

(def schema [:ref #'TopLevelSpec])
