; #17
; Sequences: map 
; Difficulty:	Elementary

; Describe:
; The map function takes two arguments: a function (f) and a sequence (s). Map returns a new sequence consisting of the result of applying f to each item of s. Do not confuse the map function with the map data structure.

; Case:
; 1. (= __ (map #(+ % 5) '(1 2 3)))

;------------------------------------------------------------------------
;----------------------------- Code/Result ------------------------------
;------------------------------------------------------------------------

; 1. (= __ (map #(+ % 5) '(1 2 3)))
(= '( 6 7 8) (map #(+ % 5) '(1 2 3)))
