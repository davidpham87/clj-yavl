(ns clj-yavl.schema.vega-lite.facet
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.common :as common]
            [clj-yavl.schema.vega-lite.unit :as unit]
            [clj-yavl.schema.vega-lite.layer :as layer]
            [clj-yavl.schema.vega-lite.config :as config]
            [clj-yavl.schema.vega-lite.encoding :as encoding]
            [clj-yavl.schema.vega-lite.transform :as transform]
            [clj-yavl.schema.vega-lite.data :as data]
            [clj-yavl.schema.vega-lite.selection :as selection]
            [clj-yavl.schema.vega-lite.mark :as mark]
            [clj-yavl.schema.vega-lite.projection :as projection]))

(def Field encoding/Field)
(def StandardType primitives/StandardType)
(def Text common/Text)
(def BinParams transform/BinParams)
(def TimeUnit expr/TimeUnit)
(def BinnedTimeUnit expr/BinnedTimeUnit)
(def TimeUnitParams expr/TimeUnitParams)
(def Aggregate common/Aggregate)
(def SortArray encoding/SortArray)
(def SortOrder common/SortOrder)
(def EncodingSortField encoding/EncodingSortField)
(def LayoutAlign primitives/LayoutAlign)
(def RowCol_LayoutAlign_ common/RowCol_LayoutAlign_)
(def Transform transform/Transform)
(def RowCol_boolean_ primitives/RowCol_boolean_)
(def RowCol_number_ primitives/RowCol_number_)
(def Resolve unit/Resolve)
(def Data data/Data)
(def FacetedEncoding unit/FacetedEncoding)
(def AnyMark mark/AnyMark)
(def Step unit/Step)
(def SelectionParameter selection/SelectionParameter)
(def TitleParams config/TitleParams)
(def Projection projection/Projection)
(def ViewBackground unit/ViewBackground)
(def AutosizeType primitives/AutosizeType)
(def AutoSizeParams config/AutoSizeParams)
(def Datasets data/Datasets)
(def Dict primitives/Dict)
(def Config config/Config)
(def Color common/Color)
(def ExprRef expr/ExprRef)
(def TopLevelParameter selection/TopLevelParameter)
(def Padding primitives/Padding)
(def LayerSpec layer/LayerSpec)

(def TextBaseline common/TextBaseline)
(def FontStyle common/FontStyle)
(def Align common/Align)
(def FontWeight common/FontWeight)
(def TitleAnchor common/TitleAnchor)
(def Format config/Format)

(def Header
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
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:labelAngle {:optional true} number?]
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

(def FacetFieldDef
  [:map {:closed true} [:field {:optional true} [:ref #'Field]]
   [:type {:optional true} [:ref #'StandardType]]
   [:header {:optional true} [:or [:ref #'Header] nil?]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:bandPosition {:optional true} number?]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:sort {:optional true}
    [:or [:ref #'SortArray] [:ref #'SortOrder] [:ref #'EncodingSortField]
     nil?]]])

(def FacetedUnitSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'FacetedEncoding]]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:mark [:ref #'AnyMark]] [:name {:optional true} string?]
   [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:params {:optional true} [:vector [:ref #'SelectionParameter]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:projection {:optional true} [:ref #'Projection]]
   [:view {:optional true} [:ref #'ViewBackground]]
   [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def FacetMapping
  [:map {:closed true} [:column {:optional true} [:ref #'FacetFieldDef]]
   [:row {:optional true} [:ref #'FacetFieldDef]]])

(def FacetSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:columns {:optional true} number?] [:name {:optional true} string?]
   [:facet [:or [:ref #'FacetFieldDef] [:ref #'FacetMapping]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:spec [:or [:ref #'LayerSpec] [:ref #'FacetedUnitSpec]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def TopLevelFacetSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]] [:datasets {:optional true} [:ref #'Datasets]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:usermeta {:optional true} [:ref #'Dict]]
   [:config {:optional true} [:ref #'Config]]
   [:columns {:optional true} number?] [:name {:optional true} string?]
   [:facet [:or [:ref #'FacetFieldDef] [:ref #'FacetMapping]]]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:spec [:or [:ref #'LayerSpec] [:ref #'unit/UnitSpecWithFrame]]]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:$schema {:optional true} string?]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data [:or [:ref #'Data] nil?]]])
