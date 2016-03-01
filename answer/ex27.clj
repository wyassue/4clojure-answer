; #27
; Palindrome Detector 
; Difficulty:	Easy
; Topics:	seqs

; Describe:
; Write a function which returns true if the given sequence is a palindrome.
; Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)

; Case:
; (false? (__ '(1 2 3 4 5)))
; (true? (__ "racecar"))
; (true? (__ [:foo :bar :foo]))
; (true? (__ '(1 1 3 3 1 1)))
; (false? (__ '(:a :b :c)))

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(defn palindrome [sequence]
  (= sequence (reverse sequence)))
)

(clojure.test/is
  (and 
    (false? (palindrome '(1 2 3 4 5)))
    (true? (palindrome "racecar"))
    (true? (palindrome [:foo :bar :foo]))
    (true? (palindrome '(1 1 3 3 1 1)))
    (false? (palindrome '(:a :b :c)))
  )
)
