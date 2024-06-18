package main

import "fmt"

func main() {
	const C int = 10

	var b int = C * 20
	C = 20 // Error Const isn't left side
	fmt.Println(&C)
}
