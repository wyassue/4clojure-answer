; #24
; Sum It All Up 
; Difficulty:	Easy
; Topics:	seqs

; Describe: 
; Write a function which returns the sum of a sequence of numbers.

; Case:
; 1. (= (__ [1 2 3]) 6)
; 2. (= (__ (list 0 -2 5 5)) 8)
; 3. (= (__ #{4 2 1}) 7)
; 4. (= (__ '(0 0 -1)) -1)
; 5. (= (__ '(1 10 3)) 14)
; 6. (= (__ '(1 10 3)) 14)

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(defn sum-all 
  [list] (sum-all list 0) 
  [list sum] (
    if (list)
      (recur list (sum + 1))
      sum
  )
)

(defn sum-all [list]
	(reduce + list)
)

(clojure.test/is
  (and 
    (= (sum-all [1 2 3]) 6)
    (= (sum-all (list 0 -2 5 5)) 8)
    (= (sum-all #{4 2 1}) 7)
    (= (sum-all '(0 0 -1)) -1)
    (= (sum-all '(1 10 3)) 14)
    (= (sum-all '(1 10 3)) 14)
  )
)