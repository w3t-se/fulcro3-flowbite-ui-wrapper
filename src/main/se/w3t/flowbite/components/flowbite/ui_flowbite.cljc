(ns com.fulcrologic.flowbite.components.flowbite.ui-flowbite
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$Flowbite" :as Flowbite])))

(def ui-flowbite
  #?(:cljs (h/factory-apply Flowbite)))
