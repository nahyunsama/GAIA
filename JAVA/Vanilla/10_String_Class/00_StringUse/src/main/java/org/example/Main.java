package org.example;

public class Main {
    public static void main(String[] args) {
        String str1 = new String("자바프로그래밍");
        String str2 = new String("자바프로그래밍");
        String str3 = "자바프로그래밍";
        String str4 = "자바프로그래밍";

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println(str1 == str2);
        System.out.println(str3 == str4);
        System.out.println(str2 == str3);
    }
}