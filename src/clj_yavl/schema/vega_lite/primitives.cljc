(ns clj-yavl.schema.vega-lite.primitives)

(def FieldName string?)

(def Align [:enum "left" "center" "right"])

(def SortOrder [:enum "ascending" "descending"])

(def NonArgAggregateOp
  [:enum "average" "count" "distinct" "max" "mean" "median" "min" "missing"
   "product" "q1" "q3" "ci0" "ci1" "stderr" "stdev" "stdevp" "sum" "valid"
   "values" "variance" "variancep" "exponential" "exponentialb"])

(def AggregateOp
  [:enum "argmax" "argmin" "average" "count" "distinct" "max" "mean" "median"
   "min" "missing" "product" "q1" "q3" "ci0" "ci1" "stderr" "stdev" "stdevp"
   "sum" "valid" "values" "variance" "variancep" "exponential" "exponentialb"])

(def SortByChannel
  [:enum "x" "y" "color" "fill" "stroke" "strokeWidth" "size" "shape"
   "fillOpacity" "strokeOpacity" "opacity" "text"])

(def SortByChannelDesc
  [:enum "-x" "-y" "-color" "-fill" "-stroke" "-strokeWidth" "-size" "-shape"
   "-fillOpacity" "-strokeOpacity" "-opacity" "-text"])

(def StrokeJoin [:enum "miter" "round" "bevel"])

(def FontStyle string?)

(def ColorName
  [:enum "black" "silver" "gray" "white" "maroon" "red" "purple" "fuchsia"
   "green" "lime" "olive" "yellow" "navy" "blue" "teal" "aqua" "orange"
   "aliceblue" "antiquewhite" "aquamarine" "azure" "beige" "bisque"
   "blanchedalmond" "blueviolet" "brown" "burlywood" "cadetblue" "chartreuse"
   "chocolate" "coral" "cornflowerblue" "cornsilk" "crimson" "cyan" "darkblue"
   "darkcyan" "darkgoldenrod" "darkgray" "darkgreen" "darkgrey" "darkkhaki"
   "darkmagenta" "darkolivegreen" "darkorange" "darkorchid" "darkred"
   "darksalmon" "darkseagreen" "darkslateblue" "darkslategray" "darkslategrey"
   "darkturquoise" "darkviolet" "deeppink" "deepskyblue" "dimgray" "dimgrey"
   "dodgerblue" "firebrick" "floralwhite" "forestgreen" "gainsboro" "ghostwhite"
   "gold" "goldenrod" "greenyellow" "grey" "honeydew" "hotpink" "indianred"
   "indigo" "ivory" "khaki" "lavender" "lavenderblush" "lawngreen"
   "lemonchiffon" "lightblue" "lightcoral" "lightcyan" "lightgoldenrodyellow"
   "lightgray" "lightgreen" "lightgrey" "lightpink" "lightsalmon"
   "lightseagreen" "lightskyblue" "lightslategray" "lightslategrey"
   "lightsteelblue" "lightyellow" "limegreen" "linen" "magenta"
   "mediumaquamarine" "mediumblue" "mediumorchid" "mediumpurple"
   "mediumseagreen" "mediumslateblue" "mediumspringgreen" "mediumturquoise"
   "mediumvioletred" "midnightblue" "mintcream" "mistyrose" "moccasin"
   "navajowhite" "oldlace" "olivedrab" "orangered" "orchid" "palegoldenrod"
   "palegreen" "paleturquoise" "palevioletred" "papayawhip" "peachpuff" "peru"
   "pink" "plum" "powderblue" "rosybrown" "royalblue" "saddlebrown" "salmon"
   "sandybrown" "seagreen" "seashell" "sienna" "skyblue" "slateblue" "slategray"
   "slategrey" "snow" "springgreen" "steelblue" "tan" "thistle" "tomato"
   "turquoise" "violet" "wheat" "whitesmoke" "yellowgreen" "rebeccapurple"])

(def HexColor string?)

(def Blend
  [:enum nil "multiply" "screen" "overlay" "darken" "lighten" "color-dodge"
   "color-burn" "hard-light" "soft-light" "difference" "exclusion" "hue"
   "saturation" "color" "luminosity"])

(def Cursor
  [:enum "auto" "default" "none" "context-menu" "help" "pointer" "progress"
   "wait" "cell" "crosshair" "text" "vertical-text" "alias" "copy" "move"
   "no-drop" "not-allowed" "e-resize" "n-resize" "ne-resize" "nw-resize"
   "s-resize" "se-resize" "sw-resize" "w-resize" "ew-resize" "ns-resize"
   "nesw-resize" "nwse-resize" "col-resize" "row-resize" "all-scroll" "zoom-in"
   "zoom-out" "grab" "grabbing"])

(def TextDirection [:enum "ltr" "rtl"])

(def Orientation [:enum "horizontal" "vertical"])

(def Interpolate
  [:enum "basis" "basis-open" "basis-closed" "bundle" "cardinal" "cardinal-open"
   "cardinal-closed" "catmull-rom" "linear" "linear-closed" "monotone" "natural"
   "step" "step-before" "step-after"])

(def Baseline [:enum "top" "middle" "bottom"])

(def TooltipContent [:map {:closed true} [:content [:enum "encoding" "data"]]])

(def StrokeCap [:enum "butt" "round" "square"])

(def SymbolShape string?)

(def FontWeight
  [:enum "normal" "bold" "lighter" "bolder" 100 200 300 400 500 600 700 800
   900])

(def URI string?)

(def MarkInvalidDataMode
  [:enum "filter" "break-paths-filter-domains" "break-paths-show-domains"
   "break-paths-show-path-domains" "show"])

(def Text [:or string? [:vector string?]])

(def ExprRef [:map {:closed true} [:expr string?]])

(def RelativeBandSize [:map {:closed true} [:band number?]])

(def Mark
  [:enum "arc" "area" "bar" "image" "line" "point" "rect" "rule" "text" "tick"
   "trail" "circle" "square" "geoshape"])

(def ErrorBar [:= "errorbar"])

(def ErrorBand [:= "errorband"])

(def BoxPlot [:= "boxplot"])

(def ErrorBarExtent [:enum "ci" "iqr" "stderr" "stdev"])

(def AutosizeType [:enum "pad" "none" "fit" "fit-x" "fit-y"])

(def Day number?)

(def Month number?)

(def BinnedTimeUnit
  [:enum "binnedyear" "binnedyearquarter" "binnedyearquartermonth"
   "binnedyearmonth" "binnedyearmonthdate" "binnedyearmonthdatehours"
   "binnedyearmonthdatehoursminutes" "binnedyearmonthdatehoursminutesseconds"
   "binnedyearweek" "binnedyearweekday" "binnedyearweekdayhours"
   "binnedyearweekdayhoursminutes" "binnedyearweekdayhoursminutesseconds"
   "binnedyeardayofyear" "binnedutcyear" "binnedutcyearquarter"
   "binnedutcyearquartermonth" "binnedutcyearmonth" "binnedutcyearmonthdate"
   "binnedutcyearmonthdatehours" "binnedutcyearmonthdatehoursminutes"
   "binnedutcyearmonthdatehoursminutesseconds" "binnedutcyearweek"
   "binnedutcyearweekday" "binnedutcyearweekdayhours"
   "binnedutcyearweekdayhoursminutes" "binnedutcyearweekdayhoursminutesseconds"
   "binnedutcyeardayofyear"])

(def LocalMultiTimeUnit
  [:enum "yearquarter" "yearquartermonth" "yearmonth" "yearmonthdate"
   "yearmonthdatehours" "yearmonthdatehoursminutes"
   "yearmonthdatehoursminutesseconds" "yearweek" "yearweekday"
   "yearweekdayhours" "yearweekdayhoursminutes" "yearweekdayhoursminutesseconds"
   "yeardayofyear" "quartermonth" "monthdate" "monthdatehours"
   "monthdatehoursminutes" "monthdatehoursminutesseconds" "weekday"
   "weekdayhours" "weekdayhoursminutes" "weekdayhoursminutesseconds" "dayhours"
   "dayhoursminutes" "dayhoursminutesseconds" "hoursminutes"
   "hoursminutesseconds" "minutesseconds" "secondsmilliseconds"])

(def UtcMultiTimeUnit
  [:enum "utcyearquarter" "utcyearquartermonth" "utcyearmonth"
   "utcyearmonthdate" "utcyearmonthdatehours" "utcyearmonthdatehoursminutes"
   "utcyearmonthdatehoursminutesseconds" "utcyearweek" "utcyearweekday"
   "utcyearweekdayhours" "utcyearweekdayhoursminutes"
   "utcyearweekdayhoursminutesseconds" "utcyeardayofyear" "utcquartermonth"
   "utcmonthdate" "utcmonthdatehours" "utcmonthdatehoursminutes"
   "utcmonthdatehoursminutesseconds" "utcweekday" "utcweekdayhours"
   "utcweekdayhoursminutes" "utcweekdayhoursminutesseconds" "utcdayhours"
   "utcdayhoursminutes" "utcdayhoursminutesseconds" "utchoursminutes"
   "utchoursminutesseconds" "utcminutesseconds" "utcsecondsmilliseconds"])

(def UtcSingleTimeUnit
  [:enum "utcyear" "utcquarter" "utcmonth" "utcweek" "utcday" "utcdayofyear"
   "utcdate" "utchours" "utcminutes" "utcseconds" "utcmilliseconds"])

(def LocalSingleTimeUnit
  [:enum "year" "quarter" "month" "week" "day" "dayofyear" "date" "hours"
   "minutes" "seconds" "milliseconds"])

(def ParameterName string?)

(def TimeInterval
  [:enum "millisecond" "second" "minute" "hour" "day" "week" "month" "year"])

(def TitleAnchor [:enum nil "start" "middle" "end"])

(def LabelOverlap [:or boolean? [:enum "parity" "greedy"]])

(def AxisOrient [:enum "top" "bottom" "left" "right"])

(def Dict [:map-of any? any?])

(def TimeFormatSpecifier
  [:map {:closed true} [:quarter {:optional true} string?]
   [:day {:optional true} string?] [:date {:optional true} string?]
   [:week {:optional true} string?] [:month {:optional true} string?]
   [:seconds {:optional true} string?] [:year {:optional true} string?]
   [:hours {:optional true} string?] [:milliseconds {:optional true} string?]
   [:minutes {:optional true} string?]])

(def ResolveMode [:enum "independent" "shared"])

(def BBox [:or [:vector number?] [:vector number?]])

(def TitleFrame [:enum "bounds" "group"])

(def TitleOrient [:enum "none" "left" "right" "top" "bottom"])

(def SingleDefUnitChannel
  [:enum "text" "shape" "x" "y" "xOffset" "yOffset" "x2" "y2" "longitude"
   "latitude" "longitude2" "latitude2" "theta" "theta2" "radius" "radius2"
   "time" "color" "fill" "stroke" "opacity" "fillOpacity" "strokeOpacity"
   "strokeWidth" "strokeDash" "size" "angle" "key" "href" "url" "description"])

(def Element string?)

(def Categorical
  [:enum "accent" "category10" "category20" "category20b" "category20c" "dark2"
   "paired" "pastel1" "pastel2" "set1" "set2" "set3" "tableau10" "tableau20"
   "observable10"])

(def StandardType [:enum "quantitative" "ordinal" "temporal" "nominal"])

(def RepeatRef
  [:map {:closed true} [:repeat [:enum "row" "column" "repeat" "layer"]]])

(def ScaleInterpolateParams
  [:map {:closed true} [:gamma {:optional true} number?]
   [:type [:enum "rgb" "cubehelix" "cubehelix-long"]]])

(def Cyclical [:enum "rainbow" "sinebow"])

(def SequentialMultiHue
  [:enum "turbo" "viridis" "inferno" "magma" "plasma" "cividis" "bluegreen"
   "bluegreen-3" "bluegreen-4" "bluegreen-5" "bluegreen-6" "bluegreen-7"
   "bluegreen-8" "bluegreen-9" "bluepurple" "bluepurple-3" "bluepurple-4"
   "bluepurple-5" "bluepurple-6" "bluepurple-7" "bluepurple-8" "bluepurple-9"
   "goldgreen" "goldgreen-3" "goldgreen-4" "goldgreen-5" "goldgreen-6"
   "goldgreen-7" "goldgreen-8" "goldgreen-9" "goldorange" "goldorange-3"
   "goldorange-4" "goldorange-5" "goldorange-6" "goldorange-7" "goldorange-8"
   "goldorange-9" "goldred" "goldred-3" "goldred-4" "goldred-5" "goldred-6"
   "goldred-7" "goldred-8" "goldred-9" "greenblue" "greenblue-3" "greenblue-4"
   "greenblue-5" "greenblue-6" "greenblue-7" "greenblue-8" "greenblue-9"
   "orangered" "orangered-3" "orangered-4" "orangered-5" "orangered-6"
   "orangered-7" "orangered-8" "orangered-9" "purplebluegreen"
   "purplebluegreen-3" "purplebluegreen-4" "purplebluegreen-5"
   "purplebluegreen-6" "purplebluegreen-7" "purplebluegreen-8"
   "purplebluegreen-9" "purpleblue" "purpleblue-3" "purpleblue-4" "purpleblue-5"
   "purpleblue-6" "purpleblue-7" "purpleblue-8" "purpleblue-9" "purplered"
   "purplered-3" "purplered-4" "purplered-5" "purplered-6" "purplered-7"
   "purplered-8" "purplered-9" "redpurple" "redpurple-3" "redpurple-4"
   "redpurple-5" "redpurple-6" "redpurple-7" "redpurple-8" "redpurple-9"
   "yellowgreenblue" "yellowgreenblue-3" "yellowgreenblue-4" "yellowgreenblue-5"
   "yellowgreenblue-6" "yellowgreenblue-7" "yellowgreenblue-8"
   "yellowgreenblue-9" "yellowgreen" "yellowgreen-3" "yellowgreen-4"
   "yellowgreen-5" "yellowgreen-6" "yellowgreen-7" "yellowgreen-8"
   "yellowgreen-9" "yelloworangebrown" "yelloworangebrown-3"
   "yelloworangebrown-4" "yelloworangebrown-5" "yelloworangebrown-6"
   "yelloworangebrown-7" "yelloworangebrown-8" "yelloworangebrown-9"
   "yelloworangered" "yelloworangered-3" "yelloworangered-4" "yelloworangered-5"
   "yelloworangered-6" "yelloworangered-7" "yelloworangered-8"
   "yelloworangered-9" "darkblue" "darkblue-3" "darkblue-4" "darkblue-5"
   "darkblue-6" "darkblue-7" "darkblue-8" "darkblue-9" "darkgold" "darkgold-3"
   "darkgold-4" "darkgold-5" "darkgold-6" "darkgold-7" "darkgold-8" "darkgold-9"
   "darkgreen" "darkgreen-3" "darkgreen-4" "darkgreen-5" "darkgreen-6"
   "darkgreen-7" "darkgreen-8" "darkgreen-9" "darkmulti" "darkmulti-3"
   "darkmulti-4" "darkmulti-5" "darkmulti-6" "darkmulti-7" "darkmulti-8"
   "darkmulti-9" "darkred" "darkred-3" "darkred-4" "darkred-5" "darkred-6"
   "darkred-7" "darkred-8" "darkred-9" "lightgreyred" "lightgreyred-3"
   "lightgreyred-4" "lightgreyred-5" "lightgreyred-6" "lightgreyred-7"
   "lightgreyred-8" "lightgreyred-9" "lightgreyteal" "lightgreyteal-3"
   "lightgreyteal-4" "lightgreyteal-5" "lightgreyteal-6" "lightgreyteal-7"
   "lightgreyteal-8" "lightgreyteal-9" "lightmulti" "lightmulti-3"
   "lightmulti-4" "lightmulti-5" "lightmulti-6" "lightmulti-7" "lightmulti-8"
   "lightmulti-9" "lightorange" "lightorange-3" "lightorange-4" "lightorange-5"
   "lightorange-6" "lightorange-7" "lightorange-8" "lightorange-9"
   "lighttealblue" "lighttealblue-3" "lighttealblue-4" "lighttealblue-5"
   "lighttealblue-6" "lighttealblue-7" "lighttealblue-8" "lighttealblue-9"])

(def Diverging
  [:enum "blueorange" "blueorange-3" "blueorange-4" "blueorange-5"
   "blueorange-6" "blueorange-7" "blueorange-8" "blueorange-9" "blueorange-10"
   "blueorange-11" "brownbluegreen" "brownbluegreen-3" "brownbluegreen-4"
   "brownbluegreen-5" "brownbluegreen-6" "brownbluegreen-7" "brownbluegreen-8"
   "brownbluegreen-9" "brownbluegreen-10" "brownbluegreen-11" "purplegreen"
   "purplegreen-3" "purplegreen-4" "purplegreen-5" "purplegreen-6"
   "purplegreen-7" "purplegreen-8" "purplegreen-9" "purplegreen-10"
   "purplegreen-11" "pinkyellowgreen" "pinkyellowgreen-3" "pinkyellowgreen-4"
   "pinkyellowgreen-5" "pinkyellowgreen-6" "pinkyellowgreen-7"
   "pinkyellowgreen-8" "pinkyellowgreen-9" "pinkyellowgreen-10"
   "pinkyellowgreen-11" "purpleorange" "purpleorange-3" "purpleorange-4"
   "purpleorange-5" "purpleorange-6" "purpleorange-7" "purpleorange-8"
   "purpleorange-9" "purpleorange-10" "purpleorange-11" "redblue" "redblue-3"
   "redblue-4" "redblue-5" "redblue-6" "redblue-7" "redblue-8" "redblue-9"
   "redblue-10" "redblue-11" "redgrey" "redgrey-3" "redgrey-4" "redgrey-5"
   "redgrey-6" "redgrey-7" "redgrey-8" "redgrey-9" "redgrey-10" "redgrey-11"
   "redyellowblue" "redyellowblue-3" "redyellowblue-4" "redyellowblue-5"
   "redyellowblue-6" "redyellowblue-7" "redyellowblue-8" "redyellowblue-9"
   "redyellowblue-10" "redyellowblue-11" "redyellowgreen" "redyellowgreen-3"
   "redyellowgreen-4" "redyellowgreen-5" "redyellowgreen-6" "redyellowgreen-7"
   "redyellowgreen-8" "redyellowgreen-9" "redyellowgreen-10" "redyellowgreen-11"
   "spectral" "spectral-3" "spectral-4" "spectral-5" "spectral-6" "spectral-7"
   "spectral-8" "spectral-9" "spectral-10" "spectral-11"])

(def SequentialSingleHue
  [:enum "blues" "tealblues" "teals" "greens" "browns" "greys" "purples"
   "warmgreys" "reds" "oranges"])

(def RangeEnum
  [:enum "width" "height" "symbol" "category" "ordinal" "ramp" "diverging"
   "heatmap"])

(def ScaleBinParams
  [:map {:closed true} [:start {:optional true} number?] [:step number?]
   [:stop {:optional true} number?]])

(def ScaleInterpolateEnum
  [:enum "rgb" "lab" "hcl" "hsl" "hsl-long" "hcl-long" "cubehelix"
   "cubehelix-long"])

(def FieldRange [:map {:closed true} [:field string?]])

(def ScaleType
  [:enum "linear" "log" "pow" "sqrt" "symlog" "identity" "sequential" "time"
   "utc" "quantile" "quantize" "threshold" "bin-ordinal" "ordinal" "point"
   "band"])

(def LayoutAlign [:enum "all" "each" "none"])

(def Orient [:enum "left" "right" "top" "bottom"])

(def LegendOrient
  [:enum "none" "left" "right" "top" "bottom" "top-left" "top-right"
   "bottom-left" "bottom-right"])

(def Type [:enum "quantitative" "ordinal" "temporal" "nominal" "geojson"])

(def PrimitiveValue [:or number? string? boolean? nil?])

(def CompositionConfig
  [:map {:closed true} [:columns {:optional true} number?]
   [:spacing {:optional true} number?]])

(def RowCol_number_
  [:map {:closed true, :json-schema/original-name "RowCol<number>"}
   [:column {:optional true} number?] [:row {:optional true} number?]])

(def InlineDataset
  [:or [:vector number?] [:vector string?] [:vector boolean?]
   [:vector [:map-of any? any?]] string? [:map-of any? any?]])

(def Parse [:map-of any? any?])

(def Vector2_number_
  [:vector {:json-schema/original-name "Vector2<number>"} number?])

(def SphereGenerator
  [:map {:closed true} [:name {:optional true} string?]
   [:sphere [:or [:map-of any? any?] [:enum true]]]])

(def WindowOnlyOp
  [:enum "row_number" "rank" "dense_rank" "percent_rank" "cume_dist" "ntile"
   "lag" "lead" "first_value" "last_value" "nth_value"])

(def SampleTransform [:map {:closed true} [:sample number?]])

(def ImputeMethod [:enum "value" "median" "max" "min" "mean"])

(def ImputeSequence
  [:map {:closed true} [:start {:optional true} number?]
   [:step {:optional true} number?] [:stop number?]])

(def RepeatMapping
  [:map {:closed true} [:column {:optional true} [:vector string?]]
   [:row {:optional true} [:vector string?]]])

(def RowCol_boolean_
  [:map {:closed true, :json-schema/original-name "RowCol<boolean>"}
   [:column {:optional true} boolean?] [:row {:optional true} boolean?]])

(def ValueDef_number_
  [:map {:closed true, :json-schema/original-name "ValueDef<number>"}
   [:value number?]])

(def StackOffset [:enum "zero" "center" "normalize"])

(def TypeForShape [:enum "nominal" "ordinal" "geojson"])

(def Dict_SelectionInitInterval_
  [:map-of {:json-schema/original-name "Dict<SelectionInitInterval>"} any?
   any?])

(def Expr string?)

(def EventType
  [:enum "click" "dblclick" "dragenter" "dragleave" "dragover" "keydown"
   "keypress" "keyup" "mousedown" "mousemove" "mouseout" "mouseover" "mouseup"
   "mousewheel" "pointerdown" "pointermove" "pointerout" "pointerover"
   "pointerup" "timer" "touchend" "touchmove" "touchstart" "wheel"])

(def MarkType
  [:enum "arc" "area" "image" "group" "line" "path" "rect" "rule" "shape"
   "symbol" "text" "trail"])

(def SelectionResolution [:enum "global" "union" "intersect"])

(def SelectionType [:enum "point" "interval"])

(def Dict_SelectionInit_
  [:map-of {:json-schema/original-name "Dict<SelectionInit>"} any? any?])

(def ProjectionType
  [:enum "albers" "albersUsa" "azimuthalEqualArea" "azimuthalEquidistant"
   "conicConformal" "conicEqualArea" "conicEquidistant" "equalEarth"
   "equirectangular" "gnomonic" "identity" "mercator" "naturalEarth1"
   "orthographic" "stereographic" "transverseMercator"])

(def Vector3_number_
  [:vector {:json-schema/original-name "Vector3<number>"} number?])

(def GeoJsonProperties [:or [:map-of any? any?] nil?])

(def Position [:vector number?])

(def StepFor [:enum "position" "offset"])

(def LayerRepeatMapping
  [:map {:closed true} [:column {:optional true} [:vector string?]]
   [:layer [:vector string?]] [:row {:optional true} [:vector string?]]])

(def RangeRawArray [:vector number?])

(def Padding
  [:or number?
   [:map {:closed true} [:bottom {:optional true} number?]
    [:left {:optional true} number?] [:right {:optional true} number?]
    [:top {:optional true} number?]]])

(def FormatConfig
  [:map {:closed true} [:normalizedNumberFormat {:optional true} string?]
   [:normalizedNumberFormatType {:optional true} string?]
   [:numberFormat {:optional true} string?]
   [:numberFormatType {:optional true} string?]
   [:timeFormat {:optional true} string?]
   [:timeFormatType {:optional true} string?]])

(def Vector2_string_
  [:vector {:json-schema/original-name "Vector2<string>"} string?])

(def Vector12_string_
  [:vector {:json-schema/original-name "Vector12<string>"} string?])

(def Vector7_string_
  [:vector {:json-schema/original-name "Vector7<string>"} string?])

(def Vector10_string_
  [:vector {:json-schema/original-name "Vector10<string>"} string?])

(def ScaleInvalidDataShowAsValue__strokeWidth__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"strokeWidth\">"}
   [:value {:optional true} number?]])

(def ScaleInvalidDataShowAsValue__angle__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"angle\">"}
   [:value {:optional true} number?]])

(def ScaleInvalidDataShowAsValue__radius__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"radius\">"}
   [:value {:optional true} number?]])

(def ScaleInvalidDataShowAsValue__strokeOpacity__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"strokeOpacity\">"}
   [:value {:optional true} number?]])

(def ScaleInvalidDataShowAsValue__yOffset__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"yOffset\">"}
   [:value {:optional true} number?]])

(def ScaleInvalidDataShowAsValue__theta__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"theta\">"}
   [:value {:optional true} number?]])

(def ScaleInvalidDataShowAsValue__time__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"time\">"}
   [:value {:optional true} number?]])

(def ScaleInvalidDataShowAsValue__size__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"size\">"}
   [:value {:optional true} number?]])

(def ScaleInvalidDataShowAsValue__xOffset__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"xOffset\">"}
   [:value {:optional true} number?]])

(def ScaleInvalidDataShowAsValue__strokeDash__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"strokeDash\">"}
   [:value {:optional true} [:vector number?]]])

(def ScaleInvalidDataShowAsValue__y__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"y\">"}
   [:value {:optional true} [:or number? [:enum "height"]]]])

(def ScaleInvalidDataShowAsValue__x__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"x\">"}
   [:value {:optional true} [:or number? [:enum "width"]]]])

(def ScaleInvalidDataShowAsValue__fillOpacity__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"fillOpacity\">"}
   [:value {:optional true} number?]])

(def ScaleInvalidDataShowAsValue__opacity__
  [:map
   {:closed true,
    :json-schema/original-name "ScaleInvalidDataShowAsValue<\"opacity\">"}
   [:value {:optional true} number?]])

(def Dict_InlineDataset_
  [:map-of {:json-schema/original-name "Dict<InlineDataset>"} any? any?])

(def ParseValue [:or string? nil?])

(def Vector2_boolean_
  [:vector {:json-schema/original-name "Vector2<boolean>"} boolean?])
