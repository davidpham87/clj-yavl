(ns clj-yavl.schema2.vega-lite.encoding
  (:require [clj-yavl.schema2.vega-lite.primitives :as primitives]
            [clj-yavl.schema2.vega-lite.expr :as expr]
            [clj-yavl.schema2.vega-lite.common :as common]
            [clj-yavl.schema2.vega-lite.scale :as scale]
            [clj-yavl.schema2.vega-lite.axis :as axis]
            [clj-yavl.schema2.vega-lite.legend :as legend]
            [clj-yavl.schema2.vega-lite.mark :as mark]
            [clj-yavl.schema2.vega-lite.transform :as transform]))

(def FieldName common/FieldName)
(def ExprRef expr/ExprRef)
(def PredicateComposition expr/PredicateComposition)
(def ParameterName expr/ParameterName)
(def DateTime expr/DateTime)
(def TimeUnit expr/TimeUnit)
(def BinnedTimeUnit expr/BinnedTimeUnit)
(def TimeUnitParams expr/TimeUnitParams)

(def Aggregate common/Aggregate)
(def NonArgAggregateOp common/NonArgAggregateOp)
(def SortOrder common/SortOrder)
(def SortByChannel common/SortByChannel)
(def AllSortString common/AllSortString)
(def StandardType primitives/StandardType)
(def Type primitives/Type)
(def Text common/Text)
(def Format axis/Format) ;; Or legend/Format or redefine. I'll use axis/Format.
(def Gradient common/Gradient)
(def Color common/Color)
(def PrimitiveValue primitives/PrimitiveValue)
(def StackOffset primitives/StackOffset)
(def TypeForShape primitives/TypeForShape)
(def ValueDef_number_ primitives/ValueDef_number_)

(def Scale scale/Scale)
(def Legend legend/Legend)
(def Axis axis/Axis)
(def BinParams transform/BinParams)
(def ImputeParams transform/ImputeParams)

(def RepeatRef primitives/RepeatRef)

(def Field [:or [:ref #'FieldName] [:ref #'RepeatRef]])

(def EncodingSortField
  [:map {:closed true}
   [:field {:optional true} [:ref #'Field]]
   [:op {:optional true} [:ref #'NonArgAggregateOp]]
   [:order {:optional true} [:or [:ref #'SortOrder] nil?]]])

(def SortArray
  [:or [:vector number?] [:vector string?] [:vector boolean?]
   [:vector [:ref #'DateTime]]])

(def SortByEncoding
  [:map {:closed true}
   [:encoding [:ref #'SortByChannel]]
   [:order {:optional true} [:or [:ref #'SortOrder] nil?]]])

(def Sort
  [:or [:ref #'SortArray] [:ref #'AllSortString] [:ref #'EncodingSortField]
   [:ref #'SortByEncoding] nil?])

(def ConditionalPredicate__ValueDef__Color_null___ExprRef__ axis/ConditionalPredicate__ValueDef__Color_null___ExprRef__)
(def ConditionalValueDef__Gradient_string_null_ExprRef__
  [:or
   {:json-schema/original-name
      "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]]
   [:map {:closed true} [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
    [:value [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]]])

(def FieldOrDatumDefWithCondition_MarkPropFieldDef__Gradient_string_null__
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<MarkPropFieldDef,(Gradient|string|null)>"}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
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
   [:field {:optional true} [:ref #'Field]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:sort {:optional true} [:ref #'Sort]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

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
     [:ref #'RepeatRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
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

(def SecondaryFieldDef
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} nil?]
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
  [:map {:closed true}
   [:bandPosition {:optional true} number?]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def Position2Def
  [:or [:ref #'SecondaryFieldDef] [:ref #'DatumDef] [:ref #'PositionValueDef]])

(def ConditionalValueDef__string_null_ExprRef__
  [:or {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or string? nil? [:ref #'ExprRef]]]]
   [:map {:closed true} [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
    [:value [:or string? nil? [:ref #'ExprRef]]]]])

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

(def ConditionalValueDef_number_
  [:or {:json-schema/original-name "ConditionalValueDef<number>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]] [:value number?]]
   [:map {:closed true} [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
    [:value number?]]])

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

(def ConditionalValueDef__number___ExprRef__
  [:or {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or [:vector number?] [:ref #'ExprRef]]]]
   [:map {:closed true} [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
    [:value [:or [:vector number?] [:ref #'ExprRef]]]]])

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_number___
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<MarkPropFieldDef,number[]>"}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:condition {:optional true}
    [:or
     [:ref
      {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
      #'ConditionalValueDef__number___ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name "ConditionalValueDef<(number[]|ExprRef)>"}
       #'ConditionalValueDef__number___ExprRef__]]]]
   [:field {:optional true} [:ref #'Field]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:sort {:optional true} [:ref #'Sort]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

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
     [:ref #'RepeatRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
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

(def ScaleFieldDef
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:field {:optional true} [:ref #'Field]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:sort {:optional true} [:ref #'Sort]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

(def ScaleDatumDef
  [:map {:closed true}
   [:bandPosition {:optional true} number?]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def OffsetDef
  [:or [:ref #'ScaleFieldDef] [:ref #'ScaleDatumDef]
   [:ref {:json-schema/original-name "ValueDef<number>"} #'ValueDef_number_]])

(def ConditionalValueDef__Text_ExprRef__
  [:or {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or [:ref #'Text] [:ref #'ExprRef]]]]
   [:map {:closed true} [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
    [:value [:or [:ref #'Text] [:ref #'ExprRef]]]]])

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
     [:ref #'RepeatRef]]]
   [:format {:optional true} [:ref #'Format]]
   [:formatType {:optional true} string?]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def FieldOrDatumDefWithCondition_StringFieldDef_Text_
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<StringFieldDef,Text>"}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:condition {:optional true}
    [:or
     [:ref {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
      #'ConditionalValueDef__Text_ExprRef__]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<(Text|ExprRef)>"}
       #'ConditionalValueDef__Text_ExprRef__]]]]
   [:field {:optional true} [:ref #'Field]]
   [:format {:optional true} [:ref #'Format]]
   [:formatType {:optional true} string?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

(def ConditionalStringFieldDef
  [:or
   [:map {:closed true}
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
    [:test [:ref #'PredicateComposition]]]
   [:map {:closed true}
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
    [:aggregate {:optional true} [:ref #'Aggregate]]]])

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
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
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
  [:map {:closed true}
   [:sort {:optional true} [:ref #'SortOrder]]])

(def ConditionalValueDef__number_ExprRef__
  [:or {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or number? [:ref #'ExprRef]]]]
   [:map {:closed true} [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
    [:value [:or number? [:ref #'ExprRef]]]]])

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_number_
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<MarkPropFieldDef,number>"}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:condition {:optional true}
    [:or
     [:ref {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
      #'ConditionalValueDef__number_ExprRef__]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]]]]
   [:field {:optional true} [:ref #'Field]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:sort {:optional true} [:ref #'Sort]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

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
     [:ref #'RepeatRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
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

(def PositionDatumDefBase
  [:map {:closed true}
   [:bandPosition {:optional true} number?]
   [:datum {:optional true}
    [:or [:ref #'PrimitiveValue] [:ref #'DateTime] [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def PositionFieldDefBase
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:field {:optional true} [:ref #'Field]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:sort {:optional true} [:ref #'Sort]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

(def PolarDef
  [:or [:ref #'PositionFieldDefBase] [:ref #'PositionDatumDefBase]
   [:ref #'PositionValueDef]])

(def LatLongFieldDef
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} nil?]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:= "quantitative"]]])

(def LatLongDef [:or [:ref #'LatLongFieldDef] [:ref #'DatumDef]])

(def TimeFieldDef
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:field {:optional true} [:ref #'Field]]
   [:rescale {:optional true} boolean?]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:sort {:optional true} [:ref #'Sort]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

(def TimeDef [:ref #'TimeFieldDef])

(def ConditionalValueDef__string_ExprRef__
  [:or {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
   [:map {:closed true} [:test [:ref #'PredicateComposition]]
    [:value [:or string? [:ref #'ExprRef]]]]
   [:map {:closed true} [:empty {:optional true} boolean?] [:param [:ref #'ParameterName]]
    [:value [:or string? [:ref #'ExprRef]]]]])

(def FieldOrDatumDefWithCondition_StringFieldDef_string_
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<StringFieldDef,string>"}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:condition {:optional true}
    [:or
     [:ref {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
      #'ConditionalValueDef__string_ExprRef__]
     [:vector
      [:ref {:json-schema/original-name "ConditionalValueDef<(string|ExprRef)>"}
       #'ConditionalValueDef__string_ExprRef__]]]]
   [:field {:optional true} [:ref #'Field]]
   [:format {:optional true} [:ref #'Format]]
   [:formatType {:optional true} string?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

(def StringFieldDefWithCondition
  [:ref
   {:json-schema/original-name
      "FieldOrDatumDefWithCondition<StringFieldDef,string>"}
   #'FieldOrDatumDefWithCondition_StringFieldDef_string_])

(def OrderFieldDef
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
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
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:field {:optional true} [:ref #'Field]]
   [:format {:optional true} [:ref #'Format]]
   [:formatType {:optional true} string?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

(def ConditionalMarkPropFieldOrDatumDef_TypeForShape_
  [:or
   {:json-schema/original-name
      "ConditionalMarkPropFieldOrDatumDef<TypeForShape>"}
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
    [:type {:optional true} [:ref #'Type]]]
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
     [:ref #'RepeatRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'Type]]])

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_TypeForShape___string_null__
  [:map
   {:closed true,
    :json-schema/original-name
      "FieldOrDatumDefWithCondition<MarkPropFieldDef<TypeForShape>,(string|null)>"}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:condition {:optional true}
    [:or
     [:ref
      {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
      #'ConditionalValueDef__string_null_ExprRef__]
     [:vector
      [:ref
       {:json-schema/original-name "ConditionalValueDef<(string|null|ExprRef)>"}
       #'ConditionalValueDef__string_null_ExprRef__]]]]
   [:field {:optional true} [:ref #'Field]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:sort {:optional true} [:ref #'Sort]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'TypeForShape]]])

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

(def PositionFieldDef
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:axis {:optional true} [:or [:ref #'Axis] nil?]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:field {:optional true} [:ref #'Field]]
   [:impute {:optional true} [:or [:ref #'ImputeParams] nil?]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:sort {:optional true} [:ref #'Sort]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

(def PositionDatumDef
  [:map {:closed true}
   [:axis {:optional true} [:or [:ref #'Axis] nil?]]
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
  [:map {:closed true}
   [:angle {:optional true} [:ref #'NumericMarkPropDef]]
   [:color {:optional true} [:ref #'ColorDef]]
   [:description {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition]]]
   [:detail {:optional true}
    [:or [:ref #'FieldDefWithoutScale]
     [:vector [:ref #'FieldDefWithoutScale]]]]
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
