(ns com.fulcrologic.flowbite.components.breadcrumb.ui-breadcrumb
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$BreadCrumb" :refer (BreadCrumb)])))

(def ui-breadcrumb
  #?(:cljs (h/factory-apply BreadCrumb)))
