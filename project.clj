(defproject iphone-bug "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "0.0-3308"]]

  :plugins [[lein-cljsbuild "1.0.6"]]

  :cljsbuild {:builds
              {:main
               {:source-paths ["src"]
                :compiler {:main "iphone-bug.core"
                           :output-to "out/main.js"
                           :output-dir "out"
                           :optimizations :whitespace
                           :static-fns true
                           :pretty-print true}}}})
