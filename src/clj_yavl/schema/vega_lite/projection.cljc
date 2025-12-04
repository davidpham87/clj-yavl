(ns clj-yavl.schema.vega-lite.projection
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.data :as data]))

(def ExprRef expr/ExprRef)
(def Vector2_number_ data/Vector2_number_)
(def Vector2_Vector2_number__ data/Vector2_Vector2_number__)

(def ProjectionType primitives/ProjectionType)
(def Vector3_number_ primitives/Vector3_number_)
(def GeoJsonProperties primitives/GeoJsonProperties)
(def Position primitives/Position)
(def BBox primitives/BBox)

(declare Geometry)

(def Polygon
  [:map {:closed true}
   [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:vector [:vector [:ref #'Position]]]]
   [:type [:= "Polygon"]]])

(def LineString
  [:map {:closed true}
   [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:vector [:ref #'Position]]]
   [:type [:= "LineString"]]])

(def GeometryCollection
  [:map {:closed true}
   [:bbox {:optional true} [:ref #'BBox]]
   [:geometries [:vector [:ref #'Geometry]]]
   [:type [:= "GeometryCollection"]]])

(def Point
  [:map {:closed true}
   [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:ref #'Position]]
   [:type [:= "Point"]]])

(def MultiPolygon
  [:map {:closed true}
   [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:vector [:vector [:vector [:ref #'Position]]]]]
   [:type [:= "MultiPolygon"]]])

(def MultiLineString
  [:map {:closed true}
   [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:vector [:vector [:ref #'Position]]]]
   [:type [:= "MultiLineString"]]])

(def MultiPoint
  [:map {:closed true}
   [:bbox {:optional true} [:ref #'BBox]]
   [:coordinates [:vector [:ref #'Position]]]
   [:type [:= "MultiPoint"]]])

(def Geometry
  [:or [:ref #'Point] [:ref #'MultiPoint] [:ref #'LineString]
   [:ref #'MultiLineString] [:ref #'Polygon] [:ref #'MultiPolygon]
   [:ref #'GeometryCollection]])

(def Feature
  [:map {:closed true}
   [:bbox {:optional true} [:ref #'BBox]]
   [:geometry [:ref #'Geometry]]
   [:id {:optional true} [:or string? number?]]
   [:properties [:ref #'GeoJsonProperties]]
   [:type [:= "Feature"]]])

(def GeoJsonFeature [:ref #'Feature])

(def Feature_Geometry_GeoJsonProperties_
  [:map
   {:closed true,
    :json-schema/original-name "Feature<Geometry,GeoJsonProperties>"}
   [:bbox {:optional true} [:ref #'BBox]]
   [:geometry [:ref #'Geometry]]
   [:id {:optional true} [:or string? number?]]
   [:properties [:ref #'GeoJsonProperties]]
   [:type [:= "Feature"]]])

(def FeatureCollection
  [:map {:closed true}
   [:bbox {:optional true} [:ref #'BBox]]
   [:features
    [:vector
     [:ref {:json-schema/original-name "Feature<Geometry,GeoJsonProperties>"}
      #'Feature_Geometry_GeoJsonProperties_]]]
   [:type [:= "FeatureCollection"]]])

(def GeoJsonFeatureCollection [:ref #'FeatureCollection])

(def Fit
  [:or [:ref #'GeoJsonFeature] [:ref #'GeoJsonFeatureCollection]
   [:vector [:ref #'GeoJsonFeature]]])

(def Projection
  [:map {:closed true}
   [:center {:optional true}
    [:or [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]
     [:ref #'ExprRef]]]
   [:clipAngle {:optional true} [:or number? [:ref #'ExprRef]]]
   [:clipExtent {:optional true}
    [:or
     [:ref {:json-schema/original-name "Vector2<Vector2<number>>"}
      #'Vector2_Vector2_number__] [:ref #'ExprRef]]]
   [:coefficient {:optional true} [:or number? [:ref #'ExprRef]]]
   [:distance {:optional true} [:or number? [:ref #'ExprRef]]]
   [:extent {:optional true}
    [:or
     [:ref {:json-schema/original-name "Vector2<Vector2<number>>"}
      #'Vector2_Vector2_number__] [:ref #'ExprRef]]]
   [:fit {:optional true}
    [:or [:ref #'Fit] [:ref #'ExprRef] [:vector [:ref #'Fit]]]]
   [:fraction {:optional true} [:or number? [:ref #'ExprRef]]]
   [:lobes {:optional true} [:or number? [:ref #'ExprRef]]]
   [:parallel {:optional true} [:or number? [:ref #'ExprRef]]]
   [:parallels {:optional true} [:or [:vector number?] [:ref #'ExprRef]]]
   [:pointRadius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:precision {:optional true} [:or number? [:ref #'ExprRef]]]
   [:radius {:optional true} [:or number? [:ref #'ExprRef]]]
   [:ratio {:optional true} [:or number? [:ref #'ExprRef]]]
   [:reflectX {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:reflectY {:optional true} [:or boolean? [:ref #'ExprRef]]]
   [:rotate {:optional true}
    [:or
     [:or
      [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]
      [:ref {:json-schema/original-name "Vector3<number>"} #'Vector3_number_]]
     [:ref #'ExprRef]]]
   [:scale {:optional true} [:or number? [:ref #'ExprRef]]]
   [:size {:optional true}
    [:or [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]
     [:ref #'ExprRef]]]
   [:spacing {:optional true} [:or number? [:ref #'ExprRef]]]
   [:tilt {:optional true} [:or number? [:ref #'ExprRef]]]
   [:translate {:optional true}
    [:or [:ref {:json-schema/original-name "Vector2<number>"} #'Vector2_number_]
     [:ref #'ExprRef]]]
   [:type {:optional true} [:or [:ref #'ProjectionType] [:ref #'ExprRef]]]])
