package main

import "fmt"

func main() {
	i, j := 42, 2701

	//point to i
	p := &i
	//read i through the pointer
	fmt.Println(*p)
	//set i through the pointer
	*p = 21
	//see the new value of i
	fmt.Println(i)

	//point to j
	p = &j
	//divide j through the pointer
	*p = *p / 37
	//set the new value of j
	fmt.Println(j)
}
