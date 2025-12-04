(ns clj-yavl.schema.vega-lite
  (:require [malli.core :as m]))

;; Forward declarations
(declare FieldName ArgminDef NonArgAggregateOp ArgmaxDef Aggregate AggregateOp AggregatedFieldDef AggregateTransform Align SortByChannel SortByChannelDesc SortOrder AllSortString StrokeJoin FontStyle ColorName HexColor Color GradientStop RadialGradient LinearGradient Gradient Blend Cursor TextDirection Orientation Interpolate Baseline TextBaseline TooltipContent StrokeCap SymbolShape FontWeight URI MarkInvalidDataMode Text ExprRef OverlayMarkDef RelativeBandSize Mark MarkDef ErrorBar ErrorBand BoxPlot CompositeMark LineConfig RectConfig TickConfig BarConfig MarkConfig AreaConfig AnyMarkConfig ErrorBarExtent ErrorBandDef BoxPlotDef ErrorBarDef CompositeMarkDef AnyMark AutosizeType AutoSizeParams LogicalNot_Predicate_ LogicalOr_Predicate_ Day Month DateTime BinnedTimeUnit LocalMultiTimeUnit UtcMultiTimeUnit MultiTimeUnit UtcSingleTimeUnit LocalSingleTimeUnit SingleTimeUnit TimeUnit TimeUnitParams FieldEqualPredicate FieldGTEPredicate FieldValidPredicate FieldGTPredicate FieldRangePredicate FieldLTEPredicate FieldLTPredicate ParameterName ParameterPredicate FieldOneOfPredicate Predicate LogicalAnd_Predicate_ PredicateComposition ConditionalPredicate__ValueDef__Color_null___ExprRef__ ConditionalAxisProperty__Color_null__ ConditionalAxisColor TimeInterval TimeIntervalStep ConditionalPredicate__ValueDef__Align_null___ExprRef__ ConditionalAxisProperty__Align_null__ ConditionalAxisLabelAlign ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__ ConditionalAxisProperty__TextBaseline_null__ ConditionalAxisLabelBaseline TitleAnchor ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__)
(declare ConditionalAxisProperty__FontStyle_null__ ConditionalAxisLabelFontStyle LabelOverlap ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__ ConditionalAxisProperty__FontWeight_null__ ConditionalAxisLabelFontWeight AxisOrient Dict TimeFormatSpecifier Format ConditionalPredicate__ValueDef__number_null___ExprRef__ ConditionalAxisProperty__number_null__ ConditionalAxisNumber ConditionalPredicate__ValueDef__number___null___ExprRef__ ConditionalAxisProperty__number___null__ ConditionalAxisNumberArray ConditionalPredicate__ValueDef__string_null___ExprRef__ ConditionalAxisProperty__string_null__ ConditionalAxisString Axis AxisConfig ResolveMode AxisResolveMap BBox TitleFrame TitleOrient BaseTitleNoValueRefs SingleDefUnitChannel ParameterExtent BinExtent BinParams BinTransform Element BindCheckbox BindDirect BindInput BindRadioSelect BindRange Binding BoxPlotConfig BrushConfig CalculateTransform Categorical StandardType ConditionalPredicate_ValueDef__Gradient_string_null_ExprRef___ ConditionalParameter_ValueDef__Gradient_string_null_ExprRef___ ConditionalValueDef__Gradient_string_null_ExprRef__ RepeatRef Field ScaleInterpolateParams Cyclical SequentialMultiHue Diverging SequentialSingleHue ColorScheme SchemeParams DomainUnionWith RangeEnum ScaleBinParams ScaleBins ScaleInterpolateEnum FieldRange ScaleType Scale EncodingSortField SortArray SortByEncoding Sort LayoutAlign TickCount Orient LegendOrient Legend FieldOrDatumDefWithCondition_MarkPropFieldDef__Gradient_string_null__ Type PrimitiveValue ConditionalParameter_MarkPropFieldOrDatumDef_ ConditionalPredicate_MarkPropFieldOrDatumDef_ ConditionalMarkPropFieldOrDatumDef ValueDefWithCondition_MarkPropFieldOrDatumDef__Gradient_string_null__ FieldOrDatumDefWithCondition_DatumDef__Gradient_string_null__ MarkPropDef__Gradient_string_null__ ColorDef CompositionConfig RowCol_number_ InlineDataset Parse CsvDataFormat JsonDataFormat TopoDataFormat DsvDataFormat DataFormat InlineData NamedData UrlData DataSource Vector2_number_ Vector2_Vector2_number__ GraticuleParams GraticuleGenerator)
(declare SequenceParams SequenceGenerator SphereGenerator Generator Data PivotTransform DensityTransform FoldTransform SortField WindowOnlyOp WindowFieldDef WindowTransform FilterTransform ExtentTransform FlattenTransform JoinAggregateFieldDef JoinAggregateTransform LookupData LookupSelection LookupTransform LoessTransform StackTransform QuantileTransform TimeUnitTransformParams TimeUnitTransform SampleTransform RegressionTransform ImputeMethod ImputeSequence ImputeTransform Transform ScaleResolveMap LegendResolveMap Resolve TitleParams HConcatSpec_GenericSpec_ NonNormalizedSpec RepeatMapping RowCol_LayoutAlign_ RowCol_boolean_ NonLayerRepeatSpec SecondaryFieldDef ValueDef__number__width___height__ExprRef__ PositionValueDef DatumDef Position2Def ConditionalParameter_ValueDef__string_null_ExprRef___ ConditionalPredicate_ValueDef__string_null_ExprRef___ ConditionalValueDef__string_null_ExprRef__ ValueDefWithCondition_MarkPropFieldOrDatumDef__string_null__ StringValueDefWithCondition ConditionalPredicate_ValueDef_number__ ConditionalParameter_ValueDef_number__ ConditionalValueDef_number_ OrderValueDef ConditionalParameter_ValueDef__number___ExprRef___ ConditionalPredicate_ValueDef__number___ExprRef___ ConditionalValueDef__number___ExprRef__ FieldOrDatumDefWithCondition_MarkPropFieldDef_number___ FieldOrDatumDefWithCondition_DatumDef_number___ ValueDefWithCondition_MarkPropFieldOrDatumDef_number___ MarkPropDef_number___ NumericArrayMarkPropDef ValueDef_number_ ScaleFieldDef ScaleDatumDef OffsetDef ConditionalParameter_ValueDef__Text_ExprRef___ ConditionalPredicate_ValueDef__Text_ExprRef___ ConditionalValueDef__Text_ExprRef__ FieldOrDatumDefWithCondition_StringDatumDef_Text_ FieldOrDatumDefWithCondition_StringFieldDef_Text_ ConditionalParameter_StringFieldDef_ ConditionalPredicate_StringFieldDef_ ConditionalStringFieldDef ValueDefWithCondition_StringFieldDef_Text_ TextDef TypedFieldDef FieldDefWithoutScale OrderOnlyDef ConditionalParameter_ValueDef__number_ExprRef___ ConditionalPredicate_ValueDef__number_ExprRef___ ConditionalValueDef__number_ExprRef__ FieldOrDatumDefWithCondition_MarkPropFieldDef_number_ ValueDefWithCondition_MarkPropFieldOrDatumDef_number_ FieldOrDatumDefWithCondition_DatumDef_number_ MarkPropDef_number_ NumericMarkPropDef StackOffset PositionDatumDefBase PositionFieldDefBase PolarDef LatLongFieldDef LatLongDef TimeFieldDef TimeDef ConditionalParameter_ValueDef__string_ExprRef___ ConditionalPredicate_ValueDef__string_ExprRef___ ConditionalValueDef__string_ExprRef__ FieldOrDatumDefWithCondition_StringFieldDef_string_)
(declare StringFieldDefWithCondition OrderFieldDef StringFieldDef TypeForShape ConditionalParameter_MarkPropFieldOrDatumDef_TypeForShape__ ConditionalPredicate_MarkPropFieldOrDatumDef_TypeForShape__ ConditionalMarkPropFieldOrDatumDef_TypeForShape_ ValueDefWithCondition_MarkPropFieldOrDatumDef_TypeForShape___string_null__ FieldOrDatumDefWithCondition_DatumDef__string_null__ FieldOrDatumDefWithCondition_MarkPropFieldDef_TypeForShape___string_null__ MarkPropDef__string_null__TypeForShape_ ShapeDef ImputeParams PositionFieldDef PositionDatumDef PositionDef Encoding Dict_SelectionInitInterval_ SelectionInitIntervalMapping Expr EventType MarkType WindowEventType EventStream DerivedStream MergedStream Stream LegendStreamBinding LegendBinding SelectionResolution IntervalSelectionConfig PointSelectionConfig SelectionInit SelectionType Dict_SelectionInit_ SelectionInitMapping SelectionParameter ProjectionType Vector3_number_ GeoJsonProperties Position Polygon LineString GeometryCollection Point MultiPolygon MultiLineString MultiPoint Geometry Feature GeoJsonFeature Feature_Geometry_GeoJsonProperties_ FeatureCollection GeoJsonFeatureCollection Fit Projection StepFor Step ViewBackground UnitSpecWithFrame SharedEncoding GenericUnitSpec_Encoding_AnyMark_ UnitSpec LayerSpec LayerRepeatMapping LayerRepeatSpec RepeatSpec Header FacetFieldDef FacetEncodingFieldDef RowColumnEncodingFieldDef FacetedEncoding FacetedUnitSpec FacetMapping FacetSpec VConcatSpec_GenericSpec_ Spec ConcatSpec_GenericSpec_ RangeRawArray RangeRaw RangeScheme RangeConfig LegendConfig IntervalSelectionConfigWithoutType PointSelectionConfigWithoutType SelectionConfig ProjectionConfig TopLevelSelectionParameter VariableParameter TopLevelParameter HeaderConfig ErrorBarConfig ErrorBandConfig Padding FormatConfig Vector2_string_ Vector12_string_ Vector7_string_ TimeLocale Vector10_string_)
(declare NumberLocale Locale ViewConfig StyleConfigIndex ScaleInvalidDataShowAsValue__strokeWidth__ ScaleInvalidDataShowAs__strokeWidth__ ScaleInvalidDataShowAsValue__angle__ ScaleInvalidDataShowAs__angle__ ScaleInvalidDataShowAsValue__radius__ ScaleInvalidDataShowAs__radius__ ScaleInvalidDataShowAsValue__strokeOpacity__ ScaleInvalidDataShowAs__strokeOpacity__ ScaleInvalidDataShowAsValue__yOffset__ ScaleInvalidDataShowAs__yOffset__ ScaleInvalidDataShowAsValue__fill__ ScaleInvalidDataShowAs__fill__ ScaleInvalidDataShowAsValue__theta__ ScaleInvalidDataShowAs__theta__ ScaleInvalidDataShowAsValue__time__ ScaleInvalidDataShowAs__time__ ScaleInvalidDataShowAsValue__color__ ScaleInvalidDataShowAs__color__ ScaleInvalidDataShowAsValue__size__ ScaleInvalidDataShowAs__size__ ScaleInvalidDataShowAsValue__shape__ ScaleInvalidDataShowAs__shape__ ScaleInvalidDataShowAsValue__stroke__ ScaleInvalidDataShowAs__stroke__ ScaleInvalidDataShowAsValue__xOffset__ ScaleInvalidDataShowAs__xOffset__ ScaleInvalidDataShowAsValue__strokeDash__ ScaleInvalidDataShowAs__strokeDash__ ScaleInvalidDataShowAsValue__y__ ScaleInvalidDataShowAs__y__ ScaleInvalidDataShowAsValue__x__ ScaleInvalidDataShowAs__x__ ScaleInvalidDataShowAsValue__fillOpacity__ ScaleInvalidDataShowAs__fillOpacity__ ScaleInvalidDataShowAsValue__opacity__ ScaleInvalidDataShowAs__opacity__ ScaleInvalidDataConfig ScaleConfig TitleConfig Config Dict_InlineDataset_ Datasets ParseValue Vector2_DateTime_ Vector2_boolean_ SelectionInitInterval TopLevelConcatSpec TopLevelFacetSpec TopLevelHConcatSpec TopLevelLayerSpec TopLevelRepeatSpec TopLevelVConcatSpec TopLevelUnitSpec TopLevelSpec)

;; Registry definitions (Topological Order)
(def FieldName
  [:and #:json-schema{:original-name "FieldName"} string?]
)

(def ArgminDef
  [:map
 {:closed true, :json-schema/original-name "ArgminDef"}
 [:argmin
  #:json-schema{:original-name "argmin"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
)

(def NonArgAggregateOp
  [:enum
 #:json-schema{:original-name "NonArgAggregateOp"}
 "average"
 "count"
 "distinct"
 "max"
 "mean"
 "median"
 "min"
 "missing"
 "product"
 "q1"
 "q3"
 "ci0"
 "ci1"
 "stderr"
 "stdev"
 "stdevp"
 "sum"
 "valid"
 "values"
 "variance"
 "variancep"
 "exponential"
 "exponentialb"]
)

(def ArgmaxDef
  [:map
 {:closed true, :json-schema/original-name "ArgmaxDef"}
 [:argmax
  #:json-schema{:original-name "argmax"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
)

(def Aggregate
  [:or
 #:json-schema{:original-name "Aggregate"}
 [:ref
  #:json-schema{:original-name "NonArgAggregateOp"}
  #'NonArgAggregateOp]
 [:ref #:json-schema{:original-name "ArgmaxDef"} #'ArgmaxDef]
 [:ref #:json-schema{:original-name "ArgminDef"} #'ArgminDef]]
)

(def AggregateOp
  [:enum
 #:json-schema{:original-name "AggregateOp"}
 "argmax"
 "argmin"
 "average"
 "count"
 "distinct"
 "max"
 "mean"
 "median"
 "min"
 "missing"
 "product"
 "q1"
 "q3"
 "ci0"
 "ci1"
 "stderr"
 "stdev"
 "stdevp"
 "sum"
 "valid"
 "values"
 "variance"
 "variancep"
 "exponential"
 "exponentialb"]
)

(def AggregatedFieldDef
  [:map
 {:closed true, :json-schema/original-name "AggregatedFieldDef"}
 [:as
  #:json-schema{:original-name "as"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:op
  #:json-schema{:original-name "op"}
  [:ref #:json-schema{:original-name "AggregateOp"} #'AggregateOp]]]
)

(def AggregateTransform
  [:map
 {:closed true, :json-schema/original-name "AggregateTransform"}
 [:aggregate
  #:json-schema{:original-name "aggregate"}
  [:vector
   [:ref
    #:json-schema{:original-name "AggregatedFieldDef"}
    #'AggregatedFieldDef]]]
 [:groupby
  {:json-schema/original-name "groupby", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]]
)

(def Align
  [:enum #:json-schema{:original-name "Align"} "left" "center" "right"]
)

(def SortByChannel
  [:enum
 #:json-schema{:original-name "SortByChannel"}
 "x"
 "y"
 "color"
 "fill"
 "stroke"
 "strokeWidth"
 "size"
 "shape"
 "fillOpacity"
 "strokeOpacity"
 "opacity"
 "text"]
)

(def SortByChannelDesc
  [:enum
 #:json-schema{:original-name "SortByChannelDesc"}
 "-x"
 "-y"
 "-color"
 "-fill"
 "-stroke"
 "-strokeWidth"
 "-size"
 "-shape"
 "-fillOpacity"
 "-strokeOpacity"
 "-opacity"
 "-text"]
)

(def SortOrder
  [:enum
 #:json-schema{:original-name "SortOrder"}
 "ascending"
 "descending"]
)

(def AllSortString
  [:or
 #:json-schema{:original-name "AllSortString"}
 [:ref #:json-schema{:original-name "SortOrder"} #'SortOrder]
 [:ref #:json-schema{:original-name "SortByChannel"} #'SortByChannel]
 [:ref
  #:json-schema{:original-name "SortByChannelDesc"}
  #'SortByChannelDesc]]
)

(def StrokeJoin
  [:enum
 #:json-schema{:original-name "StrokeJoin"}
 "miter"
 "round"
 "bevel"]
)

(def FontStyle
  [:and #:json-schema{:original-name "FontStyle"} string?]
)

(def ColorName
  [:enum
 #:json-schema{:original-name "ColorName"}
 "black"
 "silver"
 "gray"
 "white"
 "maroon"
 "red"
 "purple"
 "fuchsia"
 "green"
 "lime"
 "olive"
 "yellow"
 "navy"
 "blue"
 "teal"
 "aqua"
 "orange"
 "aliceblue"
 "antiquewhite"
 "aquamarine"
 "azure"
 "beige"
 "bisque"
 "blanchedalmond"
 "blueviolet"
 "brown"
 "burlywood"
 "cadetblue"
 "chartreuse"
 "chocolate"
 "coral"
 "cornflowerblue"
 "cornsilk"
 "crimson"
 "cyan"
 "darkblue"
 "darkcyan"
 "darkgoldenrod"
 "darkgray"
 "darkgreen"
 "darkgrey"
 "darkkhaki"
 "darkmagenta"
 "darkolivegreen"
 "darkorange"
 "darkorchid"
 "darkred"
 "darksalmon"
 "darkseagreen"
 "darkslateblue"
 "darkslategray"
 "darkslategrey"
 "darkturquoise"
 "darkviolet"
 "deeppink"
 "deepskyblue"
 "dimgray"
 "dimgrey"
 "dodgerblue"
 "firebrick"
 "floralwhite"
 "forestgreen"
 "gainsboro"
 "ghostwhite"
 "gold"
 "goldenrod"
 "greenyellow"
 "grey"
 "honeydew"
 "hotpink"
 "indianred"
 "indigo"
 "ivory"
 "khaki"
 "lavender"
 "lavenderblush"
 "lawngreen"
 "lemonchiffon"
 "lightblue"
 "lightcoral"
 "lightcyan"
 "lightgoldenrodyellow"
 "lightgray"
 "lightgreen"
 "lightgrey"
 "lightpink"
 "lightsalmon"
 "lightseagreen"
 "lightskyblue"
 "lightslategray"
 "lightslategrey"
 "lightsteelblue"
 "lightyellow"
 "limegreen"
 "linen"
 "magenta"
 "mediumaquamarine"
 "mediumblue"
 "mediumorchid"
 "mediumpurple"
 "mediumseagreen"
 "mediumslateblue"
 "mediumspringgreen"
 "mediumturquoise"
 "mediumvioletred"
 "midnightblue"
 "mintcream"
 "mistyrose"
 "moccasin"
 "navajowhite"
 "oldlace"
 "olivedrab"
 "orangered"
 "orchid"
 "palegoldenrod"
 "palegreen"
 "paleturquoise"
 "palevioletred"
 "papayawhip"
 "peachpuff"
 "peru"
 "pink"
 "plum"
 "powderblue"
 "rosybrown"
 "royalblue"
 "saddlebrown"
 "salmon"
 "sandybrown"
 "seagreen"
 "seashell"
 "sienna"
 "skyblue"
 "slateblue"
 "slategray"
 "slategrey"
 "snow"
 "springgreen"
 "steelblue"
 "tan"
 "thistle"
 "tomato"
 "turquoise"
 "violet"
 "wheat"
 "whitesmoke"
 "yellowgreen"
 "rebeccapurple"]
)

(def HexColor
  [:and #:json-schema{:original-name "HexColor"} string?]
)

(def Color
  [:or
 #:json-schema{:original-name "Color"}
 [:ref #:json-schema{:original-name "ColorName"} #'ColorName]
 [:ref #:json-schema{:original-name "HexColor"} #'HexColor]
 string?]
)

(def GradientStop
  [:map
 {:closed true, :json-schema/original-name "GradientStop"}
 [:color
  #:json-schema{:original-name "color"}
  [:ref #:json-schema{:original-name "Color"} #'Color]]
 [:offset #:json-schema{:original-name "offset"} number?]]
)

(def RadialGradient
  [:map
 {:closed true, :json-schema/original-name "RadialGradient"}
 [:stops
  #:json-schema{:original-name "stops"}
  [:vector
   [:ref #:json-schema{:original-name "GradientStop"} #'GradientStop]]]
 [:y1 {:json-schema/original-name "y1", :optional true} number?]
 [:r2 {:json-schema/original-name "r2", :optional true} number?]
 [:r1 {:json-schema/original-name "r1", :optional true} number?]
 [:id {:json-schema/original-name "id", :optional true} string?]
 [:gradient #:json-schema{:original-name "gradient"} [:= "radial"]]
 [:x1 {:json-schema/original-name "x1", :optional true} number?]
 [:y2 {:json-schema/original-name "y2", :optional true} number?]
 [:x2 {:json-schema/original-name "x2", :optional true} number?]]
)

(def LinearGradient
  [:map
 {:closed true, :json-schema/original-name "LinearGradient"}
 [:gradient #:json-schema{:original-name "gradient"} [:= "linear"]]
 [:id {:json-schema/original-name "id", :optional true} string?]
 [:stops
  #:json-schema{:original-name "stops"}
  [:vector
   [:ref #:json-schema{:original-name "GradientStop"} #'GradientStop]]]
 [:x1 {:json-schema/original-name "x1", :optional true} number?]
 [:x2 {:json-schema/original-name "x2", :optional true} number?]
 [:y1 {:json-schema/original-name "y1", :optional true} number?]
 [:y2 {:json-schema/original-name "y2", :optional true} number?]]
)

(def Gradient
  [:or
 #:json-schema{:original-name "Gradient"}
 [:ref #:json-schema{:original-name "LinearGradient"} #'LinearGradient]
 [:ref #:json-schema{:original-name "RadialGradient"} #'RadialGradient]]
)

(def Blend
  [:enum
 #:json-schema{:original-name "Blend"}
 nil
 "multiply"
 "screen"
 "overlay"
 "darken"
 "lighten"
 "color-dodge"
 "color-burn"
 "hard-light"
 "soft-light"
 "difference"
 "exclusion"
 "hue"
 "saturation"
 "color"
 "luminosity"]
)

(def Cursor
  [:enum
 #:json-schema{:original-name "Cursor"}
 "auto"
 "default"
 "none"
 "context-menu"
 "help"
 "pointer"
 "progress"
 "wait"
 "cell"
 "crosshair"
 "text"
 "vertical-text"
 "alias"
 "copy"
 "move"
 "no-drop"
 "not-allowed"
 "e-resize"
 "n-resize"
 "ne-resize"
 "nw-resize"
 "s-resize"
 "se-resize"
 "sw-resize"
 "w-resize"
 "ew-resize"
 "ns-resize"
 "nesw-resize"
 "nwse-resize"
 "col-resize"
 "row-resize"
 "all-scroll"
 "zoom-in"
 "zoom-out"
 "grab"
 "grabbing"]
)

(def TextDirection
  [:enum #:json-schema{:original-name "TextDirection"} "ltr" "rtl"]
)

(def Orientation
  [:enum
 #:json-schema{:original-name "Orientation"}
 "horizontal"
 "vertical"]
)

(def Interpolate
  [:enum
 #:json-schema{:original-name "Interpolate"}
 "basis"
 "basis-open"
 "basis-closed"
 "bundle"
 "cardinal"
 "cardinal-open"
 "cardinal-closed"
 "catmull-rom"
 "linear"
 "linear-closed"
 "monotone"
 "natural"
 "step"
 "step-before"
 "step-after"]
)

(def Baseline
  [:enum #:json-schema{:original-name "Baseline"} "top" "middle" "bottom"]
)

(def TextBaseline
  [:or
 #:json-schema{:original-name "TextBaseline"}
 [:ref #:json-schema{:original-name "Baseline"} #'Baseline]
 [:enum "alphabetic" "line-top" "line-bottom"]]
)

(def TooltipContent
  [:map
 {:closed true, :json-schema/original-name "TooltipContent"}
 [:content
  #:json-schema{:original-name "content"}
  [:enum "encoding" "data"]]]
)

(def StrokeCap
  [:enum
 #:json-schema{:original-name "StrokeCap"}
 "butt"
 "round"
 "square"]
)

(def SymbolShape
  [:and #:json-schema{:original-name "SymbolShape"} string?]
)

(def FontWeight
  [:enum
 #:json-schema{:original-name "FontWeight"}
 "normal"
 "bold"
 "lighter"
 "bolder"
 100
 200
 300
 400
 500
 600
 700
 800
 900]
)

(def URI
  [:and #:json-schema{:original-name "URI"} string?]
)

(def MarkInvalidDataMode
  [:enum
 #:json-schema{:original-name "MarkInvalidDataMode"}
 "filter"
 "break-paths-filter-domains"
 "break-paths-show-domains"
 "break-paths-show-path-domains"
 "show"]
)

(def Text
  [:or #:json-schema{:original-name "Text"} string? [:vector string?]]
)

(def ExprRef
  [:map
 {:closed true, :json-schema/original-name "ExprRef"}
 [:expr #:json-schema{:original-name "expr"} string?]]
)

(def OverlayMarkDef
  [:map
 {:closed true, :json-schema/original-name "OverlayMarkDef"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:baseline
  {:json-schema/original-name "baseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:y2Offset
  {:json-schema/original-name "y2Offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:smooth
  {:json-schema/original-name "smooth", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padAngle
  {:json-schema/original-name "padAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:startAngle
  {:json-schema/original-name "startAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aspect
  {:json-schema/original-name "aspect", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:json-schema/original-name "cornerRadiusBottomRight",
   :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRoleDescription
  {:json-schema/original-name "ariaRoleDescription", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:clip
  {:json-schema/original-name "clip", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dx
  {:json-schema/original-name "dx", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tension
  {:json-schema/original-name "tension", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dir
  {:json-schema/original-name "dir", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextDirection"} #'TextDirection]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:innerRadius
  {:json-schema/original-name "innerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:limit
  {:json-schema/original-name "limit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radiusOffset
  {:json-schema/original-name "radiusOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandSize
  {:json-schema/original-name "timeUnitBandSize", :optional true}
  number?]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ellipsis
  {:json-schema/original-name "ellipsis", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dy
  {:json-schema/original-name "dy", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Cursor"} #'Cursor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineBreak
  {:json-schema/original-name "lineBreak", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:invalid
  {:json-schema/original-name "invalid", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "MarkInvalidDataMode"}
    #'MarkInvalidDataMode]
   nil?]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:x2Offset
  {:json-schema/original-name "x2Offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeMiterLimit
  {:json-schema/original-name "strokeMiterLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandPosition
  {:json-schema/original-name "timeUnitBandPosition", :optional true}
  number?]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Interpolate"} #'Interpolate]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:font
  {:json-schema/original-name "font", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:outerRadius
  {:json-schema/original-name "outerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:style
  {:json-schema/original-name "style", :optional true}
  [:or string? [:vector string?]]]
 [:thetaOffset
  {:json-schema/original-name "thetaOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta2Offset
  {:json-schema/original-name "theta2Offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontStyle
  {:json-schema/original-name "fontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontWeight
  {:json-schema/original-name "fontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeJoin
  {:json-schema/original-name "strokeJoin", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeJoin"} #'StrokeJoin]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:or
   [:or
    [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
    string?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or nil? boolean?]]
 [:cornerRadiusTopLeft
  {:json-schema/original-name "cornerRadiusTopLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:json-schema/original-name "cornerRadiusBottomLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:yOffset
  {:json-schema/original-name "yOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineHeight
  {:json-schema/original-name "lineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeCap
  {:json-schema/original-name "strokeCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:cornerRadiusTopRight
  {:json-schema/original-name "cornerRadiusTopRight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:blend
  {:json-schema/original-name "blend", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Blend"} #'Blend]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontSize
  {:json-schema/original-name "fontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRole
  {:json-schema/original-name "ariaRole", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:endAngle
  {:json-schema/original-name "endAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:filled
  {:json-schema/original-name "filled", :optional true}
  boolean?]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius2Offset
  {:json-schema/original-name "radius2Offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref
    #:json-schema{:original-name "TooltipContent"}
    #'TooltipContent]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOffset
  {:json-schema/original-name "strokeOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:xOffset
  {:json-schema/original-name "xOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def RelativeBandSize
  [:map
 {:closed true, :json-schema/original-name "RelativeBandSize"}
 [:band #:json-schema{:original-name "band"} number?]]
)

(def Mark
  [:enum
 #:json-schema{:original-name "Mark"}
 "arc"
 "area"
 "bar"
 "image"
 "line"
 "point"
 "rect"
 "rule"
 "text"
 "tick"
 "trail"
 "circle"
 "square"
 "geoshape"]
)

(def MarkDef
  [:map
 {:closed true, :json-schema/original-name "MarkDef"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:baseline
  {:json-schema/original-name "baseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:y2Offset
  {:json-schema/original-name "y2Offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:smooth
  {:json-schema/original-name "smooth", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padAngle
  {:json-schema/original-name "padAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aspect
  {:json-schema/original-name "aspect", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:json-schema/original-name "cornerRadiusBottomRight",
   :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRoleDescription
  {:json-schema/original-name "ariaRoleDescription", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:discreteBandSize
  {:json-schema/original-name "discreteBandSize", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RelativeBandSize"}
    #'RelativeBandSize]]]
 [:thickness
  {:json-schema/original-name "thickness", :optional true}
  number?]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:clip
  {:json-schema/original-name "clip", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dx
  {:json-schema/original-name "dx", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tension
  {:json-schema/original-name "tension", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dir
  {:json-schema/original-name "dir", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextDirection"} #'TextDirection]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:innerRadius
  {:json-schema/original-name "innerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:limit
  {:json-schema/original-name "limit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:binSpacing
  {:json-schema/original-name "binSpacing", :optional true}
  number?]
 [:radiusOffset
  {:json-schema/original-name "radiusOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandSize
  {:json-schema/original-name "timeUnitBandSize", :optional true}
  number?]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ellipsis
  {:json-schema/original-name "ellipsis", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:bandSize
  {:json-schema/original-name "bandSize", :optional true}
  number?]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "RelativeBandSize"}
    #'RelativeBandSize]]]
 [:dy
  {:json-schema/original-name "dy", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Cursor"} #'Cursor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:type
  #:json-schema{:original-name "type"}
  [:ref #:json-schema{:original-name "Mark"} #'Mark]]
 [:continuousBandSize
  {:json-schema/original-name "continuousBandSize", :optional true}
  number?]
 [:cornerRadiusEnd
  {:json-schema/original-name "cornerRadiusEnd", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineBreak
  {:json-schema/original-name "lineBreak", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:invalid
  {:json-schema/original-name "invalid", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "MarkInvalidDataMode"}
    #'MarkInvalidDataMode]
   nil?]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:x2Offset
  {:json-schema/original-name "x2Offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeMiterLimit
  {:json-schema/original-name "strokeMiterLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandPosition
  {:json-schema/original-name "timeUnitBandPosition", :optional true}
  number?]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Interpolate"} #'Interpolate]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:font
  {:json-schema/original-name "font", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:outerRadius
  {:json-schema/original-name "outerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:style
  {:json-schema/original-name "style", :optional true}
  [:or string? [:vector string?]]]
 [:thetaOffset
  {:json-schema/original-name "thetaOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:line
  {:json-schema/original-name "line", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "OverlayMarkDef"}
    #'OverlayMarkDef]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta2Offset
  {:json-schema/original-name "theta2Offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:minBandSize
  {:json-schema/original-name "minBandSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontStyle
  {:json-schema/original-name "fontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontWeight
  {:json-schema/original-name "fontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeJoin
  {:json-schema/original-name "strokeJoin", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeJoin"} #'StrokeJoin]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:or
   [:or
    [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
    string?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or nil? boolean?]]
 [:cornerRadiusTopLeft
  {:json-schema/original-name "cornerRadiusTopLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:json-schema/original-name "cornerRadiusBottomLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:point
  {:json-schema/original-name "point", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "OverlayMarkDef"}
    #'OverlayMarkDef]
   [:enum "transparent"]]]
 [:yOffset
  {:json-schema/original-name "yOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineHeight
  {:json-schema/original-name "lineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeCap
  {:json-schema/original-name "strokeCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:cornerRadiusTopRight
  {:json-schema/original-name "cornerRadiusTopRight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:blend
  {:json-schema/original-name "blend", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Blend"} #'Blend]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontSize
  {:json-schema/original-name "fontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRole
  {:json-schema/original-name "ariaRole", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:filled
  {:json-schema/original-name "filled", :optional true}
  boolean?]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius2Offset
  {:json-schema/original-name "radius2Offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref
    #:json-schema{:original-name "TooltipContent"}
    #'TooltipContent]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOffset
  {:json-schema/original-name "strokeOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "RelativeBandSize"}
    #'RelativeBandSize]]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:xOffset
  {:json-schema/original-name "xOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ErrorBar
  [:= #:json-schema{:original-name "ErrorBar"} "errorbar"]
)

(def ErrorBand
  [:= #:json-schema{:original-name "ErrorBand"} "errorband"]
)

(def BoxPlot
  [:= #:json-schema{:original-name "BoxPlot"} "boxplot"]
)

(def CompositeMark
  [:or
 #:json-schema{:original-name "CompositeMark"}
 [:ref #:json-schema{:original-name "BoxPlot"} #'BoxPlot]
 [:ref #:json-schema{:original-name "ErrorBar"} #'ErrorBar]
 [:ref #:json-schema{:original-name "ErrorBand"} #'ErrorBand]]
)

(def LineConfig
  [:map
 {:closed true, :json-schema/original-name "LineConfig"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:baseline
  {:json-schema/original-name "baseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:smooth
  {:json-schema/original-name "smooth", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padAngle
  {:json-schema/original-name "padAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:startAngle
  {:json-schema/original-name "startAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aspect
  {:json-schema/original-name "aspect", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:json-schema/original-name "cornerRadiusBottomRight",
   :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRoleDescription
  {:json-schema/original-name "ariaRoleDescription", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:dx
  {:json-schema/original-name "dx", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tension
  {:json-schema/original-name "tension", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dir
  {:json-schema/original-name "dir", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextDirection"} #'TextDirection]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:innerRadius
  {:json-schema/original-name "innerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:limit
  {:json-schema/original-name "limit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandSize
  {:json-schema/original-name "timeUnitBandSize", :optional true}
  number?]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ellipsis
  {:json-schema/original-name "ellipsis", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dy
  {:json-schema/original-name "dy", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Cursor"} #'Cursor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineBreak
  {:json-schema/original-name "lineBreak", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:invalid
  {:json-schema/original-name "invalid", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "MarkInvalidDataMode"}
    #'MarkInvalidDataMode]
   nil?]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:strokeMiterLimit
  {:json-schema/original-name "strokeMiterLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandPosition
  {:json-schema/original-name "timeUnitBandPosition", :optional true}
  number?]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Interpolate"} #'Interpolate]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:font
  {:json-schema/original-name "font", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:outerRadius
  {:json-schema/original-name "outerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontStyle
  {:json-schema/original-name "fontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontWeight
  {:json-schema/original-name "fontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeJoin
  {:json-schema/original-name "strokeJoin", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeJoin"} #'StrokeJoin]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:or
   [:or
    [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
    string?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or nil? boolean?]]
 [:cornerRadiusTopLeft
  {:json-schema/original-name "cornerRadiusTopLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:json-schema/original-name "cornerRadiusBottomLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:point
  {:json-schema/original-name "point", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "OverlayMarkDef"}
    #'OverlayMarkDef]
   [:enum "transparent"]]]
 [:lineHeight
  {:json-schema/original-name "lineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeCap
  {:json-schema/original-name "strokeCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:cornerRadiusTopRight
  {:json-schema/original-name "cornerRadiusTopRight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:blend
  {:json-schema/original-name "blend", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Blend"} #'Blend]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontSize
  {:json-schema/original-name "fontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRole
  {:json-schema/original-name "ariaRole", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:endAngle
  {:json-schema/original-name "endAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:filled
  {:json-schema/original-name "filled", :optional true}
  boolean?]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref
    #:json-schema{:original-name "TooltipContent"}
    #'TooltipContent]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOffset
  {:json-schema/original-name "strokeOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def RectConfig
  [:map
 {:closed true, :json-schema/original-name "RectConfig"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:baseline
  {:json-schema/original-name "baseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:smooth
  {:json-schema/original-name "smooth", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padAngle
  {:json-schema/original-name "padAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:startAngle
  {:json-schema/original-name "startAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aspect
  {:json-schema/original-name "aspect", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:json-schema/original-name "cornerRadiusBottomRight",
   :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRoleDescription
  {:json-schema/original-name "ariaRoleDescription", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:discreteBandSize
  {:json-schema/original-name "discreteBandSize", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RelativeBandSize"}
    #'RelativeBandSize]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:dx
  {:json-schema/original-name "dx", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tension
  {:json-schema/original-name "tension", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dir
  {:json-schema/original-name "dir", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextDirection"} #'TextDirection]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:innerRadius
  {:json-schema/original-name "innerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:limit
  {:json-schema/original-name "limit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:binSpacing
  {:json-schema/original-name "binSpacing", :optional true}
  number?]
 [:timeUnitBandSize
  {:json-schema/original-name "timeUnitBandSize", :optional true}
  number?]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ellipsis
  {:json-schema/original-name "ellipsis", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dy
  {:json-schema/original-name "dy", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Cursor"} #'Cursor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:continuousBandSize
  {:json-schema/original-name "continuousBandSize", :optional true}
  number?]
 [:lineBreak
  {:json-schema/original-name "lineBreak", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:invalid
  {:json-schema/original-name "invalid", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "MarkInvalidDataMode"}
    #'MarkInvalidDataMode]
   nil?]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:strokeMiterLimit
  {:json-schema/original-name "strokeMiterLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandPosition
  {:json-schema/original-name "timeUnitBandPosition", :optional true}
  number?]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Interpolate"} #'Interpolate]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:font
  {:json-schema/original-name "font", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:outerRadius
  {:json-schema/original-name "outerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:minBandSize
  {:json-schema/original-name "minBandSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontStyle
  {:json-schema/original-name "fontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontWeight
  {:json-schema/original-name "fontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeJoin
  {:json-schema/original-name "strokeJoin", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeJoin"} #'StrokeJoin]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:or
   [:or
    [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
    string?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or nil? boolean?]]
 [:cornerRadiusTopLeft
  {:json-schema/original-name "cornerRadiusTopLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:json-schema/original-name "cornerRadiusBottomLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineHeight
  {:json-schema/original-name "lineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeCap
  {:json-schema/original-name "strokeCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:cornerRadiusTopRight
  {:json-schema/original-name "cornerRadiusTopRight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:blend
  {:json-schema/original-name "blend", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Blend"} #'Blend]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontSize
  {:json-schema/original-name "fontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRole
  {:json-schema/original-name "ariaRole", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:endAngle
  {:json-schema/original-name "endAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:filled
  {:json-schema/original-name "filled", :optional true}
  boolean?]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref
    #:json-schema{:original-name "TooltipContent"}
    #'TooltipContent]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOffset
  {:json-schema/original-name "strokeOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def TickConfig
  [:map
 {:closed true, :json-schema/original-name "TickConfig"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:baseline
  {:json-schema/original-name "baseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:smooth
  {:json-schema/original-name "smooth", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padAngle
  {:json-schema/original-name "padAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:startAngle
  {:json-schema/original-name "startAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aspect
  {:json-schema/original-name "aspect", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:json-schema/original-name "cornerRadiusBottomRight",
   :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRoleDescription
  {:json-schema/original-name "ariaRoleDescription", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:discreteBandSize
  {:json-schema/original-name "discreteBandSize", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RelativeBandSize"}
    #'RelativeBandSize]]]
 [:thickness
  {:json-schema/original-name "thickness", :optional true}
  number?]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:dx
  {:json-schema/original-name "dx", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tension
  {:json-schema/original-name "tension", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dir
  {:json-schema/original-name "dir", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextDirection"} #'TextDirection]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:innerRadius
  {:json-schema/original-name "innerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:limit
  {:json-schema/original-name "limit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:binSpacing
  {:json-schema/original-name "binSpacing", :optional true}
  number?]
 [:timeUnitBandSize
  {:json-schema/original-name "timeUnitBandSize", :optional true}
  number?]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ellipsis
  {:json-schema/original-name "ellipsis", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:bandSize
  {:json-schema/original-name "bandSize", :optional true}
  number?]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dy
  {:json-schema/original-name "dy", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Cursor"} #'Cursor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:continuousBandSize
  {:json-schema/original-name "continuousBandSize", :optional true}
  number?]
 [:lineBreak
  {:json-schema/original-name "lineBreak", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:invalid
  {:json-schema/original-name "invalid", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "MarkInvalidDataMode"}
    #'MarkInvalidDataMode]
   nil?]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:strokeMiterLimit
  {:json-schema/original-name "strokeMiterLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandPosition
  {:json-schema/original-name "timeUnitBandPosition", :optional true}
  number?]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Interpolate"} #'Interpolate]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:font
  {:json-schema/original-name "font", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:outerRadius
  {:json-schema/original-name "outerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:minBandSize
  {:json-schema/original-name "minBandSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontStyle
  {:json-schema/original-name "fontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontWeight
  {:json-schema/original-name "fontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeJoin
  {:json-schema/original-name "strokeJoin", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeJoin"} #'StrokeJoin]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:or
   [:or
    [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
    string?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or nil? boolean?]]
 [:cornerRadiusTopLeft
  {:json-schema/original-name "cornerRadiusTopLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:json-schema/original-name "cornerRadiusBottomLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineHeight
  {:json-schema/original-name "lineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeCap
  {:json-schema/original-name "strokeCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:cornerRadiusTopRight
  {:json-schema/original-name "cornerRadiusTopRight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:blend
  {:json-schema/original-name "blend", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Blend"} #'Blend]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontSize
  {:json-schema/original-name "fontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRole
  {:json-schema/original-name "ariaRole", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:endAngle
  {:json-schema/original-name "endAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:filled
  {:json-schema/original-name "filled", :optional true}
  boolean?]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref
    #:json-schema{:original-name "TooltipContent"}
    #'TooltipContent]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOffset
  {:json-schema/original-name "strokeOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def BarConfig
  [:map
 {:closed true, :json-schema/original-name "BarConfig"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:baseline
  {:json-schema/original-name "baseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:smooth
  {:json-schema/original-name "smooth", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padAngle
  {:json-schema/original-name "padAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:startAngle
  {:json-schema/original-name "startAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aspect
  {:json-schema/original-name "aspect", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:json-schema/original-name "cornerRadiusBottomRight",
   :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRoleDescription
  {:json-schema/original-name "ariaRoleDescription", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:discreteBandSize
  {:json-schema/original-name "discreteBandSize", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RelativeBandSize"}
    #'RelativeBandSize]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:dx
  {:json-schema/original-name "dx", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tension
  {:json-schema/original-name "tension", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dir
  {:json-schema/original-name "dir", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextDirection"} #'TextDirection]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:innerRadius
  {:json-schema/original-name "innerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:limit
  {:json-schema/original-name "limit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:binSpacing
  {:json-schema/original-name "binSpacing", :optional true}
  number?]
 [:timeUnitBandSize
  {:json-schema/original-name "timeUnitBandSize", :optional true}
  number?]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ellipsis
  {:json-schema/original-name "ellipsis", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dy
  {:json-schema/original-name "dy", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Cursor"} #'Cursor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:continuousBandSize
  {:json-schema/original-name "continuousBandSize", :optional true}
  number?]
 [:cornerRadiusEnd
  {:json-schema/original-name "cornerRadiusEnd", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineBreak
  {:json-schema/original-name "lineBreak", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:invalid
  {:json-schema/original-name "invalid", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "MarkInvalidDataMode"}
    #'MarkInvalidDataMode]
   nil?]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:strokeMiterLimit
  {:json-schema/original-name "strokeMiterLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandPosition
  {:json-schema/original-name "timeUnitBandPosition", :optional true}
  number?]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Interpolate"} #'Interpolate]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:font
  {:json-schema/original-name "font", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:outerRadius
  {:json-schema/original-name "outerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:minBandSize
  {:json-schema/original-name "minBandSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontStyle
  {:json-schema/original-name "fontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontWeight
  {:json-schema/original-name "fontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeJoin
  {:json-schema/original-name "strokeJoin", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeJoin"} #'StrokeJoin]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:or
   [:or
    [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
    string?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or nil? boolean?]]
 [:cornerRadiusTopLeft
  {:json-schema/original-name "cornerRadiusTopLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:json-schema/original-name "cornerRadiusBottomLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineHeight
  {:json-schema/original-name "lineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeCap
  {:json-schema/original-name "strokeCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:cornerRadiusTopRight
  {:json-schema/original-name "cornerRadiusTopRight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:blend
  {:json-schema/original-name "blend", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Blend"} #'Blend]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontSize
  {:json-schema/original-name "fontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRole
  {:json-schema/original-name "ariaRole", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:endAngle
  {:json-schema/original-name "endAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:filled
  {:json-schema/original-name "filled", :optional true}
  boolean?]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref
    #:json-schema{:original-name "TooltipContent"}
    #'TooltipContent]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOffset
  {:json-schema/original-name "strokeOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def MarkConfig
  [:map
 {:closed true, :json-schema/original-name "MarkConfig"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:baseline
  {:json-schema/original-name "baseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:smooth
  {:json-schema/original-name "smooth", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padAngle
  {:json-schema/original-name "padAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:startAngle
  {:json-schema/original-name "startAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aspect
  {:json-schema/original-name "aspect", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:json-schema/original-name "cornerRadiusBottomRight",
   :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRoleDescription
  {:json-schema/original-name "ariaRoleDescription", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:dx
  {:json-schema/original-name "dx", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tension
  {:json-schema/original-name "tension", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dir
  {:json-schema/original-name "dir", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextDirection"} #'TextDirection]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:innerRadius
  {:json-schema/original-name "innerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:limit
  {:json-schema/original-name "limit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandSize
  {:json-schema/original-name "timeUnitBandSize", :optional true}
  number?]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ellipsis
  {:json-schema/original-name "ellipsis", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dy
  {:json-schema/original-name "dy", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Cursor"} #'Cursor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineBreak
  {:json-schema/original-name "lineBreak", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:invalid
  {:json-schema/original-name "invalid", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "MarkInvalidDataMode"}
    #'MarkInvalidDataMode]
   nil?]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:strokeMiterLimit
  {:json-schema/original-name "strokeMiterLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandPosition
  {:json-schema/original-name "timeUnitBandPosition", :optional true}
  number?]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Interpolate"} #'Interpolate]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:font
  {:json-schema/original-name "font", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:outerRadius
  {:json-schema/original-name "outerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontStyle
  {:json-schema/original-name "fontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontWeight
  {:json-schema/original-name "fontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeJoin
  {:json-schema/original-name "strokeJoin", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeJoin"} #'StrokeJoin]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:or
   [:or
    [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
    string?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or nil? boolean?]]
 [:cornerRadiusTopLeft
  {:json-schema/original-name "cornerRadiusTopLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:json-schema/original-name "cornerRadiusBottomLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineHeight
  {:json-schema/original-name "lineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeCap
  {:json-schema/original-name "strokeCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:cornerRadiusTopRight
  {:json-schema/original-name "cornerRadiusTopRight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:blend
  {:json-schema/original-name "blend", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Blend"} #'Blend]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontSize
  {:json-schema/original-name "fontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRole
  {:json-schema/original-name "ariaRole", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:endAngle
  {:json-schema/original-name "endAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:filled
  {:json-schema/original-name "filled", :optional true}
  boolean?]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref
    #:json-schema{:original-name "TooltipContent"}
    #'TooltipContent]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOffset
  {:json-schema/original-name "strokeOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def AreaConfig
  [:map
 {:closed true, :json-schema/original-name "AreaConfig"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:baseline
  {:json-schema/original-name "baseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:smooth
  {:json-schema/original-name "smooth", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padAngle
  {:json-schema/original-name "padAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:startAngle
  {:json-schema/original-name "startAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aspect
  {:json-schema/original-name "aspect", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:json-schema/original-name "cornerRadiusBottomRight",
   :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRoleDescription
  {:json-schema/original-name "ariaRoleDescription", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:dx
  {:json-schema/original-name "dx", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tension
  {:json-schema/original-name "tension", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dir
  {:json-schema/original-name "dir", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextDirection"} #'TextDirection]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:innerRadius
  {:json-schema/original-name "innerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:limit
  {:json-schema/original-name "limit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandSize
  {:json-schema/original-name "timeUnitBandSize", :optional true}
  number?]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ellipsis
  {:json-schema/original-name "ellipsis", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dy
  {:json-schema/original-name "dy", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Cursor"} #'Cursor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineBreak
  {:json-schema/original-name "lineBreak", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:invalid
  {:json-schema/original-name "invalid", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "MarkInvalidDataMode"}
    #'MarkInvalidDataMode]
   nil?]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:strokeMiterLimit
  {:json-schema/original-name "strokeMiterLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnitBandPosition
  {:json-schema/original-name "timeUnitBandPosition", :optional true}
  number?]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Interpolate"} #'Interpolate]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:font
  {:json-schema/original-name "font", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:outerRadius
  {:json-schema/original-name "outerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:line
  {:json-schema/original-name "line", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "OverlayMarkDef"}
    #'OverlayMarkDef]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontStyle
  {:json-schema/original-name "fontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontWeight
  {:json-schema/original-name "fontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeJoin
  {:json-schema/original-name "strokeJoin", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeJoin"} #'StrokeJoin]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:or
   [:or
    [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
    string?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or nil? boolean?]]
 [:cornerRadiusTopLeft
  {:json-schema/original-name "cornerRadiusTopLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:json-schema/original-name "cornerRadiusBottomLeft", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:point
  {:json-schema/original-name "point", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "OverlayMarkDef"}
    #'OverlayMarkDef]
   [:enum "transparent"]]]
 [:lineHeight
  {:json-schema/original-name "lineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeCap
  {:json-schema/original-name "strokeCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:cornerRadiusTopRight
  {:json-schema/original-name "cornerRadiusTopRight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:blend
  {:json-schema/original-name "blend", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Blend"} #'Blend]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontSize
  {:json-schema/original-name "fontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ariaRole
  {:json-schema/original-name "ariaRole", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:endAngle
  {:json-schema/original-name "endAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "height"]]]
 [:filled
  {:json-schema/original-name "filled", :optional true}
  boolean?]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width"]]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:or
   [:ref #:json-schema{:original-name "URI"} #'URI]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref
    #:json-schema{:original-name "TooltipContent"}
    #'TooltipContent]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeOffset
  {:json-schema/original-name "strokeOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def AnyMarkConfig
  [:or
 #:json-schema{:original-name "AnyMarkConfig"}
 [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]
 [:ref #:json-schema{:original-name "AreaConfig"} #'AreaConfig]
 [:ref #:json-schema{:original-name "BarConfig"} #'BarConfig]
 [:ref #:json-schema{:original-name "RectConfig"} #'RectConfig]
 [:ref #:json-schema{:original-name "LineConfig"} #'LineConfig]
 [:ref #:json-schema{:original-name "TickConfig"} #'TickConfig]]
)

(def ErrorBarExtent
  [:enum
 #:json-schema{:original-name "ErrorBarExtent"}
 "ci"
 "iqr"
 "stderr"
 "stdev"]
)

(def ErrorBandDef
  [:map
 {:closed true, :json-schema/original-name "ErrorBandDef"}
 [:clip {:json-schema/original-name "clip", :optional true} boolean?]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tension
  {:json-schema/original-name "tension", :optional true}
  number?]
 [:band
  {:json-schema/original-name "band", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:type
  #:json-schema{:original-name "type"}
  [:ref #:json-schema{:original-name "ErrorBand"} #'ErrorBand]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:ref #:json-schema{:original-name "Interpolate"} #'Interpolate]]
 [:borders
  {:json-schema/original-name "borders", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  number?]
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:ref
   #:json-schema{:original-name "ErrorBarExtent"}
   #'ErrorBarExtent]]]
)

(def BoxPlotDef
  [:map
 {:closed true, :json-schema/original-name "BoxPlotDef"}
 [:clip {:json-schema/original-name "clip", :optional true} boolean?]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:rule
  {:json-schema/original-name "rule", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:box
  {:json-schema/original-name "box", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:type
  #:json-schema{:original-name "type"}
  [:ref #:json-schema{:original-name "BoxPlot"} #'BoxPlot]]
 [:invalid
  {:json-schema/original-name "invalid", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "MarkInvalidDataMode"}
    #'MarkInvalidDataMode]
   nil?]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:outliers
  {:json-schema/original-name "outliers", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:size {:json-schema/original-name "size", :optional true} number?]
 [:median
  {:json-schema/original-name "median", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  number?]
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:or number? [:enum "min-max"]]]
 [:ticks
  {:json-schema/original-name "ticks", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]]
)

(def ErrorBarDef
  [:map
 {:closed true, :json-schema/original-name "ErrorBarDef"}
 [:thickness
  {:json-schema/original-name "thickness", :optional true}
  number?]
 [:clip {:json-schema/original-name "clip", :optional true} boolean?]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:rule
  {:json-schema/original-name "rule", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:type
  #:json-schema{:original-name "type"}
  [:ref #:json-schema{:original-name "ErrorBar"} #'ErrorBar]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:size {:json-schema/original-name "size", :optional true} number?]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  number?]
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:ref
   #:json-schema{:original-name "ErrorBarExtent"}
   #'ErrorBarExtent]]
 [:ticks
  {:json-schema/original-name "ticks", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]]
)

(def CompositeMarkDef
  [:or
 #:json-schema{:original-name "CompositeMarkDef"}
 [:ref #:json-schema{:original-name "BoxPlotDef"} #'BoxPlotDef]
 [:ref #:json-schema{:original-name "ErrorBarDef"} #'ErrorBarDef]
 [:ref #:json-schema{:original-name "ErrorBandDef"} #'ErrorBandDef]]
)

(def AnyMark
  [:or
 #:json-schema{:original-name "AnyMark"}
 [:ref #:json-schema{:original-name "CompositeMark"} #'CompositeMark]
 [:ref
  #:json-schema{:original-name "CompositeMarkDef"}
  #'CompositeMarkDef]
 [:ref #:json-schema{:original-name "Mark"} #'Mark]
 [:ref #:json-schema{:original-name "MarkDef"} #'MarkDef]]
)

(def AutosizeType
  [:enum
 #:json-schema{:original-name "AutosizeType"}
 "pad"
 "none"
 "fit"
 "fit-x"
 "fit-y"]
)

(def AutoSizeParams
  [:map
 {:closed true, :json-schema/original-name "AutoSizeParams"}
 [:contains
  {:json-schema/original-name "contains", :optional true}
  [:enum "content" "padding"]]
 [:resize
  {:json-schema/original-name "resize", :optional true}
  boolean?]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "AutosizeType"} #'AutosizeType]]]
)

(def LogicalNot_Predicate_
  [:map
 {:closed true, :json-schema/original-name "LogicalNot<Predicate>"}
 [:not
  #:json-schema{:original-name "not"}
  [:ref
   #:json-schema{:original-name "PredicateComposition"}
   #'PredicateComposition]]]
)

(def LogicalOr_Predicate_
  [:map
 {:closed true, :json-schema/original-name "LogicalOr<Predicate>"}
 [:or
  #:json-schema{:original-name "or"}
  [:vector
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]]]
)

(def Day
  [:and #:json-schema{:original-name "Day"} number?]
)

(def Month
  [:and #:json-schema{:original-name "Month"} number?]
)

(def DateTime
  [:map
 {:closed true, :json-schema/original-name "DateTime"}
 [:quarter
  {:json-schema/original-name "quarter", :optional true}
  number?]
 [:day
  {:json-schema/original-name "day", :optional true}
  [:or [:ref #:json-schema{:original-name "Day"} #'Day] string?]]
 [:date {:json-schema/original-name "date", :optional true} number?]
 [:utc {:json-schema/original-name "utc", :optional true} boolean?]
 [:month
  {:json-schema/original-name "month", :optional true}
  [:or [:ref #:json-schema{:original-name "Month"} #'Month] string?]]
 [:seconds
  {:json-schema/original-name "seconds", :optional true}
  number?]
 [:year {:json-schema/original-name "year", :optional true} number?]
 [:hours {:json-schema/original-name "hours", :optional true} number?]
 [:milliseconds
  {:json-schema/original-name "milliseconds", :optional true}
  number?]
 [:minutes
  {:json-schema/original-name "minutes", :optional true}
  number?]]
)

(def BinnedTimeUnit
  [:enum
 #:json-schema{:original-name "BinnedTimeUnit"}
 "binnedyear"
 "binnedyearquarter"
 "binnedyearquartermonth"
 "binnedyearmonth"
 "binnedyearmonthdate"
 "binnedyearmonthdatehours"
 "binnedyearmonthdatehoursminutes"
 "binnedyearmonthdatehoursminutesseconds"
 "binnedyearweek"
 "binnedyearweekday"
 "binnedyearweekdayhours"
 "binnedyearweekdayhoursminutes"
 "binnedyearweekdayhoursminutesseconds"
 "binnedyeardayofyear"
 "binnedutcyear"
 "binnedutcyearquarter"
 "binnedutcyearquartermonth"
 "binnedutcyearmonth"
 "binnedutcyearmonthdate"
 "binnedutcyearmonthdatehours"
 "binnedutcyearmonthdatehoursminutes"
 "binnedutcyearmonthdatehoursminutesseconds"
 "binnedutcyearweek"
 "binnedutcyearweekday"
 "binnedutcyearweekdayhours"
 "binnedutcyearweekdayhoursminutes"
 "binnedutcyearweekdayhoursminutesseconds"
 "binnedutcyeardayofyear"]
)

(def LocalMultiTimeUnit
  [:enum
 #:json-schema{:original-name "LocalMultiTimeUnit"}
 "yearquarter"
 "yearquartermonth"
 "yearmonth"
 "yearmonthdate"
 "yearmonthdatehours"
 "yearmonthdatehoursminutes"
 "yearmonthdatehoursminutesseconds"
 "yearweek"
 "yearweekday"
 "yearweekdayhours"
 "yearweekdayhoursminutes"
 "yearweekdayhoursminutesseconds"
 "yeardayofyear"
 "quartermonth"
 "monthdate"
 "monthdatehours"
 "monthdatehoursminutes"
 "monthdatehoursminutesseconds"
 "weekday"
 "weekdayhours"
 "weekdayhoursminutes"
 "weekdayhoursminutesseconds"
 "dayhours"
 "dayhoursminutes"
 "dayhoursminutesseconds"
 "hoursminutes"
 "hoursminutesseconds"
 "minutesseconds"
 "secondsmilliseconds"]
)

(def UtcMultiTimeUnit
  [:enum
 #:json-schema{:original-name "UtcMultiTimeUnit"}
 "utcyearquarter"
 "utcyearquartermonth"
 "utcyearmonth"
 "utcyearmonthdate"
 "utcyearmonthdatehours"
 "utcyearmonthdatehoursminutes"
 "utcyearmonthdatehoursminutesseconds"
 "utcyearweek"
 "utcyearweekday"
 "utcyearweekdayhours"
 "utcyearweekdayhoursminutes"
 "utcyearweekdayhoursminutesseconds"
 "utcyeardayofyear"
 "utcquartermonth"
 "utcmonthdate"
 "utcmonthdatehours"
 "utcmonthdatehoursminutes"
 "utcmonthdatehoursminutesseconds"
 "utcweekday"
 "utcweekdayhours"
 "utcweekdayhoursminutes"
 "utcweekdayhoursminutesseconds"
 "utcdayhours"
 "utcdayhoursminutes"
 "utcdayhoursminutesseconds"
 "utchoursminutes"
 "utchoursminutesseconds"
 "utcminutesseconds"
 "utcsecondsmilliseconds"]
)

(def MultiTimeUnit
  [:or
 #:json-schema{:original-name "MultiTimeUnit"}
 [:ref
  #:json-schema{:original-name "LocalMultiTimeUnit"}
  #'LocalMultiTimeUnit]
 [:ref
  #:json-schema{:original-name "UtcMultiTimeUnit"}
  #'UtcMultiTimeUnit]]
)

(def UtcSingleTimeUnit
  [:enum
 #:json-schema{:original-name "UtcSingleTimeUnit"}
 "utcyear"
 "utcquarter"
 "utcmonth"
 "utcweek"
 "utcday"
 "utcdayofyear"
 "utcdate"
 "utchours"
 "utcminutes"
 "utcseconds"
 "utcmilliseconds"]
)

(def LocalSingleTimeUnit
  [:enum
 #:json-schema{:original-name "LocalSingleTimeUnit"}
 "year"
 "quarter"
 "month"
 "week"
 "day"
 "dayofyear"
 "date"
 "hours"
 "minutes"
 "seconds"
 "milliseconds"]
)

(def SingleTimeUnit
  [:or
 #:json-schema{:original-name "SingleTimeUnit"}
 [:ref
  #:json-schema{:original-name "LocalSingleTimeUnit"}
  #'LocalSingleTimeUnit]
 [:ref
  #:json-schema{:original-name "UtcSingleTimeUnit"}
  #'UtcSingleTimeUnit]]
)

(def TimeUnit
  [:or
 #:json-schema{:original-name "TimeUnit"}
 [:ref #:json-schema{:original-name "SingleTimeUnit"} #'SingleTimeUnit]
 [:ref #:json-schema{:original-name "MultiTimeUnit"} #'MultiTimeUnit]]
)

(def TimeUnitParams
  [:map
 {:closed true, :json-schema/original-name "TimeUnitParams"}
 [:binned
  {:json-schema/original-name "binned", :optional true}
  boolean?]
 [:maxbins
  {:json-schema/original-name "maxbins", :optional true}
  number?]
 [:step {:json-schema/original-name "step", :optional true} number?]
 [:unit
  {:json-schema/original-name "unit", :optional true}
  [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]]
 [:utc {:json-schema/original-name "utc", :optional true} boolean?]]
)

(def FieldEqualPredicate
  [:map
 {:closed true, :json-schema/original-name "FieldEqualPredicate"}
 [:equal
  #:json-schema{:original-name "equal"}
  [:or
   string?
   number?
   boolean?
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]]
)

(def FieldGTEPredicate
  [:map
 {:closed true, :json-schema/original-name "FieldGTEPredicate"}
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:gte
  #:json-schema{:original-name "gte"}
  [:or
   string?
   number?
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]]
)

(def FieldValidPredicate
  [:map
 {:closed true, :json-schema/original-name "FieldValidPredicate"}
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:valid #:json-schema{:original-name "valid"} boolean?]]
)

(def FieldGTPredicate
  [:map
 {:closed true, :json-schema/original-name "FieldGTPredicate"}
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:gt
  #:json-schema{:original-name "gt"}
  [:or
   string?
   number?
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]]
)

(def FieldRangePredicate
  [:map
 {:closed true, :json-schema/original-name "FieldRangePredicate"}
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:range
  #:json-schema{:original-name "range"}
  [:or
   [:vector
    [:or
     number?
     nil?
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]]
)

(def FieldLTEPredicate
  [:map
 {:closed true, :json-schema/original-name "FieldLTEPredicate"}
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:lte
  #:json-schema{:original-name "lte"}
  [:or
   string?
   number?
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]]
)

(def FieldLTPredicate
  [:map
 {:closed true, :json-schema/original-name "FieldLTPredicate"}
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:lt
  #:json-schema{:original-name "lt"}
  [:or
   string?
   number?
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]]
)

(def ParameterName
  [:and #:json-schema{:original-name "ParameterName"} string?]
)

(def ParameterPredicate
  [:map
 {:closed true, :json-schema/original-name "ParameterPredicate"}
 [:empty {:json-schema/original-name "empty", :optional true} boolean?]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]]
)

(def FieldOneOfPredicate
  [:map
 {:closed true, :json-schema/original-name "FieldOneOfPredicate"}
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:oneOf
  #:json-schema{:original-name "oneOf"}
  [:or
   [:vector string?]
   [:vector number?]
   [:vector boolean?]
   [:vector
    [:ref #:json-schema{:original-name "DateTime"} #'DateTime]]]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]]
)

(def Predicate
  [:or
 #:json-schema{:original-name "Predicate"}
 [:ref
  #:json-schema{:original-name "FieldEqualPredicate"}
  #'FieldEqualPredicate]
 [:ref
  #:json-schema{:original-name "FieldRangePredicate"}
  #'FieldRangePredicate]
 [:ref
  #:json-schema{:original-name "FieldOneOfPredicate"}
  #'FieldOneOfPredicate]
 [:ref
  #:json-schema{:original-name "FieldLTPredicate"}
  #'FieldLTPredicate]
 [:ref
  #:json-schema{:original-name "FieldGTPredicate"}
  #'FieldGTPredicate]
 [:ref
  #:json-schema{:original-name "FieldLTEPredicate"}
  #'FieldLTEPredicate]
 [:ref
  #:json-schema{:original-name "FieldGTEPredicate"}
  #'FieldGTEPredicate]
 [:ref
  #:json-schema{:original-name "FieldValidPredicate"}
  #'FieldValidPredicate]
 [:ref
  #:json-schema{:original-name "ParameterPredicate"}
  #'ParameterPredicate]
 string?]
)

(def LogicalAnd_Predicate_
  [:map
 {:closed true, :json-schema/original-name "LogicalAnd<Predicate>"}
 [:and
  #:json-schema{:original-name "and"}
  [:vector
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]]]
)

(def PredicateComposition
  [:or
 #:json-schema{:original-name "PredicateComposition"}
 [:ref
  #:json-schema{:original-name "LogicalNot<Predicate>"}
  #'LogicalNot_Predicate_]
 [:ref
  #:json-schema{:original-name "LogicalAnd<Predicate>"}
  #'LogicalAnd_Predicate_]
 [:ref
  #:json-schema{:original-name "LogicalOr<Predicate>"}
  #'LogicalOr_Predicate_]
 [:ref #:json-schema{:original-name "Predicate"} #'Predicate]]
)

(def ConditionalPredicate__ValueDef__Color_null___ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalPredicate<(ValueDef<(Color|null)>|ExprRef)>"}
 [:map
  {:closed true}
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:value
   #:json-schema{:original-name "value"}
   [:or [:ref #:json-schema{:original-name "Color"} #'Color] nil?]]]
 [:map
  {:closed true}
  [:expr #:json-schema{:original-name "expr"} string?]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]]]
)

(def ConditionalAxisProperty__Color_null__
  [:or
 #:json-schema{:original-name "ConditionalAxisProperty<(Color|null)>"}
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(Color|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(Color|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]]]]
  [:value
   #:json-schema{:original-name "value"}
   [:or [:ref #:json-schema{:original-name "Color"} #'Color] nil?]]]
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(Color|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(Color|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]]]]
  [:expr #:json-schema{:original-name "expr"} string?]]]
)

(def ConditionalAxisColor
  [:ref
 #:json-schema{:original-name "ConditionalAxisColor"}
 #'ConditionalAxisProperty__Color_null__]
)

(def TimeInterval
  [:enum
 #:json-schema{:original-name "TimeInterval"}
 "millisecond"
 "second"
 "minute"
 "hour"
 "day"
 "week"
 "month"
 "year"]
)

(def TimeIntervalStep
  [:map
 {:closed true, :json-schema/original-name "TimeIntervalStep"}
 [:interval
  #:json-schema{:original-name "interval"}
  [:ref #:json-schema{:original-name "TimeInterval"} #'TimeInterval]]
 [:step #:json-schema{:original-name "step"} number?]]
)

(def ConditionalPredicate__ValueDef__Align_null___ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalPredicate<(ValueDef<(Align|null)>|ExprRef)>"}
 [:map
  {:closed true}
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:value
   #:json-schema{:original-name "value"}
   [:or [:ref #:json-schema{:original-name "Align"} #'Align] nil?]]]
 [:map
  {:closed true}
  [:expr #:json-schema{:original-name "expr"} string?]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]]]
)

(def ConditionalAxisProperty__Align_null__
  [:or
 #:json-schema{:original-name "ConditionalAxisProperty<(Align|null)>"}
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(Align|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(Align|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]]]]
  [:value
   #:json-schema{:original-name "value"}
   [:or [:ref #:json-schema{:original-name "Align"} #'Align] nil?]]]
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(Align|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(Align|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]]]]
  [:expr #:json-schema{:original-name "expr"} string?]]]
)

(def ConditionalAxisLabelAlign
  [:ref
 #:json-schema{:original-name "ConditionalAxisLabelAlign"}
 #'ConditionalAxisProperty__Align_null__]
)

(def ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalPredicate<(ValueDef<(TextBaseline|null)>|ExprRef)>"}
 [:map
  {:closed true}
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:value
   #:json-schema{:original-name "value"}
   [:or
    [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
    nil?]]]
 [:map
  {:closed true}
  [:expr #:json-schema{:original-name "expr"} string?]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]]]
)

(def ConditionalAxisProperty__TextBaseline_null__
  [:or
 #:json-schema{:original-name
               "ConditionalAxisProperty<(TextBaseline|null)>"}
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(TextBaseline|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(TextBaseline|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]]]]
  [:value
   #:json-schema{:original-name "value"}
   [:or
    [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
    nil?]]]
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(TextBaseline|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(TextBaseline|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]]]]
  [:expr #:json-schema{:original-name "expr"} string?]]]
)

(def ConditionalAxisLabelBaseline
  [:ref
 #:json-schema{:original-name "ConditionalAxisLabelBaseline"}
 #'ConditionalAxisProperty__TextBaseline_null__]
)

(def TitleAnchor
  [:enum
 #:json-schema{:original-name "TitleAnchor"}
 nil
 "start"
 "middle"
 "end"]
)

(def ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalPredicate<(ValueDef<(FontStyle|null)>|ExprRef)>"}
 [:map
  {:closed true}
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:value
   #:json-schema{:original-name "value"}
   [:or
    [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
    nil?]]]
 [:map
  {:closed true}
  [:expr #:json-schema{:original-name "expr"} string?]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]]]
)

(def ConditionalAxisProperty__FontStyle_null__
  [:or
 #:json-schema{:original-name
               "ConditionalAxisProperty<(FontStyle|null)>"}
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(FontStyle|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(FontStyle|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]]]]
  [:value
   #:json-schema{:original-name "value"}
   [:or
    [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
    nil?]]]
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(FontStyle|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(FontStyle|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]]]]
  [:expr #:json-schema{:original-name "expr"} string?]]]
)

(def ConditionalAxisLabelFontStyle
  [:ref
 #:json-schema{:original-name "ConditionalAxisLabelFontStyle"}
 #'ConditionalAxisProperty__FontStyle_null__]
)

(def LabelOverlap
  [:or
 #:json-schema{:original-name "LabelOverlap"}
 boolean?
 [:enum "parity" "greedy"]]
)

(def ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalPredicate<(ValueDef<(FontWeight|null)>|ExprRef)>"}
 [:map
  {:closed true}
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:value
   #:json-schema{:original-name "value"}
   [:or
    [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
    nil?]]]
 [:map
  {:closed true}
  [:expr #:json-schema{:original-name "expr"} string?]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]]]
)

(def ConditionalAxisProperty__FontWeight_null__
  [:or
 #:json-schema{:original-name
               "ConditionalAxisProperty<(FontWeight|null)>"}
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(FontWeight|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(FontWeight|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]]]]
  [:value
   #:json-schema{:original-name "value"}
   [:or
    [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
    nil?]]]
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(FontWeight|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(FontWeight|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]]]]
  [:expr #:json-schema{:original-name "expr"} string?]]]
)

(def ConditionalAxisLabelFontWeight
  [:ref
 #:json-schema{:original-name "ConditionalAxisLabelFontWeight"}
 #'ConditionalAxisProperty__FontWeight_null__]
)

(def AxisOrient
  [:enum
 #:json-schema{:original-name "AxisOrient"}
 "top"
 "bottom"
 "left"
 "right"]
)

(def Dict
  [:map-of #:json-schema{:original-name "Dict"} any? any?]
)

(def TimeFormatSpecifier
  [:map
 {:closed true, :json-schema/original-name "TimeFormatSpecifier"}
 [:quarter
  {:json-schema/original-name "quarter", :optional true}
  string?]
 [:day {:json-schema/original-name "day", :optional true} string?]
 [:date {:json-schema/original-name "date", :optional true} string?]
 [:week {:json-schema/original-name "week", :optional true} string?]
 [:month {:json-schema/original-name "month", :optional true} string?]
 [:seconds
  {:json-schema/original-name "seconds", :optional true}
  string?]
 [:year {:json-schema/original-name "year", :optional true} string?]
 [:hours {:json-schema/original-name "hours", :optional true} string?]
 [:milliseconds
  {:json-schema/original-name "milliseconds", :optional true}
  string?]
 [:minutes
  {:json-schema/original-name "minutes", :optional true}
  string?]]
)

(def Format
  [:or
 #:json-schema{:original-name "Format"}
 string?
 [:ref
  #:json-schema{:original-name "TimeFormatSpecifier"}
  #'TimeFormatSpecifier]
 [:ref #:json-schema{:original-name "Dict"} #'Dict]]
)

(def ConditionalPredicate__ValueDef__number_null___ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalPredicate<(ValueDef<(number|null)>|ExprRef)>"}
 [:map
  {:closed true}
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:value #:json-schema{:original-name "value"} [:or number? nil?]]]
 [:map
  {:closed true}
  [:expr #:json-schema{:original-name "expr"} string?]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]]]
)

(def ConditionalAxisProperty__number_null__
  [:or
 #:json-schema{:original-name "ConditionalAxisProperty<(number|null)>"}
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(number|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__number_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(number|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__number_null___ExprRef__]]]]
  [:value #:json-schema{:original-name "value"} [:or number? nil?]]]
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(number|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__number_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(number|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__number_null___ExprRef__]]]]
  [:expr #:json-schema{:original-name "expr"} string?]]]
)

(def ConditionalAxisNumber
  [:ref
 #:json-schema{:original-name "ConditionalAxisNumber"}
 #'ConditionalAxisProperty__number_null__]
)

(def ConditionalPredicate__ValueDef__number___null___ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalPredicate<(ValueDef<(number[]|null)>|ExprRef)>"}
 [:map
  {:closed true}
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:value
   #:json-schema{:original-name "value"}
   [:or [:vector number?] nil?]]]
 [:map
  {:closed true}
  [:expr #:json-schema{:original-name "expr"} string?]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]]]
)

(def ConditionalAxisProperty__number___null__
  [:or
 #:json-schema{:original-name
               "ConditionalAxisProperty<(number[]|null)>"}
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(number[]|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__number___null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(number[]|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__number___null___ExprRef__]]]]
  [:value
   #:json-schema{:original-name "value"}
   [:or [:vector number?] nil?]]]
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(number[]|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__number___null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(number[]|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__number___null___ExprRef__]]]]
  [:expr #:json-schema{:original-name "expr"} string?]]]
)

(def ConditionalAxisNumberArray
  [:ref
 #:json-schema{:original-name "ConditionalAxisNumberArray"}
 #'ConditionalAxisProperty__number___null__]
)

(def ConditionalPredicate__ValueDef__string_null___ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalPredicate<(ValueDef<(string|null)>|ExprRef)>"}
 [:map
  {:closed true}
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:value #:json-schema{:original-name "value"} [:or string? nil?]]]
 [:map
  {:closed true}
  [:expr #:json-schema{:original-name "expr"} string?]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]]]
)

(def ConditionalAxisProperty__string_null__
  [:or
 #:json-schema{:original-name "ConditionalAxisProperty<(string|null)>"}
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(string|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__string_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(string|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__string_null___ExprRef__]]]]
  [:value #:json-schema{:original-name "value"} [:or string? nil?]]]
 [:map
  {:closed true}
  [:condition
   #:json-schema{:original-name "condition"}
   [:or
    [:ref
     #:json-schema{:original-name
                   "ConditionalPredicate<(ValueDef<(string|null)>|ExprRef)>"}
     #'ConditionalPredicate__ValueDef__string_null___ExprRef__]
    [:vector
     [:ref
      #:json-schema{:original-name
                    "ConditionalPredicate<(ValueDef<(string|null)>|ExprRef)>"}
      #'ConditionalPredicate__ValueDef__string_null___ExprRef__]]]]
  [:expr #:json-schema{:original-name "expr"} string?]]]
)

(def ConditionalAxisString
  [:ref
 #:json-schema{:original-name "ConditionalAxisString"}
 #'ConditionalAxisProperty__string_null__]
)

(def Axis
  [:map
 {:closed true, :json-schema/original-name "Axis"}
 [:titleOpacity
  {:json-schema/original-name "titleOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gridDash
  {:json-schema/original-name "gridDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumberArray"}
    #'ConditionalAxisNumberArray]]]
 [:domainOpacity
  {:json-schema/original-name "domainOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelLimit
  {:json-schema/original-name "labelLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labels
  {:json-schema/original-name "labels", :optional true}
  boolean?]
 [:titleFontSize
  {:json-schema/original-name "titleFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:labelFlushOffset
  {:json-schema/original-name "labelFlushOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelSeparation
  {:json-schema/original-name "labelSeparation", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelBaseline
  {:json-schema/original-name "labelBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisLabelBaseline"}
    #'ConditionalAxisLabelBaseline]]]
 [:titleFontStyle
  {:json-schema/original-name "titleFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickBand
  {:json-schema/original-name "tickBand", :optional true}
  [:or
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "center" "extent"]]]
 [:titleLimit
  {:json-schema/original-name "titleLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gridOpacity
  {:json-schema/original-name "gridOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:titleAlign
  {:json-schema/original-name "titleAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelOverlap
  {:json-schema/original-name "labelOverlap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LabelOverlap"} #'LabelOverlap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:offset
  {:json-schema/original-name "offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:domainDash
  {:json-schema/original-name "domainDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickWidth
  {:json-schema/original-name "tickWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:labelOpacity
  {:json-schema/original-name "labelOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:domainColor
  {:json-schema/original-name "domainColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:grid {:json-schema/original-name "grid", :optional true} boolean?]
 [:labelPadding
  {:json-schema/original-name "labelPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:labelLineHeight
  {:json-schema/original-name "labelLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleBaseline
  {:json-schema/original-name "titleBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickExtra
  {:json-schema/original-name "tickExtra", :optional true}
  boolean?]
 [:titleX
  {:json-schema/original-name "titleX", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickOpacity
  {:json-schema/original-name "tickOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:tickDashOffset
  {:json-schema/original-name "tickDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:tickCap
  {:json-schema/original-name "tickCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFlush
  {:json-schema/original-name "labelFlush", :optional true}
  [:or boolean? number?]]
 [:titleAngle
  {:json-schema/original-name "titleAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelOffset
  {:json-schema/original-name "labelOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:tickRound
  {:json-schema/original-name "tickRound", :optional true}
  boolean?]
 [:titleLineHeight
  {:json-schema/original-name "titleLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:or
   [:ref #:json-schema{:original-name "AxisOrient"} #'AxisOrient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickMinStep
  {:json-schema/original-name "tickMinStep", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickDash
  {:json-schema/original-name "tickDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumberArray"}
    #'ConditionalAxisNumberArray]]]
 [:titleAnchor
  {:json-schema/original-name "titleAnchor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TitleAnchor"} #'TitleAnchor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelColor
  {:json-schema/original-name "labelColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisColor"}
    #'ConditionalAxisColor]]]
 [:domainCap
  {:json-schema/original-name "domainCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:style
  {:json-schema/original-name "style", :optional true}
  [:or string? [:vector string?]]]
 [:labelAngle
  {:json-schema/original-name "labelAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleY
  {:json-schema/original-name "titleY", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFont
  {:json-schema/original-name "titleFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelExpr
  {:json-schema/original-name "labelExpr", :optional true}
  string?]
 [:minExtent
  {:json-schema/original-name "minExtent", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickCount
  {:json-schema/original-name "tickCount", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "TimeInterval"} #'TimeInterval]
   [:ref
    #:json-schema{:original-name "TimeIntervalStep"}
    #'TimeIntervalStep]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:titleColor
  {:json-schema/original-name "titleColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickSize
  {:json-schema/original-name "tickSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gridDashOffset
  {:json-schema/original-name "gridDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:gridWidth
  {:json-schema/original-name "gridWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:titlePadding
  {:json-schema/original-name "titlePadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:values
  {:json-schema/original-name "values", :optional true}
  [:or
   [:vector number?]
   [:vector string?]
   [:vector boolean?]
   [:vector [:ref #:json-schema{:original-name "DateTime"} #'DateTime]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFont
  {:json-schema/original-name "labelFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisString"}
    #'ConditionalAxisString]]]
 [:maxExtent
  {:json-schema/original-name "maxExtent", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gridCap
  {:json-schema/original-name "gridCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:translate
  {:json-schema/original-name "translate", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ticks {:json-schema/original-name "ticks", :optional true} boolean?]
 [:position
  {:json-schema/original-name "position", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickOffset
  {:json-schema/original-name "tickOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelAlign
  {:json-schema/original-name "labelAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisLabelAlign"}
    #'ConditionalAxisLabelAlign]]]
 [:domain
  {:json-schema/original-name "domain", :optional true}
  boolean?]
 [:labelFontWeight
  {:json-schema/original-name "labelFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisLabelFontWeight"}
    #'ConditionalAxisLabelFontWeight]]]
 [:labelBound
  {:json-schema/original-name "labelBound", :optional true}
  [:or
   [:or number? boolean?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontStyle
  {:json-schema/original-name "labelFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisLabelFontStyle"}
    #'ConditionalAxisLabelFontStyle]]]
 [:labelFontSize
  {:json-schema/original-name "labelFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:zindex
  {:json-schema/original-name "zindex", :optional true}
  number?]
 [:gridColor
  {:json-schema/original-name "gridColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisColor"}
    #'ConditionalAxisColor]]]
 [:titleFontWeight
  {:json-schema/original-name "titleFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:domainDashOffset
  {:json-schema/original-name "domainDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickColor
  {:json-schema/original-name "tickColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisColor"}
    #'ConditionalAxisColor]]]
 [:domainWidth
  {:json-schema/original-name "domainWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def AxisConfig
  [:map
 {:closed true, :json-schema/original-name "AxisConfig"}
 [:titleOpacity
  {:json-schema/original-name "titleOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:disable
  {:json-schema/original-name "disable", :optional true}
  boolean?]
 [:gridDash
  {:json-schema/original-name "gridDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumberArray"}
    #'ConditionalAxisNumberArray]]]
 [:domainOpacity
  {:json-schema/original-name "domainOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelLimit
  {:json-schema/original-name "labelLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labels
  {:json-schema/original-name "labels", :optional true}
  boolean?]
 [:titleFontSize
  {:json-schema/original-name "titleFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:labelFlushOffset
  {:json-schema/original-name "labelFlushOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelSeparation
  {:json-schema/original-name "labelSeparation", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelBaseline
  {:json-schema/original-name "labelBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisLabelBaseline"}
    #'ConditionalAxisLabelBaseline]]]
 [:titleFontStyle
  {:json-schema/original-name "titleFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickBand
  {:json-schema/original-name "tickBand", :optional true}
  [:or
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "center" "extent"]]]
 [:titleLimit
  {:json-schema/original-name "titleLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gridOpacity
  {:json-schema/original-name "gridOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:titleAlign
  {:json-schema/original-name "titleAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelOverlap
  {:json-schema/original-name "labelOverlap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LabelOverlap"} #'LabelOverlap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:offset
  {:json-schema/original-name "offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:domainDash
  {:json-schema/original-name "domainDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickWidth
  {:json-schema/original-name "tickWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:labelOpacity
  {:json-schema/original-name "labelOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:domainColor
  {:json-schema/original-name "domainColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:grid {:json-schema/original-name "grid", :optional true} boolean?]
 [:labelPadding
  {:json-schema/original-name "labelPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:labelLineHeight
  {:json-schema/original-name "labelLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleBaseline
  {:json-schema/original-name "titleBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickExtra
  {:json-schema/original-name "tickExtra", :optional true}
  boolean?]
 [:titleX
  {:json-schema/original-name "titleX", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickOpacity
  {:json-schema/original-name "tickOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:tickDashOffset
  {:json-schema/original-name "tickDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:tickCap
  {:json-schema/original-name "tickCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFlush
  {:json-schema/original-name "labelFlush", :optional true}
  [:or boolean? number?]]
 [:titleAngle
  {:json-schema/original-name "titleAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelOffset
  {:json-schema/original-name "labelOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:tickRound
  {:json-schema/original-name "tickRound", :optional true}
  boolean?]
 [:titleLineHeight
  {:json-schema/original-name "titleLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:or
   [:ref #:json-schema{:original-name "AxisOrient"} #'AxisOrient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickMinStep
  {:json-schema/original-name "tickMinStep", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickDash
  {:json-schema/original-name "tickDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumberArray"}
    #'ConditionalAxisNumberArray]]]
 [:titleAnchor
  {:json-schema/original-name "titleAnchor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TitleAnchor"} #'TitleAnchor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelColor
  {:json-schema/original-name "labelColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisColor"}
    #'ConditionalAxisColor]]]
 [:domainCap
  {:json-schema/original-name "domainCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:style
  {:json-schema/original-name "style", :optional true}
  [:or string? [:vector string?]]]
 [:labelAngle
  {:json-schema/original-name "labelAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleY
  {:json-schema/original-name "titleY", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFont
  {:json-schema/original-name "titleFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelExpr
  {:json-schema/original-name "labelExpr", :optional true}
  string?]
 [:minExtent
  {:json-schema/original-name "minExtent", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickCount
  {:json-schema/original-name "tickCount", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "TimeInterval"} #'TimeInterval]
   [:ref
    #:json-schema{:original-name "TimeIntervalStep"}
    #'TimeIntervalStep]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:titleColor
  {:json-schema/original-name "titleColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickSize
  {:json-schema/original-name "tickSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gridDashOffset
  {:json-schema/original-name "gridDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:gridWidth
  {:json-schema/original-name "gridWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:titlePadding
  {:json-schema/original-name "titlePadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:values
  {:json-schema/original-name "values", :optional true}
  [:or
   [:vector number?]
   [:vector string?]
   [:vector boolean?]
   [:vector [:ref #:json-schema{:original-name "DateTime"} #'DateTime]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFont
  {:json-schema/original-name "labelFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisString"}
    #'ConditionalAxisString]]]
 [:maxExtent
  {:json-schema/original-name "maxExtent", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gridCap
  {:json-schema/original-name "gridCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:translate
  {:json-schema/original-name "translate", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ticks {:json-schema/original-name "ticks", :optional true} boolean?]
 [:position
  {:json-schema/original-name "position", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickOffset
  {:json-schema/original-name "tickOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelAlign
  {:json-schema/original-name "labelAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisLabelAlign"}
    #'ConditionalAxisLabelAlign]]]
 [:domain
  {:json-schema/original-name "domain", :optional true}
  boolean?]
 [:labelFontWeight
  {:json-schema/original-name "labelFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisLabelFontWeight"}
    #'ConditionalAxisLabelFontWeight]]]
 [:labelBound
  {:json-schema/original-name "labelBound", :optional true}
  [:or
   [:or number? boolean?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontStyle
  {:json-schema/original-name "labelFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisLabelFontStyle"}
    #'ConditionalAxisLabelFontStyle]]]
 [:labelFontSize
  {:json-schema/original-name "labelFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisNumber"}
    #'ConditionalAxisNumber]]]
 [:zindex
  {:json-schema/original-name "zindex", :optional true}
  number?]
 [:gridColor
  {:json-schema/original-name "gridColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisColor"}
    #'ConditionalAxisColor]]]
 [:titleFontWeight
  {:json-schema/original-name "titleFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:domainDashOffset
  {:json-schema/original-name "domainDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickColor
  {:json-schema/original-name "tickColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ConditionalAxisColor"}
    #'ConditionalAxisColor]]]
 [:domainWidth
  {:json-schema/original-name "domainWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ResolveMode
  [:enum
 #:json-schema{:original-name "ResolveMode"}
 "independent"
 "shared"]
)

(def AxisResolveMap
  [:map
 {:closed true, :json-schema/original-name "AxisResolveMap"}
 [:x
  {:json-schema/original-name "x", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:y
  {:json-schema/original-name "y", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]]
)

(def BBox
  [:or
 #:json-schema{:original-name "BBox"}
 [:vector number?]
 [:vector number?]]
)

(def TitleFrame
  [:enum #:json-schema{:original-name "TitleFrame"} "bounds" "group"]
)

(def TitleOrient
  [:enum
 #:json-schema{:original-name "TitleOrient"}
 "none"
 "left"
 "right"
 "top"
 "bottom"]
)

(def BaseTitleNoValueRefs
  [:map
 {:closed true, :json-schema/original-name "BaseTitleNoValueRefs"}
 [:baseline
  {:json-schema/original-name "baseline", :optional true}
  [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:ref #:json-schema{:original-name "Align"} #'Align]]
 [:dx
  {:json-schema/original-name "dx", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:frame
  {:json-schema/original-name "frame", :optional true}
  [:or
   [:or
    [:ref #:json-schema{:original-name "TitleFrame"} #'TitleFrame]
    string?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitleFont
  {:json-schema/original-name "subtitleFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:limit
  {:json-schema/original-name "limit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:offset
  {:json-schema/original-name "offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitleFontStyle
  {:json-schema/original-name "subtitleFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dy
  {:json-schema/original-name "dy", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TitleOrient"} #'TitleOrient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:font
  {:json-schema/original-name "font", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitleLineHeight
  {:json-schema/original-name "subtitleLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontStyle
  {:json-schema/original-name "fontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontWeight
  {:json-schema/original-name "fontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitleColor
  {:json-schema/original-name "subtitleColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitlePadding
  {:json-schema/original-name "subtitlePadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineHeight
  {:json-schema/original-name "lineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontSize
  {:json-schema/original-name "fontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:anchor
  {:json-schema/original-name "anchor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TitleAnchor"} #'TitleAnchor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitleFontSize
  {:json-schema/original-name "subtitleFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:zindex
  {:json-schema/original-name "zindex", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitleFontWeight
  {:json-schema/original-name "subtitleFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def SingleDefUnitChannel
  [:enum
 #:json-schema{:original-name "SingleDefUnitChannel"}
 "text"
 "shape"
 "x"
 "y"
 "xOffset"
 "yOffset"
 "x2"
 "y2"
 "longitude"
 "latitude"
 "longitude2"
 "latitude2"
 "theta"
 "theta2"
 "radius"
 "radius2"
 "time"
 "color"
 "fill"
 "stroke"
 "opacity"
 "fillOpacity"
 "strokeOpacity"
 "strokeWidth"
 "strokeDash"
 "size"
 "angle"
 "key"
 "href"
 "url"
 "description"]
)

(def ParameterExtent
  [:or
 #:json-schema{:original-name "ParameterExtent"}
 [:map
  {:closed true}
  [:field
   {:json-schema/original-name "field", :optional true}
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
  [:param
   #:json-schema{:original-name "param"}
   [:ref
    #:json-schema{:original-name "ParameterName"}
    #'ParameterName]]]
 [:map
  {:closed true}
  [:encoding
   {:json-schema/original-name "encoding", :optional true}
   [:ref
    #:json-schema{:original-name "SingleDefUnitChannel"}
    #'SingleDefUnitChannel]]
  [:param
   #:json-schema{:original-name "param"}
   [:ref
    #:json-schema{:original-name "ParameterName"}
    #'ParameterName]]]]
)

(def BinExtent
  [:or
 #:json-schema{:original-name "BinExtent"}
 [:vector number?]
 [:ref
  #:json-schema{:original-name "ParameterExtent"}
  #'ParameterExtent]]
)

(def BinParams
  [:map
 {:closed true, :json-schema/original-name "BinParams"}
 [:maxbins
  {:json-schema/original-name "maxbins", :optional true}
  number?]
 [:divide
  {:json-schema/original-name "divide", :optional true}
  [:vector number?]]
 [:steps
  {:json-schema/original-name "steps", :optional true}
  [:vector number?]]
 [:minstep
  {:json-schema/original-name "minstep", :optional true}
  number?]
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:ref #:json-schema{:original-name "BinExtent"} #'BinExtent]]
 [:binned
  {:json-schema/original-name "binned", :optional true}
  boolean?]
 [:nice {:json-schema/original-name "nice", :optional true} boolean?]
 [:anchor
  {:json-schema/original-name "anchor", :optional true}
  number?]
 [:base {:json-schema/original-name "base", :optional true} number?]
 [:step {:json-schema/original-name "step", :optional true} number?]]
)

(def BinTransform
  [:map
 {:closed true, :json-schema/original-name "BinTransform"}
 [:as
  #:json-schema{:original-name "as"}
  [:or
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]
   [:vector
    [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]]
 [:bin
  #:json-schema{:original-name "bin"}
  [:or
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
   [:enum true]]]
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
)

(def Element
  [:and #:json-schema{:original-name "Element"} string?]
)

(def BindCheckbox
  [:map
 {:closed true, :json-schema/original-name "BindCheckbox"}
 [:debounce
  {:json-schema/original-name "debounce", :optional true}
  number?]
 [:element
  {:json-schema/original-name "element", :optional true}
  [:ref #:json-schema{:original-name "Element"} #'Element]]
 [:input #:json-schema{:original-name "input"} [:= "checkbox"]]
 [:name {:json-schema/original-name "name", :optional true} string?]]
)

(def BindDirect
  [:map
 {:closed true, :json-schema/original-name "BindDirect"}
 [:debounce
  {:json-schema/original-name "debounce", :optional true}
  number?]
 [:element
  #:json-schema{:original-name "element"}
  [:or
   [:ref #:json-schema{:original-name "Element"} #'Element]
   [:map {:closed true}]]]
 [:event {:json-schema/original-name "event", :optional true} string?]]
)

(def BindInput
  [:map
 {:closed true, :json-schema/original-name "BindInput"}
 [:autocomplete
  {:json-schema/original-name "autocomplete", :optional true}
  string?]
 [:debounce
  {:json-schema/original-name "debounce", :optional true}
  number?]
 [:element
  {:json-schema/original-name "element", :optional true}
  [:ref #:json-schema{:original-name "Element"} #'Element]]
 [:input {:json-schema/original-name "input", :optional true} string?]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:placeholder
  {:json-schema/original-name "placeholder", :optional true}
  string?]]
)

(def BindRadioSelect
  [:map
 {:closed true, :json-schema/original-name "BindRadioSelect"}
 [:debounce
  {:json-schema/original-name "debounce", :optional true}
  number?]
 [:element
  {:json-schema/original-name "element", :optional true}
  [:ref #:json-schema{:original-name "Element"} #'Element]]
 [:input
  #:json-schema{:original-name "input"}
  [:enum "radio" "select"]]
 [:labels
  {:json-schema/original-name "labels", :optional true}
  [:vector string?]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:options #:json-schema{:original-name "options"} [:vector any?]]]
)

(def BindRange
  [:map
 {:closed true, :json-schema/original-name "BindRange"}
 [:debounce
  {:json-schema/original-name "debounce", :optional true}
  number?]
 [:element
  {:json-schema/original-name "element", :optional true}
  [:ref #:json-schema{:original-name "Element"} #'Element]]
 [:input #:json-schema{:original-name "input"} [:= "range"]]
 [:max {:json-schema/original-name "max", :optional true} number?]
 [:min {:json-schema/original-name "min", :optional true} number?]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:step {:json-schema/original-name "step", :optional true} number?]]
)

(def Binding
  [:or
 #:json-schema{:original-name "Binding"}
 [:ref #:json-schema{:original-name "BindCheckbox"} #'BindCheckbox]
 [:ref
  #:json-schema{:original-name "BindRadioSelect"}
  #'BindRadioSelect]
 [:ref #:json-schema{:original-name "BindRange"} #'BindRange]
 [:ref #:json-schema{:original-name "BindInput"} #'BindInput]
 [:ref #:json-schema{:original-name "BindDirect"} #'BindDirect]]
)

(def BoxPlotConfig
  [:map
 {:closed true, :json-schema/original-name "BoxPlotConfig"}
 [:box
  {:json-schema/original-name "box", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:or number? [:enum "min-max"]]]
 [:median
  {:json-schema/original-name "median", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:outliers
  {:json-schema/original-name "outliers", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:rule
  {:json-schema/original-name "rule", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:size {:json-schema/original-name "size", :optional true} number?]
 [:ticks
  {:json-schema/original-name "ticks", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]]
)

(def BrushConfig
  [:map
 {:closed true, :json-schema/original-name "BrushConfig"}
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:ref #:json-schema{:original-name "Cursor"} #'Cursor]]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:ref #:json-schema{:original-name "Color"} #'Color]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  number?]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:ref #:json-schema{:original-name "Color"} #'Color]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:vector number?]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  number?]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  number?]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  number?]]
)

(def CalculateTransform
  [:map
 {:closed true, :json-schema/original-name "CalculateTransform"}
 [:as
  #:json-schema{:original-name "as"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:calculate #:json-schema{:original-name "calculate"} string?]]
)

(def Categorical
  [:enum
 #:json-schema{:original-name "Categorical"}
 "accent"
 "category10"
 "category20"
 "category20b"
 "category20c"
 "dark2"
 "paired"
 "pastel1"
 "pastel2"
 "set1"
 "set2"
 "set3"
 "tableau10"
 "tableau20"
 "observable10"]
)

(def StandardType
  [:enum
 #:json-schema{:original-name "StandardType"}
 "quantitative"
 "ordinal"
 "temporal"
 "nominal"]
)

(def ConditionalPredicate_ValueDef__Gradient_string_null_ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalPredicate<ValueDef<(Gradient|string|null|ExprRef)>>"}
 [:test
  #:json-schema{:original-name "test"}
  [:ref
   #:json-schema{:original-name "PredicateComposition"}
   #'PredicateComposition]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   string?
   nil?]]]
)

(def ConditionalParameter_ValueDef__Gradient_string_null_ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalParameter<ValueDef<(Gradient|string|null|ExprRef)>>"}
 [:empty {:json-schema/original-name "empty", :optional true} boolean?]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   string?
   nil?]]]
)

(def ConditionalValueDef__Gradient_string_null_ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
 [:ref
  #:json-schema{:original-name
                "ConditionalPredicate<ValueDef<(Gradient|string|null|ExprRef)>>"}
  #'ConditionalPredicate_ValueDef__Gradient_string_null_ExprRef___]
 [:ref
  #:json-schema{:original-name
                "ConditionalParameter<ValueDef<(Gradient|string|null|ExprRef)>>"}
  #'ConditionalParameter_ValueDef__Gradient_string_null_ExprRef___]]
)

(def RepeatRef
  [:map
 {:closed true, :json-schema/original-name "RepeatRef"}
 [:repeat
  #:json-schema{:original-name "repeat"}
  [:enum "row" "column" "repeat" "layer"]]]
)

(def Field
  [:or
 #:json-schema{:original-name "Field"}
 [:ref #:json-schema{:original-name "FieldName"} #'FieldName]
 [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]
)

(def ScaleInterpolateParams
  [:map
 {:closed true, :json-schema/original-name "ScaleInterpolateParams"}
 [:gamma {:json-schema/original-name "gamma", :optional true} number?]
 [:type
  #:json-schema{:original-name "type"}
  [:enum "rgb" "cubehelix" "cubehelix-long"]]]
)

(def Cyclical
  [:enum #:json-schema{:original-name "Cyclical"} "rainbow" "sinebow"]
)

(def SequentialMultiHue
  [:enum
 #:json-schema{:original-name "SequentialMultiHue"}
 "turbo"
 "viridis"
 "inferno"
 "magma"
 "plasma"
 "cividis"
 "bluegreen"
 "bluegreen-3"
 "bluegreen-4"
 "bluegreen-5"
 "bluegreen-6"
 "bluegreen-7"
 "bluegreen-8"
 "bluegreen-9"
 "bluepurple"
 "bluepurple-3"
 "bluepurple-4"
 "bluepurple-5"
 "bluepurple-6"
 "bluepurple-7"
 "bluepurple-8"
 "bluepurple-9"
 "goldgreen"
 "goldgreen-3"
 "goldgreen-4"
 "goldgreen-5"
 "goldgreen-6"
 "goldgreen-7"
 "goldgreen-8"
 "goldgreen-9"
 "goldorange"
 "goldorange-3"
 "goldorange-4"
 "goldorange-5"
 "goldorange-6"
 "goldorange-7"
 "goldorange-8"
 "goldorange-9"
 "goldred"
 "goldred-3"
 "goldred-4"
 "goldred-5"
 "goldred-6"
 "goldred-7"
 "goldred-8"
 "goldred-9"
 "greenblue"
 "greenblue-3"
 "greenblue-4"
 "greenblue-5"
 "greenblue-6"
 "greenblue-7"
 "greenblue-8"
 "greenblue-9"
 "orangered"
 "orangered-3"
 "orangered-4"
 "orangered-5"
 "orangered-6"
 "orangered-7"
 "orangered-8"
 "orangered-9"
 "purplebluegreen"
 "purplebluegreen-3"
 "purplebluegreen-4"
 "purplebluegreen-5"
 "purplebluegreen-6"
 "purplebluegreen-7"
 "purplebluegreen-8"
 "purplebluegreen-9"
 "purpleblue"
 "purpleblue-3"
 "purpleblue-4"
 "purpleblue-5"
 "purpleblue-6"
 "purpleblue-7"
 "purpleblue-8"
 "purpleblue-9"
 "purplered"
 "purplered-3"
 "purplered-4"
 "purplered-5"
 "purplered-6"
 "purplered-7"
 "purplered-8"
 "purplered-9"
 "redpurple"
 "redpurple-3"
 "redpurple-4"
 "redpurple-5"
 "redpurple-6"
 "redpurple-7"
 "redpurple-8"
 "redpurple-9"
 "yellowgreenblue"
 "yellowgreenblue-3"
 "yellowgreenblue-4"
 "yellowgreenblue-5"
 "yellowgreenblue-6"
 "yellowgreenblue-7"
 "yellowgreenblue-8"
 "yellowgreenblue-9"
 "yellowgreen"
 "yellowgreen-3"
 "yellowgreen-4"
 "yellowgreen-5"
 "yellowgreen-6"
 "yellowgreen-7"
 "yellowgreen-8"
 "yellowgreen-9"
 "yelloworangebrown"
 "yelloworangebrown-3"
 "yelloworangebrown-4"
 "yelloworangebrown-5"
 "yelloworangebrown-6"
 "yelloworangebrown-7"
 "yelloworangebrown-8"
 "yelloworangebrown-9"
 "yelloworangered"
 "yelloworangered-3"
 "yelloworangered-4"
 "yelloworangered-5"
 "yelloworangered-6"
 "yelloworangered-7"
 "yelloworangered-8"
 "yelloworangered-9"
 "darkblue"
 "darkblue-3"
 "darkblue-4"
 "darkblue-5"
 "darkblue-6"
 "darkblue-7"
 "darkblue-8"
 "darkblue-9"
 "darkgold"
 "darkgold-3"
 "darkgold-4"
 "darkgold-5"
 "darkgold-6"
 "darkgold-7"
 "darkgold-8"
 "darkgold-9"
 "darkgreen"
 "darkgreen-3"
 "darkgreen-4"
 "darkgreen-5"
 "darkgreen-6"
 "darkgreen-7"
 "darkgreen-8"
 "darkgreen-9"
 "darkmulti"
 "darkmulti-3"
 "darkmulti-4"
 "darkmulti-5"
 "darkmulti-6"
 "darkmulti-7"
 "darkmulti-8"
 "darkmulti-9"
 "darkred"
 "darkred-3"
 "darkred-4"
 "darkred-5"
 "darkred-6"
 "darkred-7"
 "darkred-8"
 "darkred-9"
 "lightgreyred"
 "lightgreyred-3"
 "lightgreyred-4"
 "lightgreyred-5"
 "lightgreyred-6"
 "lightgreyred-7"
 "lightgreyred-8"
 "lightgreyred-9"
 "lightgreyteal"
 "lightgreyteal-3"
 "lightgreyteal-4"
 "lightgreyteal-5"
 "lightgreyteal-6"
 "lightgreyteal-7"
 "lightgreyteal-8"
 "lightgreyteal-9"
 "lightmulti"
 "lightmulti-3"
 "lightmulti-4"
 "lightmulti-5"
 "lightmulti-6"
 "lightmulti-7"
 "lightmulti-8"
 "lightmulti-9"
 "lightorange"
 "lightorange-3"
 "lightorange-4"
 "lightorange-5"
 "lightorange-6"
 "lightorange-7"
 "lightorange-8"
 "lightorange-9"
 "lighttealblue"
 "lighttealblue-3"
 "lighttealblue-4"
 "lighttealblue-5"
 "lighttealblue-6"
 "lighttealblue-7"
 "lighttealblue-8"
 "lighttealblue-9"]
)

(def Diverging
  [:enum
 #:json-schema{:original-name "Diverging"}
 "blueorange"
 "blueorange-3"
 "blueorange-4"
 "blueorange-5"
 "blueorange-6"
 "blueorange-7"
 "blueorange-8"
 "blueorange-9"
 "blueorange-10"
 "blueorange-11"
 "brownbluegreen"
 "brownbluegreen-3"
 "brownbluegreen-4"
 "brownbluegreen-5"
 "brownbluegreen-6"
 "brownbluegreen-7"
 "brownbluegreen-8"
 "brownbluegreen-9"
 "brownbluegreen-10"
 "brownbluegreen-11"
 "purplegreen"
 "purplegreen-3"
 "purplegreen-4"
 "purplegreen-5"
 "purplegreen-6"
 "purplegreen-7"
 "purplegreen-8"
 "purplegreen-9"
 "purplegreen-10"
 "purplegreen-11"
 "pinkyellowgreen"
 "pinkyellowgreen-3"
 "pinkyellowgreen-4"
 "pinkyellowgreen-5"
 "pinkyellowgreen-6"
 "pinkyellowgreen-7"
 "pinkyellowgreen-8"
 "pinkyellowgreen-9"
 "pinkyellowgreen-10"
 "pinkyellowgreen-11"
 "purpleorange"
 "purpleorange-3"
 "purpleorange-4"
 "purpleorange-5"
 "purpleorange-6"
 "purpleorange-7"
 "purpleorange-8"
 "purpleorange-9"
 "purpleorange-10"
 "purpleorange-11"
 "redblue"
 "redblue-3"
 "redblue-4"
 "redblue-5"
 "redblue-6"
 "redblue-7"
 "redblue-8"
 "redblue-9"
 "redblue-10"
 "redblue-11"
 "redgrey"
 "redgrey-3"
 "redgrey-4"
 "redgrey-5"
 "redgrey-6"
 "redgrey-7"
 "redgrey-8"
 "redgrey-9"
 "redgrey-10"
 "redgrey-11"
 "redyellowblue"
 "redyellowblue-3"
 "redyellowblue-4"
 "redyellowblue-5"
 "redyellowblue-6"
 "redyellowblue-7"
 "redyellowblue-8"
 "redyellowblue-9"
 "redyellowblue-10"
 "redyellowblue-11"
 "redyellowgreen"
 "redyellowgreen-3"
 "redyellowgreen-4"
 "redyellowgreen-5"
 "redyellowgreen-6"
 "redyellowgreen-7"
 "redyellowgreen-8"
 "redyellowgreen-9"
 "redyellowgreen-10"
 "redyellowgreen-11"
 "spectral"
 "spectral-3"
 "spectral-4"
 "spectral-5"
 "spectral-6"
 "spectral-7"
 "spectral-8"
 "spectral-9"
 "spectral-10"
 "spectral-11"]
)

(def SequentialSingleHue
  [:enum
 #:json-schema{:original-name "SequentialSingleHue"}
 "blues"
 "tealblues"
 "teals"
 "greens"
 "browns"
 "greys"
 "purples"
 "warmgreys"
 "reds"
 "oranges"]
)

(def ColorScheme
  [:or
 #:json-schema{:original-name "ColorScheme"}
 [:ref #:json-schema{:original-name "Categorical"} #'Categorical]
 [:ref
  #:json-schema{:original-name "SequentialSingleHue"}
  #'SequentialSingleHue]
 [:ref
  #:json-schema{:original-name "SequentialMultiHue"}
  #'SequentialMultiHue]
 [:ref #:json-schema{:original-name "Diverging"} #'Diverging]
 [:ref #:json-schema{:original-name "Cyclical"} #'Cyclical]]
)

(def SchemeParams
  [:map
 {:closed true, :json-schema/original-name "SchemeParams"}
 [:count {:json-schema/original-name "count", :optional true} number?]
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:vector number?]]
 [:name
  #:json-schema{:original-name "name"}
  [:ref #:json-schema{:original-name "ColorScheme"} #'ColorScheme]]]
)

(def DomainUnionWith
  [:map
 {:closed true, :json-schema/original-name "DomainUnionWith"}
 [:unionWith
  #:json-schema{:original-name "unionWith"}
  [:vector
   [:or
    number?
    string?
    boolean?
    [:ref #:json-schema{:original-name "DateTime"} #'DateTime]]]]]
)

(def RangeEnum
  [:enum
 #:json-schema{:original-name "RangeEnum"}
 "width"
 "height"
 "symbol"
 "category"
 "ordinal"
 "ramp"
 "diverging"
 "heatmap"]
)

(def ScaleBinParams
  [:map
 {:closed true, :json-schema/original-name "ScaleBinParams"}
 [:start {:json-schema/original-name "start", :optional true} number?]
 [:step #:json-schema{:original-name "step"} number?]
 [:stop {:json-schema/original-name "stop", :optional true} number?]]
)

(def ScaleBins
  [:or
 #:json-schema{:original-name "ScaleBins"}
 [:vector number?]
 [:ref #:json-schema{:original-name "ScaleBinParams"} #'ScaleBinParams]]
)

(def ScaleInterpolateEnum
  [:enum
 #:json-schema{:original-name "ScaleInterpolateEnum"}
 "rgb"
 "lab"
 "hcl"
 "hsl"
 "hsl-long"
 "hcl-long"
 "cubehelix"
 "cubehelix-long"]
)

(def FieldRange
  [:map
 {:closed true, :json-schema/original-name "FieldRange"}
 [:field #:json-schema{:original-name "field"} string?]]
)

(def ScaleType
  [:enum
 #:json-schema{:original-name "ScaleType"}
 "linear"
 "log"
 "pow"
 "sqrt"
 "symlog"
 "identity"
 "sequential"
 "time"
 "utc"
 "quantile"
 "quantize"
 "threshold"
 "bin-ordinal"
 "ordinal"
 "point"
 "band"]
)

(def Scale
  [:map
 {:closed true, :json-schema/original-name "Scale"}
 [:zero
  {:json-schema/original-name "zero", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:exponent
  {:json-schema/original-name "exponent", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:paddingInner
  {:json-schema/original-name "paddingInner", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:domainRaw
  {:json-schema/original-name "domainRaw", :optional true}
  [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]
 [:constant
  {:json-schema/original-name "constant", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:bins
  {:json-schema/original-name "bins", :optional true}
  [:ref #:json-schema{:original-name "ScaleBins"} #'ScaleBins]]
 [:paddingOuter
  {:json-schema/original-name "paddingOuter", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "ScaleType"} #'ScaleType]]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "ScaleInterpolateEnum"}
    #'ScaleInterpolateEnum]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref
    #:json-schema{:original-name "ScaleInterpolateParams"}
    #'ScaleInterpolateParams]]]
 [:domainMax
  {:json-schema/original-name "domainMax", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:round
  {:json-schema/original-name "round", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:rangeMax
  {:json-schema/original-name "rangeMax", :optional true}
  [:or
   number?
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:rangeMin
  {:json-schema/original-name "rangeMin", :optional true}
  [:or
   number?
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padding
  {:json-schema/original-name "padding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:nice
  {:json-schema/original-name "nice", :optional true}
  [:or
   boolean?
   number?
   [:ref #:json-schema{:original-name "TimeInterval"} #'TimeInterval]
   [:ref
    #:json-schema{:original-name "TimeIntervalStep"}
    #'TimeIntervalStep]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:domainMin
  {:json-schema/original-name "domainMin", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:domain
  {:json-schema/original-name "domain", :optional true}
  [:or
   [:vector
    [:or
     nil?
     string?
     number?
     boolean?
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:ref
    #:json-schema{:original-name "ParameterExtent"}
    #'ParameterExtent]
   [:ref
    #:json-schema{:original-name "DomainUnionWith"}
    #'DomainUnionWith]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "unaggregated"]]]
 [:base
  {:json-schema/original-name "base", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:clamp
  {:json-schema/original-name "clamp", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:scheme
  {:json-schema/original-name "scheme", :optional true}
  [:or
   [:ref #:json-schema{:original-name "ColorScheme"} #'ColorScheme]
   [:ref #:json-schema{:original-name "SchemeParams"} #'SchemeParams]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:reverse
  {:json-schema/original-name "reverse", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:range
  {:json-schema/original-name "range", :optional true}
  [:or
   [:ref #:json-schema{:original-name "RangeEnum"} #'RangeEnum]
   [:ref #:json-schema{:original-name "FieldRange"} #'FieldRange]
   [:vector
    [:or
     number?
     string?
     [:vector number?]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]]
 [:domainMid
  {:json-schema/original-name "domainMid", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def EncodingSortField
  [:map
 {:closed true, :json-schema/original-name "EncodingSortField"}
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:op
  {:json-schema/original-name "op", :optional true}
  [:ref
   #:json-schema{:original-name "NonArgAggregateOp"}
   #'NonArgAggregateOp]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SortOrder"} #'SortOrder]
   nil?]]]
)

(def SortArray
  [:or
 #:json-schema{:original-name "SortArray"}
 [:vector number?]
 [:vector string?]
 [:vector boolean?]
 [:vector [:ref #:json-schema{:original-name "DateTime"} #'DateTime]]]
)

(def SortByEncoding
  [:map
 {:closed true, :json-schema/original-name "SortByEncoding"}
 [:encoding
  #:json-schema{:original-name "encoding"}
  [:ref #:json-schema{:original-name "SortByChannel"} #'SortByChannel]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SortOrder"} #'SortOrder]
   nil?]]]
)

(def Sort
  [:or
 #:json-schema{:original-name "Sort"}
 [:ref #:json-schema{:original-name "SortArray"} #'SortArray]
 [:ref #:json-schema{:original-name "AllSortString"} #'AllSortString]
 [:ref
  #:json-schema{:original-name "EncodingSortField"}
  #'EncodingSortField]
 [:ref #:json-schema{:original-name "SortByEncoding"} #'SortByEncoding]
 nil?]
)

(def LayoutAlign
  [:enum #:json-schema{:original-name "LayoutAlign"} "all" "each" "none"]
)

(def TickCount
  [:or
 #:json-schema{:original-name "TickCount"}
 number?
 [:ref #:json-schema{:original-name "TimeInterval"} #'TimeInterval]
 [:ref
  #:json-schema{:original-name "TimeIntervalStep"}
  #'TimeIntervalStep]]
)

(def Orient
  [:enum
 #:json-schema{:original-name "Orient"}
 "left"
 "right"
 "top"
 "bottom"]
)

(def LegendOrient
  [:enum
 #:json-schema{:original-name "LegendOrient"}
 "none"
 "left"
 "right"
 "top"
 "bottom"
 "top-left"
 "top-right"
 "bottom-left"
 "bottom-right"]
)

(def Legend
  [:map
 {:closed true, :json-schema/original-name "Legend"}
 [:titleOpacity
  {:json-schema/original-name "titleOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelLimit
  {:json-schema/original-name "labelLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolDash
  {:json-schema/original-name "symbolDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gridAlign
  {:json-schema/original-name "gridAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolSize
  {:json-schema/original-name "symbolSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFontSize
  {:json-schema/original-name "titleFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:gradientOpacity
  {:json-schema/original-name "gradientOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelSeparation
  {:json-schema/original-name "labelSeparation", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelBaseline
  {:json-schema/original-name "labelBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFontStyle
  {:json-schema/original-name "titleFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleLimit
  {:json-schema/original-name "titleLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleAlign
  {:json-schema/original-name "titleAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelOverlap
  {:json-schema/original-name "labelOverlap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LabelOverlap"} #'LabelOverlap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientStrokeWidth
  {:json-schema/original-name "gradientStrokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientThickness
  {:json-schema/original-name "gradientThickness", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:offset
  {:json-schema/original-name "offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelOpacity
  {:json-schema/original-name "labelOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:columns
  {:json-schema/original-name "columns", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelPadding
  {:json-schema/original-name "labelPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:columnPadding
  {:json-schema/original-name "columnPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:clipHeight
  {:json-schema/original-name "clipHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleBaseline
  {:json-schema/original-name "titleBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolDashOffset
  {:json-schema/original-name "symbolDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:enum "symbol" "gradient"]]
 [:labelOffset
  {:json-schema/original-name "labelOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleLineHeight
  {:json-schema/original-name "titleLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "LegendOrient"} #'LegendOrient]]
 [:tickMinStep
  {:json-schema/original-name "tickMinStep", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleAnchor
  {:json-schema/original-name "titleAnchor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TitleAnchor"} #'TitleAnchor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientStrokeColor
  {:json-schema/original-name "gradientStrokeColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelColor
  {:json-schema/original-name "labelColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:titleFont
  {:json-schema/original-name "titleFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolFillColor
  {:json-schema/original-name "symbolFillColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelExpr
  {:json-schema/original-name "labelExpr", :optional true}
  string?]
 [:titleOrient
  {:json-schema/original-name "titleOrient", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Orient"} #'Orient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickCount
  {:json-schema/original-name "tickCount", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TickCount"} #'TickCount]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:titleColor
  {:json-schema/original-name "titleColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolOffset
  {:json-schema/original-name "symbolOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:legendX
  {:json-schema/original-name "legendX", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolOpacity
  {:json-schema/original-name "symbolOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titlePadding
  {:json-schema/original-name "titlePadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:values
  {:json-schema/original-name "values", :optional true}
  [:or
   [:vector number?]
   [:vector string?]
   [:vector boolean?]
   [:vector [:ref #:json-schema{:original-name "DateTime"} #'DateTime]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientLength
  {:json-schema/original-name "gradientLength", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padding
  {:json-schema/original-name "padding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFont
  {:json-schema/original-name "labelFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeColor
  {:json-schema/original-name "strokeColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolStrokeColor
  {:json-schema/original-name "symbolStrokeColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:rowPadding
  {:json-schema/original-name "rowPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelAlign
  {:json-schema/original-name "labelAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolType
  {:json-schema/original-name "symbolType", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontWeight
  {:json-schema/original-name "labelFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontStyle
  {:json-schema/original-name "labelFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontSize
  {:json-schema/original-name "labelFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fillColor
  {:json-schema/original-name "fillColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:zindex
  {:json-schema/original-name "zindex", :optional true}
  number?]
 [:direction
  {:json-schema/original-name "direction", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:symbolStrokeWidth
  {:json-schema/original-name "symbolStrokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFontWeight
  {:json-schema/original-name "titleFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:legendY
  {:json-schema/original-name "legendY", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolLimit
  {:json-schema/original-name "symbolLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def FieldOrDatumDefWithCondition_MarkPropFieldDef__Gradient_string_null__
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<MarkPropFieldDef,(Gradient|string|null)>"}
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:legend
  {:json-schema/original-name "legend", :optional true}
  [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
    #'ConditionalValueDef__Gradient_string_null_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
     #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
)

(def Type
  [:enum
 #:json-schema{:original-name "Type"}
 "quantitative"
 "ordinal"
 "temporal"
 "nominal"
 "geojson"]
)

(def PrimitiveValue
  [:or
 #:json-schema{:original-name "PrimitiveValue"}
 number?
 string?
 boolean?
 nil?]
)

(def ConditionalParameter_MarkPropFieldOrDatumDef_
  [:or
 #:json-schema{:original-name
               "ConditionalParameter<MarkPropFieldOrDatumDef>"}
 [:map
  {:closed true}
  [:scale
   {:json-schema/original-name "scale", :optional true}
   [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
  [:legend
   {:json-schema/original-name "legend", :optional true}
   [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
  [:field
   {:json-schema/original-name "field", :optional true}
   [:ref #:json-schema{:original-name "Field"} #'Field]]
  [:type
   {:json-schema/original-name "type", :optional true}
   [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
  [:empty
   {:json-schema/original-name "empty", :optional true}
   boolean?]
  [:param
   #:json-schema{:original-name "param"}
   [:ref
    #:json-schema{:original-name "ParameterName"}
    #'ParameterName]]
  [:title
   {:json-schema/original-name "title", :optional true}
   [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
  [:bin
   {:json-schema/original-name "bin", :optional true}
   [:or
    boolean?
    nil?
    [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
  [:bandPosition
   {:json-schema/original-name "bandPosition", :optional true}
   number?]
  [:timeUnit
   {:json-schema/original-name "timeUnit", :optional true}
   [:or
    [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
    [:ref
     #:json-schema{:original-name "BinnedTimeUnit"}
     #'BinnedTimeUnit]
    [:ref
     #:json-schema{:original-name "TimeUnitParams"}
     #'TimeUnitParams]]]
  [:aggregate
   {:json-schema/original-name "aggregate", :optional true}
   [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
  [:sort
   {:json-schema/original-name "sort", :optional true}
   [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
 [:map
  {:closed true}
  [:bandPosition
   {:json-schema/original-name "bandPosition", :optional true}
   number?]
  [:datum
   {:json-schema/original-name "datum", :optional true}
   [:or
    [:ref
     #:json-schema{:original-name "PrimitiveValue"}
     #'PrimitiveValue]
    [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
    [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
    [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
  [:empty
   {:json-schema/original-name "empty", :optional true}
   boolean?]
  [:legend
   {:json-schema/original-name "legend", :optional true}
   [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
  [:param
   #:json-schema{:original-name "param"}
   [:ref
    #:json-schema{:original-name "ParameterName"}
    #'ParameterName]]
  [:scale
   {:json-schema/original-name "scale", :optional true}
   [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
  [:title
   {:json-schema/original-name "title", :optional true}
   [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
  [:type
   {:json-schema/original-name "type", :optional true}
   [:ref #:json-schema{:original-name "Type"} #'Type]]]]
)

(def ConditionalPredicate_MarkPropFieldOrDatumDef_
  [:or
 #:json-schema{:original-name
               "ConditionalPredicate<MarkPropFieldOrDatumDef>"}
 [:map
  {:closed true}
  [:scale
   {:json-schema/original-name "scale", :optional true}
   [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
  [:legend
   {:json-schema/original-name "legend", :optional true}
   [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
  [:field
   {:json-schema/original-name "field", :optional true}
   [:ref #:json-schema{:original-name "Field"} #'Field]]
  [:type
   {:json-schema/original-name "type", :optional true}
   [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
  [:title
   {:json-schema/original-name "title", :optional true}
   [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
  [:bin
   {:json-schema/original-name "bin", :optional true}
   [:or
    boolean?
    nil?
    [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
  [:bandPosition
   {:json-schema/original-name "bandPosition", :optional true}
   number?]
  [:timeUnit
   {:json-schema/original-name "timeUnit", :optional true}
   [:or
    [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
    [:ref
     #:json-schema{:original-name "BinnedTimeUnit"}
     #'BinnedTimeUnit]
    [:ref
     #:json-schema{:original-name "TimeUnitParams"}
     #'TimeUnitParams]]]
  [:aggregate
   {:json-schema/original-name "aggregate", :optional true}
   [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:sort
   {:json-schema/original-name "sort", :optional true}
   [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
 [:map
  {:closed true}
  [:bandPosition
   {:json-schema/original-name "bandPosition", :optional true}
   number?]
  [:datum
   {:json-schema/original-name "datum", :optional true}
   [:or
    [:ref
     #:json-schema{:original-name "PrimitiveValue"}
     #'PrimitiveValue]
    [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
    [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
    [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
  [:legend
   {:json-schema/original-name "legend", :optional true}
   [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
  [:scale
   {:json-schema/original-name "scale", :optional true}
   [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:title
   {:json-schema/original-name "title", :optional true}
   [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
  [:type
   {:json-schema/original-name "type", :optional true}
   [:ref #:json-schema{:original-name "Type"} #'Type]]]]
)

(def ConditionalMarkPropFieldOrDatumDef
  [:or
 #:json-schema{:original-name "ConditionalMarkPropFieldOrDatumDef"}
 [:ref
  #:json-schema{:original-name
                "ConditionalPredicate<MarkPropFieldOrDatumDef>"}
  #'ConditionalPredicate_MarkPropFieldOrDatumDef_]
 [:ref
  #:json-schema{:original-name
                "ConditionalParameter<MarkPropFieldOrDatumDef>"}
  #'ConditionalParameter_MarkPropFieldOrDatumDef_]]
)

(def ValueDefWithCondition_MarkPropFieldOrDatumDef__Gradient_string_null__
  [:map
 {:closed true,
  :json-schema/original-name
  "ValueDefWithCondition<MarkPropFieldOrDatumDef,(Gradient|string|null)>"}
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "ConditionalMarkPropFieldOrDatumDef"}
    #'ConditionalMarkPropFieldOrDatumDef]
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
    #'ConditionalValueDef__Gradient_string_null_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
     #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   string?
   nil?]]]
)

(def FieldOrDatumDefWithCondition_DatumDef__Gradient_string_null__
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<DatumDef,(Gradient|string|null)>"}
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
    #'ConditionalValueDef__Gradient_string_null_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
     #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]
 [:datum
  {:json-schema/original-name "datum", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "PrimitiveValue"}
    #'PrimitiveValue]
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "Type"} #'Type]]]
)

(def MarkPropDef__Gradient_string_null__
  [:or
 #:json-schema{:original-name "MarkPropDef<(Gradient|string|null)>"}
 [:ref
  #:json-schema{:original-name
                "FieldOrDatumDefWithCondition<MarkPropFieldDef,(Gradient|string|null)>"}
  #'FieldOrDatumDefWithCondition_MarkPropFieldDef__Gradient_string_null__]
 [:ref
  #:json-schema{:original-name
                "FieldOrDatumDefWithCondition<DatumDef,(Gradient|string|null)>"}
  #'FieldOrDatumDefWithCondition_DatumDef__Gradient_string_null__]
 [:ref
  #:json-schema{:original-name
                "ValueDefWithCondition<MarkPropFieldOrDatumDef,(Gradient|string|null)>"}
  #'ValueDefWithCondition_MarkPropFieldOrDatumDef__Gradient_string_null__]]
)

(def ColorDef
  [:ref
 #:json-schema{:original-name "ColorDef"}
 #'MarkPropDef__Gradient_string_null__]
)

(def CompositionConfig
  [:map
 {:closed true, :json-schema/original-name "CompositionConfig"}
 [:columns
  {:json-schema/original-name "columns", :optional true}
  number?]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  number?]]
)

(def RowCol_number_
  [:map
 {:closed true, :json-schema/original-name "RowCol<number>"}
 [:column
  {:json-schema/original-name "column", :optional true}
  number?]
 [:row {:json-schema/original-name "row", :optional true} number?]]
)

(def InlineDataset
  [:or
 #:json-schema{:original-name "InlineDataset"}
 [:vector number?]
 [:vector string?]
 [:vector boolean?]
 [:vector [:map-of any? any?]]
 string?
 [:map-of any? any?]]
)

(def Parse
  [:map-of #:json-schema{:original-name "Parse"} any? any?]
)

(def CsvDataFormat
  [:map
 {:closed true, :json-schema/original-name "CsvDataFormat"}
 [:parse
  {:json-schema/original-name "parse", :optional true}
  [:or [:ref #:json-schema{:original-name "Parse"} #'Parse] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:enum "csv" "tsv"]]]
)

(def JsonDataFormat
  [:map
 {:closed true, :json-schema/original-name "JsonDataFormat"}
 [:parse
  {:json-schema/original-name "parse", :optional true}
  [:or [:ref #:json-schema{:original-name "Parse"} #'Parse] nil?]]
 [:property
  {:json-schema/original-name "property", :optional true}
  string?]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:= "json"]]]
)

(def TopoDataFormat
  [:map
 {:closed true, :json-schema/original-name "TopoDataFormat"}
 [:feature
  {:json-schema/original-name "feature", :optional true}
  string?]
 [:mesh {:json-schema/original-name "mesh", :optional true} string?]
 [:parse
  {:json-schema/original-name "parse", :optional true}
  [:or [:ref #:json-schema{:original-name "Parse"} #'Parse] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:= "topojson"]]]
)

(def DsvDataFormat
  [:map
 {:closed true, :json-schema/original-name "DsvDataFormat"}
 [:delimiter #:json-schema{:original-name "delimiter"} string?]
 [:parse
  {:json-schema/original-name "parse", :optional true}
  [:or [:ref #:json-schema{:original-name "Parse"} #'Parse] nil?]]
 [:type {:json-schema/original-name "type", :optional true} [:= "dsv"]]]
)

(def DataFormat
  [:or
 #:json-schema{:original-name "DataFormat"}
 [:ref #:json-schema{:original-name "CsvDataFormat"} #'CsvDataFormat]
 [:ref #:json-schema{:original-name "DsvDataFormat"} #'DsvDataFormat]
 [:ref #:json-schema{:original-name "JsonDataFormat"} #'JsonDataFormat]
 [:ref #:json-schema{:original-name "TopoDataFormat"} #'TopoDataFormat]]
)

(def InlineData
  [:map
 {:closed true, :json-schema/original-name "InlineData"}
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "DataFormat"} #'DataFormat]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:values
  #:json-schema{:original-name "values"}
  [:ref #:json-schema{:original-name "InlineDataset"} #'InlineDataset]]]
)

(def NamedData
  [:map
 {:closed true, :json-schema/original-name "NamedData"}
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "DataFormat"} #'DataFormat]]
 [:name #:json-schema{:original-name "name"} string?]]
)

(def UrlData
  [:map
 {:closed true, :json-schema/original-name "UrlData"}
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "DataFormat"} #'DataFormat]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:url #:json-schema{:original-name "url"} string?]]
)

(def DataSource
  [:or
 #:json-schema{:original-name "DataSource"}
 [:ref #:json-schema{:original-name "UrlData"} #'UrlData]
 [:ref #:json-schema{:original-name "InlineData"} #'InlineData]
 [:ref #:json-schema{:original-name "NamedData"} #'NamedData]]
)

(def Vector2_number_
  [:vector #:json-schema{:original-name "Vector2<number>"} number?]
)

(def Vector2_Vector2_number__
  [:vector
 #:json-schema{:original-name "Vector2<Vector2<number>>"}
 [:ref
  #:json-schema{:original-name "Vector2<number>"}
  #'Vector2_number_]]
)

(def GraticuleParams
  [:map
 {:closed true, :json-schema/original-name "GraticuleParams"}
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:ref
   #:json-schema{:original-name "Vector2<Vector2<number>>"}
   #'Vector2_Vector2_number__]]
 [:extentMajor
  {:json-schema/original-name "extentMajor", :optional true}
  [:ref
   #:json-schema{:original-name "Vector2<Vector2<number>>"}
   #'Vector2_Vector2_number__]]
 [:extentMinor
  {:json-schema/original-name "extentMinor", :optional true}
  [:ref
   #:json-schema{:original-name "Vector2<Vector2<number>>"}
   #'Vector2_Vector2_number__]]
 [:precision
  {:json-schema/original-name "precision", :optional true}
  number?]
 [:step
  {:json-schema/original-name "step", :optional true}
  [:ref
   #:json-schema{:original-name "Vector2<number>"}
   #'Vector2_number_]]
 [:stepMajor
  {:json-schema/original-name "stepMajor", :optional true}
  [:ref
   #:json-schema{:original-name "Vector2<number>"}
   #'Vector2_number_]]
 [:stepMinor
  {:json-schema/original-name "stepMinor", :optional true}
  [:ref
   #:json-schema{:original-name "Vector2<number>"}
   #'Vector2_number_]]]
)

(def GraticuleGenerator
  [:map
 {:closed true, :json-schema/original-name "GraticuleGenerator"}
 [:graticule
  #:json-schema{:original-name "graticule"}
  [:or
   [:ref
    #:json-schema{:original-name "GraticuleParams"}
    #'GraticuleParams]
   [:enum true]]]
 [:name {:json-schema/original-name "name", :optional true} string?]]
)

(def SequenceParams
  [:map
 {:closed true, :json-schema/original-name "SequenceParams"}
 [:as
  {:json-schema/original-name "as", :optional true}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:start #:json-schema{:original-name "start"} number?]
 [:step {:json-schema/original-name "step", :optional true} number?]
 [:stop #:json-schema{:original-name "stop"} number?]]
)

(def SequenceGenerator
  [:map
 {:closed true, :json-schema/original-name "SequenceGenerator"}
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:sequence
  #:json-schema{:original-name "sequence"}
  [:ref
   #:json-schema{:original-name "SequenceParams"}
   #'SequenceParams]]]
)

(def SphereGenerator
  [:map
 {:closed true, :json-schema/original-name "SphereGenerator"}
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:sphere
  #:json-schema{:original-name "sphere"}
  [:or [:map-of any? any?] [:enum true]]]]
)

(def Generator
  [:or
 #:json-schema{:original-name "Generator"}
 [:ref
  #:json-schema{:original-name "SequenceGenerator"}
  #'SequenceGenerator]
 [:ref
  #:json-schema{:original-name "SphereGenerator"}
  #'SphereGenerator]
 [:ref
  #:json-schema{:original-name "GraticuleGenerator"}
  #'GraticuleGenerator]]
)

(def Data
  [:or
 #:json-schema{:original-name "Data"}
 [:ref #:json-schema{:original-name "DataSource"} #'DataSource]
 [:ref #:json-schema{:original-name "Generator"} #'Generator]]
)

(def PivotTransform
  [:map
 {:closed true, :json-schema/original-name "PivotTransform"}
 [:groupby
  {:json-schema/original-name "groupby", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:limit {:json-schema/original-name "limit", :optional true} number?]
 [:op
  {:json-schema/original-name "op", :optional true}
  [:ref #:json-schema{:original-name "AggregateOp"} #'AggregateOp]]
 [:pivot
  #:json-schema{:original-name "pivot"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:value
  #:json-schema{:original-name "value"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
)

(def DensityTransform
  [:map
 {:closed true, :json-schema/original-name "DensityTransform"}
 [:maxsteps
  {:json-schema/original-name "maxsteps", :optional true}
  number?]
 [:cumulative
  {:json-schema/original-name "cumulative", :optional true}
  boolean?]
 [:counts
  {:json-schema/original-name "counts", :optional true}
  boolean?]
 [:as
  {:json-schema/original-name "as", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:steps {:json-schema/original-name "steps", :optional true} number?]
 [:bandwidth
  {:json-schema/original-name "bandwidth", :optional true}
  number?]
 [:minsteps
  {:json-schema/original-name "minsteps", :optional true}
  number?]
 [:groupby
  {:json-schema/original-name "groupby", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:vector number?]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:enum "independent" "shared"]]
 [:density
  #:json-schema{:original-name "density"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
)

(def FoldTransform
  [:map
 {:closed true, :json-schema/original-name "FoldTransform"}
 [:as
  {:json-schema/original-name "as", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:fold
  #:json-schema{:original-name "fold"}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]]
)

(def SortField
  [:map
 {:closed true, :json-schema/original-name "SortField"}
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SortOrder"} #'SortOrder]
   nil?]]]
)

(def WindowOnlyOp
  [:enum
 #:json-schema{:original-name "WindowOnlyOp"}
 "row_number"
 "rank"
 "dense_rank"
 "percent_rank"
 "cume_dist"
 "ntile"
 "lag"
 "lead"
 "first_value"
 "last_value"
 "nth_value"]
)

(def WindowFieldDef
  [:map
 {:closed true, :json-schema/original-name "WindowFieldDef"}
 [:as
  #:json-schema{:original-name "as"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:op
  #:json-schema{:original-name "op"}
  [:or
   [:ref #:json-schema{:original-name "AggregateOp"} #'AggregateOp]
   [:ref #:json-schema{:original-name "WindowOnlyOp"} #'WindowOnlyOp]]]
 [:param {:json-schema/original-name "param", :optional true} number?]]
)

(def WindowTransform
  [:map
 {:closed true, :json-schema/original-name "WindowTransform"}
 [:frame
  {:json-schema/original-name "frame", :optional true}
  [:vector [:or nil? number?]]]
 [:groupby
  {:json-schema/original-name "groupby", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:ignorePeers
  {:json-schema/original-name "ignorePeers", :optional true}
  boolean?]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "SortField"} #'SortField]]]
 [:window
  #:json-schema{:original-name "window"}
  [:vector
   [:ref
    #:json-schema{:original-name "WindowFieldDef"}
    #'WindowFieldDef]]]]
)

(def FilterTransform
  [:map
 {:closed true, :json-schema/original-name "FilterTransform"}
 [:filter
  #:json-schema{:original-name "filter"}
  [:ref
   #:json-schema{:original-name "PredicateComposition"}
   #'PredicateComposition]]]
)

(def ExtentTransform
  [:map
 {:closed true, :json-schema/original-name "ExtentTransform"}
 [:extent
  #:json-schema{:original-name "extent"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]]
)

(def FlattenTransform
  [:map
 {:closed true, :json-schema/original-name "FlattenTransform"}
 [:as
  {:json-schema/original-name "as", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:flatten
  #:json-schema{:original-name "flatten"}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]]
)

(def JoinAggregateFieldDef
  [:map
 {:closed true, :json-schema/original-name "JoinAggregateFieldDef"}
 [:as
  #:json-schema{:original-name "as"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:op
  #:json-schema{:original-name "op"}
  [:ref #:json-schema{:original-name "AggregateOp"} #'AggregateOp]]]
)

(def JoinAggregateTransform
  [:map
 {:closed true, :json-schema/original-name "JoinAggregateTransform"}
 [:groupby
  {:json-schema/original-name "groupby", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:joinaggregate
  #:json-schema{:original-name "joinaggregate"}
  [:vector
   [:ref
    #:json-schema{:original-name "JoinAggregateFieldDef"}
    #'JoinAggregateFieldDef]]]]
)

(def LookupData
  [:map
 {:closed true, :json-schema/original-name "LookupData"}
 [:data
  #:json-schema{:original-name "data"}
  [:ref #:json-schema{:original-name "Data"} #'Data]]
 [:fields
  {:json-schema/original-name "fields", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:key
  #:json-schema{:original-name "key"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
)

(def LookupSelection
  [:map
 {:closed true, :json-schema/original-name "LookupSelection"}
 [:fields
  {:json-schema/original-name "fields", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:key
  #:json-schema{:original-name "key"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]]
)

(def LookupTransform
  [:map
 {:closed true, :json-schema/original-name "LookupTransform"}
 [:as
  {:json-schema/original-name "as", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]
   [:vector
    [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]]
 [:default {:json-schema/original-name "default", :optional true} any?]
 [:from
  #:json-schema{:original-name "from"}
  [:or
   [:ref #:json-schema{:original-name "LookupData"} #'LookupData]
   [:ref
    #:json-schema{:original-name "LookupSelection"}
    #'LookupSelection]]]
 [:lookup #:json-schema{:original-name "lookup"} string?]]
)

(def LoessTransform
  [:map
 {:closed true, :json-schema/original-name "LoessTransform"}
 [:as
  {:json-schema/original-name "as", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:bandwidth
  {:json-schema/original-name "bandwidth", :optional true}
  number?]
 [:groupby
  {:json-schema/original-name "groupby", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:loess
  #:json-schema{:original-name "loess"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:on
  #:json-schema{:original-name "on"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
)

(def StackTransform
  [:map
 {:closed true, :json-schema/original-name "StackTransform"}
 [:as
  #:json-schema{:original-name "as"}
  [:or
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]
   [:vector
    [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]]
 [:groupby
  #:json-schema{:original-name "groupby"}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:offset
  {:json-schema/original-name "offset", :optional true}
  [:enum "zero" "center" "normalize"]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "SortField"} #'SortField]]]
 [:stack
  #:json-schema{:original-name "stack"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
)

(def QuantileTransform
  [:map
 {:closed true, :json-schema/original-name "QuantileTransform"}
 [:as
  {:json-schema/original-name "as", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:groupby
  {:json-schema/original-name "groupby", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:probs
  {:json-schema/original-name "probs", :optional true}
  [:vector number?]]
 [:quantile
  #:json-schema{:original-name "quantile"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:step {:json-schema/original-name "step", :optional true} number?]]
)

(def TimeUnitTransformParams
  [:map
 {:closed true, :json-schema/original-name "TimeUnitTransformParams"}
 [:maxbins
  {:json-schema/original-name "maxbins", :optional true}
  number?]
 [:step {:json-schema/original-name "step", :optional true} number?]
 [:unit
  {:json-schema/original-name "unit", :optional true}
  [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]]
 [:utc {:json-schema/original-name "utc", :optional true} boolean?]]
)

(def TimeUnitTransform
  [:map
 {:closed true, :json-schema/original-name "TimeUnitTransform"}
 [:as
  #:json-schema{:original-name "as"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:field
  #:json-schema{:original-name "field"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:timeUnit
  #:json-schema{:original-name "timeUnit"}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitTransformParams"}
    #'TimeUnitTransformParams]]]]
)

(def SampleTransform
  [:map
 {:closed true, :json-schema/original-name "SampleTransform"}
 [:sample #:json-schema{:original-name "sample"} number?]]
)

(def RegressionTransform
  [:map
 {:closed true, :json-schema/original-name "RegressionTransform"}
 [:as
  {:json-schema/original-name "as", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:vector number?]]
 [:groupby
  {:json-schema/original-name "groupby", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:method
  {:json-schema/original-name "method", :optional true}
  [:enum "linear" "log" "exp" "pow" "quad" "poly"]]
 [:on
  #:json-schema{:original-name "on"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:order {:json-schema/original-name "order", :optional true} number?]
 [:params
  {:json-schema/original-name "params", :optional true}
  boolean?]
 [:regression
  #:json-schema{:original-name "regression"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
)

(def ImputeMethod
  [:enum
 #:json-schema{:original-name "ImputeMethod"}
 "value"
 "median"
 "max"
 "min"
 "mean"]
)

(def ImputeSequence
  [:map
 {:closed true, :json-schema/original-name "ImputeSequence"}
 [:start {:json-schema/original-name "start", :optional true} number?]
 [:step {:json-schema/original-name "step", :optional true} number?]
 [:stop #:json-schema{:original-name "stop"} number?]]
)

(def ImputeTransform
  [:map
 {:closed true, :json-schema/original-name "ImputeTransform"}
 [:frame
  {:json-schema/original-name "frame", :optional true}
  [:vector [:or nil? number?]]]
 [:groupby
  {:json-schema/original-name "groupby", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:impute
  #:json-schema{:original-name "impute"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:key
  #:json-schema{:original-name "key"}
  [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]
 [:keyvals
  {:json-schema/original-name "keyvals", :optional true}
  [:or
   [:vector any?]
   [:ref
    #:json-schema{:original-name "ImputeSequence"}
    #'ImputeSequence]]]
 [:method
  {:json-schema/original-name "method", :optional true}
  [:ref #:json-schema{:original-name "ImputeMethod"} #'ImputeMethod]]
 [:value {:json-schema/original-name "value", :optional true} any?]]
)

(def Transform
  [:or
 #:json-schema{:original-name "Transform"}
 [:ref
  #:json-schema{:original-name "AggregateTransform"}
  #'AggregateTransform]
 [:ref #:json-schema{:original-name "BinTransform"} #'BinTransform]
 [:ref
  #:json-schema{:original-name "CalculateTransform"}
  #'CalculateTransform]
 [:ref
  #:json-schema{:original-name "DensityTransform"}
  #'DensityTransform]
 [:ref
  #:json-schema{:original-name "ExtentTransform"}
  #'ExtentTransform]
 [:ref
  #:json-schema{:original-name "FilterTransform"}
  #'FilterTransform]
 [:ref
  #:json-schema{:original-name "FlattenTransform"}
  #'FlattenTransform]
 [:ref #:json-schema{:original-name "FoldTransform"} #'FoldTransform]
 [:ref
  #:json-schema{:original-name "ImputeTransform"}
  #'ImputeTransform]
 [:ref
  #:json-schema{:original-name "JoinAggregateTransform"}
  #'JoinAggregateTransform]
 [:ref #:json-schema{:original-name "LoessTransform"} #'LoessTransform]
 [:ref
  #:json-schema{:original-name "LookupTransform"}
  #'LookupTransform]
 [:ref
  #:json-schema{:original-name "QuantileTransform"}
  #'QuantileTransform]
 [:ref
  #:json-schema{:original-name "RegressionTransform"}
  #'RegressionTransform]
 [:ref
  #:json-schema{:original-name "TimeUnitTransform"}
  #'TimeUnitTransform]
 [:ref
  #:json-schema{:original-name "SampleTransform"}
  #'SampleTransform]
 [:ref #:json-schema{:original-name "StackTransform"} #'StackTransform]
 [:ref
  #:json-schema{:original-name "WindowTransform"}
  #'WindowTransform]
 [:ref #:json-schema{:original-name "PivotTransform"} #'PivotTransform]]
)

(def ScaleResolveMap
  [:map
 {:closed true, :json-schema/original-name "ScaleResolveMap"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:yOffset
  {:json-schema/original-name "yOffset", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:xOffset
  {:json-schema/original-name "xOffset", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]]
)

(def LegendResolveMap
  [:map
 {:closed true, :json-schema/original-name "LegendResolveMap"}
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:ref #:json-schema{:original-name "ResolveMode"} #'ResolveMode]]]
)

(def Resolve
  [:map
 {:closed true, :json-schema/original-name "Resolve"}
 [:axis
  {:json-schema/original-name "axis", :optional true}
  [:ref
   #:json-schema{:original-name "AxisResolveMap"}
   #'AxisResolveMap]]
 [:legend
  {:json-schema/original-name "legend", :optional true}
  [:ref
   #:json-schema{:original-name "LegendResolveMap"}
   #'LegendResolveMap]]
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleResolveMap"}
   #'ScaleResolveMap]]]
)

(def TitleParams
  [:map
 {:closed true, :json-schema/original-name "TitleParams"}
 [:baseline
  {:json-schema/original-name "baseline", :optional true}
  [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:ref #:json-schema{:original-name "Align"} #'Align]]
 [:dx
  {:json-schema/original-name "dx", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:frame
  {:json-schema/original-name "frame", :optional true}
  [:or
   [:or
    [:ref #:json-schema{:original-name "TitleFrame"} #'TitleFrame]
    string?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitleFont
  {:json-schema/original-name "subtitleFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:limit
  {:json-schema/original-name "limit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:offset
  {:json-schema/original-name "offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitleFontStyle
  {:json-schema/original-name "subtitleFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:dy
  {:json-schema/original-name "dy", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TitleOrient"} #'TitleOrient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:font
  {:json-schema/original-name "font", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:style
  {:json-schema/original-name "style", :optional true}
  [:or string? [:vector string?]]]
 [:subtitleLineHeight
  {:json-schema/original-name "subtitleLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitle
  {:json-schema/original-name "subtitle", :optional true}
  [:ref #:json-schema{:original-name "Text"} #'Text]]
 [:fontStyle
  {:json-schema/original-name "fontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontWeight
  {:json-schema/original-name "fontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitleColor
  {:json-schema/original-name "subtitleColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:subtitlePadding
  {:json-schema/original-name "subtitlePadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lineHeight
  {:json-schema/original-name "lineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fontSize
  {:json-schema/original-name "fontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:anchor
  {:json-schema/original-name "anchor", :optional true}
  [:ref #:json-schema{:original-name "TitleAnchor"} #'TitleAnchor]]
 [:subtitleFontSize
  {:json-schema/original-name "subtitleFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:zindex
  {:json-schema/original-name "zindex", :optional true}
  number?]
 [:subtitleFontWeight
  {:json-schema/original-name "subtitleFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:text
  #:json-schema{:original-name "text"}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def HConcatSpec_GenericSpec_
  [:map
 {:closed true, :json-schema/original-name "HConcatSpec<GenericSpec>"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:hconcat
  #:json-schema{:original-name "hconcat"}
  [:vector [:ref #:json-schema{:original-name "Spec"} #'Spec]]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  boolean?]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  number?]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def NonNormalizedSpec
  [:ref #:json-schema{:original-name "NonNormalizedSpec"} #'Spec]
)

(def RepeatMapping
  [:map
 {:closed true, :json-schema/original-name "RepeatMapping"}
 [:column
  {:json-schema/original-name "column", :optional true}
  [:vector string?]]
 [:row
  {:json-schema/original-name "row", :optional true}
  [:vector string?]]]
)

(def RowCol_LayoutAlign_
  [:map
 {:closed true, :json-schema/original-name "RowCol<LayoutAlign>"}
 [:column
  {:json-schema/original-name "column", :optional true}
  [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]]
 [:row
  {:json-schema/original-name "row", :optional true}
  [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]]]
)

(def RowCol_boolean_
  [:map
 {:closed true, :json-schema/original-name "RowCol<boolean>"}
 [:column
  {:json-schema/original-name "column", :optional true}
  boolean?]
 [:row {:json-schema/original-name "row", :optional true} boolean?]]
)

(def NonLayerRepeatSpec
  [:map
 {:closed true, :json-schema/original-name "NonLayerRepeatSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref
    #:json-schema{:original-name "RowCol<LayoutAlign>"}
    #'RowCol_LayoutAlign_]]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:columns
  {:json-schema/original-name "columns", :optional true}
  number?]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "RowCol<boolean>"}
    #'RowCol_boolean_]]]
 [:spec
  #:json-schema{:original-name "spec"}
  [:ref
   #:json-schema{:original-name "NonNormalizedSpec"}
   #'NonNormalizedSpec]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:repeat
  #:json-schema{:original-name "repeat"}
  [:or
   [:vector string?]
   [:ref
    #:json-schema{:original-name "RepeatMapping"}
    #'RepeatMapping]]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RowCol<number>"}
    #'RowCol_number_]]]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def SecondaryFieldDef
  [:map
 {:closed true, :json-schema/original-name "SecondaryFieldDef"}
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:bin {:json-schema/original-name "bin", :optional true} nil?]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]]
)

(def ValueDef__number__width___height__ExprRef__
  [:map
 {:closed true,
  :json-schema/original-name
  "ValueDef<(number|\"width\"|\"height\"|ExprRef)>"}
 [:value
  #:json-schema{:original-name "value"}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:enum "width" "height"]]]]
)

(def PositionValueDef
  [:ref
 #:json-schema{:original-name "PositionValueDef"}
 #'ValueDef__number__width___height__ExprRef__]
)

(def DatumDef
  [:map
 {:closed true, :json-schema/original-name "DatumDef"}
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:datum
  {:json-schema/original-name "datum", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "PrimitiveValue"}
    #'PrimitiveValue]
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "Type"} #'Type]]]
)

(def Position2Def
  [:or
 #:json-schema{:original-name "Position2Def"}
 [:ref
  #:json-schema{:original-name "SecondaryFieldDef"}
  #'SecondaryFieldDef]
 [:ref #:json-schema{:original-name "DatumDef"} #'DatumDef]
 [:ref
  #:json-schema{:original-name "PositionValueDef"}
  #'PositionValueDef]]
)

(def ConditionalParameter_ValueDef__string_null_ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalParameter<ValueDef<(string|null|ExprRef)>>"}
 [:empty {:json-schema/original-name "empty", :optional true} boolean?]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   string?
   nil?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalPredicate_ValueDef__string_null_ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalPredicate<ValueDef<(string|null|ExprRef)>>"}
 [:test
  #:json-schema{:original-name "test"}
  [:ref
   #:json-schema{:original-name "PredicateComposition"}
   #'PredicateComposition]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   string?
   nil?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalValueDef__string_null_ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalValueDef<(string|null|ExprRef)>"}
 [:ref
  #:json-schema{:original-name
                "ConditionalPredicate<ValueDef<(string|null|ExprRef)>>"}
  #'ConditionalPredicate_ValueDef__string_null_ExprRef___]
 [:ref
  #:json-schema{:original-name
                "ConditionalParameter<ValueDef<(string|null|ExprRef)>>"}
  #'ConditionalParameter_ValueDef__string_null_ExprRef___]]
)

(def ValueDefWithCondition_MarkPropFieldOrDatumDef__string_null__
  [:map
 {:closed true,
  :json-schema/original-name
  "ValueDefWithCondition<MarkPropFieldOrDatumDef,(string|null)>"}
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "ConditionalMarkPropFieldOrDatumDef"}
    #'ConditionalMarkPropFieldOrDatumDef]
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(string|null|ExprRef)>"}
    #'ConditionalValueDef__string_null_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(string|null|ExprRef)>"}
     #'ConditionalValueDef__string_null_ExprRef__]]]]
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   string?
   nil?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def StringValueDefWithCondition
  [:ref
 #:json-schema{:original-name "StringValueDefWithCondition"}
 #'ValueDefWithCondition_MarkPropFieldOrDatumDef__string_null__]
)

(def ConditionalPredicate_ValueDef_number__
  [:map
 {:closed true,
  :json-schema/original-name "ConditionalPredicate<ValueDef<number>>"}
 [:test
  #:json-schema{:original-name "test"}
  [:ref
   #:json-schema{:original-name "PredicateComposition"}
   #'PredicateComposition]]
 [:value #:json-schema{:original-name "value"} number?]]
)

(def ConditionalParameter_ValueDef_number__
  [:map
 {:closed true,
  :json-schema/original-name "ConditionalParameter<ValueDef<number>>"}
 [:empty {:json-schema/original-name "empty", :optional true} boolean?]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:value #:json-schema{:original-name "value"} number?]]
)

(def ConditionalValueDef_number_
  [:or
 #:json-schema{:original-name "ConditionalValueDef<number>"}
 [:ref
  #:json-schema{:original-name
                "ConditionalPredicate<ValueDef<number>>"}
  #'ConditionalPredicate_ValueDef_number__]
 [:ref
  #:json-schema{:original-name
                "ConditionalParameter<ValueDef<number>>"}
  #'ConditionalParameter_ValueDef_number__]]
)

(def OrderValueDef
  [:map
 {:closed true, :json-schema/original-name "OrderValueDef"}
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "ConditionalValueDef<number>"}
    #'ConditionalValueDef_number_]
   [:vector
    [:ref
     #:json-schema{:original-name "ConditionalValueDef<number>"}
     #'ConditionalValueDef_number_]]]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalParameter_ValueDef__number___ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalParameter<ValueDef<(number[]|ExprRef)>>"}
 [:empty {:json-schema/original-name "empty", :optional true} boolean?]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalPredicate_ValueDef__number___ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalPredicate<ValueDef<(number[]|ExprRef)>>"}
 [:test
  #:json-schema{:original-name "test"}
  [:ref
   #:json-schema{:original-name "PredicateComposition"}
   #'PredicateComposition]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalValueDef__number___ExprRef__
  [:or
 #:json-schema{:original-name
               "ConditionalValueDef<(number[]|ExprRef)>"}
 [:ref
  #:json-schema{:original-name
                "ConditionalPredicate<ValueDef<(number[]|ExprRef)>>"}
  #'ConditionalPredicate_ValueDef__number___ExprRef___]
 [:ref
  #:json-schema{:original-name
                "ConditionalParameter<ValueDef<(number[]|ExprRef)>>"}
  #'ConditionalParameter_ValueDef__number___ExprRef___]]
)

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_number___
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<MarkPropFieldDef,number[]>"}
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:legend
  {:json-schema/original-name "legend", :optional true}
  [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(number[]|ExprRef)>"}
    #'ConditionalValueDef__number___ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(number[]|ExprRef)>"}
     #'ConditionalValueDef__number___ExprRef__]]]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
)

(def FieldOrDatumDefWithCondition_DatumDef_number___
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<DatumDef,number[]>"}
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(number[]|ExprRef)>"}
    #'ConditionalValueDef__number___ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(number[]|ExprRef)>"}
     #'ConditionalValueDef__number___ExprRef__]]]]
 [:datum
  {:json-schema/original-name "datum", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "PrimitiveValue"}
    #'PrimitiveValue]
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "Type"} #'Type]]]
)

(def ValueDefWithCondition_MarkPropFieldOrDatumDef_number___
  [:map
 {:closed true,
  :json-schema/original-name
  "ValueDefWithCondition<MarkPropFieldOrDatumDef,number[]>"}
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "ConditionalMarkPropFieldOrDatumDef"}
    #'ConditionalMarkPropFieldOrDatumDef]
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(number[]|ExprRef)>"}
    #'ConditionalValueDef__number___ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(number[]|ExprRef)>"}
     #'ConditionalValueDef__number___ExprRef__]]]]
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def MarkPropDef_number___
  [:or
 #:json-schema{:original-name "MarkPropDef<number[]>"}
 [:ref
  #:json-schema{:original-name
                "FieldOrDatumDefWithCondition<MarkPropFieldDef,number[]>"}
  #'FieldOrDatumDefWithCondition_MarkPropFieldDef_number___]
 [:ref
  #:json-schema{:original-name
                "FieldOrDatumDefWithCondition<DatumDef,number[]>"}
  #'FieldOrDatumDefWithCondition_DatumDef_number___]
 [:ref
  #:json-schema{:original-name
                "ValueDefWithCondition<MarkPropFieldOrDatumDef,number[]>"}
  #'ValueDefWithCondition_MarkPropFieldOrDatumDef_number___]]
)

(def NumericArrayMarkPropDef
  [:ref
 #:json-schema{:original-name "NumericArrayMarkPropDef"}
 #'MarkPropDef_number___]
)

(def ValueDef_number_
  [:map
 {:closed true, :json-schema/original-name "ValueDef<number>"}
 [:value #:json-schema{:original-name "value"} number?]]
)

(def ScaleFieldDef
  [:map
 {:closed true, :json-schema/original-name "ScaleFieldDef"}
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
)

(def ScaleDatumDef
  [:map
 {:closed true, :json-schema/original-name "ScaleDatumDef"}
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:datum
  {:json-schema/original-name "datum", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "PrimitiveValue"}
    #'PrimitiveValue]
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "Type"} #'Type]]]
)

(def OffsetDef
  [:or
 #:json-schema{:original-name "OffsetDef"}
 [:ref #:json-schema{:original-name "ScaleFieldDef"} #'ScaleFieldDef]
 [:ref #:json-schema{:original-name "ScaleDatumDef"} #'ScaleDatumDef]
 [:ref
  #:json-schema{:original-name "ValueDef<number>"}
  #'ValueDef_number_]]
)

(def ConditionalParameter_ValueDef__Text_ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalParameter<ValueDef<(Text|ExprRef)>>"}
 [:empty {:json-schema/original-name "empty", :optional true} boolean?]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalPredicate_ValueDef__Text_ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalPredicate<ValueDef<(Text|ExprRef)>>"}
 [:test
  #:json-schema{:original-name "test"}
  [:ref
   #:json-schema{:original-name "PredicateComposition"}
   #'PredicateComposition]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalValueDef__Text_ExprRef__
  [:or
 #:json-schema{:original-name "ConditionalValueDef<(Text|ExprRef)>"}
 [:ref
  #:json-schema{:original-name
                "ConditionalPredicate<ValueDef<(Text|ExprRef)>>"}
  #'ConditionalPredicate_ValueDef__Text_ExprRef___]
 [:ref
  #:json-schema{:original-name
                "ConditionalParameter<ValueDef<(Text|ExprRef)>>"}
  #'ConditionalParameter_ValueDef__Text_ExprRef___]]
)

(def FieldOrDatumDefWithCondition_StringDatumDef_Text_
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<StringDatumDef,Text>"}
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "ConditionalValueDef<(Text|ExprRef)>"}
    #'ConditionalValueDef__Text_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(Text|ExprRef)>"}
     #'ConditionalValueDef__Text_ExprRef__]]]]
 [:datum
  {:json-schema/original-name "datum", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "PrimitiveValue"}
    #'PrimitiveValue]
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "Type"} #'Type]]]
)

(def FieldOrDatumDefWithCondition_StringFieldDef_Text_
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<StringFieldDef,Text>"}
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "ConditionalValueDef<(Text|ExprRef)>"}
    #'ConditionalValueDef__Text_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(Text|ExprRef)>"}
     #'ConditionalValueDef__Text_ExprRef__]]]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
   [:enum "binned"]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]
)

(def ConditionalParameter_StringFieldDef_
  [:map
 {:closed true,
  :json-schema/original-name "ConditionalParameter<StringFieldDef>"}
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:empty {:json-schema/original-name "empty", :optional true} boolean?]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
   [:enum "binned"]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]
)

(def ConditionalPredicate_StringFieldDef_
  [:map
 {:closed true,
  :json-schema/original-name "ConditionalPredicate<StringFieldDef>"}
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
   [:enum "binned"]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:test
  #:json-schema{:original-name "test"}
  [:ref
   #:json-schema{:original-name "PredicateComposition"}
   #'PredicateComposition]]]
)

(def ConditionalStringFieldDef
  [:or
 #:json-schema{:original-name "ConditionalStringFieldDef"}
 [:ref
  #:json-schema{:original-name "ConditionalPredicate<StringFieldDef>"}
  #'ConditionalPredicate_StringFieldDef_]
 [:ref
  #:json-schema{:original-name "ConditionalParameter<StringFieldDef>"}
  #'ConditionalParameter_StringFieldDef_]]
)

(def ValueDefWithCondition_StringFieldDef_Text_
  [:map
 {:closed true,
  :json-schema/original-name
  "ValueDefWithCondition<StringFieldDef,Text>"}
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "ConditionalStringFieldDef"}
    #'ConditionalStringFieldDef]
   [:ref
    #:json-schema{:original-name "ConditionalValueDef<(Text|ExprRef)>"}
    #'ConditionalValueDef__Text_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(Text|ExprRef)>"}
     #'ConditionalValueDef__Text_ExprRef__]]]]
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def TextDef
  [:or
 #:json-schema{:original-name "TextDef"}
 [:ref
  #:json-schema{:original-name
                "FieldOrDatumDefWithCondition<StringFieldDef,Text>"}
  #'FieldOrDatumDefWithCondition_StringFieldDef_Text_]
 [:ref
  #:json-schema{:original-name
                "FieldOrDatumDefWithCondition<StringDatumDef,Text>"}
  #'FieldOrDatumDefWithCondition_StringDatumDef_Text_]
 [:ref
  #:json-schema{:original-name
                "ValueDefWithCondition<StringFieldDef,Text>"}
  #'ValueDefWithCondition_StringFieldDef_Text_]]
)

(def TypedFieldDef
  [:map
 {:closed true, :json-schema/original-name "TypedFieldDef"}
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
   [:enum "binned"]]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]]
)

(def FieldDefWithoutScale
  [:ref
 #:json-schema{:original-name "FieldDefWithoutScale"}
 #'TypedFieldDef]
)

(def OrderOnlyDef
  [:map
 {:closed true, :json-schema/original-name "OrderOnlyDef"}
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:ref #:json-schema{:original-name "SortOrder"} #'SortOrder]]]
)

(def ConditionalParameter_ValueDef__number_ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalParameter<ValueDef<(number|ExprRef)>>"}
 [:empty {:json-schema/original-name "empty", :optional true} boolean?]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalPredicate_ValueDef__number_ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalPredicate<ValueDef<(number|ExprRef)>>"}
 [:test
  #:json-schema{:original-name "test"}
  [:ref
   #:json-schema{:original-name "PredicateComposition"}
   #'PredicateComposition]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalValueDef__number_ExprRef__
  [:or
 #:json-schema{:original-name "ConditionalValueDef<(number|ExprRef)>"}
 [:ref
  #:json-schema{:original-name
                "ConditionalPredicate<ValueDef<(number|ExprRef)>>"}
  #'ConditionalPredicate_ValueDef__number_ExprRef___]
 [:ref
  #:json-schema{:original-name
                "ConditionalParameter<ValueDef<(number|ExprRef)>>"}
  #'ConditionalParameter_ValueDef__number_ExprRef___]]
)

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_number_
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<MarkPropFieldDef,number>"}
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:legend
  {:json-schema/original-name "legend", :optional true}
  [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(number|ExprRef)>"}
    #'ConditionalValueDef__number_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(number|ExprRef)>"}
     #'ConditionalValueDef__number_ExprRef__]]]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
)

(def ValueDefWithCondition_MarkPropFieldOrDatumDef_number_
  [:map
 {:closed true,
  :json-schema/original-name
  "ValueDefWithCondition<MarkPropFieldOrDatumDef,number>"}
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "ConditionalMarkPropFieldOrDatumDef"}
    #'ConditionalMarkPropFieldOrDatumDef]
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(number|ExprRef)>"}
    #'ConditionalValueDef__number_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(number|ExprRef)>"}
     #'ConditionalValueDef__number_ExprRef__]]]]
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def FieldOrDatumDefWithCondition_DatumDef_number_
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<DatumDef,number>"}
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(number|ExprRef)>"}
    #'ConditionalValueDef__number_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(number|ExprRef)>"}
     #'ConditionalValueDef__number_ExprRef__]]]]
 [:datum
  {:json-schema/original-name "datum", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "PrimitiveValue"}
    #'PrimitiveValue]
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "Type"} #'Type]]]
)

(def MarkPropDef_number_
  [:or
 #:json-schema{:original-name "MarkPropDef<number>"}
 [:ref
  #:json-schema{:original-name
                "FieldOrDatumDefWithCondition<MarkPropFieldDef,number>"}
  #'FieldOrDatumDefWithCondition_MarkPropFieldDef_number_]
 [:ref
  #:json-schema{:original-name
                "FieldOrDatumDefWithCondition<DatumDef,number>"}
  #'FieldOrDatumDefWithCondition_DatumDef_number_]
 [:ref
  #:json-schema{:original-name
                "ValueDefWithCondition<MarkPropFieldOrDatumDef,number>"}
  #'ValueDefWithCondition_MarkPropFieldOrDatumDef_number_]]
)

(def NumericMarkPropDef
  [:ref
 #:json-schema{:original-name "NumericMarkPropDef"}
 #'MarkPropDef_number_]
)

(def StackOffset
  [:enum
 #:json-schema{:original-name "StackOffset"}
 "zero"
 "center"
 "normalize"]
)

(def PositionDatumDefBase
  [:map
 {:closed true, :json-schema/original-name "PositionDatumDefBase"}
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:datum
  {:json-schema/original-name "datum", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "PrimitiveValue"}
    #'PrimitiveValue]
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:stack
  {:json-schema/original-name "stack", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StackOffset"} #'StackOffset]
   nil?
   boolean?]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "Type"} #'Type]]]
)

(def PositionFieldDefBase
  [:map
 {:closed true, :json-schema/original-name "PositionFieldDefBase"}
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
   [:enum "binned"]]]
 [:stack
  {:json-schema/original-name "stack", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StackOffset"} #'StackOffset]
   nil?
   boolean?]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
)

(def PolarDef
  [:or
 #:json-schema{:original-name "PolarDef"}
 [:ref
  #:json-schema{:original-name "PositionFieldDefBase"}
  #'PositionFieldDefBase]
 [:ref
  #:json-schema{:original-name "PositionDatumDefBase"}
  #'PositionDatumDefBase]
 [:ref
  #:json-schema{:original-name "PositionValueDef"}
  #'PositionValueDef]]
)

(def LatLongFieldDef
  [:map
 {:closed true, :json-schema/original-name "LatLongFieldDef"}
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:bin {:json-schema/original-name "bin", :optional true} nil?]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:= "quantitative"]]]
)

(def LatLongDef
  [:or
 #:json-schema{:original-name "LatLongDef"}
 [:ref
  #:json-schema{:original-name "LatLongFieldDef"}
  #'LatLongFieldDef]
 [:ref #:json-schema{:original-name "DatumDef"} #'DatumDef]]
)

(def TimeFieldDef
  [:map
 {:closed true, :json-schema/original-name "TimeFieldDef"}
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:rescale
  {:json-schema/original-name "rescale", :optional true}
  boolean?]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
)

(def TimeDef
  [:ref #:json-schema{:original-name "TimeDef"} #'TimeFieldDef]
)

(def ConditionalParameter_ValueDef__string_ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalParameter<ValueDef<(string|ExprRef)>>"}
 [:empty {:json-schema/original-name "empty", :optional true} boolean?]
 [:param
  #:json-schema{:original-name "param"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalPredicate_ValueDef__string_ExprRef___
  [:map
 {:closed true,
  :json-schema/original-name
  "ConditionalPredicate<ValueDef<(string|ExprRef)>>"}
 [:test
  #:json-schema{:original-name "test"}
  [:ref
   #:json-schema{:original-name "PredicateComposition"}
   #'PredicateComposition]]
 [:value
  #:json-schema{:original-name "value"}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ConditionalValueDef__string_ExprRef__
  [:or
 #:json-schema{:original-name "ConditionalValueDef<(string|ExprRef)>"}
 [:ref
  #:json-schema{:original-name
                "ConditionalPredicate<ValueDef<(string|ExprRef)>>"}
  #'ConditionalPredicate_ValueDef__string_ExprRef___]
 [:ref
  #:json-schema{:original-name
                "ConditionalParameter<ValueDef<(string|ExprRef)>>"}
  #'ConditionalParameter_ValueDef__string_ExprRef___]]
)

(def FieldOrDatumDefWithCondition_StringFieldDef_string_
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<StringFieldDef,string>"}
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(string|ExprRef)>"}
    #'ConditionalValueDef__string_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(string|ExprRef)>"}
     #'ConditionalValueDef__string_ExprRef__]]]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
   [:enum "binned"]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]
)

(def StringFieldDefWithCondition
  [:ref
 #:json-schema{:original-name "StringFieldDefWithCondition"}
 #'FieldOrDatumDefWithCondition_StringFieldDef_string_]
)

(def OrderFieldDef
  [:map
 {:closed true, :json-schema/original-name "OrderFieldDef"}
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
   [:enum "binned"]]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:ref #:json-schema{:original-name "SortOrder"} #'SortOrder]]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]]
)

(def StringFieldDef
  [:map
 {:closed true, :json-schema/original-name "StringFieldDef"}
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
   [:enum "binned"]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]
)

(def TypeForShape
  [:enum
 #:json-schema{:original-name "TypeForShape"}
 "nominal"
 "ordinal"
 "geojson"]
)

(def ConditionalParameter_MarkPropFieldOrDatumDef_TypeForShape__
  [:or
 #:json-schema{:original-name
               "ConditionalParameter<MarkPropFieldOrDatumDef<TypeForShape>>"}
 [:map
  {:closed true}
  [:scale
   {:json-schema/original-name "scale", :optional true}
   [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
  [:legend
   {:json-schema/original-name "legend", :optional true}
   [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
  [:field
   {:json-schema/original-name "field", :optional true}
   [:ref #:json-schema{:original-name "Field"} #'Field]]
  [:type
   {:json-schema/original-name "type", :optional true}
   [:ref #:json-schema{:original-name "TypeForShape"} #'TypeForShape]]
  [:empty
   {:json-schema/original-name "empty", :optional true}
   boolean?]
  [:param
   #:json-schema{:original-name "param"}
   [:ref
    #:json-schema{:original-name "ParameterName"}
    #'ParameterName]]
  [:title
   {:json-schema/original-name "title", :optional true}
   [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
  [:bin
   {:json-schema/original-name "bin", :optional true}
   [:or
    boolean?
    nil?
    [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
  [:bandPosition
   {:json-schema/original-name "bandPosition", :optional true}
   number?]
  [:timeUnit
   {:json-schema/original-name "timeUnit", :optional true}
   [:or
    [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
    [:ref
     #:json-schema{:original-name "BinnedTimeUnit"}
     #'BinnedTimeUnit]
    [:ref
     #:json-schema{:original-name "TimeUnitParams"}
     #'TimeUnitParams]]]
  [:aggregate
   {:json-schema/original-name "aggregate", :optional true}
   [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
  [:sort
   {:json-schema/original-name "sort", :optional true}
   [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
 [:map
  {:closed true}
  [:bandPosition
   {:json-schema/original-name "bandPosition", :optional true}
   number?]
  [:datum
   {:json-schema/original-name "datum", :optional true}
   [:or
    [:ref
     #:json-schema{:original-name "PrimitiveValue"}
     #'PrimitiveValue]
    [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
    [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
    [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
  [:empty
   {:json-schema/original-name "empty", :optional true}
   boolean?]
  [:legend
   {:json-schema/original-name "legend", :optional true}
   [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
  [:param
   #:json-schema{:original-name "param"}
   [:ref
    #:json-schema{:original-name "ParameterName"}
    #'ParameterName]]
  [:scale
   {:json-schema/original-name "scale", :optional true}
   [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
  [:title
   {:json-schema/original-name "title", :optional true}
   [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
  [:type
   {:json-schema/original-name "type", :optional true}
   [:ref #:json-schema{:original-name "Type"} #'Type]]]]
)

(def ConditionalPredicate_MarkPropFieldOrDatumDef_TypeForShape__
  [:or
 #:json-schema{:original-name
               "ConditionalPredicate<MarkPropFieldOrDatumDef<TypeForShape>>"}
 [:map
  {:closed true}
  [:scale
   {:json-schema/original-name "scale", :optional true}
   [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
  [:legend
   {:json-schema/original-name "legend", :optional true}
   [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
  [:field
   {:json-schema/original-name "field", :optional true}
   [:ref #:json-schema{:original-name "Field"} #'Field]]
  [:type
   {:json-schema/original-name "type", :optional true}
   [:ref #:json-schema{:original-name "TypeForShape"} #'TypeForShape]]
  [:title
   {:json-schema/original-name "title", :optional true}
   [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
  [:bin
   {:json-schema/original-name "bin", :optional true}
   [:or
    boolean?
    nil?
    [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
  [:bandPosition
   {:json-schema/original-name "bandPosition", :optional true}
   number?]
  [:timeUnit
   {:json-schema/original-name "timeUnit", :optional true}
   [:or
    [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
    [:ref
     #:json-schema{:original-name "BinnedTimeUnit"}
     #'BinnedTimeUnit]
    [:ref
     #:json-schema{:original-name "TimeUnitParams"}
     #'TimeUnitParams]]]
  [:aggregate
   {:json-schema/original-name "aggregate", :optional true}
   [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:sort
   {:json-schema/original-name "sort", :optional true}
   [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
 [:map
  {:closed true}
  [:bandPosition
   {:json-schema/original-name "bandPosition", :optional true}
   number?]
  [:datum
   {:json-schema/original-name "datum", :optional true}
   [:or
    [:ref
     #:json-schema{:original-name "PrimitiveValue"}
     #'PrimitiveValue]
    [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
    [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
    [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
  [:legend
   {:json-schema/original-name "legend", :optional true}
   [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
  [:scale
   {:json-schema/original-name "scale", :optional true}
   [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
  [:test
   #:json-schema{:original-name "test"}
   [:ref
    #:json-schema{:original-name "PredicateComposition"}
    #'PredicateComposition]]
  [:title
   {:json-schema/original-name "title", :optional true}
   [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
  [:type
   {:json-schema/original-name "type", :optional true}
   [:ref #:json-schema{:original-name "Type"} #'Type]]]]
)

(def ConditionalMarkPropFieldOrDatumDef_TypeForShape_
  [:or
 #:json-schema{:original-name
               "ConditionalMarkPropFieldOrDatumDef<TypeForShape>"}
 [:ref
  #:json-schema{:original-name
                "ConditionalPredicate<MarkPropFieldOrDatumDef<TypeForShape>>"}
  #'ConditionalPredicate_MarkPropFieldOrDatumDef_TypeForShape__]
 [:ref
  #:json-schema{:original-name
                "ConditionalParameter<MarkPropFieldOrDatumDef<TypeForShape>>"}
  #'ConditionalParameter_MarkPropFieldOrDatumDef_TypeForShape__]]
)

(def ValueDefWithCondition_MarkPropFieldOrDatumDef_TypeForShape___string_null__
  [:map
 {:closed true,
  :json-schema/original-name
  "ValueDefWithCondition<MarkPropFieldOrDatumDef<TypeForShape>,(string|null)>"}
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name
                  "ConditionalMarkPropFieldOrDatumDef<TypeForShape>"}
    #'ConditionalMarkPropFieldOrDatumDef_TypeForShape_]
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(string|null|ExprRef)>"}
    #'ConditionalValueDef__string_null_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(string|null|ExprRef)>"}
     #'ConditionalValueDef__string_null_ExprRef__]]]]
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   string?
   nil?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def FieldOrDatumDefWithCondition_DatumDef__string_null__
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<DatumDef,(string|null)>"}
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(string|null|ExprRef)>"}
    #'ConditionalValueDef__string_null_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(string|null|ExprRef)>"}
     #'ConditionalValueDef__string_null_ExprRef__]]]]
 [:datum
  {:json-schema/original-name "datum", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "PrimitiveValue"}
    #'PrimitiveValue]
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "Type"} #'Type]]]
)

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_TypeForShape___string_null__
  [:map
 {:closed true,
  :json-schema/original-name
  "FieldOrDatumDefWithCondition<MarkPropFieldDef<TypeForShape>,(string|null)>"}
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:legend
  {:json-schema/original-name "legend", :optional true}
  [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "TypeForShape"} #'TypeForShape]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:condition
  {:json-schema/original-name "condition", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name
                  "ConditionalValueDef<(string|null|ExprRef)>"}
    #'ConditionalValueDef__string_null_ExprRef__]
   [:vector
    [:ref
     #:json-schema{:original-name
                   "ConditionalValueDef<(string|null|ExprRef)>"}
     #'ConditionalValueDef__string_null_ExprRef__]]]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
)

(def MarkPropDef__string_null__TypeForShape_
  [:or
 #:json-schema{:original-name
               "MarkPropDef<(string|null),TypeForShape>"}
 [:ref
  #:json-schema{:original-name
                "FieldOrDatumDefWithCondition<MarkPropFieldDef<TypeForShape>,(string|null)>"}
  #'FieldOrDatumDefWithCondition_MarkPropFieldDef_TypeForShape___string_null__]
 [:ref
  #:json-schema{:original-name
                "FieldOrDatumDefWithCondition<DatumDef,(string|null)>"}
  #'FieldOrDatumDefWithCondition_DatumDef__string_null__]
 [:ref
  #:json-schema{:original-name
                "ValueDefWithCondition<MarkPropFieldOrDatumDef<TypeForShape>,(string|null)>"}
  #'ValueDefWithCondition_MarkPropFieldOrDatumDef_TypeForShape___string_null__]]
)

(def ShapeDef
  [:ref
 #:json-schema{:original-name "ShapeDef"}
 #'MarkPropDef__string_null__TypeForShape_]
)

(def ImputeParams
  [:map
 {:closed true, :json-schema/original-name "ImputeParams"}
 [:frame
  {:json-schema/original-name "frame", :optional true}
  [:vector [:or nil? number?]]]
 [:keyvals
  {:json-schema/original-name "keyvals", :optional true}
  [:or
   [:vector any?]
   [:ref
    #:json-schema{:original-name "ImputeSequence"}
    #'ImputeSequence]]]
 [:method
  {:json-schema/original-name "method", :optional true}
  [:ref #:json-schema{:original-name "ImputeMethod"} #'ImputeMethod]]
 [:value {:json-schema/original-name "value", :optional true} any?]]
)

(def PositionFieldDef
  [:map
 {:closed true, :json-schema/original-name "PositionFieldDef"}
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:impute
  {:json-schema/original-name "impute", :optional true}
  [:or
   [:ref #:json-schema{:original-name "ImputeParams"} #'ImputeParams]
   nil?]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
   [:enum "binned"]]]
 [:stack
  {:json-schema/original-name "stack", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StackOffset"} #'StackOffset]
   nil?
   boolean?]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:axis
  {:json-schema/original-name "axis", :optional true}
  [:or [:ref #:json-schema{:original-name "Axis"} #'Axis] nil?]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:ref #:json-schema{:original-name "Sort"} #'Sort]]]
)

(def PositionDatumDef
  [:map
 {:closed true, :json-schema/original-name "PositionDatumDef"}
 [:axis
  {:json-schema/original-name "axis", :optional true}
  [:or [:ref #:json-schema{:original-name "Axis"} #'Axis] nil?]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:datum
  {:json-schema/original-name "datum", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "PrimitiveValue"}
    #'PrimitiveValue]
   [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
 [:impute
  {:json-schema/original-name "impute", :optional true}
  [:or
   [:ref #:json-schema{:original-name "ImputeParams"} #'ImputeParams]
   nil?]]
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
 [:stack
  {:json-schema/original-name "stack", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StackOffset"} #'StackOffset]
   nil?
   boolean?]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "Type"} #'Type]]]
)

(def PositionDef
  [:or
 #:json-schema{:original-name "PositionDef"}
 [:ref
  #:json-schema{:original-name "PositionFieldDef"}
  #'PositionFieldDef]
 [:ref
  #:json-schema{:original-name "PositionDatumDef"}
  #'PositionDatumDef]
 [:ref
  #:json-schema{:original-name "PositionValueDef"}
  #'PositionValueDef]]
)

(def Encoding
  [:map
 {:closed true, :json-schema/original-name "Encoding"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:ref #:json-schema{:original-name "PositionDef"} #'PositionDef]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "StringFieldDefWithCondition"}
    #'StringFieldDefWithCondition]
   [:ref
    #:json-schema{:original-name "StringValueDefWithCondition"}
    #'StringValueDefWithCondition]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:xError2
  {:json-schema/original-name "xError2", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "SecondaryFieldDef"}
    #'SecondaryFieldDef]
   [:ref
    #:json-schema{:original-name "ValueDef<number>"}
    #'ValueDef_number_]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:ref #:json-schema{:original-name "ColorDef"} #'ColorDef]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:ref #:json-schema{:original-name "ColorDef"} #'ColorDef]]
 [:key
  {:json-schema/original-name "key", :optional true}
  [:ref
   #:json-schema{:original-name "FieldDefWithoutScale"}
   #'FieldDefWithoutScale]]
 [:longitude2
  {:json-schema/original-name "longitude2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:ref #:json-schema{:original-name "ColorDef"} #'ColorDef]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:ref
   #:json-schema{:original-name "NumericArrayMarkPropDef"}
   #'NumericArrayMarkPropDef]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:ref #:json-schema{:original-name "TimeDef"} #'TimeDef]]
 [:longitude
  {:json-schema/original-name "longitude", :optional true}
  [:ref #:json-schema{:original-name "LatLongDef"} #'LatLongDef]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:ref #:json-schema{:original-name "PolarDef"} #'PolarDef]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:ref #:json-schema{:original-name "PolarDef"} #'PolarDef]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:yError
  {:json-schema/original-name "yError", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "SecondaryFieldDef"}
    #'SecondaryFieldDef]
   [:ref
    #:json-schema{:original-name "ValueDef<number>"}
    #'ValueDef_number_]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:ref #:json-schema{:original-name "ShapeDef"} #'ShapeDef]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "StringFieldDefWithCondition"}
    #'StringFieldDefWithCondition]
   [:ref
    #:json-schema{:original-name "StringValueDefWithCondition"}
    #'StringValueDefWithCondition]]]
 [:latitude
  {:json-schema/original-name "latitude", :optional true}
  [:ref #:json-schema{:original-name "LatLongDef"} #'LatLongDef]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or
   [:ref #:json-schema{:original-name "OrderFieldDef"} #'OrderFieldDef]
   [:ref #:json-schema{:original-name "OrderValueDef"} #'OrderValueDef]
   [:ref #:json-schema{:original-name "OrderOnlyDef"} #'OrderOnlyDef]
   [:vector
    [:ref
     #:json-schema{:original-name "OrderFieldDef"}
     #'OrderFieldDef]]]]
 [:xError
  {:json-schema/original-name "xError", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "SecondaryFieldDef"}
    #'SecondaryFieldDef]
   [:ref
    #:json-schema{:original-name "ValueDef<number>"}
    #'ValueDef_number_]]]
 [:yError2
  {:json-schema/original-name "yError2", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "SecondaryFieldDef"}
    #'SecondaryFieldDef]
   [:ref
    #:json-schema{:original-name "ValueDef<number>"}
    #'ValueDef_number_]]]
 [:yOffset
  {:json-schema/original-name "yOffset", :optional true}
  [:ref #:json-schema{:original-name "OffsetDef"} #'OffsetDef]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:ref #:json-schema{:original-name "PositionDef"} #'PositionDef]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:latitude2
  {:json-schema/original-name "latitude2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "StringFieldDefWithCondition"}
    #'StringFieldDefWithCondition]
   [:ref
    #:json-schema{:original-name "StringValueDefWithCondition"}
    #'StringValueDefWithCondition]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "StringFieldDefWithCondition"}
    #'StringFieldDefWithCondition]
   [:ref
    #:json-schema{:original-name "StringValueDefWithCondition"}
    #'StringValueDefWithCondition]
   [:vector
    [:ref
     #:json-schema{:original-name "StringFieldDef"}
     #'StringFieldDef]]
   nil?]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:ref #:json-schema{:original-name "TextDef"} #'TextDef]]
 [:xOffset
  {:json-schema/original-name "xOffset", :optional true}
  [:ref #:json-schema{:original-name "OffsetDef"} #'OffsetDef]]
 [:detail
  {:json-schema/original-name "detail", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "FieldDefWithoutScale"}
    #'FieldDefWithoutScale]
   [:vector
    [:ref
     #:json-schema{:original-name "FieldDefWithoutScale"}
     #'FieldDefWithoutScale]]]]]
)

(def Dict_SelectionInitInterval_
  [:map-of
 #:json-schema{:original-name "Dict<SelectionInitInterval>"}
 any?
 any?]
)

(def SelectionInitIntervalMapping
  [:ref
 #:json-schema{:original-name "SelectionInitIntervalMapping"}
 #'Dict_SelectionInitInterval_]
)

(def Expr
  [:and #:json-schema{:original-name "Expr"} string?]
)

(def EventType
  [:enum
 #:json-schema{:original-name "EventType"}
 "click"
 "dblclick"
 "dragenter"
 "dragleave"
 "dragover"
 "keydown"
 "keypress"
 "keyup"
 "mousedown"
 "mousemove"
 "mouseout"
 "mouseover"
 "mouseup"
 "mousewheel"
 "pointerdown"
 "pointermove"
 "pointerout"
 "pointerover"
 "pointerup"
 "timer"
 "touchend"
 "touchmove"
 "touchstart"
 "wheel"]
)

(def MarkType
  [:enum
 #:json-schema{:original-name "MarkType"}
 "arc"
 "area"
 "image"
 "group"
 "line"
 "path"
 "rect"
 "rule"
 "shape"
 "symbol"
 "text"
 "trail"]
)

(def WindowEventType
  [:or
 #:json-schema{:original-name "WindowEventType"}
 [:ref #:json-schema{:original-name "EventType"} #'EventType]
 string?]
)

(def EventStream
  [:or
 #:json-schema{:original-name "EventStream"}
 [:map
  {:closed true}
  [:markname
   {:json-schema/original-name "markname", :optional true}
   string?]
  [:debounce
   {:json-schema/original-name "debounce", :optional true}
   number?]
  [:consume
   {:json-schema/original-name "consume", :optional true}
   boolean?]
  [:between
   {:json-schema/original-name "between", :optional true}
   [:vector [:ref #:json-schema{:original-name "Stream"} #'Stream]]]
  [:type
   #:json-schema{:original-name "type"}
   [:ref #:json-schema{:original-name "EventType"} #'EventType]]
  [:source
   {:json-schema/original-name "source", :optional true}
   [:enum "view" "scope"]]
  [:filter
   {:json-schema/original-name "filter", :optional true}
   [:or
    [:ref #:json-schema{:original-name "Expr"} #'Expr]
    [:vector [:ref #:json-schema{:original-name "Expr"} #'Expr]]]]
  [:marktype
   {:json-schema/original-name "marktype", :optional true}
   [:ref #:json-schema{:original-name "MarkType"} #'MarkType]]
  [:throttle
   {:json-schema/original-name "throttle", :optional true}
   number?]]
 [:map
  {:closed true}
  [:markname
   {:json-schema/original-name "markname", :optional true}
   string?]
  [:debounce
   {:json-schema/original-name "debounce", :optional true}
   number?]
  [:consume
   {:json-schema/original-name "consume", :optional true}
   boolean?]
  [:between
   {:json-schema/original-name "between", :optional true}
   [:vector [:ref #:json-schema{:original-name "Stream"} #'Stream]]]
  [:type
   #:json-schema{:original-name "type"}
   [:ref
    #:json-schema{:original-name "WindowEventType"}
    #'WindowEventType]]
  [:source #:json-schema{:original-name "source"} [:= "window"]]
  [:filter
   {:json-schema/original-name "filter", :optional true}
   [:or
    [:ref #:json-schema{:original-name "Expr"} #'Expr]
    [:vector [:ref #:json-schema{:original-name "Expr"} #'Expr]]]]
  [:marktype
   {:json-schema/original-name "marktype", :optional true}
   [:ref #:json-schema{:original-name "MarkType"} #'MarkType]]
  [:throttle
   {:json-schema/original-name "throttle", :optional true}
   number?]]]
)

(def DerivedStream
  [:map
 {:closed true, :json-schema/original-name "DerivedStream"}
 [:between
  {:json-schema/original-name "between", :optional true}
  [:vector [:ref #:json-schema{:original-name "Stream"} #'Stream]]]
 [:consume
  {:json-schema/original-name "consume", :optional true}
  boolean?]
 [:debounce
  {:json-schema/original-name "debounce", :optional true}
  number?]
 [:filter
  {:json-schema/original-name "filter", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Expr"} #'Expr]
   [:vector [:ref #:json-schema{:original-name "Expr"} #'Expr]]]]
 [:markname
  {:json-schema/original-name "markname", :optional true}
  string?]
 [:marktype
  {:json-schema/original-name "marktype", :optional true}
  [:ref #:json-schema{:original-name "MarkType"} #'MarkType]]
 [:stream
  #:json-schema{:original-name "stream"}
  [:ref #:json-schema{:original-name "Stream"} #'Stream]]
 [:throttle
  {:json-schema/original-name "throttle", :optional true}
  number?]]
)

(def MergedStream
  [:map
 {:closed true, :json-schema/original-name "MergedStream"}
 [:between
  {:json-schema/original-name "between", :optional true}
  [:vector [:ref #:json-schema{:original-name "Stream"} #'Stream]]]
 [:consume
  {:json-schema/original-name "consume", :optional true}
  boolean?]
 [:debounce
  {:json-schema/original-name "debounce", :optional true}
  number?]
 [:filter
  {:json-schema/original-name "filter", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Expr"} #'Expr]
   [:vector [:ref #:json-schema{:original-name "Expr"} #'Expr]]]]
 [:markname
  {:json-schema/original-name "markname", :optional true}
  string?]
 [:marktype
  {:json-schema/original-name "marktype", :optional true}
  [:ref #:json-schema{:original-name "MarkType"} #'MarkType]]
 [:merge
  #:json-schema{:original-name "merge"}
  [:vector [:ref #:json-schema{:original-name "Stream"} #'Stream]]]
 [:throttle
  {:json-schema/original-name "throttle", :optional true}
  number?]]
)

(def Stream
  [:or
 #:json-schema{:original-name "Stream"}
 [:ref #:json-schema{:original-name "EventStream"} #'EventStream]
 [:ref #:json-schema{:original-name "DerivedStream"} #'DerivedStream]
 [:ref #:json-schema{:original-name "MergedStream"} #'MergedStream]]
)

(def LegendStreamBinding
  [:map
 {:closed true, :json-schema/original-name "LegendStreamBinding"}
 [:legend
  #:json-schema{:original-name "legend"}
  [:or string? [:ref #:json-schema{:original-name "Stream"} #'Stream]]]]
)

(def LegendBinding
  [:or
 #:json-schema{:original-name "LegendBinding"}
 [:ref
  #:json-schema{:original-name "LegendStreamBinding"}
  #'LegendStreamBinding]
 [:enum "legend"]]
)

(def SelectionResolution
  [:enum
 #:json-schema{:original-name "SelectionResolution"}
 "global"
 "union"
 "intersect"]
)

(def IntervalSelectionConfig
  [:map
 {:closed true, :json-schema/original-name "IntervalSelectionConfig"}
 [:zoom
  {:json-schema/original-name "zoom", :optional true}
  [:or string? boolean?]]
 [:mark
  {:json-schema/original-name "mark", :optional true}
  [:ref #:json-schema{:original-name "BrushConfig"} #'BrushConfig]]
 [:fields
  {:json-schema/original-name "fields", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:type #:json-schema{:original-name "type"} [:= "interval"]]
 [:encodings
  {:json-schema/original-name "encodings", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "SingleDefUnitChannel"}
    #'SingleDefUnitChannel]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref
   #:json-schema{:original-name "SelectionResolution"}
   #'SelectionResolution]]
 [:translate
  {:json-schema/original-name "translate", :optional true}
  [:or string? boolean?]]
 [:on
  {:json-schema/original-name "on", :optional true}
  [:or [:ref #:json-schema{:original-name "Stream"} #'Stream] string?]]
 [:clear
  {:json-schema/original-name "clear", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Stream"} #'Stream]
   string?
   boolean?]]]
)

(def PointSelectionConfig
  [:map
 {:closed true, :json-schema/original-name "PointSelectionConfig"}
 [:clear
  {:json-schema/original-name "clear", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Stream"} #'Stream]
   string?
   boolean?]]
 [:encodings
  {:json-schema/original-name "encodings", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "SingleDefUnitChannel"}
    #'SingleDefUnitChannel]]]
 [:fields
  {:json-schema/original-name "fields", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:nearest
  {:json-schema/original-name "nearest", :optional true}
  boolean?]
 [:on
  {:json-schema/original-name "on", :optional true}
  [:or [:ref #:json-schema{:original-name "Stream"} #'Stream] string?]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref
   #:json-schema{:original-name "SelectionResolution"}
   #'SelectionResolution]]
 [:toggle
  {:json-schema/original-name "toggle", :optional true}
  [:or string? boolean?]]
 [:type #:json-schema{:original-name "type"} [:= "point"]]]
)

(def SelectionInit
  [:or
 #:json-schema{:original-name "SelectionInit"}
 [:ref #:json-schema{:original-name "PrimitiveValue"} #'PrimitiveValue]
 [:ref #:json-schema{:original-name "DateTime"} #'DateTime]]
)

(def SelectionType
  [:enum #:json-schema{:original-name "SelectionType"} "point" "interval"]
)

(def Dict_SelectionInit_
  [:map-of #:json-schema{:original-name "Dict<SelectionInit>"} any? any?]
)

(def SelectionInitMapping
  [:ref
 #:json-schema{:original-name "SelectionInitMapping"}
 #'Dict_SelectionInit_]
)

(def SelectionParameter
  [:map
 {:closed true, :json-schema/original-name "SelectionParameter"}
 [:bind
  {:json-schema/original-name "bind", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Binding"} #'Binding]
   [:ref #:json-schema{:original-name "LegendBinding"} #'LegendBinding]
   [:map-of any? any?]
   [:enum "scales"]]]
 [:name
  #:json-schema{:original-name "name"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:select
  #:json-schema{:original-name "select"}
  [:or
   [:ref #:json-schema{:original-name "SelectionType"} #'SelectionType]
   [:ref
    #:json-schema{:original-name "PointSelectionConfig"}
    #'PointSelectionConfig]
   [:ref
    #:json-schema{:original-name "IntervalSelectionConfig"}
    #'IntervalSelectionConfig]]]
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SelectionInit"} #'SelectionInit]
   [:ref
    #:json-schema{:original-name "SelectionInitIntervalMapping"}
    #'SelectionInitIntervalMapping]
   [:vector
    [:ref
     #:json-schema{:original-name "SelectionInitMapping"}
     #'SelectionInitMapping]]]]]
)

(def ProjectionType
  [:enum
 #:json-schema{:original-name "ProjectionType"}
 "albers"
 "albersUsa"
 "azimuthalEqualArea"
 "azimuthalEquidistant"
 "conicConformal"
 "conicEqualArea"
 "conicEquidistant"
 "equalEarth"
 "equirectangular"
 "gnomonic"
 "identity"
 "mercator"
 "naturalEarth1"
 "orthographic"
 "stereographic"
 "transverseMercator"]
)

(def Vector3_number_
  [:vector #:json-schema{:original-name "Vector3<number>"} number?]
)

(def GeoJsonProperties
  [:or
 #:json-schema{:original-name "GeoJsonProperties"}
 [:map-of any? any?]
 nil?]
)

(def Position
  [:vector #:json-schema{:original-name "Position"} number?]
)

(def Polygon
  [:map
 {:closed true, :json-schema/original-name "Polygon"}
 [:bbox
  {:json-schema/original-name "bbox", :optional true}
  [:ref #:json-schema{:original-name "BBox"} #'BBox]]
 [:coordinates
  #:json-schema{:original-name "coordinates"}
  [:vector
   [:vector
    [:ref #:json-schema{:original-name "Position"} #'Position]]]]
 [:type #:json-schema{:original-name "type"} [:= "Polygon"]]]
)

(def LineString
  [:map
 {:closed true, :json-schema/original-name "LineString"}
 [:bbox
  {:json-schema/original-name "bbox", :optional true}
  [:ref #:json-schema{:original-name "BBox"} #'BBox]]
 [:coordinates
  #:json-schema{:original-name "coordinates"}
  [:vector [:ref #:json-schema{:original-name "Position"} #'Position]]]
 [:type #:json-schema{:original-name "type"} [:= "LineString"]]]
)

(def GeometryCollection
  [:map
 {:closed true, :json-schema/original-name "GeometryCollection"}
 [:bbox
  {:json-schema/original-name "bbox", :optional true}
  [:ref #:json-schema{:original-name "BBox"} #'BBox]]
 [:geometries
  #:json-schema{:original-name "geometries"}
  [:vector [:ref #:json-schema{:original-name "Geometry"} #'Geometry]]]
 [:type #:json-schema{:original-name "type"} [:= "GeometryCollection"]]]
)

(def Point
  [:map
 {:closed true, :json-schema/original-name "Point"}
 [:bbox
  {:json-schema/original-name "bbox", :optional true}
  [:ref #:json-schema{:original-name "BBox"} #'BBox]]
 [:coordinates
  #:json-schema{:original-name "coordinates"}
  [:ref #:json-schema{:original-name "Position"} #'Position]]
 [:type #:json-schema{:original-name "type"} [:= "Point"]]]
)

(def MultiPolygon
  [:map
 {:closed true, :json-schema/original-name "MultiPolygon"}
 [:bbox
  {:json-schema/original-name "bbox", :optional true}
  [:ref #:json-schema{:original-name "BBox"} #'BBox]]
 [:coordinates
  #:json-schema{:original-name "coordinates"}
  [:vector
   [:vector
    [:vector
     [:ref #:json-schema{:original-name "Position"} #'Position]]]]]
 [:type #:json-schema{:original-name "type"} [:= "MultiPolygon"]]]
)

(def MultiLineString
  [:map
 {:closed true, :json-schema/original-name "MultiLineString"}
 [:bbox
  {:json-schema/original-name "bbox", :optional true}
  [:ref #:json-schema{:original-name "BBox"} #'BBox]]
 [:coordinates
  #:json-schema{:original-name "coordinates"}
  [:vector
   [:vector
    [:ref #:json-schema{:original-name "Position"} #'Position]]]]
 [:type #:json-schema{:original-name "type"} [:= "MultiLineString"]]]
)

(def MultiPoint
  [:map
 {:closed true, :json-schema/original-name "MultiPoint"}
 [:bbox
  {:json-schema/original-name "bbox", :optional true}
  [:ref #:json-schema{:original-name "BBox"} #'BBox]]
 [:coordinates
  #:json-schema{:original-name "coordinates"}
  [:vector [:ref #:json-schema{:original-name "Position"} #'Position]]]
 [:type #:json-schema{:original-name "type"} [:= "MultiPoint"]]]
)

(def Geometry
  [:or
 #:json-schema{:original-name "Geometry"}
 [:ref #:json-schema{:original-name "Point"} #'Point]
 [:ref #:json-schema{:original-name "MultiPoint"} #'MultiPoint]
 [:ref #:json-schema{:original-name "LineString"} #'LineString]
 [:ref
  #:json-schema{:original-name "MultiLineString"}
  #'MultiLineString]
 [:ref #:json-schema{:original-name "Polygon"} #'Polygon]
 [:ref #:json-schema{:original-name "MultiPolygon"} #'MultiPolygon]
 [:ref
  #:json-schema{:original-name "GeometryCollection"}
  #'GeometryCollection]]
)

(def Feature
  [:map
 {:closed true, :json-schema/original-name "Feature"}
 [:bbox
  {:json-schema/original-name "bbox", :optional true}
  [:ref #:json-schema{:original-name "BBox"} #'BBox]]
 [:geometry
  #:json-schema{:original-name "geometry"}
  [:ref #:json-schema{:original-name "Geometry"} #'Geometry]]
 [:id
  {:json-schema/original-name "id", :optional true}
  [:or string? number?]]
 [:properties
  #:json-schema{:original-name "properties"}
  [:ref
   #:json-schema{:original-name "GeoJsonProperties"}
   #'GeoJsonProperties]]
 [:type #:json-schema{:original-name "type"} [:= "Feature"]]]
)

(def GeoJsonFeature
  [:ref #:json-schema{:original-name "GeoJsonFeature"} #'Feature]
)

(def Feature_Geometry_GeoJsonProperties_
  [:map
 {:closed true,
  :json-schema/original-name "Feature<Geometry,GeoJsonProperties>"}
 [:bbox
  {:json-schema/original-name "bbox", :optional true}
  [:ref #:json-schema{:original-name "BBox"} #'BBox]]
 [:geometry
  #:json-schema{:original-name "geometry"}
  [:ref #:json-schema{:original-name "Geometry"} #'Geometry]]
 [:id
  {:json-schema/original-name "id", :optional true}
  [:or string? number?]]
 [:properties
  #:json-schema{:original-name "properties"}
  [:ref
   #:json-schema{:original-name "GeoJsonProperties"}
   #'GeoJsonProperties]]
 [:type #:json-schema{:original-name "type"} [:= "Feature"]]]
)

(def FeatureCollection
  [:map
 {:closed true, :json-schema/original-name "FeatureCollection"}
 [:bbox
  {:json-schema/original-name "bbox", :optional true}
  [:ref #:json-schema{:original-name "BBox"} #'BBox]]
 [:features
  #:json-schema{:original-name "features"}
  [:vector
   [:ref
    #:json-schema{:original-name "Feature<Geometry,GeoJsonProperties>"}
    #'Feature_Geometry_GeoJsonProperties_]]]
 [:type #:json-schema{:original-name "type"} [:= "FeatureCollection"]]]
)

(def GeoJsonFeatureCollection
  [:ref
 #:json-schema{:original-name "GeoJsonFeatureCollection"}
 #'FeatureCollection]
)

(def Fit
  [:or
 #:json-schema{:original-name "Fit"}
 [:ref #:json-schema{:original-name "GeoJsonFeature"} #'GeoJsonFeature]
 [:ref
  #:json-schema{:original-name "GeoJsonFeatureCollection"}
  #'GeoJsonFeatureCollection]
 [:vector
  [:ref
   #:json-schema{:original-name "GeoJsonFeature"}
   #'GeoJsonFeature]]]
)

(def Projection
  [:map
 {:closed true, :json-schema/original-name "Projection"}
 [:clipExtent
  {:json-schema/original-name "clipExtent", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "Vector2<Vector2<number>>"}
    #'Vector2_Vector2_number__]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:reflectY
  {:json-schema/original-name "reflectY", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fit
  {:json-schema/original-name "fit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Fit"} #'Fit]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   [:vector [:ref #:json-schema{:original-name "Fit"} #'Fit]]]]
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:parallel
  {:json-schema/original-name "parallel", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fraction
  {:json-schema/original-name "fraction", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:precision
  {:json-schema/original-name "precision", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "ProjectionType"}
    #'ProjectionType]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tilt
  {:json-schema/original-name "tilt", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "Vector2<number>"}
    #'Vector2_number_]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:clipAngle
  {:json-schema/original-name "clipAngle", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "Vector2<number>"}
    #'Vector2_number_]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:pointRadius
  {:json-schema/original-name "pointRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:lobes
  {:json-schema/original-name "lobes", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:ratio
  {:json-schema/original-name "ratio", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "Vector2<Vector2<number>>"}
    #'Vector2_Vector2_number__]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:coefficient
  {:json-schema/original-name "coefficient", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:translate
  {:json-schema/original-name "translate", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "Vector2<number>"}
    #'Vector2_number_]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:rotate
  {:json-schema/original-name "rotate", :optional true}
  [:or
   [:or
    [:ref
     #:json-schema{:original-name "Vector2<number>"}
     #'Vector2_number_]
    [:ref
     #:json-schema{:original-name "Vector3<number>"}
     #'Vector3_number_]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:distance
  {:json-schema/original-name "distance", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:parallels
  {:json-schema/original-name "parallels", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:reflectX
  {:json-schema/original-name "reflectX", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def StepFor
  [:enum #:json-schema{:original-name "StepFor"} "position" "offset"]
)

(def Step
  [:map
 {:closed true, :json-schema/original-name "Step"}
 [:for
  {:json-schema/original-name "for", :optional true}
  [:ref #:json-schema{:original-name "StepFor"} #'StepFor]]
 [:step #:json-schema{:original-name "step"} number?]]
)

(def ViewBackground
  [:map
 {:closed true, :json-schema/original-name "ViewBackground"}
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:ref #:json-schema{:original-name "Cursor"} #'Cursor]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeMiterLimit
  {:json-schema/original-name "strokeMiterLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:style
  {:json-schema/original-name "style", :optional true}
  [:or string? [:vector string?]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeJoin
  {:json-schema/original-name "strokeJoin", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeJoin"} #'StrokeJoin]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeCap
  {:json-schema/original-name "strokeCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def UnitSpecWithFrame
  [:map
 {:closed true, :json-schema/original-name "UnitSpecWithFrame"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:encoding
  {:json-schema/original-name "encoding", :optional true}
  [:ref #:json-schema{:original-name "Encoding"} #'Encoding]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:mark
  #:json-schema{:original-name "mark"}
  [:ref #:json-schema{:original-name "AnyMark"} #'AnyMark]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "Step"} #'Step]
   [:enum "container"]]]
 [:params
  {:json-schema/original-name "params", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "SelectionParameter"}
    #'SelectionParameter]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:projection
  {:json-schema/original-name "projection", :optional true}
  [:ref #:json-schema{:original-name "Projection"} #'Projection]]
 [:view
  {:json-schema/original-name "view", :optional true}
  [:ref
   #:json-schema{:original-name "ViewBackground"}
   #'ViewBackground]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "Step"} #'Step]
   [:enum "container"]]]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def SharedEncoding
  [:map
 {:closed true, :json-schema/original-name "SharedEncoding"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:impute
    {:json-schema/original-name "impute", :optional true}
    [:or
     [:ref #:json-schema{:original-name "ImputeParams"} #'ImputeParams]
     nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:enum "width" "height"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
     [:enum "binned"]]]
   [:stack
    {:json-schema/original-name "stack", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StackOffset"} #'StackOffset]
     nil?
     boolean?]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:axis
    {:json-schema/original-name "axis", :optional true}
    [:or [:ref #:json-schema{:original-name "Axis"} #'Axis] nil?]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:map
   {:closed true}
   [:format
    {:json-schema/original-name "format", :optional true}
    [:ref #:json-schema{:original-name "Format"} #'Format]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     string?
     nil?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:formatType
    {:json-schema/original-name "formatType", :optional true}
    string?]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(string|ExprRef)>"}
       #'ConditionalValueDef__string_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(string|ExprRef)>"}
        #'ConditionalValueDef__string_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(string|null|ExprRef)>"}
       #'ConditionalValueDef__string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(string|null|ExprRef)>"}
        #'ConditionalValueDef__string_null_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
     [:enum "binned"]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:xError2
  {:json-schema/original-name "xError2", :optional true}
  [:map
   {:closed true}
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    number?]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     string?
     nil?]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
       #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
        #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
       #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
        #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     string?
     nil?]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
       #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
        #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
       #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
        #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:key
  {:json-schema/original-name "key", :optional true}
  [:map
   {:closed true}
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
     [:enum "binned"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref
     #:json-schema{:original-name "StandardType"}
     #'StandardType]]]]
 [:longitude2
  {:json-schema/original-name "longitude2", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:enum "width" "height"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref #:json-schema{:original-name "Type"} #'Type]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     string?
     nil?]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
       #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
        #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
       #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(Gradient|string|null|ExprRef)>"}
        #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     [:vector number?]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number[]|ExprRef)>"}
       #'ConditionalValueDef__number___ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number[]|ExprRef)>"}
        #'ConditionalValueDef__number___ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number[]|ExprRef)>"}
       #'ConditionalValueDef__number___ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number[]|ExprRef)>"}
        #'ConditionalValueDef__number___ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:map
   {:closed true}
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:rescale
    {:json-schema/original-name "rescale", :optional true}
    boolean?]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:longitude
  {:json-schema/original-name "longitude", :optional true}
  [:map
   {:closed true}
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "Type"} #'Type]
     [:enum "quantitative"]]]]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:enum "width" "height"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
     [:enum "binned"]]]
   [:stack
    {:json-schema/original-name "stack", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StackOffset"} #'StackOffset]
     nil?
     boolean?]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:enum "width" "height"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
     [:enum "binned"]]]
   [:stack
    {:json-schema/original-name "stack", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StackOffset"} #'StackOffset]
     nil?
     boolean?]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:enum "width" "height"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref #:json-schema{:original-name "Type"} #'Type]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:yError
  {:json-schema/original-name "yError", :optional true}
  [:map
   {:closed true}
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    number?]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(number|ExprRef)>"}
       #'ConditionalValueDef__number_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(number|ExprRef)>"}
        #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     string?
     nil?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:legend
    {:json-schema/original-name "legend", :optional true}
    [:or [:ref #:json-schema{:original-name "Legend"} #'Legend] nil?]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TypeForShape"} #'TypeForShape]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(string|null|ExprRef)>"}
       #'ConditionalValueDef__string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(string|null|ExprRef)>"}
        #'ConditionalValueDef__string_null_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef<TypeForShape>"}
       #'ConditionalMarkPropFieldOrDatumDef_TypeForShape_]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(string|null|ExprRef)>"}
       #'ConditionalValueDef__string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(string|null|ExprRef)>"}
        #'ConditionalValueDef__string_null_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:map
   {:closed true}
   [:format
    {:json-schema/original-name "format", :optional true}
    [:ref #:json-schema{:original-name "Format"} #'Format]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     string?
     nil?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:formatType
    {:json-schema/original-name "formatType", :optional true}
    string?]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(string|ExprRef)>"}
       #'ConditionalValueDef__string_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(string|ExprRef)>"}
        #'ConditionalValueDef__string_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(string|null|ExprRef)>"}
       #'ConditionalValueDef__string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(string|null|ExprRef)>"}
        #'ConditionalValueDef__string_null_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
     [:enum "binned"]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]]
 [:latitude
  {:json-schema/original-name "latitude", :optional true}
  [:map
   {:closed true}
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "Type"} #'Type]
     [:enum "quantitative"]]]]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or
   [:ref #:json-schema{:original-name "OrderFieldDef"} #'OrderFieldDef]
   [:ref #:json-schema{:original-name "OrderValueDef"} #'OrderValueDef]
   [:ref #:json-schema{:original-name "OrderOnlyDef"} #'OrderOnlyDef]
   [:vector
    [:ref
     #:json-schema{:original-name "OrderFieldDef"}
     #'OrderFieldDef]]]]
 [:xError
  {:json-schema/original-name "xError", :optional true}
  [:map
   {:closed true}
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    number?]]]
 [:yError2
  {:json-schema/original-name "yError2", :optional true}
  [:map
   {:closed true}
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    number?]]]
 [:yOffset
  {:json-schema/original-name "yOffset", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    number?]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:impute
    {:json-schema/original-name "impute", :optional true}
    [:or
     [:ref #:json-schema{:original-name "ImputeParams"} #'ImputeParams]
     nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:enum "width" "height"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
     [:enum "binned"]]]
   [:stack
    {:json-schema/original-name "stack", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StackOffset"} #'StackOffset]
     nil?
     boolean?]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:axis
    {:json-schema/original-name "axis", :optional true}
    [:or [:ref #:json-schema{:original-name "Axis"} #'Axis] nil?]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:enum "width" "height"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref #:json-schema{:original-name "Type"} #'Type]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:enum "width" "height"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref #:json-schema{:original-name "Type"} #'Type]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:enum "width" "height"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref #:json-schema{:original-name "Type"} #'Type]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]]
 [:latitude2
  {:json-schema/original-name "latitude2", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     number?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:enum "width" "height"]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref #:json-schema{:original-name "Type"} #'Type]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin {:json-schema/original-name "bin", :optional true} nil?]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:map
   {:closed true}
   [:format
    {:json-schema/original-name "format", :optional true}
    [:ref #:json-schema{:original-name "Format"} #'Format]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     string?
     nil?
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:formatType
    {:json-schema/original-name "formatType", :optional true}
    string?]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(string|ExprRef)>"}
       #'ConditionalValueDef__string_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(string|ExprRef)>"}
        #'ConditionalValueDef__string_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalMarkPropFieldOrDatumDef"}
       #'ConditionalMarkPropFieldOrDatumDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(string|null|ExprRef)>"}
       #'ConditionalValueDef__string_null_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(string|null|ExprRef)>"}
        #'ConditionalValueDef__string_null_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
     [:enum "binned"]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "StringFieldDefWithCondition"}
    #'StringFieldDefWithCondition]
   [:ref
    #:json-schema{:original-name "StringValueDefWithCondition"}
    #'StringValueDefWithCondition]
   [:vector
    [:ref
     #:json-schema{:original-name "StringFieldDef"}
     #'StringFieldDef]]
   nil?]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:format
    {:json-schema/original-name "format", :optional true}
    [:ref #:json-schema{:original-name "Format"} #'Format]]
   [:value
    {:json-schema/original-name "value", :optional true}
    [:or
     [:ref #:json-schema{:original-name "Text"} #'Text]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:formatType
    {:json-schema/original-name "formatType", :optional true}
    string?]
   [:condition
    {:json-schema/original-name "condition", :optional true}
    [:or
     [:or
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(Text|ExprRef)>"}
       #'ConditionalValueDef__Text_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(Text|ExprRef)>"}
        #'ConditionalValueDef__Text_ExprRef__]]]
     [:or
      [:ref
       #:json-schema{:original-name "ConditionalStringFieldDef"}
       #'ConditionalStringFieldDef]
      [:ref
       #:json-schema{:original-name
                     "ConditionalValueDef<(Text|ExprRef)>"}
       #'ConditionalValueDef__Text_ExprRef__]
      [:vector
       [:ref
        #:json-schema{:original-name
                      "ConditionalValueDef<(Text|ExprRef)>"}
        #'ConditionalValueDef__Text_ExprRef__]]]]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]
     [:enum "binned"]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]]]
 [:xOffset
  {:json-schema/original-name "xOffset", :optional true}
  [:map
   {:closed true}
   [:datum
    {:json-schema/original-name "datum", :optional true}
    [:or
     [:ref
      #:json-schema{:original-name "PrimitiveValue"}
      #'PrimitiveValue]
     [:ref #:json-schema{:original-name "DateTime"} #'DateTime]
     [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
     [:ref #:json-schema{:original-name "RepeatRef"} #'RepeatRef]]]
   [:scale
    {:json-schema/original-name "scale", :optional true}
    [:or [:ref #:json-schema{:original-name "Scale"} #'Scale] nil?]]
   [:value
    {:json-schema/original-name "value", :optional true}
    number?]
   [:field
    {:json-schema/original-name "field", :optional true}
    [:ref #:json-schema{:original-name "Field"} #'Field]]
   [:type
    {:json-schema/original-name "type", :optional true}
    [:or
     [:ref #:json-schema{:original-name "StandardType"} #'StandardType]
     [:ref #:json-schema{:original-name "Type"} #'Type]]]
   [:title
    {:json-schema/original-name "title", :optional true}
    [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
   [:bin
    {:json-schema/original-name "bin", :optional true}
    [:or
     boolean?
     nil?
     [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
   [:bandPosition
    {:json-schema/original-name "bandPosition", :optional true}
    number?]
   [:timeUnit
    {:json-schema/original-name "timeUnit", :optional true}
    [:or
     [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
     [:ref
      #:json-schema{:original-name "BinnedTimeUnit"}
      #'BinnedTimeUnit]
     [:ref
      #:json-schema{:original-name "TimeUnitParams"}
      #'TimeUnitParams]]]
   [:aggregate
    {:json-schema/original-name "aggregate", :optional true}
    [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
   [:sort
    {:json-schema/original-name "sort", :optional true}
    [:ref #:json-schema{:original-name "Sort"} #'Sort]]]]
 [:detail
  {:json-schema/original-name "detail", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "FieldDefWithoutScale"}
    #'FieldDefWithoutScale]
   [:vector
    [:ref
     #:json-schema{:original-name "FieldDefWithoutScale"}
     #'FieldDefWithoutScale]]]]]
)

(def GenericUnitSpec_Encoding_AnyMark_
  [:map
 {:closed true,
  :json-schema/original-name "GenericUnitSpec<Encoding,AnyMark>"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:encoding
  {:json-schema/original-name "encoding", :optional true}
  [:ref #:json-schema{:original-name "Encoding"} #'Encoding]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:mark
  #:json-schema{:original-name "mark"}
  [:ref #:json-schema{:original-name "AnyMark"} #'AnyMark]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:params
  {:json-schema/original-name "params", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "SelectionParameter"}
    #'SelectionParameter]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:projection
  {:json-schema/original-name "projection", :optional true}
  [:ref #:json-schema{:original-name "Projection"} #'Projection]]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def UnitSpec
  [:ref
 #:json-schema{:original-name "UnitSpec"}
 #'GenericUnitSpec_Encoding_AnyMark_]
)

(def LayerSpec
  [:map
 {:closed true, :json-schema/original-name "LayerSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:encoding
  {:json-schema/original-name "encoding", :optional true}
  [:ref
   #:json-schema{:original-name "SharedEncoding"}
   #'SharedEncoding]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "Step"} #'Step]
   [:enum "container"]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:layer
  #:json-schema{:original-name "layer"}
  [:vector
   [:or
    [:ref #:json-schema{:original-name "LayerSpec"} #'LayerSpec]
    [:ref #:json-schema{:original-name "UnitSpec"} #'UnitSpec]]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:projection
  {:json-schema/original-name "projection", :optional true}
  [:ref #:json-schema{:original-name "Projection"} #'Projection]]
 [:view
  {:json-schema/original-name "view", :optional true}
  [:ref
   #:json-schema{:original-name "ViewBackground"}
   #'ViewBackground]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "Step"} #'Step]
   [:enum "container"]]]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def LayerRepeatMapping
  [:map
 {:closed true, :json-schema/original-name "LayerRepeatMapping"}
 [:column
  {:json-schema/original-name "column", :optional true}
  [:vector string?]]
 [:layer #:json-schema{:original-name "layer"} [:vector string?]]
 [:row
  {:json-schema/original-name "row", :optional true}
  [:vector string?]]]
)

(def LayerRepeatSpec
  [:map
 {:closed true, :json-schema/original-name "LayerRepeatSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref
    #:json-schema{:original-name "RowCol<LayoutAlign>"}
    #'RowCol_LayoutAlign_]]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:columns
  {:json-schema/original-name "columns", :optional true}
  number?]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "RowCol<boolean>"}
    #'RowCol_boolean_]]]
 [:spec
  #:json-schema{:original-name "spec"}
  [:or
   [:ref #:json-schema{:original-name "LayerSpec"} #'LayerSpec]
   [:ref
    #:json-schema{:original-name "UnitSpecWithFrame"}
    #'UnitSpecWithFrame]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:repeat
  #:json-schema{:original-name "repeat"}
  [:ref
   #:json-schema{:original-name "LayerRepeatMapping"}
   #'LayerRepeatMapping]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RowCol<number>"}
    #'RowCol_number_]]]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def RepeatSpec
  [:or
 #:json-schema{:original-name "RepeatSpec"}
 [:ref
  #:json-schema{:original-name "NonLayerRepeatSpec"}
  #'NonLayerRepeatSpec]
 [:ref
  #:json-schema{:original-name "LayerRepeatSpec"}
  #'LayerRepeatSpec]]
)

(def Header
  [:map
 {:closed true, :json-schema/original-name "Header"}
 [:labelLimit
  {:json-schema/original-name "labelLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labels
  {:json-schema/original-name "labels", :optional true}
  boolean?]
 [:titleFontSize
  {:json-schema/original-name "titleFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:labelBaseline
  {:json-schema/original-name "labelBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFontStyle
  {:json-schema/original-name "titleFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleLimit
  {:json-schema/original-name "titleLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleAlign
  {:json-schema/original-name "titleAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelPadding
  {:json-schema/original-name "labelPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelLineHeight
  {:json-schema/original-name "labelLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleBaseline
  {:json-schema/original-name "titleBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleAngle
  {:json-schema/original-name "titleAngle", :optional true}
  number?]
 [:titleLineHeight
  {:json-schema/original-name "titleLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orient"} #'Orient]]
 [:titleAnchor
  {:json-schema/original-name "titleAnchor", :optional true}
  [:ref #:json-schema{:original-name "TitleAnchor"} #'TitleAnchor]]
 [:labelColor
  {:json-schema/original-name "labelColor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:labelAngle
  {:json-schema/original-name "labelAngle", :optional true}
  number?]
 [:titleFont
  {:json-schema/original-name "titleFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelExpr
  {:json-schema/original-name "labelExpr", :optional true}
  string?]
 [:titleOrient
  {:json-schema/original-name "titleOrient", :optional true}
  [:ref #:json-schema{:original-name "Orient"} #'Orient]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:titleColor
  {:json-schema/original-name "titleColor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titlePadding
  {:json-schema/original-name "titlePadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelAnchor
  {:json-schema/original-name "labelAnchor", :optional true}
  [:ref #:json-schema{:original-name "TitleAnchor"} #'TitleAnchor]]
 [:labelFont
  {:json-schema/original-name "labelFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelOrient
  {:json-schema/original-name "labelOrient", :optional true}
  [:ref #:json-schema{:original-name "Orient"} #'Orient]]
 [:labelAlign
  {:json-schema/original-name "labelAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontWeight
  {:json-schema/original-name "labelFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontStyle
  {:json-schema/original-name "labelFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontSize
  {:json-schema/original-name "labelFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFontWeight
  {:json-schema/original-name "titleFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def FacetFieldDef
  [:map
 {:closed true, :json-schema/original-name "FacetFieldDef"}
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:header
  {:json-schema/original-name "header", :optional true}
  [:or [:ref #:json-schema{:original-name "Header"} #'Header] nil?]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SortArray"} #'SortArray]
   [:ref #:json-schema{:original-name "SortOrder"} #'SortOrder]
   [:ref
    #:json-schema{:original-name "EncodingSortField"}
    #'EncodingSortField]
   nil?]]]
)

(def FacetEncodingFieldDef
  [:map
 {:closed true, :json-schema/original-name "FacetEncodingFieldDef"}
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref
    #:json-schema{:original-name "RowCol<LayoutAlign>"}
    #'RowCol_LayoutAlign_]]]
 [:columns
  {:json-schema/original-name "columns", :optional true}
  number?]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:header
  {:json-schema/original-name "header", :optional true}
  [:or [:ref #:json-schema{:original-name "Header"} #'Header] nil?]]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:center
  {:json-schema/original-name "center", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "RowCol<boolean>"}
    #'RowCol_boolean_]]]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SortArray"} #'SortArray]
   [:ref #:json-schema{:original-name "SortOrder"} #'SortOrder]
   [:ref
    #:json-schema{:original-name "EncodingSortField"}
    #'EncodingSortField]
   nil?]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RowCol<number>"}
    #'RowCol_number_]]]]
)

(def RowColumnEncodingFieldDef
  [:map
 {:closed true, :json-schema/original-name "RowColumnEncodingFieldDef"}
 [:align
  {:json-schema/original-name "align", :optional true}
  [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]]
 [:field
  {:json-schema/original-name "field", :optional true}
  [:ref #:json-schema{:original-name "Field"} #'Field]]
 [:type
  {:json-schema/original-name "type", :optional true}
  [:ref #:json-schema{:original-name "StandardType"} #'StandardType]]
 [:header
  {:json-schema/original-name "header", :optional true}
  [:or [:ref #:json-schema{:original-name "Header"} #'Header] nil?]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or [:ref #:json-schema{:original-name "Text"} #'Text] nil?]]
 [:center
  {:json-schema/original-name "center", :optional true}
  boolean?]
 [:bin
  {:json-schema/original-name "bin", :optional true}
  [:or
   boolean?
   nil?
   [:ref #:json-schema{:original-name "BinParams"} #'BinParams]]]
 [:bandPosition
  {:json-schema/original-name "bandPosition", :optional true}
  number?]
 [:timeUnit
  {:json-schema/original-name "timeUnit", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TimeUnit"} #'TimeUnit]
   [:ref
    #:json-schema{:original-name "BinnedTimeUnit"}
    #'BinnedTimeUnit]
   [:ref
    #:json-schema{:original-name "TimeUnitParams"}
    #'TimeUnitParams]]]
 [:aggregate
  {:json-schema/original-name "aggregate", :optional true}
  [:ref #:json-schema{:original-name "Aggregate"} #'Aggregate]]
 [:sort
  {:json-schema/original-name "sort", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SortArray"} #'SortArray]
   [:ref #:json-schema{:original-name "SortOrder"} #'SortOrder]
   [:ref
    #:json-schema{:original-name "EncodingSortField"}
    #'EncodingSortField]
   nil?]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  number?]]
)

(def FacetedEncoding
  [:map
 {:closed true, :json-schema/original-name "FacetedEncoding"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:ref #:json-schema{:original-name "PositionDef"} #'PositionDef]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "StringFieldDefWithCondition"}
    #'StringFieldDefWithCondition]
   [:ref
    #:json-schema{:original-name "StringValueDefWithCondition"}
    #'StringValueDefWithCondition]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:xError2
  {:json-schema/original-name "xError2", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "SecondaryFieldDef"}
    #'SecondaryFieldDef]
   [:ref
    #:json-schema{:original-name "ValueDef<number>"}
    #'ValueDef_number_]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:ref #:json-schema{:original-name "ColorDef"} #'ColorDef]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:ref #:json-schema{:original-name "ColorDef"} #'ColorDef]]
 [:key
  {:json-schema/original-name "key", :optional true}
  [:ref
   #:json-schema{:original-name "FieldDefWithoutScale"}
   #'FieldDefWithoutScale]]
 [:longitude2
  {:json-schema/original-name "longitude2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:ref #:json-schema{:original-name "ColorDef"} #'ColorDef]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:ref
   #:json-schema{:original-name "NumericArrayMarkPropDef"}
   #'NumericArrayMarkPropDef]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:ref #:json-schema{:original-name "TimeDef"} #'TimeDef]]
 [:facet
  {:json-schema/original-name "facet", :optional true}
  [:ref
   #:json-schema{:original-name "FacetEncodingFieldDef"}
   #'FacetEncodingFieldDef]]
 [:longitude
  {:json-schema/original-name "longitude", :optional true}
  [:ref #:json-schema{:original-name "LatLongDef"} #'LatLongDef]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:ref #:json-schema{:original-name "PolarDef"} #'PolarDef]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:ref #:json-schema{:original-name "PolarDef"} #'PolarDef]]
 [:theta2
  {:json-schema/original-name "theta2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:column
  {:json-schema/original-name "column", :optional true}
  [:ref
   #:json-schema{:original-name "RowColumnEncodingFieldDef"}
   #'RowColumnEncodingFieldDef]]
 [:yError
  {:json-schema/original-name "yError", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "SecondaryFieldDef"}
    #'SecondaryFieldDef]
   [:ref
    #:json-schema{:original-name "ValueDef<number>"}
    #'ValueDef_number_]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:ref
   #:json-schema{:original-name "NumericMarkPropDef"}
   #'NumericMarkPropDef]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:ref #:json-schema{:original-name "ShapeDef"} #'ShapeDef]]
 [:url
  {:json-schema/original-name "url", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "StringFieldDefWithCondition"}
    #'StringFieldDefWithCondition]
   [:ref
    #:json-schema{:original-name "StringValueDefWithCondition"}
    #'StringValueDefWithCondition]]]
 [:latitude
  {:json-schema/original-name "latitude", :optional true}
  [:ref #:json-schema{:original-name "LatLongDef"} #'LatLongDef]]
 [:order
  {:json-schema/original-name "order", :optional true}
  [:or
   [:ref #:json-schema{:original-name "OrderFieldDef"} #'OrderFieldDef]
   [:ref #:json-schema{:original-name "OrderValueDef"} #'OrderValueDef]
   [:ref #:json-schema{:original-name "OrderOnlyDef"} #'OrderOnlyDef]
   [:vector
    [:ref
     #:json-schema{:original-name "OrderFieldDef"}
     #'OrderFieldDef]]]]
 [:xError
  {:json-schema/original-name "xError", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "SecondaryFieldDef"}
    #'SecondaryFieldDef]
   [:ref
    #:json-schema{:original-name "ValueDef<number>"}
    #'ValueDef_number_]]]
 [:yError2
  {:json-schema/original-name "yError2", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "SecondaryFieldDef"}
    #'SecondaryFieldDef]
   [:ref
    #:json-schema{:original-name "ValueDef<number>"}
    #'ValueDef_number_]]]
 [:yOffset
  {:json-schema/original-name "yOffset", :optional true}
  [:ref #:json-schema{:original-name "OffsetDef"} #'OffsetDef]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:ref #:json-schema{:original-name "PositionDef"} #'PositionDef]]
 [:y2
  {:json-schema/original-name "y2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:radius2
  {:json-schema/original-name "radius2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:x2
  {:json-schema/original-name "x2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:latitude2
  {:json-schema/original-name "latitude2", :optional true}
  [:ref #:json-schema{:original-name "Position2Def"} #'Position2Def]]
 [:href
  {:json-schema/original-name "href", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "StringFieldDefWithCondition"}
    #'StringFieldDefWithCondition]
   [:ref
    #:json-schema{:original-name "StringValueDefWithCondition"}
    #'StringValueDefWithCondition]]]
 [:tooltip
  {:json-schema/original-name "tooltip", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "StringFieldDefWithCondition"}
    #'StringFieldDefWithCondition]
   [:ref
    #:json-schema{:original-name "StringValueDefWithCondition"}
    #'StringValueDefWithCondition]
   [:vector
    [:ref
     #:json-schema{:original-name "StringFieldDef"}
     #'StringFieldDef]]
   nil?]]
 [:row
  {:json-schema/original-name "row", :optional true}
  [:ref
   #:json-schema{:original-name "RowColumnEncodingFieldDef"}
   #'RowColumnEncodingFieldDef]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:ref #:json-schema{:original-name "TextDef"} #'TextDef]]
 [:xOffset
  {:json-schema/original-name "xOffset", :optional true}
  [:ref #:json-schema{:original-name "OffsetDef"} #'OffsetDef]]
 [:detail
  {:json-schema/original-name "detail", :optional true}
  [:or
   [:ref
    #:json-schema{:original-name "FieldDefWithoutScale"}
    #'FieldDefWithoutScale]
   [:vector
    [:ref
     #:json-schema{:original-name "FieldDefWithoutScale"}
     #'FieldDefWithoutScale]]]]]
)

(def FacetedUnitSpec
  [:map
 {:closed true, :json-schema/original-name "FacetedUnitSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:encoding
  {:json-schema/original-name "encoding", :optional true}
  [:ref
   #:json-schema{:original-name "FacetedEncoding"}
   #'FacetedEncoding]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref
    #:json-schema{:original-name "RowCol<LayoutAlign>"}
    #'RowCol_LayoutAlign_]]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:mark
  #:json-schema{:original-name "mark"}
  [:ref #:json-schema{:original-name "AnyMark"} #'AnyMark]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "Step"} #'Step]
   [:enum "container"]]]
 [:params
  {:json-schema/original-name "params", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "SelectionParameter"}
    #'SelectionParameter]]]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "RowCol<boolean>"}
    #'RowCol_boolean_]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:projection
  {:json-schema/original-name "projection", :optional true}
  [:ref #:json-schema{:original-name "Projection"} #'Projection]]
 [:view
  {:json-schema/original-name "view", :optional true}
  [:ref
   #:json-schema{:original-name "ViewBackground"}
   #'ViewBackground]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "Step"} #'Step]
   [:enum "container"]]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RowCol<number>"}
    #'RowCol_number_]]]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def FacetMapping
  [:map
 {:closed true, :json-schema/original-name "FacetMapping"}
 [:column
  {:json-schema/original-name "column", :optional true}
  [:ref #:json-schema{:original-name "FacetFieldDef"} #'FacetFieldDef]]
 [:row
  {:json-schema/original-name "row", :optional true}
  [:ref #:json-schema{:original-name "FacetFieldDef"} #'FacetFieldDef]]]
)

(def FacetSpec
  [:map
 {:closed true, :json-schema/original-name "FacetSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref
    #:json-schema{:original-name "RowCol<LayoutAlign>"}
    #'RowCol_LayoutAlign_]]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:columns
  {:json-schema/original-name "columns", :optional true}
  number?]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:facet
  #:json-schema{:original-name "facet"}
  [:or
   [:ref #:json-schema{:original-name "FacetFieldDef"} #'FacetFieldDef]
   [:ref #:json-schema{:original-name "FacetMapping"} #'FacetMapping]]]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "RowCol<boolean>"}
    #'RowCol_boolean_]]]
 [:spec
  #:json-schema{:original-name "spec"}
  [:or
   [:ref #:json-schema{:original-name "LayerSpec"} #'LayerSpec]
   [:ref
    #:json-schema{:original-name "FacetedUnitSpec"}
    #'FacetedUnitSpec]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RowCol<number>"}
    #'RowCol_number_]]]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def VConcatSpec_GenericSpec_
  [:map
 {:closed true, :json-schema/original-name "VConcatSpec<GenericSpec>"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  boolean?]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:vconcat
  #:json-schema{:original-name "vconcat"}
  [:vector [:ref #:json-schema{:original-name "Spec"} #'Spec]]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  number?]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def Spec
  [:or
 #:json-schema{:original-name "Spec"}
 [:ref
  #:json-schema{:original-name "FacetedUnitSpec"}
  #'FacetedUnitSpec]
 [:ref #:json-schema{:original-name "LayerSpec"} #'LayerSpec]
 [:ref #:json-schema{:original-name "RepeatSpec"} #'RepeatSpec]
 [:ref #:json-schema{:original-name "FacetSpec"} #'FacetSpec]
 [:ref
  #:json-schema{:original-name "ConcatSpec<GenericSpec>"}
  #'ConcatSpec_GenericSpec_]
 [:ref
  #:json-schema{:original-name "VConcatSpec<GenericSpec>"}
  #'VConcatSpec_GenericSpec_]
 [:ref
  #:json-schema{:original-name "HConcatSpec<GenericSpec>"}
  #'HConcatSpec_GenericSpec_]]
)

(def ConcatSpec_GenericSpec_
  [:map
 {:closed true, :json-schema/original-name "ConcatSpec<GenericSpec>"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref
    #:json-schema{:original-name "RowCol<LayoutAlign>"}
    #'RowCol_LayoutAlign_]]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:concat
  #:json-schema{:original-name "concat"}
  [:vector [:ref #:json-schema{:original-name "Spec"} #'Spec]]]
 [:columns
  {:json-schema/original-name "columns", :optional true}
  number?]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "RowCol<boolean>"}
    #'RowCol_boolean_]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RowCol<number>"}
    #'RowCol_number_]]]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def RangeRawArray
  [:vector #:json-schema{:original-name "RangeRawArray"} number?]
)

(def RangeRaw
  [:vector
 #:json-schema{:original-name "RangeRaw"}
 [:or
  nil?
  boolean?
  string?
  number?
  [:ref #:json-schema{:original-name "RangeRawArray"} #'RangeRawArray]]]
)

(def RangeScheme
  [:or
 #:json-schema{:original-name "RangeScheme"}
 [:ref #:json-schema{:original-name "RangeEnum"} #'RangeEnum]
 [:ref #:json-schema{:original-name "RangeRaw"} #'RangeRaw]
 [:map
  {:closed true}
  [:count {:json-schema/original-name "count", :optional true} number?]
  [:extent
   {:json-schema/original-name "extent", :optional true}
   [:vector number?]]
  [:scheme
   #:json-schema{:original-name "scheme"}
   [:or
    string?
    [:vector string?]
    [:ref #:json-schema{:original-name "ColorScheme"} #'ColorScheme]]]]]
)

(def RangeConfig
  [:map
 {:closed false, :json-schema/original-name "RangeConfig"}
 [:category
  {:json-schema/original-name "category", :optional true}
  [:or
   [:ref #:json-schema{:original-name "RangeScheme"} #'RangeScheme]
   [:vector [:ref #:json-schema{:original-name "Color"} #'Color]]]]
 [:diverging
  {:json-schema/original-name "diverging", :optional true}
  [:or
   [:ref #:json-schema{:original-name "RangeScheme"} #'RangeScheme]
   [:vector [:ref #:json-schema{:original-name "Color"} #'Color]]]]
 [:heatmap
  {:json-schema/original-name "heatmap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "RangeScheme"} #'RangeScheme]
   [:vector [:ref #:json-schema{:original-name "Color"} #'Color]]]]
 [:ordinal
  {:json-schema/original-name "ordinal", :optional true}
  [:or
   [:ref #:json-schema{:original-name "RangeScheme"} #'RangeScheme]
   [:vector [:ref #:json-schema{:original-name "Color"} #'Color]]]]
 [:ramp
  {:json-schema/original-name "ramp", :optional true}
  [:or
   [:ref #:json-schema{:original-name "RangeScheme"} #'RangeScheme]
   [:vector [:ref #:json-schema{:original-name "Color"} #'Color]]]]
 [:symbol
  {:json-schema/original-name "symbol", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]]]]
)

(def LegendConfig
  [:map
 {:closed true, :json-schema/original-name "LegendConfig"}
 [:titleOpacity
  {:json-schema/original-name "titleOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:description
  {:json-schema/original-name "description", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:disable
  {:json-schema/original-name "disable", :optional true}
  boolean?]
 [:labelLimit
  {:json-schema/original-name "labelLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolDash
  {:json-schema/original-name "symbolDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gridAlign
  {:json-schema/original-name "gridAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolSize
  {:json-schema/original-name "symbolSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientDirection
  {:json-schema/original-name "gradientDirection", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Orientation"} #'Orientation]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFontSize
  {:json-schema/original-name "titleFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientOpacity
  {:json-schema/original-name "gradientOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelSeparation
  {:json-schema/original-name "labelSeparation", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelBaseline
  {:json-schema/original-name "labelBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFontStyle
  {:json-schema/original-name "titleFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleLimit
  {:json-schema/original-name "titleLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleAlign
  {:json-schema/original-name "titleAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelOverlap
  {:json-schema/original-name "labelOverlap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LabelOverlap"} #'LabelOverlap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientStrokeWidth
  {:json-schema/original-name "gradientStrokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientThickness
  {:json-schema/original-name "gradientThickness", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:offset
  {:json-schema/original-name "offset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:layout
  {:json-schema/original-name "layout", :optional true}
  [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]
 [:labelOpacity
  {:json-schema/original-name "labelOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:columns
  {:json-schema/original-name "columns", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelPadding
  {:json-schema/original-name "labelPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:columnPadding
  {:json-schema/original-name "columnPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:clipHeight
  {:json-schema/original-name "clipHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientVerticalMaxLength
  {:json-schema/original-name "gradientVerticalMaxLength",
   :optional true}
  number?]
 [:titleBaseline
  {:json-schema/original-name "titleBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolDashOffset
  {:json-schema/original-name "symbolDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:unselectedOpacity
  {:json-schema/original-name "unselectedOpacity", :optional true}
  number?]
 [:labelOffset
  {:json-schema/original-name "labelOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleLineHeight
  {:json-schema/original-name "titleLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "LegendOrient"} #'LegendOrient]]
 [:gradientLabelOffset
  {:json-schema/original-name "gradientLabelOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleAnchor
  {:json-schema/original-name "titleAnchor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TitleAnchor"} #'TitleAnchor]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientStrokeColor
  {:json-schema/original-name "gradientStrokeColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelColor
  {:json-schema/original-name "labelColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:title {:json-schema/original-name "title", :optional true} nil?]
 [:titleFont
  {:json-schema/original-name "titleFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolFillColor
  {:json-schema/original-name "symbolFillColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientVerticalMinLength
  {:json-schema/original-name "gradientVerticalMinLength",
   :optional true}
  number?]
 [:titleOrient
  {:json-schema/original-name "titleOrient", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Orient"} #'Orient]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickCount
  {:json-schema/original-name "tickCount", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TickCount"} #'TickCount]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolDirection
  {:json-schema/original-name "symbolDirection", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Orientation"} #'Orientation]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleColor
  {:json-schema/original-name "titleColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolOffset
  {:json-schema/original-name "symbolOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientHorizontalMaxLength
  {:json-schema/original-name "gradientHorizontalMaxLength",
   :optional true}
  number?]
 [:symbolBaseFillColor
  {:json-schema/original-name "symbolBaseFillColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:legendX
  {:json-schema/original-name "legendX", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:aria
  {:json-schema/original-name "aria", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolOpacity
  {:json-schema/original-name "symbolOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titlePadding
  {:json-schema/original-name "titlePadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientLength
  {:json-schema/original-name "gradientLength", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:padding
  {:json-schema/original-name "padding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFont
  {:json-schema/original-name "labelFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeColor
  {:json-schema/original-name "strokeColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientLabelLimit
  {:json-schema/original-name "gradientLabelLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolStrokeColor
  {:json-schema/original-name "symbolStrokeColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:rowPadding
  {:json-schema/original-name "rowPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelAlign
  {:json-schema/original-name "labelAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolType
  {:json-schema/original-name "symbolType", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontWeight
  {:json-schema/original-name "labelFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolBaseStrokeColor
  {:json-schema/original-name "symbolBaseStrokeColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontStyle
  {:json-schema/original-name "labelFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:gradientHorizontalMinLength
  {:json-schema/original-name "gradientHorizontalMinLength",
   :optional true}
  number?]
 [:labelFontSize
  {:json-schema/original-name "labelFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:fillColor
  {:json-schema/original-name "fillColor", :optional true}
  [:or
   [:or nil? [:ref #:json-schema{:original-name "Color"} #'Color]]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:zindex
  {:json-schema/original-name "zindex", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:direction
  {:json-schema/original-name "direction", :optional true}
  [:ref #:json-schema{:original-name "Orientation"} #'Orientation]]
 [:symbolStrokeWidth
  {:json-schema/original-name "symbolStrokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFontWeight
  {:json-schema/original-name "titleFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:legendY
  {:json-schema/original-name "legendY", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:symbolLimit
  {:json-schema/original-name "symbolLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def IntervalSelectionConfigWithoutType
  [:map
 {:closed true,
  :json-schema/original-name "IntervalSelectionConfigWithoutType"}
 [:clear
  {:json-schema/original-name "clear", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Stream"} #'Stream]
   string?
   boolean?]]
 [:encodings
  {:json-schema/original-name "encodings", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "SingleDefUnitChannel"}
    #'SingleDefUnitChannel]]]
 [:fields
  {:json-schema/original-name "fields", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:mark
  {:json-schema/original-name "mark", :optional true}
  [:ref #:json-schema{:original-name "BrushConfig"} #'BrushConfig]]
 [:on
  {:json-schema/original-name "on", :optional true}
  [:or [:ref #:json-schema{:original-name "Stream"} #'Stream] string?]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref
   #:json-schema{:original-name "SelectionResolution"}
   #'SelectionResolution]]
 [:translate
  {:json-schema/original-name "translate", :optional true}
  [:or string? boolean?]]
 [:zoom
  {:json-schema/original-name "zoom", :optional true}
  [:or string? boolean?]]]
)

(def PointSelectionConfigWithoutType
  [:map
 {:closed true,
  :json-schema/original-name "PointSelectionConfigWithoutType"}
 [:clear
  {:json-schema/original-name "clear", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Stream"} #'Stream]
   string?
   boolean?]]
 [:encodings
  {:json-schema/original-name "encodings", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "SingleDefUnitChannel"}
    #'SingleDefUnitChannel]]]
 [:fields
  {:json-schema/original-name "fields", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "FieldName"} #'FieldName]]]
 [:nearest
  {:json-schema/original-name "nearest", :optional true}
  boolean?]
 [:on
  {:json-schema/original-name "on", :optional true}
  [:or [:ref #:json-schema{:original-name "Stream"} #'Stream] string?]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref
   #:json-schema{:original-name "SelectionResolution"}
   #'SelectionResolution]]
 [:toggle
  {:json-schema/original-name "toggle", :optional true}
  [:or string? boolean?]]]
)

(def SelectionConfig
  [:map
 {:closed true, :json-schema/original-name "SelectionConfig"}
 [:interval
  {:json-schema/original-name "interval", :optional true}
  [:ref
   #:json-schema{:original-name "IntervalSelectionConfigWithoutType"}
   #'IntervalSelectionConfigWithoutType]]
 [:point
  {:json-schema/original-name "point", :optional true}
  [:ref
   #:json-schema{:original-name "PointSelectionConfigWithoutType"}
   #'PointSelectionConfigWithoutType]]]
)

(def ProjectionConfig
  [:ref #:json-schema{:original-name "ProjectionConfig"} #'Projection]
)

(def TopLevelSelectionParameter
  [:map
 {:closed true,
  :json-schema/original-name "TopLevelSelectionParameter"}
 [:bind
  {:json-schema/original-name "bind", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Binding"} #'Binding]
   [:ref #:json-schema{:original-name "LegendBinding"} #'LegendBinding]
   [:map-of any? any?]
   [:enum "scales"]]]
 [:name
  #:json-schema{:original-name "name"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:select
  #:json-schema{:original-name "select"}
  [:or
   [:ref #:json-schema{:original-name "SelectionType"} #'SelectionType]
   [:ref
    #:json-schema{:original-name "PointSelectionConfig"}
    #'PointSelectionConfig]
   [:ref
    #:json-schema{:original-name "IntervalSelectionConfig"}
    #'IntervalSelectionConfig]]]
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SelectionInit"} #'SelectionInit]
   [:ref
    #:json-schema{:original-name "SelectionInitIntervalMapping"}
    #'SelectionInitIntervalMapping]
   [:vector
    [:ref
     #:json-schema{:original-name "SelectionInitMapping"}
     #'SelectionInitMapping]]]]
 [:views
  {:json-schema/original-name "views", :optional true}
  [:vector string?]]]
)

(def VariableParameter
  [:map
 {:closed true, :json-schema/original-name "VariableParameter"}
 [:bind
  {:json-schema/original-name "bind", :optional true}
  [:ref #:json-schema{:original-name "Binding"} #'Binding]]
 [:expr
  {:json-schema/original-name "expr", :optional true}
  [:ref #:json-schema{:original-name "Expr"} #'Expr]]
 [:name
  #:json-schema{:original-name "name"}
  [:ref #:json-schema{:original-name "ParameterName"} #'ParameterName]]
 [:react {:json-schema/original-name "react", :optional true} boolean?]
 [:value {:json-schema/original-name "value", :optional true} any?]]
)

(def TopLevelParameter
  [:or
 #:json-schema{:original-name "TopLevelParameter"}
 [:ref
  #:json-schema{:original-name "VariableParameter"}
  #'VariableParameter]
 [:ref
  #:json-schema{:original-name "TopLevelSelectionParameter"}
  #'TopLevelSelectionParameter]]
)

(def HeaderConfig
  [:map
 {:closed true, :json-schema/original-name "HeaderConfig"}
 [:labelLimit
  {:json-schema/original-name "labelLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labels
  {:json-schema/original-name "labels", :optional true}
  boolean?]
 [:titleFontSize
  {:json-schema/original-name "titleFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:format
  {:json-schema/original-name "format", :optional true}
  [:ref #:json-schema{:original-name "Format"} #'Format]]
 [:labelBaseline
  {:json-schema/original-name "labelBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFontStyle
  {:json-schema/original-name "titleFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleLimit
  {:json-schema/original-name "titleLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleAlign
  {:json-schema/original-name "titleAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelPadding
  {:json-schema/original-name "labelPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelLineHeight
  {:json-schema/original-name "labelLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleBaseline
  {:json-schema/original-name "titleBaseline", :optional true}
  [:or
   [:ref #:json-schema{:original-name "TextBaseline"} #'TextBaseline]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleAngle
  {:json-schema/original-name "titleAngle", :optional true}
  number?]
 [:titleLineHeight
  {:json-schema/original-name "titleLineHeight", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:orient
  {:json-schema/original-name "orient", :optional true}
  [:ref #:json-schema{:original-name "Orient"} #'Orient]]
 [:titleAnchor
  {:json-schema/original-name "titleAnchor", :optional true}
  [:ref #:json-schema{:original-name "TitleAnchor"} #'TitleAnchor]]
 [:labelColor
  {:json-schema/original-name "labelColor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:title {:json-schema/original-name "title", :optional true} nil?]
 [:labelAngle
  {:json-schema/original-name "labelAngle", :optional true}
  number?]
 [:titleFont
  {:json-schema/original-name "titleFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelExpr
  {:json-schema/original-name "labelExpr", :optional true}
  string?]
 [:titleOrient
  {:json-schema/original-name "titleOrient", :optional true}
  [:ref #:json-schema{:original-name "Orient"} #'Orient]]
 [:formatType
  {:json-schema/original-name "formatType", :optional true}
  string?]
 [:titleColor
  {:json-schema/original-name "titleColor", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titlePadding
  {:json-schema/original-name "titlePadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelAnchor
  {:json-schema/original-name "labelAnchor", :optional true}
  [:ref #:json-schema{:original-name "TitleAnchor"} #'TitleAnchor]]
 [:labelFont
  {:json-schema/original-name "labelFont", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelOrient
  {:json-schema/original-name "labelOrient", :optional true}
  [:ref #:json-schema{:original-name "Orient"} #'Orient]]
 [:labelAlign
  {:json-schema/original-name "labelAlign", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Align"} #'Align]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontWeight
  {:json-schema/original-name "labelFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontStyle
  {:json-schema/original-name "labelFontStyle", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontStyle"} #'FontStyle]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:labelFontSize
  {:json-schema/original-name "labelFontSize", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:titleFontWeight
  {:json-schema/original-name "titleFontWeight", :optional true}
  [:or
   [:ref #:json-schema{:original-name "FontWeight"} #'FontWeight]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def ErrorBarConfig
  [:map
 {:closed true, :json-schema/original-name "ErrorBarConfig"}
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:ref
   #:json-schema{:original-name "ErrorBarExtent"}
   #'ErrorBarExtent]]
 [:rule
  {:json-schema/original-name "rule", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:size {:json-schema/original-name "size", :optional true} number?]
 [:thickness
  {:json-schema/original-name "thickness", :optional true}
  number?]
 [:ticks
  {:json-schema/original-name "ticks", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]]
)

(def ErrorBandConfig
  [:map
 {:closed true, :json-schema/original-name "ErrorBandConfig"}
 [:band
  {:json-schema/original-name "band", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:borders
  {:json-schema/original-name "borders", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "AnyMarkConfig"}
    #'AnyMarkConfig]]]
 [:extent
  {:json-schema/original-name "extent", :optional true}
  [:ref
   #:json-schema{:original-name "ErrorBarExtent"}
   #'ErrorBarExtent]]
 [:interpolate
  {:json-schema/original-name "interpolate", :optional true}
  [:ref #:json-schema{:original-name "Interpolate"} #'Interpolate]]
 [:tension
  {:json-schema/original-name "tension", :optional true}
  number?]]
)

(def Padding
  [:or
 #:json-schema{:original-name "Padding"}
 number?
 [:map
  {:closed true}
  [:bottom
   {:json-schema/original-name "bottom", :optional true}
   number?]
  [:left {:json-schema/original-name "left", :optional true} number?]
  [:right {:json-schema/original-name "right", :optional true} number?]
  [:top {:json-schema/original-name "top", :optional true} number?]]]
)

(def FormatConfig
  [:map
 {:closed true, :json-schema/original-name "FormatConfig"}
 [:normalizedNumberFormat
  {:json-schema/original-name "normalizedNumberFormat", :optional true}
  string?]
 [:normalizedNumberFormatType
  {:json-schema/original-name "normalizedNumberFormatType",
   :optional true}
  string?]
 [:numberFormat
  {:json-schema/original-name "numberFormat", :optional true}
  string?]
 [:numberFormatType
  {:json-schema/original-name "numberFormatType", :optional true}
  string?]
 [:timeFormat
  {:json-schema/original-name "timeFormat", :optional true}
  string?]
 [:timeFormatType
  {:json-schema/original-name "timeFormatType", :optional true}
  string?]]
)

(def Vector2_string_
  [:vector #:json-schema{:original-name "Vector2<string>"} string?]
)

(def Vector12_string_
  [:vector #:json-schema{:original-name "Vector12<string>"} string?]
)

(def Vector7_string_
  [:vector #:json-schema{:original-name "Vector7<string>"} string?]
)

(def TimeLocale
  [:map
 {:closed true, :json-schema/original-name "TimeLocale"}
 [:date #:json-schema{:original-name "date"} string?]
 [:dateTime #:json-schema{:original-name "dateTime"} string?]
 [:days
  #:json-schema{:original-name "days"}
  [:ref
   #:json-schema{:original-name "Vector7<string>"}
   #'Vector7_string_]]
 [:months
  #:json-schema{:original-name "months"}
  [:ref
   #:json-schema{:original-name "Vector12<string>"}
   #'Vector12_string_]]
 [:periods
  #:json-schema{:original-name "periods"}
  [:ref
   #:json-schema{:original-name "Vector2<string>"}
   #'Vector2_string_]]
 [:shortDays
  #:json-schema{:original-name "shortDays"}
  [:ref
   #:json-schema{:original-name "Vector7<string>"}
   #'Vector7_string_]]
 [:shortMonths
  #:json-schema{:original-name "shortMonths"}
  [:ref
   #:json-schema{:original-name "Vector12<string>"}
   #'Vector12_string_]]
 [:time #:json-schema{:original-name "time"} string?]]
)

(def Vector10_string_
  [:vector #:json-schema{:original-name "Vector10<string>"} string?]
)

(def NumberLocale
  [:map
 {:closed true, :json-schema/original-name "NumberLocale"}
 [:currency
  #:json-schema{:original-name "currency"}
  [:ref
   #:json-schema{:original-name "Vector2<string>"}
   #'Vector2_string_]]
 [:decimal #:json-schema{:original-name "decimal"} string?]
 [:grouping #:json-schema{:original-name "grouping"} [:vector number?]]
 [:minus {:json-schema/original-name "minus", :optional true} string?]
 [:nan {:json-schema/original-name "nan", :optional true} string?]
 [:numerals
  {:json-schema/original-name "numerals", :optional true}
  [:ref
   #:json-schema{:original-name "Vector10<string>"}
   #'Vector10_string_]]
 [:percent
  {:json-schema/original-name "percent", :optional true}
  string?]
 [:thousands #:json-schema{:original-name "thousands"} string?]]
)

(def Locale
  [:map
 {:closed true, :json-schema/original-name "Locale"}
 [:number
  {:json-schema/original-name "number", :optional true}
  [:ref #:json-schema{:original-name "NumberLocale"} #'NumberLocale]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:ref #:json-schema{:original-name "TimeLocale"} #'TimeLocale]]]
)

(def ViewConfig
  [:map
 {:closed true, :json-schema/original-name "ViewConfig"}
 [:discreteHeight
  {:json-schema/original-name "discreteHeight", :optional true}
  [:or
   number?
   [:map
    {:closed true}
    [:step #:json-schema{:original-name "step"} number?]]]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:clip {:json-schema/original-name "clip", :optional true} boolean?]
 [:discreteWidth
  {:json-schema/original-name "discreteWidth", :optional true}
  [:or
   number?
   [:map
    {:closed true}
    [:step #:json-schema{:original-name "step"} number?]]]]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]
   nil?]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:or
   [:vector number?]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:cursor
  {:json-schema/original-name "cursor", :optional true}
  [:ref #:json-schema{:original-name "Cursor"} #'Cursor]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeMiterLimit
  {:json-schema/original-name "strokeMiterLimit", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeDashOffset
  {:json-schema/original-name "strokeDashOffset", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:continuousWidth
  {:json-schema/original-name "continuousWidth", :optional true}
  number?]
 [:cornerRadius
  {:json-schema/original-name "cornerRadius", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:continuousHeight
  {:json-schema/original-name "continuousHeight", :optional true}
  number?]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeJoin
  {:json-schema/original-name "strokeJoin", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeJoin"} #'StrokeJoin]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:strokeCap
  {:json-schema/original-name "strokeCap", :optional true}
  [:or
   [:ref #:json-schema{:original-name "StrokeCap"} #'StrokeCap]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:step {:json-schema/original-name "step", :optional true} number?]]
)

(def StyleConfigIndex
  [:map
 {:closed false, :json-schema/original-name "StyleConfigIndex"}
 [:tick
  {:json-schema/original-name "tick", :optional true}
  [:ref #:json-schema{:original-name "TickConfig"} #'TickConfig]]
 [:geoshape
  {:json-schema/original-name "geoshape", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:group-title
  {:json-schema/original-name "group-title", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:arc
  {:json-schema/original-name "arc", :optional true}
  [:ref #:json-schema{:original-name "RectConfig"} #'RectConfig]]
 [:mark
  {:json-schema/original-name "mark", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:bar
  {:json-schema/original-name "bar", :optional true}
  [:ref #:json-schema{:original-name "BarConfig"} #'BarConfig]]
 [:rule
  {:json-schema/original-name "rule", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:guide-label
  {:json-schema/original-name "guide-label", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:circle
  {:json-schema/original-name "circle", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:trail
  {:json-schema/original-name "trail", :optional true}
  [:ref #:json-schema{:original-name "LineConfig"} #'LineConfig]]
 [:line
  {:json-schema/original-name "line", :optional true}
  [:ref #:json-schema{:original-name "LineConfig"} #'LineConfig]]
 [:square
  {:json-schema/original-name "square", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:image
  {:json-schema/original-name "image", :optional true}
  [:ref #:json-schema{:original-name "RectConfig"} #'RectConfig]]
 [:point
  {:json-schema/original-name "point", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:area
  {:json-schema/original-name "area", :optional true}
  [:ref #:json-schema{:original-name "AreaConfig"} #'AreaConfig]]
 [:group-subtitle
  {:json-schema/original-name "group-subtitle", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:guide-title
  {:json-schema/original-name "guide-title", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:rect
  {:json-schema/original-name "rect", :optional true}
  [:ref #:json-schema{:original-name "RectConfig"} #'RectConfig]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]]
)

(def ScaleInvalidDataShowAsValue__strokeWidth__
  [:map
 {:closed true,
  :json-schema/original-name
  "ScaleInvalidDataShowAsValue<\"strokeWidth\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__strokeWidth__
  [:or
 #:json-schema{:original-name
               "ScaleInvalidDataShowAs<\"strokeWidth\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"strokeWidth\">"}
  #'ScaleInvalidDataShowAsValue__strokeWidth__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__angle__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"angle\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__angle__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"angle\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"angle\">"}
  #'ScaleInvalidDataShowAsValue__angle__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__radius__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"radius\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__radius__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"radius\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"radius\">"}
  #'ScaleInvalidDataShowAsValue__radius__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__strokeOpacity__
  [:map
 {:closed true,
  :json-schema/original-name
  "ScaleInvalidDataShowAsValue<\"strokeOpacity\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__strokeOpacity__
  [:or
 #:json-schema{:original-name
               "ScaleInvalidDataShowAs<\"strokeOpacity\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"strokeOpacity\">"}
  #'ScaleInvalidDataShowAsValue__strokeOpacity__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__yOffset__
  [:map
 {:closed true,
  :json-schema/original-name
  "ScaleInvalidDataShowAsValue<\"yOffset\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__yOffset__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"yOffset\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"yOffset\">"}
  #'ScaleInvalidDataShowAsValue__yOffset__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__fill__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"fill\">"}
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   nil?]]]
)

(def ScaleInvalidDataShowAs__fill__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"fill\">"}
 [:ref
  #:json-schema{:original-name "ScaleInvalidDataShowAsValue<\"fill\">"}
  #'ScaleInvalidDataShowAsValue__fill__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__theta__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"theta\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__theta__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"theta\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"theta\">"}
  #'ScaleInvalidDataShowAsValue__theta__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__time__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"time\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__time__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"time\">"}
 [:ref
  #:json-schema{:original-name "ScaleInvalidDataShowAsValue<\"time\">"}
  #'ScaleInvalidDataShowAsValue__time__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__color__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"color\">"}
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]]]]
)

(def ScaleInvalidDataShowAs__color__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"color\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"color\">"}
  #'ScaleInvalidDataShowAsValue__color__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__size__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"size\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__size__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"size\">"}
 [:ref
  #:json-schema{:original-name "ScaleInvalidDataShowAsValue<\"size\">"}
  #'ScaleInvalidDataShowAsValue__size__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__shape__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"shape\">"}
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   [:ref #:json-schema{:original-name "SymbolShape"} #'SymbolShape]
   string?]]]
)

(def ScaleInvalidDataShowAs__shape__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"shape\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"shape\">"}
  #'ScaleInvalidDataShowAsValue__shape__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__stroke__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"stroke\">"}
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "Gradient"} #'Gradient]
   nil?]]]
)

(def ScaleInvalidDataShowAs__stroke__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"stroke\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"stroke\">"}
  #'ScaleInvalidDataShowAsValue__stroke__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__xOffset__
  [:map
 {:closed true,
  :json-schema/original-name
  "ScaleInvalidDataShowAsValue<\"xOffset\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__xOffset__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"xOffset\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"xOffset\">"}
  #'ScaleInvalidDataShowAsValue__xOffset__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__strokeDash__
  [:map
 {:closed true,
  :json-schema/original-name
  "ScaleInvalidDataShowAsValue<\"strokeDash\">"}
 [:value
  {:json-schema/original-name "value", :optional true}
  [:vector number?]]]
)

(def ScaleInvalidDataShowAs__strokeDash__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"strokeDash\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"strokeDash\">"}
  #'ScaleInvalidDataShowAsValue__strokeDash__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__y__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"y\">"}
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or number? [:enum "height"]]]]
)

(def ScaleInvalidDataShowAs__y__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"y\">"}
 [:ref
  #:json-schema{:original-name "ScaleInvalidDataShowAsValue<\"y\">"}
  #'ScaleInvalidDataShowAsValue__y__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__x__
  [:map
 {:closed true,
  :json-schema/original-name "ScaleInvalidDataShowAsValue<\"x\">"}
 [:value
  {:json-schema/original-name "value", :optional true}
  [:or number? [:enum "width"]]]]
)

(def ScaleInvalidDataShowAs__x__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"x\">"}
 [:ref
  #:json-schema{:original-name "ScaleInvalidDataShowAsValue<\"x\">"}
  #'ScaleInvalidDataShowAsValue__x__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__fillOpacity__
  [:map
 {:closed true,
  :json-schema/original-name
  "ScaleInvalidDataShowAsValue<\"fillOpacity\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__fillOpacity__
  [:or
 #:json-schema{:original-name
               "ScaleInvalidDataShowAs<\"fillOpacity\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"fillOpacity\">"}
  #'ScaleInvalidDataShowAsValue__fillOpacity__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__opacity__
  [:map
 {:closed true,
  :json-schema/original-name
  "ScaleInvalidDataShowAsValue<\"opacity\">"}
 [:value {:json-schema/original-name "value", :optional true} number?]]
)

(def ScaleInvalidDataShowAs__opacity__
  [:or
 #:json-schema{:original-name "ScaleInvalidDataShowAs<\"opacity\">"}
 [:ref
  #:json-schema{:original-name
                "ScaleInvalidDataShowAsValue<\"opacity\">"}
  #'ScaleInvalidDataShowAsValue__opacity__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataConfig
  [:map
 {:closed true, :json-schema/original-name "ScaleInvalidDataConfig"}
 [:y
  {:json-schema/original-name "y", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"y\">"}
   #'ScaleInvalidDataShowAs__y__]]
 [:strokeOpacity
  {:json-schema/original-name "strokeOpacity", :optional true}
  [:ref
   #:json-schema{:original-name
                 "ScaleInvalidDataShowAs<\"strokeOpacity\">"}
   #'ScaleInvalidDataShowAs__strokeOpacity__]]
 [:stroke
  {:json-schema/original-name "stroke", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"stroke\">"}
   #'ScaleInvalidDataShowAs__stroke__]]
 [:color
  {:json-schema/original-name "color", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"color\">"}
   #'ScaleInvalidDataShowAs__color__]]
 [:fill
  {:json-schema/original-name "fill", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"fill\">"}
   #'ScaleInvalidDataShowAs__fill__]]
 [:strokeDash
  {:json-schema/original-name "strokeDash", :optional true}
  [:ref
   #:json-schema{:original-name
                 "ScaleInvalidDataShowAs<\"strokeDash\">"}
   #'ScaleInvalidDataShowAs__strokeDash__]]
 [:time
  {:json-schema/original-name "time", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"time\">"}
   #'ScaleInvalidDataShowAs__time__]]
 [:fillOpacity
  {:json-schema/original-name "fillOpacity", :optional true}
  [:ref
   #:json-schema{:original-name
                 "ScaleInvalidDataShowAs<\"fillOpacity\">"}
   #'ScaleInvalidDataShowAs__fillOpacity__]]
 [:angle
  {:json-schema/original-name "angle", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"angle\">"}
   #'ScaleInvalidDataShowAs__angle__]]
 [:theta
  {:json-schema/original-name "theta", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"theta\">"}
   #'ScaleInvalidDataShowAs__theta__]]
 [:radius
  {:json-schema/original-name "radius", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"radius\">"}
   #'ScaleInvalidDataShowAs__radius__]]
 [:size
  {:json-schema/original-name "size", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"size\">"}
   #'ScaleInvalidDataShowAs__size__]]
 [:strokeWidth
  {:json-schema/original-name "strokeWidth", :optional true}
  [:ref
   #:json-schema{:original-name
                 "ScaleInvalidDataShowAs<\"strokeWidth\">"}
   #'ScaleInvalidDataShowAs__strokeWidth__]]
 [:opacity
  {:json-schema/original-name "opacity", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"opacity\">"}
   #'ScaleInvalidDataShowAs__opacity__]]
 [:shape
  {:json-schema/original-name "shape", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"shape\">"}
   #'ScaleInvalidDataShowAs__shape__]]
 [:yOffset
  {:json-schema/original-name "yOffset", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"yOffset\">"}
   #'ScaleInvalidDataShowAs__yOffset__]]
 [:x
  {:json-schema/original-name "x", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"x\">"}
   #'ScaleInvalidDataShowAs__x__]]
 [:xOffset
  {:json-schema/original-name "xOffset", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataShowAs<\"xOffset\">"}
   #'ScaleInvalidDataShowAs__xOffset__]]]
)

(def ScaleConfig
  [:map
 {:closed true, :json-schema/original-name "ScaleConfig"}
 [:zero {:json-schema/original-name "zero", :optional true} boolean?]
 [:bandPaddingInner
  {:json-schema/original-name "bandPaddingInner", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:barBandPaddingInner
  {:json-schema/original-name "barBandPaddingInner", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:xReverse
  {:json-schema/original-name "xReverse", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:maxOpacity
  {:json-schema/original-name "maxOpacity", :optional true}
  number?]
 [:quantizeCount
  {:json-schema/original-name "quantizeCount", :optional true}
  number?]
 [:rectBandPaddingInner
  {:json-schema/original-name "rectBandPaddingInner", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:continuousPadding
  {:json-schema/original-name "continuousPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:bandWithNestedOffsetPaddingOuter
  {:json-schema/original-name "bandWithNestedOffsetPaddingOuter",
   :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:quantileCount
  {:json-schema/original-name "quantileCount", :optional true}
  number?]
 [:useUnaggregatedDomain
  {:json-schema/original-name "useUnaggregatedDomain", :optional true}
  boolean?]
 [:invalid
  {:json-schema/original-name "invalid", :optional true}
  [:ref
   #:json-schema{:original-name "ScaleInvalidDataConfig"}
   #'ScaleInvalidDataConfig]]
 [:maxBandSize
  {:json-schema/original-name "maxBandSize", :optional true}
  number?]
 [:bandPaddingOuter
  {:json-schema/original-name "bandPaddingOuter", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:minSize
  {:json-schema/original-name "minSize", :optional true}
  number?]
 [:animationDuration
  {:json-schema/original-name "animationDuration", :optional true}
  number?]
 [:round
  {:json-schema/original-name "round", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:offsetBandPaddingInner
  {:json-schema/original-name "offsetBandPaddingInner", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:tickBandPaddingInner
  {:json-schema/original-name "tickBandPaddingInner", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:minFontSize
  {:json-schema/original-name "minFontSize", :optional true}
  number?]
 [:offsetBandPaddingOuter
  {:json-schema/original-name "offsetBandPaddingOuter", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:minBandSize
  {:json-schema/original-name "minBandSize", :optional true}
  number?]
 [:maxStrokeWidth
  {:json-schema/original-name "maxStrokeWidth", :optional true}
  number?]
 [:maxFontSize
  {:json-schema/original-name "maxFontSize", :optional true}
  number?]
 [:minOpacity
  {:json-schema/original-name "minOpacity", :optional true}
  number?]
 [:maxSize
  {:json-schema/original-name "maxSize", :optional true}
  number?]
 [:bandWithNestedOffsetPaddingInner
  {:json-schema/original-name "bandWithNestedOffsetPaddingInner",
   :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:clamp
  {:json-schema/original-name "clamp", :optional true}
  [:or
   boolean?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:framesPerSecond
  {:json-schema/original-name "framesPerSecond", :optional true}
  number?]
 [:minStrokeWidth
  {:json-schema/original-name "minStrokeWidth", :optional true}
  number?]
 [:pointPadding
  {:json-schema/original-name "pointPadding", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]]
)

(def TitleConfig
  [:ref
 #:json-schema{:original-name "TitleConfig"}
 #'BaseTitleNoValueRefs]
)

(def Config
  [:map
 {:closed true, :json-schema/original-name "Config"}
 [:tick
  {:json-schema/original-name "tick", :optional true}
  [:ref #:json-schema{:original-name "TickConfig"} #'TickConfig]]
 [:axisTemporal
  {:json-schema/original-name "axisTemporal", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:autosize
  {:json-schema/original-name "autosize", :optional true}
  [:or
   [:ref #:json-schema{:original-name "AutosizeType"} #'AutosizeType]
   [:ref
    #:json-schema{:original-name "AutoSizeParams"}
    #'AutoSizeParams]]]
 [:headerColumn
  {:json-schema/original-name "headerColumn", :optional true}
  [:ref #:json-schema{:original-name "HeaderConfig"} #'HeaderConfig]]
 [:normalizedNumberFormat
  {:json-schema/original-name "normalizedNumberFormat", :optional true}
  string?]
 [:axisTop
  {:json-schema/original-name "axisTop", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:tooltipFormat
  {:json-schema/original-name "tooltipFormat", :optional true}
  [:ref #:json-schema{:original-name "FormatConfig"} #'FormatConfig]]
 [:headerRow
  {:json-schema/original-name "headerRow", :optional true}
  [:ref #:json-schema{:original-name "HeaderConfig"} #'HeaderConfig]]
 [:axisLeft
  {:json-schema/original-name "axisLeft", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:geoshape
  {:json-schema/original-name "geoshape", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:errorbar
  {:json-schema/original-name "errorbar", :optional true}
  [:ref
   #:json-schema{:original-name "ErrorBarConfig"}
   #'ErrorBarConfig]]
 [:axisY
  {:json-schema/original-name "axisY", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:arc
  {:json-schema/original-name "arc", :optional true}
  [:ref #:json-schema{:original-name "RectConfig"} #'RectConfig]]
 [:axisYBand
  {:json-schema/original-name "axisYBand", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:scale
  {:json-schema/original-name "scale", :optional true}
  [:ref #:json-schema{:original-name "ScaleConfig"} #'ScaleConfig]]
 [:locale
  {:json-schema/original-name "locale", :optional true}
  [:ref #:json-schema{:original-name "Locale"} #'Locale]]
 [:mark
  {:json-schema/original-name "mark", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:bar
  {:json-schema/original-name "bar", :optional true}
  [:ref #:json-schema{:original-name "BarConfig"} #'BarConfig]]
 [:concat
  {:json-schema/original-name "concat", :optional true}
  [:ref
   #:json-schema{:original-name "CompositionConfig"}
   #'CompositionConfig]]
 [:axisQuantitative
  {:json-schema/original-name "axisQuantitative", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:axisXBand
  {:json-schema/original-name "axisXBand", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:countTitle
  {:json-schema/original-name "countTitle", :optional true}
  string?]
 [:rule
  {:json-schema/original-name "rule", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:axisYDiscrete
  {:json-schema/original-name "axisYDiscrete", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:facet
  {:json-schema/original-name "facet", :optional true}
  [:ref
   #:json-schema{:original-name "CompositionConfig"}
   #'CompositionConfig]]
 [:circle
  {:json-schema/original-name "circle", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:axisBottom
  {:json-schema/original-name "axisBottom", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:background
  {:json-schema/original-name "background", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:params
  {:json-schema/original-name "params", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "TopLevelParameter"}
    #'TopLevelParameter]]]
 [:legend
  {:json-schema/original-name "legend", :optional true}
  [:ref #:json-schema{:original-name "LegendConfig"} #'LegendConfig]]
 [:timeFormatType
  {:json-schema/original-name "timeFormatType", :optional true}
  string?]
 [:lineBreak
  {:json-schema/original-name "lineBreak", :optional true}
  [:or
   string?
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:axisBand
  {:json-schema/original-name "axisBand", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:header
  {:json-schema/original-name "header", :optional true}
  [:ref #:json-schema{:original-name "HeaderConfig"} #'HeaderConfig]]
 [:font {:json-schema/original-name "font", :optional true} string?]
 [:trail
  {:json-schema/original-name "trail", :optional true}
  [:ref #:json-schema{:original-name "LineConfig"} #'LineConfig]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:ref #:json-schema{:original-name "TitleConfig"} #'TitleConfig]]
 [:axisX
  {:json-schema/original-name "axisX", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:fieldTitle
  {:json-schema/original-name "fieldTitle", :optional true}
  [:enum "verbal" "functional" "plain"]]
 [:axisPoint
  {:json-schema/original-name "axisPoint", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:axisYTemporal
  {:json-schema/original-name "axisYTemporal", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:numberFormat
  {:json-schema/original-name "numberFormat", :optional true}
  string?]
 [:normalizedNumberFormatType
  {:json-schema/original-name "normalizedNumberFormatType",
   :optional true}
  string?]
 [:style
  {:json-schema/original-name "style", :optional true}
  [:ref
   #:json-schema{:original-name "StyleConfigIndex"}
   #'StyleConfigIndex]]
 [:axisYQuantitative
  {:json-schema/original-name "axisYQuantitative", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:axisXTemporal
  {:json-schema/original-name "axisXTemporal", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:axisRight
  {:json-schema/original-name "axisRight", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:errorband
  {:json-schema/original-name "errorband", :optional true}
  [:ref
   #:json-schema{:original-name "ErrorBandConfig"}
   #'ErrorBandConfig]]
 [:axisXQuantitative
  {:json-schema/original-name "axisXQuantitative", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:axisXPoint
  {:json-schema/original-name "axisXPoint", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:aria {:json-schema/original-name "aria", :optional true} boolean?]
 [:line
  {:json-schema/original-name "line", :optional true}
  [:ref #:json-schema{:original-name "LineConfig"} #'LineConfig]]
 [:axisXDiscrete
  {:json-schema/original-name "axisXDiscrete", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:square
  {:json-schema/original-name "square", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:padding
  {:json-schema/original-name "padding", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Padding"} #'Padding]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:customFormatTypes
  {:json-schema/original-name "customFormatTypes", :optional true}
  boolean?]
 [:image
  {:json-schema/original-name "image", :optional true}
  [:ref #:json-schema{:original-name "RectConfig"} #'RectConfig]]
 [:point
  {:json-schema/original-name "point", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]
 [:area
  {:json-schema/original-name "area", :optional true}
  [:ref #:json-schema{:original-name "AreaConfig"} #'AreaConfig]]
 [:headerFacet
  {:json-schema/original-name "headerFacet", :optional true}
  [:ref #:json-schema{:original-name "HeaderConfig"} #'HeaderConfig]]
 [:axis
  {:json-schema/original-name "axis", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:axisYPoint
  {:json-schema/original-name "axisYPoint", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:selection
  {:json-schema/original-name "selection", :optional true}
  [:ref
   #:json-schema{:original-name "SelectionConfig"}
   #'SelectionConfig]]
 [:rect
  {:json-schema/original-name "rect", :optional true}
  [:ref #:json-schema{:original-name "RectConfig"} #'RectConfig]]
 [:timeFormat
  {:json-schema/original-name "timeFormat", :optional true}
  string?]
 [:projection
  {:json-schema/original-name "projection", :optional true}
  [:ref
   #:json-schema{:original-name "ProjectionConfig"}
   #'ProjectionConfig]]
 [:boxplot
  {:json-schema/original-name "boxplot", :optional true}
  [:ref #:json-schema{:original-name "BoxPlotConfig"} #'BoxPlotConfig]]
 [:view
  {:json-schema/original-name "view", :optional true}
  [:ref #:json-schema{:original-name "ViewConfig"} #'ViewConfig]]
 [:range
  {:json-schema/original-name "range", :optional true}
  [:ref #:json-schema{:original-name "RangeConfig"} #'RangeConfig]]
 [:numberFormatType
  {:json-schema/original-name "numberFormatType", :optional true}
  string?]
 [:axisDiscrete
  {:json-schema/original-name "axisDiscrete", :optional true}
  [:ref #:json-schema{:original-name "AxisConfig"} #'AxisConfig]]
 [:text
  {:json-schema/original-name "text", :optional true}
  [:ref #:json-schema{:original-name "MarkConfig"} #'MarkConfig]]]
)

(def Dict_InlineDataset_
  [:map-of #:json-schema{:original-name "Dict<InlineDataset>"} any? any?]
)

(def Datasets
  [:ref #:json-schema{:original-name "Datasets"} #'Dict_InlineDataset_]
)

(def ParseValue
  [:or #:json-schema{:original-name "ParseValue"} string? nil?]
)

(def Vector2_DateTime_
  [:vector
 #:json-schema{:original-name "Vector2<DateTime>"}
 [:ref #:json-schema{:original-name "DateTime"} #'DateTime]]
)

(def Vector2_boolean_
  [:vector #:json-schema{:original-name "Vector2<boolean>"} boolean?]
)

(def SelectionInitInterval
  [:or
 #:json-schema{:original-name "SelectionInitInterval"}
 [:ref
  #:json-schema{:original-name "Vector2<boolean>"}
  #'Vector2_boolean_]
 [:ref
  #:json-schema{:original-name "Vector2<number>"}
  #'Vector2_number_]
 [:ref
  #:json-schema{:original-name "Vector2<string>"}
  #'Vector2_string_]
 [:ref
  #:json-schema{:original-name "Vector2<DateTime>"}
  #'Vector2_DateTime_]]
)

(def TopLevelConcatSpec
  [:map
 {:closed true, :json-schema/original-name "TopLevelConcatSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:autosize
  {:json-schema/original-name "autosize", :optional true}
  [:or
   [:ref #:json-schema{:original-name "AutosizeType"} #'AutosizeType]
   [:ref
    #:json-schema{:original-name "AutoSizeParams"}
    #'AutoSizeParams]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref
    #:json-schema{:original-name "RowCol<LayoutAlign>"}
    #'RowCol_LayoutAlign_]]]
 [:datasets
  {:json-schema/original-name "datasets", :optional true}
  [:ref #:json-schema{:original-name "Datasets"} #'Datasets]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:usermeta
  {:json-schema/original-name "usermeta", :optional true}
  [:ref #:json-schema{:original-name "Dict"} #'Dict]]
 [:config
  {:json-schema/original-name "config", :optional true}
  [:ref #:json-schema{:original-name "Config"} #'Config]]
 [:concat
  #:json-schema{:original-name "concat"}
  [:vector
   [:ref
    #:json-schema{:original-name "NonNormalizedSpec"}
    #'NonNormalizedSpec]]]
 [:columns
  {:json-schema/original-name "columns", :optional true}
  number?]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:background
  {:json-schema/original-name "background", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:params
  {:json-schema/original-name "params", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "TopLevelParameter"}
    #'TopLevelParameter]]]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "RowCol<boolean>"}
    #'RowCol_boolean_]]]
 [:padding
  {:json-schema/original-name "padding", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Padding"} #'Padding]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:$schema
  {:json-schema/original-name "$schema", :optional true}
  string?]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RowCol<number>"}
    #'RowCol_number_]]]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def TopLevelFacetSpec
  [:map
 {:closed true, :json-schema/original-name "TopLevelFacetSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:autosize
  {:json-schema/original-name "autosize", :optional true}
  [:or
   [:ref #:json-schema{:original-name "AutosizeType"} #'AutosizeType]
   [:ref
    #:json-schema{:original-name "AutoSizeParams"}
    #'AutoSizeParams]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref
    #:json-schema{:original-name "RowCol<LayoutAlign>"}
    #'RowCol_LayoutAlign_]]]
 [:datasets
  {:json-schema/original-name "datasets", :optional true}
  [:ref #:json-schema{:original-name "Datasets"} #'Datasets]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:usermeta
  {:json-schema/original-name "usermeta", :optional true}
  [:ref #:json-schema{:original-name "Dict"} #'Dict]]
 [:config
  {:json-schema/original-name "config", :optional true}
  [:ref #:json-schema{:original-name "Config"} #'Config]]
 [:columns
  {:json-schema/original-name "columns", :optional true}
  number?]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:facet
  #:json-schema{:original-name "facet"}
  [:or
   [:ref #:json-schema{:original-name "FacetFieldDef"} #'FacetFieldDef]
   [:ref #:json-schema{:original-name "FacetMapping"} #'FacetMapping]]]
 [:background
  {:json-schema/original-name "background", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:params
  {:json-schema/original-name "params", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "TopLevelParameter"}
    #'TopLevelParameter]]]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "RowCol<boolean>"}
    #'RowCol_boolean_]]]
 [:spec
  #:json-schema{:original-name "spec"}
  [:or
   [:ref #:json-schema{:original-name "LayerSpec"} #'LayerSpec]
   [:ref
    #:json-schema{:original-name "UnitSpecWithFrame"}
    #'UnitSpecWithFrame]]]
 [:padding
  {:json-schema/original-name "padding", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Padding"} #'Padding]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:$schema
  {:json-schema/original-name "$schema", :optional true}
  string?]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RowCol<number>"}
    #'RowCol_number_]]]
 [:data
  #:json-schema{:original-name "data"}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def TopLevelHConcatSpec
  [:map
 {:closed true, :json-schema/original-name "TopLevelHConcatSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:autosize
  {:json-schema/original-name "autosize", :optional true}
  [:or
   [:ref #:json-schema{:original-name "AutosizeType"} #'AutosizeType]
   [:ref
    #:json-schema{:original-name "AutoSizeParams"}
    #'AutoSizeParams]]]
 [:datasets
  {:json-schema/original-name "datasets", :optional true}
  [:ref #:json-schema{:original-name "Datasets"} #'Datasets]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:hconcat
  #:json-schema{:original-name "hconcat"}
  [:vector
   [:ref
    #:json-schema{:original-name "NonNormalizedSpec"}
    #'NonNormalizedSpec]]]
 [:usermeta
  {:json-schema/original-name "usermeta", :optional true}
  [:ref #:json-schema{:original-name "Dict"} #'Dict]]
 [:config
  {:json-schema/original-name "config", :optional true}
  [:ref #:json-schema{:original-name "Config"} #'Config]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:background
  {:json-schema/original-name "background", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:params
  {:json-schema/original-name "params", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "TopLevelParameter"}
    #'TopLevelParameter]]]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  boolean?]
 [:padding
  {:json-schema/original-name "padding", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Padding"} #'Padding]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:$schema
  {:json-schema/original-name "$schema", :optional true}
  string?]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  number?]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def TopLevelLayerSpec
  [:map
 {:closed true, :json-schema/original-name "TopLevelLayerSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:encoding
  {:json-schema/original-name "encoding", :optional true}
  [:ref
   #:json-schema{:original-name "SharedEncoding"}
   #'SharedEncoding]]
 [:autosize
  {:json-schema/original-name "autosize", :optional true}
  [:or
   [:ref #:json-schema{:original-name "AutosizeType"} #'AutosizeType]
   [:ref
    #:json-schema{:original-name "AutoSizeParams"}
    #'AutoSizeParams]]]
 [:datasets
  {:json-schema/original-name "datasets", :optional true}
  [:ref #:json-schema{:original-name "Datasets"} #'Datasets]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:usermeta
  {:json-schema/original-name "usermeta", :optional true}
  [:ref #:json-schema{:original-name "Dict"} #'Dict]]
 [:config
  {:json-schema/original-name "config", :optional true}
  [:ref #:json-schema{:original-name "Config"} #'Config]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "Step"} #'Step]
   [:enum "container"]]]
 [:background
  {:json-schema/original-name "background", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:params
  {:json-schema/original-name "params", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "TopLevelParameter"}
    #'TopLevelParameter]]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:layer
  #:json-schema{:original-name "layer"}
  [:vector
   [:or
    [:ref #:json-schema{:original-name "LayerSpec"} #'LayerSpec]
    [:ref #:json-schema{:original-name "UnitSpec"} #'UnitSpec]]]]
 [:padding
  {:json-schema/original-name "padding", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Padding"} #'Padding]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:$schema
  {:json-schema/original-name "$schema", :optional true}
  string?]
 [:projection
  {:json-schema/original-name "projection", :optional true}
  [:ref #:json-schema{:original-name "Projection"} #'Projection]]
 [:view
  {:json-schema/original-name "view", :optional true}
  [:ref
   #:json-schema{:original-name "ViewBackground"}
   #'ViewBackground]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "Step"} #'Step]
   [:enum "container"]]]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def TopLevelRepeatSpec
  [:or
 #:json-schema{:original-name "TopLevelRepeatSpec"}
 [:map
  {:closed true}
  [:description
   {:json-schema/original-name "description", :optional true}
   string?]
  [:autosize
   {:json-schema/original-name "autosize", :optional true}
   [:or
    [:ref #:json-schema{:original-name "AutosizeType"} #'AutosizeType]
    [:ref
     #:json-schema{:original-name "AutoSizeParams"}
     #'AutoSizeParams]]]
  [:align
   {:json-schema/original-name "align", :optional true}
   [:or
    [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
    [:ref
     #:json-schema{:original-name "RowCol<LayoutAlign>"}
     #'RowCol_LayoutAlign_]]]
  [:datasets
   {:json-schema/original-name "datasets", :optional true}
   [:ref #:json-schema{:original-name "Datasets"} #'Datasets]]
  [:transform
   {:json-schema/original-name "transform", :optional true}
   [:vector
    [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
  [:usermeta
   {:json-schema/original-name "usermeta", :optional true}
   [:ref #:json-schema{:original-name "Dict"} #'Dict]]
  [:config
   {:json-schema/original-name "config", :optional true}
   [:ref #:json-schema{:original-name "Config"} #'Config]]
  [:columns
   {:json-schema/original-name "columns", :optional true}
   number?]
  [:name {:json-schema/original-name "name", :optional true} string?]
  [:background
   {:json-schema/original-name "background", :optional true}
   [:or
    [:ref #:json-schema{:original-name "Color"} #'Color]
    [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
  [:params
   {:json-schema/original-name "params", :optional true}
   [:vector
    [:ref
     #:json-schema{:original-name "TopLevelParameter"}
     #'TopLevelParameter]]]
  [:bounds
   {:json-schema/original-name "bounds", :optional true}
   [:enum "full" "flush"]]
  [:title
   {:json-schema/original-name "title", :optional true}
   [:or
    [:ref #:json-schema{:original-name "Text"} #'Text]
    [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
  [:center
   {:json-schema/original-name "center", :optional true}
   [:or
    boolean?
    [:ref
     #:json-schema{:original-name "RowCol<boolean>"}
     #'RowCol_boolean_]]]
  [:spec
   #:json-schema{:original-name "spec"}
   [:ref
    #:json-schema{:original-name "NonNormalizedSpec"}
    #'NonNormalizedSpec]]
  [:padding
   {:json-schema/original-name "padding", :optional true}
   [:or
    [:ref #:json-schema{:original-name "Padding"} #'Padding]
    [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
  [:resolve
   {:json-schema/original-name "resolve", :optional true}
   [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
  [:repeat
   #:json-schema{:original-name "repeat"}
   [:or
    [:vector string?]
    [:ref
     #:json-schema{:original-name "RepeatMapping"}
     #'RepeatMapping]]]
  [:$schema
   {:json-schema/original-name "$schema", :optional true}
   string?]
  [:spacing
   {:json-schema/original-name "spacing", :optional true}
   [:or
    number?
    [:ref
     #:json-schema{:original-name "RowCol<number>"}
     #'RowCol_number_]]]
  [:data
   {:json-schema/original-name "data", :optional true}
   [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
 [:map
  {:closed true}
  [:description
   {:json-schema/original-name "description", :optional true}
   string?]
  [:autosize
   {:json-schema/original-name "autosize", :optional true}
   [:or
    [:ref #:json-schema{:original-name "AutosizeType"} #'AutosizeType]
    [:ref
     #:json-schema{:original-name "AutoSizeParams"}
     #'AutoSizeParams]]]
  [:align
   {:json-schema/original-name "align", :optional true}
   [:or
    [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
    [:ref
     #:json-schema{:original-name "RowCol<LayoutAlign>"}
     #'RowCol_LayoutAlign_]]]
  [:datasets
   {:json-schema/original-name "datasets", :optional true}
   [:ref #:json-schema{:original-name "Datasets"} #'Datasets]]
  [:transform
   {:json-schema/original-name "transform", :optional true}
   [:vector
    [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
  [:usermeta
   {:json-schema/original-name "usermeta", :optional true}
   [:ref #:json-schema{:original-name "Dict"} #'Dict]]
  [:config
   {:json-schema/original-name "config", :optional true}
   [:ref #:json-schema{:original-name "Config"} #'Config]]
  [:columns
   {:json-schema/original-name "columns", :optional true}
   number?]
  [:name {:json-schema/original-name "name", :optional true} string?]
  [:background
   {:json-schema/original-name "background", :optional true}
   [:or
    [:ref #:json-schema{:original-name "Color"} #'Color]
    [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
  [:params
   {:json-schema/original-name "params", :optional true}
   [:vector
    [:ref
     #:json-schema{:original-name "TopLevelParameter"}
     #'TopLevelParameter]]]
  [:bounds
   {:json-schema/original-name "bounds", :optional true}
   [:enum "full" "flush"]]
  [:title
   {:json-schema/original-name "title", :optional true}
   [:or
    [:ref #:json-schema{:original-name "Text"} #'Text]
    [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
  [:center
   {:json-schema/original-name "center", :optional true}
   [:or
    boolean?
    [:ref
     #:json-schema{:original-name "RowCol<boolean>"}
     #'RowCol_boolean_]]]
  [:spec
   #:json-schema{:original-name "spec"}
   [:or
    [:ref #:json-schema{:original-name "LayerSpec"} #'LayerSpec]
    [:ref
     #:json-schema{:original-name "UnitSpecWithFrame"}
     #'UnitSpecWithFrame]]]
  [:padding
   {:json-schema/original-name "padding", :optional true}
   [:or
    [:ref #:json-schema{:original-name "Padding"} #'Padding]
    [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
  [:resolve
   {:json-schema/original-name "resolve", :optional true}
   [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
  [:repeat
   #:json-schema{:original-name "repeat"}
   [:ref
    #:json-schema{:original-name "LayerRepeatMapping"}
    #'LayerRepeatMapping]]
  [:$schema
   {:json-schema/original-name "$schema", :optional true}
   string?]
  [:spacing
   {:json-schema/original-name "spacing", :optional true}
   [:or
    number?
    [:ref
     #:json-schema{:original-name "RowCol<number>"}
     #'RowCol_number_]]]
  [:data
   {:json-schema/original-name "data", :optional true}
   [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]]
)

(def TopLevelVConcatSpec
  [:map
 {:closed true, :json-schema/original-name "TopLevelVConcatSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:autosize
  {:json-schema/original-name "autosize", :optional true}
  [:or
   [:ref #:json-schema{:original-name "AutosizeType"} #'AutosizeType]
   [:ref
    #:json-schema{:original-name "AutoSizeParams"}
    #'AutoSizeParams]]]
 [:datasets
  {:json-schema/original-name "datasets", :optional true}
  [:ref #:json-schema{:original-name "Datasets"} #'Datasets]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:usermeta
  {:json-schema/original-name "usermeta", :optional true}
  [:ref #:json-schema{:original-name "Dict"} #'Dict]]
 [:config
  {:json-schema/original-name "config", :optional true}
  [:ref #:json-schema{:original-name "Config"} #'Config]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:background
  {:json-schema/original-name "background", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:params
  {:json-schema/original-name "params", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "TopLevelParameter"}
    #'TopLevelParameter]]]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  boolean?]
 [:padding
  {:json-schema/original-name "padding", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Padding"} #'Padding]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:$schema
  {:json-schema/original-name "$schema", :optional true}
  string?]
 [:vconcat
  #:json-schema{:original-name "vconcat"}
  [:vector
   [:ref
    #:json-schema{:original-name "NonNormalizedSpec"}
    #'NonNormalizedSpec]]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  number?]
 [:data
  {:json-schema/original-name "data", :optional true}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def TopLevelUnitSpec
  [:map
 {:closed true, :json-schema/original-name "TopLevelUnitSpec"}
 [:description
  {:json-schema/original-name "description", :optional true}
  string?]
 [:encoding
  {:json-schema/original-name "encoding", :optional true}
  [:ref
   #:json-schema{:original-name "FacetedEncoding"}
   #'FacetedEncoding]]
 [:autosize
  {:json-schema/original-name "autosize", :optional true}
  [:or
   [:ref #:json-schema{:original-name "AutosizeType"} #'AutosizeType]
   [:ref
    #:json-schema{:original-name "AutoSizeParams"}
    #'AutoSizeParams]]]
 [:align
  {:json-schema/original-name "align", :optional true}
  [:or
   [:ref #:json-schema{:original-name "LayoutAlign"} #'LayoutAlign]
   [:ref
    #:json-schema{:original-name "RowCol<LayoutAlign>"}
    #'RowCol_LayoutAlign_]]]
 [:datasets
  {:json-schema/original-name "datasets", :optional true}
  [:ref #:json-schema{:original-name "Datasets"} #'Datasets]]
 [:transform
  {:json-schema/original-name "transform", :optional true}
  [:vector
   [:ref #:json-schema{:original-name "Transform"} #'Transform]]]
 [:usermeta
  {:json-schema/original-name "usermeta", :optional true}
  [:ref #:json-schema{:original-name "Dict"} #'Dict]]
 [:config
  {:json-schema/original-name "config", :optional true}
  [:ref #:json-schema{:original-name "Config"} #'Config]]
 [:mark
  #:json-schema{:original-name "mark"}
  [:ref #:json-schema{:original-name "AnyMark"} #'AnyMark]]
 [:name {:json-schema/original-name "name", :optional true} string?]
 [:width
  {:json-schema/original-name "width", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "Step"} #'Step]
   [:enum "container"]]]
 [:background
  {:json-schema/original-name "background", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Color"} #'Color]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:params
  {:json-schema/original-name "params", :optional true}
  [:vector
   [:ref
    #:json-schema{:original-name "TopLevelParameter"}
    #'TopLevelParameter]]]
 [:bounds
  {:json-schema/original-name "bounds", :optional true}
  [:enum "full" "flush"]]
 [:title
  {:json-schema/original-name "title", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Text"} #'Text]
   [:ref #:json-schema{:original-name "TitleParams"} #'TitleParams]]]
 [:center
  {:json-schema/original-name "center", :optional true}
  [:or
   boolean?
   [:ref
    #:json-schema{:original-name "RowCol<boolean>"}
    #'RowCol_boolean_]]]
 [:padding
  {:json-schema/original-name "padding", :optional true}
  [:or
   [:ref #:json-schema{:original-name "Padding"} #'Padding]
   [:ref #:json-schema{:original-name "ExprRef"} #'ExprRef]]]
 [:resolve
  {:json-schema/original-name "resolve", :optional true}
  [:ref #:json-schema{:original-name "Resolve"} #'Resolve]]
 [:$schema
  {:json-schema/original-name "$schema", :optional true}
  string?]
 [:projection
  {:json-schema/original-name "projection", :optional true}
  [:ref #:json-schema{:original-name "Projection"} #'Projection]]
 [:view
  {:json-schema/original-name "view", :optional true}
  [:ref
   #:json-schema{:original-name "ViewBackground"}
   #'ViewBackground]]
 [:height
  {:json-schema/original-name "height", :optional true}
  [:or
   number?
   [:ref #:json-schema{:original-name "Step"} #'Step]
   [:enum "container"]]]
 [:spacing
  {:json-schema/original-name "spacing", :optional true}
  [:or
   number?
   [:ref
    #:json-schema{:original-name "RowCol<number>"}
    #'RowCol_number_]]]
 [:data
  #:json-schema{:original-name "data"}
  [:or [:ref #:json-schema{:original-name "Data"} #'Data] nil?]]]
)

(def TopLevelSpec
  [:or
 #:json-schema{:original-name "TopLevelSpec"}
 [:ref
  #:json-schema{:original-name "TopLevelUnitSpec"}
  #'TopLevelUnitSpec]
 [:ref
  #:json-schema{:original-name "TopLevelFacetSpec"}
  #'TopLevelFacetSpec]
 [:ref
  #:json-schema{:original-name "TopLevelLayerSpec"}
  #'TopLevelLayerSpec]
 [:ref
  #:json-schema{:original-name "TopLevelRepeatSpec"}
  #'TopLevelRepeatSpec]
 [:ref
  #:json-schema{:original-name "TopLevelConcatSpec"}
  #'TopLevelConcatSpec]
 [:ref
  #:json-schema{:original-name "TopLevelVConcatSpec"}
  #'TopLevelVConcatSpec]
 [:ref
  #:json-schema{:original-name "TopLevelHConcatSpec"}
  #'TopLevelHConcatSpec]]
)

;; Top Level Schema
(def schema
  [:ref #:json-schema{:original-name "TopLevelSpec"} #'TopLevelSpec]
)