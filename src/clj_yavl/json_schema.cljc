(ns clj-yavl.json-schema
  (:require [clojure.string :as str]))

(declare json-schema->malli)

(defn- sanitize-name [n]
  (-> (name n)
      (str/replace #"[^a-zA-Z0-9_]" "_")
      (as-> s (if (re-matches #"\d.*" s) (str "_" s) s))
      (symbol)))

(defn- normalize-ref [ref-val]
  (when (and (string? ref-val) (str/starts-with? ref-val "#/definitions/"))
    (subs ref-val (count "#/definitions/"))))

(defn- add-prop [schema k v]
  (if (vector? schema)
    (let [type (first schema)
          has-props (map? (second schema))
          props (if has-props (second schema) {})
          children (if has-props (drop 2 schema) (rest schema))]
      (into [type (assoc props k v)] children))
    [:and {k v} schema]))

(defn- parse-ref [{:keys [$ref]}]
  (when-let [r (normalize-ref $ref)]
    (let [sanitized (sanitize-name r)
          s-str (str sanitized)]
      (if (not= r s-str)
        [:ref {:json-schema/original-name r} (list 'var sanitized)]
        [:ref (list 'var sanitized)]))))

(defn- parse-enum [{:keys [enum]}]
  (when enum
    (into [:enum] enum)))

(defn- parse-const [{:keys [const] :as node}]
  (when (contains? node :const)
    [:= const]))

(defn- parse-primitive-type [{:keys [type]}]
  (cond
    (= type "string") 'string?
    (= type "integer") 'int?
    (= type "number") 'number?
    (= type "boolean") 'boolean?
    (= type "null") 'nil?
    :else nil))

(defn- parse-array [{:keys [type items]}]
  (when (= type "array")
    (cond
      (map? items) [:vector (json-schema->malli items)]
      (vector? items) (into [:tuple] (map json-schema->malli items))
      :else [:vector 'any?])))

(defn- parse-object [{:keys [type properties required additionalProperties]}]
  (when (= type "object")
    (let [req-set (set (map keyword required))
          props (for [[k v] properties]
                  (let [schema (json-schema->malli v)]
                    (if (contains? req-set k)
                      [(keyword k) schema]
                      [(keyword k) {:optional true} schema])))]
      (if (or (seq props) (false? additionalProperties))
        (into [:map {:closed (false? additionalProperties)}] props)
        [:map-of 'any? 'any?]))))

(defn- optimize-or [schemas]
  (let [grouped (group-by (fn [s] (if (vector? s) (first s) :other)) schemas)
        consts (get grouped :=)
        enums (get grouped :enum)
        others (apply concat (vals (dissoc grouped := :enum)))
        extract (fn [s]
                  (let [has-opts (map? (second s))
                        args (if has-opts (drop 2 s) (rest s))]
                    args))
        all-values (mapcat extract (concat consts enums))]
    (cond-> (vec others)
      (seq all-values) (conj (into [:enum] (distinct all-values))))))

(defn- parse-composition [{:keys [anyOf allOf oneOf]}]
  (cond
    anyOf (into [:or] (optimize-or (map json-schema->malli anyOf)))
    oneOf (into [:or] (optimize-or (map json-schema->malli oneOf)))
    allOf (into [:and] (map json-schema->malli allOf))
    :else nil))

(defn- parse-type-list [{:keys [type] :as node}]
  (when (vector? type)
    (into [:or] (map #(json-schema->malli (assoc node :type %)) type))))

(defn json-schema->malli [node]
  (or (parse-ref node)
      (parse-const node)
      (parse-enum node)
      (parse-composition node)
      (parse-array node)
      (parse-object node)
      (parse-type-list node)
      (parse-primitive-type node)
      'any?))

(defn transform [json-schema]
  (let [definitions (:definitions json-schema)
        registry (reduce-kv (fn [acc k v]
                              (let [s (json-schema->malli v)
                                    sanitized (sanitize-name k)
                                    s-str (str sanitized)
                                    k-str (name k)
                                    s (if (not= k-str s-str)
                                        (add-prop s :json-schema/original-name k-str)
                                        s)]
                                (assoc acc sanitized s)))
                            {}
                            definitions)
        schema (json-schema->malli json-schema)]
    {:schema schema
     :registry registry}))
