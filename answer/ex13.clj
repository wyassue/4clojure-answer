; #13
; Sequences: rest 
; Difficulty:	Elementary

; Describe: 
; The rest function will return all the items of a sequence except the first.
; test not run	

; Case:
; 1. (= __ (rest [10 20 30 40]))

;------------------------------------------------------------------------
;----------------------------- Code/Result ------------------------------
;------------------------------------------------------------------------

; 1. (= __ (rest [10 20 30 40]))
(= [20 30 40] (rest [10 20 30 40]))
;Result: true

(rest [10 20 30 40])
;Result: (20 30 40)

(rest [[1 2] [3 4] [5 6] [7 8] [9 10]])
; Result: ([3 4] [5 6] [7 8] [9 10])
