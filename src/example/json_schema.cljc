(ns example.json-schema
  (:require [clojure.string :as str]))

(declare json-schema->malli)

(defn- normalize-ref [ref-val]
  (when (and (string? ref-val) (str/starts-with? ref-val "#/definitions/"))
    (subs ref-val (count "#/definitions/"))))

(defn- parse-ref [{:keys [$ref]}]
  (when-let [r (normalize-ref $ref)]
    [:ref r]))

(defn- parse-enum [{:keys [enum]}]
  (when enum
    (into [:enum] enum)))

(defn- parse-const [{:keys [const] :as node}]
  (when (contains? node :const)
    [:= const]))

(defn- parse-primitive-type [{:keys [type]}]
  (cond
    (= type "string") string?
    (= type "integer") int?
    (= type "number") number?
    (= type "boolean") boolean?
    (= type "null") nil?
    :else nil))

(defn- parse-array [{:keys [type items]}]
  (when (= type "array")
    (cond
      (map? items) [:vector (json-schema->malli items)]
      (vector? items) (into [:tuple] (map json-schema->malli items))
      :else [:vector any?])))

(defn- parse-object [{:keys [type properties required additionalProperties]}]
  (when (= type "object")
    (let [req-set (set (map keyword required))
          props (for [[k v] properties]
                  (let [schema (json-schema->malli v)]
                    (if (contains? req-set k)
                      [k schema]
                      [k {:optional true} schema])))]
      (if (or (seq props) (false? additionalProperties))
        (into [:map {:closed (false? additionalProperties)}] props)
        [:map-of any? any?]))))

(defn- parse-composition [{:keys [anyOf allOf oneOf]}]
  (cond
    anyOf (into [:or] (map json-schema->malli anyOf))
    oneOf (into [:or] (map json-schema->malli oneOf))
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
      any?))

(defn transform [json-schema]
  (let [definitions (:definitions json-schema)
        registry (reduce-kv (fn [acc k v]
                              (assoc acc (name k) (json-schema->malli v)))
                            {}
                            definitions)
        schema (json-schema->malli json-schema)]
    {:schema schema
     :registry registry}))
