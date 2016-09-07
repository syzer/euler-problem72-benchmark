package main

import "fmt"

func main() {
	fmt.Print(calc())
}

func calc() int {
	const limit = 1000000
	phi := make([]int, limit + 1)
	for i := range phi {
		phi[i] = i
	}

	out := 0
	var i int
	var j int
	var fac float32
	for i = 2; i <= limit; i++ {
		if (phi[i] == i) {
			fac = (float32(i) - 1.0) / float32(i)
			for j = i; j <= limit; j += i {
				phi[j] = int(float32(phi[j]) * fac)
			}
		}
		out += phi[i]
	}

	return out

}

