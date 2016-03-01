; #5
; Lists: conj 
; Difficulty:	Elementary

; Describe:
; When operating on a list, the conj function will return a new list with one or more items "added" to the front.
; *Note that there are two test cases, but you are expected to supply only one answer, which will cause all the tests to pass.
; 1. (= __ (conj '(2 3 4) 1)
; 2. (= __ (conj '(3 4) 2 1))

;------------------------------------------------------------------------
;------------------------------ Code/Resul ------------------------------
;------------------------------------------------------------------------
; 1. (= __ (conj '(2 3 4) 1))
(= '(1 2 3 4) (conj '(2 3 4) 1))
;Result: true

; 2. (= __ (conj '(3 4) 2 1))
(= '(1 2 3 4) (conj '(3 4) 2 1))
;Result: true 

(conj '(2 3) 1 0)
;Result: (0 1 2 3)

(conj '(2 3 "B") 1 0 "A")
;Result: ("A" 0 1 2 3 "B")

(conj [1 2 3 4] "A" "B")
;# [1 2 3 4 "A" "B"]
