(ns clj-yavl.portal
  (:require
   [portal.web :as p]
   [re-frame.core :as rf]
   [reagent.core :as r]))

(rf/reg-fx
 :portal/open
 (fn [iframe-parent-id]
   (if iframe-parent-id
     (let [iframe-parent (.getElementById js/document iframe-parent-id)]
       (p/open {:launcher :iframe
                :iframe-parent iframe-parent
                :theme :portal.colors/zenburn}))
     (p/open {:theme :portal.colors/zenburn}))))

(rf/reg-event-fx
 ::open
 (fn [_ [_ {:keys [node-id]}]]
   {:portal/open node-id}))

(rf/reg-fx
 :portal/submit
 (fn [value]
   (p/submit value)))

(rf/reg-event-fx
 ::submit
 (fn [_ [_ value viewer]]
   {:portal/submit
    (if viewer
      (if (satisfies? IWithMeta value)
        (with-meta value {:portal.viewer/default viewer})
        [viewer value])
      value)}))

(defn portal-frame
  "Renders a div that acts as the container for the Portal iframe."
  []
  [:div {:class "w-full"
         :style {:height "100%" :margin 0 :padding 0}
         :ref (fn [el]
                (when el
                  (p/open {:launcher :iframe
                           :iframe-parent el
                           :theme :portal.colors/zenburn})))}])

(defn portal-panel
  "A Reagent component that renders a Portal inspector and automatically submits
 data to it."
  [value & [viewer]]
  (r/create-class
   {:component-did-mount
    (fn [this]
      (let [[_ value viewer] (r/argv this)]
        (rf/dispatch [::submit value viewer])))
    :component-did-update
    (fn [this [_ old-value old-viewer]]
      (let [[_ value viewer] (r/argv this)]
        (when (or (not= value old-value)
                  (not= viewer old-viewer))
          (rf/dispatch [::submit value viewer]))))
    :reagent-render
    (fn [value viewer]
      [portal-frame])}))
