(ns com.fulcrologic.flowbite.components.checkbox.ui-checkbox
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$Checkbox" :as Checkbox])))

(def ui-checkbox
  #?(:cljs (h/factory-apply Checkbox)))
