(ns iphone-bug.core)

(def yyyy (hash "yyyy"))

(dotimes [i 1000]
  (hash "yyyy"))

(js/alert (str "Before: " yyyy " After: " (hash "yyyy")))
