(ns re-frame-amplify-exp.views
  (:require
   [re-frame.core :as re-frame]
   [breaking-point.core :as bp]
   [re-frame-amplify-exp.subs :as subs]
   ))

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     [:div
      [:h3 (str "screen-width: " @(re-frame/subscribe [::bp/screen-width]))]
      [:h3 (str "screen: " @(re-frame/subscribe [::bp/screen]))]]
     ]))
