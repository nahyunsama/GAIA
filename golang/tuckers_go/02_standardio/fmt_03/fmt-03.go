package main

import "fmt"

func main() {
	str := "Hello\tGo\t\tWolrd\n\"Go\"is awesome!\n"

	fmt.Print(str)
	fmt.Printf("%s", str)
	fmt.Printf("%q", str)
}
