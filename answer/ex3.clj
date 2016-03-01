; #3
; Intro to Strings
; Difficulty:	Elementary

; Describe: 
; Clojure strings are Java strings. This means that you can use any of the Java string methods on Clojure strings.
; test not run	
; 1. (= __ (.toUpperCase "hello world"))

;------------------------------------------------------------------------
;------------------------------ Code/Resul ------------------------------
;------------------------------------------------------------------------

(= "HELLO WORLD" (.toUpperCase "hello world"))
; Result: true

(.toUpperCase "hello world")
;Result: "HELLO WORLD"

(.toUpperCase "test123")
;Result: "TEST123"
