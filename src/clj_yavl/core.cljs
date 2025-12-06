(ns clj-yavl.core
  (:require [reagent.dom.client :as rdomc]
            [re-frame.core :as rf]
            [bb-web-ds-tools.components.editor :as editor]
            [clj-yavl.events :as events]
            [clj-yavl.subs :as subs]))

;; --- State ---

(rf/reg-event-db ::initialize events/initialize-db)

;; --- Unit Specs Events & Subs ---

(rf/reg-event-db ::init-unit-spec events/init-unit-spec)
(rf/reg-event-db ::remove-unit-spec events/remove-unit-spec)
(rf/reg-event-db ::update-unit-spec-input events/update-unit-spec-input)
(rf/reg-event-db ::set-unit-spec-input events/set-unit-spec-input)

(rf/reg-sub ::unit-spec-ids subs/unit-spec-ids)
(rf/reg-sub ::unit-spec subs/unit-spec)
(rf/reg-sub ::all-unit-specs subs/all-unit-specs)

(rf/reg-sub
 ::compiled-unit-spec
 (fn [[_ id]]
   (rf/subscribe [::unit-spec id]))
 subs/compiled-unit-spec-fn)

(rf/reg-sub ::user-input-root subs/user-input-root)
(rf/reg-sub ::config-input :<- [::user-input-root] subs/config-input)
(rf/reg-sub ::config-mode :<- [::user-input-root] subs/config-mode)

(rf/reg-sub
 ::parsed-config
 :<- [::config-input]
 :<- [::config-mode]
 subs/parsed-config)

(rf/reg-sub
 ::top-level-prop
 :<- [::parsed-config]
 subs/top-level-prop)

(rf/reg-event-db ::set-top-level-prop events/set-top-level-prop)
(rf/reg-event-db ::set-config-input events/set-config-input)
(rf/reg-event-db ::set-config-mode events/set-config-mode)

;; --- View ---

(defn main-view []
  (let [config-input @(rf/subscribe [::config-input])
        config-mode @(rf/subscribe [::config-mode])]
    [:div {:class "flex h-screen w-screen overflow-hidden"}
     ;; Left Side: Editor
     [:div {:class "w-1/2 h-full border-r border-gray-700 flex flex-col bg-[#1e1e1e]"}
       ;; Toolbar
       [:div {:class "flex items-center justify-between p-2 bg-[#2d2d2d] border-b border-gray-700 text-gray-300"}
        [:span "Vega-Lite Configuration"]
        [:div {:class "flex space-x-2 text-xs"}
          [:label {:class "cursor-pointer flex items-center space-x-1"}
           [:input {:type "radio" :name "mode" :checked (= config-mode :json)
                    :on-change #(rf/dispatch [::set-config-mode :json])}]
           [:span "JSON"]]
          [:label {:class "cursor-pointer flex items-center space-x-1"}
           [:input {:type "radio" :name "mode" :checked (= config-mode :edn)
                    :on-change #(rf/dispatch [::set-config-mode :edn])}]
           [:span "EDN"]]]]

      ;; Editor
      [:div {:class "flex-grow relative"}
       [editor/monaco-editor
        {:value config-input
         :language (if (= config-mode :json) "json" "clojure")
         :options {:fontSize 15
                   :fontFamily "monospace"
                   :rulers [80]
                   :minimap {:enabled false}}
         :on-change #(rf/dispatch [::set-config-input %])}]]]

     ;; Right Side: Portal Iframe
     [:div {:class "w-1/2 h-full bg-white"}
      [:iframe {:src "http://localhost:5678"
                :class "w-full h-full border-none"}]]]))


(defonce react-root (rdomc/create-root (.getElementById js/document "app")))
(defn run [] (rdomc/render react-root [main-view]))

(defn ^:export init []
  (rf/dispatch-sync [::initialize])
  (run))
