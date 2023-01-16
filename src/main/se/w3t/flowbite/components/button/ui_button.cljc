(ns com.fulcrologic.flowbite.components.badge.ui-button
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$Button" :refer (Button)])))

(def ui-button
  #?(:cljs (h/factory-apply Button)))
