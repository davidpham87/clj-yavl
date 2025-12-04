(ns clj-yavl.schema.vega-lite.legend
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.common :as common]))

(def ExprRef expr/ExprRef)
(def DateTime expr/DateTime)
(def TimeInterval expr/TimeInterval)
(def TimeIntervalStep expr/TimeIntervalStep)

(def Color common/Color)
(def Align common/Align)
(def TextBaseline common/TextBaseline)
(def FontStyle common/FontStyle)
(def LabelOverlap common/LabelOverlap)
(def FontWeight common/FontWeight)
(def TitleAnchor common/TitleAnchor)
(def Text common/Text)
(def SymbolShape common/SymbolShape)
(def Orientation common/Orientation)

(def LayoutAlign primitives/LayoutAlign)
(def LegendOrient primitives/LegendOrient)
(def Dict primitives/Dict)
(def TimeFormatSpecifier primitives/TimeFormatSpecifier)
(def ResolveMode primitives/ResolveMode)

(def Format [:or string? [:ref #'TimeFormatSpecifier] [:ref #'Dict]])

(def TickCount [:or number? [:ref #'TimeInterval] [:ref #'TimeIntervalStep]])

(def Legend
  [:map {:closed true}
   [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:gridAlign {:optional true} [:or [:ref #'LayoutAlign] [:ref #'ExprRef]]]
   [:symbolSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:format {:optional true} [:ref #'Format]]
   [:gradientOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelOverlap {:optional true} [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
   [:gradientStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientThickness {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columns {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columnPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:clipHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:symbolDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:type {:optional true} [:enum "symbol" "gradient"]]
   [:labelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'LegendOrient]]
   [:tickMinStep {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAnchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:gradientStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:labelColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:symbolFillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:labelExpr {:optional true} string?]
   [:titleOrient {:optional true} [:or [:ref #'primitives/Orient] [:ref #'ExprRef]]]
   [:tickCount {:optional true} [:or [:ref #'TickCount] [:ref #'ExprRef]]]
   [:formatType {:optional true} string?]
   [:titleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legendX {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:symbolOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:values {:optional true}
    [:or [:vector number?] [:vector string?] [:vector boolean?]
     [:vector [:ref #'DateTime]] [:ref #'ExprRef]]]
   [:gradientLength {:optional true} [:or number? [:ref #'ExprRef]]]
   [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:strokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:rowPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:symbolType {:optional true} [:or [:ref #'SymbolShape] [:ref #'ExprRef]]]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:zindex {:optional true} number?]
   [:direction {:optional true} [:ref #'Orientation]]
   [:symbolStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:legendY {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolLimit {:optional true} [:or number? [:ref #'ExprRef]]]])

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

(def LegendConfig
  [:map {:closed true}
   [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:disable {:optional true} boolean?]
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:gridAlign {:optional true} [:or [:ref #'LayoutAlign] [:ref #'ExprRef]]]
   [:symbolSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientDirection {:optional true}
    [:or [:ref #'Orientation] [:ref #'ExprRef]]]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelOverlap {:optional true} [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
   [:gradientStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientThickness {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:layout {:optional true} [:ref #'ExprRef]]
   [:labelOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columns {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columnPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:clipHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:gradientVerticalMaxLength {:optional true} number?]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:symbolDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:unselectedOpacity {:optional true} number?]
   [:labelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'LegendOrient]]
   [:gradientLabelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAnchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:gradientStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:labelColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:title {:optional true} nil?]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:symbolFillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:gradientVerticalMinLength {:optional true} number?]
   [:titleOrient {:optional true} [:or [:ref #'primitives/Orient] [:ref #'ExprRef]]]
   [:tickCount {:optional true} [:or [:ref #'TickCount] [:ref #'ExprRef]]]
   [:symbolDirection {:optional true}
    [:or [:ref #'Orientation] [:ref #'ExprRef]]]
   [:titleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientHorizontalMaxLength {:optional true} number?]
   [:symbolBaseFillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:legendX {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:symbolOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientLength {:optional true} [:or number? [:ref #'ExprRef]]]
   [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:strokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:gradientLabelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:rowPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:symbolType {:optional true} [:or [:ref #'SymbolShape] [:ref #'ExprRef]]]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:symbolBaseStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:gradientHorizontalMinLength {:optional true} number?]
   [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:zindex {:optional true} [:or number? [:ref #'ExprRef]]]
   [:direction {:optional true} [:ref #'Orientation]]
   [:symbolStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:legendY {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolLimit {:optional true} [:or number? [:ref #'ExprRef]]]])
