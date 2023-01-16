(ns com.fulcrologic.flowbite.components.alert.ui-alert
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$Alert" :refer (Alert)])))

(def ui-alert
  #?(:cljs (h/factory-apply Alert)))
