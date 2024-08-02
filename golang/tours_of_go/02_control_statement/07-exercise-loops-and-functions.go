package main

import (
	"fmt"
	"math"
)

func Sqrt(x float64) float64 {
	z := float64(1)
	// z:= float64(x * x)
	for i := 0; i < 50; i++ {
		z -= (z*z - x) / (2 * z)
		//fmt.Println(z)
	}
	return z
}

func main() {
	fmt.Println(Sqrt(2))
	fmt.Println(math.Sqrt(2))
}
