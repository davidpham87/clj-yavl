(ns clj-yavl.schema.vega-lite
  (:require [malli.core :as m]))

;; Forward declarations
(declare PivotTransform LogicalNot_Predicate_ ScaleInvalidDataShowAs__strokeWidth__ Type ConditionalParameter_MarkPropFieldOrDatumDef_ Encoding ErrorBar GraticuleGenerator StackOffset TopLevelRepeatSpec Position2Def Expr MarkPropDef_number_ TopLevelVConcatSpec FieldName GeoJsonProperties Vector2_string_ Categorical ProjectionType StringValueDefWithCondition LayoutAlign FieldEqualPredicate StrokeJoin ScaleInterpolateParams ScaleFieldDef FontStyle InlineData DataSource MarkPropDef__Gradient_string_null__ NonNormalizedSpec SelectionParameter SelectionInitIntervalMapping Gradient DensityTransform LogicalOr_Predicate_ CsvDataFormat FoldTransform FieldOrDatumDefWithCondition_MarkPropFieldDef__Gradient_string_null__ RangeConfig LegendBinding OrderValueDef Blend LegendConfig FieldOrDatumDefWithCondition_StringDatumDef_Text_ ScaleInvalidDataShowAs__angle__ ScaleResolveMap Cursor Position FacetEncodingFieldDef ScaleInvalidDataShowAs__radius__ ConditionalAxisProperty__Align_null__ Vector2_DateTime_ Cyclical RangeScheme FieldOrDatumDefWithCondition_MarkPropFieldDef_number___ ConditionalAxisProperty__number_null__ ScaleInvalidDataShowAsValue__strokeDash__ TextDirection ConditionalPredicate_ValueDef__Gradient_string_null_ExprRef___ ConditionalAxisColor ErrorBandDef Projection DateTime ScaleInvalidDataShowAsValue__stroke__ JsonDataFormat Dict SingleDefUnitChannel ScaleInvalidDataShowAsValue__strokeWidth__ IntervalSelectionConfig ConditionalParameter_ValueDef__Gradient_string_null_ExprRef___ BindCheckbox SequenceGenerator ScaleInvalidDataShowAs__strokeOpacity__ TimeLocale ParseValue PositionDatumDefBase ScaleInvalidDataShowAsValue__yOffset__ OverlayMarkDef TimeIntervalStep BinParams WindowTransform BinnedTimeUnit Polygon NamedData StandardType ConditionalAxisLabelAlign ConditionalAxisProperty__string_null__ Orientation Vector12_string_ ScaleInvalidDataShowAsValue__time__ AggregateTransform TopoDataFormat Parse HConcatSpec_GenericSpec_ LineString LocalMultiTimeUnit FieldOrDatumDefWithCondition_DatumDef_number___ Color TickCount ScaleInvalidDataShowAsValue__opacity__)
(declare SelectionConfig ScaleInvalidDataConfig MultiTimeUnit UtcSingleTimeUnit ImputeMethod ConditionalParameter_ValueDef__number___ExprRef___ FieldOrDatumDefWithCondition_StringFieldDef_Text_ PositionFieldDefBase LocalSingleTimeUnit SelectionResolution AggregatedFieldDef ConditionalParameter_ValueDef__string_ExprRef___ ConditionalAxisProperty__TextBaseline_null__ FieldGTEPredicate ConditionalValueDef__Gradient_string_null_ExprRef__ FilterTransform SchemeParams EventType ColorName RowCol_number_ ScaleInvalidDataShowAs__yOffset__ ValueDefWithCondition_StringFieldDef_Text_ NumericArrayMarkPropDef DomainUnionWith ConditionalAxisLabelBaseline TimeInterval ConditionalAxisProperty__FontStyle_null__ ProjectionConfig ConditionalPredicate__ValueDef__Align_null___ExprRef__ ConditionalPredicate__ValueDef__number_null___ExprRef__ PrimitiveValue FieldOrDatumDefWithCondition_StringFieldDef_string_ RowColumnEncodingFieldDef JoinAggregateFieldDef ValueDef_number_ ExtentTransform SingleTimeUnit TopLevelUnitSpec BindRadioSelect ColorScheme TimeFieldDef FlattenTransform JoinAggregateTransform SecondaryFieldDef ConditionalPredicate__ValueDef__string_null___ExprRef__ SequentialMultiHue UnitSpecWithFrame GenericUnitSpec_Encoding_AnyMark_ RelativeBandSize ConditionalMarkPropFieldOrDatumDef ImputeSequence ValueDefWithCondition_MarkPropFieldOrDatumDef__string_null__ AutosizeType GeometryCollection TitleFrame ScaleInvalidDataShowAs__fill__ FieldValidPredicate BBox Axis ConditionalPredicate_ValueDef__string_ExprRef___ ScaleInvalidDataShowAs__theta__ LineConfig PositionValueDef Step ParameterName TopLevelParameter BaseTitleNoValueRefs HexColor BoxPlotConfig WindowOnlyOp Config FieldGTPredicate Align IntervalSelectionConfigWithoutType FieldRangePredicate ConditionalParameter_ValueDef__number_ExprRef___ BindDirect TitleAnchor ScaleInvalidDataShowAs__time__ TopLevelConcatSpec ConditionalParameter_StringFieldDef_ PositionFieldDef Orient ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__ PositionDatumDef ConditionalValueDef__string_ExprRef__ ConditionalParameter_ValueDef__Text_ExprRef___ RepeatMapping ArgminDef EncodingSortField HeaderConfig Spec Interpolate ConditionalPredicate__ValueDef__Color_null___ExprRef__ FeatureCollection Header SortByChannel LookupTransform ErrorBarConfig ScaleInvalidDataShowAsValue__angle__)
(declare RangeEnum UrlData ScaleBins TopLevelSpec ConditionalPredicate_MarkPropFieldOrDatumDef_ ScaleInvalidDataShowAsValue__y__ BinExtent FacetFieldDef LoessTransform SelectionInitInterval CompositionConfig TopLevelLayerSpec TextBaseline ConditionalPredicate_ValueDef__Text_ExprRef___ ConditionalValueDef__Text_ExprRef__ ConditionalParameter_MarkPropFieldOrDatumDef_TypeForShape__ ConditionalParameter_ValueDef__string_null_ExprRef___ ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__ TypeForShape RepeatSpec ConditionalAxisProperty__FontWeight_null__ PointSelectionConfig Feature Predicate ResolveMode CalculateTransform SharedEncoding BindInput AnyMarkConfig StackTransform TimeUnitTransformParams ValueDefWithCondition_MarkPropFieldOrDatumDef_TypeForShape___string_null__ QuantileTransform InlineDataset Data ScaleInvalidDataShowAs__color__ ScaleInvalidDataShowAsValue__strokeOpacity__ ScaleInvalidDataShowAsValue__x__ Field TopLevelSelectionParameter Transform LegendResolveMap BoxPlotDef ConditionalPredicate_MarkPropFieldOrDatumDef_TypeForShape__ ConditionalAxisLabelFontStyle LabelOverlap ConditionalAxisLabelFontWeight Element Scale LegendOrient Sort ErrorBandConfig ScaleInvalidDataShowAsValue__shape__ OffsetDef TooltipContent ScaleInvalidDataShowAsValue__theta__ Generator FieldOrDatumDefWithCondition_MarkPropFieldDef_number_ FacetSpec GraticuleParams NonArgAggregateOp AutoSizeParams TextDef FieldOrDatumDefWithCondition_DatumDef__string_null__ GeoJsonFeature SphereGenerator TimeUnitTransform ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__ MarkDef FieldDefWithoutScale Resolve StrokeCap TopLevelHConcatSpec CompositeMark Padding SequenceParams LegendStreamBinding AnyMark ScaleInterpolateEnum Geometry Day ValueDefWithCondition_MarkPropFieldOrDatumDef_number___ ImputeParams Vector2_boolean_ LogicalAnd_Predicate_ ScaleInvalidDataShowAsValue__radius__ OrderOnlyDef Vector7_string_ ConditionalValueDef__number_ExprRef__ BindRange FieldLTEPredicate Diverging RectConfig ScaleInvalidDataShowAs__size__ DatumDef SortArray Mark Binding ConditionalPredicate__ValueDef__number___null___ExprRef__ ViewBackground)
(declare ScaleInvalidDataShowAs__shape__ NumericMarkPropDef ConditionalAxisProperty__Color_null__ DsvDataFormat VariableParameter Aggregate ConditionalAxisProperty__number___null__ EventStream Dict_SelectionInitInterval_ ScaleInvalidDataShowAs__stroke__ ScaleInvalidDataShowAs__xOffset__ ErrorBarDef LatLongFieldDef FacetedUnitSpec MarkType AxisConfig PolarDef ValueDefWithCondition_MarkPropFieldOrDatumDef_number_ SortByEncoding SelectionInit ConditionalValueDef__number___ExprRef__ ValueDefWithCondition_MarkPropFieldOrDatumDef__Gradient_string_null__ Baseline ConditionalValueDef__string_null_ExprRef__ ConditionalPredicate_ValueDef_number__ Point TimeUnitParams ConditionalStringFieldDef FormatConfig TimeFormatSpecifier VConcatSpec_GenericSpec_ FieldOrDatumDefWithCondition_DatumDef_number_ SortField Vector10_string_ AxisOrient TitleOrient RowCol_LayoutAlign_ BinTransform Vector3_number_ Dict_SelectionInit_ RangeRaw Format SymbolShape ScaleDatumDef ColorDef ConditionalAxisNumber UtcMultiTimeUnit Locale ErrorBand ScaleInvalidDataShowAs__strokeDash__ ErrorBarExtent UnitSpec TitleParams ConditionalPredicate_ValueDef__number_ExprRef___ MultiPolygon MultiLineString FacetedEncoding FieldRange Feature_Geometry_GeoJsonProperties_ LatLongDef FontWeight ScaleInvalidDataShowAs__y__ SelectionType TimeDef ConditionalValueDef_number_ DataFormat ScaleInvalidDataShowAs__x__ URI GeoJsonFeatureCollection CompositeMarkDef TypedFieldDef RadialGradient ScaleInvalidDataShowAsValue__size__ PointSelectionConfigWithoutType Month ArgmaxDef ScaleInvalidDataShowAs__fillOpacity__ StringFieldDefWithCondition OrderFieldDef FieldOrDatumDefWithCondition_MarkPropFieldDef_TypeForShape___string_null__ BrushConfig ScaleInvalidDataShowAsValue__xOffset__ ScaleInvalidDataShowAs__opacity__ LinearGradient TickConfig ScaleType FacetMapping ViewConfig ConditionalPredicate_StringFieldDef_ StringFieldDef ConcatSpec_GenericSpec_ LayerSpec ValueDef__number__width___height__ExprRef__ BarConfig MarkPropDef__string_null__TypeForShape_ LookupData Stream GradientStop SortByChannelDesc ScaleInvalidDataShowAsValue__color__)
(declare WindowFieldDef LookupSelection MarkInvalidDataMode ConditionalMarkPropFieldOrDatumDef_TypeForShape_ ShapeDef SampleTransform StepFor ConditionalAxisNumberArray Text FieldLTPredicate NonLayerRepeatSpec SelectionInitMapping SortOrder ConditionalPredicate_ValueDef__number___ExprRef___ NumberLocale Legend ParameterPredicate Datasets FieldOrDatumDefWithCondition_DatumDef__Gradient_string_null__ Vector2_Vector2_number__ StyleConfigIndex AxisResolveMap ScaleBinParams TimeUnit MultiPoint RepeatRef DerivedStream PredicateComposition FieldOneOfPredicate ExprRef MarkConfig AllSortString PositionDef RangeRawArray Vector2_number_ RowCol_boolean_ ScaleConfig Fit MergedStream AreaConfig ConditionalParameter_ValueDef_number__ WindowEventType RegressionTransform BoxPlot Dict_InlineDataset_ TopLevelFacetSpec AggregateOp LayerRepeatMapping ScaleInvalidDataShowAsValue__fillOpacity__ ImputeTransform ConditionalPredicate_ValueDef__string_null_ExprRef___ ScaleInvalidDataShowAsValue__fill__ MarkPropDef_number___ ConditionalAxisString SequentialSingleHue TitleConfig ParameterExtent LayerRepeatSpec)

;; Registry definitions
(def PivotTransform
  [:map
 {:closed true}
 [:groupby {:optional true} [:vector [:ref #'FieldName]]]
 [:limit {:optional true} number?]
 [:op {:optional true} [:ref #'AggregateOp]]
 [:pivot [:ref #'FieldName]]
 [:value [:ref #'FieldName]]]
)

(def LogicalNot_Predicate_
  [:map {:closed true} [:not [:ref #'PredicateComposition]]]
)

(def ScaleInvalidDataShowAs__strokeWidth__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__strokeWidth__]
 [:enum "zero-or-min"]]
)

(def Type
  [:enum "quantitative" "ordinal" "temporal" "nominal" "geojson"]
)

(def ConditionalParameter_MarkPropFieldOrDatumDef_
  [:or
 [:map
  {:closed true}
  [:scale {:optional true} [:or [:ref #'Scale] nil?]]
  [:legend {:optional true} [:or [:ref #'Legend] nil?]]
  [:field {:optional true} [:ref #'Field]]
  [:type {:optional true} [:ref #'StandardType]]
  [:empty {:optional true} boolean?]
  [:param [:ref #'ParameterName]]
  [:title {:optional true} [:or [:ref #'Text] nil?]]
  [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
  [:bandPosition {:optional true} number?]
  [:timeUnit
   {:optional true}
   [:or
    [:ref #'TimeUnit]
    [:ref #'BinnedTimeUnit]
    [:ref #'TimeUnitParams]]]
  [:aggregate {:optional true} [:ref #'Aggregate]]
  [:sort {:optional true} [:ref #'Sort]]]
 [:map
  {:closed true}
  [:bandPosition {:optional true} number?]
  [:datum
   {:optional true}
   [:or
    [:ref #'PrimitiveValue]
    [:ref #'DateTime]
    [:ref #'ExprRef]
    [:ref #'RepeatRef]]]
  [:empty {:optional true} boolean?]
  [:legend {:optional true} [:or [:ref #'Legend] nil?]]
  [:param [:ref #'ParameterName]]
  [:scale {:optional true} [:or [:ref #'Scale] nil?]]
  [:title {:optional true} [:or [:ref #'Text] nil?]]
  [:type {:optional true} [:ref #'Type]]]]
)

(def Encoding
  [:map
 {:closed true}
 [:y {:optional true} [:ref #'PositionDef]]
 [:description
  {:optional true}
  [:or
   [:ref #'StringFieldDefWithCondition]
   [:ref #'StringValueDefWithCondition]]]
 [:strokeOpacity {:optional true} [:ref #'NumericMarkPropDef]]
 [:xError2
  {:optional true}
  [:or [:ref #'SecondaryFieldDef] [:ref #'ValueDef_number_]]]
 [:stroke {:optional true} [:ref #'ColorDef]]
 [:color {:optional true} [:ref #'ColorDef]]
 [:key {:optional true} [:ref #'FieldDefWithoutScale]]
 [:longitude2 {:optional true} [:ref #'Position2Def]]
 [:fill {:optional true} [:ref #'ColorDef]]
 [:strokeDash {:optional true} [:ref #'NumericArrayMarkPropDef]]
 [:time {:optional true} [:ref #'TimeDef]]
 [:longitude {:optional true} [:ref #'LatLongDef]]
 [:fillOpacity {:optional true} [:ref #'NumericMarkPropDef]]
 [:angle {:optional true} [:ref #'NumericMarkPropDef]]
 [:theta {:optional true} [:ref #'PolarDef]]
 [:radius {:optional true} [:ref #'PolarDef]]
 [:theta2 {:optional true} [:ref #'Position2Def]]
 [:size {:optional true} [:ref #'NumericMarkPropDef]]
 [:yError
  {:optional true}
  [:or [:ref #'SecondaryFieldDef] [:ref #'ValueDef_number_]]]
 [:strokeWidth {:optional true} [:ref #'NumericMarkPropDef]]
 [:opacity {:optional true} [:ref #'NumericMarkPropDef]]
 [:shape {:optional true} [:ref #'ShapeDef]]
 [:url
  {:optional true}
  [:or
   [:ref #'StringFieldDefWithCondition]
   [:ref #'StringValueDefWithCondition]]]
 [:latitude {:optional true} [:ref #'LatLongDef]]
 [:order
  {:optional true}
  [:or
   [:ref #'OrderFieldDef]
   [:ref #'OrderValueDef]
   [:ref #'OrderOnlyDef]
   [:vector [:ref #'OrderFieldDef]]]]
 [:xError
  {:optional true}
  [:or [:ref #'SecondaryFieldDef] [:ref #'ValueDef_number_]]]
 [:yError2
  {:optional true}
  [:or [:ref #'SecondaryFieldDef] [:ref #'ValueDef_number_]]]
 [:yOffset {:optional true} [:ref #'OffsetDef]]
 [:x {:optional true} [:ref #'PositionDef]]
 [:y2 {:optional true} [:ref #'Position2Def]]
 [:radius2 {:optional true} [:ref #'Position2Def]]
 [:x2 {:optional true} [:ref #'Position2Def]]
 [:latitude2 {:optional true} [:ref #'Position2Def]]
 [:href
  {:optional true}
  [:or
   [:ref #'StringFieldDefWithCondition]
   [:ref #'StringValueDefWithCondition]]]
 [:tooltip
  {:optional true}
  [:or
   [:ref #'StringFieldDefWithCondition]
   [:ref #'StringValueDefWithCondition]
   [:vector [:ref #'StringFieldDef]]
   nil?]]
 [:text {:optional true} [:ref #'TextDef]]
 [:xOffset {:optional true} [:ref #'OffsetDef]]
 [:detail
  {:optional true}
  [:or
   [:ref #'FieldDefWithoutScale]
   [:vector [:ref #'FieldDefWithoutScale]]]]]
)

(def ErrorBar
  [:= "errorbar"]
)

(def GraticuleGenerator
  [:map
 {:closed true}
 [:graticule [:or [:ref #'GraticuleParams] [:enum true]]]
 [:name {:optional true} string?]]
)

(def StackOffset
  [:enum "zero" "center" "normalize"]
)

(def TopLevelRepeatSpec
  [:or
 [:map
  {:closed true}
  [:description {:optional true} string?]
  [:autosize
   {:optional true}
   [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
  [:align
   {:optional true}
   [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
  [:datasets {:optional true} [:ref #'Datasets]]
  [:transform {:optional true} [:vector [:ref #'Transform]]]
  [:usermeta {:optional true} [:ref #'Dict]]
  [:config {:optional true} [:ref #'Config]]
  [:columns {:optional true} number?]
  [:name {:optional true} string?]
  [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
  [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
  [:bounds {:optional true} [:enum "full" "flush"]]
  [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
  [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
  [:spec [:ref #'NonNormalizedSpec]]
  [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
  [:resolve {:optional true} [:ref #'Resolve]]
  [:repeat [:or [:vector string?] [:ref #'RepeatMapping]]]
  [:$schema {:optional true} string?]
  [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]
  [:data {:optional true} [:or [:ref #'Data] nil?]]]
 [:map
  {:closed true}
  [:description {:optional true} string?]
  [:autosize
   {:optional true}
   [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
  [:align
   {:optional true}
   [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
  [:datasets {:optional true} [:ref #'Datasets]]
  [:transform {:optional true} [:vector [:ref #'Transform]]]
  [:usermeta {:optional true} [:ref #'Dict]]
  [:config {:optional true} [:ref #'Config]]
  [:columns {:optional true} number?]
  [:name {:optional true} string?]
  [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
  [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
  [:bounds {:optional true} [:enum "full" "flush"]]
  [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
  [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
  [:spec [:or [:ref #'LayerSpec] [:ref #'UnitSpecWithFrame]]]
  [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
  [:resolve {:optional true} [:ref #'Resolve]]
  [:repeat [:ref #'LayerRepeatMapping]]
  [:$schema {:optional true} string?]
  [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]
  [:data {:optional true} [:or [:ref #'Data] nil?]]]]
)

(def Position2Def
  [:or
 [:ref #'SecondaryFieldDef]
 [:ref #'DatumDef]
 [:ref #'PositionValueDef]]
)

(def Expr
  string?
)

(def MarkPropDef_number_
  [:or
 [:ref #'FieldOrDatumDefWithCondition_MarkPropFieldDef_number_]
 [:ref #'FieldOrDatumDefWithCondition_DatumDef_number_]
 [:ref #'ValueDefWithCondition_MarkPropFieldOrDatumDef_number_]]
)

(def TopLevelVConcatSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:autosize
  {:optional true}
  [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
 [:datasets {:optional true} [:ref #'Datasets]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:usermeta {:optional true} [:ref #'Dict]]
 [:config {:optional true} [:ref #'Config]]
 [:name {:optional true} string?]
 [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} boolean?]
 [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:$schema {:optional true} string?]
 [:vconcat [:vector [:ref #'NonNormalizedSpec]]]
 [:spacing {:optional true} number?]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def FieldName
  string?
)

(def GeoJsonProperties
  [:or [:map-of any? any?] nil?]
)

(def Vector2_string_
  [:vector string?]
)

(def Categorical
  [:enum
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

(def ProjectionType
  [:enum
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

(def StringValueDefWithCondition
  [:ref #'ValueDefWithCondition_MarkPropFieldOrDatumDef__string_null__]
)

(def LayoutAlign
  [:enum "all" "each" "none"]
)

(def FieldEqualPredicate
  [:map
 {:closed true}
 [:equal
  [:or string? number? boolean? [:ref #'DateTime] [:ref #'ExprRef]]]
 [:field [:ref #'FieldName]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]]
)

(def StrokeJoin
  [:enum "miter" "round" "bevel"]
)

(def ScaleInterpolateParams
  [:map
 {:closed true}
 [:gamma {:optional true} number?]
 [:type [:enum "rgb" "cubehelix" "cubehelix-long"]]]
)

(def ScaleFieldDef
  [:map
 {:closed true}
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:sort {:optional true} [:ref #'Sort]]]
)

(def FontStyle
  string?
)

(def InlineData
  [:map
 {:closed true}
 [:format {:optional true} [:ref #'DataFormat]]
 [:name {:optional true} string?]
 [:values [:ref #'InlineDataset]]]
)

(def DataSource
  [:or [:ref #'UrlData] [:ref #'InlineData] [:ref #'NamedData]]
)

(def MarkPropDef__Gradient_string_null__
  [:or
 [:ref
  #'FieldOrDatumDefWithCondition_MarkPropFieldDef__Gradient_string_null__]
 [:ref #'FieldOrDatumDefWithCondition_DatumDef__Gradient_string_null__]
 [:ref
  #'ValueDefWithCondition_MarkPropFieldOrDatumDef__Gradient_string_null__]]
)

(def NonNormalizedSpec
  [:ref #'Spec]
)

(def SelectionParameter
  [:map
 {:closed true}
 [:bind
  {:optional true}
  [:or
   [:ref #'Binding]
   [:ref #'LegendBinding]
   [:map-of any? any?]
   [:enum "scales"]]]
 [:name [:ref #'ParameterName]]
 [:select
  [:or
   [:ref #'SelectionType]
   [:ref #'PointSelectionConfig]
   [:ref #'IntervalSelectionConfig]]]
 [:value
  {:optional true}
  [:or
   [:ref #'SelectionInit]
   [:ref #'SelectionInitIntervalMapping]
   [:vector [:ref #'SelectionInitMapping]]]]]
)

(def SelectionInitIntervalMapping
  [:ref #'Dict_SelectionInitInterval_]
)

(def Gradient
  [:or [:ref #'LinearGradient] [:ref #'RadialGradient]]
)

(def DensityTransform
  [:map
 {:closed true}
 [:maxsteps {:optional true} number?]
 [:cumulative {:optional true} boolean?]
 [:counts {:optional true} boolean?]
 [:as {:optional true} [:vector [:ref #'FieldName]]]
 [:steps {:optional true} number?]
 [:bandwidth {:optional true} number?]
 [:minsteps {:optional true} number?]
 [:groupby {:optional true} [:vector [:ref #'FieldName]]]
 [:extent {:optional true} [:vector number?]]
 [:resolve {:optional true} [:enum "independent" "shared"]]
 [:density [:ref #'FieldName]]]
)

(def LogicalOr_Predicate_
  [:map {:closed true} [:or [:vector [:ref #'PredicateComposition]]]]
)

(def CsvDataFormat
  [:map
 {:closed true}
 [:parse {:optional true} [:or [:ref #'Parse] nil?]]
 [:type {:optional true} [:enum "csv" "tsv"]]]
)

(def FoldTransform
  [:map
 {:closed true}
 [:as {:optional true} [:vector [:ref #'FieldName]]]
 [:fold [:vector [:ref #'FieldName]]]]
)

(def FieldOrDatumDefWithCondition_MarkPropFieldDef__Gradient_string_null__
  [:map
 {:closed true}
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:legend {:optional true} [:or [:ref #'Legend] nil?]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]
   [:vector
    [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]
 [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:sort {:optional true} [:ref #'Sort]]]
)

(def RangeConfig
  [:map
 {:closed false}
 [:category
  {:optional true}
  [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
 [:diverging
  {:optional true}
  [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
 [:heatmap
  {:optional true}
  [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
 [:ordinal
  {:optional true}
  [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
 [:ramp
  {:optional true}
  [:or [:ref #'RangeScheme] [:vector [:ref #'Color]]]]
 [:symbol {:optional true} [:vector [:ref #'SymbolShape]]]]
)

(def LegendBinding
  [:or [:ref #'LegendStreamBinding] [:enum "legend"]]
)

(def OrderValueDef
  [:map
 {:closed true}
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef_number_]
   [:vector [:ref #'ConditionalValueDef_number_]]]]
 [:value [:or number? [:ref #'ExprRef]]]]
)

(def Blend
  [:enum
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

(def LegendConfig
  [:map
 {:closed true}
 [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:disable {:optional true} boolean?]
 [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:symbolDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:gridAlign
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'ExprRef]]]
 [:symbolSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:gradientDirection
  {:optional true}
  [:or [:ref #'Orientation] [:ref #'ExprRef]]]
 [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:gradientOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelBaseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:titleFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:labelOverlap
  {:optional true}
  [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
 [:gradientStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:gradientThickness {:optional true} [:or number? [:ref #'ExprRef]]]
 [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:layout {:optional true} [:ref #'ExprRef]]
 [:labelOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:columns {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:columnPadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:clipHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:gradientVerticalMaxLength {:optional true} number?]
 [:titleBaseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:symbolDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:unselectedOpacity {:optional true} number?]
 [:labelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'LegendOrient]]
 [:gradientLabelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleAnchor
  {:optional true}
  [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
 [:gradientStrokeColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:labelColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:title {:optional true} nil?]
 [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:symbolFillColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:gradientVerticalMinLength {:optional true} number?]
 [:titleOrient {:optional true} [:or [:ref #'Orient] [:ref #'ExprRef]]]
 [:tickCount
  {:optional true}
  [:or [:ref #'TickCount] [:ref #'ExprRef]]]
 [:symbolDirection
  {:optional true}
  [:or [:ref #'Orientation] [:ref #'ExprRef]]]
 [:titleColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:symbolOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:gradientHorizontalMaxLength {:optional true} number?]
 [:symbolBaseFillColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:legendX {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:symbolOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:gradientLength {:optional true} [:or number? [:ref #'ExprRef]]]
 [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:strokeColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:gradientLabelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:symbolStrokeColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:rowPadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:symbolType
  {:optional true}
  [:or [:ref #'SymbolShape] [:ref #'ExprRef]]]
 [:labelFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:symbolBaseStrokeColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:labelFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:gradientHorizontalMinLength {:optional true} number?]
 [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fillColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:zindex {:optional true} [:or number? [:ref #'ExprRef]]]
 [:direction {:optional true} [:ref #'Orientation]]
 [:symbolStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:legendY {:optional true} [:or number? [:ref #'ExprRef]]]
 [:symbolLimit {:optional true} [:or number? [:ref #'ExprRef]]]]
)

(def FieldOrDatumDefWithCondition_StringDatumDef_Text_
  [:map
 {:closed true}
 [:bandPosition {:optional true} number?]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__Text_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__Text_ExprRef__]]]]
 [:datum
  {:optional true}
  [:or
   [:ref #'PrimitiveValue]
   [:ref #'DateTime]
   [:ref #'ExprRef]
   [:ref #'RepeatRef]]]
 [:format {:optional true} [:ref #'Format]]
 [:formatType {:optional true} string?]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'Type]]]
)

(def ScaleInvalidDataShowAs__angle__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__angle__]
 [:enum "zero-or-min"]]
)

(def ScaleResolveMap
  [:map
 {:closed true}
 [:y {:optional true} [:ref #'ResolveMode]]
 [:strokeOpacity {:optional true} [:ref #'ResolveMode]]
 [:stroke {:optional true} [:ref #'ResolveMode]]
 [:color {:optional true} [:ref #'ResolveMode]]
 [:fill {:optional true} [:ref #'ResolveMode]]
 [:strokeDash {:optional true} [:ref #'ResolveMode]]
 [:time {:optional true} [:ref #'ResolveMode]]
 [:fillOpacity {:optional true} [:ref #'ResolveMode]]
 [:angle {:optional true} [:ref #'ResolveMode]]
 [:theta {:optional true} [:ref #'ResolveMode]]
 [:radius {:optional true} [:ref #'ResolveMode]]
 [:size {:optional true} [:ref #'ResolveMode]]
 [:strokeWidth {:optional true} [:ref #'ResolveMode]]
 [:opacity {:optional true} [:ref #'ResolveMode]]
 [:shape {:optional true} [:ref #'ResolveMode]]
 [:yOffset {:optional true} [:ref #'ResolveMode]]
 [:x {:optional true} [:ref #'ResolveMode]]
 [:xOffset {:optional true} [:ref #'ResolveMode]]]
)

(def Cursor
  [:enum
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

(def Position
  [:vector number?]
)

(def FacetEncodingFieldDef
  [:map
 {:closed true}
 [:align
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
 [:columns {:optional true} number?]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:header {:optional true} [:or [:ref #'Header] nil?]]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
 [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:sort
  {:optional true}
  [:or
   [:ref #'SortArray]
   [:ref #'SortOrder]
   [:ref #'EncodingSortField]
   nil?]]
 [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]]
)

(def ScaleInvalidDataShowAs__radius__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__radius__]
 [:enum "zero-or-min"]]
)

(def ConditionalAxisProperty__Align_null__
  [:or
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]
    [:vector
     [:ref #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]]]]
  [:value [:or [:ref #'Align] nil?]]]
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]
    [:vector
     [:ref #'ConditionalPredicate__ValueDef__Align_null___ExprRef__]]]]
  [:expr string?]]]
)

(def Vector2_DateTime_
  [:vector [:ref #'DateTime]]
)

(def Cyclical
  [:enum "rainbow" "sinebow"]
)

(def RangeScheme
  [:or
 [:ref #'RangeEnum]
 [:ref #'RangeRaw]
 [:map
  {:closed true}
  [:count {:optional true} number?]
  [:extent {:optional true} [:vector number?]]
  [:scheme [:or string? [:vector string?] [:ref #'ColorScheme]]]]]
)

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_number___
  [:map
 {:closed true}
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:legend {:optional true} [:or [:ref #'Legend] nil?]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__number___ExprRef__]
   [:vector [:ref #'ConditionalValueDef__number___ExprRef__]]]]
 [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:sort {:optional true} [:ref #'Sort]]]
)

(def ConditionalAxisProperty__number_null__
  [:or
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__number_null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__number_null___ExprRef__]]]]
  [:value [:or number? nil?]]]
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__number_null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__number_null___ExprRef__]]]]
  [:expr string?]]]
)

(def ScaleInvalidDataShowAsValue__strokeDash__
  [:map {:closed true} [:value {:optional true} [:vector number?]]]
)

(def TextDirection
  [:enum "ltr" "rtl"]
)

(def ConditionalPredicate_ValueDef__Gradient_string_null_ExprRef___
  [:map
 {:closed true}
 [:test [:ref #'PredicateComposition]]
 [:value [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]]
)

(def ConditionalAxisColor
  [:ref #'ConditionalAxisProperty__Color_null__]
)

(def ErrorBandDef
  [:map
 {:closed true}
 [:clip {:optional true} boolean?]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:tension {:optional true} number?]
 [:band {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:type [:ref #'ErrorBand]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:interpolate {:optional true} [:ref #'Interpolate]]
 [:borders {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:opacity {:optional true} number?]
 [:extent {:optional true} [:ref #'ErrorBarExtent]]]
)

(def Projection
  [:map
 {:closed true}
 [:clipExtent
  {:optional true}
  [:or [:ref #'Vector2_Vector2_number__] [:ref #'ExprRef]]]
 [:reflectY {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:fit
  {:optional true}
  [:or [:ref #'Fit] [:ref #'ExprRef] [:vector [:ref #'Fit]]]]
 [:scale {:optional true} [:or number? [:ref #'ExprRef]]]
 [:parallel {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fraction {:optional true} [:or number? [:ref #'ExprRef]]]
 [:precision {:optional true} [:or number? [:ref #'ExprRef]]]
 [:type
  {:optional true}
  [:or [:ref #'ProjectionType] [:ref #'ExprRef]]]
 [:tilt {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:size
  {:optional true}
  [:or [:ref #'Vector2_number_] [:ref #'ExprRef]]]
 [:clipAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:center
  {:optional true}
  [:or [:ref #'Vector2_number_] [:ref #'ExprRef]]]
 [:pointRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:lobes {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ratio {:optional true} [:or number? [:ref #'ExprRef]]]
 [:extent
  {:optional true}
  [:or [:ref #'Vector2_Vector2_number__] [:ref #'ExprRef]]]
 [:coefficient {:optional true} [:or number? [:ref #'ExprRef]]]
 [:translate
  {:optional true}
  [:or [:ref #'Vector2_number_] [:ref #'ExprRef]]]
 [:rotate
  {:optional true}
  [:or
   [:or [:ref #'Vector2_number_] [:ref #'Vector3_number_]]
   [:ref #'ExprRef]]]
 [:distance {:optional true} [:or number? [:ref #'ExprRef]]]
 [:parallels {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
 [:reflectX {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:spacing {:optional true} [:or number? [:ref #'ExprRef]]]]
)

(def DateTime
  [:map
 {:closed true}
 [:quarter {:optional true} number?]
 [:day {:optional true} [:or [:ref #'Day] string?]]
 [:date {:optional true} number?]
 [:utc {:optional true} boolean?]
 [:month {:optional true} [:or [:ref #'Month] string?]]
 [:seconds {:optional true} number?]
 [:year {:optional true} number?]
 [:hours {:optional true} number?]
 [:milliseconds {:optional true} number?]
 [:minutes {:optional true} number?]]
)

(def ScaleInvalidDataShowAsValue__stroke__
  [:map
 {:closed true}
 [:value {:optional true} [:or [:ref #'Color] [:ref #'Gradient] nil?]]]
)

(def JsonDataFormat
  [:map
 {:closed true}
 [:parse {:optional true} [:or [:ref #'Parse] nil?]]
 [:property {:optional true} string?]
 [:type {:optional true} [:= "json"]]]
)

(def Dict
  [:map-of any? any?]
)

(def SingleDefUnitChannel
  [:enum
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

(def ScaleInvalidDataShowAsValue__strokeWidth__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def IntervalSelectionConfig
  [:map
 {:closed true}
 [:zoom {:optional true} [:or string? boolean?]]
 [:mark {:optional true} [:ref #'BrushConfig]]
 [:fields {:optional true} [:vector [:ref #'FieldName]]]
 [:type [:= "interval"]]
 [:encodings {:optional true} [:vector [:ref #'SingleDefUnitChannel]]]
 [:resolve {:optional true} [:ref #'SelectionResolution]]
 [:translate {:optional true} [:or string? boolean?]]
 [:on {:optional true} [:or [:ref #'Stream] string?]]
 [:clear {:optional true} [:or [:ref #'Stream] string? boolean?]]]
)

(def ConditionalParameter_ValueDef__Gradient_string_null_ExprRef___
  [:map
 {:closed true}
 [:empty {:optional true} boolean?]
 [:param [:ref #'ParameterName]]
 [:value [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]]
)

(def BindCheckbox
  [:map
 {:closed true}
 [:debounce {:optional true} number?]
 [:element {:optional true} [:ref #'Element]]
 [:input [:= "checkbox"]]
 [:name {:optional true} string?]]
)

(def SequenceGenerator
  [:map
 {:closed true}
 [:name {:optional true} string?]
 [:sequence [:ref #'SequenceParams]]]
)

(def ScaleInvalidDataShowAs__strokeOpacity__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__strokeOpacity__]
 [:enum "zero-or-min"]]
)

(def TimeLocale
  [:map
 {:closed true}
 [:date string?]
 [:dateTime string?]
 [:days [:ref #'Vector7_string_]]
 [:months [:ref #'Vector12_string_]]
 [:periods [:ref #'Vector2_string_]]
 [:shortDays [:ref #'Vector7_string_]]
 [:shortMonths [:ref #'Vector12_string_]]
 [:time string?]]
)

(def ParseValue
  [:or string? nil?]
)

(def PositionDatumDefBase
  [:map
 {:closed true}
 [:bandPosition {:optional true} number?]
 [:datum
  {:optional true}
  [:or
   [:ref #'PrimitiveValue]
   [:ref #'DateTime]
   [:ref #'ExprRef]
   [:ref #'RepeatRef]]]
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'Type]]]
)

(def ScaleInvalidDataShowAsValue__yOffset__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def OverlayMarkDef
  [:map
 {:closed true}
 [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:baseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:y2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
 [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:stroke
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:clip {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
 [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radiusOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandSize {:optional true} number?]
 [:fill
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:time {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
 [:width {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
 [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
 [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
 [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:x2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandPosition {:optional true} number?]
 [:interpolate
  {:optional true}
  [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
 [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:font {:optional true} [:or string? [:ref #'ExprRef]]]
 [:size {:optional true} [:or number? [:ref #'ExprRef]]]
 [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:style {:optional true} [:or string? [:vector string?]]]
 [:thetaOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:fontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:strokeJoin
  {:optional true}
  [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
 [:shape
  {:optional true}
  [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
 [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:order {:optional true} [:or nil? boolean?]]
 [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:yOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:cornerRadiusTopRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
 [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
 [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:filled {:optional true} boolean?]
 [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:tooltip
  {:optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref #'TooltipContent]
   [:ref #'ExprRef]]]
 [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:height {:optional true} [:or number? [:ref #'ExprRef]]]
 [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]
 [:xOffset {:optional true} [:or number? [:ref #'ExprRef]]]]
)

(def TimeIntervalStep
  [:map {:closed true} [:interval [:ref #'TimeInterval]] [:step number?]]
)

(def BinParams
  [:map
 {:closed true}
 [:maxbins {:optional true} number?]
 [:divide {:optional true} [:vector number?]]
 [:steps {:optional true} [:vector number?]]
 [:minstep {:optional true} number?]
 [:extent {:optional true} [:ref #'BinExtent]]
 [:binned {:optional true} boolean?]
 [:nice {:optional true} boolean?]
 [:anchor {:optional true} number?]
 [:base {:optional true} number?]
 [:step {:optional true} number?]]
)

(def WindowTransform
  [:map
 {:closed true}
 [:frame {:optional true} [:vector [:or nil? number?]]]
 [:groupby {:optional true} [:vector [:ref #'FieldName]]]
 [:ignorePeers {:optional true} boolean?]
 [:sort {:optional true} [:vector [:ref #'SortField]]]
 [:window [:vector [:ref #'WindowFieldDef]]]]
)

(def BinnedTimeUnit
  [:enum
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

(def Polygon
  [:map
 {:closed true}
 [:bbox {:optional true} [:ref #'BBox]]
 [:coordinates [:vector [:vector [:ref #'Position]]]]
 [:type [:= "Polygon"]]]
)

(def NamedData
  [:map
 {:closed true}
 [:format {:optional true} [:ref #'DataFormat]]
 [:name string?]]
)

(def StandardType
  [:enum "quantitative" "ordinal" "temporal" "nominal"]
)

(def ConditionalAxisLabelAlign
  [:ref #'ConditionalAxisProperty__Align_null__]
)

(def ConditionalAxisProperty__string_null__
  [:or
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__string_null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__string_null___ExprRef__]]]]
  [:value [:or string? nil?]]]
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__string_null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__string_null___ExprRef__]]]]
  [:expr string?]]]
)

(def Orientation
  [:enum "horizontal" "vertical"]
)

(def Vector12_string_
  [:vector string?]
)

(def ScaleInvalidDataShowAsValue__time__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def AggregateTransform
  [:map
 {:closed true}
 [:aggregate [:vector [:ref #'AggregatedFieldDef]]]
 [:groupby {:optional true} [:vector [:ref #'FieldName]]]]
)

(def TopoDataFormat
  [:map
 {:closed true}
 [:feature {:optional true} string?]
 [:mesh {:optional true} string?]
 [:parse {:optional true} [:or [:ref #'Parse] nil?]]
 [:type {:optional true} [:= "topojson"]]]
)

(def Parse
  [:map-of any? any?]
)

(def HConcatSpec_GenericSpec_
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:hconcat [:vector [:ref #'Spec]]]
 [:name {:optional true} string?]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} boolean?]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:spacing {:optional true} number?]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def LineString
  [:map
 {:closed true}
 [:bbox {:optional true} [:ref #'BBox]]
 [:coordinates [:vector [:ref #'Position]]]
 [:type [:= "LineString"]]]
)

(def LocalMultiTimeUnit
  [:enum
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

(def FieldOrDatumDefWithCondition_DatumDef_number___
  [:map
 {:closed true}
 [:bandPosition {:optional true} number?]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__number___ExprRef__]
   [:vector [:ref #'ConditionalValueDef__number___ExprRef__]]]]
 [:datum
  {:optional true}
  [:or
   [:ref #'PrimitiveValue]
   [:ref #'DateTime]
   [:ref #'ExprRef]
   [:ref #'RepeatRef]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'Type]]]
)

(def Color
  [:or [:ref #'ColorName] [:ref #'HexColor] string?]
)

(def TickCount
  [:or number? [:ref #'TimeInterval] [:ref #'TimeIntervalStep]]
)

(def ScaleInvalidDataShowAsValue__opacity__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def SelectionConfig
  [:map
 {:closed true}
 [:interval
  {:optional true}
  [:ref #'IntervalSelectionConfigWithoutType]]
 [:point {:optional true} [:ref #'PointSelectionConfigWithoutType]]]
)

(def ScaleInvalidDataConfig
  [:map
 {:closed true}
 [:y {:optional true} [:ref #'ScaleInvalidDataShowAs__y__]]
 [:strokeOpacity
  {:optional true}
  [:ref #'ScaleInvalidDataShowAs__strokeOpacity__]]
 [:stroke {:optional true} [:ref #'ScaleInvalidDataShowAs__stroke__]]
 [:color {:optional true} [:ref #'ScaleInvalidDataShowAs__color__]]
 [:fill {:optional true} [:ref #'ScaleInvalidDataShowAs__fill__]]
 [:strokeDash
  {:optional true}
  [:ref #'ScaleInvalidDataShowAs__strokeDash__]]
 [:time {:optional true} [:ref #'ScaleInvalidDataShowAs__time__]]
 [:fillOpacity
  {:optional true}
  [:ref #'ScaleInvalidDataShowAs__fillOpacity__]]
 [:angle {:optional true} [:ref #'ScaleInvalidDataShowAs__angle__]]
 [:theta {:optional true} [:ref #'ScaleInvalidDataShowAs__theta__]]
 [:radius {:optional true} [:ref #'ScaleInvalidDataShowAs__radius__]]
 [:size {:optional true} [:ref #'ScaleInvalidDataShowAs__size__]]
 [:strokeWidth
  {:optional true}
  [:ref #'ScaleInvalidDataShowAs__strokeWidth__]]
 [:opacity {:optional true} [:ref #'ScaleInvalidDataShowAs__opacity__]]
 [:shape {:optional true} [:ref #'ScaleInvalidDataShowAs__shape__]]
 [:yOffset {:optional true} [:ref #'ScaleInvalidDataShowAs__yOffset__]]
 [:x {:optional true} [:ref #'ScaleInvalidDataShowAs__x__]]
 [:xOffset {:optional true} [:ref #'ScaleInvalidDataShowAs__xOffset__]]]
)

(def MultiTimeUnit
  [:or [:ref #'LocalMultiTimeUnit] [:ref #'UtcMultiTimeUnit]]
)

(def UtcSingleTimeUnit
  [:enum
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

(def ImputeMethod
  [:enum "value" "median" "max" "min" "mean"]
)

(def ConditionalParameter_ValueDef__number___ExprRef___
  [:map
 {:closed true}
 [:empty {:optional true} boolean?]
 [:param [:ref #'ParameterName]]
 [:value [:or [:vector number?] [:ref #'ExprRef]]]]
)

(def FieldOrDatumDefWithCondition_StringFieldDef_Text_
  [:map
 {:closed true}
 [:format {:optional true} [:ref #'Format]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:formatType {:optional true} string?]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__Text_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__Text_ExprRef__]]]]
 [:bin
  {:optional true}
  [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]]
)

(def PositionFieldDefBase
  [:map
 {:closed true}
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:bin
  {:optional true}
  [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
 [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:sort {:optional true} [:ref #'Sort]]]
)

(def LocalSingleTimeUnit
  [:enum
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

(def SelectionResolution
  [:enum "global" "union" "intersect"]
)

(def AggregatedFieldDef
  [:map
 {:closed true}
 [:as [:ref #'FieldName]]
 [:field {:optional true} [:ref #'FieldName]]
 [:op [:ref #'AggregateOp]]]
)

(def ConditionalParameter_ValueDef__string_ExprRef___
  [:map
 {:closed true}
 [:empty {:optional true} boolean?]
 [:param [:ref #'ParameterName]]
 [:value [:or string? [:ref #'ExprRef]]]]
)

(def ConditionalAxisProperty__TextBaseline_null__
  [:or
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref
     #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]]]]
  [:value [:or [:ref #'TextBaseline] nil?]]]
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref
     #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__]]]]
  [:expr string?]]]
)

(def FieldGTEPredicate
  [:map
 {:closed true}
 [:field [:ref #'FieldName]]
 [:gte [:or string? number? [:ref #'DateTime] [:ref #'ExprRef]]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]]
)

(def ConditionalValueDef__Gradient_string_null_ExprRef__
  [:or
 [:ref
  #'ConditionalPredicate_ValueDef__Gradient_string_null_ExprRef___]
 [:ref
  #'ConditionalParameter_ValueDef__Gradient_string_null_ExprRef___]]
)

(def FilterTransform
  [:map {:closed true} [:filter [:ref #'PredicateComposition]]]
)

(def SchemeParams
  [:map
 {:closed true}
 [:count {:optional true} number?]
 [:extent {:optional true} [:vector number?]]
 [:name [:ref #'ColorScheme]]]
)

(def EventType
  [:enum
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

(def ColorName
  [:enum
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

(def RowCol_number_
  [:map
 {:closed true}
 [:column {:optional true} number?]
 [:row {:optional true} number?]]
)

(def ScaleInvalidDataShowAs__yOffset__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__yOffset__]
 [:enum "zero-or-min"]]
)

(def ValueDefWithCondition_StringFieldDef_Text_
  [:map
 {:closed true}
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalStringFieldDef]
   [:ref #'ConditionalValueDef__Text_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__Text_ExprRef__]]]]
 [:value {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]]
)

(def NumericArrayMarkPropDef
  [:ref #'MarkPropDef_number___]
)

(def DomainUnionWith
  [:map
 {:closed true}
 [:unionWith
  [:vector [:or number? string? boolean? [:ref #'DateTime]]]]]
)

(def ConditionalAxisLabelBaseline
  [:ref #'ConditionalAxisProperty__TextBaseline_null__]
)

(def TimeInterval
  [:enum
 "millisecond"
 "second"
 "minute"
 "hour"
 "day"
 "week"
 "month"
 "year"]
)

(def ConditionalAxisProperty__FontStyle_null__
  [:or
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]]]]
  [:value [:or [:ref #'FontStyle] nil?]]]
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__]]]]
  [:expr string?]]]
)

(def ProjectionConfig
  [:ref #'Projection]
)

(def ConditionalPredicate__ValueDef__Align_null___ExprRef__
  [:or
 [:map
  {:closed true}
  [:test [:ref #'PredicateComposition]]
  [:value [:or [:ref #'Align] nil?]]]
 [:map
  {:closed true}
  [:expr string?]
  [:test [:ref #'PredicateComposition]]]]
)

(def ConditionalPredicate__ValueDef__number_null___ExprRef__
  [:or
 [:map
  {:closed true}
  [:test [:ref #'PredicateComposition]]
  [:value [:or number? nil?]]]
 [:map
  {:closed true}
  [:expr string?]
  [:test [:ref #'PredicateComposition]]]]
)

(def PrimitiveValue
  [:or number? string? boolean? nil?]
)

(def FieldOrDatumDefWithCondition_StringFieldDef_string_
  [:map
 {:closed true}
 [:format {:optional true} [:ref #'Format]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:formatType {:optional true} string?]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__string_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__string_ExprRef__]]]]
 [:bin
  {:optional true}
  [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]]
)

(def RowColumnEncodingFieldDef
  [:map
 {:closed true}
 [:align {:optional true} [:ref #'LayoutAlign]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:header {:optional true} [:or [:ref #'Header] nil?]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:center {:optional true} boolean?]
 [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:sort
  {:optional true}
  [:or
   [:ref #'SortArray]
   [:ref #'SortOrder]
   [:ref #'EncodingSortField]
   nil?]]
 [:spacing {:optional true} number?]]
)

(def JoinAggregateFieldDef
  [:map
 {:closed true}
 [:as [:ref #'FieldName]]
 [:field {:optional true} [:ref #'FieldName]]
 [:op [:ref #'AggregateOp]]]
)

(def ValueDef_number_
  [:map {:closed true} [:value number?]]
)

(def ExtentTransform
  [:map
 {:closed true}
 [:extent [:ref #'FieldName]]
 [:param [:ref #'ParameterName]]]
)

(def SingleTimeUnit
  [:or [:ref #'LocalSingleTimeUnit] [:ref #'UtcSingleTimeUnit]]
)

(def TopLevelUnitSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:encoding {:optional true} [:ref #'FacetedEncoding]]
 [:autosize
  {:optional true}
  [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
 [:align
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
 [:datasets {:optional true} [:ref #'Datasets]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:usermeta {:optional true} [:ref #'Dict]]
 [:config {:optional true} [:ref #'Config]]
 [:mark [:ref #'AnyMark]]
 [:name {:optional true} string?]
 [:width
  {:optional true}
  [:or number? [:ref #'Step] [:enum "container"]]]
 [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
 [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:$schema {:optional true} string?]
 [:projection {:optional true} [:ref #'Projection]]
 [:view {:optional true} [:ref #'ViewBackground]]
 [:height
  {:optional true}
  [:or number? [:ref #'Step] [:enum "container"]]]
 [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]
 [:data [:or [:ref #'Data] nil?]]]
)

(def BindRadioSelect
  [:map
 {:closed true}
 [:debounce {:optional true} number?]
 [:element {:optional true} [:ref #'Element]]
 [:input [:enum "radio" "select"]]
 [:labels {:optional true} [:vector string?]]
 [:name {:optional true} string?]
 [:options [:vector any?]]]
)

(def ColorScheme
  [:or
 [:ref #'Categorical]
 [:ref #'SequentialSingleHue]
 [:ref #'SequentialMultiHue]
 [:ref #'Diverging]
 [:ref #'Cyclical]]
)

(def TimeFieldDef
  [:map
 {:closed true}
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:rescale {:optional true} boolean?]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:sort {:optional true} [:ref #'Sort]]]
)

(def FlattenTransform
  [:map
 {:closed true}
 [:as {:optional true} [:vector [:ref #'FieldName]]]
 [:flatten [:vector [:ref #'FieldName]]]]
)

(def JoinAggregateTransform
  [:map
 {:closed true}
 [:groupby {:optional true} [:vector [:ref #'FieldName]]]
 [:joinaggregate [:vector [:ref #'JoinAggregateFieldDef]]]]
)

(def SecondaryFieldDef
  [:map
 {:closed true}
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:bandPosition {:optional true} number?]
 [:bin {:optional true} nil?]
 [:field {:optional true} [:ref #'Field]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]]
)

(def ConditionalPredicate__ValueDef__string_null___ExprRef__
  [:or
 [:map
  {:closed true}
  [:test [:ref #'PredicateComposition]]
  [:value [:or string? nil?]]]
 [:map
  {:closed true}
  [:expr string?]
  [:test [:ref #'PredicateComposition]]]]
)

(def SequentialMultiHue
  [:enum
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

(def UnitSpecWithFrame
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:encoding {:optional true} [:ref #'Encoding]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:mark [:ref #'AnyMark]]
 [:name {:optional true} string?]
 [:width
  {:optional true}
  [:or number? [:ref #'Step] [:enum "container"]]]
 [:params {:optional true} [:vector [:ref #'SelectionParameter]]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:projection {:optional true} [:ref #'Projection]]
 [:view {:optional true} [:ref #'ViewBackground]]
 [:height
  {:optional true}
  [:or number? [:ref #'Step] [:enum "container"]]]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def GenericUnitSpec_Encoding_AnyMark_
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:encoding {:optional true} [:ref #'Encoding]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:mark [:ref #'AnyMark]]
 [:name {:optional true} string?]
 [:params {:optional true} [:vector [:ref #'SelectionParameter]]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:projection {:optional true} [:ref #'Projection]]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def RelativeBandSize
  [:map {:closed true} [:band number?]]
)

(def ConditionalMarkPropFieldOrDatumDef
  [:or
 [:ref #'ConditionalPredicate_MarkPropFieldOrDatumDef_]
 [:ref #'ConditionalParameter_MarkPropFieldOrDatumDef_]]
)

(def ImputeSequence
  [:map
 {:closed true}
 [:start {:optional true} number?]
 [:step {:optional true} number?]
 [:stop number?]]
)

(def ValueDefWithCondition_MarkPropFieldOrDatumDef__string_null__
  [:map
 {:closed true}
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalMarkPropFieldOrDatumDef]
   [:ref #'ConditionalValueDef__string_null_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__string_null_ExprRef__]]]]
 [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]]
)

(def AutosizeType
  [:enum "pad" "none" "fit" "fit-x" "fit-y"]
)

(def GeometryCollection
  [:map
 {:closed true}
 [:bbox {:optional true} [:ref #'BBox]]
 [:geometries [:vector [:ref #'Geometry]]]
 [:type [:= "GeometryCollection"]]]
)

(def TitleFrame
  [:enum "bounds" "group"]
)

(def ScaleInvalidDataShowAs__fill__
  [:or [:ref #'ScaleInvalidDataShowAsValue__fill__] [:enum "zero-or-min"]]
)

(def FieldValidPredicate
  [:map
 {:closed true}
 [:field [:ref #'FieldName]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:valid boolean?]]
)

(def BBox
  [:or [:vector number?] [:vector number?]]
)

(def Axis
  [:map
 {:closed true}
 [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:gridDash
  {:optional true}
  [:or
   [:vector number?]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisNumberArray]]]
 [:domainOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labels {:optional true} boolean?]
 [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:format {:optional true} [:ref #'Format]]
 [:labelFlushOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelBaseline
  {:optional true}
  [:or
   [:ref #'TextBaseline]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisLabelBaseline]]]
 [:titleFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:tickBand
  {:optional true}
  [:or [:ref #'ExprRef] [:enum "center" "extent"]]]
 [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:gridOpacity
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:labelOverlap
  {:optional true}
  [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
 [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:domainDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:tickWidth
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:labelOpacity
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:domainColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:grid {:optional true} boolean?]
 [:labelPadding
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:labelLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleBaseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:tickExtra {:optional true} boolean?]
 [:titleX {:optional true} [:or number? [:ref #'ExprRef]]]
 [:tickOpacity
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:tickDashOffset
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:tickCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:labelFlush {:optional true} [:or boolean? number?]]
 [:titleAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelOffset
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:tickRound {:optional true} boolean?]
 [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:or [:ref #'AxisOrient] [:ref #'ExprRef]]]
 [:tickMinStep {:optional true} [:or number? [:ref #'ExprRef]]]
 [:tickDash
  {:optional true}
  [:or
   [:vector number?]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisNumberArray]]]
 [:titleAnchor
  {:optional true}
  [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
 [:labelColor
  {:optional true}
  [:or
   [:or nil? [:ref #'Color]]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisColor]]]
 [:domainCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:style {:optional true} [:or string? [:vector string?]]]
 [:labelAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleY {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:labelExpr {:optional true} string?]
 [:minExtent {:optional true} [:or number? [:ref #'ExprRef]]]
 [:tickCount
  {:optional true}
  [:or
   number?
   [:ref #'TimeInterval]
   [:ref #'TimeIntervalStep]
   [:ref #'ExprRef]]]
 [:formatType {:optional true} string?]
 [:titleColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:tickSize
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:gridDashOffset
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:gridWidth
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:values
  {:optional true}
  [:or
   [:vector number?]
   [:vector string?]
   [:vector boolean?]
   [:vector [:ref #'DateTime]]
   [:ref #'ExprRef]]]
 [:labelFont
  {:optional true}
  [:or string? [:ref #'ExprRef] [:ref #'ConditionalAxisString]]]
 [:maxExtent {:optional true} [:or number? [:ref #'ExprRef]]]
 [:bandPosition {:optional true} [:or number? [:ref #'ExprRef]]]
 [:gridCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:translate {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ticks {:optional true} boolean?]
 [:position {:optional true} [:or number? [:ref #'ExprRef]]]
 [:tickOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelAlign
  {:optional true}
  [:or
   [:ref #'Align]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisLabelAlign]]]
 [:domain {:optional true} boolean?]
 [:labelFontWeight
  {:optional true}
  [:or
   [:ref #'FontWeight]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisLabelFontWeight]]]
 [:labelBound
  {:optional true}
  [:or [:or number? boolean?] [:ref #'ExprRef]]]
 [:labelFontStyle
  {:optional true}
  [:or
   [:ref #'FontStyle]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisLabelFontStyle]]]
 [:labelFontSize
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:zindex {:optional true} number?]
 [:gridColor
  {:optional true}
  [:or
   [:or nil? [:ref #'Color]]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisColor]]]
 [:titleFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:domainDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:tickColor
  {:optional true}
  [:or
   [:or nil? [:ref #'Color]]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisColor]]]
 [:domainWidth {:optional true} [:or number? [:ref #'ExprRef]]]]
)

(def ConditionalPredicate_ValueDef__string_ExprRef___
  [:map
 {:closed true}
 [:test [:ref #'PredicateComposition]]
 [:value [:or string? [:ref #'ExprRef]]]]
)

(def ScaleInvalidDataShowAs__theta__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__theta__]
 [:enum "zero-or-min"]]
)

(def LineConfig
  [:map
 {:closed true}
 [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:baseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
 [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:stroke
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
 [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandSize {:optional true} number?]
 [:fill
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:time {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
 [:width {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
 [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
 [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
 [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandPosition {:optional true} number?]
 [:interpolate
  {:optional true}
  [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
 [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:font {:optional true} [:or string? [:ref #'ExprRef]]]
 [:size {:optional true} [:or number? [:ref #'ExprRef]]]
 [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:fontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:strokeJoin
  {:optional true}
  [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
 [:shape
  {:optional true}
  [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
 [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:order {:optional true} [:or nil? boolean?]]
 [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:point
  {:optional true}
  [:or boolean? [:ref #'OverlayMarkDef] [:enum "transparent"]]]
 [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:cornerRadiusTopRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
 [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
 [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:filled {:optional true} boolean?]
 [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:tooltip
  {:optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref #'TooltipContent]
   [:ref #'ExprRef]]]
 [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:height {:optional true} [:or number? [:ref #'ExprRef]]]
 [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]]
)

(def PositionValueDef
  [:ref #'ValueDef__number__width___height__ExprRef__]
)

(def Step
  [:map
 {:closed true}
 [:for {:optional true} [:ref #'StepFor]]
 [:step number?]]
)

(def ParameterName
  string?
)

(def TopLevelParameter
  [:or [:ref #'VariableParameter] [:ref #'TopLevelSelectionParameter]]
)

(def BaseTitleNoValueRefs
  [:map
 {:closed true}
 [:baseline {:optional true} [:ref #'TextBaseline]]
 [:align {:optional true} [:ref #'Align]]
 [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
 [:frame
  {:optional true}
  [:or [:or [:ref #'TitleFrame] string?] [:ref #'ExprRef]]]
 [:color
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:subtitleFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:subtitleFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:or [:ref #'TitleOrient] [:ref #'ExprRef]]]
 [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:font {:optional true} [:or string? [:ref #'ExprRef]]]
 [:subtitleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:fontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:fontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:subtitleColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:subtitlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:anchor {:optional true} [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
 [:subtitleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:zindex {:optional true} [:or number? [:ref #'ExprRef]]]
 [:subtitleFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]]
)

(def HexColor
  string?
)

(def BoxPlotConfig
  [:map
 {:closed true}
 [:box {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:extent {:optional true} [:or number? [:enum "min-max"]]]
 [:median {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:outliers {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:rule {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:size {:optional true} number?]
 [:ticks {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]]
)

(def WindowOnlyOp
  [:enum
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

(def Config
  [:map
 {:closed true}
 [:tick {:optional true} [:ref #'TickConfig]]
 [:axisTemporal {:optional true} [:ref #'AxisConfig]]
 [:autosize
  {:optional true}
  [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
 [:headerColumn {:optional true} [:ref #'HeaderConfig]]
 [:normalizedNumberFormat {:optional true} string?]
 [:axisTop {:optional true} [:ref #'AxisConfig]]
 [:tooltipFormat {:optional true} [:ref #'FormatConfig]]
 [:headerRow {:optional true} [:ref #'HeaderConfig]]
 [:axisLeft {:optional true} [:ref #'AxisConfig]]
 [:geoshape {:optional true} [:ref #'MarkConfig]]
 [:errorbar {:optional true} [:ref #'ErrorBarConfig]]
 [:axisY {:optional true} [:ref #'AxisConfig]]
 [:arc {:optional true} [:ref #'RectConfig]]
 [:axisYBand {:optional true} [:ref #'AxisConfig]]
 [:scale {:optional true} [:ref #'ScaleConfig]]
 [:locale {:optional true} [:ref #'Locale]]
 [:mark {:optional true} [:ref #'MarkConfig]]
 [:bar {:optional true} [:ref #'BarConfig]]
 [:concat {:optional true} [:ref #'CompositionConfig]]
 [:axisQuantitative {:optional true} [:ref #'AxisConfig]]
 [:axisXBand {:optional true} [:ref #'AxisConfig]]
 [:countTitle {:optional true} string?]
 [:rule {:optional true} [:ref #'MarkConfig]]
 [:axisYDiscrete {:optional true} [:ref #'AxisConfig]]
 [:facet {:optional true} [:ref #'CompositionConfig]]
 [:circle {:optional true} [:ref #'MarkConfig]]
 [:axisBottom {:optional true} [:ref #'AxisConfig]]
 [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
 [:legend {:optional true} [:ref #'LegendConfig]]
 [:timeFormatType {:optional true} string?]
 [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
 [:axisBand {:optional true} [:ref #'AxisConfig]]
 [:header {:optional true} [:ref #'HeaderConfig]]
 [:font {:optional true} string?]
 [:trail {:optional true} [:ref #'LineConfig]]
 [:title {:optional true} [:ref #'TitleConfig]]
 [:axisX {:optional true} [:ref #'AxisConfig]]
 [:fieldTitle {:optional true} [:enum "verbal" "functional" "plain"]]
 [:axisPoint {:optional true} [:ref #'AxisConfig]]
 [:axisYTemporal {:optional true} [:ref #'AxisConfig]]
 [:numberFormat {:optional true} string?]
 [:normalizedNumberFormatType {:optional true} string?]
 [:style {:optional true} [:ref #'StyleConfigIndex]]
 [:axisYQuantitative {:optional true} [:ref #'AxisConfig]]
 [:axisXTemporal {:optional true} [:ref #'AxisConfig]]
 [:axisRight {:optional true} [:ref #'AxisConfig]]
 [:errorband {:optional true} [:ref #'ErrorBandConfig]]
 [:axisXQuantitative {:optional true} [:ref #'AxisConfig]]
 [:axisXPoint {:optional true} [:ref #'AxisConfig]]
 [:aria {:optional true} boolean?]
 [:line {:optional true} [:ref #'LineConfig]]
 [:axisXDiscrete {:optional true} [:ref #'AxisConfig]]
 [:square {:optional true} [:ref #'MarkConfig]]
 [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
 [:customFormatTypes {:optional true} boolean?]
 [:image {:optional true} [:ref #'RectConfig]]
 [:point {:optional true} [:ref #'MarkConfig]]
 [:area {:optional true} [:ref #'AreaConfig]]
 [:headerFacet {:optional true} [:ref #'HeaderConfig]]
 [:axis {:optional true} [:ref #'AxisConfig]]
 [:axisYPoint {:optional true} [:ref #'AxisConfig]]
 [:selection {:optional true} [:ref #'SelectionConfig]]
 [:rect {:optional true} [:ref #'RectConfig]]
 [:timeFormat {:optional true} string?]
 [:projection {:optional true} [:ref #'ProjectionConfig]]
 [:boxplot {:optional true} [:ref #'BoxPlotConfig]]
 [:view {:optional true} [:ref #'ViewConfig]]
 [:range {:optional true} [:ref #'RangeConfig]]
 [:numberFormatType {:optional true} string?]
 [:axisDiscrete {:optional true} [:ref #'AxisConfig]]
 [:text {:optional true} [:ref #'MarkConfig]]]
)

(def FieldGTPredicate
  [:map
 {:closed true}
 [:field [:ref #'FieldName]]
 [:gt [:or string? number? [:ref #'DateTime] [:ref #'ExprRef]]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]]
)

(def Align
  [:enum "left" "center" "right"]
)

(def IntervalSelectionConfigWithoutType
  [:map
 {:closed true}
 [:clear {:optional true} [:or [:ref #'Stream] string? boolean?]]
 [:encodings {:optional true} [:vector [:ref #'SingleDefUnitChannel]]]
 [:fields {:optional true} [:vector [:ref #'FieldName]]]
 [:mark {:optional true} [:ref #'BrushConfig]]
 [:on {:optional true} [:or [:ref #'Stream] string?]]
 [:resolve {:optional true} [:ref #'SelectionResolution]]
 [:translate {:optional true} [:or string? boolean?]]
 [:zoom {:optional true} [:or string? boolean?]]]
)

(def FieldRangePredicate
  [:map
 {:closed true}
 [:field [:ref #'FieldName]]
 [:range
  [:or
   [:vector [:or number? nil? [:ref #'DateTime] [:ref #'ExprRef]]]
   [:ref #'ExprRef]]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]]
)

(def ConditionalParameter_ValueDef__number_ExprRef___
  [:map
 {:closed true}
 [:empty {:optional true} boolean?]
 [:param [:ref #'ParameterName]]
 [:value [:or number? [:ref #'ExprRef]]]]
)

(def BindDirect
  [:map
 {:closed true}
 [:debounce {:optional true} number?]
 [:element [:or [:ref #'Element] [:map {:closed true}]]]
 [:event {:optional true} string?]]
)

(def TitleAnchor
  [:enum nil "start" "middle" "end"]
)

(def ScaleInvalidDataShowAs__time__
  [:or [:ref #'ScaleInvalidDataShowAsValue__time__] [:enum "zero-or-min"]]
)

(def TopLevelConcatSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:autosize
  {:optional true}
  [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
 [:align
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
 [:datasets {:optional true} [:ref #'Datasets]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:usermeta {:optional true} [:ref #'Dict]]
 [:config {:optional true} [:ref #'Config]]
 [:concat [:vector [:ref #'NonNormalizedSpec]]]
 [:columns {:optional true} number?]
 [:name {:optional true} string?]
 [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
 [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:$schema {:optional true} string?]
 [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def ConditionalParameter_StringFieldDef_
  [:map
 {:closed true}
 [:format {:optional true} [:ref #'Format]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:empty {:optional true} boolean?]
 [:param [:ref #'ParameterName]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:formatType {:optional true} string?]
 [:bin
  {:optional true}
  [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]]
)

(def PositionFieldDef
  [:map
 {:closed true}
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:impute {:optional true} [:or [:ref #'ImputeParams] nil?]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:bin
  {:optional true}
  [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
 [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:axis {:optional true} [:or [:ref #'Axis] nil?]]
 [:sort {:optional true} [:ref #'Sort]]]
)

(def Orient
  [:enum "left" "right" "top" "bottom"]
)

(def ConditionalPredicate__ValueDef__TextBaseline_null___ExprRef__
  [:or
 [:map
  {:closed true}
  [:test [:ref #'PredicateComposition]]
  [:value [:or [:ref #'TextBaseline] nil?]]]
 [:map
  {:closed true}
  [:expr string?]
  [:test [:ref #'PredicateComposition]]]]
)

(def PositionDatumDef
  [:map
 {:closed true}
 [:axis {:optional true} [:or [:ref #'Axis] nil?]]
 [:bandPosition {:optional true} number?]
 [:datum
  {:optional true}
  [:or
   [:ref #'PrimitiveValue]
   [:ref #'DateTime]
   [:ref #'ExprRef]
   [:ref #'RepeatRef]]]
 [:impute {:optional true} [:or [:ref #'ImputeParams] nil?]]
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'Type]]]
)

(def ConditionalValueDef__string_ExprRef__
  [:or
 [:ref #'ConditionalPredicate_ValueDef__string_ExprRef___]
 [:ref #'ConditionalParameter_ValueDef__string_ExprRef___]]
)

(def ConditionalParameter_ValueDef__Text_ExprRef___
  [:map
 {:closed true}
 [:empty {:optional true} boolean?]
 [:param [:ref #'ParameterName]]
 [:value [:or [:ref #'Text] [:ref #'ExprRef]]]]
)

(def RepeatMapping
  [:map
 {:closed true}
 [:column {:optional true} [:vector string?]]
 [:row {:optional true} [:vector string?]]]
)

(def ArgminDef
  [:map {:closed true} [:argmin [:ref #'FieldName]]]
)

(def EncodingSortField
  [:map
 {:closed true}
 [:field {:optional true} [:ref #'Field]]
 [:op {:optional true} [:ref #'NonArgAggregateOp]]
 [:order {:optional true} [:or [:ref #'SortOrder] nil?]]]
)

(def HeaderConfig
  [:map
 {:closed true}
 [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labels {:optional true} boolean?]
 [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:format {:optional true} [:ref #'Format]]
 [:labelBaseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:titleFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleBaseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:titleAngle {:optional true} number?]
 [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'Orient]]
 [:titleAnchor {:optional true} [:ref #'TitleAnchor]]
 [:labelColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:title {:optional true} nil?]
 [:labelAngle {:optional true} number?]
 [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:labelExpr {:optional true} string?]
 [:titleOrient {:optional true} [:ref #'Orient]]
 [:formatType {:optional true} string?]
 [:titleColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelAnchor {:optional true} [:ref #'TitleAnchor]]
 [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:labelOrient {:optional true} [:ref #'Orient]]
 [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:labelFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:labelFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]]
)

(def Spec
  [:or
 [:ref #'FacetedUnitSpec]
 [:ref #'LayerSpec]
 [:ref #'RepeatSpec]
 [:ref #'FacetSpec]
 [:ref #'ConcatSpec_GenericSpec_]
 [:ref #'VConcatSpec_GenericSpec_]
 [:ref #'HConcatSpec_GenericSpec_]]
)

(def Interpolate
  [:enum
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

(def ConditionalPredicate__ValueDef__Color_null___ExprRef__
  [:or
 [:map
  {:closed true}
  [:test [:ref #'PredicateComposition]]
  [:value [:or [:ref #'Color] nil?]]]
 [:map
  {:closed true}
  [:expr string?]
  [:test [:ref #'PredicateComposition]]]]
)

(def FeatureCollection
  [:map
 {:closed true}
 [:bbox {:optional true} [:ref #'BBox]]
 [:features [:vector [:ref #'Feature_Geometry_GeoJsonProperties_]]]
 [:type [:= "FeatureCollection"]]]
)

(def Header
  [:map
 {:closed true}
 [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labels {:optional true} boolean?]
 [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:format {:optional true} [:ref #'Format]]
 [:labelBaseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:titleFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleBaseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:titleAngle {:optional true} number?]
 [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'Orient]]
 [:titleAnchor {:optional true} [:ref #'TitleAnchor]]
 [:labelColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:labelAngle {:optional true} number?]
 [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:labelExpr {:optional true} string?]
 [:titleOrient {:optional true} [:ref #'Orient]]
 [:formatType {:optional true} string?]
 [:titleColor {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelAnchor {:optional true} [:ref #'TitleAnchor]]
 [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:labelOrient {:optional true} [:ref #'Orient]]
 [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:labelFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:labelFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]]
)

(def SortByChannel
  [:enum
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

(def LookupTransform
  [:map
 {:closed true}
 [:as
  {:optional true}
  [:or [:ref #'FieldName] [:vector [:ref #'FieldName]]]]
 [:default {:optional true} any?]
 [:from [:or [:ref #'LookupData] [:ref #'LookupSelection]]]
 [:lookup string?]]
)

(def ErrorBarConfig
  [:map
 {:closed true}
 [:extent {:optional true} [:ref #'ErrorBarExtent]]
 [:rule {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:size {:optional true} number?]
 [:thickness {:optional true} number?]
 [:ticks {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]]
)

(def ScaleInvalidDataShowAsValue__angle__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def RangeEnum
  [:enum
 "width"
 "height"
 "symbol"
 "category"
 "ordinal"
 "ramp"
 "diverging"
 "heatmap"]
)

(def UrlData
  [:map
 {:closed true}
 [:format {:optional true} [:ref #'DataFormat]]
 [:name {:optional true} string?]
 [:url string?]]
)

(def ScaleBins
  [:or [:vector number?] [:ref #'ScaleBinParams]]
)

(def TopLevelSpec
  [:or
 [:ref #'TopLevelUnitSpec]
 [:ref #'TopLevelFacetSpec]
 [:ref #'TopLevelLayerSpec]
 [:ref #'TopLevelRepeatSpec]
 [:ref #'TopLevelConcatSpec]
 [:ref #'TopLevelVConcatSpec]
 [:ref #'TopLevelHConcatSpec]]
)

(def ConditionalPredicate_MarkPropFieldOrDatumDef_
  [:or
 [:map
  {:closed true}
  [:scale {:optional true} [:or [:ref #'Scale] nil?]]
  [:legend {:optional true} [:or [:ref #'Legend] nil?]]
  [:field {:optional true} [:ref #'Field]]
  [:type {:optional true} [:ref #'StandardType]]
  [:title {:optional true} [:or [:ref #'Text] nil?]]
  [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
  [:bandPosition {:optional true} number?]
  [:timeUnit
   {:optional true}
   [:or
    [:ref #'TimeUnit]
    [:ref #'BinnedTimeUnit]
    [:ref #'TimeUnitParams]]]
  [:aggregate {:optional true} [:ref #'Aggregate]]
  [:test [:ref #'PredicateComposition]]
  [:sort {:optional true} [:ref #'Sort]]]
 [:map
  {:closed true}
  [:bandPosition {:optional true} number?]
  [:datum
   {:optional true}
   [:or
    [:ref #'PrimitiveValue]
    [:ref #'DateTime]
    [:ref #'ExprRef]
    [:ref #'RepeatRef]]]
  [:legend {:optional true} [:or [:ref #'Legend] nil?]]
  [:scale {:optional true} [:or [:ref #'Scale] nil?]]
  [:test [:ref #'PredicateComposition]]
  [:title {:optional true} [:or [:ref #'Text] nil?]]
  [:type {:optional true} [:ref #'Type]]]]
)

(def ScaleInvalidDataShowAsValue__y__
  [:map
 {:closed true}
 [:value {:optional true} [:or number? [:enum "height"]]]]
)

(def BinExtent
  [:or [:vector number?] [:ref #'ParameterExtent]]
)

(def FacetFieldDef
  [:map
 {:closed true}
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:header {:optional true} [:or [:ref #'Header] nil?]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:sort
  {:optional true}
  [:or
   [:ref #'SortArray]
   [:ref #'SortOrder]
   [:ref #'EncodingSortField]
   nil?]]]
)

(def LoessTransform
  [:map
 {:closed true}
 [:as {:optional true} [:vector [:ref #'FieldName]]]
 [:bandwidth {:optional true} number?]
 [:groupby {:optional true} [:vector [:ref #'FieldName]]]
 [:loess [:ref #'FieldName]]
 [:on [:ref #'FieldName]]]
)

(def SelectionInitInterval
  [:or
 [:ref #'Vector2_boolean_]
 [:ref #'Vector2_number_]
 [:ref #'Vector2_string_]
 [:ref #'Vector2_DateTime_]]
)

(def CompositionConfig
  [:map
 {:closed true}
 [:columns {:optional true} number?]
 [:spacing {:optional true} number?]]
)

(def TopLevelLayerSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:encoding {:optional true} [:ref #'SharedEncoding]]
 [:autosize
  {:optional true}
  [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
 [:datasets {:optional true} [:ref #'Datasets]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:usermeta {:optional true} [:ref #'Dict]]
 [:config {:optional true} [:ref #'Config]]
 [:name {:optional true} string?]
 [:width
  {:optional true}
  [:or number? [:ref #'Step] [:enum "container"]]]
 [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:layer [:vector [:or [:ref #'LayerSpec] [:ref #'UnitSpec]]]]
 [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:$schema {:optional true} string?]
 [:projection {:optional true} [:ref #'Projection]]
 [:view {:optional true} [:ref #'ViewBackground]]
 [:height
  {:optional true}
  [:or number? [:ref #'Step] [:enum "container"]]]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def TextBaseline
  [:or [:ref #'Baseline] [:enum "alphabetic" "line-top" "line-bottom"]]
)

(def ConditionalPredicate_ValueDef__Text_ExprRef___
  [:map
 {:closed true}
 [:test [:ref #'PredicateComposition]]
 [:value [:or [:ref #'Text] [:ref #'ExprRef]]]]
)

(def ConditionalValueDef__Text_ExprRef__
  [:or
 [:ref #'ConditionalPredicate_ValueDef__Text_ExprRef___]
 [:ref #'ConditionalParameter_ValueDef__Text_ExprRef___]]
)

(def ConditionalParameter_MarkPropFieldOrDatumDef_TypeForShape__
  [:or
 [:map
  {:closed true}
  [:scale {:optional true} [:or [:ref #'Scale] nil?]]
  [:legend {:optional true} [:or [:ref #'Legend] nil?]]
  [:field {:optional true} [:ref #'Field]]
  [:type {:optional true} [:ref #'TypeForShape]]
  [:empty {:optional true} boolean?]
  [:param [:ref #'ParameterName]]
  [:title {:optional true} [:or [:ref #'Text] nil?]]
  [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
  [:bandPosition {:optional true} number?]
  [:timeUnit
   {:optional true}
   [:or
    [:ref #'TimeUnit]
    [:ref #'BinnedTimeUnit]
    [:ref #'TimeUnitParams]]]
  [:aggregate {:optional true} [:ref #'Aggregate]]
  [:sort {:optional true} [:ref #'Sort]]]
 [:map
  {:closed true}
  [:bandPosition {:optional true} number?]
  [:datum
   {:optional true}
   [:or
    [:ref #'PrimitiveValue]
    [:ref #'DateTime]
    [:ref #'ExprRef]
    [:ref #'RepeatRef]]]
  [:empty {:optional true} boolean?]
  [:legend {:optional true} [:or [:ref #'Legend] nil?]]
  [:param [:ref #'ParameterName]]
  [:scale {:optional true} [:or [:ref #'Scale] nil?]]
  [:title {:optional true} [:or [:ref #'Text] nil?]]
  [:type {:optional true} [:ref #'Type]]]]
)

(def ConditionalParameter_ValueDef__string_null_ExprRef___
  [:map
 {:closed true}
 [:empty {:optional true} boolean?]
 [:param [:ref #'ParameterName]]
 [:value [:or string? nil? [:ref #'ExprRef]]]]
)

(def ConditionalPredicate__ValueDef__FontStyle_null___ExprRef__
  [:or
 [:map
  {:closed true}
  [:test [:ref #'PredicateComposition]]
  [:value [:or [:ref #'FontStyle] nil?]]]
 [:map
  {:closed true}
  [:expr string?]
  [:test [:ref #'PredicateComposition]]]]
)

(def TypeForShape
  [:enum "nominal" "ordinal" "geojson"]
)

(def RepeatSpec
  [:or [:ref #'NonLayerRepeatSpec] [:ref #'LayerRepeatSpec]]
)

(def ConditionalAxisProperty__FontWeight_null__
  [:or
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref
     #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]]]]
  [:value [:or [:ref #'FontWeight] nil?]]]
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref
     #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__]]]]
  [:expr string?]]]
)

(def PointSelectionConfig
  [:map
 {:closed true}
 [:clear {:optional true} [:or [:ref #'Stream] string? boolean?]]
 [:encodings {:optional true} [:vector [:ref #'SingleDefUnitChannel]]]
 [:fields {:optional true} [:vector [:ref #'FieldName]]]
 [:nearest {:optional true} boolean?]
 [:on {:optional true} [:or [:ref #'Stream] string?]]
 [:resolve {:optional true} [:ref #'SelectionResolution]]
 [:toggle {:optional true} [:or string? boolean?]]
 [:type [:= "point"]]]
)

(def Feature
  [:map
 {:closed true}
 [:bbox {:optional true} [:ref #'BBox]]
 [:geometry [:ref #'Geometry]]
 [:id {:optional true} [:or string? number?]]
 [:properties [:ref #'GeoJsonProperties]]
 [:type [:= "Feature"]]]
)

(def Predicate
  [:or
 [:ref #'FieldEqualPredicate]
 [:ref #'FieldRangePredicate]
 [:ref #'FieldOneOfPredicate]
 [:ref #'FieldLTPredicate]
 [:ref #'FieldGTPredicate]
 [:ref #'FieldLTEPredicate]
 [:ref #'FieldGTEPredicate]
 [:ref #'FieldValidPredicate]
 [:ref #'ParameterPredicate]
 string?]
)

(def ResolveMode
  [:enum "independent" "shared"]
)

(def CalculateTransform
  [:map {:closed true} [:as [:ref #'FieldName]] [:calculate string?]]
)

(def SharedEncoding
  [:map
 {:closed true}
 [:y
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:impute {:optional true} [:or [:ref #'ImputeParams] nil?]]
   [:value
    {:optional true}
    [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin
    {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:axis {:optional true} [:or [:ref #'Axis] nil?]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:description
  {:optional true}
  [:map
   {:closed true}
   [:format {:optional true} [:ref #'Format]]
   [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:formatType {:optional true} string?]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__string_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__string_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__string_null_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__string_null_ExprRef__]]]]]
   [:bin
    {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]]]
 [:strokeOpacity
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:xError2
  {:optional true}
  [:map
   {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} nil?]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:value {:optional true} number?]]]
 [:stroke
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value
    {:optional true}
    [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:color
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value
    {:optional true}
    [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:key
  {:optional true}
  [:map
   {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin
    {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]]]
 [:longitude2
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:value
    {:optional true}
    [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'Type]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} nil?]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]]]
 [:fill
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value
    {:optional true}
    [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]
      [:vector
       [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:strokeDash
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__number___ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number___ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__number___ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number___ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:time
  {:optional true}
  [:map
   {:closed true}
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:rescale {:optional true} boolean?]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:longitude
  {:optional true}
  [:map
   {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} nil?]
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type
    {:optional true}
    [:or [:ref #'Type] [:enum "quantitative"]]]]]
 [:fillOpacity
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:angle
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:theta
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value
    {:optional true}
    [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin
    {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:radius
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value
    {:optional true}
    [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin
    {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:theta2
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:value
    {:optional true}
    [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'Type]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} nil?]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]]]
 [:size
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:yError
  {:optional true}
  [:map
   {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} nil?]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:value {:optional true} number?]]]
 [:strokeWidth
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:opacity
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value {:optional true} [:or number? [:ref #'ExprRef]]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__number_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:shape
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]
   [:legend {:optional true} [:or [:ref #'Legend] nil?]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'TypeForShape] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__string_null_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__string_null_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef_TypeForShape_]
      [:ref #'ConditionalValueDef__string_null_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__string_null_ExprRef__]]]]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:url
  {:optional true}
  [:map
   {:closed true}
   [:format {:optional true} [:ref #'Format]]
   [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:formatType {:optional true} string?]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__string_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__string_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__string_null_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__string_null_ExprRef__]]]]]
   [:bin
    {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]]]
 [:latitude
  {:optional true}
  [:map
   {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} nil?]
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type
    {:optional true}
    [:or [:ref #'Type] [:enum "quantitative"]]]]]
 [:order
  {:optional true}
  [:or
   [:ref #'OrderFieldDef]
   [:ref #'OrderValueDef]
   [:ref #'OrderOnlyDef]
   [:vector [:ref #'OrderFieldDef]]]]
 [:xError
  {:optional true}
  [:map
   {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} nil?]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:value {:optional true} number?]]]
 [:yError2
  {:optional true}
  [:map
   {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} nil?]
   [:field {:optional true} [:ref #'Field]]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:value {:optional true} number?]]]
 [:yOffset
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value {:optional true} number?]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:x
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:impute {:optional true} [:or [:ref #'ImputeParams] nil?]]
   [:value
    {:optional true}
    [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin
    {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:stack {:optional true} [:or [:ref #'StackOffset] nil? boolean?]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:axis {:optional true} [:or [:ref #'Axis] nil?]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:y2
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:value
    {:optional true}
    [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'Type]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} nil?]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]]]
 [:radius2
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:value
    {:optional true}
    [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'Type]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} nil?]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]]]
 [:x2
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:value
    {:optional true}
    [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'Type]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} nil?]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]]]
 [:latitude2
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:value
    {:optional true}
    [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'Type]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} nil?]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]]]
 [:href
  {:optional true}
  [:map
   {:closed true}
   [:format {:optional true} [:ref #'Format]]
   [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:formatType {:optional true} string?]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__string_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__string_ExprRef__]]]
     [:or
      [:ref #'ConditionalMarkPropFieldOrDatumDef]
      [:ref #'ConditionalValueDef__string_null_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__string_null_ExprRef__]]]]]
   [:bin
    {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]]]
 [:tooltip
  {:optional true}
  [:or
   [:ref #'StringFieldDefWithCondition]
   [:ref #'StringValueDefWithCondition]
   [:vector [:ref #'StringFieldDef]]
   nil?]]
 [:text
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:format {:optional true} [:ref #'Format]]
   [:value {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:formatType {:optional true} string?]
   [:condition
    {:optional true}
    [:or
     [:or
      [:ref #'ConditionalValueDef__Text_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__Text_ExprRef__]]]
     [:or
      [:ref #'ConditionalStringFieldDef]
      [:ref #'ConditionalValueDef__Text_ExprRef__]
      [:vector [:ref #'ConditionalValueDef__Text_ExprRef__]]]]]
   [:bin
    {:optional true}
    [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]]]
 [:xOffset
  {:optional true}
  [:map
   {:closed true}
   [:datum
    {:optional true}
    [:or
     [:ref #'PrimitiveValue]
     [:ref #'DateTime]
     [:ref #'ExprRef]
     [:ref #'RepeatRef]]]
   [:scale {:optional true} [:or [:ref #'Scale] nil?]]
   [:value {:optional true} number?]
   [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:or [:ref #'StandardType] [:ref #'Type]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit
    {:optional true}
    [:or
     [:ref #'TimeUnit]
     [:ref #'BinnedTimeUnit]
     [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true} [:ref #'Sort]]]]
 [:detail
  {:optional true}
  [:or
   [:ref #'FieldDefWithoutScale]
   [:vector [:ref #'FieldDefWithoutScale]]]]]
)

(def BindInput
  [:map
 {:closed true}
 [:autocomplete {:optional true} string?]
 [:debounce {:optional true} number?]
 [:element {:optional true} [:ref #'Element]]
 [:input {:optional true} string?]
 [:name {:optional true} string?]
 [:placeholder {:optional true} string?]]
)

(def AnyMarkConfig
  [:or
 [:ref #'MarkConfig]
 [:ref #'AreaConfig]
 [:ref #'BarConfig]
 [:ref #'RectConfig]
 [:ref #'LineConfig]
 [:ref #'TickConfig]]
)

(def StackTransform
  [:map
 {:closed true}
 [:as [:or [:ref #'FieldName] [:vector [:ref #'FieldName]]]]
 [:groupby [:vector [:ref #'FieldName]]]
 [:offset {:optional true} [:enum "zero" "center" "normalize"]]
 [:sort {:optional true} [:vector [:ref #'SortField]]]
 [:stack [:ref #'FieldName]]]
)

(def TimeUnitTransformParams
  [:map
 {:closed true}
 [:maxbins {:optional true} number?]
 [:step {:optional true} number?]
 [:unit {:optional true} [:ref #'TimeUnit]]
 [:utc {:optional true} boolean?]]
)

(def ValueDefWithCondition_MarkPropFieldOrDatumDef_TypeForShape___string_null__
  [:map
 {:closed true}
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalMarkPropFieldOrDatumDef_TypeForShape_]
   [:ref #'ConditionalValueDef__string_null_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__string_null_ExprRef__]]]]
 [:value {:optional true} [:or string? nil? [:ref #'ExprRef]]]]
)

(def QuantileTransform
  [:map
 {:closed true}
 [:as {:optional true} [:vector [:ref #'FieldName]]]
 [:groupby {:optional true} [:vector [:ref #'FieldName]]]
 [:probs {:optional true} [:vector number?]]
 [:quantile [:ref #'FieldName]]
 [:step {:optional true} number?]]
)

(def InlineDataset
  [:or
 [:vector number?]
 [:vector string?]
 [:vector boolean?]
 [:vector [:map-of any? any?]]
 string?
 [:map-of any? any?]]
)

(def Data
  [:or [:ref #'DataSource] [:ref #'Generator]]
)

(def ScaleInvalidDataShowAs__color__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__color__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAsValue__strokeOpacity__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def ScaleInvalidDataShowAsValue__x__
  [:map
 {:closed true}
 [:value {:optional true} [:or number? [:enum "width"]]]]
)

(def Field
  [:or [:ref #'FieldName] [:ref #'RepeatRef]]
)

(def TopLevelSelectionParameter
  [:map
 {:closed true}
 [:bind
  {:optional true}
  [:or
   [:ref #'Binding]
   [:ref #'LegendBinding]
   [:map-of any? any?]
   [:enum "scales"]]]
 [:name [:ref #'ParameterName]]
 [:select
  [:or
   [:ref #'SelectionType]
   [:ref #'PointSelectionConfig]
   [:ref #'IntervalSelectionConfig]]]
 [:value
  {:optional true}
  [:or
   [:ref #'SelectionInit]
   [:ref #'SelectionInitIntervalMapping]
   [:vector [:ref #'SelectionInitMapping]]]]
 [:views {:optional true} [:vector string?]]]
)

(def Transform
  [:or
 [:ref #'AggregateTransform]
 [:ref #'BinTransform]
 [:ref #'CalculateTransform]
 [:ref #'DensityTransform]
 [:ref #'ExtentTransform]
 [:ref #'FilterTransform]
 [:ref #'FlattenTransform]
 [:ref #'FoldTransform]
 [:ref #'ImputeTransform]
 [:ref #'JoinAggregateTransform]
 [:ref #'LoessTransform]
 [:ref #'LookupTransform]
 [:ref #'QuantileTransform]
 [:ref #'RegressionTransform]
 [:ref #'TimeUnitTransform]
 [:ref #'SampleTransform]
 [:ref #'StackTransform]
 [:ref #'WindowTransform]
 [:ref #'PivotTransform]]
)

(def LegendResolveMap
  [:map
 {:closed true}
 [:strokeOpacity {:optional true} [:ref #'ResolveMode]]
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
 [:shape {:optional true} [:ref #'ResolveMode]]]
)

(def BoxPlotDef
  [:map
 {:closed true}
 [:clip {:optional true} boolean?]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:rule {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:box {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:type [:ref #'BoxPlot]]
 [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:outliers {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:size {:optional true} number?]
 [:median {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:opacity {:optional true} number?]
 [:extent {:optional true} [:or number? [:enum "min-max"]]]
 [:ticks {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]]
)

(def ConditionalPredicate_MarkPropFieldOrDatumDef_TypeForShape__
  [:or
 [:map
  {:closed true}
  [:scale {:optional true} [:or [:ref #'Scale] nil?]]
  [:legend {:optional true} [:or [:ref #'Legend] nil?]]
  [:field {:optional true} [:ref #'Field]]
  [:type {:optional true} [:ref #'TypeForShape]]
  [:title {:optional true} [:or [:ref #'Text] nil?]]
  [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
  [:bandPosition {:optional true} number?]
  [:timeUnit
   {:optional true}
   [:or
    [:ref #'TimeUnit]
    [:ref #'BinnedTimeUnit]
    [:ref #'TimeUnitParams]]]
  [:aggregate {:optional true} [:ref #'Aggregate]]
  [:test [:ref #'PredicateComposition]]
  [:sort {:optional true} [:ref #'Sort]]]
 [:map
  {:closed true}
  [:bandPosition {:optional true} number?]
  [:datum
   {:optional true}
   [:or
    [:ref #'PrimitiveValue]
    [:ref #'DateTime]
    [:ref #'ExprRef]
    [:ref #'RepeatRef]]]
  [:legend {:optional true} [:or [:ref #'Legend] nil?]]
  [:scale {:optional true} [:or [:ref #'Scale] nil?]]
  [:test [:ref #'PredicateComposition]]
  [:title {:optional true} [:or [:ref #'Text] nil?]]
  [:type {:optional true} [:ref #'Type]]]]
)

(def ConditionalAxisLabelFontStyle
  [:ref #'ConditionalAxisProperty__FontStyle_null__]
)

(def LabelOverlap
  [:or boolean? [:enum "parity" "greedy"]]
)

(def ConditionalAxisLabelFontWeight
  [:ref #'ConditionalAxisProperty__FontWeight_null__]
)

(def Element
  string?
)

(def Scale
  [:map
 {:closed true}
 [:zero {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:exponent {:optional true} [:or number? [:ref #'ExprRef]]]
 [:paddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
 [:align {:optional true} [:or number? [:ref #'ExprRef]]]
 [:domainRaw {:optional true} [:ref #'ExprRef]]
 [:constant {:optional true} [:or number? [:ref #'ExprRef]]]
 [:bins {:optional true} [:ref #'ScaleBins]]
 [:paddingOuter {:optional true} [:or number? [:ref #'ExprRef]]]
 [:type {:optional true} [:ref #'ScaleType]]
 [:interpolate
  {:optional true}
  [:or
   [:ref #'ScaleInterpolateEnum]
   [:ref #'ExprRef]
   [:ref #'ScaleInterpolateParams]]]
 [:domainMax
  {:optional true}
  [:or number? [:ref #'DateTime] [:ref #'ExprRef]]]
 [:round {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:rangeMax {:optional true} [:or number? string? [:ref #'ExprRef]]]
 [:rangeMin {:optional true} [:or number? string? [:ref #'ExprRef]]]
 [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:nice
  {:optional true}
  [:or
   boolean?
   number?
   [:ref #'TimeInterval]
   [:ref #'TimeIntervalStep]
   [:ref #'ExprRef]]]
 [:domainMin
  {:optional true}
  [:or number? [:ref #'DateTime] [:ref #'ExprRef]]]
 [:domain
  {:optional true}
  [:or
   [:vector
    [:or
     nil?
     string?
     number?
     boolean?
     [:ref #'DateTime]
     [:ref #'ExprRef]]]
   [:ref #'ParameterExtent]
   [:ref #'DomainUnionWith]
   [:ref #'ExprRef]
   [:enum "unaggregated"]]]
 [:base {:optional true} [:or number? [:ref #'ExprRef]]]
 [:clamp {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:scheme
  {:optional true}
  [:or [:ref #'ColorScheme] [:ref #'SchemeParams] [:ref #'ExprRef]]]
 [:reverse {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:range
  {:optional true}
  [:or
   [:ref #'RangeEnum]
   [:ref #'FieldRange]
   [:vector [:or number? string? [:vector number?] [:ref #'ExprRef]]]]]
 [:domainMid {:optional true} [:or number? [:ref #'ExprRef]]]]
)

(def LegendOrient
  [:enum
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

(def Sort
  [:or
 [:ref #'SortArray]
 [:ref #'AllSortString]
 [:ref #'EncodingSortField]
 [:ref #'SortByEncoding]
 nil?]
)

(def ErrorBandConfig
  [:map
 {:closed true}
 [:band {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:borders {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:extent {:optional true} [:ref #'ErrorBarExtent]]
 [:interpolate {:optional true} [:ref #'Interpolate]]
 [:tension {:optional true} number?]]
)

(def ScaleInvalidDataShowAsValue__shape__
  [:map
 {:closed true}
 [:value {:optional true} [:or [:ref #'SymbolShape] string?]]]
)

(def OffsetDef
  [:or
 [:ref #'ScaleFieldDef]
 [:ref #'ScaleDatumDef]
 [:ref #'ValueDef_number_]]
)

(def TooltipContent
  [:map {:closed true} [:content [:enum "encoding" "data"]]]
)

(def ScaleInvalidDataShowAsValue__theta__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def Generator
  [:or
 [:ref #'SequenceGenerator]
 [:ref #'SphereGenerator]
 [:ref #'GraticuleGenerator]]
)

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_number_
  [:map
 {:closed true}
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:legend {:optional true} [:or [:ref #'Legend] nil?]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__number_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]]
 [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:sort {:optional true} [:ref #'Sort]]]
)

(def FacetSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:align
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:columns {:optional true} number?]
 [:name {:optional true} string?]
 [:facet [:or [:ref #'FacetFieldDef] [:ref #'FacetMapping]]]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
 [:spec [:or [:ref #'LayerSpec] [:ref #'FacetedUnitSpec]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def GraticuleParams
  [:map
 {:closed true}
 [:extent {:optional true} [:ref #'Vector2_Vector2_number__]]
 [:extentMajor {:optional true} [:ref #'Vector2_Vector2_number__]]
 [:extentMinor {:optional true} [:ref #'Vector2_Vector2_number__]]
 [:precision {:optional true} number?]
 [:step {:optional true} [:ref #'Vector2_number_]]
 [:stepMajor {:optional true} [:ref #'Vector2_number_]]
 [:stepMinor {:optional true} [:ref #'Vector2_number_]]]
)

(def NonArgAggregateOp
  [:enum
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

(def AutoSizeParams
  [:map
 {:closed true}
 [:contains {:optional true} [:enum "content" "padding"]]
 [:resize {:optional true} boolean?]
 [:type {:optional true} [:ref #'AutosizeType]]]
)

(def TextDef
  [:or
 [:ref #'FieldOrDatumDefWithCondition_StringFieldDef_Text_]
 [:ref #'FieldOrDatumDefWithCondition_StringDatumDef_Text_]
 [:ref #'ValueDefWithCondition_StringFieldDef_Text_]]
)

(def FieldOrDatumDefWithCondition_DatumDef__string_null__
  [:map
 {:closed true}
 [:bandPosition {:optional true} number?]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__string_null_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__string_null_ExprRef__]]]]
 [:datum
  {:optional true}
  [:or
   [:ref #'PrimitiveValue]
   [:ref #'DateTime]
   [:ref #'ExprRef]
   [:ref #'RepeatRef]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'Type]]]
)

(def GeoJsonFeature
  [:ref #'Feature]
)

(def SphereGenerator
  [:map
 {:closed true}
 [:name {:optional true} string?]
 [:sphere [:or [:map-of any? any?] [:enum true]]]]
)

(def TimeUnitTransform
  [:map
 {:closed true}
 [:as [:ref #'FieldName]]
 [:field [:ref #'FieldName]]
 [:timeUnit [:or [:ref #'TimeUnit] [:ref #'TimeUnitTransformParams]]]]
)

(def ConditionalPredicate__ValueDef__FontWeight_null___ExprRef__
  [:or
 [:map
  {:closed true}
  [:test [:ref #'PredicateComposition]]
  [:value [:or [:ref #'FontWeight] nil?]]]
 [:map
  {:closed true}
  [:expr string?]
  [:test [:ref #'PredicateComposition]]]]
)

(def MarkDef
  [:map
 {:closed true}
 [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:baseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:y2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
 [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:discreteBandSize
  {:optional true}
  [:or number? [:ref #'RelativeBandSize]]]
 [:thickness {:optional true} number?]
 [:stroke
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:clip {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
 [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:binSpacing {:optional true} number?]
 [:radiusOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandSize {:optional true} number?]
 [:fill
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:time {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
 [:bandSize {:optional true} number?]
 [:width
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'RelativeBandSize]]]
 [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
 [:type [:ref #'Mark]]
 [:continuousBandSize {:optional true} number?]
 [:cornerRadiusEnd {:optional true} [:or number? [:ref #'ExprRef]]]
 [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
 [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
 [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:x2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandPosition {:optional true} number?]
 [:interpolate
  {:optional true}
  [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
 [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:font {:optional true} [:or string? [:ref #'ExprRef]]]
 [:size {:optional true} [:or number? [:ref #'ExprRef]]]
 [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:style {:optional true} [:or string? [:vector string?]]]
 [:thetaOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:line {:optional true} [:or boolean? [:ref #'OverlayMarkDef]]]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:minBandSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:fontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:strokeJoin
  {:optional true}
  [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
 [:shape
  {:optional true}
  [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
 [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:order {:optional true} [:or nil? boolean?]]
 [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:point
  {:optional true}
  [:or boolean? [:ref #'OverlayMarkDef] [:enum "transparent"]]]
 [:yOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:cornerRadiusTopRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
 [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
 [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:filled {:optional true} boolean?]
 [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius2Offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:tooltip
  {:optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref #'TooltipContent]
   [:ref #'ExprRef]]]
 [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:height
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'RelativeBandSize]]]
 [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]
 [:xOffset {:optional true} [:or number? [:ref #'ExprRef]]]]
)

(def FieldDefWithoutScale
  [:ref #'TypedFieldDef]
)

(def Resolve
  [:map
 {:closed true}
 [:axis {:optional true} [:ref #'AxisResolveMap]]
 [:legend {:optional true} [:ref #'LegendResolveMap]]
 [:scale {:optional true} [:ref #'ScaleResolveMap]]]
)

(def StrokeCap
  [:enum "butt" "round" "square"]
)

(def TopLevelHConcatSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:autosize
  {:optional true}
  [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
 [:datasets {:optional true} [:ref #'Datasets]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:hconcat [:vector [:ref #'NonNormalizedSpec]]]
 [:usermeta {:optional true} [:ref #'Dict]]
 [:config {:optional true} [:ref #'Config]]
 [:name {:optional true} string?]
 [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} boolean?]
 [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:$schema {:optional true} string?]
 [:spacing {:optional true} number?]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def CompositeMark
  [:or [:ref #'BoxPlot] [:ref #'ErrorBar] [:ref #'ErrorBand]]
)

(def Padding
  [:or
 number?
 [:map
  {:closed true}
  [:bottom {:optional true} number?]
  [:left {:optional true} number?]
  [:right {:optional true} number?]
  [:top {:optional true} number?]]]
)

(def SequenceParams
  [:map
 {:closed true}
 [:as {:optional true} [:ref #'FieldName]]
 [:start number?]
 [:step {:optional true} number?]
 [:stop number?]]
)

(def LegendStreamBinding
  [:map {:closed true} [:legend [:or string? [:ref #'Stream]]]]
)

(def AnyMark
  [:or
 [:ref #'CompositeMark]
 [:ref #'CompositeMarkDef]
 [:ref #'Mark]
 [:ref #'MarkDef]]
)

(def ScaleInterpolateEnum
  [:enum
 "rgb"
 "lab"
 "hcl"
 "hsl"
 "hsl-long"
 "hcl-long"
 "cubehelix"
 "cubehelix-long"]
)

(def Geometry
  [:or
 [:ref #'Point]
 [:ref #'MultiPoint]
 [:ref #'LineString]
 [:ref #'MultiLineString]
 [:ref #'Polygon]
 [:ref #'MultiPolygon]
 [:ref #'GeometryCollection]]
)

(def Day
  number?
)

(def ValueDefWithCondition_MarkPropFieldOrDatumDef_number___
  [:map
 {:closed true}
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalMarkPropFieldOrDatumDef]
   [:ref #'ConditionalValueDef__number___ExprRef__]
   [:vector [:ref #'ConditionalValueDef__number___ExprRef__]]]]
 [:value {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]]
)

(def ImputeParams
  [:map
 {:closed true}
 [:frame {:optional true} [:vector [:or nil? number?]]]
 [:keyvals
  {:optional true}
  [:or [:vector any?] [:ref #'ImputeSequence]]]
 [:method {:optional true} [:ref #'ImputeMethod]]
 [:value {:optional true} any?]]
)

(def Vector2_boolean_
  [:vector boolean?]
)

(def LogicalAnd_Predicate_
  [:map {:closed true} [:and [:vector [:ref #'PredicateComposition]]]]
)

(def ScaleInvalidDataShowAsValue__radius__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def OrderOnlyDef
  [:map {:closed true} [:sort {:optional true} [:ref #'SortOrder]]]
)

(def Vector7_string_
  [:vector string?]
)

(def ConditionalValueDef__number_ExprRef__
  [:or
 [:ref #'ConditionalPredicate_ValueDef__number_ExprRef___]
 [:ref #'ConditionalParameter_ValueDef__number_ExprRef___]]
)

(def BindRange
  [:map
 {:closed true}
 [:debounce {:optional true} number?]
 [:element {:optional true} [:ref #'Element]]
 [:input [:= "range"]]
 [:max {:optional true} number?]
 [:min {:optional true} number?]
 [:name {:optional true} string?]
 [:step {:optional true} number?]]
)

(def FieldLTEPredicate
  [:map
 {:closed true}
 [:field [:ref #'FieldName]]
 [:lte [:or string? number? [:ref #'DateTime] [:ref #'ExprRef]]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]]
)

(def Diverging
  [:enum
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

(def RectConfig
  [:map
 {:closed true}
 [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:baseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
 [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:discreteBandSize
  {:optional true}
  [:or number? [:ref #'RelativeBandSize]]]
 [:stroke
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
 [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:binSpacing {:optional true} number?]
 [:timeUnitBandSize {:optional true} number?]
 [:fill
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:time {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
 [:width {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
 [:continuousBandSize {:optional true} number?]
 [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
 [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
 [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandPosition {:optional true} number?]
 [:interpolate
  {:optional true}
  [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
 [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:font {:optional true} [:or string? [:ref #'ExprRef]]]
 [:size {:optional true} [:or number? [:ref #'ExprRef]]]
 [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:minBandSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:fontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:strokeJoin
  {:optional true}
  [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
 [:shape
  {:optional true}
  [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
 [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:order {:optional true} [:or nil? boolean?]]
 [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:cornerRadiusTopRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
 [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
 [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:filled {:optional true} boolean?]
 [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:tooltip
  {:optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref #'TooltipContent]
   [:ref #'ExprRef]]]
 [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:height {:optional true} [:or number? [:ref #'ExprRef]]]
 [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]]
)

(def ScaleInvalidDataShowAs__size__
  [:or [:ref #'ScaleInvalidDataShowAsValue__size__] [:enum "zero-or-min"]]
)

(def DatumDef
  [:map
 {:closed true}
 [:bandPosition {:optional true} number?]
 [:datum
  {:optional true}
  [:or
   [:ref #'PrimitiveValue]
   [:ref #'DateTime]
   [:ref #'ExprRef]
   [:ref #'RepeatRef]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'Type]]]
)

(def SortArray
  [:or
 [:vector number?]
 [:vector string?]
 [:vector boolean?]
 [:vector [:ref #'DateTime]]]
)

(def Mark
  [:enum
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

(def Binding
  [:or
 [:ref #'BindCheckbox]
 [:ref #'BindRadioSelect]
 [:ref #'BindRange]
 [:ref #'BindInput]
 [:ref #'BindDirect]]
)

(def ConditionalPredicate__ValueDef__number___null___ExprRef__
  [:or
 [:map
  {:closed true}
  [:test [:ref #'PredicateComposition]]
  [:value [:or [:vector number?] nil?]]]
 [:map
  {:closed true}
  [:expr string?]
  [:test [:ref #'PredicateComposition]]]]
)

(def ViewBackground
  [:map
 {:closed true}
 [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:stroke {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
 [:fill {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:cursor {:optional true} [:ref #'Cursor]]
 [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:style {:optional true} [:or string? [:vector string?]]]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeJoin
  {:optional true}
  [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
 [:strokeCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]]
)

(def ScaleInvalidDataShowAs__shape__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__shape__]
 [:enum "zero-or-min"]]
)

(def NumericMarkPropDef
  [:ref #'MarkPropDef_number_]
)

(def ConditionalAxisProperty__Color_null__
  [:or
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]
    [:vector
     [:ref #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]]]]
  [:value [:or [:ref #'Color] nil?]]]
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]
    [:vector
     [:ref #'ConditionalPredicate__ValueDef__Color_null___ExprRef__]]]]
  [:expr string?]]]
)

(def DsvDataFormat
  [:map
 {:closed true}
 [:delimiter string?]
 [:parse {:optional true} [:or [:ref #'Parse] nil?]]
 [:type {:optional true} [:= "dsv"]]]
)

(def VariableParameter
  [:map
 {:closed true}
 [:bind {:optional true} [:ref #'Binding]]
 [:expr {:optional true} [:ref #'Expr]]
 [:name [:ref #'ParameterName]]
 [:react {:optional true} boolean?]
 [:value {:optional true} any?]]
)

(def Aggregate
  [:or [:ref #'NonArgAggregateOp] [:ref #'ArgmaxDef] [:ref #'ArgminDef]]
)

(def ConditionalAxisProperty__number___null__
  [:or
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__number___null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__number___null___ExprRef__]]]]
  [:value [:or [:vector number?] nil?]]]
 [:map
  {:closed true}
  [:condition
   [:or
    [:ref #'ConditionalPredicate__ValueDef__number___null___ExprRef__]
    [:vector
     [:ref
      #'ConditionalPredicate__ValueDef__number___null___ExprRef__]]]]
  [:expr string?]]]
)

(def EventStream
  [:or
 [:map
  {:closed true}
  [:markname {:optional true} string?]
  [:debounce {:optional true} number?]
  [:consume {:optional true} boolean?]
  [:between {:optional true} [:vector [:ref #'Stream]]]
  [:type [:ref #'EventType]]
  [:source {:optional true} [:enum "view" "scope"]]
  [:filter
   {:optional true}
   [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
  [:marktype {:optional true} [:ref #'MarkType]]
  [:throttle {:optional true} number?]]
 [:map
  {:closed true}
  [:markname {:optional true} string?]
  [:debounce {:optional true} number?]
  [:consume {:optional true} boolean?]
  [:between {:optional true} [:vector [:ref #'Stream]]]
  [:type [:ref #'WindowEventType]]
  [:source [:= "window"]]
  [:filter
   {:optional true}
   [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
  [:marktype {:optional true} [:ref #'MarkType]]
  [:throttle {:optional true} number?]]]
)

(def Dict_SelectionInitInterval_
  [:map-of any? any?]
)

(def ScaleInvalidDataShowAs__stroke__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__stroke__]
 [:enum "zero-or-min"]]
)

(def ScaleInvalidDataShowAs__xOffset__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__xOffset__]
 [:enum "zero-or-min"]]
)

(def ErrorBarDef
  [:map
 {:closed true}
 [:thickness {:optional true} number?]
 [:clip {:optional true} boolean?]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:rule {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]
 [:type [:ref #'ErrorBar]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:size {:optional true} number?]
 [:opacity {:optional true} number?]
 [:extent {:optional true} [:ref #'ErrorBarExtent]]
 [:ticks {:optional true} [:or boolean? [:ref #'AnyMarkConfig]]]]
)

(def LatLongFieldDef
  [:map
 {:closed true}
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:bandPosition {:optional true} number?]
 [:bin {:optional true} nil?]
 [:field {:optional true} [:ref #'Field]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:= "quantitative"]]]
)

(def FacetedUnitSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:encoding {:optional true} [:ref #'FacetedEncoding]]
 [:align
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:mark [:ref #'AnyMark]]
 [:name {:optional true} string?]
 [:width
  {:optional true}
  [:or number? [:ref #'Step] [:enum "container"]]]
 [:params {:optional true} [:vector [:ref #'SelectionParameter]]]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:projection {:optional true} [:ref #'Projection]]
 [:view {:optional true} [:ref #'ViewBackground]]
 [:height
  {:optional true}
  [:or number? [:ref #'Step] [:enum "container"]]]
 [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def MarkType
  [:enum
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

(def AxisConfig
  [:map
 {:closed true}
 [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:disable {:optional true} boolean?]
 [:gridDash
  {:optional true}
  [:or
   [:vector number?]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisNumberArray]]]
 [:domainOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labels {:optional true} boolean?]
 [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:format {:optional true} [:ref #'Format]]
 [:labelFlushOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelBaseline
  {:optional true}
  [:or
   [:ref #'TextBaseline]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisLabelBaseline]]]
 [:titleFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:tickBand
  {:optional true}
  [:or [:ref #'ExprRef] [:enum "center" "extent"]]]
 [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:gridOpacity
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:labelOverlap
  {:optional true}
  [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
 [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:domainDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:tickWidth
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:labelOpacity
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:domainColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:grid {:optional true} boolean?]
 [:labelPadding
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:labelLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleBaseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:tickExtra {:optional true} boolean?]
 [:titleX {:optional true} [:or number? [:ref #'ExprRef]]]
 [:tickOpacity
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:tickDashOffset
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:tickCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:labelFlush {:optional true} [:or boolean? number?]]
 [:titleAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelOffset
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:tickRound {:optional true} boolean?]
 [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:or [:ref #'AxisOrient] [:ref #'ExprRef]]]
 [:tickMinStep {:optional true} [:or number? [:ref #'ExprRef]]]
 [:tickDash
  {:optional true}
  [:or
   [:vector number?]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisNumberArray]]]
 [:titleAnchor
  {:optional true}
  [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
 [:labelColor
  {:optional true}
  [:or
   [:or nil? [:ref #'Color]]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisColor]]]
 [:domainCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:style {:optional true} [:or string? [:vector string?]]]
 [:labelAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleY {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:labelExpr {:optional true} string?]
 [:minExtent {:optional true} [:or number? [:ref #'ExprRef]]]
 [:tickCount
  {:optional true}
  [:or
   number?
   [:ref #'TimeInterval]
   [:ref #'TimeIntervalStep]
   [:ref #'ExprRef]]]
 [:formatType {:optional true} string?]
 [:titleColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:tickSize
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:gridDashOffset
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:gridWidth
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:values
  {:optional true}
  [:or
   [:vector number?]
   [:vector string?]
   [:vector boolean?]
   [:vector [:ref #'DateTime]]
   [:ref #'ExprRef]]]
 [:labelFont
  {:optional true}
  [:or string? [:ref #'ExprRef] [:ref #'ConditionalAxisString]]]
 [:maxExtent {:optional true} [:or number? [:ref #'ExprRef]]]
 [:bandPosition {:optional true} [:or number? [:ref #'ExprRef]]]
 [:gridCap {:optional true} [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:translate {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ticks {:optional true} boolean?]
 [:position {:optional true} [:or number? [:ref #'ExprRef]]]
 [:tickOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelAlign
  {:optional true}
  [:or
   [:ref #'Align]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisLabelAlign]]]
 [:domain {:optional true} boolean?]
 [:labelFontWeight
  {:optional true}
  [:or
   [:ref #'FontWeight]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisLabelFontWeight]]]
 [:labelBound
  {:optional true}
  [:or [:or number? boolean?] [:ref #'ExprRef]]]
 [:labelFontStyle
  {:optional true}
  [:or
   [:ref #'FontStyle]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisLabelFontStyle]]]
 [:labelFontSize
  {:optional true}
  [:or number? [:ref #'ExprRef] [:ref #'ConditionalAxisNumber]]]
 [:zindex {:optional true} number?]
 [:gridColor
  {:optional true}
  [:or
   [:or nil? [:ref #'Color]]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisColor]]]
 [:titleFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:domainDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:tickColor
  {:optional true}
  [:or
   [:or nil? [:ref #'Color]]
   [:ref #'ExprRef]
   [:ref #'ConditionalAxisColor]]]
 [:domainWidth {:optional true} [:or number? [:ref #'ExprRef]]]]
)

(def PolarDef
  [:or
 [:ref #'PositionFieldDefBase]
 [:ref #'PositionDatumDefBase]
 [:ref #'PositionValueDef]]
)

(def ValueDefWithCondition_MarkPropFieldOrDatumDef_number_
  [:map
 {:closed true}
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalMarkPropFieldOrDatumDef]
   [:ref #'ConditionalValueDef__number_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]]
 [:value {:optional true} [:or number? [:ref #'ExprRef]]]]
)

(def SortByEncoding
  [:map
 {:closed true}
 [:encoding [:ref #'SortByChannel]]
 [:order {:optional true} [:or [:ref #'SortOrder] nil?]]]
)

(def SelectionInit
  [:or [:ref #'PrimitiveValue] [:ref #'DateTime]]
)

(def ConditionalValueDef__number___ExprRef__
  [:or
 [:ref #'ConditionalPredicate_ValueDef__number___ExprRef___]
 [:ref #'ConditionalParameter_ValueDef__number___ExprRef___]]
)

(def ValueDefWithCondition_MarkPropFieldOrDatumDef__Gradient_string_null__
  [:map
 {:closed true}
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalMarkPropFieldOrDatumDef]
   [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]
   [:vector
    [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]
 [:value
  {:optional true}
  [:or [:ref #'Gradient] [:ref #'ExprRef] string? nil?]]]
)

(def Baseline
  [:enum "top" "middle" "bottom"]
)

(def ConditionalValueDef__string_null_ExprRef__
  [:or
 [:ref #'ConditionalPredicate_ValueDef__string_null_ExprRef___]
 [:ref #'ConditionalParameter_ValueDef__string_null_ExprRef___]]
)

(def ConditionalPredicate_ValueDef_number__
  [:map
 {:closed true}
 [:test [:ref #'PredicateComposition]]
 [:value number?]]
)

(def Point
  [:map
 {:closed true}
 [:bbox {:optional true} [:ref #'BBox]]
 [:coordinates [:ref #'Position]]
 [:type [:= "Point"]]]
)

(def TimeUnitParams
  [:map
 {:closed true}
 [:binned {:optional true} boolean?]
 [:maxbins {:optional true} number?]
 [:step {:optional true} number?]
 [:unit {:optional true} [:ref #'TimeUnit]]
 [:utc {:optional true} boolean?]]
)

(def ConditionalStringFieldDef
  [:or
 [:ref #'ConditionalPredicate_StringFieldDef_]
 [:ref #'ConditionalParameter_StringFieldDef_]]
)

(def FormatConfig
  [:map
 {:closed true}
 [:normalizedNumberFormat {:optional true} string?]
 [:normalizedNumberFormatType {:optional true} string?]
 [:numberFormat {:optional true} string?]
 [:numberFormatType {:optional true} string?]
 [:timeFormat {:optional true} string?]
 [:timeFormatType {:optional true} string?]]
)

(def TimeFormatSpecifier
  [:map
 {:closed true}
 [:quarter {:optional true} string?]
 [:day {:optional true} string?]
 [:date {:optional true} string?]
 [:week {:optional true} string?]
 [:month {:optional true} string?]
 [:seconds {:optional true} string?]
 [:year {:optional true} string?]
 [:hours {:optional true} string?]
 [:milliseconds {:optional true} string?]
 [:minutes {:optional true} string?]]
)

(def VConcatSpec_GenericSpec_
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:name {:optional true} string?]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} boolean?]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:vconcat [:vector [:ref #'Spec]]]
 [:spacing {:optional true} number?]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def FieldOrDatumDefWithCondition_DatumDef_number_
  [:map
 {:closed true}
 [:bandPosition {:optional true} number?]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__number_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__number_ExprRef__]]]]
 [:datum
  {:optional true}
  [:or
   [:ref #'PrimitiveValue]
   [:ref #'DateTime]
   [:ref #'ExprRef]
   [:ref #'RepeatRef]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'Type]]]
)

(def SortField
  [:map
 {:closed true}
 [:field [:ref #'FieldName]]
 [:order {:optional true} [:or [:ref #'SortOrder] nil?]]]
)

(def Vector10_string_
  [:vector string?]
)

(def AxisOrient
  [:enum "top" "bottom" "left" "right"]
)

(def TitleOrient
  [:enum "none" "left" "right" "top" "bottom"]
)

(def RowCol_LayoutAlign_
  [:map
 {:closed true}
 [:column {:optional true} [:ref #'LayoutAlign]]
 [:row {:optional true} [:ref #'LayoutAlign]]]
)

(def BinTransform
  [:map
 {:closed true}
 [:as [:or [:ref #'FieldName] [:vector [:ref #'FieldName]]]]
 [:bin [:or [:ref #'BinParams] [:enum true]]]
 [:field [:ref #'FieldName]]]
)

(def Vector3_number_
  [:vector number?]
)

(def Dict_SelectionInit_
  [:map-of any? any?]
)

(def RangeRaw
  [:vector [:or nil? boolean? string? number? [:ref #'RangeRawArray]]]
)

(def Format
  [:or string? [:ref #'TimeFormatSpecifier] [:ref #'Dict]]
)

(def SymbolShape
  string?
)

(def ScaleDatumDef
  [:map
 {:closed true}
 [:bandPosition {:optional true} number?]
 [:datum
  {:optional true}
  [:or
   [:ref #'PrimitiveValue]
   [:ref #'DateTime]
   [:ref #'ExprRef]
   [:ref #'RepeatRef]]]
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'Type]]]
)

(def ColorDef
  [:ref #'MarkPropDef__Gradient_string_null__]
)

(def ConditionalAxisNumber
  [:ref #'ConditionalAxisProperty__number_null__]
)

(def UtcMultiTimeUnit
  [:enum
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

(def Locale
  [:map
 {:closed true}
 [:number {:optional true} [:ref #'NumberLocale]]
 [:time {:optional true} [:ref #'TimeLocale]]]
)

(def ErrorBand
  [:= "errorband"]
)

(def ScaleInvalidDataShowAs__strokeDash__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__strokeDash__]
 [:enum "zero-or-min"]]
)

(def ErrorBarExtent
  [:enum "ci" "iqr" "stderr" "stdev"]
)

(def UnitSpec
  [:ref #'GenericUnitSpec_Encoding_AnyMark_]
)

(def TitleParams
  [:map
 {:closed true}
 [:baseline {:optional true} [:ref #'TextBaseline]]
 [:align {:optional true} [:ref #'Align]]
 [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
 [:frame
  {:optional true}
  [:or [:or [:ref #'TitleFrame] string?] [:ref #'ExprRef]]]
 [:color
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:subtitleFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:subtitleFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:or [:ref #'TitleOrient] [:ref #'ExprRef]]]
 [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:font {:optional true} [:or string? [:ref #'ExprRef]]]
 [:style {:optional true} [:or string? [:vector string?]]]
 [:subtitleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:subtitle {:optional true} [:ref #'Text]]
 [:fontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:fontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:subtitleColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:subtitlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:anchor {:optional true} [:ref #'TitleAnchor]]
 [:subtitleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:zindex {:optional true} number?]
 [:subtitleFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:text [:or [:ref #'Text] [:ref #'ExprRef]]]]
)

(def ConditionalPredicate_ValueDef__number_ExprRef___
  [:map
 {:closed true}
 [:test [:ref #'PredicateComposition]]
 [:value [:or number? [:ref #'ExprRef]]]]
)

(def MultiPolygon
  [:map
 {:closed true}
 [:bbox {:optional true} [:ref #'BBox]]
 [:coordinates [:vector [:vector [:vector [:ref #'Position]]]]]
 [:type [:= "MultiPolygon"]]]
)

(def MultiLineString
  [:map
 {:closed true}
 [:bbox {:optional true} [:ref #'BBox]]
 [:coordinates [:vector [:vector [:ref #'Position]]]]
 [:type [:= "MultiLineString"]]]
)

(def FacetedEncoding
  [:map
 {:closed true}
 [:y {:optional true} [:ref #'PositionDef]]
 [:description
  {:optional true}
  [:or
   [:ref #'StringFieldDefWithCondition]
   [:ref #'StringValueDefWithCondition]]]
 [:strokeOpacity {:optional true} [:ref #'NumericMarkPropDef]]
 [:xError2
  {:optional true}
  [:or [:ref #'SecondaryFieldDef] [:ref #'ValueDef_number_]]]
 [:stroke {:optional true} [:ref #'ColorDef]]
 [:color {:optional true} [:ref #'ColorDef]]
 [:key {:optional true} [:ref #'FieldDefWithoutScale]]
 [:longitude2 {:optional true} [:ref #'Position2Def]]
 [:fill {:optional true} [:ref #'ColorDef]]
 [:strokeDash {:optional true} [:ref #'NumericArrayMarkPropDef]]
 [:time {:optional true} [:ref #'TimeDef]]
 [:facet {:optional true} [:ref #'FacetEncodingFieldDef]]
 [:longitude {:optional true} [:ref #'LatLongDef]]
 [:fillOpacity {:optional true} [:ref #'NumericMarkPropDef]]
 [:angle {:optional true} [:ref #'NumericMarkPropDef]]
 [:theta {:optional true} [:ref #'PolarDef]]
 [:radius {:optional true} [:ref #'PolarDef]]
 [:theta2 {:optional true} [:ref #'Position2Def]]
 [:size {:optional true} [:ref #'NumericMarkPropDef]]
 [:column {:optional true} [:ref #'RowColumnEncodingFieldDef]]
 [:yError
  {:optional true}
  [:or [:ref #'SecondaryFieldDef] [:ref #'ValueDef_number_]]]
 [:strokeWidth {:optional true} [:ref #'NumericMarkPropDef]]
 [:opacity {:optional true} [:ref #'NumericMarkPropDef]]
 [:shape {:optional true} [:ref #'ShapeDef]]
 [:url
  {:optional true}
  [:or
   [:ref #'StringFieldDefWithCondition]
   [:ref #'StringValueDefWithCondition]]]
 [:latitude {:optional true} [:ref #'LatLongDef]]
 [:order
  {:optional true}
  [:or
   [:ref #'OrderFieldDef]
   [:ref #'OrderValueDef]
   [:ref #'OrderOnlyDef]
   [:vector [:ref #'OrderFieldDef]]]]
 [:xError
  {:optional true}
  [:or [:ref #'SecondaryFieldDef] [:ref #'ValueDef_number_]]]
 [:yError2
  {:optional true}
  [:or [:ref #'SecondaryFieldDef] [:ref #'ValueDef_number_]]]
 [:yOffset {:optional true} [:ref #'OffsetDef]]
 [:x {:optional true} [:ref #'PositionDef]]
 [:y2 {:optional true} [:ref #'Position2Def]]
 [:radius2 {:optional true} [:ref #'Position2Def]]
 [:x2 {:optional true} [:ref #'Position2Def]]
 [:latitude2 {:optional true} [:ref #'Position2Def]]
 [:href
  {:optional true}
  [:or
   [:ref #'StringFieldDefWithCondition]
   [:ref #'StringValueDefWithCondition]]]
 [:tooltip
  {:optional true}
  [:or
   [:ref #'StringFieldDefWithCondition]
   [:ref #'StringValueDefWithCondition]
   [:vector [:ref #'StringFieldDef]]
   nil?]]
 [:row {:optional true} [:ref #'RowColumnEncodingFieldDef]]
 [:text {:optional true} [:ref #'TextDef]]
 [:xOffset {:optional true} [:ref #'OffsetDef]]
 [:detail
  {:optional true}
  [:or
   [:ref #'FieldDefWithoutScale]
   [:vector [:ref #'FieldDefWithoutScale]]]]]
)

(def FieldRange
  [:map {:closed true} [:field string?]]
)

(def Feature_Geometry_GeoJsonProperties_
  [:map
 {:closed true}
 [:bbox {:optional true} [:ref #'BBox]]
 [:geometry [:ref #'Geometry]]
 [:id {:optional true} [:or string? number?]]
 [:properties [:ref #'GeoJsonProperties]]
 [:type [:= "Feature"]]]
)

(def LatLongDef
  [:or [:ref #'LatLongFieldDef] [:ref #'DatumDef]]
)

(def FontWeight
  [:enum
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

(def ScaleInvalidDataShowAs__y__
  [:or [:ref #'ScaleInvalidDataShowAsValue__y__] [:enum "zero-or-min"]]
)

(def SelectionType
  [:enum "point" "interval"]
)

(def TimeDef
  [:ref #'TimeFieldDef]
)

(def ConditionalValueDef_number_
  [:or
 [:ref #'ConditionalPredicate_ValueDef_number__]
 [:ref #'ConditionalParameter_ValueDef_number__]]
)

(def DataFormat
  [:or
 [:ref #'CsvDataFormat]
 [:ref #'DsvDataFormat]
 [:ref #'JsonDataFormat]
 [:ref #'TopoDataFormat]]
)

(def ScaleInvalidDataShowAs__x__
  [:or [:ref #'ScaleInvalidDataShowAsValue__x__] [:enum "zero-or-min"]]
)

(def URI
  string?
)

(def GeoJsonFeatureCollection
  [:ref #'FeatureCollection]
)

(def CompositeMarkDef
  [:or [:ref #'BoxPlotDef] [:ref #'ErrorBarDef] [:ref #'ErrorBandDef]]
)

(def TypedFieldDef
  [:map
 {:closed true}
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:bandPosition {:optional true} number?]
 [:bin
  {:optional true}
  [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
 [:field {:optional true} [:ref #'Field]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'StandardType]]]
)

(def RadialGradient
  [:map
 {:closed true}
 [:stops [:vector [:ref #'GradientStop]]]
 [:y1 {:optional true} number?]
 [:r2 {:optional true} number?]
 [:r1 {:optional true} number?]
 [:id {:optional true} string?]
 [:gradient [:= "radial"]]
 [:x1 {:optional true} number?]
 [:y2 {:optional true} number?]
 [:x2 {:optional true} number?]]
)

(def ScaleInvalidDataShowAsValue__size__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def PointSelectionConfigWithoutType
  [:map
 {:closed true}
 [:clear {:optional true} [:or [:ref #'Stream] string? boolean?]]
 [:encodings {:optional true} [:vector [:ref #'SingleDefUnitChannel]]]
 [:fields {:optional true} [:vector [:ref #'FieldName]]]
 [:nearest {:optional true} boolean?]
 [:on {:optional true} [:or [:ref #'Stream] string?]]
 [:resolve {:optional true} [:ref #'SelectionResolution]]
 [:toggle {:optional true} [:or string? boolean?]]]
)

(def Month
  number?
)

(def ArgmaxDef
  [:map {:closed true} [:argmax [:ref #'FieldName]]]
)

(def ScaleInvalidDataShowAs__fillOpacity__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__fillOpacity__]
 [:enum "zero-or-min"]]
)

(def StringFieldDefWithCondition
  [:ref #'FieldOrDatumDefWithCondition_StringFieldDef_string_]
)

(def OrderFieldDef
  [:map
 {:closed true}
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:bandPosition {:optional true} number?]
 [:bin
  {:optional true}
  [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
 [:field {:optional true} [:ref #'Field]]
 [:sort {:optional true} [:ref #'SortOrder]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'StandardType]]]
)

(def FieldOrDatumDefWithCondition_MarkPropFieldDef_TypeForShape___string_null__
  [:map
 {:closed true}
 [:scale {:optional true} [:or [:ref #'Scale] nil?]]
 [:legend {:optional true} [:or [:ref #'Legend] nil?]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'TypeForShape]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__string_null_ExprRef__]
   [:vector [:ref #'ConditionalValueDef__string_null_ExprRef__]]]]
 [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:sort {:optional true} [:ref #'Sort]]]
)

(def BrushConfig
  [:map
 {:closed true}
 [:cursor {:optional true} [:ref #'Cursor]]
 [:fill {:optional true} [:ref #'Color]]
 [:fillOpacity {:optional true} number?]
 [:stroke {:optional true} [:ref #'Color]]
 [:strokeDash {:optional true} [:vector number?]]
 [:strokeDashOffset {:optional true} number?]
 [:strokeOpacity {:optional true} number?]
 [:strokeWidth {:optional true} number?]]
)

(def ScaleInvalidDataShowAsValue__xOffset__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def ScaleInvalidDataShowAs__opacity__
  [:or
 [:ref #'ScaleInvalidDataShowAsValue__opacity__]
 [:enum "zero-or-min"]]
)

(def LinearGradient
  [:map
 {:closed true}
 [:gradient [:= "linear"]]
 [:id {:optional true} string?]
 [:stops [:vector [:ref #'GradientStop]]]
 [:x1 {:optional true} number?]
 [:x2 {:optional true} number?]
 [:y1 {:optional true} number?]
 [:y2 {:optional true} number?]]
)

(def TickConfig
  [:map
 {:closed true}
 [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:baseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
 [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:discreteBandSize
  {:optional true}
  [:or number? [:ref #'RelativeBandSize]]]
 [:thickness {:optional true} number?]
 [:stroke
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
 [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:binSpacing {:optional true} number?]
 [:timeUnitBandSize {:optional true} number?]
 [:fill
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:time {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
 [:bandSize {:optional true} number?]
 [:width {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
 [:continuousBandSize {:optional true} number?]
 [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
 [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
 [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandPosition {:optional true} number?]
 [:interpolate
  {:optional true}
  [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
 [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:font {:optional true} [:or string? [:ref #'ExprRef]]]
 [:size {:optional true} [:or number? [:ref #'ExprRef]]]
 [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:minBandSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:fontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:strokeJoin
  {:optional true}
  [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
 [:shape
  {:optional true}
  [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
 [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:order {:optional true} [:or nil? boolean?]]
 [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:cornerRadiusTopRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
 [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
 [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:filled {:optional true} boolean?]
 [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:tooltip
  {:optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref #'TooltipContent]
   [:ref #'ExprRef]]]
 [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:height {:optional true} [:or number? [:ref #'ExprRef]]]
 [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]]
)

(def ScaleType
  [:enum
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

(def FacetMapping
  [:map
 {:closed true}
 [:column {:optional true} [:ref #'FacetFieldDef]]
 [:row {:optional true} [:ref #'FacetFieldDef]]]
)

(def ViewConfig
  [:map
 {:closed true}
 [:discreteHeight
  {:optional true}
  [:or number? [:map {:closed true} [:step number?]]]]
 [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:stroke {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
 [:clip {:optional true} boolean?]
 [:discreteWidth
  {:optional true}
  [:or number? [:map {:closed true} [:step number?]]]]
 [:fill {:optional true} [:or [:ref #'Color] [:ref #'ExprRef] nil?]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:cursor {:optional true} [:ref #'Cursor]]
 [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:continuousWidth {:optional true} number?]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:continuousHeight {:optional true} number?]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeJoin
  {:optional true}
  [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
 [:strokeCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:step {:optional true} number?]]
)

(def ConditionalPredicate_StringFieldDef_
  [:map
 {:closed true}
 [:format {:optional true} [:ref #'Format]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:formatType {:optional true} string?]
 [:bin
  {:optional true}
  [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]
 [:test [:ref #'PredicateComposition]]]
)

(def StringFieldDef
  [:map
 {:closed true}
 [:format {:optional true} [:ref #'Format]]
 [:field {:optional true} [:ref #'Field]]
 [:type {:optional true} [:ref #'StandardType]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:formatType {:optional true} string?]
 [:bin
  {:optional true}
  [:or boolean? nil? [:ref #'BinParams] [:enum "binned"]]]
 [:bandPosition {:optional true} number?]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]
 [:aggregate {:optional true} [:ref #'Aggregate]]]
)

(def ConcatSpec_GenericSpec_
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:align
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:concat [:vector [:ref #'Spec]]]
 [:columns {:optional true} number?]
 [:name {:optional true} string?]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def LayerSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:encoding {:optional true} [:ref #'SharedEncoding]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:name {:optional true} string?]
 [:width
  {:optional true}
  [:or number? [:ref #'Step] [:enum "container"]]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:layer [:vector [:or [:ref #'LayerSpec] [:ref #'UnitSpec]]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:projection {:optional true} [:ref #'Projection]]
 [:view {:optional true} [:ref #'ViewBackground]]
 [:height
  {:optional true}
  [:or number? [:ref #'Step] [:enum "container"]]]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def ValueDef__number__width___height__ExprRef__
  [:map
 {:closed true}
 [:value [:or number? [:ref #'ExprRef] [:enum "width" "height"]]]]
)

(def BarConfig
  [:map
 {:closed true}
 [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:baseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
 [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:discreteBandSize
  {:optional true}
  [:or number? [:ref #'RelativeBandSize]]]
 [:stroke
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
 [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:binSpacing {:optional true} number?]
 [:timeUnitBandSize {:optional true} number?]
 [:fill
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:time {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
 [:width {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
 [:continuousBandSize {:optional true} number?]
 [:cornerRadiusEnd {:optional true} [:or number? [:ref #'ExprRef]]]
 [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
 [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
 [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandPosition {:optional true} number?]
 [:interpolate
  {:optional true}
  [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
 [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:font {:optional true} [:or string? [:ref #'ExprRef]]]
 [:size {:optional true} [:or number? [:ref #'ExprRef]]]
 [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:minBandSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:fontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:strokeJoin
  {:optional true}
  [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
 [:shape
  {:optional true}
  [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
 [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:order {:optional true} [:or nil? boolean?]]
 [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:cornerRadiusTopRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
 [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
 [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:filled {:optional true} boolean?]
 [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:tooltip
  {:optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref #'TooltipContent]
   [:ref #'ExprRef]]]
 [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:height {:optional true} [:or number? [:ref #'ExprRef]]]
 [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]]
)

(def MarkPropDef__string_null__TypeForShape_
  [:or
 [:ref
  #'FieldOrDatumDefWithCondition_MarkPropFieldDef_TypeForShape___string_null__]
 [:ref #'FieldOrDatumDefWithCondition_DatumDef__string_null__]
 [:ref
  #'ValueDefWithCondition_MarkPropFieldOrDatumDef_TypeForShape___string_null__]]
)

(def LookupData
  [:map
 {:closed true}
 [:data [:ref #'Data]]
 [:fields {:optional true} [:vector [:ref #'FieldName]]]
 [:key [:ref #'FieldName]]]
)

(def Stream
  [:or [:ref #'EventStream] [:ref #'DerivedStream] [:ref #'MergedStream]]
)

(def GradientStop
  [:map {:closed true} [:color [:ref #'Color]] [:offset number?]]
)

(def SortByChannelDesc
  [:enum
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

(def ScaleInvalidDataShowAsValue__color__
  [:map
 {:closed true}
 [:value {:optional true} [:or [:ref #'Color] [:ref #'Gradient]]]]
)

(def WindowFieldDef
  [:map
 {:closed true}
 [:as [:ref #'FieldName]]
 [:field {:optional true} [:ref #'FieldName]]
 [:op [:or [:ref #'AggregateOp] [:ref #'WindowOnlyOp]]]
 [:param {:optional true} number?]]
)

(def LookupSelection
  [:map
 {:closed true}
 [:fields {:optional true} [:vector [:ref #'FieldName]]]
 [:key [:ref #'FieldName]]
 [:param [:ref #'ParameterName]]]
)

(def MarkInvalidDataMode
  [:enum
 "filter"
 "break-paths-filter-domains"
 "break-paths-show-domains"
 "break-paths-show-path-domains"
 "show"]
)

(def ConditionalMarkPropFieldOrDatumDef_TypeForShape_
  [:or
 [:ref #'ConditionalPredicate_MarkPropFieldOrDatumDef_TypeForShape__]
 [:ref #'ConditionalParameter_MarkPropFieldOrDatumDef_TypeForShape__]]
)

(def ShapeDef
  [:ref #'MarkPropDef__string_null__TypeForShape_]
)

(def SampleTransform
  [:map {:closed true} [:sample number?]]
)

(def StepFor
  [:enum "position" "offset"]
)

(def ConditionalAxisNumberArray
  [:ref #'ConditionalAxisProperty__number___null__]
)

(def Text
  [:or string? [:vector string?]]
)

(def FieldLTPredicate
  [:map
 {:closed true}
 [:field [:ref #'FieldName]]
 [:lt [:or string? number? [:ref #'DateTime] [:ref #'ExprRef]]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]]
)

(def NonLayerRepeatSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:align
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:columns {:optional true} number?]
 [:name {:optional true} string?]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
 [:spec [:ref #'NonNormalizedSpec]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:repeat [:or [:vector string?] [:ref #'RepeatMapping]]]
 [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

(def SelectionInitMapping
  [:ref #'Dict_SelectionInit_]
)

(def SortOrder
  [:enum "ascending" "descending"]
)

(def ConditionalPredicate_ValueDef__number___ExprRef___
  [:map
 {:closed true}
 [:test [:ref #'PredicateComposition]]
 [:value [:or [:vector number?] [:ref #'ExprRef]]]]
)

(def NumberLocale
  [:map
 {:closed true}
 [:currency [:ref #'Vector2_string_]]
 [:decimal string?]
 [:grouping [:vector number?]]
 [:minus {:optional true} string?]
 [:nan {:optional true} string?]
 [:numerals {:optional true} [:ref #'Vector10_string_]]
 [:percent {:optional true} string?]
 [:thousands string?]]
)

(def Legend
  [:map
 {:closed true}
 [:titleOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:labelLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:symbolDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:gridAlign
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'ExprRef]]]
 [:symbolSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:format {:optional true} [:ref #'Format]]
 [:gradientOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelSeparation {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelBaseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:titleFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:titleLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:labelOverlap
  {:optional true}
  [:or [:ref #'LabelOverlap] [:ref #'ExprRef]]]
 [:gradientStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:gradientThickness {:optional true} [:or number? [:ref #'ExprRef]]]
 [:offset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:columns {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelPadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:columnPadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:clipHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleBaseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:symbolDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:type {:optional true} [:enum "symbol" "gradient"]]
 [:labelOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleLineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'LegendOrient]]
 [:tickMinStep {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleAnchor
  {:optional true}
  [:or [:ref #'TitleAnchor] [:ref #'ExprRef]]]
 [:gradientStrokeColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:labelColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:titleFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:symbolFillColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:labelExpr {:optional true} string?]
 [:titleOrient {:optional true} [:or [:ref #'Orient] [:ref #'ExprRef]]]
 [:tickCount
  {:optional true}
  [:or [:ref #'TickCount] [:ref #'ExprRef]]]
 [:formatType {:optional true} string?]
 [:titleColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:symbolOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:legendX {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:symbolOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titlePadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:values
  {:optional true}
  [:or
   [:vector number?]
   [:vector string?]
   [:vector boolean?]
   [:vector [:ref #'DateTime]]
   [:ref #'ExprRef]]]
 [:gradientLength {:optional true} [:or number? [:ref #'ExprRef]]]
 [:padding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelFont {:optional true} [:or string? [:ref #'ExprRef]]]
 [:strokeColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:symbolStrokeColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:rowPadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:labelAlign {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:symbolType
  {:optional true}
  [:or [:ref #'SymbolShape] [:ref #'ExprRef]]]
 [:labelFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:labelFontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:labelFontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fillColor
  {:optional true}
  [:or [:or nil? [:ref #'Color]] [:ref #'ExprRef]]]
 [:zindex {:optional true} number?]
 [:direction {:optional true} [:ref #'Orientation]]
 [:symbolStrokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:titleFontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:legendY {:optional true} [:or number? [:ref #'ExprRef]]]
 [:symbolLimit {:optional true} [:or number? [:ref #'ExprRef]]]]
)

(def ParameterPredicate
  [:map
 {:closed true}
 [:empty {:optional true} boolean?]
 [:param [:ref #'ParameterName]]]
)

(def Datasets
  [:ref #'Dict_InlineDataset_]
)

(def FieldOrDatumDefWithCondition_DatumDef__Gradient_string_null__
  [:map
 {:closed true}
 [:bandPosition {:optional true} number?]
 [:condition
  {:optional true}
  [:or
   [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]
   [:vector
    [:ref #'ConditionalValueDef__Gradient_string_null_ExprRef__]]]]
 [:datum
  {:optional true}
  [:or
   [:ref #'PrimitiveValue]
   [:ref #'DateTime]
   [:ref #'ExprRef]
   [:ref #'RepeatRef]]]
 [:title {:optional true} [:or [:ref #'Text] nil?]]
 [:type {:optional true} [:ref #'Type]]]
)

(def Vector2_Vector2_number__
  [:vector [:ref #'Vector2_number_]]
)

(def StyleConfigIndex
  [:map
 {:closed false}
 [:tick {:optional true} [:ref #'TickConfig]]
 [:geoshape {:optional true} [:ref #'MarkConfig]]
 [:group-title {:optional true} [:ref #'MarkConfig]]
 [:arc {:optional true} [:ref #'RectConfig]]
 [:mark {:optional true} [:ref #'MarkConfig]]
 [:bar {:optional true} [:ref #'BarConfig]]
 [:rule {:optional true} [:ref #'MarkConfig]]
 [:guide-label {:optional true} [:ref #'MarkConfig]]
 [:circle {:optional true} [:ref #'MarkConfig]]
 [:trail {:optional true} [:ref #'LineConfig]]
 [:line {:optional true} [:ref #'LineConfig]]
 [:square {:optional true} [:ref #'MarkConfig]]
 [:image {:optional true} [:ref #'RectConfig]]
 [:point {:optional true} [:ref #'MarkConfig]]
 [:area {:optional true} [:ref #'AreaConfig]]
 [:group-subtitle {:optional true} [:ref #'MarkConfig]]
 [:guide-title {:optional true} [:ref #'MarkConfig]]
 [:rect {:optional true} [:ref #'RectConfig]]
 [:text {:optional true} [:ref #'MarkConfig]]]
)

(def AxisResolveMap
  [:map
 {:closed true}
 [:x {:optional true} [:ref #'ResolveMode]]
 [:y {:optional true} [:ref #'ResolveMode]]]
)

(def ScaleBinParams
  [:map
 {:closed true}
 [:start {:optional true} number?]
 [:step number?]
 [:stop {:optional true} number?]]
)

(def TimeUnit
  [:or [:ref #'SingleTimeUnit] [:ref #'MultiTimeUnit]]
)

(def MultiPoint
  [:map
 {:closed true}
 [:bbox {:optional true} [:ref #'BBox]]
 [:coordinates [:vector [:ref #'Position]]]
 [:type [:= "MultiPoint"]]]
)

(def RepeatRef
  [:map {:closed true} [:repeat [:enum "row" "column" "repeat" "layer"]]]
)

(def DerivedStream
  [:map
 {:closed true}
 [:between {:optional true} [:vector [:ref #'Stream]]]
 [:consume {:optional true} boolean?]
 [:debounce {:optional true} number?]
 [:filter {:optional true} [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
 [:markname {:optional true} string?]
 [:marktype {:optional true} [:ref #'MarkType]]
 [:stream [:ref #'Stream]]
 [:throttle {:optional true} number?]]
)

(def PredicateComposition
  [:or
 [:ref #'LogicalNot_Predicate_]
 [:ref #'LogicalAnd_Predicate_]
 [:ref #'LogicalOr_Predicate_]
 [:ref #'Predicate]]
)

(def FieldOneOfPredicate
  [:map
 {:closed true}
 [:field [:ref #'FieldName]]
 [:oneOf
  [:or
   [:vector string?]
   [:vector number?]
   [:vector boolean?]
   [:vector [:ref #'DateTime]]]]
 [:timeUnit
  {:optional true}
  [:or
   [:ref #'TimeUnit]
   [:ref #'BinnedTimeUnit]
   [:ref #'TimeUnitParams]]]]
)

(def ExprRef
  [:map {:closed true} [:expr string?]]
)

(def MarkConfig
  [:map
 {:closed true}
 [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:baseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
 [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:stroke
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
 [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandSize {:optional true} number?]
 [:fill
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:time {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
 [:width {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
 [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
 [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
 [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandPosition {:optional true} number?]
 [:interpolate
  {:optional true}
  [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
 [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:font {:optional true} [:or string? [:ref #'ExprRef]]]
 [:size {:optional true} [:or number? [:ref #'ExprRef]]]
 [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:fontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:strokeJoin
  {:optional true}
  [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
 [:shape
  {:optional true}
  [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
 [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:order {:optional true} [:or nil? boolean?]]
 [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:cornerRadiusTopRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
 [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
 [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:filled {:optional true} boolean?]
 [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:tooltip
  {:optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref #'TooltipContent]
   [:ref #'ExprRef]]]
 [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:height {:optional true} [:or number? [:ref #'ExprRef]]]
 [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]]
)

(def AllSortString
  [:or
 [:ref #'SortOrder]
 [:ref #'SortByChannel]
 [:ref #'SortByChannelDesc]]
)

(def PositionDef
  [:or
 [:ref #'PositionFieldDef]
 [:ref #'PositionDatumDef]
 [:ref #'PositionValueDef]]
)

(def RangeRawArray
  [:vector number?]
)

(def Vector2_number_
  [:vector number?]
)

(def RowCol_boolean_
  [:map
 {:closed true}
 [:column {:optional true} boolean?]
 [:row {:optional true} boolean?]]
)

(def ScaleConfig
  [:map
 {:closed true}
 [:zero {:optional true} boolean?]
 [:bandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
 [:barBandPaddingInner {:optional true} [:or number? [:ref #'ExprRef]]]
 [:xReverse {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:maxOpacity {:optional true} number?]
 [:quantizeCount {:optional true} number?]
 [:rectBandPaddingInner
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:continuousPadding {:optional true} [:or number? [:ref #'ExprRef]]]
 [:bandWithNestedOffsetPaddingOuter
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:quantileCount {:optional true} number?]
 [:useUnaggregatedDomain {:optional true} boolean?]
 [:invalid {:optional true} [:ref #'ScaleInvalidDataConfig]]
 [:maxBandSize {:optional true} number?]
 [:bandPaddingOuter {:optional true} [:or number? [:ref #'ExprRef]]]
 [:minSize {:optional true} number?]
 [:animationDuration {:optional true} number?]
 [:round {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:offsetBandPaddingInner
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:tickBandPaddingInner
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:minFontSize {:optional true} number?]
 [:offsetBandPaddingOuter
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:minBandSize {:optional true} number?]
 [:maxStrokeWidth {:optional true} number?]
 [:maxFontSize {:optional true} number?]
 [:minOpacity {:optional true} number?]
 [:maxSize {:optional true} number?]
 [:bandWithNestedOffsetPaddingInner
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:clamp {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:framesPerSecond {:optional true} number?]
 [:minStrokeWidth {:optional true} number?]
 [:pointPadding {:optional true} [:or number? [:ref #'ExprRef]]]]
)

(def Fit
  [:or
 [:ref #'GeoJsonFeature]
 [:ref #'GeoJsonFeatureCollection]
 [:vector [:ref #'GeoJsonFeature]]]
)

(def MergedStream
  [:map
 {:closed true}
 [:between {:optional true} [:vector [:ref #'Stream]]]
 [:consume {:optional true} boolean?]
 [:debounce {:optional true} number?]
 [:filter {:optional true} [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
 [:markname {:optional true} string?]
 [:marktype {:optional true} [:ref #'MarkType]]
 [:merge [:vector [:ref #'Stream]]]
 [:throttle {:optional true} number?]]
)

(def AreaConfig
  [:map
 {:closed true}
 [:y {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:description {:optional true} [:or string? [:ref #'ExprRef]]]
 [:baseline
  {:optional true}
  [:or [:ref #'TextBaseline] [:ref #'ExprRef]]]
 [:smooth {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:padAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:startAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aspect {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:cornerRadiusBottomRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:ariaRoleDescription {:optional true} [:or string? [:ref #'ExprRef]]]
 [:align {:optional true} [:or [:ref #'Align] [:ref #'ExprRef]]]
 [:stroke
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:dx {:optional true} [:or number? [:ref #'ExprRef]]]
 [:color
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef]]]
 [:tension {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dir {:optional true} [:or [:ref #'TextDirection] [:ref #'ExprRef]]]
 [:innerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:limit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandSize {:optional true} number?]
 [:fill
  {:optional true}
  [:or [:ref #'Color] [:ref #'Gradient] [:ref #'ExprRef] nil?]]
 [:strokeDash
  {:optional true}
  [:or [:vector number?] [:ref #'ExprRef]]]
 [:time {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ellipsis {:optional true} [:or string? [:ref #'ExprRef]]]
 [:width {:optional true} [:or number? [:ref #'ExprRef]]]
 [:dy {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cursor {:optional true} [:or [:ref #'Cursor] [:ref #'ExprRef]]]
 [:lineBreak {:optional true} [:or string? [:ref #'ExprRef]]]
 [:invalid {:optional true} [:or [:ref #'MarkInvalidDataMode] nil?]]
 [:fillOpacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:orient {:optional true} [:ref #'Orientation]]
 [:strokeMiterLimit {:optional true} [:or number? [:ref #'ExprRef]]]
 [:timeUnitBandPosition {:optional true} number?]
 [:interpolate
  {:optional true}
  [:or [:ref #'Interpolate] [:ref #'ExprRef]]]
 [:angle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeDashOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta {:optional true} [:or number? [:ref #'ExprRef]]]
 [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:theta2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:font {:optional true} [:or string? [:ref #'ExprRef]]]
 [:size {:optional true} [:or number? [:ref #'ExprRef]]]
 [:outerRadius {:optional true} [:or number? [:ref #'ExprRef]]]
 [:aria {:optional true} [:or boolean? [:ref #'ExprRef]]]
 [:line {:optional true} [:or boolean? [:ref #'OverlayMarkDef]]]
 [:strokeWidth {:optional true} [:or number? [:ref #'ExprRef]]]
 [:opacity {:optional true} [:or number? [:ref #'ExprRef]]]
 [:fontStyle
  {:optional true}
  [:or [:ref #'FontStyle] [:ref #'ExprRef]]]
 [:fontWeight
  {:optional true}
  [:or [:ref #'FontWeight] [:ref #'ExprRef]]]
 [:strokeJoin
  {:optional true}
  [:or [:ref #'StrokeJoin] [:ref #'ExprRef]]]
 [:shape
  {:optional true}
  [:or [:or [:ref #'SymbolShape] string?] [:ref #'ExprRef]]]
 [:url {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:order {:optional true} [:or nil? boolean?]]
 [:cornerRadiusTopLeft {:optional true} [:or number? [:ref #'ExprRef]]]
 [:cornerRadiusBottomLeft
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:point
  {:optional true}
  [:or boolean? [:ref #'OverlayMarkDef] [:enum "transparent"]]]
 [:lineHeight {:optional true} [:or number? [:ref #'ExprRef]]]
 [:strokeCap
  {:optional true}
  [:or [:ref #'StrokeCap] [:ref #'ExprRef]]]
 [:x {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:cornerRadiusTopRight
  {:optional true}
  [:or number? [:ref #'ExprRef]]]
 [:blend {:optional true} [:or [:ref #'Blend] [:ref #'ExprRef]]]
 [:fontSize {:optional true} [:or number? [:ref #'ExprRef]]]
 [:ariaRole {:optional true} [:or string? [:ref #'ExprRef]]]
 [:endAngle {:optional true} [:or number? [:ref #'ExprRef]]]
 [:y2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "height"]]]
 [:filled {:optional true} boolean?]
 [:radius2 {:optional true} [:or number? [:ref #'ExprRef]]]
 [:x2 {:optional true} [:or number? [:ref #'ExprRef] [:enum "width"]]]
 [:href {:optional true} [:or [:ref #'URI] [:ref #'ExprRef]]]
 [:tooltip
  {:optional true}
  [:or
   number?
   string?
   boolean?
   nil?
   [:ref #'TooltipContent]
   [:ref #'ExprRef]]]
 [:strokeOffset {:optional true} [:or number? [:ref #'ExprRef]]]
 [:height {:optional true} [:or number? [:ref #'ExprRef]]]
 [:text {:optional true} [:or [:ref #'Text] [:ref #'ExprRef]]]]
)

(def ConditionalParameter_ValueDef_number__
  [:map
 {:closed true}
 [:empty {:optional true} boolean?]
 [:param [:ref #'ParameterName]]
 [:value number?]]
)

(def WindowEventType
  [:or [:ref #'EventType] string?]
)

(def RegressionTransform
  [:map
 {:closed true}
 [:as {:optional true} [:vector [:ref #'FieldName]]]
 [:extent {:optional true} [:vector number?]]
 [:groupby {:optional true} [:vector [:ref #'FieldName]]]
 [:method
  {:optional true}
  [:enum "linear" "log" "exp" "pow" "quad" "poly"]]
 [:on [:ref #'FieldName]]
 [:order {:optional true} number?]
 [:params {:optional true} boolean?]
 [:regression [:ref #'FieldName]]]
)

(def BoxPlot
  [:= "boxplot"]
)

(def Dict_InlineDataset_
  [:map-of any? any?]
)

(def TopLevelFacetSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:autosize
  {:optional true}
  [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
 [:align
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
 [:datasets {:optional true} [:ref #'Datasets]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:usermeta {:optional true} [:ref #'Dict]]
 [:config {:optional true} [:ref #'Config]]
 [:columns {:optional true} number?]
 [:name {:optional true} string?]
 [:facet [:or [:ref #'FacetFieldDef] [:ref #'FacetMapping]]]
 [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
 [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
 [:spec [:or [:ref #'LayerSpec] [:ref #'UnitSpecWithFrame]]]
 [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:$schema {:optional true} string?]
 [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]
 [:data [:or [:ref #'Data] nil?]]]
)

(def AggregateOp
  [:enum
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

(def LayerRepeatMapping
  [:map
 {:closed true}
 [:column {:optional true} [:vector string?]]
 [:layer [:vector string?]]
 [:row {:optional true} [:vector string?]]]
)

(def ScaleInvalidDataShowAsValue__fillOpacity__
  [:map {:closed true} [:value {:optional true} number?]]
)

(def ImputeTransform
  [:map
 {:closed true}
 [:frame {:optional true} [:vector [:or nil? number?]]]
 [:groupby {:optional true} [:vector [:ref #'FieldName]]]
 [:impute [:ref #'FieldName]]
 [:key [:ref #'FieldName]]
 [:keyvals
  {:optional true}
  [:or [:vector any?] [:ref #'ImputeSequence]]]
 [:method {:optional true} [:ref #'ImputeMethod]]
 [:value {:optional true} any?]]
)

(def ConditionalPredicate_ValueDef__string_null_ExprRef___
  [:map
 {:closed true}
 [:test [:ref #'PredicateComposition]]
 [:value [:or string? nil? [:ref #'ExprRef]]]]
)

(def ScaleInvalidDataShowAsValue__fill__
  [:map
 {:closed true}
 [:value {:optional true} [:or [:ref #'Color] [:ref #'Gradient] nil?]]]
)

(def MarkPropDef_number___
  [:or
 [:ref #'FieldOrDatumDefWithCondition_MarkPropFieldDef_number___]
 [:ref #'FieldOrDatumDefWithCondition_DatumDef_number___]
 [:ref #'ValueDefWithCondition_MarkPropFieldOrDatumDef_number___]]
)

(def ConditionalAxisString
  [:ref #'ConditionalAxisProperty__string_null__]
)

(def SequentialSingleHue
  [:enum
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

(def TitleConfig
  [:ref #'BaseTitleNoValueRefs]
)

(def ParameterExtent
  [:or
 [:map
  {:closed true}
  [:field {:optional true} [:ref #'FieldName]]
  [:param [:ref #'ParameterName]]]
 [:map
  {:closed true}
  [:encoding {:optional true} [:ref #'SingleDefUnitChannel]]
  [:param [:ref #'ParameterName]]]]
)

(def LayerRepeatSpec
  [:map
 {:closed true}
 [:description {:optional true} string?]
 [:align
  {:optional true}
  [:or [:ref #'LayoutAlign] [:ref #'RowCol_LayoutAlign_]]]
 [:transform {:optional true} [:vector [:ref #'Transform]]]
 [:columns {:optional true} number?]
 [:name {:optional true} string?]
 [:bounds {:optional true} [:enum "full" "flush"]]
 [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
 [:center {:optional true} [:or boolean? [:ref #'RowCol_boolean_]]]
 [:spec [:or [:ref #'LayerSpec] [:ref #'UnitSpecWithFrame]]]
 [:resolve {:optional true} [:ref #'Resolve]]
 [:repeat [:ref #'LayerRepeatMapping]]
 [:spacing {:optional true} [:or number? [:ref #'RowCol_number_]]]
 [:data {:optional true} [:or [:ref #'Data] nil?]]]
)

;; Top Level Schema
(def schema
  [:ref #'TopLevelSpec]
)