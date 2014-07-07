(defproject lein-sassc "0.9.0"
  :description "Leiningen sassc plugin"
  :url "http://bitbucket.org/apribase/lein-sassc"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"
            :distribution :repo}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [me.raynes/fs "1.4.6"]]
  :hooks [leiningen.sassc]
  :eval-in-leiningen true
  :min-lein-version "2.0.0")
