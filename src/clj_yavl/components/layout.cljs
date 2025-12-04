(ns clj-yavl.components.layout
  (:require [clj-yavl.theme :as t]))

(defn page-container
  "Renders the top-level page container."
  [props & children]
  (into [:div (merge {:class (str "h-screen w-full flex overflow-hidden " t/bg-page " " t/text-primary " " (:class props))}
                     (dissoc props :class))]
        children))

(defn flex-row
  "Renders a flex row container."
  [props & children]
  (into [:div (merge {:class (str "flex items-center " (:class props))}
                     (dissoc props :class))]
        children))

(defn flex-col
  "Renders a flex column container."
  [props & children]
  (into [:div (merge {:class (str "flex flex-col " (:class props))}
                     (dissoc props :class))]
        children))
