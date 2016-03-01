#36
Let it Be 
Difficulty:	Elementary
Topics:	math syntax

Describe:
Can you bind x, y, and z so that these are all true?

Case:
1. (= 10 (let __ (+ x y)))
2. (= 4 (let __ (+ y z)))
3. (= 1 (let __ z))

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(clojure.test/is
  (and
    (= 10 (let [z 1 y 3 x 7] (+ x y)))
    (= 4 (let [z 1 y 3 x 7] (+ y z)))
    (= 1 (let [z 1 y 3 x 7] z))
  )
)
