package org.example;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("자바프로그래밍");
        String str2 = new String("자바프로그래밍");
        String str3 = "자바프로그래밍";
        String str4 = "자바프로그래밍";

        if (str1 == str2)
            System.out.println("str1과 str2는 동일 객체 참조");
        else
            System.out.println("str1과 str2는 다른 객체 참조");

        if (str3 == str4)
            System.out.println("str3과 str4는 동일 객체 참조");
        else
            System.out.println("str3과 str4는 다른 객체 참조");
    }
}