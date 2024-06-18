package main

import "fmt"

const PI = 3.14
const FloatPI float64 = 3.14

const (
	BitFlag1 uint = 1 << iota // 1 = 1 << 0
	BitFlag2                  // 2 = 1 << 1
	BitFlag3                  // 4 = 1 << 2
	BitFlag4                  // 8 = 1 << 3
)

func main() {
	var a int = PI * 100
	//var b int = FloatPI * 100

	fmt.Println(a)
	//fmt.Println(b)
	fmt.Println(BitFlag4)
}
