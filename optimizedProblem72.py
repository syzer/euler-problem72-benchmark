def calc():
    limit = 1000000
    phi = list(range(0, limit + 1))

    out = 0
    for x in range(2, limit):
        if phi[x] == x:
            fac = (x - 1) / x
            for y in range(x, limit, x):
                phi[y] = phi[y] * fac

        out += phi[x]

    print(out)

calc()
