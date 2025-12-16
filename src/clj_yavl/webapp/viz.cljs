(ns clj-yavl.webapp.viz
  (:require [reagent.core :as r]
            ["vega-embed" :as vega-embed]))

(defn vega-lite-viz [spec]
  (let [container-ref (r/atom nil)
        view-ref (r/atom nil)]
    (r/create-class
     {:display-name "vega-lite-viz"
      :component-did-mount
      (fn [_]
        (when (and @container-ref spec)
          (-> @container-ref
              (vega-embed/default (clj->js spec) (clj->js {:actions true}))
              (.then (fn [res]
                       (reset! view-ref (.-view res))))
              (.catch js/console.error))))
      :component-did-update
      (fn [this]
        (let [new-spec (second (r/argv this))]
          (when @container-ref
            (println (clj->js new-spec) (clj->js {:actions true}))
            (-> @container-ref
                (vega-embed/default (clj->js new-spec) (clj->js {:actions true}))
                (.then (fn [res]
                         (reset! view-ref (.-view res))))
                (.catch js/console.error)))))
      :component-will-unmount
      (fn [_]
        (when @view-ref
          (.finalize @view-ref)))
      :reagent-render
      (fn [spec]
        [:div {:class "w-full h-full overflow-auto p-4"
               :ref #(reset! container-ref %)}])})))
