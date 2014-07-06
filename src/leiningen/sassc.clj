(ns leiningen.sassc
  "Compile SASS/SCSS source into a CSS file."
  (:require [leiningen.help :as lhelp]
            [leiningen.core.main :as lmain]))


(defn- once
  "Compile the SASS/SCSS project once."
  [project]
  (println "once"))


(defn- clean
  "Remove automatically generated files."
  [project]
  (println "clean"))


(defn sassc
  "Run the sassc plugin."
  {:help-arglists '([once clean])
   :subtasks [#'once #'clean]}
  ([project]
     (println (lhelp/help-for "sassc"))
     (lmain/abort))
  ([project subtask & args]
     (case subtask
       "once" (once project)
       "clean" (clean project)
       (do (println "Subtask" (str \" subtask \") "not found."
                    (lhelp/subtask-help-for *ns* #'sassc))
           (lmain/abort)))))

