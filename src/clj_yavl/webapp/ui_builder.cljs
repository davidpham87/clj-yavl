(ns clj-yavl.webapp.ui-builder
  (:require
   [clj-yavl.webapp.events :as events]
   [clj-yavl.webapp.subs :as subs]
   [clj-yavl.webapp.ui-schema :as ui-schema]
   [cljs.pprint :refer [pprint]]
   [re-frame.core :as rf]))

(defmulti render-input (fn [{:keys [conf]}] (:type conf)))

(defmethod render-input :select
  [{:keys [arg prop conf current-opts]}]
  [:select {:class "bg-gray-800 border border-gray-600 text-xs p-1"
            :value (get-in current-opts [arg prop])
            :on-change #(let [val (-> % .-target .-value)]
                          (if (= prop :field)
                            (rf/dispatch [::events/update-field-selection arg prop val])
                            (rf/dispatch [::events/update-ui-option arg prop val])))}
   [:option {:value ""} "-"]
   (for [opt (:options conf)]
     ^{:key opt}
     [:option {:value opt} opt])])

(defmethod render-input :text-input
  [{:keys [arg prop current-opts]}]
  [:input {:type "text"
           :class "bg-gray-800 border border-gray-600 text-xs p-1"
           :value (get-in current-opts [arg prop])
           :on-change #(rf/dispatch [::events/update-ui-option arg prop (-> % .-target .-value)])}])

(defmethod render-input :number-input
  [{:keys [arg prop current-opts]}]
  [:input {:type "number"
           :class "bg-gray-800 border border-gray-600 text-xs p-1"
           :value (get-in current-opts [arg prop])
           :on-change #(rf/dispatch [::events/update-ui-option arg prop (js/parseFloat (-> % .-target .-value))])}])

(defmethod render-input :boolean
  [{:keys [arg prop current-opts]}]
  [:input {:type "checkbox"
           :checked (get-in current-opts [arg prop])
           :on-change #(rf/dispatch [::events/update-ui-option arg prop (-> % .-target .-checked)])}])

(defmethod render-input :multi-select
  [{:keys [conf]}]
  [:select {:multiple true :class "bg-gray-800 border border-gray-600 text-xs p-1 h-20"}
   (for [opt (:options conf)]
     ^{:key opt}
     [:option {:value opt} opt])])

(defmethod render-input :json-editor
  [_]
  [:textarea {:class "bg-gray-800 border border-gray-600 text-xs p-1 h-10" :placeholder "JSON..."}])

(defmethod render-input :default
  [_]
  nil)

(defn- render-ui-builder-item [item current-opts]
  [:div {:class "border border-gray-600 p-2 rounded"}
    [:div {:class "font-bold text-sm mb-2 text-blue-400"}
    (name (:arg item))
    [:span {:class "text-gray-500 text-xs ml-2"} (name (:scope item))]]

    (into [:div {:class "grid grid-cols-2 gap-2"}]
          (for [[prop conf] (:main item)]
            [:div {:class "flex flex-col"}
            [:label {:class "text-xs mb-1"} (name prop)]
            (render-input {:arg (:arg item)
                            :item item
                            :prop prop
                            :conf conf
                            :current-opts current-opts})]))])

(defn ui-builder-view []
  (let [preset-key @(rf/subscribe [::subs/ui-builder-preset])
        current-opts @(rf/subscribe [::subs/ui-builder-opts])
        inferred-schema @(rf/subscribe [::subs/inferred-schema])
        schema (or inferred-schema [:map [:Name :string]])
        ui-def (ui-schema/generate-ui-schema preset-key schema current-opts)]
    [:div {:class "p-4 text-gray-300 overflow-auto h-full bg-[#1e1e1e]"}
     [:h2 {:class "text-lg font-bold mb-4"} "UI Builder"]
     (when inferred-schema
       [:div {:class "mb-4 text-green-400 text-xs"}
        "Schema inferred from loaded dataset."
        [:div {:class "mb-4 p-2 bg-gray-800 rounded text-xs font-mono whitespace-pre-wrap"}
        (with-out-str (cljs.pprint/pprint schema))]])
     [:div {:class "mb-4"}
      [:label "Preset: "]
      [:select {:class "bg-gray-700 text-white p-1"
                :value preset-key
                :on-change #(rf/dispatch [::events/set-ui-preset (keyword (-> % .-target .-value))])}
       [:option {:value "xyplot"} "XY Plot"]
       [:option {:value "pie"} "Pie Chart"]
       [:option {:value "bar"} "Bar Chart"]]]

     [:div {:class "space-y-4"}
      (into [:<>]
            (for [item ui-def]
              ^{:key (:arg item)}
              (render-ui-builder-item item current-opts)))]]))
