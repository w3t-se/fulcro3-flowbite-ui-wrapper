(ns com.fulcrologic.flowbite.components.avatar.ui-avatar-group
  (:require
   [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$AvatarGroup" :as AvatarGroup])))

(def ui-avatar-group
  #?(:cljs (h/factory-apply AvatarGroup)))
