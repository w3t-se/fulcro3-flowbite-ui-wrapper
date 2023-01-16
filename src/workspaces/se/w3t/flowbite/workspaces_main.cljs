(ns se.w3t.flowbite.workspaces-main
  (:require [nubank.workspaces.core :as ws]
            [se.w3t.flowbite.workspaces.accordion]))

(defonce init (ws/mount))

