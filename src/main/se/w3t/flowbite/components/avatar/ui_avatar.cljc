(ns com.fulcrologic.flowbite.components.avatar.ui-avatar
  (:require
   [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$Avatar" :as Avatar])))

(def ui-avatar
  #?(:cljs (h/factory-apply Avatar)))
