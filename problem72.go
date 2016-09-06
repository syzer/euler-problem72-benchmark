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
	for i = 2; i <= limit; i++ {
		if (phi[i] == i) {
			for j = i; j <= limit; j += i {
				phi[j] = phi[j] / i * (i - 1)
			}
		}
		out += phi[i]
	}

	return out

}

