(ns iphone-bug.core
  (:require-macros [iphone-bug.macro :refer [do-things]]))

(def yyyy (hash "yyyy"))

(do-things 1000)

(set! (.-onload js/window)
      (fn []
        (js/alert (str "Before: " yyyy " After: " (hash "yyyy")))))
