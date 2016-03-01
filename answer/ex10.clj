; #10
; Intro to Maps
; Difficulty:	Elementary

; Describe:
; Maps store key-value pairs. Both maps and keywords can be used as lookup functions. Commas can be used to make maps more readable, but they are not required.

; Case:
; 1. (= __ ((hash-map :a 10, :b 20, :c 30) :b))
; 2. (= __ (:b {:a 10, :b 20, :c 30}))

;------------------------------------------------------------------------
;----------------------------- Code/Result ------------------------------
;------------------------------------------------------------------------

; 1. (= __ ((hash-map :a 10, :b 20, :c 30) :b))
(= 20 ((hash-map :a 10, :b 20, :c 30) :b))

; 2. (= __ (:b {:a 10, :b 20, :c 30}))
(= 20 (:b {:a 10, :b 20, :c 30}))
;Result: true


({1 10, 2 20, 3 30} 2)
; Result: 20

((hash-map "a" 10, "b" 20, "c" 30) "b")
;Result: 20

({"key1" 10,"key2" 20,"key3" 30} "key2")
; Result: 20
