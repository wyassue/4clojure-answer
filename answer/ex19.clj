; #19 - Last Element 
; Difficulty:	Easy
; Topics:	seqs core-functions

; Describe:
; Write a function which returns the last element in a sequence.
; test not run	

; Special Restrictions: last

; Case: 
; 1. (= (__ [1 2 3 4 5]) 5)
; 2. (= (__ '(5 4 3)) 3)
; 3. (= (__ ["b" "c" "d"]) "d")

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(= ((comp first reverse) [1 2 3 4 5]) 5)

(defn last-element [[first_l & rest_l]]
	(println first_l "|" rest_l)
  (if(= rest_l nil)
  	first_l
  	(recur rest_l)
  )
)

(clojure.test/is
  (and
    (= (last-element [1 2 3 4 5]) 5)
    (= (last-element '(5 4 3)) 3)
    (= (last-element ["b" "c" "d"]) "d")
  )
)
