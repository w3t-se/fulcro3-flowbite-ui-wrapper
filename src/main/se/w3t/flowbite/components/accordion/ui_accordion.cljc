(ns se.w3t.flowbite.components.accordion.ui-accordion
  (:require
    [se.w3t.flowbite.factory-helpers :as h]
    #?(:cljs ["flowbite-react$Accordion" :as Accordion])))

(def ui-accordion
  #?(:cljs (h/factory-apply Accordion)))

(def ui-accordion-panel
  #?(:cljs (h/factory-apply (.-Panel Accordion))))

(def ui-accordion-title
  #?(:cljs (h/factory-apply (.-Title Accordion))))

(def ui-accordion-content
  #?(:cljs (h/factory-apply (.-Content Accordion))))

