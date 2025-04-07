package org.example;
import java.util.Scanner;


public class Main {
    public static void myMethod1() {
        try {
            myMethodA();
        }
        catch(Throwable e) {
            System.out.println("에러 !!!");
        }
    }

    public static void myMethod2() {
        try {
            myMethodA();
        }
        catch (Throwable e) {
            System.out.println("Error !!");
        }
    }

    public static void myMethodA() {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt(); // 에러 발생 지점
        int num2 = 10 / num1; // 에러 발생 지점
        System.out.println(num2);
    }

    public static void main(String[] args) {
        myMethod1(); // 한글 메시지 출력
        myMethod2(); // 영문 메시지 출력
    }
}