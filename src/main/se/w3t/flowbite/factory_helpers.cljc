(ns se.w3t.flowbite.factory-helpers
  (:require
       [camel-snake-kebab.core :as csk]
    #?(:cljs react)
    #?(:cljs [com.fulcrologic.fulcro.dom :as dom]
       :clj  [com.fulcrologic.fulcro.dom-server :as dom])))

(defn factory-apply
  "Creates a function that can make elements of the given class."
  [class]
  (fn [props & children]
    #?(:clj  (apply dom/create-element class props children)
       ;; bug in Fulcro 3.4.4 and below makes above not work in cljs, though it should
       :cljs (apply react/createElement class (clj->js props) children))))

(defn wrapped-factory-apply
  "Returns a factory that wraps the given class as an input. Requires that the target item support `:value` as a prop."
  [class]
  #?(:clj  (factory-apply class)
     :cljs (let [factory (dom/wrap-form-element class)]
             (fn [props & children]
               (apply factory (clj->js props) children)))))

#?(:clj
   (defmacro generate-factory "Generate factory" [component]
     (list 'def (symbol (csk/->kebab-case (str "Ui" component)))
           (' se.w3t.flowbite.factory-helpers/factory-apply component))))

#?(:clj 
   (defmacro generate-factories "Generate factory" [components]
     (->> (for [c (eval components)]
            (list 'def (symbol (csk/->kebab-case (str "Ui" c)))
                  (' se.w3t.flowbite.factory-helpers/factory-apply c)))
          (cons 'do))))

(def components ["Carousel"
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
         "Tooltip"])
