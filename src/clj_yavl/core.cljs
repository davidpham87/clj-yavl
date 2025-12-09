(ns clj-yavl.core
  (:require [reagent.dom.client :as rdomc]
            [re-frame.core :as rf]
            [bb-web-ds-tools.components.editor :as editor]
            [clj-yavl.events :as events]
            [clj-yavl.subs :as subs]
            [clj-yavl.viz :as viz]))

;; --- State ---

(rf/reg-event-db ::initialize events/initialize-db)
(rf/reg-event-db ::set-config-input events/set-config-input)
(rf/reg-event-db ::set-config-mode events/set-config-mode)
(rf/reg-event-db ::set-top-level-prop events/set-top-level-prop)

;; New DS Events
(rf/reg-event-db ::update-mark events/update-mark)
(rf/reg-event-db ::update-channel-field events/update-channel-field)
(rf/reg-event-db ::update-tooltip events/update-tooltip)


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

;; DS Subs
(rf/reg-sub ::ds-db subs/ds-db)
(rf/reg-sub ::mark :<- [::ds-db] subs/mark)
(rf/reg-sub ::encoding :<- [::ds-db] subs/encoding)
(rf/reg-sub ::tooltip :<- [::ds-db] subs/tooltip)


(rf/reg-sub
 ::config-transform-raw
 :<- [::config-input]
 :<- [::config-mode]
 (fn [[input mode] _]
   (try
     (case mode
       :edn (get (edn/read-string input) :transform)
       :json (get (js->clj (js/JSON.parse input) :keywordize-keys true) :transform)
       nil)
     (catch js/Error _ nil))))

(rf/reg-event-db
 ::set-config-transform-raw
 (fn [db [_ new-transform]]
   (let [user-input (get-in db [:user-input :vega-lite :default])
         mode (::config-mode user-input)
         input (::config-input user-input)
         new-input (try
                     (case mode
                       :edn (let [data (edn/read-string input)
                                  updated (assoc data :transform new-transform)]
                              (with-out-str (pprint updated)))
                       :json (let [data (js->clj (js/JSON.parse input) :keywordize-keys true)
                                   updated (assoc data :transform new-transform)]
                               (js/JSON.stringify (clj->js updated) nil 2))
                       input)
                     (catch js/Error _ input))]
     (assoc-in db [:user-input :vega-lite :default ::config-input] new-input))))

;; --- Transform Ops Events & Subs ---

(rf/reg-sub
 ::transform-ops
 (fn [db _]
   (get-in db [:user-input :vega-lite :default ::transform-ops])))

(rf/reg-event-db
 ::add-transform-op
 (fn [db [_ op]]
   (update-in db [:user-input :vega-lite :default ::transform-ops] conj op)))

(rf/reg-event-db
 ::remove-transform-op
 (fn [db [_ index]]
   (let [path [:user-input :vega-lite :default ::transform-ops]]
     (update-in db path (fn [ops]
                          (let [[before after] (split-at index ops)]
                            (vec (concat before (rest after)))))))))

(rf/reg-event-db
 ::update-transform-op
 (fn [db [_ index new-op]]
   (assoc-in db [:user-input :vega-lite :default ::transform-ops index] new-op)))

(rf/reg-event-db
 ::reorder-transform-ops
 (fn [db [_ from-index to-index]]
   (let [path [:user-input :vega-lite :default ::transform-ops]]
     (update-in db path (fn [ops]
                          (let [item (nth ops from-index)
                                removed (vec (concat (subvec ops 0 from-index)
                                                     (subvec ops (inc from-index))))]
                            (vec (concat (subvec removed 0 to-index)
                                         [item]
                                         (subvec removed to-index)))))))))

(rf/reg-event-db
 ::set-transform-ops
 (fn [db [_ ops]]
   (assoc-in db [:user-input :vega-lite :default ::transform-ops] ops)))


;; --- View ---

(defn main-view []
  (let [config-input @(rf/subscribe [::config-input])
        parsed-config @(rf/subscribe [::parsed-config])
        config-mode @(rf/subscribe [::config-mode])
        url-input (rf/subscribe [::dataset-url-input])]
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

     ;; Right Side: Visualization
     [:div {:class "w-1/2 h-full bg-white flex flex-col"}
      [:div {:class "p-2 bg-gray-100 border-b border-gray-300 flex items-center gap-2"}
       [:input {:type "text"
                :placeholder "Dataset URL (e.g. https://cdn.jsdelivr.net/npm/vega-datasets@v1.29.0/data/cars.json)"
                :value @url-input
                :on-change #(rf/dispatch [::set-dataset-url-input (-> % .-target .-value)])
                :class "border p-1 flex-grow text-sm"}]
       [:button {:on-click #(rf/dispatch [::fetch-dataset @url-input])
                 :class "bg-blue-500 text-white px-3 py-1 rounded text-sm hover:bg-blue-600"}
        "Load Data"]]
      [:div {:class "flex-grow overflow-auto relative"}
       [viz/vega-lite-viz parsed-config]]]]))


(defonce react-root (rdomc/create-root (.getElementById js/document "app")))
(defn run [] (rdomc/render react-root [main-view]))

(defn ^:export init []
  (rf/dispatch-sync [::initialize])
  (run))
