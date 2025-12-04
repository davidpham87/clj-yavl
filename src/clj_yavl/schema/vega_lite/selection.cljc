(ns clj-yavl.schema.vega-lite.selection
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.common :as common]
            [clj-yavl.schema.vega-lite.stream :as stream]
            [clj-yavl.schema.vega-lite.data :as data]))

(def FieldName common/FieldName)
(def ParameterName expr/ParameterName)
(def DateTime expr/DateTime)
(def Cursor common/Cursor)
(def Color common/Color)

(def SingleDefUnitChannel primitives/SingleDefUnitChannel)
(def Element primitives/Element)
(def SelectionResolution primitives/SelectionResolution)
(def SelectionType primitives/SelectionType)
(def PrimitiveValue primitives/PrimitiveValue)
(def Dict_SelectionInitInterval_ primitives/Dict_SelectionInitInterval_)
(def Dict_SelectionInit_ primitives/Dict_SelectionInit_)
(def Vector2_boolean_ primitives/Vector2_boolean_)
(def Vector2_string_ primitives/Vector2_string_)
(def Vector2_number_ data/Vector2_number_)

(def Stream stream/Stream)

(def BindCheckbox
  [:map {:closed true}
   [:debounce {:optional true} number?]
   [:element {:optional true} [:ref #'Element]]
   [:input [:= "checkbox"]]
   [:name {:optional true} string?]])

(def BindDirect
  [:map {:closed true}
   [:debounce {:optional true} number?]
   [:element [:or [:ref #'Element] [:map {:closed true}]]]
   [:event {:optional true} string?]])

(def BindInput
  [:map {:closed true}
   [:autocomplete {:optional true} string?]
   [:debounce {:optional true} number?]
   [:element {:optional true} [:ref #'Element]]
   [:input {:optional true} string?]
   [:name {:optional true} string?]
   [:placeholder {:optional true} string?]])

(def BindRadioSelect
  [:map {:closed true}
   [:debounce {:optional true} number?]
   [:element {:optional true} [:ref #'Element]]
   [:input [:enum "radio" "select"]]
   [:labels {:optional true} [:vector string?]]
   [:name {:optional true} string?]
   [:options [:vector any?]]])

(def BindRange
  [:map {:closed true}
   [:debounce {:optional true} number?]
   [:element {:optional true} [:ref #'Element]]
   [:input [:= "range"]]
   [:max {:optional true} number?]
   [:min {:optional true} number?]
   [:name {:optional true} string?]
   [:step {:optional true} number?]])

(def Binding
  [:or [:ref #'BindCheckbox] [:ref #'BindRadioSelect] [:ref #'BindRange]
   [:ref #'BindInput] [:ref #'BindDirect]])

(def BrushConfig
  [:map {:closed true}
   [:cursor {:optional true} [:ref #'Cursor]]
   [:fill {:optional true} [:ref #'Color]]
   [:fillOpacity {:optional true} number?]
   [:stroke {:optional true} [:ref #'Color]]
   [:strokeDash {:optional true} [:vector number?]]
   [:strokeDashOffset {:optional true} number?]
   [:strokeOpacity {:optional true} number?]
   [:strokeWidth {:optional true} number?]])

(def LegendStreamBinding
  [:map {:closed true}
   [:legend [:or string? [:ref #'Stream]]]])

(def LegendBinding [:or [:ref #'LegendStreamBinding] [:enum "legend"]])

(def IntervalSelectionConfig
  [:map {:closed true}
   [:clear {:optional true} [:or [:ref #'Stream] string? boolean?]]
   [:encodings {:optional true} [:vector [:ref #'SingleDefUnitChannel]]]
   [:fields {:optional true} [:vector [:ref #'FieldName]]]
   [:mark {:optional true} [:ref #'BrushConfig]]
   [:on {:optional true} [:or [:ref #'Stream] string?]]
   [:resolve {:optional true} [:ref #'SelectionResolution]]
   [:translate {:optional true} [:or string? boolean?]]
   [:type [:= "interval"]]
   [:zoom {:optional true} [:or string? boolean?]]])

(def PointSelectionConfig
  [:map {:closed true}
   [:clear {:optional true} [:or [:ref #'Stream] string? boolean?]]
   [:encodings {:optional true} [:vector [:ref #'SingleDefUnitChannel]]]
   [:fields {:optional true} [:vector [:ref #'FieldName]]]
   [:nearest {:optional true} boolean?]
   [:on {:optional true} [:or [:ref #'Stream] string?]]
   [:resolve {:optional true} [:ref #'SelectionResolution]]
   [:toggle {:optional true} [:or string? boolean?]]
   [:type [:= "point"]]])

(def SelectionInit [:or [:ref #'PrimitiveValue] [:ref #'DateTime]])

(def SelectionInitMapping
  [:ref {:json-schema/original-name "Dict<SelectionInit>"}
   #'Dict_SelectionInit_])

(def SelectionInitIntervalMapping
  [:ref {:json-schema/original-name "Dict<SelectionInitInterval>"}
   #'Dict_SelectionInitInterval_])

(def SelectionParameter
  [:map {:closed true}
   [:bind {:optional true}
    [:or [:ref #'Binding] [:ref #'LegendBinding] [:map-of any? any?]
     [:enum "scales"]]]
   [:name [:ref #'ParameterName]]
   [:select
    [:or [:ref #'SelectionType] [:ref #'PointSelectionConfig]
     [:ref #'IntervalSelectionConfig]]]
   [:value {:optional true}
    [:or [:ref #'SelectionInit] [:ref #'SelectionInitIntervalMapping]
     [:vector [:ref #'SelectionInitMapping]]]]])

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

(def Vector2_DateTime_
  [:vector {:json-schema/original-name "Vector2<DateTime>"} [:ref #'DateTime]])

(def SelectionInitInterval
  [:or [:ref {:json-schema/original-name "Vector2<boolean>"} #'Vector2_boolean_]
   [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]
   [:ref {:json-schema/original-name "Vector2<string>"} #'Vector2_string_]
   [:ref {:json-schema/original-name "Vector2<DateTime>"} #'Vector2_DateTime_]])

(def TopLevelSelectionParameter
  [:map {:closed true}
   [:bind {:optional true}
    [:or [:ref #'Binding] [:ref #'LegendBinding] [:map-of any? any?]
     [:enum "scales"]]]
   [:name [:ref #'ParameterName]]
   [:select
    [:or [:ref #'SelectionType] [:ref #'PointSelectionConfig]
     [:ref #'IntervalSelectionConfig]]]
   [:value {:optional true}
    [:or [:ref #'SelectionInit] [:ref #'SelectionInitIntervalMapping]
     [:vector [:ref #'SelectionInitMapping]]]]
   [:views {:optional true} [:vector string?]]])

(def VariableParameter
  [:map {:closed true}
   [:bind {:optional true} [:ref #'Binding]]
   [:expr {:optional true} [:ref #'primitives/Expr]]
   [:name [:ref #'ParameterName]]
   [:react {:optional true} boolean?]
   [:value {:optional true} any?]])

(def TopLevelParameter
  [:or [:ref #'VariableParameter] [:ref #'TopLevelSelectionParameter]])
