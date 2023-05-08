(ns com.oakmac.iso8583.util.string)

(defn pad-left-with [p l v]
  (if (< (count v) l)
    (let [s (concat (repeat (- l (count v)) p) v)]
      (apply str (take l s)))
    v))
