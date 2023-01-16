(ns com.fulcrologic.flowbite.components.badge.ui-badge
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$Badge" :refer (Badge)])))

(def ui-badge
  #?(:cljs (h/factory-apply Badge)))
