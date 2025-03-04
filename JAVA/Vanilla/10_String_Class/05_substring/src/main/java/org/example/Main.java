package org.example;

public class Main {
    public static void main(String[] args) {
        String str1 = "AppleBananaOrange";
        int num1 = str1.indexOf("Banana");
        int num2 = str1.indexOf("Orange");

        String str2 = str1.substring(num1, num2); // 구간 반환
        System.out.println(str2);

        String str3 = str1.substring(num2); // 특정 위치 이후 반환
        System.out.println(str3);
    }
}