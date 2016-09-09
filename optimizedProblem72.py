def calc():
    limit = 1000000
    phi = list(range(0, limit + 1))

    out = 0
    for x in range(2, limit):
        if phi[x] == x:
            y = x
            fac = (x - 1) / x
            while y < limit:
                phi[y] = phi[y] * fac
                y += x

        out += phi[x]

    return out

print(calc())
