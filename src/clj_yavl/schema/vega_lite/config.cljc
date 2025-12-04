(ns clj-yavl.schema.vega-lite.config
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.common :as common]
            [clj-yavl.schema.vega-lite.mark :as mark]
            [clj-yavl.schema.vega-lite.axis :as axis]
            [clj-yavl.schema.vega-lite.legend :as legend]
            [clj-yavl.schema.vega-lite.scale :as scale]
            [clj-yavl.schema.vega-lite.projection :as projection]
            [clj-yavl.schema.vega-lite.selection :as selection]))

(def ExprRef expr/ExprRef)
(def Color common/Color)
(def Align common/Align)
(def TextBaseline common/TextBaseline)
(def FontStyle common/FontStyle)
(def FontWeight common/FontWeight)
(def TitleAnchor common/TitleAnchor)
(def Text common/Text)
(def Orientation common/Orientation)
(def SymbolShape common/SymbolShape)
(def Format axis/Format)

(def RangeRawArray primitives/RangeRawArray)
(def RangeEnum primitives/RangeEnum)
(def CompositionConfig primitives/CompositionConfig)
(def AutosizeType primitives/AutosizeType)
(def Padding primitives/Padding)
(def FormatConfig primitives/FormatConfig)
(def Vector7_string_ primitives/Vector7_string_)
(def Vector12_string_ primitives/Vector12_string_)
(def Vector2_string_ primitives/Vector2_string_)
(def Vector10_string_ primitives/Vector10_string_)
(def TitleFrame primitives/TitleFrame)
(def TitleOrient primitives/TitleOrient)

(def RangeRaw
  [:vector [:or nil? boolean? string? number? [:ref #'RangeRawArray]]])

(def RangeScheme
  [:or [:ref #'RangeEnum] [:ref #'RangeRaw]
   [:map {:closed true} [:count {:optional true} number?]
    [:extent {:optional true} [:vector number?]]
    [:scheme [:or string? [:vector string?] [:ref #'scale/ColorScheme]]]]])

(def RangeConfig
  [:map {:closed false}
   [:category {:optional true}
    [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
   [:diverging {:optional true}
    [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
   [:heatmap {:optional true}
    [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
   [:ordinal {:optional true}
    [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
   [:ramp {:optional true} [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
   [:symbol {:optional true} [:vector [:ref #'SymbolShape]]]])

(def StyleConfigIndex
  [:map {:closed false} [:tick {:optional true} [:ref #'mark/TickConfig]]
   [:geoshape {:optional true} [:ref #'mark/MarkConfig]]
   [:group-title {:optional true} [:ref #'mark/MarkConfig]]
   [:arc {:optional true} [:ref #'mark/RectConfig]]
   [:mark {:optional true} [:ref #'mark/MarkConfig]]
   [:bar {:optional true} [:ref #'mark/BarConfig]]
   [:rule {:optional true} [:ref #'mark/MarkConfig]]
   [:guide-label {:optional true} [:ref #'mark/MarkConfig]]
   [:circle {:optional true} [:ref #'mark/MarkConfig]]
   [:trail {:optional true} [:ref #'mark/LineConfig]]
   [:line {:optional true} [:ref #'mark/LineConfig]]
   [:square {:optional true} [:ref #'mark/MarkConfig]]
   [:image {:optional true} [:ref #'mark/RectConfig]]
   [:point {:optional true} [:ref #'mark/MarkConfig]]
   [:area {:optional true} [:ref #'mark/AreaConfig]]
   [:group-subtitle {:optional true} [:ref #'mark/MarkConfig]]
   [:guide-title {:optional true} [:ref #'mark/MarkConfig]]
   [:rect {:optional true} [:ref #'mark/RectConfig]]
   [:text {:optional true} [:ref #'mark/MarkConfig]]])

(def ViewConfig
  [:map {:closed true}
   [:discreteHeight {:optional true}
    [:or number? [:map {:closed true} [:step number?]]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:stroke {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
   [:clip {:optional true} boolean?]
   [:discreteWidth {:optional true}
    [:or number? [:map {:closed true} [:step number?]]]]
   [:fill {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:cursor {:optional true} [:ref #'common/Cursor]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:continuousWidth {:optional true} number?]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:continuousHeight {:optional true} number?]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'common/StrokeJoin] [:ref #'ExprRef]]]
   [:strokeCap {:optional true} [:or [:ref #'common/StrokeCap] [:ref #'ExprRef]]]
   [:step {:optional true} number?]])

(def BaseTitleNoValueRefs
  [:map {:closed true} [:baseline {:optional true} [:ref #'TextBaseline]]
   [:align {:optional true} [:ref #'Align]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:frame {:optional true}
    [:or [:or [:ref #'TitleFrame] string?] [:ref #'ExprRef]]]
   [:color {:optional true} [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:subtitleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:subtitleFontStyle {:optional true}
    [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:or [:ref #'TitleOrient] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:subtitleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:subtitleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:subtitlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:anchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:subtitleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:zindex {:optional true} [:or number? [:ref #'ExprRef]]]
   [:subtitleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]])

(def TitleConfig [:ref #'BaseTitleNoValueRefs])

(def TitleParams
  [:map {:closed true} [:baseline {:optional true} [:ref #'TextBaseline]]
   [:align {:optional true} [:ref #'Align]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:frame {:optional true}
    [:or [:or [:ref #'TitleFrame] string?] [:ref #'ExprRef]]]
   [:color {:optional true} [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:subtitleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:subtitleFontStyle {:optional true}
    [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:or [:ref #'TitleOrient] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:style {:optional true} [:or string? [:vector string?]]]
   [:subtitleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:subtitle {:optional true} [:ref #'Text]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:subtitleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:subtitlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:anchor {:optional true} [:ref #'TitleAnchor]]
   [:subtitleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:zindex {:optional true} number?]
   [:subtitleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:text [:or [:ref #'Text] [:ref #'ExprRef]]]])

(def HeaderConfig
  [:map {:closed true}
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labels {:optional true} boolean?]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:format {:optional true} [:ref #'Format]]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleAngle {:optional true} number?]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:ref #'primitives/Orient]]
   [:titleAnchor {:optional true} [:ref #'TitleAnchor]]
   [:labelColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:title {:optional true} nil?] [:labelAngle {:optional true} number?]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelExpr {:optional true} string?]
   [:titleOrient {:optional true} [:ref #'primitives/Orient]]
   [:formatType {:optional true} string?]
   [:titleColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelAnchor {:optional true} [:ref #'TitleAnchor]]
   [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelOrient {:optional true} [:ref #'primitives/Orient]]
   [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]])

(def TimeLocale
  [:map {:closed true} [:date string?] [:dateTime string?]
   [:days
    [:ref {:json-schema/original-name "Vector7<string>"} #'Vector7_string_]]
   [:months
    [:ref {:json-schema/original-name "Vector12<string>"} #'Vector12_string_]]
   [:periods
    [:ref {:json-schema/original-name "Vector2<string>"} #'Vector2_string_]]
   [:shortDays
    [:ref {:json-schema/original-name "Vector7<string>"} #'Vector7_string_]]
   [:shortMonths
    [:ref {:json-schema/original-name "Vector12<string>"} #'Vector12_string_]]
   [:time string?]])

(def NumberLocale
  [:map {:closed true}
   [:currency
    [:ref {:json-schema/original-name "Vector2<string>"} #'Vector2_string_]]
   [:decimal string?] [:grouping [:vector number?]]
   [:minus {:optional true} string?] [:nan {:optional true} string?]
   [:numerals {:optional true}
    [:ref {:json-schema/original-name "Vector10<string>"} #'Vector10_string_]]
   [:percent {:optional true} string?] [:thousands string?]])

(def Locale
  [:map {:closed true} [:number {:optional true} [:ref #'NumberLocale]]
   [:time {:optional true} [:ref #'TimeLocale]]])

(def AutoSizeParams
  [:map {:closed true} [:contains {:optional true} [:enum "content" "padding"]]
   [:resize {:optional true} boolean?]
   [:type {:optional true} [:ref #'AutosizeType]]])

(def ProjectionConfig [:ref #'projection/Projection])

(def Config
  [:map {:closed true} [:tick {:optional true} [:ref #'mark/TickConfig]]
   [:axisTemporal {:optional true} [:ref #'axis/AxisConfig]]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:headerColumn {:optional true} [:ref #'HeaderConfig]]
   [:normalizedNumberFormat {:optional true} string?]
   [:axisTop {:optional true} [:ref #'axis/AxisConfig]]
   [:tooltipFormat {:optional true} [:ref #'FormatConfig]]
   [:headerRow {:optional true} [:ref #'HeaderConfig]]
   [:axisLeft {:optional true} [:ref #'axis/AxisConfig]]
   [:geoshape {:optional true} [:ref #'mark/MarkConfig]]
   [:errorbar {:optional true} [:ref #'mark/ErrorBarConfig]]
   [:axisY {:optional true} [:ref #'axis/AxisConfig]]
   [:arc {:optional true} [:ref #'mark/RectConfig]]
   [:axisYBand {:optional true} [:ref #'axis/AxisConfig]]
   [:scale {:optional true} [:ref #'scale/ScaleConfig]]
   [:locale {:optional true} [:ref #'Locale]]
   [:mark {:optional true} [:ref #'mark/MarkConfig]]
   [:bar {:optional true} [:ref #'mark/BarConfig]]
   [:concat {:optional true} [:ref #'CompositionConfig]]
   [:axisQuantitative {:optional true} [:ref #'axis/AxisConfig]]
   [:axisXBand {:optional true} [:ref #'axis/AxisConfig]]
   [:countTitle {:optional true} string?]
   [:rule {:optional true} [:ref #'mark/MarkConfig]]
   [:axisYDiscrete {:optional true} [:ref #'axis/AxisConfig]]
   [:facet {:optional true} [:ref #'CompositionConfig]]
   [:circle {:optional true} [:ref #'mark/MarkConfig]]
   [:axisBottom {:optional true} [:ref #'axis/AxisConfig]]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'selection/TopLevelParameter]]]
   [:legend {:optional true} [:ref #'legend/LegendConfig]]
   [:timeFormatType {:optional true} string?]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:axisBand {:optional true} [:ref #'axis/AxisConfig]]
   [:header {:optional true} [:ref #'HeaderConfig]]
   [:font {:optional true} string?]
   [:trail {:optional true} [:ref #'mark/LineConfig]]
   [:title {:optional true} [:ref #'TitleConfig]]
   [:axisX {:optional true} [:ref #'axis/AxisConfig]]
   [:fieldTitle {:optional true} [:enum "verbal" "functional" "plain"]]
   [:axisPoint {:optional true} [:ref #'axis/AxisConfig]]
   [:axisYTemporal {:optional true} [:ref #'axis/AxisConfig]]
   [:numberFormat {:optional true} string?]
   [:normalizedNumberFormatType {:optional true} string?]
   [:style {:optional true} [:ref #'StyleConfigIndex]]
   [:axisYQuantitative {:optional true} [:ref #'axis/AxisConfig]]
   [:axisXTemporal {:optional true} [:ref #'axis/AxisConfig]]
   [:axisRight {:optional true} [:ref #'axis/AxisConfig]]
   [:errorband {:optional true} [:ref #'mark/ErrorBandConfig]]
   [:axisXQuantitative {:optional true} [:ref #'axis/AxisConfig]]
   [:axisXPoint {:optional true} [:ref #'axis/AxisConfig]]
   [:aria {:optional true} boolean?]
   [:line {:optional true} [:ref #'mark/LineConfig]]
   [:axisXDiscrete {:optional true} [:ref #'axis/AxisConfig]]
   [:square {:optional true} [:ref #'mark/MarkConfig]]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:customFormatTypes {:optional true} boolean?]
   [:image {:optional true} [:ref #'mark/RectConfig]]
   [:point {:optional true} [:ref #'mark/MarkConfig]]
   [:area {:optional true} [:ref #'mark/AreaConfig]]
   [:headerFacet {:optional true} [:ref #'HeaderConfig]]
   [:axis {:optional true} [:ref #'axis/AxisConfig]]
   [:axisYPoint {:optional true} [:ref #'axis/AxisConfig]]
   [:selection {:optional true} [:ref #'selection/SelectionConfig]]
   [:rect {:optional true} [:ref #'mark/RectConfig]]
   [:timeFormat {:optional true} string?]
   [:projection {:optional true} [:ref #'ProjectionConfig]]
   [:boxplot {:optional true} [:ref #'mark/BoxPlotConfig]]
   [:view {:optional true} [:ref #'ViewConfig]]
   [:range {:optional true} [:ref #'RangeConfig]]
   [:numberFormatType {:optional true} string?]
   [:axisDiscrete {:optional true} [:ref #'axis/AxisConfig]]
   [:text {:optional true} [:ref #'mark/MarkConfig]]])
