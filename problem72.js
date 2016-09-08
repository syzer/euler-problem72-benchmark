const max = 1000000

const calc = () => {
    // arrays are slower, especially the index lookup of an element
    const phi = Array.from({length: max + 1}, (v, i) => i)
    let out = 0

    for (let i = 2; i <= max; i++) {
        if (phi[i] === i) {
            for (let j = i; j <= max; j += i) {
                phi[j] = phi[j] / i * (i - 1)
            }
        }
        out += phi[i]
    }
    return out
}

console.log(calc())

