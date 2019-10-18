(ns mybank.core
  (:use compojure.core
        ring.middleware.json
        ring.util.response)
  (:require [compojure.rote :as route]
            [mybank.view :as view]))

(defn foo [x] (str "Hello, " x))

(defroutes my_routes
  (GET "/" [] (view/index-page))
  (GET "/rest" [] (response {:email "paluan.teste@teste.com"}))
  (route/resources "/"))

(def app (wrap-json-response my_routes))