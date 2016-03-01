; #23
; Reverse a Sequence
; Difficulty:	Easy
; Topics:	seqs core-functions

; Describe:
; Write a function which reverses a sequence.

; Special Restrictions: reverse, rseq

; Case: 
; 1. (= (__ [1 2 3 4 5]) [5 4 3 2 1])
; 2. (= (__ (sorted-set 5 7 2 7)) '(7 5 2))
; 3. (= (__ [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------


(defn reverse-sequence [sequence]
  (reduce conj () sequence)
)

(defn reverse-sequence [sequence]
  (reduce #(cons %2 %1) '() sequence)
)

(clojure.test/is
  (and
    (= (reverse-sequence [1 2 3 4 5]) [5 4 3 2 1])
    (= (reverse-sequence (sorted-set 5 7 2 7)) '(7 5 2))
    (= (reverse-sequence [[1 2][3 4][5 6]]) [[5 6][3 4][1 2]])
  )
)