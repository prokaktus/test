(ns playre.clj.server
  (:gen-class)
  (:require [io.pedestal.http :as server]
            [playre.clj.service :as service])
  )


(defonce runnable-service (server/create-server service/service))



(defn -main
  "The entry point for lein-run"
  [& args]
  (println "\nStarting server...\n")
  (server/start runnable-service))

