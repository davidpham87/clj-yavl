(ns clj-yavl.core
  (:require [reagent.dom.client :as rdomc]
            [reagent.core :as r]
            [re-frame.core :as rf]
            [bb-web-ds-tools.components.editor :as editor]
            [clojure.edn :as edn]
            [cljs.pprint :refer [pprint]]
            [clj-yavl.events :as events]
            [clj-yavl.subs :as subs]
            [clj-yavl.viz :as viz]
            [clj-yavl.ui-schema :as ui-schema]))

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

(defn ui-builder-view []
  (let [default-mock-schema [:map
                     [:Name :string]
                     [:Miles_per_Gallon :int]
                     [:Cylinders :int]
                     [:Displacement :int]
                     [:Horsepower :int]
                     [:Weight_in_lbs :int]
                     [:Acceleration :int]
                     [:Year :string]
                     [:Origin :string]]
        preset-key (r/atom :xyplot)
        current-opts (r/atom {})]
    (fn []
      (let [inferred-schema @(rf/subscribe [::subs/inferred-schema])
            schema (or inferred-schema default-mock-schema)
            ui-def (ui-schema/generate-ui-schema @preset-key schema @current-opts)]
        [:div {:class "p-4 text-gray-300 overflow-auto h-full bg-[#1e1e1e]"}
         [:h2 {:class "text-lg font-bold mb-4"} "UI Builder"]
         (when inferred-schema
           [:div {:class "mb-4 text-green-400 text-xs"}
            "Schema inferred from loaded dataset."])
         [:div {:class "mb-4"}
          [:label "Preset: "]
          [:select {:class "bg-gray-700 text-white p-1"
                    :value @preset-key
                    :on-change #(reset! preset-key (keyword (-> % .-target .-value)))}
           [:option {:value "xyplot"} "XY Plot"]
           [:option {:value "pie"} "Pie Chart"]
           [:option {:value "bar"} "Bar Chart"]]]

         [:div {:class "space-y-4"}
          (for [item ui-def]
            ^{:key (:arg item)}
            [:div {:class "border border-gray-600 p-2 rounded"}
             [:div {:class "font-bold text-sm mb-2 text-blue-400"}
              (name (:arg item))
              [:span {:class "text-gray-500 text-xs ml-2"} (name (:scope item))]]

             (into [:div {:class "grid grid-cols-2 gap-2"}]
                   (for [[prop conf] (:main item)]
                     [:div {:class "flex flex-col"}
                      [:label {:class "text-xs mb-1"} (name prop)]
                      (case (get-in conf [:type])
                        :select
                        [:select {:class "bg-gray-800 border border-gray-600 text-xs p-1"
                                  :on-change #(swap! current-opts assoc-in [(:arg item) prop] (-> % .-target .-value))}
                         [:option {:value ""} "-"]
                         (for [opt (:options conf)]
                           ^{:key opt}
                           [:option {:value opt} opt])]

                        :text-input
                        [:input {:type "text"
                                 :class "bg-gray-800 border border-gray-600 text-xs p-1"}]

                        :number-input
                        [:input {:type "number"
                                 :class "bg-gray-800 border border-gray-600 text-xs p-1"}]

                        :boolean
                        [:input {:type "checkbox"}]

                        :multi-select
                        [:select {:multiple true :class "bg-gray-800 border border-gray-600 text-xs p-1 h-20"}
                         (for [opt (:options conf)]
                           ^{:key opt}
                           [:option {:value opt} opt])]

                        :json-editor
                        [:textarea {:class "bg-gray-800 border border-gray-600 text-xs p-1 h-10" :placeholder "JSON..."}]

                        [:div (str "Unknown type: " (get-in conf [:type]))])]))])]]))))

(defn main-view []
  (r/with-let [view-mode (r/atom :code)]
    (let [config-input @(rf/subscribe [::config-input])
          parsed-config @(rf/subscribe [::parsed-config])
          config-mode @(rf/subscribe [::config-mode])
          url-input (rf/subscribe [::subs/dataset-url-input])
          dataset-list (rf/subscribe [::subs/dataset-list])]
      [:div {:class "flex h-screen w-screen overflow-hidden"}
       ;; Left Side: Editor
       [:div {:class "w-1/2 h-full border-r border-gray-700 flex flex-col bg-[#1e1e1e]"}
        ;; Toolbar
        [:div {:class "flex items-center justify-between p-2 bg-[#2d2d2d] border-b border-gray-700 text-gray-300"}
         [:div {:class "flex space-x-4"}
          [:span "Vega-Lite Configuration"]
          [:div {:class "flex bg-gray-700 rounded p-0.5"}
           [:button {:class (str "px-2 py-0.5 text-xs rounded " (if (= @view-mode :code) "bg-blue-600 text-white" "text-gray-300"))
                     :on-click #(reset! view-mode :code)} "Code"]
           [:button {:class (str "px-2 py-0.5 text-xs rounded " (if (= @view-mode :ui) "bg-blue-600 text-white" "text-gray-300"))
                     :on-click #(reset! view-mode :ui)} "UI Builder"]]]

         (when (= @view-mode :code)
           [:div {:class "flex space-x-2 text-xs"}
            [:label {:class "cursor-pointer flex items-center space-x-1"}
             [:input {:type "radio" :name "mode" :checked (= config-mode :json)
                      :on-change #(rf/dispatch [::set-config-mode :json])}]
             [:span "JSON"]]
            [:label {:class "cursor-pointer flex items-center space-x-1"}
             [:input {:type "radio" :name "mode" :checked (= config-mode :edn)
                      :on-change #(rf/dispatch [::set-config-mode :edn])}]
             [:span "EDN"]]])]

        ;; Editor or UI Builder
        [:div {:class "flex-grow relative overflow-hidden"}
         (if (= @view-mode :code)
           [editor/monaco-editor
            {:value config-input
             :language (if (= config-mode :json) "json" "clojure")
             :options {:fontSize 15
                       :fontFamily "monospace"
                       :rulers [80]
                       :minimap {:enabled false}}
             :on-change #(rf/dispatch [::set-config-input %])}]
           [ui-builder-view])]]

       ;; Right Side: Visualization
     [:div {:class "w-1/2 h-full bg-white flex flex-col"}
      [:div {:class "p-2 bg-gray-100 border-b border-gray-300 flex items-center gap-2"}
       [:div {:class "flex flex-col flex-grow gap-1"}
        [:div {:class "flex gap-2"}
         [:select {:class "border p-1 text-sm w-32"
                   :on-change (fn [e]
                                (let [val (-> e .-target .-value)]
                                  (when (not-empty val)
                                    (let [dataset (some #(when (= (:name %) val) %) @dataset-list)]
                                      (when dataset
                                        (let [url (str "https://cdn.jsdelivr.net/npm/vega-datasets@3.2.1/" (:path dataset))]
                                          (rf/dispatch [::events/set-dataset-url-input url])
                                          (rf/dispatch [::events/fetch-dataset url])))))))}
          [:option {:value ""} "Select Dataset..."]
          (for [ds (sort-by :name @dataset-list)]
            ^{:key (:name ds)}
            [:option {:value (:name ds)} (:name ds)])]

         [:input {:type "text"
                  :placeholder "Dataset URL"
                  :value @url-input
                  :on-change #(rf/dispatch [::events/set-dataset-url-input (-> % .-target .-value)])
                  :class "border p-1 flex-grow text-sm"}]]

        [:button {:on-click #(rf/dispatch [::events/fetch-dataset @url-input])
                  :class "bg-blue-500 text-white px-3 py-1 rounded text-sm hover:bg-blue-600"}
         "Load Data"]]]
      [:div {:class "flex-grow overflow-auto relative"}
       [viz/vega-lite-viz parsed-config]]]])))


(defonce react-root (rdomc/create-root (.getElementById js/document "app")))
(defn run [] (rdomc/render react-root [main-view]))

(defn ^:export init []
  (rf/dispatch-sync [::initialize])
  (rf/dispatch [::events/fetch-dataset-list])
  (run))
