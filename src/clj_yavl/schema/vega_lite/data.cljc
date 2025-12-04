(ns clj-yavl.schema.vega-lite.data
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]))

(def FieldName primitives/FieldName)
(def InlineDataset primitives/InlineDataset)
(def Parse primitives/Parse)

(def CsvDataFormat
  [:map {:closed true} [:parse {:optional true} [:or [:ref #'Parse] nil?]]
   [:type {:optional true} [:enum "csv" "tsv"]]])

(def JsonDataFormat
  [:map {:closed true} [:parse {:optional true} [:or [:ref #'Parse] nil?]]
   [:property {:optional true} string?] [:type {:optional true} [:= "json"]]])

(def TopoDataFormat
  [:map {:closed true} [:feature {:optional true} string?]
   [:mesh {:optional true} string?]
   [:parse {:optional true} [:or [:ref #'Parse] nil?]]
   [:type {:optional true} [:= "topojson"]]])

(def DsvDataFormat
  [:map {:closed true} [:delimiter string?]
   [:parse {:optional true} [:or [:ref #'Parse] nil?]]
   [:type {:optional true} [:= "dsv"]]])

(def DataFormat
  [:or [:ref #'CsvDataFormat] [:ref #'DsvDataFormat] [:ref #'JsonDataFormat]
   [:ref #'TopoDataFormat]])

(def InlineData
  [:map {:closed true} [:format {:optional true} [:ref #'DataFormat]]
   [:name {:optional true} string?] [:values [:ref #'InlineDataset]]])

(def NamedData
  [:map {:closed true} [:format {:optional true} [:ref #'DataFormat]]
   [:name string?]])

(def UrlData
  [:map {:closed true} [:format {:optional true} [:ref #'DataFormat]]
   [:name {:optional true} string?] [:url string?]])

(def DataSource [:or [:ref #'UrlData] [:ref #'InlineData] [:ref #'NamedData]])

(def Vector2_number_ primitives/Vector2_number_)

(def Vector2_Vector2_number__
  [:vector {:json-schema/original-name "Vector2<Vector2<number>>"}
   [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]])

(def GraticuleParams
  [:map {:closed true}
   [:extent {:optional true}
    [:ref {:json-schema/original-name "Vector2<Vector2<number>>"}
     #'Vector2_Vector2_number__]]
   [:extentMajor {:optional true}
    [:ref {:json-schema/original-name "Vector2<Vector2<number>>"}
     #'Vector2_Vector2_number__]]
   [:extentMinor {:optional true}
    [:ref {:json-schema/original-name "Vector2<Vector2<number>>"}
     #'Vector2_Vector2_number__]] [:precision {:optional true} number?]
   [:step {:optional true}
    [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]]
   [:stepMajor {:optional true}
    [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]]
   [:stepMinor {:optional true}
    [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]]])

(def GraticuleGenerator
  [:map {:closed true} [:graticule [:or [:ref #'GraticuleParams] [:enum true]]]
   [:name {:optional true} string?]])

(def SequenceParams
  [:map {:closed true} [:as {:optional true} [:ref #'FieldName]]
   [:start number?] [:step {:optional true} number?] [:stop number?]])

(def SequenceGenerator
  [:map {:closed true} [:name {:optional true} string?]
   [:sequence [:ref #'SequenceParams]]])

(def SphereGenerator primitives/SphereGenerator)

(def Generator
  [:or [:ref #'SequenceGenerator] [:ref #'SphereGenerator]
   [:ref #'GraticuleGenerator]])

(def Data [:or [:ref #'DataSource] [:ref #'Generator]])

(def Dict_InlineDataset_ primitives/Dict_InlineDataset_)

(def Datasets
  [:ref {:json-schema/original-name "Dict<InlineDataset>"}
   #'Dict_InlineDataset_])
