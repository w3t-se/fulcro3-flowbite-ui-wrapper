(ns com.fulcrologic.flowbite.components.carousel.ui-carousel
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$Carousel" :as Carousel])))

(def ui-carousel
  #?(:cljs (h/factory-apply Carousel)))
