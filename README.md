# WAT

problem 72 from project euler


# benchmark 

``` 
    time node problem72.js
    303963552391
    0.29 real         0.27 user         0.01 sys
```

```
    time python problem72.py 
    303963152391.0
    1.54 real         1.47 user         0.06 sys
```

node is ~5 times faster than python

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
