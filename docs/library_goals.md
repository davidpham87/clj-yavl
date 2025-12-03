# Library Goals and Design

The goal of this library is twofold: to simplify Vega-Lite chart creation with a unified CLJC API and to provide auto-generated UI components for chart configuration based on Malli schemas.

## 1. Unified CLJC API for Vega-Lite

We aim to write CLJC functions that target the Vega-Lite schema. The API should be unified for all plot types, providing sensible defaults and configurable colors, while abstracting away some of the verbose details of the raw Vega-Lite JSON.

### Goals
- **Unified API**: A consistent way to define different types of charts (bar, point, line, etc.).
- **Configurable Defaults**: Sensible defaults for colors, sizes, and other aesthetic properties, but easily overridable.
- **Interactivity**: Built-in support for common interactive features (tooltips, selection, zooming).
- **Target**: Output valid Vega-Lite JSON maps.

### Examples

```clojure
(ns my.charts
  (:require [my-library.core :as plot]))

;; A simple scatter plot
(def scatter-plot
  (plot/xy data
    {:x :horsepower
     :y :miles_per_gallon
     :color :origin}
    {:title "Car Statistics"
     :tooltip true}))

;; A bar chart with custom colors
(def bar-chart
  (plot/bar data
    {:x :category
     :y :amount}
    {:color-scheme "category10"
     :width 400
     :height 300}))
```

### Unforeseen Challenges
- **Interactivity Complexity**: Mapping complex Vega-Lite interaction signals and streams to a simplified Clojure API might be difficult without losing flexibility.
- **Schema Validation**: Ensuring the output is always 100% valid Vega-Lite schema across all edge cases.

## 2. Data Transformations

The library should allow users to define common data transformations such as repeat, fold, and transform, with a focus on renaming keys to match encoding channels.

### Goals
- Support for `repeat` (layering or concatenating views).
- Support for `fold` (wide to long transformation).
- Support for `transform` (calculate, filter, and specifically renaming keys).

### Examples

```clojure
(require '[my-library.transform :as t])

;; Rename keys before plotting
(def data-transformed
  (-> data
      (t/rename-keys {:hp :horsepower :mpg :miles_per_gallon})))

;; Fold operation for multi-series line chart
(def folded-plot
  (-> data
      (t/fold [:gold :silver :bronze] :as [:medal :count])
      (plot/bar {:x :medal :y :count :color :medal})))

;; Repeat charts (e.g., small multiples)
(def repeated-plot
  (plot/repeat data
    {:row [:horsepower :acceleration]
     :column [:miles_per_gallon :displacement]}
    (fn [field]
      (plot/hist {:x field}))))
```

## 3. UI Components from Malli Schema

We need UI components that take a Malli schema as input and generate the configuration UI for Vega-Lite charts.

### Goals
- **Input**: A Malli schema describing the data or the plot configuration.
- **Output**: Reagent/React components.
- **Main Dimension Encoding**:
    - **Dropdown**: For selecting the data field (dimension).
    - **Radio Button**: For selecting the data type (quantitative, nominal, ordinal, temporal).
    - **Label Input**: Text input for the axis/legend label (pre-filled with Title Case of the field name).
- **Sub-menus**: For defining aggregates (sum, mean, count) and scales (domain, range).

### Examples

#### Malli Schema Definition

```clojure
(def chart-config-schema
  [:map
   [:x [:map
        [:field :string]
        [:type [:enum :quantitative :nominal :ordinal :temporal]]
        [:title {:optional true} :string]
        [:aggregate {:optional true} [:enum :mean :sum :count :min :max]]]]
   [:y [:map
        [:field :string]
        [:type [:enum :quantitative :nominal :ordinal :temporal]]
        [:title {:optional true} :string]]]])
```

#### UI Generation Component

```clojure
(defn chart-configurator [schema value onChange]
  [ui/auto-form schema
   {:value value
    :on-change onChange
    :field-renderers
    {:field (fn [props] [ui/dropdown props])
     :type  (fn [props] [ui/radio-group props])
     :title (fn [props] [ui/text-input (merge props {:placeholder "Axis Title"})])}}])
```

#### Expected UI Behavior

1.  **X-Axis Configuration**:
    - User selects "horsepower" from a dropdown.
    - User selects "Quantitative" via radio button.
    - Label input auto-fills with "Horsepower".
    - User clicks "More..." to open submenu.
    - In submenu, selects "Mean" for aggregation.
    - In submenu, sets scale domain to `[0, 500]`.

### Unforeseen Challenges
- **Schema Complexity**: Generating UI for deeply nested or recursive Malli schemas.
- **State Management**: Handling the state of the configuration form and syncing it with the Vega-Lite preview in real-time.
- **Layout**: Creating a UI that is both comprehensive (lots of options) and clean (not overwhelming).
