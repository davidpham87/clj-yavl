(ns
 clj-yavl.schema2.vega-lite.common-fields
 (:require
  [clj-yavl.schema2.vega-lite.primitives :as primitives]
  [clj-yavl.schema2.vega-lite.expr :as expr]
  [clj-yavl.schema2.vega-lite.common :as common]))

(def
 common-map
 {:and
  [:and
   [:vector
    [:ref #'clj-yavl.schema2.vega-lite.expr/PredicateComposition]]],
  :animationDuration [:animationDuration {:optional true} number?],
  :argmax
  [:argmax [:ref #'clj-yavl.schema2.vega-lite.common/FieldName]],
  :argmin
  [:argmin [:ref #'clj-yavl.schema2.vega-lite.common/FieldName]],
  :autocomplete [:autocomplete {:optional true} string?],
  :bandSize [:bandSize {:optional true} number?],
  :bandwidth [:bandwidth {:optional true} number?],
  :binSpacing [:binSpacing {:optional true} number?],
  :binned [:binned {:optional true} boolean?],
  :bottom [:bottom {:optional true} number?],
  :bounds [:bounds {:optional true} [:enum "full" "flush"]],
  :calculate [:calculate string?],
  :consume [:consume {:optional true} boolean?],
  :contains [:contains {:optional true} [:enum "content" "padding"]],
  :content [:content [:enum "encoding" "data"]],
  :continuousBandSize [:continuousBandSize {:optional true} number?],
  :continuousHeight [:continuousHeight {:optional true} number?],
  :continuousWidth [:continuousWidth {:optional true} number?],
  :count [:count {:optional true} number?],
  :countTitle [:countTitle {:optional true} string?],
  :counts [:counts {:optional true} boolean?],
  :cumulative [:cumulative {:optional true} boolean?],
  :customFormatTypes [:customFormatTypes {:optional true} boolean?],
  :dateTime [:dateTime string?],
  :debounce [:debounce {:optional true} number?],
  :decimal [:decimal string?],
  :default [:default {:optional true} any?],
  :delimiter [:delimiter string?],
  :disable [:disable {:optional true} boolean?],
  :discreteHeight
  [:discreteHeight
   {:optional true}
   [:or number? [:map {:closed true} [:step number?]]]],
  :discreteWidth
  [:discreteWidth
   {:optional true}
   [:or number? [:map {:closed true} [:step number?]]]],
  :divide [:divide {:optional true} [:vector number?]],
  :empty [:empty {:optional true} boolean?],
  :equal
  [:equal
   [:or
    string?
    number?
    boolean?
    [:ref #'clj-yavl.schema2.vega-lite.expr/DateTime]
    [:ref #'clj-yavl.schema2.vega-lite.expr/ExprRef]]],
  :event [:event {:optional true} string?],
  :feature [:feature {:optional true} string?],
  :fieldTitle
  [:fieldTitle {:optional true} [:enum "verbal" "functional" "plain"]],
  :filled [:filled {:optional true} boolean?],
  :formatType [:formatType {:optional true} string?],
  :framesPerSecond [:framesPerSecond {:optional true} number?],
  :gamma [:gamma {:optional true} number?],
  :gradientHorizontalMaxLength
  [:gradientHorizontalMaxLength {:optional true} number?],
  :gradientHorizontalMinLength
  [:gradientHorizontalMinLength {:optional true} number?],
  :gradientVerticalMaxLength
  [:gradientVerticalMaxLength {:optional true} number?],
  :gradientVerticalMinLength
  [:gradientVerticalMinLength {:optional true} number?],
  :grid [:grid {:optional true} boolean?],
  :grouping [:grouping [:vector number?]],
  :gt
  [:gt
   [:or
    string?
    number?
    [:ref #'clj-yavl.schema2.vega-lite.expr/DateTime]
    [:ref #'clj-yavl.schema2.vega-lite.expr/ExprRef]]],
  :gte
  [:gte
   [:or
    string?
    number?
    [:ref #'clj-yavl.schema2.vega-lite.expr/DateTime]
    [:ref #'clj-yavl.schema2.vega-lite.expr/ExprRef]]],
  :ignorePeers [:ignorePeers {:optional true} boolean?],
  :labelExpr [:labelExpr {:optional true} string?],
  :labelFlush [:labelFlush {:optional true} [:or boolean? number?]],
  :labelOrient
  [:labelOrient
   {:optional true}
   [:ref #'clj-yavl.schema2.vega-lite.primitives/Orient]],
  :left [:left {:optional true} number?],
  :lookup [:lookup string?],
  :lt
  [:lt
   [:or
    string?
    number?
    [:ref #'clj-yavl.schema2.vega-lite.expr/DateTime]
    [:ref #'clj-yavl.schema2.vega-lite.expr/ExprRef]]],
  :lte
  [:lte
   [:or
    string?
    number?
    [:ref #'clj-yavl.schema2.vega-lite.expr/DateTime]
    [:ref #'clj-yavl.schema2.vega-lite.expr/ExprRef]]],
  :markname [:markname {:optional true} string?],
  :max [:max {:optional true} number?],
  :maxBandSize [:maxBandSize {:optional true} number?],
  :maxFontSize [:maxFontSize {:optional true} number?],
  :maxOpacity [:maxOpacity {:optional true} number?],
  :maxSize [:maxSize {:optional true} number?],
  :maxStrokeWidth [:maxStrokeWidth {:optional true} number?],
  :maxbins [:maxbins {:optional true} number?],
  :maxsteps [:maxsteps {:optional true} number?],
  :mesh [:mesh {:optional true} string?],
  :min [:min {:optional true} number?],
  :minFontSize [:minFontSize {:optional true} number?],
  :minOpacity [:minOpacity {:optional true} number?],
  :minSize [:minSize {:optional true} number?],
  :minStrokeWidth [:minStrokeWidth {:optional true} number?],
  :minstep [:minstep {:optional true} number?],
  :minsteps [:minsteps {:optional true} number?],
  :minus [:minus {:optional true} string?],
  :nan [:nan {:optional true} string?],
  :nearest [:nearest {:optional true} boolean?],
  :normalizedNumberFormat
  [:normalizedNumberFormat {:optional true} string?],
  :normalizedNumberFormatType
  [:normalizedNumberFormatType {:optional true} string?],
  :not
  [:not [:ref #'clj-yavl.schema2.vega-lite.expr/PredicateComposition]],
  :numberFormat [:numberFormat {:optional true} string?],
  :numberFormatType [:numberFormatType {:optional true} string?],
  :oneOf
  [:oneOf
   [:or
    [:vector string?]
    [:vector number?]
    [:vector boolean?]
    [:vector [:ref #'clj-yavl.schema2.vega-lite.expr/DateTime]]]],
  :options [:options [:vector any?]],
  :or
  [:or
   [:vector
    [:ref #'clj-yavl.schema2.vega-lite.expr/PredicateComposition]]],
  :percent [:percent {:optional true} string?],
  :placeholder [:placeholder {:optional true} string?],
  :probs [:probs {:optional true} [:vector number?]],
  :property [:property {:optional true} string?],
  :quantileCount [:quantileCount {:optional true} number?],
  :quantizeCount [:quantizeCount {:optional true} number?],
  :r1 [:r1 {:optional true} number?],
  :r2 [:r2 {:optional true} number?],
  :react [:react {:optional true} boolean?],
  :repeat [:repeat [:enum "row" "column" "repeat" "layer"]],
  :rescale [:rescale {:optional true} boolean?],
  :resize [:resize {:optional true} boolean?],
  :right [:right {:optional true} number?],
  :sample [:sample number?],
  :sphere [:sphere [:or [:map-of any? any?] [:enum true]]],
  :stops
  [:stops
   [:vector [:ref #'clj-yavl.schema2.vega-lite.common/GradientStop]]],
  :thickness [:thickness {:optional true} number?],
  :thousands [:thousands string?],
  :throttle [:throttle {:optional true} number?],
  :tickExtra [:tickExtra {:optional true} boolean?],
  :tickRound [:tickRound {:optional true} boolean?],
  :timeFormat [:timeFormat {:optional true} string?],
  :timeFormatType [:timeFormatType {:optional true} string?],
  :timeUnitBandPosition
  [:timeUnitBandPosition {:optional true} number?],
  :timeUnitBandSize [:timeUnitBandSize {:optional true} number?],
  :toggle [:toggle {:optional true} [:or string? boolean?]],
  :top [:top {:optional true} number?],
  :unselectedOpacity [:unselectedOpacity {:optional true} number?],
  :useUnaggregatedDomain
  [:useUnaggregatedDomain {:optional true} boolean?],
  :utc [:utc {:optional true} boolean?],
  :valid [:valid boolean?],
  :views [:views {:optional true} [:vector string?]],
  :week [:week {:optional true} string?],
  :x1 [:x1 {:optional true} number?],
  :y1 [:y1 {:optional true} number?],
  :zoom [:zoom {:optional true} [:or string? boolean?]]})
