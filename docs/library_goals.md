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
  (:require [clj-yavl.core :as plot]))

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

The library should allow users to define common data transformations such as repeat, fold, facet, and transform, with a focus on renaming keys to match encoding channels.

**Note**: these transformations (especially `repeat`, `facet`, and `calculate`) should be supported as arguments to the plot function, ensuring a unified API experience.

### Goals
- Support for `repeat` (layering or concatenating views) as a plot argument.
- Support for `facet` (partitioning data into small multiples) as a plot argument.
- Support for `fold` (wide to long transformation).
- Support for `transform` (calculate, filter, and specifically renaming keys) via Vega-Lite specs.

### Examples

```clojure
(require '[clj-yavl.core :as plot])

;; Calculate new field and use it in plot
(def plot-with-calculate
  (plot/xy data
    {:x :year :y :doubled_mpg}
    {:calculate "datum.miles_per_gallon * 2" :as :doubled_mpg}))

;; Repeat charts (e.g., small multiples) passed as argument
(def repeated-plot
  (plot/hist data
    {:x {:repeat :row}}
    {:repeat {:row [:horsepower :acceleration :miles_per_gallon]}
     :columns 2}))

;; Fold operation for multi-series line chart (generates VL fold)
(def folded-plot
  (plot/bar data
    {:x :medal :y :count :color :medal}
    {:transform [{:fold [:gold :silver :bronze] :as [:medal :count]}]}))

;; Faceted chart (small multiples by field) passed as argument
(def faceted-plot
  (plot/point data
    {:x :horsepower :y :miles_per_gallon}
    {:facet {:row :origin}}))
```

## 3. UI Components from Malli Schema

We need UI components that take a Malli schema of the **data** as input and generate the configuration UI for Vega-Lite charts. The user uses this UI to map data fields to chart channels.

### Goals
- **Input**: A Malli schema describing the **dataset** (fields and their types).
- **Output**: Reagent/React components that allow configuring the chart.
- **Dynamic Adaptation**: The Chart Builder UI must adapt based on the selected chart type.
    - **Automatic Layout**: The user does not choose which axes or channels to configure. Instead, if a specific chart type is selected (e.g., Bar Chart), the UI **automatically presents** the relevant configuration blocks (e.g., X-Axis, Y-Axis, Color).
    - Different charts have different channel requirements (e.g., Pie uses `theta`/`color`, Line uses `x`/`y`).
- **Two-way Sync**: Seamless synchronization between the UI state and a text-based configuration (JSON/EDN). Users should be able to edit the configuration as text and see the UI update, and vice-versa, without data loss.
- **Main Dimension Encoding**:
    - **Dropdown**: For selecting the data field (dimension) from the schema.
    - **Radio Button**: For selecting the data type (quantitative, nominal, ordinal, temporal).
    - **Label Input**: Text input for the axis/legend label (pre-filled with Title Case of the field name).
- **Sub-menus**: For defining aggregates (sum, mean, count) and scales (domain, range).

### Examples

#### Data Schema Definition (e.g., Cars Dataset)

```clojure
(def car-data-schema
  [:map
   [:horsepower :int]
   [:miles_per_gallon :int]
   [:origin :string]
   [:year :int]
   [:cylinders :int]])
```

#### UI Generation Component

The component takes the `car-data-schema` and a state atom for the chart configuration.

```clojure
(defn chart-configurator [data-schema chart-config onChange]
  ;; This component inspects data-schema to populate dropdowns
  [ui/chart-builder
   {:data-schema data-schema
    :value chart-config
    :on-change onChange
    :field-renderers
    {:field (fn [props] [ui/dropdown-from-schema data-schema props]) ;; Populated with :horsepower, :mpg, etc.
     :type  (fn [props] [ui/radio-group props])
     :title (fn [props] [ui/text-input (merge props {:placeholder "Axis Title"})])}}])
```

#### Expected UI Behavior

1.  **Chart Selection**: User selects "Bar Chart".
2.  **Automatic UI Population**: The UI immediately displays configuration blocks for **X-Axis**, **Y-Axis**, and **Color**. The user does not need to add these manually.
3.  **X-Axis Configuration**:
    - **Dropdown**: User selects "horsepower" (populated from `car-data-schema`).
    - **Radio Button**: User selects "Quantitative" (defaulted based on `:int` type in schema).
    - **Label Input**: Auto-fills with "Horsepower".
    - User clicks "More..." to open submenu.
    - In submenu, selects "Mean" for aggregation.
    - In submenu, sets scale domain to `[0, 500]`.

### Unforeseen Challenges
- **Bidirectional Parsing**: Ensuring that manual edits in the text editor (which might be flexible or contain comments) are correctly parsed back into the UI state, and handling "partial" or invalid states gracefully during text editing.
- **Chart Type Specificity**: Handling the divergent UI requirements for different chart types (e.g., ensuring a Pie chart doesn't show X/Y axis configuration but instead Sector/Color).
- **Schema Complexity**: Generating UI for deeply nested or recursive Malli schemas.
- **State Management**: Handling the state of the configuration form and syncing it with the Vega-Lite preview in real-time.
- **Layout**: Creating a UI that is both comprehensive (lots of options) and clean (not overwhelming).
