; #22
; Count a Sequence 
; Difficulty:	Easy
; Topics:	seqs core-functions

; Describe:
; Write a function which returns the total number of elements in a sequence.

; Special Restrictions: count

; Case:
; 1. (= (__ '(1 2 3 3 1)) 5)
; 2. (= (__ "Hello World") 11)
; 3. (= (__ [[1 2] [3 4] [5 6]]) 3)
; 4. (= (__ '(13)) 1)
; 5. (= (__ '(:a :b :c)) 3)

;------------------------------------------------------------------------
;-------------------------------- Test ----------------------------------
;------------------------------------------------------------------------

(defn count-list 
  ([list] (count-list list 1))
  ([[first_l & rest_l] count]
    (if(= rest_l nil)
      count
      (recur rest_l (inc count))
    )
  )
)

(defn count-seq [xs]
  (reduce (fn [sum _] (inc sum)) 0 xs))

#(reduce + (map (fn [x] 1) %))


(clojure.test/is
  (and
    (= (count-list '(1 2 3 3 1)) 5)
    (= (count-list "Hello World") 11)
    (= (count-list [[1 2] [3 4] [5 6]]) 3)
    (= (count-list '(13)) 1)
    (= (count-list '(:a :b :c)) 3)
  )
)
