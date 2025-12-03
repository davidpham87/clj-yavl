(ns clj-yavl.symbol-check-test
  (:require #?(:clj [clojure.test :refer [deftest is testing]]
               :cljs [cljs.test :refer [deftest is testing]])
            [malli.core :as m]
            [malli.util :as mu]))

(deftest check-mu-on-and
  (println "Checking mu/closed-schema [:and [:map]]...")
  (try (mu/closed-schema [:and [:map]]) (println "Closed And ok")
       (catch #?(:clj Exception :cljs :default) e
         (println "Closed And failed" (ex-message e) (ex-data e)))))
