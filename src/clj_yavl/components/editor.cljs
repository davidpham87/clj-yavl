(ns clj-yavl.components.editor
  (:require [reagent.core :as r]
            [re-frame.core :as rf]
            ["react-dom" :as react-dom]
            ["monaco-editor/esm/vs/editor/editor.api.js" :as monaco :refer [KeyMod KeyCode]]
            ["monaco-editor/esm/vs/basic-languages/clojure/clojure.contribution.js"]
            ["monaco-editor/esm/vs/basic-languages/python/python.contribution.js"]
            ["monaco-editor/esm/vs/basic-languages/r/r.contribution.js"]
            [clj-yavl.theme :as t]))

(defonce theme-initialized
  (try
    (monaco/editor.defineTheme
     "zenburn"
     (clj->js {:base "vs-dark"
               :inherit true
               :rules [{:background (t/color :bg-page)
                        :foreground (t/color :text-primary)}]
               :colors {:editor.background (t/color :bg-page)
                        :editor.foreground (t/color :text-primary)
                        :editorCursor.foreground (t/color :text-muted)
                        :editor.lineHighlightBackground (t/color :bg-card)
                        :editor.selectionBackground (t/color :bg-button)
                        :editor.inactiveSelectionBackground (t/color :bg-card)}}))
    true
    (catch js/Error e
      (js/console.warn "Failed to define Zenburn theme" e)
      false)))

(defn monaco-editor
  "Renders a Monaco Editor component."
  [_]
  (let [editor-instance (r/atom nil)
        subscription (r/atom nil)
        on-change-ref (atom nil)
        ignore-change? (atom false)]
    (r/create-class
     {:displayName "monaco-editor"
      :component-did-mount
      (fn [this]
        (try
          (let [{:keys [value mode language options on-focus
                        on-blur on-mount on-change]} (r/props this)
                node (react-dom/findDOMNode this)
                lang (or language
                         (case mode
                           "application/json" "json"
                           "markdown" "markdown"
                           "clojure"))
                editor (monaco/editor.create
                        node
                        (clj->js
                         (merge
                          {:value (or value "")
                           :language lang
                           :linenumber "off"
                           :theme "zenburn"
                           :automaticLayout true
                           :minimap {:enabled false}
                           :scrollBeyondLastLine false
                           :fontFamily "monospace"
                           :fontSize 15}
                          options)))]

            (reset! editor-instance editor)
            (reset! on-change-ref on-change)

            (when on-mount
              (on-mount editor))

            (let [sub (.onDidChangeModelContent
                       editor
                       (fn []
                         (reset! ignore-change? true)
                         (let [new-val (.getValue editor)]
                           (when-let [handler @on-change-ref]
                             (if (vector? handler)
                               (rf/dispatch (conj handler new-val))
                               (handler new-val))))
                         (reset! ignore-change? false)))]
              (reset! subscription sub))

            (when on-focus
              (.onDidFocusEditorText editor on-focus))
            (when on-blur
              (.onDidBlurEditorText editor on-blur)))
          (catch js/Error e
            (js/console.error "Monaco initialization failed:" e))))

      :component-did-update
      (fn [this [_ old-props]]
        (let [{:keys [value language mode options on-change]} (r/props this)
              editor ^js @editor-instance]
          (reset! on-change-ref on-change)
          (when editor
            (when (and (not @ignore-change?)
                       (not= (.getValue editor) value))
              (.setValue editor (or value "")))

            (let [lang (or language
                           (case mode
                             "application/json" "json"
                             "markdown" "markdown"
                             "clojure"))
                  model (.getModel editor)
                  current-lang (when model (.getLanguageId model))]
              (when (and model lang (not= current-lang lang))
                (monaco/editor.setModelLanguage model lang)))

            (when (not= (:options old-props) options)
              (.updateOptions editor (clj->js options))))))

      :component-will-unmount
      (fn [this]
        (when-let [sub @subscription]
          (.dispose sub))
        (when-let [editor @editor-instance]
          (.dispose editor)))

      :reagent-render
      (fn [props]
        (let [{:keys [style class]} props]
          [:div.editor-wrapper
           {:class class
            :style (merge {:width "100%" :height "100%"} style)}]))})))
