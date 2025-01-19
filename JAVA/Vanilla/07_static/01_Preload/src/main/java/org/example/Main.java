package org.example;

import java.util.Random;

public class Main {

    static int num;

    static {
        Random rand = new Random();
        // main() 실행 전에 이미 난숫값이 대입이 된다.
        num = rand.nextInt(100);
    }

    public static void main(String[] args) {
        System.out.println(num);
    }
}