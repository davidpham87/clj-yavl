# clj-yavl: Because Life is Too Short for Raw Vega-Lite JSON

Let's be honest. You love Vega-Lite. You love writing 50-line JSON objects to define a scatter plot. You love explicitly telling the library that your integer column "age" is, in fact, `quantitative` for the 100th time. It builds character. It makes you feel alive.

But for those of us with weak dispositions who prefer "getting things done" over "character building via verbose JSON configuration," there is `clj-yavl`.

## What is this?

`clj-yavl` (Yet Another Vega-Lite Library — naming things is hard, okay?) is a CLJC wrapper that tries to make generating Vega-Lite specifications less painful.

It integrates with **Malli** to infer types so you don't have to, and provides sensible defaults so your charts don't look like they were designed in 1995 (unless you want them to).

## Why do I want this?

You have data. You have a schema (hopefully). You want a chart. You **do not** want to manually map every single field type to Vega-Lite's type system when your schema already knows what they are.

### The "I love boilerplate" way (Raw Vega-Lite):

```json
{
  "mark": "point",
  "encoding": {
    "x": {"field": "age", "type": "quantitative"},
    "y": {"field": "salary", "type": "quantitative"},
    "color": {"field": "department", "type": "nominal"}
  }
}
```

### The `clj-yavl` way:

"Here is my data schema. Draw a plot."

```clojure
(yavl/base-plot
  {:x "age" :y "salary" :color "department"}
  {:mark "point"}
  {:data-schema my-schema})
```

`clj-yavl` sees that `:age` is an integer in your schema and sets `"type": "quantitative"`. It sees `:department` is a string and sets `"type": "nominal"`. It's almost like magic, but it's just code.

## Features

*   **Malli Integration:** We read your Malli schemas. If you say it's an integer, we know it's `quantitative`. If it's a string, it's `nominal`. If it's a date, it's `temporal`.
*   **Presets:** `xyplot`, `pie`, `bar`. The basics are covered so you can pretend you're a data scientist with one function call.
*   **CLJC:** Works on the backend. Works on the frontend.
*   **Google Colors:** We stole Google's corporate color palette (`#4285F4`, etc.) because it looks nice and we lack artistic vision. You're welcome.
*   **Datascript Integration:** We use Datascript to manage state, because why store JSON when you can store EAVT datoms?

## Installation

Add this to your `deps.edn`:

```clojure
{:deps
 {io.github.your-username/clj-yavl {:git/sha "..."}
  metosin/malli {:mvn/version "0.20.0-alpha3"}}}
```

*(Note: You'll need to fill in the actual SHA/URL because I'm a README, not a package manager.)*

## Usage

### 1. The "I want full control but less typing" approach (`base-plot`)

```clojure
(require '[clj-yavl.api :as yavl]
         '[malli.core :as m])

(def my-schema
  [:map
   [:age :int]
   [:salary :double]
   [:department :string]])

;; Generates a full Vega-Lite spec map
(yavl/base-plot
  {:x "age" :y "salary" :color "department"} ;; Encodings
  {:mark "point" :title "Salary by Age"}     ;; Common specs
  {:data-schema my-schema})                  ;; Options (for type inference)
```

### 2. The "I just want a chart" approach (Presets)

```clojure
(require '[clj-yavl.presets :as presets])

;; Scatter Plot
(presets/unit-spec
  {:type :xyplot
   :x "age"
   :y "salary"
   :color "department"
   :title "My Beautiful Data"
   :data-schema my-schema})

;; Bar Chart (Grouped!)
(presets/unit-spec
  {:type :bar
   :x "quarter"
   :y "revenue"
   :group "region"
   :grouped? true
   :data-schema sales-schema})
```

## Contributing

Found a bug? Want to add a preset? Feel free to open a PR. If you break the tests, I will be very disappointed (and the CI will yell at you).

## License

MIT (probably). Use it for good, not evil.
