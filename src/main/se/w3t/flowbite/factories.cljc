(ns se.w3t.flowbite.factories
   (:require
    [camel-snake-kebab.core :as csk]
    [se.w3t.flowbite.factory-helpers :as h]
    #?(:cljs [flowbite-react :as fbr]))
   ;; #?(:cljs (:require-macros [se.w3t.flowbite.factories :as f :refer [generate-factories]]))
   )

(def ui-accordion
  "An accordion allows users to toggle the display of sections of content.

  Props:
    - className (string): Additional classes.
    - alwaysOpen (bool)
    - arrowIcon 
    - children"
  #?(:cljs (h/factory-apply fbr/Accordion)))

(def ui-accordion-panel
  #?(:cljs (h/factory-apply (.-Panel fbr/Accordion))))

(def ui-accordion-content
  #?(:cljs (h/factory-apply (.-Content fbr/Accordion))))

(def ui-accordion-title
  #?(:cljs (h/factory-apply (.-Title fbr/Accordion))))

(def ui-alert
  #?(:cljs (h/factory-apply fbr/Alert)))

(def ui-avatar
  #?(:cljs (h/factory-apply fbr/Avatar)))

(def ui-avatar-counter
  #?(:cljs (h/factory-apply (.-Counter fbr/Avatar))))

(def ui-avatar-group
  #?(:cljs (h/factory-apply (.-Group fbr/Avatar))))

(def ui-badge
  #?(:cljs (h/factory-apply fbr/Badge)))

(def ui-breadcrumb
  #?(:cljs (h/factory-apply fbr/Breadcrumb)))

(def ui-breadcrumb-item
  #?(:cljs (h/factory-apply (.-Item fbr/Breadcrumb))))

(def ui-button
  #?(:cljs (h/factory-apply fbr/Button)))

(def ui-button-group
  #?(:cljs (h/factory-apply (.-Group fbr/Button))))

(def ui-card
  #?(:cljs (h/factory-apply fbr/Card)))

(def ui-carousel
  #?(:cljs (h/factory-apply fbr/Carousel)))

(def ui-checkbox
  #?(:cljs (h/factory-apply fbr/Checkbox)))

(def ui-dark-theme-toggle
  #?(:cljs (h/factory-apply fbr/DarkThemeToggle)))

(def ui-dropdown
  #?(:cljs (h/factory-apply fbr/Dropdown)))

(def ui-dropdown-item
  #?(:cljs (h/factory-apply (.-Item fbr/Dropdown))))

(def ui-dropdown-header
  #?(:cljs (h/factory-apply (.-Header fbr/Dropdown))))

(def ui-dropdown-divider
  #?(:cljs (h/factory-apply (.-Divider fbr/Dropdown))))

(def ui-file-input
  #?(:cljs (h/factory-apply fbr/FileInput)))

(def ui-floating
  #?(:cljs (h/factory-apply fbr/Floating)))

(def ui-flowbite
  #?(:cljs (h/factory-apply fbr/Flowbite)))

(def ui-footer
  #?(:cljs (h/factory-apply fbr/Footer)))

(def ui-footer-copyright
  #?(:cljs (h/factory-apply (.-Copyright fbr/Footer))))

(def ui-footer-link
  #?(:cljs (h/factory-apply (.-Link fbr/Footer))))

(def ui-footer-link-group
  #?(:cljs (h/factory-apply (.-LinkGroup fbr/Footer))))

(def ui-footer-brand
  #?(:cljs (h/factory-apply (.-Brand fbr/Footer))))

(def ui-footer-icon
  #?(:cljs (h/factory-apply (.-Icon fbr/Footer))))'

(def ui-footer-title
  #?(:cljs (h/factory-apply (.-Title fbr/Footer))))

(def ui-footer-divider
  #?(:cljs (h/factory-apply (.-Divider fbr/Footer))))

(def ui-helper-text
  #?(:cljs (h/factory-apply fbr/HelperText)))

(def ui-label
  #?(:cljs (h/factory-apply fbr/Label)))

(def ui-list-group
  #?(:cljs (h/factory-apply fbr/ListGroup)))

(def ui-list-group-item
  #?(:cljs (h/factory-apply (.-Item fbr/ListGroup))))

(def ui-modal
  #?(:cljs (h/factory-apply fbr/Modal)))

(def ui-modal-body
  #?(:cljs (h/factory-apply (.-Body fbr/Modal))))

(def ui-modal-header
  #?(:cljs (h/factory-apply (.-Header fbr/Modal))))

(def ui-modal-footer
  #?(:cljs (h/factory-apply (.-Footer fbr/Modal))))

(def ui-navbar
  #?(:cljs (h/factory-apply fbr/Navbar)))

(def ui-navbar-brand
  #?(:cljs (h/factory-apply (.-Brand fbr/Navbar))))

(def ui-navbar-collapse
  #?(:cljs (h/factory-apply (.-Collapse fbr/Navbar))))

(def ui-navbar-link
  #?(:cljs (h/factory-apply (.-Link fbr/Navbar))))

(def ui-navbar-toggle
  #?(:cljs (h/factory-apply (.-Toggle fbr/Navbar))))

(def ui-pagination
  #?(:cljs (h/factory-apply fbr/Pagination)))

(def ui-pagination-button
  #?(:cljs (h/factory-apply (.-Button fbr/Pagination))))

(def ui-progress
  #?(:cljs (h/factory-apply fbr/Progress)))

(def ui-radio
  #?(:cljs (h/factory-apply fbr/Radio)))

(def ui-rating
  #?(:cljs (h/factory-apply fbr/Rating)))

(def ui-rating-star
  #?(:cljs (h/factory-apply (.-Star fbr/Rating))))

(def ui-rating-advanced
  #?(:cljs (h/factory-apply (.-Advanced fbr/Rating))))

(def ui-select
  #?(:cljs (h/factory-apply fbr/Select)))

(def ui-sidebar
  #?(:cljs (h/factory-apply fbr/Sidebar)))

(def ui-sidebar-collapse
  #?(:cljs (h/factory-apply (.-Collapse fbr/Sidebar))))

(def ui-sidebar-cta
  #?(:cljs (h/factory-apply (.-CTA fbr/Sidebar))))

(def ui-sidebar-item
  #?(:cljs (h/factory-apply (.-Item fbr/Sidebar))))

(def ui-sidebar-items
  #?(:cljs (h/factory-apply (.-Items fbr/Sidebar))))

(def ui-sidebar-item-group
  #?(:cljs (h/factory-apply (.-ItemGroup fbr/Sidebar))))

(def ui-sidebar-logo
  #?(:cljs (h/factory-apply (.-Logo fbr/Sidebar))))

(def ui-spinner
  #?(:cljs (h/factory-apply fbr/Spinner)))

(def ui-tabs
  #?(:cljs (h/factory-apply fbr/Tabs)))

(def ui-tab-item
  #?(:cljs (h/factory-apply (.-Item fbr/Tabs))))

(def ui-table
  #?(:cljs (h/factory-apply fbr/Table)))

(def ui-table-head
  #?(:cljs (h/factory-apply (.-Head fbr/Table))))

(def ui-table-body
  #?(:cljs (h/factory-apply (.-Body fbr/Table))))

(def ui-table-row
  #?(:cljs (h/factory-apply (.-Row fbr/Table))))

(def ui-table-cell
  #?(:cljs (h/factory-apply (.-Cell fbr/Table))))

(def ui-table-head-cell
  #?(:cljs (h/factory-apply (.-HeadCell fbr/Table))))

(def ui-text-input
  #?(:cljs (h/factory-apply fbr/TextInput)))

(def ui-textarea
  #?(:cljs (h/factory-apply fbr/Textarea)))

(def ui-timeline
  #?(:cljs (h/factory-apply fbr/Timeline)))

(def ui-timeline-item
  #?(:cljs (h/factory-apply (.-Item fbr/Timeline))))

(def ui-timeline-point
  #?(:cljs (h/factory-apply (.-Point fbr/Timeline))))

(def ui-timeline-content
  #?(:cljs (h/factory-apply (.-Content fbr/Timeline))))

(def ui-timeline-time
  #?(:cljs (h/factory-apply (.-Time fbr/Timeline))))

(def ui-timeline-title
  #?(:cljs (h/factory-apply (.-Title fbr/Timeline))))

(def ui-timeline-body
  #?(:cljs (h/factory-apply (.-Body fbr/Timeline))))


(def ui-toast
  #?(:cljs (h/factory-apply fbr/Toast)))

(def ui-toast-toggle
  #?(:cljs (h/factory-apply (.-Toggle fbr/Toast))))

(def ui-toggle-switch
  #?(:cljs (h/factory-apply fbr/ToggleSwitch)))

(def ui-tooltip
  #?(:cljs (h/factory-apply fbr/Tooltip)))

(comment


#?(:clj
   (defmacro generate-factory "Generate factory" [component]
     `(def ~(symbol (csk/->kebab-case (str "Ui" component)))
        (h/factory-apply ~component))))

#?(:clj
   (defmacro generate-c "Generate factory" [c]
     `(symbol (str "fbr/" ~c))))

#_(comment 
  (. (f/generate-c "Accordion") -Panel))

#?(:clj
   (defmacro generate-factories "Generate factory" [components]
     (->> (for [c components]
            `(for [~'s (remove #(= "displayName" %) (~'js->clj (~'js-keys (symbol (str "fbr/" ~c)))))]
               
               (def (symbol (csk/->kebab-case (str "Ui" ~c ~'s)))
                 (se.w3t.flowbite.factory-helpers/factory-apply (. ~c (symbol (str "-" ~'s)))))
               ))
          (cons 'do))))

#?(:clj
   (generate-factories ["Accordion"
                        "Alert"
                        "Avatar"
                        "Badge"
                        "Breadcrumb"
                        "Button"
                        "Card"
                        "Carousel"
                        "Checkbox"
                        "DarkThemeToggle"
                        "Dropdown"
                        "FileInput"
                        "Floating"
                        "Flowbite"
                        "Footer"
                        "HelperText"
                        "Label"
                        "ListGroup"
                        "Modal"
                        "Navbar"
                        "Pagination"
                        "Progress"
                        "Radio"
                        "Rating"
                        "Select"
                        "Sidebar"
                        "Spinner"
                        "Tab"
                        "Table"
                        "TextInput"
                        "Textarea"
                        "Timeline"
                        "Toast"
                        "ToggleSwitch"
                        "Tooltip"]))


;(. fbr/Accordion -Panel)

;(macroexpand `(generate-factories ["Accordion"]))
;ui-accordion-panel


  (remove #(= "displayName" %) (js->clj (js-keys fbr/Accordion)))
  (macroexpand '(generate-factories c))
  (for [i [ 1 2 3]]
    (println i)))
