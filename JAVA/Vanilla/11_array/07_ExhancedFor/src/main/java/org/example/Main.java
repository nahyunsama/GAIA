package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int e: arr) {
            System.out.println(e + " ");
        }
        System.out.println();

        int sum = 0;

        for(int e: arr) {
            sum = sum + e;
        }
        System.out.println("sum: " + sum);
    }
}