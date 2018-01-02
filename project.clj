(defproject hiera-explorer "0.2.8"
  :description "A web app to visualize Hiera configuration data"
  :url "http://github.com/christianberg/hiera-explorer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [ring "1.6.3"]
                 [hiccup "1.0.5"]
                 [circleci/clj-yaml "0.5.6"]
                 [me.raynes/fs "1.4.6"]
                 [prone "1.1.4"]]
  :plugins [[lein-ring "0.12.2"]]
  :main hiera-explorer.main
  :aot :all
  :ring {:handler hiera-explorer.core/web})
