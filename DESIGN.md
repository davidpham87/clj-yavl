# Design: Bidirectional Vega-Lite Config <-> UI Builder

## 1. Overview

This document outlines the design for a two-way synchronization system between a Vega-Lite configuration (in JSON/EDN format) and a UI Builder (a visual interface for constructing charts). The goal is to allow users to build charts visually while preserving the ability to edit the underlying configuration directly, with changes reflected in both views.

## 2. Problem Statement

Vega-Lite has a massive, recursive, and polymorphic schema. Building a UI that fully supports the entire Vega-Lite specification ("The Whole Problem") is extremely difficult because:
1.  **Complexity:** The schema is deeply nested and allows for limitless compositions (Layer, Concat, Repeat, Facet).
2.  **Ambiguity:** Many fields accept multiple types (e.g., `bin` can be boolean, or parameters object).
3.  **UI <-> Code Gap:** Mapping arbitrary JSON structures back to a simplified UI state is lossy or requires complex normalization.

We need a solution that balances power (covering the spec) with usability (simple common operations).

## 3. Architecture

We propose a **Projection-Based Architecture** where the Vega-Lite Specification (Spec) is the "Source of Truth", and the UI Builder is a "Projection" or "View" of that truth.

### 3.1 State Management

*   **Canonical State:** The application state (`re-frame` db) holds the **Full Vega-Lite Spec** as a Clojure map.
*   **Text Editor View:** Subscribes to the Canonical State, serializing it to JSON/EDN. Edits parse the text and update the Canonical State.
*   **UI Builder View:** Subscribes to the Canonical State, extracting specific paths (e.g., `[:encoding :x :field]`) to populate form controls. Actions dispatch events to `assoc-in` or `update-in` the Canonical State.

### 3.2 Bidirectional Sync

#### UI -> Config (Write)
This is straightforward. UI components emit specific actions.
*   *Example:* User selects "Bar" mark.
*   *Action:* `(assoc-in db [:spec :mark] "bar")`
*   *Result:* The internal spec updates, and the Text Editor re-renders with the new JSON.

#### Config -> UI (Read)
This is the challenging part. The UI components must "read" the arbitrary spec.
*   **Direct Mapping:** For simple keys (`mark`, `title`, `encoding.x.field`), the UI component simply subscribes to that path.
*   **Normalization:** If the user types a shorthand (e.g., `encoding: {x: "field"}`), the parser or subscription must normalize it to the longhand object (`encoding: {x: {field: "field"}}`) so the UI component can handle it.
*   **Unsupported/Advanced Features:** If the config contains structures the UI cannot represent (e.g., complex recursive transforms), the UI should either:
    1.  **Degrade Gracefully:** Show the recognized parts and hide/disable the unrecognized ones.
    2.  **Warn:** Indicate that "Advanced editing mode is active" and visual controls might be limited.

## 4. Proposed Solution: "The Hybrid Approach"

To satisfy the requirement of "reducing complexity" while acknowledging "solutions applicable to the whole problem", we propose a hybrid design.

### 4.1 The "Whole Problem" Solution (Theoretical)
**Schema-Driven UI Generation:**
Since we have the full Malli schema for Vega-Lite, we could theoretically generate the entire UI form automatically.
*   **Mechanism:** recursively walk the Malli schema. For `[:enum ...]`, render a dropdown. For `[:map ...]`, render a fieldset. For `[:or ...]`, render a "Type Switcher".
*   **Pros:** 100% coverage of the Vega-Lite spec.
*   **Cons:**
    *   **Usability Nightmare:** The form would be massive, deeply nested, and confusing (Vega-Lite is not designed for linear forms).
    *   **Implementation Difficulty:** Handling recursion, discriminators, and context-dependent validation in a generic form generator is highly complex.

### 4.2 The "Simplified & Pragmatic" Solution (Recommended)
**Curated UI for Common Paths:**
We build specific UI components for the 80% use case (Unit Specs: Single Chart with Encodings).

**Components:**
1.  **Chart Type Selector:** Dropdown for `mark` (bar, line, point, etc.).
2.  **Encoding Shelf:** A list of "Channels" (X, Y, Color, Size).
    *   Each channel has a "Field" selector (from the data schema).
    *   Each channel has a "Type" selector (Quantitative, Nominal, etc.).
    *   Each channel has "Aggregation" options.
3.  **Data Source:** Simple input for `data.url` or `data.values`.

**Handling Composition (Layers/Facets):**
Instead of a generic tree editor, we treat composition as "Advanced". The UI Builder primarily supports the `UnitSpec` (single chart). If the Spec detects `layer`, `hconcat`, or `vconcat` at the top level, the UI switches to a **"Structure View"** (tree representation) or simply disables the specific "Unit" controls, asking the user to edit via Text or a specialized Sub-View.

## 5. Implementation Strategy

### 5.1 Re-frame Events & Subs
*   `::update-spec-path [path value]`: Generic handler to update deep values in the spec.
*   `::spec-at-path [path]`: Generic subscription to get a value, possibly with a `normalize` interceptor to handle shorthands.

### 5.2 Normalization Logic
To ensure the UI works even when the user manually types shorthands:
```clojure
(defn normalize-encoding [encoding]
  (reduce-kv (fn [acc k v]
               (assoc acc k (if (string? v) {:field v} v)))
             {}
             encoding))
```
The UI subscriptions should use this normalization logic so the inputs don't crash on string shorthands.

### 5.3 Schema Integration
We leverage the existing Malli schema (`clj-yavl.schema.vega-lite`) to:
1.  **Populate Enums:** Use `m/children` on schema definitions to get valid options for Dropdowns (e.g., `Mark`, `AggregateOp`).
2.  **Validate:** Provide real-time validation feedback in the UI if the user enters an invalid value.

## 6. Summary of Operations
1.  **Parse:** Text Input -> JSON/EDN Parse -> `db`.
2.  **Project:** `db` -> Subscriptions (Normalize) -> UI Components.
3.  **Interact:** UI Component -> `dispatch` event -> `assoc-in db`.
4.  **Serialize:** `db` -> JSON/EDN Stringify -> Text Input.

This ensures the UI and Config are always in sync, satisfying the bidirectional communication requirement.
