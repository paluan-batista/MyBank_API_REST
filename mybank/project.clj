(defproject mybank "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}

  :plugins [[lein-ring "0.8.7"]]

  :ring {:handler mybank.core/app
         :auto-reload? true
         :auto-refresh? false
         :port 8080}

  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring "1.2.0"]
                 [hiccup "1.0.4"]
                 [ring/ring-json "0.2.0"]
                 [compojure "1.2.0-SNAPSHOT"]])
