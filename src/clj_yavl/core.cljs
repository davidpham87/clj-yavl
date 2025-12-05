(ns clj-yavl.core
  (:require [reagent.dom.client :as rdomc]
            [re-frame.core :as rf]
            [bb-web-ds-tools.components.editor :as editor]
            [cljs.pprint :refer [pprint]]
            [clojure.edn :as edn]))

;; --- State ---

(def default-config-json "{\n  \"$schema\": \"https://vega.github.io/schema/vega-lite/v5.json\",\n  \"mark\": \"bar\",\n  \"encoding\": {\n    \"x\": {\"field\": \"col1\", \"type\": \"ordinal\"},\n    \"y\": {\"field\": \"col2\", \"type\": \"quantitative\"}\n  }\n}")

(rf/reg-event-db
 ::initialize
 (fn [db _]
   (let [user-input-exists? (get-in db [:user-input :vega-lite])
         component-state-exists? (::vega-lite db)]
     (cond-> db
       (not user-input-exists?)
       (assoc-in [:user-input :vega-lite]
                 {:saved-configs {}
                  :default {::data-input ""
                            ::config-input default-config-json
                            ::config-mode :json
                            ::active-config-name nil}})

       (not component-state-exists?)
       (assoc ::vega-lite
              {::format :csv
               ::structure :columnar
               ::parsed-data nil
               ::inferred-schema nil
               ::active-left-tab :config})))))

(rf/reg-sub
 ::user-input-root
 (fn [db _]
   (get-in db [:user-input :vega-lite :default])))

(rf/reg-sub
 ::config-input
 :<- [::user-input-root]
 (fn [root]
   (::config-input root)))

(rf/reg-sub
 ::config-mode
 :<- [::user-input-root]
 (fn [root]
   (::config-mode root)))

(rf/reg-event-db
 ::set-config-input
 (fn [db [_ val]]
   (assoc-in db [:user-input :vega-lite :default ::config-input] val)))

(rf/reg-event-db
 ::set-config-mode
 (fn [db [_ new-mode]]
   (let [user-input (get-in db [:user-input :vega-lite :default])
         current-mode (::config-mode user-input)
         current-input (::config-input user-input)
         new-input (cond
                     (and (= current-mode :json) (= new-mode :edn))
                     (try
                       (let [obj (js/JSON.parse current-input)
                             edn-data (js->clj obj :keywordize-keys true)]
                         (with-out-str (pprint edn-data)))
                       (catch js/Error _ current-input))

                     (and (= current-mode :edn) (= new-mode :json))
                     (try
                       (let [edn-data (edn/read-string current-input)
                             obj (clj->js edn-data)]
                         (js/JSON.stringify obj nil 2))
                       (catch js/Error _ current-input))

                     :else current-input)]
     (-> db
         (assoc-in [:user-input :vega-lite :default ::config-mode] new-mode)
         (assoc-in [:user-input :vega-lite :default ::config-input] new-input)))))


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
