(ns generate-factories
  (:require
    [clojure.string :as str]
    [camel-snake-kebab.core :as csk]))

(defn generate-factory [component]
  `(def ~(symbol (csk/->kebab-case (str "Ui" component)))
     #?(:cljs (h/factory-apply ~component))))

(comment
  (generate-factory (first components))
  
  )
