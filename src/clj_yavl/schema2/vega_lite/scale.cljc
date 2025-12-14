(ns clj-yavl.schema2.vega-lite.scale
  (:require [clj-yavl.schema2.vega-lite.primitives :as primitives]
            [clj-yavl.schema2.vega-lite.expr :as expr]
            [clj-yavl.schema2.vega-lite.common :as common]))

(def FieldName expr/FieldName)
(def ExprRef expr/ExprRef)
(def DateTime expr/DateTime)
(def ParameterName expr/ParameterName)
(def TimeInterval expr/TimeInterval)
(def TimeIntervalStep expr/TimeIntervalStep)

(def Color common/Color)
(def Gradient common/Gradient)
(def SymbolShape common/SymbolShape)

(def SingleDefUnitChannel primitives/SingleDefUnitChannel)
(def ScaleInterpolateParams primitives/ScaleInterpolateParams)
(def Cyclical primitives/Cyclical)
(def SequentialMultiHue primitives/SequentialMultiHue)
(def Diverging primitives/Diverging)
(def SequentialSingleHue primitives/SequentialSingleHue)
(def Categorical primitives/Categorical)
(def RangeEnum primitives/RangeEnum)
(def ScaleBinParams primitives/ScaleBinParams)
(def ScaleInterpolateEnum primitives/ScaleInterpolateEnum)
(def FieldRange primitives/FieldRange)
(def ScaleType primitives/ScaleType)

(def ParameterExtent
  [:or
   [:map {:closed true} [:field {:optional true} [:ref #'FieldName]]
    [:param [:ref #'ParameterName]]]
   [:map {:closed true}
    [:encoding {:optional true} [:ref #'SingleDefUnitChannel]]
    [:param [:ref #'ParameterName]]]])

(def ScaleBins [:or [:vector number?] [:ref #'ScaleBinParams]])

(def ColorScheme
  [:or [:ref #'Categorical] [:ref #'SequentialSingleHue]
   [:ref #'SequentialMultiHue] [:ref #'Diverging] [:ref #'Cyclical]])

(def SchemeParams
  [:map {:closed true}
   [:count {:optional true} number?]
   [:extent {:optional true} [:vector number?]]
   [:name [:ref #'ColorScheme]]])

(def DomainUnionWith
  [:map {:closed true}
   [:unionWith [:vector [:or number? string? boolean? [:ref #'DateTime]]]]])

(def Scale
  [:map {:closed true}
   [:align {:optional true} [:or number? [:ref #'ExprRef]]]
   [:base {:optional true} [:or number? [:ref #'ExprRef]]]
   [:bins {:optional true} [:ref #'ScaleBins]]
   [:clamp {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:constant {:optional true} [:or number? [:ref #'ExprRef]]]
   [:domain {:optional true}
    [:or
     [:vector
      [:or nil? string? number? boolean? [:ref #'DateTime] [:ref #'ExprRef]]]
     [:ref #'ParameterExtent] [:ref #'DomainUnionWith] [:ref #'ExprRef]
     [:enum "unaggregated"]]]
   [:domainMax {:optional true}
    [:or number? [:ref #'DateTime] [:ref #'ExprRef]]]
   [:domainMid {:optional true} [:or number? [:ref #'ExprRef]]]
   [:domainMin {:optional true}
    [:or number? [:ref #'DateTime] [:ref #'ExprRef]]]
   [:domainRaw {:optional true} [:ref #'ExprRef]]
   [:exponent {:optional true} [:or number? [:ref #'ExprRef]]]
   [:interpolate {:optional true}
    [:or [:ref #'ScaleInterpolateEnum] [:ref #'ExprRef]
     [:ref #'ScaleInterpolateParams]]]
   [:nice {:optional true}
    [:or boolean? number? [:ref #'TimeInterval] [:ref #'TimeIntervalStep]
     [:ref #'ExprRef]]]
   [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:paddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:paddingOuter {:optional true} [:or number? [:ref #'ExprRef]]]
   [:range {:optional true}
    [:or [:ref #'RangeEnum] [:ref #'FieldRange]
     [:vector [:or number? string? [:vector number?] [:ref #'ExprRef]]]]]
   [:rangeMax {:optional true} [:or number? string? [:ref #'ExprRef]]]
   [:rangeMin {:optional true} [:or number? string? [:ref #'ExprRef]]]
   [:reverse {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:round {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:scheme {:optional true}
    [:or [:ref #'ColorScheme] [:ref #'SchemeParams] [:ref #'ExprRef]]]
   [:type {:optional true} [:ref #'ScaleType]]
   [:zero {:optional true} [:or boolean? [:ref #'ExprRef]]]])

(def ScaleInvalidDataShowAsValue__strokeWidth__
  primitives/ScaleInvalidDataShowAsValue__strokeWidth__)

(def ScaleInvalidDataShowAs__strokeWidth__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeWidth\">"}
   [:ref
    {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"strokeWidth\">"}
    #'ScaleInvalidDataShowAsValue__strokeWidth__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__angle__
  primitives/ScaleInvalidDataShowAsValue__angle__)

(def ScaleInvalidDataShowAs__angle__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"angle\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"angle\">"}
    #'ScaleInvalidDataShowAsValue__angle__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__radius__
  primitives/ScaleInvalidDataShowAsValue__radius__)

(def ScaleInvalidDataShowAs__radius__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"radius\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"radius\">"}
    #'ScaleInvalidDataShowAsValue__radius__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__strokeOpacity__
  primitives/ScaleInvalidDataShowAsValue__strokeOpacity__)

(def ScaleInvalidDataShowAs__strokeOpacity__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeOpacity\">"}
   [:ref
    {:json-schema/original-name
       "ScaleInvalidDataShowAsValue<\"strokeOpacity\">"}
    #'ScaleInvalidDataShowAsValue__strokeOpacity__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__yOffset__
  primitives/ScaleInvalidDataShowAsValue__yOffset__)

(def ScaleInvalidDataShowAs__yOffset__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"yOffset\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"yOffset\">"}
    #'ScaleInvalidDataShowAsValue__yOffset__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__fill__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"fill\">"}
   [:value {:optional true} [:or [:ref #'Color] [:ref #'Gradient] nil?]]])

(def ScaleInvalidDataShowAs__fill__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"fill\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"fill\">"}
    #'ScaleInvalidDataShowAsValue__fill__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__theta__
  primitives/ScaleInvalidDataShowAsValue__theta__)

(def ScaleInvalidDataShowAs__theta__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"theta\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"theta\">"}
    #'ScaleInvalidDataShowAsValue__theta__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__time__
  primitives/ScaleInvalidDataShowAsValue__time__)

(def ScaleInvalidDataShowAs__time__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"time\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"time\">"}
    #'ScaleInvalidDataShowAsValue__time__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__color__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"color\">"}
   [:value {:optional true} [:or [:ref #'Color] [:ref #'Gradient]]]])

(def ScaleInvalidDataShowAs__color__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"color\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"color\">"}
    #'ScaleInvalidDataShowAsValue__color__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__size__
  primitives/ScaleInvalidDataShowAsValue__size__)

(def ScaleInvalidDataShowAs__size__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"size\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"size\">"}
    #'ScaleInvalidDataShowAsValue__size__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__shape__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"shape\">"}
   [:value {:optional true} [:or [:ref #'SymbolShape] string?]]])

(def ScaleInvalidDataShowAs__shape__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"shape\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"shape\">"}
    #'ScaleInvalidDataShowAsValue__shape__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__stroke__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"stroke\">"}
   [:value {:optional true} [:or [:ref #'Color] [:ref #'Gradient] nil?]]])

(def ScaleInvalidDataShowAs__stroke__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"stroke\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"stroke\">"}
    #'ScaleInvalidDataShowAsValue__stroke__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__xOffset__
  primitives/ScaleInvalidDataShowAsValue__xOffset__)

(def ScaleInvalidDataShowAs__xOffset__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"xOffset\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"xOffset\">"}
    #'ScaleInvalidDataShowAsValue__xOffset__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__strokeDash__
  primitives/ScaleInvalidDataShowAsValue__strokeDash__)

(def ScaleInvalidDataShowAs__strokeDash__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeDash\">"}
   [:ref
    {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"strokeDash\">"}
    #'ScaleInvalidDataShowAsValue__strokeDash__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__y__
  primitives/ScaleInvalidDataShowAsValue__y__)

(def ScaleInvalidDataShowAs__y__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"y\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"y\">"}
    #'ScaleInvalidDataShowAsValue__y__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__x__
  primitives/ScaleInvalidDataShowAsValue__x__)

(def ScaleInvalidDataShowAs__x__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"x\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"x\">"}
    #'ScaleInvalidDataShowAsValue__x__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__fillOpacity__
  primitives/ScaleInvalidDataShowAsValue__fillOpacity__)

(def ScaleInvalidDataShowAs__fillOpacity__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"fillOpacity\">"}
   [:ref
    {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"fillOpacity\">"}
    #'ScaleInvalidDataShowAsValue__fillOpacity__] [:enum "zero-or-min"]])

(def ScaleInvalidDataShowAsValue__opacity__
  primitives/ScaleInvalidDataShowAsValue__opacity__)

(def ScaleInvalidDataShowAs__opacity__
  [:or {:json-schema/original-name "ScaleInvalidDataShowAs<\"opacity\">"}
   [:ref {:json-schema/original-name "ScaleInvalidDataShowAsValue<\"opacity\">"}
    #'ScaleInvalidDataShowAsValue__opacity__] [:enum "zero-or-min"]])

(def ScaleInvalidDataConfig
  [:map {:closed true}
   [:angle {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"angle\">"}
     #'ScaleInvalidDataShowAs__angle__]]
   [:color {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"color\">"}
     #'ScaleInvalidDataShowAs__color__]]
   [:fill {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"fill\">"}
     #'ScaleInvalidDataShowAs__fill__]]
   [:fillOpacity {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"fillOpacity\">"}
     #'ScaleInvalidDataShowAs__fillOpacity__]]
   [:opacity {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"opacity\">"}
     #'ScaleInvalidDataShowAs__opacity__]]
   [:radius {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"radius\">"}
     #'ScaleInvalidDataShowAs__radius__]]
   [:shape {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"shape\">"}
     #'ScaleInvalidDataShowAs__shape__]]
   [:size {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"size\">"}
     #'ScaleInvalidDataShowAs__size__]]
   [:stroke {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"stroke\">"}
     #'ScaleInvalidDataShowAs__stroke__]]
   [:strokeDash {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeDash\">"}
     #'ScaleInvalidDataShowAs__strokeDash__]]
   [:strokeOpacity {:optional true}
    [:ref
     {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeOpacity\">"}
     #'ScaleInvalidDataShowAs__strokeOpacity__]]
   [:strokeWidth {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"strokeWidth\">"}
     #'ScaleInvalidDataShowAs__strokeWidth__]]
   [:theta {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"theta\">"}
     #'ScaleInvalidDataShowAs__theta__]]
   [:time {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"time\">"}
     #'ScaleInvalidDataShowAs__time__]]
   [:x {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"x\">"}
     #'ScaleInvalidDataShowAs__x__]]
   [:xOffset {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"xOffset\">"}
     #'ScaleInvalidDataShowAs__xOffset__]]
   [:y {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"y\">"}
     #'ScaleInvalidDataShowAs__y__]]
   [:yOffset {:optional true}
    [:ref {:json-schema/original-name "ScaleInvalidDataShowAs<\"yOffset\">"}
     #'ScaleInvalidDataShowAs__yOffset__]]])

(def ScaleConfig
  [:map {:closed true}
   [:animationDuration {:optional true} number?]
   [:bandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:bandPaddingOuter {:optional true} [:or number? [:ref #'ExprRef]]]
   [:bandWithNestedOffsetPaddingInner {:optional true}
    [:or number? [:ref #'ExprRef]]]
   [:bandWithNestedOffsetPaddingOuter {:optional true}
    [:or number? [:ref #'ExprRef]]]
   [:barBandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:clamp {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:continuousPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:framesPerSecond {:optional true} number?]
   [:invalid {:optional true} [:ref #'ScaleInvalidDataConfig]]
   [:maxBandSize {:optional true} number?]
   [:maxFontSize {:optional true} number?]
   [:maxOpacity {:optional true} number?]
   [:maxSize {:optional true} number?]
   [:maxStrokeWidth {:optional true} number?]
   [:minBandSize {:optional true} number?]
   [:minFontSize {:optional true} number?]
   [:minOpacity {:optional true} number?]
   [:minSize {:optional true} number?]
   [:minStrokeWidth {:optional true} number?]
   [:offsetBandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offsetBandPaddingOuter {:optional true} [:or number? [:ref #'ExprRef]]]
   [:pointPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:quantileCount {:optional true} number?]
   [:quantizeCount {:optional true} number?]
   [:rectBandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:round {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:tickBandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
   [:useUnaggregatedDomain {:optional true} boolean?]
   [:xReverse {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:zero {:optional true} boolean?]])
