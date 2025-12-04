(ns clj-yavl.schema.vega-lite
  (:require [malli.core :as m]
            [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.common :as common]
            [clj-yavl.schema.vega-lite.data :as data]
            [clj-yavl.schema.vega-lite.mark :as mark]
            [clj-yavl.schema.vega-lite.scale :as scale]
            [clj-yavl.schema.vega-lite.axis :as axis]
            [clj-yavl.schema.vega-lite.legend :as legend]
            [clj-yavl.schema.vega-lite.transform :as transform]
            [clj-yavl.schema.vega-lite.projection :as projection]
            [clj-yavl.schema.vega-lite.selection :as selection]
            [clj-yavl.schema.vega-lite.encoding :as encoding]
            [clj-yavl.schema.vega-lite.config :as config]
            [clj-yavl.schema.vega-lite.unit :as unit]
            [clj-yavl.schema.vega-lite.layer :as layer]
            [clj-yavl.schema.vega-lite.facet :as facet]))

(declare Spec)

(def LayoutAlign primitives/LayoutAlign)
(def RowCol_LayoutAlign_ common/RowCol_LayoutAlign_)
(def Transform transform/Transform)
(def Text common/Text)
(def TitleParams config/TitleParams)
(def RowCol_boolean_ primitives/RowCol_boolean_)
(def Resolve unit/Resolve)
(def RepeatMapping primitives/RepeatMapping)
(def RowCol_number_ primitives/RowCol_number_)
(def Data data/Data)
(def LayerRepeatMapping primitives/LayerRepeatMapping)
(def UnitSpecWithFrame unit/UnitSpecWithFrame)
(def LayerSpec layer/LayerSpec)
(def AutosizeType primitives/AutosizeType)
(def AutoSizeParams config/AutoSizeParams)
(def Datasets data/Datasets)
(def Dict primitives/Dict)
(def Config config/Config)
(def Color common/Color)
(def ExprRef expr/ExprRef)
(def TopLevelParameter selection/TopLevelParameter)
(def Padding primitives/Padding)
(def FacetedUnitSpec facet/FacetedUnitSpec)
(def FacetSpec facet/FacetSpec)
(def TopLevelUnitSpec unit/TopLevelUnitSpec)
(def TopLevelFacetSpec facet/TopLevelFacetSpec)
(def TopLevelLayerSpec layer/TopLevelLayerSpec)

(def NonNormalizedSpec [:ref #'Spec])

(def NonLayerRepeatSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:columns {:optional true} number?] [:name {:optional true} string?]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:spec [:ref #'NonNormalizedSpec]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:repeat [:or [:vector string?] [:ref #'RepeatMapping]]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def LayerRepeatSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:columns {:optional true} number?] [:name {:optional true} string?]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:spec [:or [:ref #'LayerSpec] [:ref #'UnitSpecWithFrame]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:repeat [:ref #'LayerRepeatMapping]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def RepeatSpec [:or [:ref #'NonLayerRepeatSpec] [:ref #'LayerRepeatSpec]])

(def HConcatSpec_GenericSpec_
  [:map {:closed true, :json-schema/original-name "HConcatSpec<GenericSpec>"}
   [:description {:optional true} string?]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:hconcat [:vector [:ref #'Spec]]] [:name {:optional true} string?]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true} boolean?]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:spacing {:optional true} number?]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def VConcatSpec_GenericSpec_
  [:map {:closed true, :json-schema/original-name "VConcatSpec<GenericSpec>"}
   [:description {:optional true} string?]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:name {:optional true} string?]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true} boolean?]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:vconcat [:vector [:ref #'Spec]]] [:spacing {:optional true} number?]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def ConcatSpec_GenericSpec_
  [:map {:closed true, :json-schema/original-name "ConcatSpec<GenericSpec>"}
   [:description {:optional true} string?]
   [:align {:optional true}
    [:or [:ref #'LayoutAlign]
     [:ref {:json-schema/original-name "RowCol<LayoutAlign>"}
      #'RowCol_LayoutAlign_]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:concat [:vector [:ref #'Spec]]] [:columns {:optional true} number?]
   [:name {:optional true} string?]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def Spec
  [:or [:ref #'FacetedUnitSpec] [:ref #'LayerSpec] [:ref #'RepeatSpec]
   [:ref #'FacetSpec]
   [:ref {:json-schema/original-name "ConcatSpec<GenericSpec>"}
    #'ConcatSpec_GenericSpec_]
   [:ref {:json-schema/original-name "VConcatSpec<GenericSpec>"}
    #'VConcatSpec_GenericSpec_]
   [:ref {:json-schema/original-name "HConcatSpec<GenericSpec>"}
    #'HConcatSpec_GenericSpec_]])

(def TopLevelRepeatSpec
  [:or
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
    [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
    [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
    [:bounds {:optional true} [:enum "full" "flush"]]
    [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
    [:center {:optional true}
     [:or boolean?
      [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
    [:spec [:ref #'NonNormalizedSpec]]
    [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
    [:resolve {:optional true} [:ref #'Resolve]]
    [:repeat [:or [:vector string?] [:ref #'RepeatMapping]]]
    [:$schema {:optional true} string?]
    [:spacing {:optional true}
     [:or number?
      [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
    [:data {:optional true} [:or [:ref #'Data] nil?]]]
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
    [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
    [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
    [:bounds {:optional true} [:enum "full" "flush"]]
    [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
    [:center {:optional true}
     [:or boolean?
      [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
    [:spec [:or [:ref #'LayerSpec] [:ref #'UnitSpecWithFrame]]]
    [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
    [:resolve {:optional true} [:ref #'Resolve]]
    [:repeat [:ref #'LayerRepeatMapping]] [:$schema {:optional true} string?]
    [:spacing {:optional true}
     [:or number?
      [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
    [:data {:optional true} [:or [:ref #'Data] nil?]]]])

(def TopLevelConcatSpec
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
   [:concat [:vector [:ref #'NonNormalizedSpec]]]
   [:columns {:optional true} number?] [:name {:optional true} string?]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true}
    [:or boolean?
     [:ref {:json-schema/original-name "RowCol<boolean>"} #'RowCol_boolean_]]]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:$schema {:optional true} string?]
   [:spacing {:optional true}
    [:or number?
     [:ref {:json-schema/original-name "RowCol<number>"} #'RowCol_number_]]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def TopLevelHConcatSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:datasets {:optional true} [:ref #'Datasets]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:hconcat [:vector [:ref #'NonNormalizedSpec]]]
   [:usermeta {:optional true} [:ref #'Dict]]
   [:config {:optional true} [:ref #'Config]] [:name {:optional true} string?]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:bounds {:optional true} [:enum "full" "flush"]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:center {:optional true} boolean?]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:$schema {:optional true} string?] [:spacing {:optional true} number?]
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def TopLevelVConcatSpec
  [:map {:closed true} [:description {:optional true} string?]
   [:autosize {:optional true}
    [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:datasets {:optional true} [:ref #'Datasets]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:usermeta {:optional true} [:ref #'Dict]]
   [:config {:optional true} [:ref #'Config]] [:name {:optional true} string?]
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
   [:data {:optional true} [:or [:ref #'Data] nil?]]])

(def TopLevelSpec
  [:or [:ref #'TopLevelUnitSpec] [:ref #'TopLevelFacetSpec]
   [:ref #'TopLevelLayerSpec] [:ref #'TopLevelRepeatSpec]
   [:ref #'TopLevelConcatSpec] [:ref #'TopLevelVConcatSpec]
   [:ref #'TopLevelHConcatSpec]])

(def schema [:ref #'TopLevelSpec])
