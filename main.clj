(println
  (let [max (dec (Integer/parseInt (read-line)))]
      (loop [n 1
             s1 0
             s2 1]
        (if (< n max)
          (recur
            (inc n)
            s2
            (+ s1 s2))
          s2))))
