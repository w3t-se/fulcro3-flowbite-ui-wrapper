(ns com.fulcrologic.flowbite.components.card.ui-card
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$Card" :as Card])))

(def ui-card
  #?(:cljs (h/factory-apply Card)))
