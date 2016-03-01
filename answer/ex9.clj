; #9
; Sets: conj
; Difficulty:	Elementary

; Describe:
; When operating on a set, the conj function returns a new set with one or more keys "added".

; Case:
; = #{1 2 3 4} (conj #{1 4 3} __))

;------------------------------------------------------------------------
;----------------------------- Code/Result ------------------------------
;------------------------------------------------------------------------

; = #{1 2 3 4} (conj #{1 4 3} __))
(= #{1 2 3 4} (conj #{1 4 3} 2))
; Result: true

(= #{1 3 "A" 2} (set (conj [1 2 1] 3 "A" 2 )))
; Result: true
