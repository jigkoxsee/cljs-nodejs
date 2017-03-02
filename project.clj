(defproject demo "0.1.0"
  :description "Demo nodejs application  with cljs"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.473"]]

  :plugins [[lein-cljsbuild "1.1.5"]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["resources"]

  :cljsbuild {
    :builds [{:id "app"
              :source-paths ["src"]
              :compiler {
                :main demo.main
                :output-to "resources/public/js/main.js"
                :output-dir "resources/public/js"
                :optimizations :advanced
                :target :nodejs}}]})
                ;:optimizations :none
                ;:source-map true}}]})
