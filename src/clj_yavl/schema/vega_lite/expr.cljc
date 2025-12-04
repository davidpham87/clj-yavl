(ns clj-yavl.schema.vega-lite.expr
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]))

(declare PredicateComposition)

(def FieldName primitives/FieldName)
(def ExprRef primitives/ExprRef)

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

(def LogicalNot_Predicate_
  [:map {:closed true, :json-schema/original-name "LogicalNot<Predicate>"}
   [:not [:ref #'PredicateComposition]]])

(def LogicalOr_Predicate_
  [:map {:closed true, :json-schema/original-name "LogicalOr<Predicate>"}
   [:or [:vector [:ref #'PredicateComposition]]]])

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

(def TimeInterval primitives/TimeInterval)

(def TimeIntervalStep
  [:map {:closed true} [:interval [:ref #'TimeInterval]] [:step number?]])
