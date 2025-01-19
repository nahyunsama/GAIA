package org.example;

public class Main {
    public static void main(String[] args) {
        MyCalculator calc1 = new MyCalculator();
        int num1 = calc1.adder(1, 2);
        System.out.println(num1);

        int num2 = MyCalculator.adder(2, 3);
        System.out.println(num2);
    }
}