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
   [:title {:optional true} [:or [:ref #'Text] nil?]]
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

(def FacetFieldDef
  [:map {:closed true}
   [:aggregate {:optional true} [:ref #'Aggregate]]
   [:bandPosition {:optional true} number?]
   [:bin {:optional true} [:or boolean? nil? [:ref #'BinParams]]]
   [:field {:optional true} [:ref #'Field]]
   [:header {:optional true} [:or [:ref #'Header] nil?]]
   [:sort {:optional true}
    [:or [:ref #'SortArray] [:ref #'SortOrder] [:ref #'EncodingSortField]
     nil?]]
   [:timeUnit {:optional true}
    [:or [:ref #'TimeUnit] [:ref #'BinnedTimeUnit] [:ref #'TimeUnitParams]]]
   [:title {:optional true} [:or [:ref #'Text] nil?]]
   [:type {:optional true} [:ref #'StandardType]]])

(def FacetedUnitSpec
  [:map {:closed true}
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]
   [:description {:optional true} string?]
   [:encoding {:optional true} [:ref #'FacetedEncoding]]
   [:height {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]
   [:mark [:ref #'AnyMark]]
   [:name {:optional true} string?]
   [:params {:optional true} [:vector [:ref #'SelectionParameter]]]
   [:projection {:optional true} [:ref #'Projection]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:view {:optional true} [:ref #'ViewBackground]]
   [:width {:optional true} [:or number? [:ref #'Step] [:enum "container"]]]])

(def FacetMapping
  [:map {:closed true}
   [:column {:optional true} [:ref #'FacetFieldDef]]
   [:row {:optional true} [:ref #'FacetFieldDef]]])

(def FacetSpec
  [:map {:closed true}
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:columns {:optional true} number?]
   [:data {:optional true} [:or [:ref #'Data] nil?]]
   [:description {:optional true} string?]
   [:facet [:or [:ref #'FacetFieldDef] [:ref #'FacetMapping]]]
   [:name {:optional true} string?]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:spec [:or [:ref #'LayerSpec] [:ref #'FacetedUnitSpec]]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]])

(def TopLevelFacetSpec
  [:map {:closed true}
   [:$schema {:optional true} string?]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:columns {:optional true} number?]
   [:config {:optional true} [:ref #'Config]]
   [:data [:or [:ref #'Data] nil?]]
   [:datasets {:optional true} [:ref #'Datasets]]
   [:description {:optional true} string?]
   [:facet [:or [:ref #'FacetFieldDef] [:ref #'FacetMapping]]]
   [:name {:optional true} string?]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:spec [:or [:ref #'LayerSpec] [:ref #'unit/UnitSpecWithFrame]]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:usermeta {:optional true} [:ref #'Dict]]])
