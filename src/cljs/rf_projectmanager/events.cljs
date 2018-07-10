(ns rf-projectmanager.events
  (:require
   [re-frame.core :as re-frame]
   [rf-projectmanager.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
