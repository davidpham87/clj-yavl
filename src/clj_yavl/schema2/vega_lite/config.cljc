(ns clj-yavl.schema2.vega-lite.config
  (:require [clj-yavl.schema2.vega-lite.primitives :as primitives]
            [clj-yavl.schema2.vega-lite.expr :as expr]
            [clj-yavl.schema2.vega-lite.common :as common]
            [clj-yavl.schema2.vega-lite.mark :as mark]
            [clj-yavl.schema2.vega-lite.axis :as axis]
            [clj-yavl.schema2.vega-lite.legend :as legend]
            [clj-yavl.schema2.vega-lite.scale :as scale]
            [clj-yavl.schema2.vega-lite.projection :as projection]
            [clj-yavl.schema2.vega-lite.selection :as selection]))

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
  [:map {:closed false}
   [:arc {:optional true} [:ref #'mark/RectConfig]]
   [:area {:optional true} [:ref #'mark/AreaConfig]]
   [:bar {:optional true} [:ref #'mark/BarConfig]]
   [:circle {:optional true} [:ref #'mark/MarkConfig]]
   [:geoshape {:optional true} [:ref #'mark/MarkConfig]]
   [:group-subtitle {:optional true} [:ref #'mark/MarkConfig]]
   [:group-title {:optional true} [:ref #'mark/MarkConfig]]
   [:guide-label {:optional true} [:ref #'mark/MarkConfig]]
   [:guide-title {:optional true} [:ref #'mark/MarkConfig]]
   [:image {:optional true} [:ref #'mark/RectConfig]]
   [:line {:optional true} [:ref #'mark/LineConfig]]
   [:mark {:optional true} [:ref #'mark/MarkConfig]]
   [:point {:optional true} [:ref #'mark/MarkConfig]]
   [:rect {:optional true} [:ref #'mark/RectConfig]]
   [:rule {:optional true} [:ref #'mark/MarkConfig]]
   [:square {:optional true} [:ref #'mark/MarkConfig]]
   [:text {:optional true} [:ref #'mark/MarkConfig]]
   [:tick {:optional true} [:ref #'mark/TickConfig]]
   [:trail {:optional true} [:ref #'mark/LineConfig]]])

(def ViewConfig
  [:map {:closed true}
   [:clip {:optional true} boolean?]
   [:continuousHeight {:optional true} number?]
   [:continuousWidth {:optional true} number?]
   [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:cursor {:optional true} [:ref #'common/Cursor]]
   [:discreteHeight {:optional true}
    [:or number? [:map {:closed true} [:step number?]]]]
   [:discreteWidth {:optional true}
    [:or number? [:map {:closed true} [:step number?]]]]
   [:fill {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
   [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:step {:optional true} number?]
   [:stroke {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
   [:strokeCap {:optional true} [:or [:ref #'common/StrokeCap] [:ref #'ExprRef]]]
   [:strokeDash {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeJoin {:optional true} [:or [:ref #'common/StrokeJoin] [:ref #'ExprRef]]]
   [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
   [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]])

(def BaseTitleNoValueRefs
  [:map {:closed true}
   [:align {:optional true} [:ref #'Align]]
   [:anchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:baseline {:optional true} [:ref #'TextBaseline]]
   [:color {:optional true} [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:frame {:optional true}
    [:or [:or [:ref #'TitleFrame] string?] [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:or [:ref #'TitleOrient] [:ref #'ExprRef]]]
   [:subtitleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:subtitleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:subtitleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:subtitleFontStyle {:optional true}
    [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:subtitleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:subtitleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:subtitlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:zindex {:optional true} [:or number? [:ref #'ExprRef]]]])

(def TitleConfig [:ref #'BaseTitleNoValueRefs])

(def TitleParams
  [:map {:closed true}
   [:align {:optional true} [:ref #'Align]]
   [:anchor {:optional true} [:ref #'TitleAnchor]]
   [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:baseline {:optional true} [:ref #'TextBaseline]]
   [:color {:optional true} [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
   [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
   [:font {:optional true} [:or string? [:ref #'ExprRef]]]
   [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:fontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:fontWeight {:optional true} [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:frame {:optional true}
    [:or [:or [:ref #'TitleFrame] string?] [:ref #'ExprRef]]]
   [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
   [:orient {:optional true} [:or [:ref #'TitleOrient] [:ref #'ExprRef]]]
   [:style {:optional true} [:or string? [:vector string?]]]
   [:subtitle {:optional true} [:ref #'Text]]
   [:subtitleColor {:optional true}
    [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
   [:subtitleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:subtitleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:subtitleFontStyle {:optional true}
    [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:subtitleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:subtitleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:subtitlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:text [:or [:ref #'Text] [:ref #'ExprRef]]]
   [:zindex {:optional true} number?]])

(def HeaderConfig
  [:map {:closed true}
   [:format {:optional true} [:ref #'Format]]
   [:formatType {:optional true} string?]
   [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:labelAnchor {:optional true} [:ref #'TitleAnchor]]
   [:labelAngle {:optional true} number?]
   [:labelBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:labelColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:labelExpr {:optional true} string?]
   [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:labelFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labelOrient {:optional true} [:ref #'primitives/Orient]]
   [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
   [:labels {:optional true} boolean?]
   [:orient {:optional true} [:ref #'primitives/Orient]]
   [:title {:optional true} nil?]
   [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
   [:titleAnchor {:optional true} [:ref #'TitleAnchor]]
   [:titleAngle {:optional true} number?]
   [:titleBaseline {:optional true}
    [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
   [:titleColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
   [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleFontStyle {:optional true} [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
   [:titleFontWeight {:optional true}
    [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
   [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
   [:titleOrient {:optional true} [:ref #'primitives/Orient]]
   [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]])

(def TimeLocale
  [:map {:closed true}
   [:date string?]
   [:dateTime string?]
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
   [:decimal string?]
   [:grouping [:vector number?]]
   [:minus {:optional true} string?]
   [:nan {:optional true} string?]
   [:numerals {:optional true}
    [:ref {:json-schema/original-name "Vector10<string>"} #'Vector10_string_]]
   [:percent {:optional true} string?]
   [:thousands string?]])

(def Locale
  [:map {:closed true}
   [:number {:optional true} [:ref #'NumberLocale]]
   [:time {:optional true} [:ref #'TimeLocale]]])

(def AutoSizeParams
  [:map {:closed true}
   [:contains {:optional true} [:enum "content" "padding"]]
   [:resize {:optional true} boolean?]
   [:type {:optional true} [:ref #'AutosizeType]]])

(def ProjectionConfig [:ref #'projection/Projection])

(def Config
  [:map {:closed true}
   [:arc {:optional true} [:ref #'mark/RectConfig]]
   [:area {:optional true} [:ref #'mark/AreaConfig]]
   [:aria {:optional true} boolean?]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:axis {:optional true} [:ref #'axis/AxisConfig]]
   [:axisBand {:optional true} [:ref #'axis/AxisConfig]]
   [:axisBottom {:optional true} [:ref #'axis/AxisConfig]]
   [:axisDiscrete {:optional true} [:ref #'axis/AxisConfig]]
   [:axisLeft {:optional true} [:ref #'axis/AxisConfig]]
   [:axisPoint {:optional true} [:ref #'axis/AxisConfig]]
   [:axisQuantitative {:optional true} [:ref #'axis/AxisConfig]]
   [:axisRight {:optional true} [:ref #'axis/AxisConfig]]
   [:axisTemporal {:optional true} [:ref #'axis/AxisConfig]]
   [:axisTop {:optional true} [:ref #'axis/AxisConfig]]
   [:axisX {:optional true} [:ref #'axis/AxisConfig]]
   [:axisXBand {:optional true} [:ref #'axis/AxisConfig]]
   [:axisXDiscrete {:optional true} [:ref #'axis/AxisConfig]]
   [:axisXPoint {:optional true} [:ref #'axis/AxisConfig]]
   [:axisXQuantitative {:optional true} [:ref #'axis/AxisConfig]]
   [:axisXTemporal {:optional true} [:ref #'axis/AxisConfig]]
   [:axisY {:optional true} [:ref #'axis/AxisConfig]]
   [:axisYBand {:optional true} [:ref #'axis/AxisConfig]]
   [:axisYDiscrete {:optional true} [:ref #'axis/AxisConfig]]
   [:axisYPoint {:optional true} [:ref #'axis/AxisConfig]]
   [:axisYQuantitative {:optional true} [:ref #'axis/AxisConfig]]
   [:axisYTemporal {:optional true} [:ref #'axis/AxisConfig]]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:bar {:optional true} [:ref #'mark/BarConfig]]
   [:boxplot {:optional true} [:ref #'mark/BoxPlotConfig]]
   [:circle {:optional true} [:ref #'mark/MarkConfig]]
   [:concat {:optional true} [:ref #'CompositionConfig]]
   [:countTitle {:optional true} string?]
   [:customFormatTypes {:optional true} boolean?]
   [:errorband {:optional true} [:ref #'mark/ErrorBandConfig]]
   [:errorbar {:optional true} [:ref #'mark/ErrorBarConfig]]
   [:facet {:optional true} [:ref #'CompositionConfig]]
   [:fieldTitle {:optional true} [:enum "verbal" "functional" "plain"]]
   [:font {:optional true} string?]
   [:geoshape {:optional true} [:ref #'mark/MarkConfig]]
   [:header {:optional true} [:ref #'HeaderConfig]]
   [:headerColumn {:optional true} [:ref #'HeaderConfig]]
   [:headerFacet {:optional true} [:ref #'HeaderConfig]]
   [:headerRow {:optional true} [:ref #'HeaderConfig]]
   [:image {:optional true} [:ref #'mark/RectConfig]]
   [:legend {:optional true} [:ref #'legend/LegendConfig]]
   [:line {:optional true} [:ref #'mark/LineConfig]]
   [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
   [:locale {:optional true} [:ref #'Locale]]
   [:mark {:optional true} [:ref #'mark/MarkConfig]]
   [:normalizedNumberFormat {:optional true} string?]
   [:normalizedNumberFormatType {:optional true} string?]
   [:numberFormat {:optional true} string?]
   [:numberFormatType {:optional true} string?]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'selection/TopLevelParameter]]]
   [:point {:optional true} [:ref #'mark/MarkConfig]]
   [:projection {:optional true} [:ref #'ProjectionConfig]]
   [:range {:optional true} [:ref #'RangeConfig]]
   [:rect {:optional true} [:ref #'mark/RectConfig]]
   [:rule {:optional true} [:ref #'mark/MarkConfig]]
   [:scale {:optional true} [:ref #'scale/ScaleConfig]]
   [:selection {:optional true} [:ref #'selection/SelectionConfig]]
   [:square {:optional true} [:ref #'mark/MarkConfig]]
   [:style {:optional true} [:ref #'StyleConfigIndex]]
   [:text {:optional true} [:ref #'mark/MarkConfig]]
   [:tick {:optional true} [:ref #'mark/TickConfig]]
   [:timeFormat {:optional true} string?]
   [:timeFormatType {:optional true} string?]
   [:title {:optional true} [:ref #'TitleConfig]]
   [:tooltipFormat {:optional true} [:ref #'FormatConfig]]
   [:trail {:optional true} [:ref #'mark/LineConfig]]
   [:view {:optional true} [:ref #'ViewConfig]]])
