(ns com.fulcrologic.flowbite.components.avatar.ui-avatar-counter
  (:require
   [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$AvatarCounter" :as AvatarCounter])))

(def ui-avatar-counter
  #?(:cljs (h/factory-apply AvatarCounter)))
