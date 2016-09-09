from __future__ import division

try:
    xrange
except NameError:
    xrange = range

def calc():
    limit = 1000000
    phi = list(xrange(0, limit + 1))

    out = 0
    for x in xrange(2, limit):
        if phi[x] == x:
            fac = (x - 1) / x
            for y in xrange(x, limit, x):
                phi[y] = phi[y] * fac

        out += phi[x]

    print(out)

calc()
