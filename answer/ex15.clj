; #15
; Double Down 
; Difficulty:	Elementary

; Describe:
; Write a function which doubles a number.

; Case:
; 1. (= (__ 2) 4)
; 2. (= (__ 3) 6)
; 3. (= (__ 11) 22)
; 4. (= (__ 7) 14)


;------------------------------------------------------------------------
;----------------------------- Code/Result ------------------------------
;------------------------------------------------------------------------

; 1. (= (__ 2) 4)
(= ((fn [x] (* x 2)) 2) 4)
; Result: true

; 2. (= (__ 3) 6)
(= ((partial * 2) 3) 6)
; Result: true

; 3. (= (__ 11) 22)
(= ((defn double-number[x] (* x 2)) 11) 22)
; Result: true

; 4. (= (__ 7) 14)
(= ((partial * 2) 7) 14)
; Result: true

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(defn double-number [n]
  (* n 2)
)

(clojure.test/is 
  (and
    (= (double-number 2)  4)
    (= (double-number 3)  6)
    (= (double-number 11) 22)
    (= (double-number 7)  14)
  )
)

