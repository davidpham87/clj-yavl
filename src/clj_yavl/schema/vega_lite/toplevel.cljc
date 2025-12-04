(ns clj-yavl.schema.vega-lite.toplevel
  (:require [clj-yavl.schema.vega-lite.primitives :as primitives]
            [clj-yavl.schema.vega-lite.expr :as expr]
            [clj-yavl.schema.vega-lite.common :as common]
            [clj-yavl.schema.vega-lite.config :as config]
            [clj-yavl.schema.vega-lite.data :as data]
            [clj-yavl.schema.vega-lite.selection :as selection]
            [clj-yavl.schema.vega-lite.transform :as transform]))

(def AutosizeType primitives/AutosizeType)
(def AutoSizeParams config/AutoSizeParams)
(def Color common/Color)
(def ExprRef expr/ExprRef)
(def Config config/Config)
(def Data data/Data)
(def Datasets data/Datasets)
(def Padding primitives/Padding)
(def TopLevelParameter selection/TopLevelParameter)
(def Text common/Text)
(def TitleParams config/TitleParams)
(def Dict primitives/Dict)
(def Resolve common/Resolve)
(def Transform transform/Transform)

(def TopLevelProps
  [:map
   [:$schema {:optional true} string?]
   [:autosize {:optional true} [:or [:ref #'AutosizeType] [:ref #'AutoSizeParams]]]
   [:background {:optional true} [:or [:ref #'Color] [:ref #'ExprRef]]]
   [:config {:optional true} [:ref #'Config]]
   [:data {:optional true} [:or [:ref #'Data] nil?]]
   [:datasets {:optional true} [:ref #'Datasets]]
   [:description {:optional true} string?]
   [:name {:optional true} string?]
   [:padding {:optional true} [:or [:ref #'Padding] [:ref #'ExprRef]]]
   [:params {:optional true} [:vector [:ref #'TopLevelParameter]]]
   [:resolve {:optional true} [:ref #'Resolve]]
   [:title {:optional true} [:or [:ref #'Text] [:ref #'TitleParams]]]
   [:transform {:optional true} [:vector [:ref #'Transform]]]
   [:usermeta {:optional true} [:ref #'Dict]]])
