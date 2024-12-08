package org.example;

class Cat {
    static int a = 5;
    int num = 3;

    void printValue(int num) {
        this.num = num;
        System.out.println("num : " + this.num);
        System.out.println("a : " + a);
    }
}
public class Main {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 2;
        System.out.println(num1 + ", " + num2);

        Cat cat1 = new Cat();
        cat1.num = 1;
        cat1.a = 10;
        cat1.printValue(20);
        System.out.println(cat1.num);
        System.out.println(cat1.a);

        Cat cat2 = new Cat();
        cat2.num = 2;
        cat2.a = 11;
        cat2.printValue(10);
        System.out.println(cat2.num);
        System.out.println(cat2.a);
        System.out.println(cat1.a);
    }
}