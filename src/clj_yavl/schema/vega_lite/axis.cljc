(ns clj-yavl.schema.vega-lite.axis
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.common :as common]))

(def ExprRef expr/ExprRef)
(def PredicateComposition expr/PredicateComposition)
(def DateTime expr/DateTime)
(def TimeInterval expr/TimeInterval)
(def TimeIntervalStep expr/TimeIntervalStep)

(def Color common/Color)
(def Align common/Align)
(def TextBaseline common/TextBaseline)
(def FontStyle common/FontStyle)
(def FontWeight common/FontWeight)
(def StrokeCap common/StrokeCap)
(def Text common/Text)

(def LabelOverlap primitives/LabelOverlap)
(def AxisOrient primitives/AxisOrient)
(def Dict primitives/Dict)
(def TimeFormatSpecifier primitives/TimeFormatSpecifier)
(def TitleAnchor primitives/TitleAnchor)

(def Format [:or string? [:ref #'TimeFormatSpecifier] [:ref #'Dict]])

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
