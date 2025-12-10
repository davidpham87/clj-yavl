(ns clj-yavl.schema.vega-lite.unit
  (:require [malli.util :as mu]
            [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.common :as common]
            [clj-yavl.schema.vega-lite.mark :as mark]
            [clj-yavl.schema.vega-lite.encoding :as encoding]
            [clj-yavl.schema.vega-lite.transform :as transform]
            [clj-yavl.schema.vega-lite.projection :as projection]
            [clj-yavl.schema.vega-lite.selection :as selection]
            [clj-yavl.schema.vega-lite.config :as config]
            [clj-yavl.schema.vega-lite.data :as data]
            [clj-yavl.schema.vega-lite.toplevel :as toplevel]))

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
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cursor {:optional true} [:ref #'Cursor]]
   [:fill {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:stroke {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
   [:strokeCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:style {:optional true} [:or string? [:vector string?]]]])

(def Step
  [:map {:closed true}
   [:for {:optional true} [:ref #'StepFor]]
   [:step number?]])

(def Data data/Data)
(def Config config/Config)
(def AutoSizeParams config/AutoSizeParams)
(def Datasets data/Datasets)
(def TopLevelParameter selection/TopLevelParameter)

(def Resolve common/Resolve)

(def UnitSpecWithFrame
  [:map {:closed true}
   [:data {:optional true} [:or [:ref #'Data] nil?]]
   [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'Encoding]]
   [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:mark [:ref #'AnyMark]]
   [:name {:optional true} string?]
   [:params {:optional true} [:vector [:ref #'SelectionParameter]]]
   [:projection {:optional true} [:ref #'Projection]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:view {:optional true} [:ref #'ViewBackground]]
   [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]])

(def GenericUnitSpec_Encoding_AnyMark_
  [:map
   {:closed true,
    :json-schema/original-name "GenericUnitSpec<Encoding,AnyMark>"}
   [:data {:optional true} [:or [:ref #'Data] nil?]]
   [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'Encoding]]
   [:mark [:ref #'AnyMark]]
   [:name {:optional true} string?]
   [:params {:optional true} [:vector [:ref #'SelectionParameter]]]
   [:projection {:optional true} [:ref #'Projection]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]])

(def UnitSpec
  [:ref {:json-schema/original-name "GenericUnitSpec<Encoding,AnyMark>"}
   #'GenericUnitSpec_Encoding_AnyMark_])

(def Header config/HeaderConfig)

(def FacetEncodingFieldDef
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'common/Aggregate]]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'transform/BinParams]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:columns {:optional true} number?]
   [:field {:optional true} [:ref #'encoding/Field]]
   [:header {:optional true} [:or [:ref #'Header] nil?]]
   [:sort {:optional true}
    [:or [:ref #'encoding/SortArray] [:ref #'common/SortOrder] [:ref #'encoding/EncodingSortField] nil?]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:timeUnit {:optional true}
    [:or [:ref #'expr/TimeUnit] [:ref #'expr/BinnedTimeUnit] [:ref #'expr/TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'encoding/StandardType]]])

(def RowColumnEncodingFieldDef
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'common/Aggregate]]
   [:align {:optional true} [:ref #'LayoutAlign]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'transform/BinParams]]]
   [:center {:optional true} boolean?]
   [:field {:optional true} [:ref #'encoding/Field]]
   [:header {:optional true} [:or [:ref #'Header] nil?]]
   [:sort {:optional true}
    [:or [:ref #'encoding/SortArray] [:ref #'common/SortOrder] [:ref #'encoding/EncodingSortField] nil?]]
   [:spacing {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'expr/TimeUnit] [:ref #'expr/BinnedTimeUnit] [:ref #'expr/TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'encoding/StandardType]]])

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
  [:map {:closed true}
   [:angle {:optional true} [:ref #'NumericMarkPropDef]]
   [:color {:optional true} [:ref #'ColorDef]]
   [:column {:optional true} [:ref #'RowColumnEncodingFieldDef]]
   [:description {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition]]]
   [:detail {:optional true}
    [:or [:ref #'FieldDefWithoutScale]
     [:vector [:ref #'FieldDefWithoutScale]]]]
   [:facet {:optional true} [:ref #'FacetEncodingFieldDef]]
   [:fill {:optional true} [:ref #'ColorDef]]
   [:fillOpacity {:optional true} [:ref #'NumericMarkPropDef]]
   [:href {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition]]]
   [:key {:optional true} [:ref #'FieldDefWithoutScale]]
   [:latitude {:optional true} [:ref #'LatLongDef]]
   [:latitude2 {:optional true} [:ref #'Position2Def]]
   [:longitude {:optional true} [:ref #'LatLongDef]]
   [:longitude2 {:optional true} [:ref #'Position2Def]]
   [:opacity {:optional true} [:ref #'NumericMarkPropDef]]
   [:order {:optional true}
    [:or [:ref #'OrderFieldDef] [:ref #'OrderValueDef] [:ref #'OrderOnlyDef]
     [:vector [:ref #'OrderFieldDef]]]]
   [:radius {:optional true} [:ref #'PolarDef]]
   [:radius2 {:optional true} [:ref #'Position2Def]]
   [:row {:optional true} [:ref #'RowColumnEncodingFieldDef]]
   [:shape {:optional true} [:ref #'ShapeDef]]
   [:size {:optional true} [:ref #'NumericMarkPropDef]]
   [:stroke {:optional true} [:ref #'ColorDef]]
   [:strokeDash {:optional true} [:ref #'NumericArrayMarkPropDef]]
   [:strokeOpacity {:optional true} [:ref #'NumericMarkPropDef]]
   [:strokeWidth {:optional true} [:ref #'NumericMarkPropDef]]
   [:text {:optional true} [:ref #'TextDef]]
   [:theta {:optional true} [:ref #'PolarDef]]
   [:theta2 {:optional true} [:ref #'Position2Def]]
   [:time {:optional true} [:ref #'TimeDef]]
   [:tooltip {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition] [:vector [:ref #'StringFieldDef]]
     nil?]]
   [:url {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition]]]
   [:x {:optional true} [:ref #'PositionDef]]
   [:x2 {:optional true} [:ref #'Position2Def]]
   [:xError {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:xError2 {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:xOffset {:optional true} [:ref #'OffsetDef]]
   [:y {:optional true} [:ref #'PositionDef]]
   [:y2 {:optional true} [:ref #'Position2Def]]
   [:yError {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:yError2 {:optional true}
    [:or [:ref #'SecondaryFieldDef]
     [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]]]
   [:yOffset {:optional true} [:ref #'OffsetDef]]])

(def TopLevelUnitSpec
  (mu/merge toplevel/TopLevelProps
            [:map {:closed true}
             [:align {:optional true}
              [:or [:ref #'LayoutAlign]
               [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
                #'RowCol_LayoutAlign_]]]
             [:bounds {:optional true} [:enum "full" "flush"]]
             [:center {:optional true}
              [:or boolean?
               [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
             [:data [:or [:ref #'Data] nil?]]
             [:encoding {:optional true} [:ref #'FacetedEncoding]]
             [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
             [:mark [:ref #'AnyMark]]
             [:projection {:optional true} [:ref #'Projection]]
             [:spacing {:optional true}
              [:or number?
               [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
             [:view {:optional true} [:ref #'ViewBackground]]
             [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]]))
