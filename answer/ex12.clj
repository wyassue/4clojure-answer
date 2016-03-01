; #12
; Intro to Sequences 
; Difficulty:	Elementary

; Describe:
; All Clojure collections support sequencing. You can operate on sequences with functions like first, second, and last.

; Case:
; 1. (= __ (first '(3 2 1)))
; 2. (= __ (second [2 3 4]))
; 3. (= __ (last (list 1 2 3)))

;------------------------------------------------------------------------
;----------------------------- Code/Result ------------------------------
;------------------------------------------------------------------------

; 1. (= __ (first '(3 2 1)))
(= 3 (first '(3 2 1)))
; Result: true

; 2. (= __ (second [2 3 4]))
(= 3 (second [2 3 4]))
; Result: true

; 3. (= __ (last (list 1 2 3)))
(= 3 (last (list 1 2 3)))
; Result: true

(first [1 2 3 4 5])
;Result: 1

(second [1 2 3 4 5])
;Result: 2

(last [1 2 3 4 5])
;Result: 5

(first [[1 2] [3 4] [5 6] [7 8] [9 10]])
;Result: [1 2]

(second [[1 2] [3 4] [5 6] [7 8] [9 10]])
;Result: [3 4]

(last [[1 2] [3 4] [5 6] [7 8] [9 10]])
;Result: [9 10]
