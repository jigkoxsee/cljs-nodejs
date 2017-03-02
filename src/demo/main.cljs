(ns demo.main
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(def express (nodejs/require "express"))

(defn ^:export plus [a b]
  (+ a b))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
(defn say-hello! [req res]
  (println "GET /")
  (.send res "Hello world!"))

(defn say-wow! [req res]
  (println "GET /wow")
  (.send res "WoW!"))

(defn -main []
  (let [app (express)]
    (.get app "/" say-hello!)
    (.get app "/wow" say-wow!)
    (.listen app 3000 (fn []
                        (println "Server started on port 3000")))))

(set! *main-cli-fn* -main)
