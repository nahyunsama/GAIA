package main

import "fmt"

func add(x int, y int) int {
	return x + y
}

func main() {
	var x, y int = 42, 13
	var result int
	result = add(x, y)
	fmt.Printf("%v + %v = ", x, y)
	fmt.Printf("%v", result)
}
