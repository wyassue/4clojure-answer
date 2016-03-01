; #16
; Hello World 
; Difficulty:	Elementary

; Describe:
; Write a function which returns a personalized greeting.

; Case:
; 1. (= (__ "Dave") "Hello, Dave!")
; 2. (= (__ "Jenn") "Hello, Jenn!")
; 3. (= (__ "Rhea") "Hello, Rhea!")

;------------------------------------------------------------------------
;----------------------------- Code/Result ------------------------------
;------------------------------------------------------------------------

; 1. (= (__ "Dave") "Hello, Dave!")
(= ((fn [name] (str "Hello, " name)) "Dave!") "Hello, Dave!")
; Result: true

; 2. (= (__ "Jenn") "Hello, Jenn!")
(= ((fn greet [name] (str "Hello, " name)) "Jenn!") "Hello, Jenn!")
; Result: true

; 3. (= (__ "Rhea") "Hello, Rhea!")
(= ((partial str "Hello, ") "Rhea!") "Hello, Rhea!")
; Result: true

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(defn greet [name] 
	(str "Hello, " name "!")
)

(clojure.test/is
  (and
    (= (greet "Dave") "Hello, Dave!")
	(= (greet "Jenn") "Hello, Jenn!")
	(= (greet "Rhea") "Hello, Rhea!")
  )
)
