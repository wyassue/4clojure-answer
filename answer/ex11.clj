; #11
; Maps: conj 
; Difficulty:	Elementary

; Describe:
; When operating on a map, the conj function returns a new map with one or more key-value pairs "added".
; test not run	

; Case:
; 1. (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))

;------------------------------------------------------------------------
;----------------------------- Code/Result ------------------------------
;------------------------------------------------------------------------

; 1. (= {:a 1, :b 2, :c 3} (conj {:a 1} __ [:c 3]))
(= {:a 1, :b 2, :c 3} (conj {:a 1} {:b 2} [:c 3]))
; Result: true

(conj {:a 1} [:b 2] [:c 3])
; Result: {:a 1,:b 2, :c 3}
