const max = 1000000

const calcFaster = () => {
    // by using native arrays, the memory is allocated continuously and index lookup is much faster
    const phi = new Int32Array(max + 1)
    let out = 0
    let i, j, fac

    // use for loops, their usually faster than .map
    for (i = 0; i <= max; i++) {
        phi[i] = i
    }

    for (i = 2; i <= max; i++) {
        if (phi[i] == i) {
            // precalculate factor outside inner loop, division is the most expensive operation
            fac = (i - 1) / i
            for (j = i; j <= max; j += i) {
                phi[j] = phi[j] * fac
            }
        }
        out += phi[i]
    }
    return out
}

console.log(calcFaster())

