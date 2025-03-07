package org.example;

public class Main {
    public static void main(String[] args) {
        int[] arr = makeIntArray(5);

        int sum = sumOfArray(arr);

        System.out.println(sum);
    }

    public static int[] makeIntArray(int len) {
        int[] arr = new int[len];
        for(int i=0; i < len; i++) {
            arr[i] = i;
        }
        return arr;
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for(int i=0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
}