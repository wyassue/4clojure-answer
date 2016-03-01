; #4
; Intro to Lists 
; Difficulty:	Elementary

; Describe:
; Lists can be constructed with either a function or a quoted form.
; 1. (= (list __) '(:a :b :c))

;------------------------------------------------------------------------
;------------------------------ Code/Resul ------------------------------
;------------------------------------------------------------------------

; 1. (= (list __) '(:a :b :c))
(= (list :a :b :c) '(:a :b :c))
;Result: true

(list :a :b :c) 
;Result: [:a :b :c]

'(:a :b :c)
;Result: [:a :b :c]
