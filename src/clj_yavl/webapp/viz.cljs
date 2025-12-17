(ns clj-yavl.webapp.viz
  (:require [reagent.core :as r]
            ["vega-embed" :default vegaEmbed]))

(defn vega-lite-viz [spec]
  (let [container-ref (r/atom nil)
        view-ref (r/atom nil)]
    (r/create-class
     {:display-name "vega-lite-viz"
      :component-did-mount
      (fn [_]
        (when (and @container-ref spec)
          (-> @container-ref
              (vegaEmbed (clj->js spec) (clj->js {:actions true}))
              (.then (fn [res]
                       (reset! view-ref (.-view res))))
              (.catch (fn [err]
                        (js/console.error "Vega Embed Error (mount):" err))))))
      :component-did-update
      (fn [this]
        (let [new-spec (second (r/argv this))]
          (when (and @container-ref new-spec)
            (-> @container-ref
                (vegaEmbed (clj->js new-spec) (clj->js {:actions true}))
                (.then (fn [res]
                         (reset! view-ref (.-view res))))
                (.catch (fn [err]
                          (js/console.error "Vega Embed Error (update):" err)))))))
      :component-will-unmount
      (fn [_]
        (when @view-ref
          (.finalize @view-ref)))
      :reagent-render
      (fn [spec]
        [:div {:class "w-full h-full overflow-auto p-4"
               :ref #(reset! container-ref %)}])})))
