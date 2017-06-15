# WAT

[![Greenkeeper badge](https://badges.greenkeeper.io/syzer/euler-problem72-benchmark.svg)](https://greenkeeper.io/)

problem 72 from project euler


# benchmark 


## python
```
    time python problem72.py 
    303963152391.0
    1.54 real         1.47 user         0.06 sys
```

optimized python (thanks krtek4!)
 
it is head-to-head with php:

```
    time python optimizedProblem72.py 
    303963152391.0
    1.07 real         1.00 user         0.06 sys
```


## pypy

Pypy make python really fly... faster than `node.js` !
```
    time pypy problem72.py
    303963152391
    0.14 real         0.10 user         0.03 sys
```

## node

```
    time node problem72.js
    303963552391
    0.29 real         0.27 user         0.01 sys
```

node is ~5 times faster than python

where optimized node (thanks munxar!) runs even faster:

```
    time node optimizedProblem72.js
    303963552391
    0.16 real         0.14 user         0.01 sys
```


## golang

```
    time go run problem72.go 
    303963552391        
    0.20 real         0.19 user         0.07 sys
```

go compiles and runs ~50% faster than node

```
    go build problem72.go 
    time ./problem72 
    303963552391        
    0.05 real         0.07 user         0.01 sys
```
compiled golang is ~ 5 - 6 faster than `node`

thanks (thanks munxar!)

```
    time go run optimizedProblem72.go
    303963552391        0.18 real         0.13 user         0.07 sys
```

compiled optimized go 
```
    time ./optimizedProblem72
    303963552391        0.02 real         0.02 user         0.00 sys
```


## c

run c code
```
    make problem72
    time ./problem72
    303963552391
    real    0m0.023s
    user    0m0.019s
    sys     0m0.006s
```
as expected equal to c code


## php

```
    time php problem72.php
    303963552391
    1.08 real         1.01 user         0.06 sys
```

well... still faster than python :)


## clojure

Thanks fterrier !

```
    lein repl
    > (load-file "problem72.clj")
```

or

```
    time lein problem72.clj
    1.47 real         4.16 user         0.21 sys
```
(when it is not compiled to java)

Most elegant solution so far.


## java

Thanks fanderegg !
Not bad... almost as fast as node.js

```
    javac Problem72.java
    time java Problem72
    0.26 real         0.39 user         0.06 sys
```

Optimized java version is a bit faster

Thanks ollin ! 

```
    javac OptimizedProblem72.java 
    time java OptimizedProblem72
    0.24 real         0.36 user         0.05 sys
```

It really requires to run as daemon or server to run faster

## haskell

Thanks fterrier !
Compiling and linking takes 4s... way longer than golang

```
    ghc -o ./problem72 problem72.hs
    time ./problem72
    3.06 real         2.84 user         0.20 sys
```


optimized
```
    ghc -o ./problem72 -O2 problem72.hs
    time ./problem72 
    0.42 real         0.33 user         0.07 sys
```

Haskell was over twice faster than php, and over 3 times faster than python.
