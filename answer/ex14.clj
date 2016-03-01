; #14
; Intro to Functions 
; Difficulty:	Elementary

; Describe:
; Clojure has many different ways to create functions.

; Case:
; 1. (= __ ((fn add-five [x] (+ x 5)) 3))
; 2. (= __ ((fn [x] (+ x 5)) 3))
; 3. (= __ (#(+ % 5) 3)) 
; 4. (= __ ((partial + 5) 3))

;------------------------------------------------------------------------
;----------------------------- Code/Result ------------------------------
;------------------------------------------------------------------------

; 1. (= __ ((fn add-five [x] (+ x 5)) 3))
(= 8 ((fn add-five [x] (+ x 5)) 3))
; Result: true

; 2. (= __ ((fn [x] (+ x 5)) 3))
(= 8 ((fn [x] (+ x 5)) 3))
; Result: true

; 3. (= __ (#(+ % 5) 3))
(= 8 (#(+ % 5) 3))
; Result: true

; 4. (= __ ((partial + 5) 3))
(= 8 ((partial + 5) 3))
; Result: true

