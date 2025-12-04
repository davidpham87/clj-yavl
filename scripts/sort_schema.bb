#!/usr/bin/env bb
(require '[rewrite-clj.zip :as z])
(require '[rewrite-clj.node :as n])
(require '[clojure.string :as str])
(require '[babashka.fs :as fs])

(defn safe-sexpr [node]
  (if (or (n/whitespace? node) (n/comment? node))
    nil
    (n/sexpr node)))

(defn safe-vector? [node]
  (vector? (safe-sexpr node)))

(defn sort-fields [map-vec-zloc]
  (let [node (z/node map-vec-zloc)
        children (n/children node)
        real-children (filter #(not (or (n/whitespace? %) (n/comment? %))) children)
        first-real (first real-children)
        second-real (second real-children)

        has-props? (map? (safe-sexpr second-real))

        split-idx (loop [idx 0
                         cnt 0]
                    (if (>= cnt (if has-props? 2 1))
                      idx
                      (if (>= idx (count children))
                        idx
                        (let [node (nth children idx)]
                          (recur (inc idx)
                                 (if (or (n/whitespace? node) (n/comment? node))
                                   cnt
                                   (inc cnt)))))))

        header (take split-idx children)
        body (drop split-idx children)

        field-nodes (filter safe-vector? body)

        sorted-field-nodes (sort-by #(str (first (safe-sexpr %))) field-nodes)

        ;; Force 3 spaces indent for fields
        indent-node (n/whitespace-node "\n   ")

        new-children (vec (concat header
                                  (mapcat (fn [node] [indent-node node]) sorted-field-nodes)))

        new-node (n/replace-children node new-children)]

    (z/replace map-vec-zloc new-node)))

(defn process-def [zloc]
  (let [def-name (safe-sexpr (z/node (z/right (z/down zloc))))
        val-zloc (loop [curr (z/down zloc)
                        last-val nil]
                   (if (nil? curr)
                     last-val
                     (recur (z/right curr)
                            (if (or (n/whitespace? (z/node curr)) (n/comment? (z/node curr)))
                              last-val
                              curr))))]
    (if val-zloc
      (let [sexpr (safe-sexpr (z/node val-zloc))]
        (if (and (vector? sexpr) (= :map (first sexpr)))
          (let [sorted-val (sort-fields val-zloc)]
            (z/up sorted-val))
          zloc))
      zloc)))

(defn process-file [filepath]
  (println "Processing" filepath)
  (let [zloc (z/of-file filepath)]
    (if (or (nil? zloc) (nil? (z/node zloc)))
      (println "Skipping empty/invalid file:" filepath)
      (let [final-zloc (loop [curr zloc]
                         (let [updated (if (and (z/list? curr)
                                                (= 'def (safe-sexpr (z/node (z/down curr)))))
                                         (process-def curr)
                                         curr)]
                           (if-let [nxt (z/right updated)]
                             (recur nxt)
                             updated)))]
        (spit filepath (z/root-string final-zloc))))))

(doseq [file (fs/glob "src/clj_yavl/schema/vega_lite" "*.cljc")]
  (process-file (str file)))
