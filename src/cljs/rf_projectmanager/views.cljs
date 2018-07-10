(ns rf-projectmanager.views
  (:require
   [re-frame.core :as re-frame]
   [rf-projectmanager.subs :as subs]
   ))

(defn projects [prop]
  [:div "My Projects" prop
])

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     [projects "Hello world"]
     ]))
