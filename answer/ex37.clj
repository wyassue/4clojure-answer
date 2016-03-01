; #37
; Regular Expressions 
; Difficulty:	Elementary
; Topics:	regex syntax

; Describe:
; Regex patterns are supported with a special reader macro.

; Case:
; 1. (= __ (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(clojure.test/is
  (and
    (= "ABC" (apply str (re-seq #"[A-Z]+" "bA1B3Ce ")))
  )
)
