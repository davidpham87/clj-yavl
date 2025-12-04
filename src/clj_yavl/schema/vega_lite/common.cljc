(ns clj-yavl.schema.vega-lite.common
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]))

(def FieldName primitives/FieldName)

(def ArgminDef [:map {:closed true}
   [:argmin [:ref #'FieldName]]])

(def NonArgAggregateOp primitives/NonArgAggregateOp)

(def ArgmaxDef [:map {:closed true}
   [:argmax [:ref #'FieldName]]])

(def Aggregate
  [:or [:ref #'NonArgAggregateOp] [:ref #'ArgmaxDef] [:ref #'ArgminDef]])

(def AggregateOp primitives/AggregateOp)

(def AggregatedFieldDef
  [:map {:closed true}
   [:as [:ref #'FieldName]]
   [:field {:optional true} [:ref #'FieldName]]
   [:op [:ref #'AggregateOp]]])

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
  [:map {:closed true}
   [:color [:ref #'Color]]
   [:offset number?]])

(def RadialGradient
  [:map {:closed true}
   [:gradient [:= "radial"]]
   [:id {:optional true} string?]
   [:r1 {:optional true} number?]
   [:r2 {:optional true} number?]
   [:stops [:vector [:ref #'GradientStop]]]
   [:x1 {:optional true} number?]
   [:x2 {:optional true} number?]
   [:y1 {:optional true} number?]
   [:y2 {:optional true} number?]])

(def LinearGradient
  [:map {:closed true}
   [:gradient [:= "linear"]]
   [:id {:optional true} string?]
   [:stops [:vector [:ref #'GradientStop]]]
   [:x1 {:optional true} number?]
   [:x2 {:optional true} number?]
   [:y1 {:optional true} number?]
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

(def RelativeBandSize primitives/RelativeBandSize)

(def Mark primitives/Mark)

(def LabelOverlap primitives/LabelOverlap)

(def TitleAnchor primitives/TitleAnchor)

(def LayoutAlign primitives/LayoutAlign)

(def RowCol_LayoutAlign_
  [:map {:closed true, :json-schema/original-name "RowCol<LayoutAlign>"}
   [:column {:optional true} [:ref #'LayoutAlign]]
   [:row {:optional true} [:ref #'LayoutAlign]]])

(def ResolveMode primitives/ResolveMode)

(def AxisResolveMap
  [:map {:closed true}
   [:x {:optional true} [:ref #'ResolveMode]]
   [:y {:optional true} [:ref #'ResolveMode]]])

(def LegendResolveMap
  [:map {:closed true}
   [:angle {:optional true} [:ref #'ResolveMode]]
   [:color {:optional true} [:ref #'ResolveMode]]
   [:fill {:optional true} [:ref #'ResolveMode]]
   [:fillOpacity {:optional true} [:ref #'ResolveMode]]
   [:opacity {:optional true} [:ref #'ResolveMode]]
   [:shape {:optional true} [:ref #'ResolveMode]]
   [:size {:optional true} [:ref #'ResolveMode]]
   [:stroke {:optional true} [:ref #'ResolveMode]]
   [:strokeDash {:optional true} [:ref #'ResolveMode]]
   [:strokeOpacity {:optional true} [:ref #'ResolveMode]]
   [:strokeWidth {:optional true} [:ref #'ResolveMode]]
   [:time {:optional true} [:ref #'ResolveMode]]])

(def ScaleResolveMap
  [:map {:closed true}
   [:angle {:optional true} [:ref #'ResolveMode]]
   [:color {:optional true} [:ref #'ResolveMode]]
   [:fill {:optional true} [:ref #'ResolveMode]]
   [:fillOpacity {:optional true} [:ref #'ResolveMode]]
   [:opacity {:optional true} [:ref #'ResolveMode]]
   [:radius {:optional true} [:ref #'ResolveMode]]
   [:shape {:optional true} [:ref #'ResolveMode]]
   [:size {:optional true} [:ref #'ResolveMode]]
   [:stroke {:optional true} [:ref #'ResolveMode]]
   [:strokeDash {:optional true} [:ref #'ResolveMode]]
   [:strokeOpacity {:optional true} [:ref #'ResolveMode]]
   [:strokeWidth {:optional true} [:ref #'ResolveMode]]
   [:theta {:optional true} [:ref #'ResolveMode]]
   [:time {:optional true} [:ref #'ResolveMode]]
   [:x {:optional true} [:ref #'ResolveMode]]
   [:xOffset {:optional true} [:ref #'ResolveMode]]
   [:y {:optional true} [:ref #'ResolveMode]]
   [:yOffset {:optional true} [:ref #'ResolveMode]]])

(def Resolve
  [:map {:closed true}
   [:axis {:optional true} [:ref #'AxisResolveMap]]
   [:legend {:optional true} [:ref #'LegendResolveMap]]
   [:scale {:optional true} [:ref #'ScaleResolveMap]]])
