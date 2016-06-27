(ns playre.clj.service
  (:require [io.pedestal.http :as bootstrap]
            [io.pedestal.http.route :as route]
            [io.pedestal.http.route.definition :refer [defroutes]]
            [ring.util.response :as ring-resp]
            ))


(defn home-page
  [request]
  (ring-resp/response "Hellow World"))


(defroutes routes
  [[["/" {:get home-page}]]])


(def service {:env :dev
              ::bootstrap/routes routes
              ::bootstrap/resource-path "/public"
              ::bootstrap/type :jetty
              ::bootstrap/port 8080
              })

