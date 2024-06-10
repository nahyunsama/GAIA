package main

import "fmt"

func main() {
	var x1 int8 = 34
	var x2 int16 = 34
	var x3 uint8 = 34
	var x4 uint16 = 34

	fmt.Printf("^%d = %5d,\t %08b\n", x1, ^x1, uint8(^x1))   // 8bit int 00100010
	fmt.Printf("^%d = %5d,\t %016b\n", x2, ^x2, uint16(^x2)) // 16bit int 00000000 00100010
	fmt.Printf("^%d = %5d,\t %08b\n", x3, ^x3, ^x3)          // unsigned 8bit int 00100010
	fmt.Printf("^%d = %5d,\t %016b\n", x4, ^x4, ^x4)         // unsigned 16bit int 00000000 00100010
}
