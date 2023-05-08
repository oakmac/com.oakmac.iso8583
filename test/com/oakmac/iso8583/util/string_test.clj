(ns com.oakmac.iso8583.util.string-test
  (:require
   [clojure.test :refer [deftest is]]
   [com.oakmac.iso8583.util.string :as util.str]))

(deftest left-pad-test
  (is (= (util.str/pad-left-with "" 0 "") ""))
  (is (= (util.str/pad-left-with " " 2 "1") " 1"))
  (is (= (util.str/pad-left-with "0" 3 "17") "017"))
  (is (= (util.str/pad-left-with "*" 2 "foo") "foo"))
  (is (= (util.str/pad-left-with "*" 3 "foo") "foo"))
  (is (= (util.str/pad-left-with "*" 4 "foo") "*foo"))
  (is (= (util.str/pad-left-with "*" 5 "foo") "**foo")))
