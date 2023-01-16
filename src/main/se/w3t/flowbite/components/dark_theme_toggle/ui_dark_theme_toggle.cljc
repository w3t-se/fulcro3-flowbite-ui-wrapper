(ns com.fulcrologic.flowbite.components.dark-theme-toggle.ui-dark-theme-toggle
  (:require
    [com.fulcrologic.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$DarktThemeToggle" :as DarkThemeToggle])))

(def ui-dark-theme-toggle
  #?(:cljs (h/factory-apply DarkThemeToggle)))
