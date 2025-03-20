package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 4};
        double[] arr2 = {4.4, 3.3, 2.2, 1.1};
        String[] arr3 = {"홍길동", "전우치", "손오공", "멀린"};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);

        for(int n : arr1)
            System.out.println(n + "\t");
        System.out.println();

        for(double d : arr2)
            System.out.println(d + "\t");
        System.out.println();

        for(String s : arr3)
            System.out.println(s + "\t");
        System.out.println();
    }
}