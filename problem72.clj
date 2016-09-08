(defn sieve-multiple [sieve ^long current-index ^long until]
  (let [^double current-number (get sieve current-index)]
    (if (= current-number (double current-index))
      (reduce (fn [result index]
                (let [^double number (get sieve index)]
                  (assoc! sieve index 
                          ^double (- number (/ number current-number))))) 
              sieve (range current-index until current-index))
      sieve)))

(defn multiple-sieve [^long until]
  (let [sieve (range 2 (inc until))]
    (reduce + 0 (persistent!
                 (reduce (fn [result index]
                           (sieve-multiple result index (inc until)))
                         (transient (into [0.0 0.0] (map double sieve))) 
                         sieve)))))

(time (multiple-sieve 1000000))
