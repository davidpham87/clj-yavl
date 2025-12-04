(ns clj-yavl.views.vega-lite
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            [clj-yavl.components.common :as c]
            [clj-yavl.components.editor :as editor]
            [clj-yavl.components.layout :as l]
            [clj-yavl.theme :as t]
            [clj-yavl.portal :as portal]
            [clj-yavl.views.datasets :as datasets]
            [cljs.pprint :refer [pprint]]
            [clojure.edn :as edn]
            [malli.provider :as mp]
            [clj-yavl.utils.dataset-processing :as dp]))

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
               ::active-left-tab :data})))))

(rf/reg-sub ::user-input-root
 :<- [:user-input]
 (fn [user-input] (get-in user-input [:vega-lite :default])))

(rf/reg-sub :user-input (fn [db] (:user-input db)))

(rf/reg-sub ::saved-configs
 :<- [:user-input]
 (fn [user-input] (get-in user-input [:vega-lite :saved-configs])))

(rf/reg-sub ::component-root (fn [db] (::vega-lite db)))

(rf/reg-sub ::data-input :<- [::user-input-root] (fn [root] (::data-input root)))
(rf/reg-sub ::config-input :<- [::user-input-root] (fn [root] (::config-input root)))
(rf/reg-sub ::config-mode :<- [::user-input-root] (fn [root] (::config-mode root)))
(rf/reg-sub ::active-config-name :<- [::user-input-root] (fn [root] (::active-config-name root)))

(rf/reg-sub ::format :<- [::component-root] (fn [root] (::format root)))
(rf/reg-sub ::structure :<- [::component-root] (fn [root] (::structure root)))
(rf/reg-sub ::parsed-data :<- [::component-root] (fn [root] (::parsed-data root)))
(rf/reg-sub ::active-left-tab :<- [::component-root] (fn [root] (::active-left-tab root)))

(rf/reg-event-db ::set-data-input (fn [db [_ val]] (assoc-in db [:user-input :vega-lite :default ::data-input] val)))
(rf/reg-event-db ::set-config-input (fn [db [_ val]] (assoc-in db [:user-input :vega-lite :default ::config-input] val)))

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

(rf/reg-event-db ::set-active-config-name (fn [db [_ name]] (assoc-in db [:user-input :vega-lite :default ::active-config-name] name)))
(rf/reg-event-db ::set-format (fn [db [_ fmt]] (assoc-in db [::vega-lite ::format] fmt)))
(rf/reg-event-db ::set-structure (fn [db [_ s]] (assoc-in db [::vega-lite ::structure] s)))
(rf/reg-event-db ::set-active-left-tab (fn [db [_ tab]] (assoc-in db [::vega-lite ::active-left-tab] tab)))

(rf/reg-event-db
 ::save-config
 (fn [db [_ name]]
   (let [root (get-in db [:user-input :vega-lite :default])
         config (select-keys root [::config-input ::config-mode])]
     (-> db
         (assoc-in [:user-input :vega-lite :saved-configs name] config)
         (assoc-in [:user-input :vega-lite :default ::active-config-name] name)))))

(rf/reg-event-db
 ::load-config
 (fn [db [_ name]]
   (let [config (get-in db [:user-input :vega-lite :saved-configs name])]
     (-> db
         (update-in [:user-input :vega-lite :default] merge config)
         (assoc-in [:user-input :vega-lite :default ::active-config-name] name)))))

(rf/reg-event-db
 ::delete-config
 (fn [db [_ name]]
   (let [active-name (get-in db [:user-input :vega-lite :default ::active-config-name])]
     (cond-> db
       true (update-in [:user-input :vega-lite :saved-configs] dissoc name)
       (= active-name name) (assoc-in [:user-input :vega-lite :default ::active-config-name] nil)))))

(rf/reg-event-fx
 ::import-dataset
 (fn [{:keys [db]} [_ dataset-id]]
   (let [datasets (get-in db [:user-input :datasets :items])
         dataset (get datasets dataset-id)
         data (:data dataset)
         clean-data (mapv #(dissoc % :_uuid) data)
         data-str (with-out-str (pprint clean-data))]
     {:db (-> db
              (assoc-in [:user-input :vega-lite :default ::data-input] data-str)
              (assoc-in [::vega-lite ::format] :edn)
              (assoc-in [::vega-lite ::structure] :row-maps))
      :dispatch [::parse-data]})))

;; --- Parsing ---

(rf/reg-event-db
 ::parse-data
 (fn [db _]
   (let [user-input (get-in db [:user-input :vega-lite :default])
         component-state (::vega-lite db)
         text (::data-input user-input)
         fmt (::format component-state)
         structure (::structure component-state)
         parsed (dp/parse-dataset fmt structure text)
         schema (try (mp/provide parsed) (catch js/Error e (str "Error inferring schema: " (.-message e))))]
     (update db ::vega-lite assoc ::parsed-data parsed ::inferred-schema schema))))

(rf/reg-sub
 ::parsed-config-obj
 :<- [::config-input]
 :<- [::config-mode]
 (fn [[input mode]]
   (try
     (case mode
       :json (js/JSON.parse input)
       :edn (clj->js (edn/read-string input)))
     (catch js/Error _ nil))))

;; --- Components ---

(defn load-example
  [fmt structure]
  (rf/dispatch [::set-format fmt])
  (rf/dispatch [::set-structure structure])
  (rf/dispatch [::set-data-input (dp/example-data fmt structure)])
  (rf/dispatch [::parse-data]))

(defn save-config-modal
  []
  (let [open? (r/atom false)
        name-input (r/atom "")]
    (fn []
      [:div {:class "relative inline-block"}
       [c/button-xs {:on-click #(reset! open? true)} "Save"]
       (when @open?
         [:div {:class (str "absolute top-8 right-0 z-50 p-2 rounded shadow-lg border "
                            t/bg-input " " t/border-default " flex items-center space-x-2")}
          [c/input {:class "w-32 text-xs"
                    :placeholder "Name"
                    :value @name-input
                    :on-change #(reset! name-input (.. % -target -value))}]
          [c/button-xs {:class "text-green-400"
                        :on-click #(do (rf/dispatch [::save-config @name-input])
                                       (reset! open? false))}
           "✓"]
          [c/button-xs {:class "text-red-400"
                        :on-click #(reset! open? false)}
           "✗"]])])))

(defn panel-render
  []
  (let [data-input @(rf/subscribe [::data-input])
        config-input @(rf/subscribe [::config-input])
        parsed-data @(rf/subscribe [::parsed-data])
        active-left-tab (or @(rf/subscribe [::active-left-tab]) :data)
        datasets @(rf/subscribe [::datasets/items])
        config-mode @(rf/subscribe [::config-mode])
        saved-configs @(rf/subscribe [::saved-configs])
        active-config-name @(rf/subscribe [::active-config-name])
        parsed-config-obj @(rf/subscribe [::parsed-config-obj])
        format @(rf/subscribe [::format])

        full-spec (try
                    (when (and parsed-config-obj parsed-data)
                      (assoc (js->clj parsed-config-obj :keywordize-keys true)
                             :data {:values parsed-data}))
                    (catch js/Error _ nil))]

    [:div {:class "flex flex-col md:flex-row h-full w-full overflow-hidden"}
     ;; Left Column (Inputs)
     [:div {:class "h-1/2 md:h-full overflow-auto border-b md:border-b-0 md:border-r border-[#3f3f3f] w-full md:w-1/2"}
      [l/flex-col {:class "h-full"}
       ;; Left Tabs
       [l/flex-row {:class (str "justify-between border-b " t/border-default " px-2 " t/bg-toolbar)}
        [l/flex-row {:class "space-x-2"}
         [c/tab-button (= active-left-tab :data) "Data" #(rf/dispatch [::set-active-left-tab :data])]
         [c/tab-button (= active-left-tab :config) "Config" #(rf/dispatch [::set-active-left-tab :config])]]]

       ;; Left Content
       [:div {:class "flex-grow overflow-hidden relative"}
        (case active-left-tab
          :data
          [l/flex-col {:class "h-full"}
           [l/flex-row {:class "p-2 gap-2 flex-wrap border-b border-[#3f3f3f] bg-[#1c2128] items-center"}
            [c/button-info {:on-click #(load-example :csv :columnar)} "CSV"]
            [c/button-info {:on-click #(load-example :tsv :columnar)} "TSV"]
            [c/button-info {:on-click #(load-example :markdown :columnar)} "MD"]
            [c/button-info {:on-click #(load-example :json :row-maps)} "JSON Maps"]
            [c/button-info {:on-click #(load-example :json :row-arrays)} "JSON Arrays"]
            [c/button-info {:on-click #(load-example :edn :row-maps)} "EDN Maps"]
            [c/button-info {:on-click #(load-example :edn :columnar)} "EDN Col"]
            ;; Dataset Import
            [:div {:class "relative group ml-auto"}
             [c/button-info {:class "border-dashed border-white/50"} "Import Dataset ▼"]
             [:div {:class (str "absolute hidden group-hover:block right-0 " t/bg-input " border " t/border-default " p-1 rounded shadow-lg z-10 w-48 max-h-60 overflow-y-auto")}
              (if (seq datasets)
                (for [[id ds] datasets]
                  [:div {:key id
                         :class (str "cursor-pointer px-2 py-1 text-xs " t/bg-item-hover " truncate")
                         :on-click #(rf/dispatch [::import-dataset id])}
                   (:name ds)])
                [:div {:class "text-xs text-gray-500 p-2"} "No datasets created."])]]]
           [:div {:class "flex-grow relative"}
            [editor/monaco-editor
             {:value data-input
              :language (if (= format :json) "json" "clojure")
              :options {:rulers [80] :minimap {:enabled false}}
              :on-change (fn [val]
                           (rf/dispatch [::set-data-input val])
                           (rf/dispatch [::parse-data]))}]]]

          :config
          [l/flex-col {:class "h-full"}
           [l/flex-row {:class "p-2 gap-2 border-b border-[#3f3f3f] bg-[#1c2128] items-center justify-between"}
            ;; Mode Selection
            [l/flex-row {:class "space-x-2 items-center text-xs text-gray-400"}
             [:span "Mode:"]
             [:label {:class "flex items-center space-x-1 cursor-pointer"}
              [:input {:type "radio" :name "config-mode" :checked (= config-mode :json)
                       :on-change #(rf/dispatch [::set-config-mode :json])}]
              [:span "JSON"]]
             [:label {:class "flex items-center space-x-1 cursor-pointer"}
              [:input {:type "radio" :name "config-mode" :checked (= config-mode :edn)
                       :on-change #(rf/dispatch [::set-config-mode :edn])}]
              [:span "EDN"]]]

            ;; Config Management
            [l/flex-row {:class "space-x-2 items-center"}
             (when (seq saved-configs)
               [:select {:class (str "text-xs py-1 px-2 rounded " t/bg-input " " t/border-default)
                         :value (or active-config-name "")
                         :on-change #(rf/dispatch [::load-config (.. % -target -value)])}
                [:option {:value ""} "Select Config..."]
                (for [name (keys saved-configs)]
                  [:option {:key name :value name} name])])
             [save-config-modal]
             (when active-config-name
               [c/button-xs {:class "text-red-400"
                             :on-click #(rf/dispatch [::delete-config active-config-name])}
                [c/dustbin-icon]])]]

           [:div {:class "flex-grow relative"}
            [editor/monaco-editor
             {:value config-input
              :language (if (= config-mode :json) "json" "clojure")
              :options {:rulers [80] :minimap {:enabled false}}
              :on-change #(rf/dispatch [::set-config-input %])}]]]
          nil)]]]

     ;; Right Column (Portal)
     [:div {:class "h-1/2 md:h-full overflow-auto w-full md:w-1/2"}
      [portal/portal-panel (or full-spec parsed-config-obj) :portal.viewer/vega-lite]]]))

(defn panel
  []
  (r/create-class
   {:display-name "vega-lite-panel"
    :component-did-mount #(rf/dispatch [::initialize])
    :reagent-render panel-render}))
