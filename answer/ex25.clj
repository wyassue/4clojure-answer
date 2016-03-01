; #25
; Find the odd numbers 
; Difficulty:	Easy
; Topics:	seqs

; Describe:
; Write a function which returns only the odd numbers from a sequence.

; Case:
; 1. (= (__ #{1 2 3 4 5}) '(1 3 5))
; 2. (= (__ [4 2 1 6]) '(1))
; 3. (= (__ [2 2 4 6]) '())
; 4. (= (__ [1 1 1 3]) '(1 1 1 3))

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(defn filter-odd [list]
  (filter odd? list)
)

(clojure.test/is
  (and
    (= (filter-odd #{1 2 3 4 5}) '(1 3 5))
    (= (filter-odd [4 2 1 6]) '(1))
    (= (filter-odd [2 2 4 6]) '())
    (= (filter-odd [1 1 1 3]) '(1 1 1 3))
  )
)
