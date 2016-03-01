; #7
; Vectors: conj
; Difficulty:	Elementary

; Describe:
; When operating on a Vector, the conj function will return a new vector with one or more items "added" to the end.
; 1. (= __ (conj [1 2 3] 4))
; 2. (= __ (conj [1 2] 3 4))

;------------------------------------------------------------------------
;------------------------------ Code/Resul ------------------------------
;------------------------------------------------------------------------

; 1. (= __ (conj [1 2 3] 4))
(= [1 2 3 4] (conj [1 2 3] 4))
; Result: true

; 2. (= __ (conj [1 2] 3 4))
(= [1 2 3 4] (conj [1 2] 3 4))
; Result: true

(conj [1 2 3] 4 5 6 7 8)
;Result: [1 2 3 4 5 6 7 8]

(conj ["A" "B" "C"] "D" "E" "F")
;Result: ["A" "B" "C" "D" "E" "F"]

(conj ["A"] 1 "B" 2 "C" 3 "D" 4)
;Result: ["A" 1 "B" 2 "C" 3 "D" 4]
