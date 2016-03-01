; #21
; Nth Element
; Difficulty:	Easy
; Topics:	seqs core-functions

; Describe:
; Write a function which returns the Nth element from a sequence.

; Special Restrictions: nth

; Case:
; (= (__ '(4 5 6 7) 2) 6)
; (= (__ [:a :b :c] 0) :a)
; (= (__ [1 2 3 4] 1) 2)
; (= (__ '([1 2] [3 4] [5 6]) 2) [5 6])

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(defn nth-element [[first_l & rest_l] pos]
  (if(= pos 0)
  	first_l
  	(recur rest_l (dec pos))
  )
)

(clojure.test/is
  (and
    (= (nth-element '(4 5 6 7) 2) 6)
    (= (nth-element [:a :b :c] 0) :a)
    (= (nth-element [1 2 3 4] 1) 2)
    (= (nth-element '([1 2] [3 4] [5 6]) 2) [5 6])
  )
)

