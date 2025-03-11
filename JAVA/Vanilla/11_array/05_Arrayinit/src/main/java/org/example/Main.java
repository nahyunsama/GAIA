package org.example;

class BoxA6 { }

public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[] {1, 2, 3};
        double[] arr3 = {1.0, 2.0, 3.0};
        double[] arr4 = new double[3];
        BoxA6[] arr5 = new BoxA6[3];

        for (int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i] + " ");
            System.out.println(arr2[i] + " ");
            System.out.println(arr3[i] + " ");
            System.out.println(arr4[i] + " ");
            System.out.println(arr5[i] + " ");
            System.out.println(i + " Done!");
        }
    }
}