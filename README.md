# WAT

problem 72 from project euler


# benchmark 

#### python
```
    time python problem72.py 
    303963152391.0
    1.54 real         1.47 user         0.06 sys
```

#### node

``` 
    time node problem72.js
    303963552391
    0.29 real         0.27 user         0.01 sys
```

node is ~5 times faster than python

```
    time go run problem72.go 
    303963552391        
    0.20 real         0.19 user         0.07 sys
```

where optimized node (thanks munxar!) runs even faster:

```
    time node problem72.js
    303963630889
    0.16 real         0.14 user         0.01 sys
```
but gives wrong answer :(


#### golang

go compiles and runs ~50% faster than node

```
    go build problem72.go 
    time ./problem72 
    303963552391        
    0.05 real         0.07 user         0.01 sys
```
compiled golang is ~ 5 - 6 faster than `node`


#### c

run c code
```
    make problem72
    time ./problem72
    303963552391
    real    0m0.043s
    user    0m0.049s
    sys     0m0.016s
```
as expected equal to c code


#### php

```
    time php problem72.php 
    303963552391        
    1.08 real         1.01 user         0.06 sys
```

well... still faster than python :)
