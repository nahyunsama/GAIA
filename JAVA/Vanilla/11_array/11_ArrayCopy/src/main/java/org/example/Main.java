package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[8];

        // 배열 arr1을 3으로 초기화
        Arrays.fill(arr1, 3);

        System.arraycopy(arr1, 0, arr2, 3, 4);

        for(int i=0; i<arr1.length; i++)
            System.out.println(arr1[i] + " ");
        System.out.println();

        for(int i=0; i<arr2.length; i++)
            System.out.println(arr2[i] + " ");
        System.out.println();

        int[] arr3 = Arrays.copyOfRange(arr2, 2, 5);

        for(int i=0; i<arr3.length; i++)
            System.out.println(arr3[i] + " ");
        System.out.println();



    }
}