(ns clj-yavl.schema.vega-lite.unit
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.common :as common]
            [clj-yavl.schema.vega-lite.mark :as mark]
            [clj-yavl.schema.vega-lite.encoding :as encoding]
            [clj-yavl.schema.vega-lite.transform :as transform]
            [clj-yavl.schema.vega-lite.projection :as projection]
            [clj-yavl.schema.vega-lite.selection :as selection]
            [clj-yavl.schema.vega-lite.config :as config]
            [clj-yavl.schema.vega-lite.data :as data]))

(def Text common/Text)
(def StepFor primitives/StepFor)
(def Dict primitives/Dict)
(def LayoutAlign primitives/LayoutAlign)
(def RowCol_LayoutAlign_ common/RowCol_LayoutAlign_)
(def RowCol_boolean_ primitives/RowCol_boolean_)
(def RowCol_number_ primitives/RowCol_number_)
(def Padding primitives/Padding)
(def AutosizeType primitives/AutosizeType)

(def AnyMark mark/AnyMark)
(def Encoding encoding/Encoding)
(def Transform transform/Transform)
(def SelectionParameter selection/SelectionParameter)
(def TitleParams config/TitleParams)
(def Projection projection/Projection)
(def ViewBackground config/ViewConfig) ;; Note: ViewBackground is not exactly ViewConfig, but for now assuming compatible or need redef.
;; Wait, I defined ViewBackground explicitly in previous step because ViewConfig is different.
;; I should stick to that definition.

(def ExprRef expr/ExprRef)
(def Color common/Color)
(def Cursor common/Cursor)
(def StrokeJoin common/StrokeJoin)
(def StrokeCap common/StrokeCap)

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

(def Step
  [:map {:closed true} [:for {:optional true} [:ref #'StepFor]]
   [:step number?]])

(def Data data/Data)
(def Config config/Config)
(def AutoSizeParams config/AutoSizeParams)
(def Datasets data/Datasets)
(def TopLevelParameter selection/TopLevelParameter)

(def ResolveMode primitives/ResolveMode)

(def AxisResolveMap
  [:map {:closed true} [:x {:optional true} [:ref #'ResolveMode]]
   [:y {:optional true} [:ref #'ResolveMode]]])

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

(def Resolve
  [:map {:closed true} [:axis {:optional true} [:ref #'AxisResolveMap]]
   [:legend {:optional true} [:ref #'LegendResolveMap]]
   [:scale {:optional true} [:ref #'ScaleResolveMap]]])

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

(def Header config/HeaderConfig)

(def FacetEncodingFieldDef
  [:map {:closed true}
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]] [:columns {:optional true} number?]
   [:field {:optional true} [:ref #'encoding/Field]]
   [:type {:optional true} [:ref #'encoding/StandardType]]
   [:header {:optional true} [:or [:ref #'Header] nil?]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'transform/BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'expr/TimeUnit] [:ref #'expr/BinnedTimeUnit] [:ref #'expr/TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'common/Aggregate]]
   [:sort {:optional true}
    [:or [:ref #'encoding/SortArray] [:ref #'common/SortOrder] [:ref #'encoding/EncodingSortField] nil?]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]])

(def RowColumnEncodingFieldDef
  [:map {:closed true} [:align {:optional true} [:ref #'LayoutAlign]]
   [:field {:optional true} [:ref #'encoding/Field]]
   [:type {:optional true} [:ref #'encoding/StandardType]]
   [:header {:optional true} [:or [:ref #'Header] nil?]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:center {:optional true} boolean?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'transform/BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'expr/TimeUnit] [:ref #'expr/BinnedTimeUnit] [:ref #'expr/TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'common/Aggregate]]
   [:sort {:optional true}
    [:or [:ref #'encoding/SortArray] [:ref #'common/SortOrder] [:ref #'encoding/EncodingSortField] nil?]]
   [:spacing {:optional true} number?]])

(def PositionDef encoding/PositionDef)
(def StringFieldDefWithCondition encoding/StringFieldDefWithCondition)
(def StringValueDefWithCondition encoding/StringValueDefWithCondition)
(def NumericMarkPropDef encoding/NumericMarkPropDef)
(def SecondaryFieldDef encoding/SecondaryFieldDef)
(def ValueDef_number_ primitives/ValueDef_number_)
(def ColorDef encoding/ColorDef)
(def FieldDefWithoutScale encoding/FieldDefWithoutScale)
(def Position2Def encoding/Position2Def)
(def NumericArrayMarkPropDef encoding/NumericArrayMarkPropDef)
(def TimeDef encoding/TimeDef)
(def LatLongDef encoding/LatLongDef)
(def PolarDef encoding/PolarDef)
(def ShapeDef encoding/ShapeDef)
(def OrderFieldDef encoding/OrderFieldDef)
(def OrderValueDef encoding/OrderValueDef)
(def OrderOnlyDef encoding/OrderOnlyDef)
(def OffsetDef encoding/OffsetDef)
(def StringFieldDef encoding/StringFieldDef)
(def TextDef encoding/TextDef)

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
