(ns com.fulcrologic.flowbite.components.breadcrumb.ui-breadcrumb-item
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$BreadCrumbItem" :refer (BreadCrumbItem)])))

(def ui-breadcrumb-item
  #?(:cljs (h/factory-apply BreadCrumbItem)))
