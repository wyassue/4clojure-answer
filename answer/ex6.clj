; # 6
; Intro to Vectors
; Difficulty:	Elementary

; # Describe:
; Vectors can be constructed several ways. You can compare them with lists. 
; Note: the brackets [] surrounding the blanks __ are part of the test case. test not run	
; 1.(= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))

;------------------------------------------------------------------------
;------------------------------ Code/Resul ------------------------------
;------------------------------------------------------------------------

; 1.(= [__] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
(= [:a :b :c] (list :a :b :c) (vec '(:a :b :c)) (vector :a :b :c))
; Result: true

(list :a :b :c) 
;Result: [:a :b :c]

(vec '(:a :b :c)) 
;Result: [:a :b :c]

(vector :a :b :c)
;Result: (:a :b :c)
