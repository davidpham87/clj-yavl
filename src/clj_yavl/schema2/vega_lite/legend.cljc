(ns clj-yavl.schema2.vega-lite.legend
  (:require [clj-yavl.schema2.vega-lite.primitives :as primitives]
            [clj-yavl.schema2.vega-lite.expr :as expr]
            [clj-yavl.schema2.vega-lite.common :as common]))

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
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:clipHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columnPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columns {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:direction {:optional true} [:ref #'Orientation]]
   [:fillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:format {:optional true} [:ref #'Format]]
   [:formatType {:optional true} string?]
   [:gradientLength {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:gradientStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientThickness {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gridAlign {:optional true} [:or [:ref #'LayoutAlign] [:ref #'ExprRef]]]
   [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:labelColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:labelExpr {:optional true} string?]
   [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOverlap {:optional true} [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
   [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legendX {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legendY {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'LegendOrient]]
   [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:rowPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:symbolDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolFillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolType {:optional true} [:or [:ref #'SymbolShape] [:ref #'ExprRef]]]
   [:tickCount {:optional true} [:or [:ref #'TickCount] [:ref #'ExprRef]]]
   [:tickMinStep {:optional true} [:or number? [:ref #'ExprRef]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:titleAnchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleOrient {:optional true} [:or [:ref #'primitives/Orient] [:ref #'ExprRef]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:type {:optional true} [:enum "symbol" "gradient"]]
   [:values {:optional true}
    [:or [:vector number?] [:vector string?] [:vector boolean?]
     [:vector [:ref #'DateTime]] [:ref #'ExprRef]]]
   [:zindex {:optional true} number?]])

(def LegendResolveMap
  [:map {:closed true}
   [:angle {:optional true} [:ref #'ResolveMode]]
   [:color {:optional true} [:ref #'ResolveMode]]
   [:fill {:optional true} [:ref #'ResolveMode]]
   [:fillOpacity {:optional true} [:ref #'ResolveMode]]
   [:opacity {:optional true} [:ref #'ResolveMode]]
   [:shape {:optional true} [:ref #'ResolveMode]]
   [:size {:optional true} [:ref #'ResolveMode]]
   [:stroke {:optional true} [:ref #'ResolveMode]]
   [:strokeDash {:optional true} [:ref #'ResolveMode]]
   [:strokeOpacity {:optional true} [:ref #'ResolveMode]]
   [:strokeWidth {:optional true} [:ref #'ResolveMode]]
   [:time {:optional true} [:ref #'ResolveMode]]])

(def LegendConfig
  [:map {:closed true}
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:clipHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columnPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:columns {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:description {:optional true} [:or string? [:ref #'ExprRef]]]
   [:direction {:optional true} [:ref #'Orientation]]
   [:disable {:optional true} boolean?]
   [:fillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:gradientDirection {:optional true}
    [:or [:ref #'Orientation] [:ref #'ExprRef]]]
   [:gradientHorizontalMaxLength {:optional true} number?]
   [:gradientHorizontalMinLength {:optional true} number?]
   [:gradientLabelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientLabelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientLength {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:gradientStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientThickness {:optional true} [:or number? [:ref #'ExprRef]]]
   [:gradientVerticalMaxLength {:optional true} number?]
   [:gradientVerticalMinLength {:optional true} number?]
   [:gridAlign {:optional true} [:or [:ref #'LayoutAlign] [:ref #'ExprRef]]]
   [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:labelColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOverlap {:optional true} [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
   [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
   [:layout {:optional true} [:ref #'ExprRef]]
   [:legendX {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legendY {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'LegendOrient]]
   [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:rowPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolBaseFillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolBaseStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:symbolDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolDirection {:optional true}
    [:or [:ref #'Orientation] [:ref #'ExprRef]]]
   [:symbolFillColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolStrokeColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:symbolStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:symbolType {:optional true} [:or [:ref #'SymbolShape] [:ref #'ExprRef]]]
   [:tickCount {:optional true} [:or [:ref #'TickCount] [:ref #'ExprRef]]]
   [:title {:optional true} nil?]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:titleAnchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleOrient {:optional true} [:or [:ref #'primitives/Orient] [:ref #'ExprRef]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:unselectedOpacity {:optional true} number?]
   [:zindex {:optional true} [:or number? [:ref #'ExprRef]]]])
