package org.example;

public class Main {
    public static void myMethod1(int n) {
        myMethod2(n, 0);
    }
    public static void myMethod2(int n1, int n2) {
        int r = n1 / n2;
    }
    public static void main(String[] args) {
        myMethod1(3);
        System.out.println("Exception Throw !!!");
    }
}