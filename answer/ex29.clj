; #29
; Get the Caps 
; Difficulty:	Easy
; Topics:	strings

; Describe:
; Write a function which takes a string and returns a new string containing only the capital letters.

; Case:
; (= (__ "HeLlO, WoRlD!") "HLOWRD")
; (empty? (__ "nothing"))
; (= (__ "$#A(*&987Zf") "AZ")

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(defn only-uppercase [sequence]
  (reduce str (filter #(Character/isUpperCase %) sequence))
)

(defn only-lowercase [sequence]
  (sequence str (filter #(Character/isLowerCase %) sequence))
)

(clojure.test/is
  (and
    (= (only-uppercase "HeLlO, WoRlD!") "HLOWRD")
    (empty? (only-uppercase "nothing"))
    (= (only-uppercase "$#A(*&987Zf") "AZ")
  )
)