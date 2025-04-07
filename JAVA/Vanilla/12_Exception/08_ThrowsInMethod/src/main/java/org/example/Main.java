package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void myMethod1() {
        myMethod2();
    }

    public static void myMethod2()
            throws ArithmeticException, InputMismatchException {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = 10 / num1;
        System.out.println(num2);
    }

    public static void main(String[] args) {
        try {
            myMethod1();
        } catch (ArithmeticException | InputMismatchException e){
            e.printStackTrace();
        }
        System.out.println("--------");
    }
}