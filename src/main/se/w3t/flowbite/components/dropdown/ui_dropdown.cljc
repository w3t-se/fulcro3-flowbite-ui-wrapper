(ns com.fulcrologic.flowbite.components.dropdown.ui-dropdown
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$Dropdown" :as Dropdown])))

(def ui-dropdown
  #?(:cljs (h/factory-apply Dropdown)))

(def ui-dropdown-item
  #?(:cljs (h/factory-apply (.-Item Dropdown))))

(def ui-dropdown-header
  #?(:cljs (h/factory-apply (.-Header Dropdown))))

(def ui-dropdown-divider
  #?(:cljs (h/factory-apply (.-Divider Dropdown))))

