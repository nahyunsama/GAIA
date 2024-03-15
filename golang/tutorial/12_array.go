package main

import "fmt"

func main() {
	var a [2]string
	a[0] = "Hello"
	a[1] = "world"
	//a[2] = "Hello world"
	fmt.Println(a[0], a[1])
	fmt.Println(a)

	prime := [6]int{2, 3, 5, 7, 11, 13}
	fmt.Println(prime)
}
