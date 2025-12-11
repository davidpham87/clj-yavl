(ns
 clj-yavl.schema2.vega-lite
 (:require
  [malli.core :as m]
  [malli.util :as mu]
  [clj-yavl.schema2.vega-lite.primitives :as primitives]
  [clj-yavl.schema2.vega-lite.expr :as expr]
  [clj-yavl.schema2.vega-lite.common :as common]
  [clj-yavl.schema2.vega-lite.data :as data]
  [clj-yavl.schema2.vega-lite.mark :as mark]
  [clj-yavl.schema2.vega-lite.scale :as scale]
  [clj-yavl.schema2.vega-lite.axis :as axis]
  [clj-yavl.schema2.vega-lite.legend :as legend]
  [clj-yavl.schema2.vega-lite.transform :as transform]
  [clj-yavl.schema2.vega-lite.projection :as projection]
  [clj-yavl.schema2.vega-lite.selection :as selection]
  [clj-yavl.schema2.vega-lite.encoding :as encoding]
  [clj-yavl.schema2.vega-lite.config :as config]
  [clj-yavl.schema2.vega-lite.unit :as unit]
  [clj-yavl.schema2.vega-lite.layer :as layer]
  [clj-yavl.schema2.vega-lite.facet :as facet]
  [clj-yavl.schema2.vega-lite.toplevel :as toplevel]))

(def
 common-map
 {:align
  [:align
   {:optional true}
   [:or
    [:ref #'LayoutAlign]
    [:ref
     #:json-schema{:original-name "RowCol<LayoutAlign>"}
     #'RowCol_LayoutAlign_]]],
  :bounds [:bounds {:optional true} [:enum "full" "flush"]],
  :center [:center {:optional true} boolean?],
  :columns [:columns {:optional true} number?],
  :data [:data {:optional true} [:or [:ref #'Data] nil?]],
  :description [:description {:optional true} string?],
  :name [:name {:optional true} string?],
  :repeat [:repeat [:ref #'LayerRepeatMapping]],
  :resolve [:resolve {:optional true} [:ref #'Resolve]],
  :spacing [:spacing {:optional true} number?],
  :spec [:spec [:ref #'NonNormalizedSpec]],
  :title
  [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]],
  :transform
  [:transform {:optional true} [:vector [:ref #'Transform]]]})

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

(def
 NonLayerRepeatSpec
 (into
  [:map
   {:closed true}
   [:center
    {:optional true}
    [:or
     boolean?
     [:ref
      #:json-schema{:original-name "RowCol<boolean>"}
      #'RowCol_boolean_]]]
   [:repeat [:or [:vector string?] [:ref #'RepeatMapping]]]
   [:spacing
    {:optional true}
    [:or
     number?
     [:ref
      #:json-schema{:original-name "RowCol<number>"}
      #'RowCol_number_]]]]
  [(get common-map :description)
   (get common-map :align)
   (get common-map :transform)
   (get common-map :columns)
   (get common-map :name)
   (get common-map :bounds)
   (get common-map :title)
   (get common-map :spec)
   (get common-map :resolve)
   (get common-map :data)]))

(def
 LayerRepeatSpec
 (into
  [:map
   {:closed true}
   [:center
    {:optional true}
    [:or
     boolean?
     [:ref
      #:json-schema{:original-name "RowCol<boolean>"}
      #'RowCol_boolean_]]]
   [:spec [:or [:ref #'LayerSpec] [:ref #'UnitSpecWithFrame]]]
   [:spacing
    {:optional true}
    [:or
     number?
     [:ref
      #:json-schema{:original-name "RowCol<number>"}
      #'RowCol_number_]]]]
  [(get common-map :description)
   (get common-map :align)
   (get common-map :transform)
   (get common-map :columns)
   (get common-map :name)
   (get common-map :bounds)
   (get common-map :title)
   (get common-map :resolve)
   (get common-map :repeat)
   (get common-map :data)]))

(def
 RepeatSpec
 [:or [:ref #'NonLayerRepeatSpec] [:ref #'LayerRepeatSpec]])

(def
 BaseConcatSpec
 [:map
  [:bounds {:optional true} [:enum "full" "flush"]]
  [:data {:optional true} [:or [:ref #'Data] nil?]]
  [:description {:optional true} string?]
  [:name {:optional true} string?]
  [:resolve {:optional true} [:ref #'Resolve]]
  [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
  [:transform {:optional true} [:vector [:ref #'Transform]]]])

(def
 HConcatSpec_GenericSpec_
 (mu/merge
  BaseConcatSpec
  (into
   [:map
    {:closed true,
     :json-schema/original-name "HConcatSpec<GenericSpec>"}
    [:hconcat [:vector [:ref #'Spec]]]]
   [(get common-map :center) (get common-map :spacing)])))

(def
 VConcatSpec_GenericSpec_
 (mu/merge
  BaseConcatSpec
  (into
   [:map
    {:closed true,
     :json-schema/original-name "VConcatSpec<GenericSpec>"}
    [:vconcat [:vector [:ref #'Spec]]]]
   [(get common-map :center) (get common-map :spacing)])))

(def
 ConcatSpec_GenericSpec_
 (mu/merge
  BaseConcatSpec
  (into
   [:map
    {:closed true,
     :json-schema/original-name "ConcatSpec<GenericSpec>"}
    [:center
     {:optional true}
     [:or
      boolean?
      [:ref
       #:json-schema{:original-name "RowCol<boolean>"}
       #'RowCol_boolean_]]]
    [:concat [:vector [:ref #'Spec]]]
    [:spacing
     {:optional true}
     [:or
      number?
      [:ref
       #:json-schema{:original-name "RowCol<number>"}
       #'RowCol_number_]]]]
   [(get common-map :align) (get common-map :columns)])))

(def
 Spec
 [:or
  [:ref #'FacetedUnitSpec]
  [:ref #'LayerSpec]
  [:ref #'RepeatSpec]
  [:ref #'FacetSpec]
  [:ref
   #:json-schema{:original-name "ConcatSpec<GenericSpec>"}
   #'ConcatSpec_GenericSpec_]
  [:ref
   #:json-schema{:original-name "VConcatSpec<GenericSpec>"}
   #'VConcatSpec_GenericSpec_]
  [:ref
   #:json-schema{:original-name "HConcatSpec<GenericSpec>"}
   #'HConcatSpec_GenericSpec_]])

(def
 TopLevelRepeatSpec
 [:or
  (mu/merge
   toplevel/TopLevelProps
   (into
    [:map
     {:closed true}
     [:center
      {:optional true}
      [:or
       boolean?
       [:ref
        #:json-schema{:original-name "RowCol<boolean>"}
        #'RowCol_boolean_]]]
     [:repeat [:or [:vector string?] [:ref #'RepeatMapping]]]
     [:spacing
      {:optional true}
      [:or
       number?
       [:ref
        #:json-schema{:original-name "RowCol<number>"}
        #'RowCol_number_]]]]
    [(get common-map :align)
     (get common-map :bounds)
     (get common-map :columns)
     (get common-map :spec)]))
  (mu/merge
   toplevel/TopLevelProps
   (into
    [:map
     {:closed true}
     [:center
      {:optional true}
      [:or
       boolean?
       [:ref
        #:json-schema{:original-name "RowCol<boolean>"}
        #'RowCol_boolean_]]]
     [:spacing
      {:optional true}
      [:or
       number?
       [:ref
        #:json-schema{:original-name "RowCol<number>"}
        #'RowCol_number_]]]
     [:spec [:or [:ref #'LayerSpec] [:ref #'UnitSpecWithFrame]]]]
    [(get common-map :align)
     (get common-map :bounds)
     (get common-map :columns)
     (get common-map :repeat)]))])

(def
 TopLevelConcatSpec
 (mu/merge
  toplevel/TopLevelProps
  (into
   [:map
    {:closed true}
    [:center
     {:optional true}
     [:or
      boolean?
      [:ref
       #:json-schema{:original-name "RowCol<boolean>"}
       #'RowCol_boolean_]]]
    [:concat [:vector [:ref #'NonNormalizedSpec]]]
    [:spacing
     {:optional true}
     [:or
      number?
      [:ref
       #:json-schema{:original-name "RowCol<number>"}
       #'RowCol_number_]]]]
   [(get common-map :align)
    (get common-map :bounds)
    (get common-map :columns)])))

(def
 TopLevelHConcatSpec
 (mu/merge
  toplevel/TopLevelProps
  (into
   [:map
    {:closed true}
    [:hconcat [:vector [:ref #'NonNormalizedSpec]]]]
   [(get common-map :bounds)
    (get common-map :center)
    (get common-map :spacing)])))

(def
 TopLevelVConcatSpec
 (mu/merge
  toplevel/TopLevelProps
  (into
   [:map
    {:closed true}
    [:vconcat [:vector [:ref #'NonNormalizedSpec]]]]
   [(get common-map :bounds)
    (get common-map :center)
    (get common-map :spacing)])))

(def
 TopLevelSpec
 [:or
  [:ref #'TopLevelUnitSpec]
  [:ref #'TopLevelFacetSpec]
  [:ref #'TopLevelLayerSpec]
  [:ref #'TopLevelRepeatSpec]
  [:ref #'TopLevelConcatSpec]
  [:ref #'TopLevelVConcatSpec]
  [:ref #'TopLevelHConcatSpec]])

(def schema [:ref #'TopLevelSpec])
