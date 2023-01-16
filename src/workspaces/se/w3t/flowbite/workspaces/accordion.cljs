(ns se.w3t.flowbite.workspaces.accordion
  (:require [com.fulcrologic.fulcro.components :as comp]
            [com.fulcrologic.fulcro.dom :as dom]
            [nubank.workspaces.core :as ws]
            [nubank.workspaces.card-types.fulcro3 :as ct.fulcro]
            #_[se.w3t.flowbite.components.flowbite.ui-flowbite :refer [ui-flowbite]]
            [se.w3t.flowbite.factories :as f]
            #_[se.w3t.flowbite.components.card.ui-card :refer [ui-card]]
            [se.w3t.flowbite.components.accordion.ui-accordion :refer [ui-accordion ui-accordion-panel ui-accordion-title ui-accordion-content]]))

(comp/defsc SomeAccordions
  [this {:keys [x]}]
  {:initial-state (fn [_] {:x "x"})
   :ident         (fn [] [::id "singleton"])
   :query         [:x]}
  (dom/div {}
    (ui-accordion {:alwaysOpen true}
      #_(ui-card {} "asd")
      (ui-accordion-panel {}
        (ui-accordion-title {} "Title")
        (ui-accordion-content {}
          (dom/p :.mb-2.text-gray-500.dark:text-gray-400
            "Flowbite is an open-source library of interactive components built on top of Tailwind CSS including buttons, dropdowns, modals, navbars, and more.")
          (dom/p :.text-gray-500.dark:text-gray-400
            "Check out this guide to learn how to "
            (dom/a {:href "https://flowbite.com/docs/getting-started/introduction/"
                    :className "text-blue-600 hover:underline dark:text-blue-500"}
              "get started") " and start developing websites even faster with components on top of Tailwind CSS.")))
      (ui-accordion-panel {}
        (ui-accordion-title {} "Title")
        (ui-accordion-content {}
          (dom/p :.mb-2.text-gray-500.dark:text-gray-400
            "Flowbite is an open-source library of interactive components built on top of Tailwind CSS including buttons, dropdowns, modals, navbars, and more.")
          (dom/p :.text-gray-500.dark:text-gray-400
            "Check out this guide to learn how to "
            (dom/a {:href "https://flowbite.com/docs/getting-started/introduction/"
                    :className "text-blue-600 hover:underline dark:text-blue-500"}
              "get started") " and start developing websites even faster with components on top of Tailwind CSS."))))))

(ws/defcard some-accordions
  (ct.fulcro/fulcro-card
    {::ct.fulcro/wrap-root? true
     ::ct.fulcro/root SomeAccordions}))

