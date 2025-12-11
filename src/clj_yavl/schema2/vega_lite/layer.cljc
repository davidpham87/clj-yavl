(ns clj-yavl.schema2.vega-lite.layer
  (:require [malli.util :as mu]
            [clj-yavl.schema2.vega-lite.primitives :as primitives]
            [clj-yavl.schema2.vega-lite.expr :as expr]
            [clj-yavl.schema2.vega-lite.common :as common]
            [clj-yavl.schema2.vega-lite.unit :as unit]
            [clj-yavl.schema2.vega-lite.config :as config]
            [clj-yavl.schema2.vega-lite.data :as data]
            [clj-yavl.schema2.vega-lite.transform :as transform]
            [clj-yavl.schema2.vega-lite.projection :as projection]
            [clj-yavl.schema2.vega-lite.selection :as selection]
            [clj-yavl.schema2.vega-lite.encoding :as encoding]
            [clj-yavl.schema2.vega-lite.scale :as scale]
            [clj-yavl.schema2.vega-lite.legend :as legend]
            [clj-yavl.schema2.vega-lite.axis :as axis]
            [clj-yavl.schema2.vega-lite.toplevel :as toplevel]))

(declare LayerSpec)

(def UnitSpec unit/UnitSpec)
(def Step unit/Step)
(def Resolve unit/Resolve)
(def Projection projection/Projection)
(def ViewBackground unit/ViewBackground)
(def Data data/Data)
(def Transform transform/Transform)
(def Text common/Text)
(def TitleParams config/TitleParams)
(def AutoSizeParams config/AutoSizeParams)
(def AutosizeType primitives/AutosizeType)
(def Datasets data/Datasets)
(def Config config/Config)
(def TopLevelParameter selection/TopLevelParameter)
(def Padding primitives/Padding)
(def Color common/Color)
(def ExprRef expr/ExprRef)

(def PrimitiveValue primitives/PrimitiveValue)
(def DateTime expr/DateTime)
(def RepeatRef primitives/RepeatRef)
(def Scale scale/Scale)
(def ImputeParams transform/ImputeParams)
(def Field encoding/Field)
(def StandardType primitives/StandardType)
(def Type primitives/Type)
(def BinParams transform/BinParams)
(def StackOffset primitives/StackOffset)
(def TimeUnit expr/TimeUnit)
(def BinnedTimeUnit expr/BinnedTimeUnit)
(def TimeUnitParams expr/TimeUnitParams)
(def Aggregate common/Aggregate)
(def Axis axis/Axis)
(def Sort encoding/Sort)
(def Format axis/Format)
(def ConditionalValueDef__string_ExprRef__ encoding/ConditionalValueDef__string_ExprRef__)
(def ConditionalMarkPropFieldOrDatumDef encoding/ConditionalMarkPropFieldOrDatumDef)
(def ConditionalValueDef__string_null_ExprRef__ encoding/ConditionalValueDef__string_null_ExprRef__)
(def Legend legend/Legend)
(def ConditionalValueDef__number_ExprRef__ encoding/ConditionalValueDef__number_ExprRef__)
(def Gradient common/Gradient)
(def ConditionalValueDef__Gradient_string_null_ExprRef__ encoding/ConditionalValueDef__Gradient_string_null_ExprRef__)
(def ConditionalValueDef__number___ExprRef__ encoding/ConditionalValueDef__number___ExprRef__)
(def ConditionalValueDef__Text_ExprRef__ encoding/ConditionalValueDef__Text_ExprRef__)
(def ConditionalStringFieldDef encoding/ConditionalStringFieldDef)
(def FieldDefWithoutScale encoding/FieldDefWithoutScale)
(def StringFieldDefWithCondition encoding/StringFieldDefWithCondition)
(def StringValueDefWithCondition encoding/StringValueDefWithCondition)
(def StringFieldDef encoding/StringFieldDef)
(def TextDef encoding/TextDef)
(def TypeForShape primitives/TypeForShape)
(def ConditionalMarkPropFieldOrDatumDef_TypeForShape_ encoding/ConditionalMarkPropFieldOrDatumDef_TypeForShape_)

(def SharedEncoding
  [:map {:closed true}
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
   [:detail {:optional true}
    [:or [:ref #'FieldDefWithoutScale]
     [:vector [:ref #'FieldDefWithoutScale]]]]
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
   [:order {:optional true}
    [:or [:ref #'encoding/OrderFieldDef] [:ref #'encoding/OrderValueDef] [:ref #'encoding/OrderOnlyDef]
     [:vector [:ref #'encoding/OrderFieldDef]]]]
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
   [:tooltip {:optional true}
    [:or [:ref #'StringFieldDefWithCondition]
     [:ref #'StringValueDefWithCondition] [:vector [:ref #'StringFieldDef]]
     nil?]]
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
   [:xError {:optional true}
    [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
     [:bandPosition {:optional true} number?] [:bin {:optional true} nil?]
     [:field {:optional true} [:ref #'Field]]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:value {:optional true} number?]]]
   [:xError2 {:optional true}
    [:map {:closed true} [:aggregate {:optional true} [:ref #'Aggregate]]
     [:bandPosition {:optional true} number?] [:bin {:optional true} nil?]
     [:field {:optional true} [:ref #'Field]]
     [:timeUnit {:optional true}
      [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
     [:title {:optional true} [:or [:ref #'Text] nil?]]
     [:value {:optional true} number?]]]
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
   [:yError {:optional true}
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
     [:sort {:optional true} [:ref #'Sort]]]]])

(def LayerSpec
  [:map {:closed true}
   [:data {:optional true} [:or [:ref #'Data] nil?]]
   [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'SharedEncoding]]
   [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:layer [:vector [:or [:ref #'LayerSpec] [:ref #'UnitSpec]]]]
   [:name {:optional true} string?]
   [:projection {:optional true} [:ref #'Projection]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:view {:optional true} [:ref #'ViewBackground]]
   [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]])

(def TopLevelLayerSpec
  (mu/merge toplevel/TopLevelProps
            [:map {:closed true}
             [:encoding {:optional true} [:ref #'SharedEncoding]]
             [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
             [:layer [:vector [:or [:ref #'LayerSpec] [:ref #'UnitSpec]]]]
             [:projection {:optional true} [:ref #'Projection]]
             [:view {:optional true} [:ref #'ViewBackground]]
             [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]]))
