package main

import "fmt"

func main() {
	var a int16 = 3456
	var c int8 = int8(a)

	fmt.Println(a)
	fmt.Println(c)
}

// int 16 to int 8, erase upper 1 byte
