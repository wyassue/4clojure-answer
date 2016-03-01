; #8
; Intro to Sets
; Difficulty:	Elementary

; Describe: 
; Sets are collections of unique values. test not run	

; Case: 
; 1. (= __ (set '(:a :a :b :c :c :c :c :d :d)))
; 2. (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))

;------------------------------------------------------------------------
;----------------------------- Code/Result ------------------------------
;------------------------------------------------------------------------

; 1. (= __ (set '(:a :a :b :c :c :c :c :d :d)))
(= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d)))
; Result: true

; 2. (= __ (clojure.set/union #{:a :b :c} #{:b :c :d}))
(= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d}))
; Result: true

(set [1 1 2 3 4 2 3 4 1])
(clojure.set/union #{1 2 3} #{3 2 1 4})
;Result: #{1 4 3 2}

(set [1 2 3 "a" "b" "a"])
(clojure.set/union #{1 2 3} #{"a" "b" "c"})
;Result: #{1 "a" 3 2 "b"}

(set ["a" "A" "b" "B" "c" "C" "d"])
(clojure.set/union #{"a" "b" "c" "d"} #{"A" "B" "C"})
;Result: #{"d" "C" "B" "a" "b" "A" "c"}
