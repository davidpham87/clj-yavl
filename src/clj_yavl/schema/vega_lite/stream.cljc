(ns clj-yavl.schema.vega-lite.stream
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]))

(def Expr primitives/Expr)
(def EventType primitives/EventType)
(def MarkType primitives/MarkType)

(declare Stream)

(def WindowEventType [:or [:ref #'EventType] string?])

(def EventStream
  [:or
   [:map {:closed true} [:markname {:optional true} string?]
    [:debounce {:optional true} number?] [:consume {:optional true} boolean?]
    [:between {:optional true} [:vector [:ref #'Stream]]]
    [:type [:ref #'EventType]] [:source {:optional true} [:enum "view" "scope"]]
    [:filter {:optional true} [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
    [:marktype {:optional true} [:ref #'MarkType]]
    [:throttle {:optional true} number?]]
   [:map {:closed true} [:markname {:optional true} string?]
    [:debounce {:optional true} number?] [:consume {:optional true} boolean?]
    [:between {:optional true} [:vector [:ref #'Stream]]]
    [:type [:ref #'WindowEventType]] [:source [:= "window"]]
    [:filter {:optional true} [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
    [:marktype {:optional true} [:ref #'MarkType]]
    [:throttle {:optional true} number?]]])

(def DerivedStream
  [:map {:closed true} [:between {:optional true} [:vector [:ref #'Stream]]]
   [:consume {:optional true} boolean?] [:debounce {:optional true} number?]
   [:filter {:optional true} [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
   [:markname {:optional true} string?]
   [:marktype {:optional true} [:ref #'MarkType]] [:stream [:ref #'Stream]]
   [:throttle {:optional true} number?]])

(def MergedStream
  [:map {:closed true} [:between {:optional true} [:vector [:ref #'Stream]]]
   [:consume {:optional true} boolean?] [:debounce {:optional true} number?]
   [:filter {:optional true} [:or [:ref #'Expr] [:vector [:ref #'Expr]]]]
   [:markname {:optional true} string?]
   [:marktype {:optional true} [:ref #'MarkType]]
   [:merge [:vector [:ref #'Stream]]] [:throttle {:optional true} number?]])

(def Stream
  [:or [:ref #'EventStream] [:ref #'DerivedStream] [:ref #'MergedStream]])
