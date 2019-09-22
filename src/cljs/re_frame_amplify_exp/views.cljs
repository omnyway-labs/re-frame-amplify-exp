(ns re-frame-amplify-exp.views
  (:require
   [re-frame.core :as re-frame]
   [re-frame-amplify-exp.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     ]))
