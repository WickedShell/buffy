(defproject clojurewerkz/buffy "1.0.0-beta6-SNAPSHOT"
  :description "Clojure library for working with binary data"
  :url "http://github.com/clojurewerkz/buffy"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure     "1.6.0"]
                 [io.netty/netty-buffer   "4.0.21.Final"]
                 [reiddraper/simple-check "0.5.3"]]
  :profiles {:1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0-alpha3"]]}
             :master {:dependencies [[org.clojure/clojure "1.7.0-master-SNAPSHOT"]]}
             :dev {:resource-paths ["test/resources"]
                   :plugins [[codox "0.8.10"]]
                   :codox {:sources ["src/clojure"]
                           :output-dir "doc/api"}}}
  :aliases {"all" ["with-profile" "dev:dev,1.5:dev,1.7:dev:dev,master"]})
