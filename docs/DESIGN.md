# Design: Bidirectional Vega-Lite Config <-> UI Builder

## 1. Overview

This document outlines the design for a two-way synchronization system between a
Vega-Lite configuration (in JSON/EDN format) and a UI Builder (a visual
interface for constructing charts). The goal is to allow users to build charts
visually while preserving the ability to edit the underlying configuration
directly, with changes reflected in both views.

## 2. Problem Statement

Vega-Lite has a massive, recursive, and polymorphic schema. Building a UI that
fully supports the entire Vega-Lite specification ("The Whole Problem") is
extremely difficult because:
1.  **Complexity:** The schema is deeply nested and allows for limitless
    compositions (Layer, Concat, Repeat, Facet).
2.  **Ambiguity:** Many fields accept multiple types (e.g., `bin` can be
    boolean, or parameters object).
3.  **UI <-> Code Gap:** Mapping arbitrary JSON structures back to a simplified
    UI state is lossy or requires complex normalization.

We need a solution that balances power (covering the spec) with usability
(simple common operations).

## 3. Architecture

We propose a **Projection-Based Architecture** where the Vega-Lite
Specification (Spec) is the "Source of Truth", and the UI Builder is a
"Projection" or "View" of that truth.

### 3.1 State Management

*   **Canonical State:** The application state (`re-frame` db) holds the **Full
    Vega-Lite Spec** as a Clojure map.
*   **Text Editor View:** Subscribes to the Canonical State, serializing it to
    JSON/EDN. Edits parse the text and update the Canonical State.
*   **UI Builder View:** Subscribes to the Canonical State, extracting specific
    paths (e.g., `[:encoding :x :field]`) to populate form controls. Actions
    dispatch events to `assoc-in` or `update-in` the Canonical State.

### 3.2 Bidirectional Sync with Validation

To ensure robustness, the 2-way communication includes validation:
*   **UI -> Config:** Changes from the UI are inherently safer as they come from
    controlled inputs, but they still update the canonical spec.
*   **Config -> UI:** When the text config changes, we validate against the
    schema. If the config diverges from what the UI can represent (e.g., a
    custom transform not in our presets), the UI degrades gracefully or warns
    the user.

## 4. Proposed Solution: Presets & Composition

To support advanced features (layers, facets, repeat, hconcat, vconcat) without
overwhelming complexity, we adopt a **Preset & Composition** strategy.

### 4.1 Unit Specs & Global Formatting
We maintain the design for **Unit Specs** (single charts) as the fundamental
building block.
*   **Formatting Assumption:** To reduce nested complexity, formatting options
    like labels, titles, and font sizes are treated as **Global Constants** for
    the whole configuration. We do not support per-axis or per-legend overrides
    in the UI (though they persist if added via code).

### 4.2 Registry & Composition
Instead of a single monolithic tree editor, users define individual **Unit
Specs** (plots) and register them.
*   **Registry:** A collection of named plots (e.g., "SalesBar", "TrendLine").
*   **Composition:** A higher-level UI allows users to compose these named plots
    using layout primitives:
    *   `layer`: Stack "SalesBar" and "TrendLine".
    *   `hconcat` / `vconcat`: Arrange plots side-by-side or vertically.
    *   `facet` / `repeat`: Apply iteration over a base unit spec.

### 4.3 Functional Presets with Specialized UI
To further limit complexity, we introduce **Functional Presets**. Instead of a
generic "Chart" builder, we offer specific "Functions" that generate a template
tree, each with a dedicated UI.

**Examples:**
*   **Pie Chart Preset:**
    *   *UI:* Asks only for `Radius`, `Angle`, and `Color`.
    *   *Hidden:* `X` and `Y` axes are irrelevant and hidden.
*   **Bar Chart Preset:**
    *   *UI:* Asks for `X`, `Y`, `Color`.
*   **Faceted Scatter Preset:**
    *   *UI:* Asks for `X`, `Y`, and `Facet Row/Column`.

**Mechanism:**
1.  **Select Function:** User chooses a preset (e.g., "Pie Chart").
2.  **Render UI:** The system renders the specific UI components required for
    that function (defined with base components).
3.  **Generate Spec:** The function transforms the UI inputs into the correct
    Vega-Lite spec (setting `mark: arc`, `encoding: {theta: ...}`, etc.).

## 5. Implementation Strategy

### 5.1 Re-frame Events & Subs
*   `::update-spec-path [path value]`: Generic handler to update deep values.
*   `::apply-preset [preset-id args]`: Dispatches a function to generate a spec
    subtree based on preset arguments.

### 5.2 Component Library
We build a library of **Base Components** (Field Selector, Color Picker, Toggle)
that are composed to create the "Specialized UI" for each preset.

## 6. Summary of Operations
1.  **Select Preset:** User picks a "Function" (e.g., "Layered Bar Chart").
2.  **Input:** User interacts with the simplified, relevant UI for that preset.
3.  **Generate:** System runs the function to produce the Vega-Lite Spec.
4.  **Sync:** Changes are reflected in the Text Editor.
5.  **Reverse Sync:** If the user edits the Text Editor, we attempt to map it
    back to the active preset's state. If the text deviates too far (e.g.,
    changing `mark: arc` to `mark: bar` while in "Pie Mode"), the UI may revert
    to a "Raw JSON" view or show a validation warning.
