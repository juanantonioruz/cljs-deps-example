(defproject core-cljs "0.0.1"
  :description "core-cljs"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [com.cemerick/piggieback "0.1.0"]
                 [org.clojure/clojurescript "0.0-1586"]
                 ]
  :hooks [leiningen.cljsbuild]
  :plugins [[lein-cljsbuild "0.3.0"][org.bodil/lein-noderepl "0.1.10"]]
  
  :profiles {:1.5 {:dependencies [
                                  [org.clojure/clojure "1.5.1"]
                                  ]}
             :dev {:dependencies [
                                  
                                  [com.cemerick/piggieback "0.0.4"]
                                  [org.bodil/cljs-noderepl "0.1.10"]]}

             }
  :cljsbuild {:builds  [{;; clojurescript source code path
                         :source-paths ["src"]

                         ;; Google Closure Compiler options
                         }]
              :test-commands {"unit-tests" ["phantomjs" "node2.js"]}}
  :repl-options {:nrepl-middleware [cemerick.piggieback/wrap-cljs-repl]}
  :repositories {"sonatype-oss-public" "https://oss.sonatype.org/content/groups/public/"}

  )
