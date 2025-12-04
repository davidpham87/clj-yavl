(ns clj-yavl.schema.vega-lite.transform
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.common :as common]
            [clj-yavl.schema.vega-lite.scale :as scale]
            [clj-yavl.schema.vega-lite.data :as data]))

(def FieldName common/FieldName)
(def PredicateComposition expr/PredicateComposition)
(def ParameterName expr/ParameterName)
(def TimeUnit expr/TimeUnit)
(def BinnedTimeUnit expr/BinnedTimeUnit)
(def TimeUnitParams expr/TimeUnitParams)
(def AggregateOp common/AggregateOp)
(def AggregatedFieldDef common/AggregatedFieldDef)
(def SortOrder common/SortOrder)
(def ParameterExtent scale/ParameterExtent)
(def Data data/Data)

(def WindowOnlyOp primitives/WindowOnlyOp)
(def SampleTransform primitives/SampleTransform)
(def ImputeMethod primitives/ImputeMethod)
(def ImputeSequence primitives/ImputeSequence)

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

(def CalculateTransform
  [:map {:closed true} [:as [:ref #'FieldName]] [:calculate string?]])

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

(def RegressionTransform
  [:map {:closed true} [:as {:optional true} [:vector [:ref #'FieldName]]]
   [:extent {:optional true} [:vector number?]]
   [:groupby {:optional true} [:vector [:ref #'FieldName]]]
   [:method {:optional true} [:enum "linear" "log" "exp" "pow" "quad" "poly"]]
   [:on [:ref #'FieldName]] [:order {:optional true} number?]
   [:params {:optional true} boolean?] [:regression [:ref #'FieldName]]])

(def ImputeParams
  [:map {:closed true} [:frame {:optional true} [:vector [:or nil? number?]]]
   [:keyvals {:optional true} [:or [:vector any?] [:ref #'ImputeSequence]]]
   [:method {:optional true} [:ref #'ImputeMethod]]
   [:value {:optional true} any?]])

(def ImputeTransform
  [:map {:closed true} [:frame {:optional true} [:vector [:or nil? number?]]]
   [:groupby {:optional true} [:vector [:ref #'FieldName]]]
   [:impute [:ref #'FieldName]] [:key [:ref #'FieldName]]
   [:keyvals {:optional true} [:or [:vector any?] [:ref #'ImputeSequence]]]
   [:method {:optional true} [:ref #'ImputeMethod]]
   [:value {:optional true} any?]])

(def AggregateTransform
  [:map {:closed true} [:aggregate [:vector [:ref #'AggregatedFieldDef]]]
   [:groupby {:optional true} [:vector [:ref #'FieldName]]]])

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
