(ns clj-yavl.views.datasets
  (:require [re-frame.core :as rf]))

(rf/reg-sub
 ::items
 (fn [db]
   (get-in db [:user-input :datasets :items])))
