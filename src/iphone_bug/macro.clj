(ns iphone-bug.macro)

(defmacro do-things [n]
  `(do
     ~@(for [x (range n)]
         `(hash ~(str (rand))))))
