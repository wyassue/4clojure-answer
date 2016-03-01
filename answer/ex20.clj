; #20
; Penultimate Element 
; Difficulty:	Easy
; Topics:	seqs

; Describe:
; Write a function which returns the second to last element from a sequence.

; Case:
; 1. (= (__ (list 1 2 3 4 5)) 4)
; 2. (= (__ ["a" "b" "c"]) "b")
; 3. (= (__ [[1 2] [3 4]]) [1 2])

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(defn penultimate-element[list]
  (nth list (- (count list) 2))
)

(defn penultimate-element [[first_l & rest_l]] 
  (if(= 1 (count rest_l))
  	first_l
  	(recur rest_l)
  )
)

(clojure.test/is
  (and
    (= (penultimate-element (list 1 2 3 4 5)) 4)
    (= (penultimate-element ["a" "b" "c"]) "b")
    (= (penultimate-element [[1 2] [3 4]]) [1 2]) 
  )
)
