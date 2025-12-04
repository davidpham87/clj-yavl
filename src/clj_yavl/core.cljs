(ns clj-yavl.core
  (:require [reagent.dom :as rdom]
            [re-frame.core :as rf]
            [clj-yavl.views.vega-lite :as vega-lite]))

(defn ^:dev/after-load mount-root []
  (rf/clear-subscription-cache!)
  (let [root-el (.getElementById js/document "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [vega-lite/panel] root-el)))

(defn init []
  (mount-root))

(init)
