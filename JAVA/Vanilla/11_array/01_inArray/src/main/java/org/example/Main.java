package org.example;

public class Main {
    public static void main(String[] args) {
        int[] ar = new int[3];

        ar[0] = 100;
        ar[1] = 90;
        ar[2] = 80;

        int sum = ar[0] + ar[1] + ar[2];
        System.out.println("총점 : " + sum);
    }
}