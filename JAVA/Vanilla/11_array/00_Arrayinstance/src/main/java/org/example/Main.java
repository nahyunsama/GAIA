package org.example;
class BoxA1 { }
public class Main {
    public static void main(String[] args) {
        int[] ar1 = new int[5];
        double[] ar2 = new double[7];

        float[] ar3;
        ar3 = new float[9];

        BoxA1[] ar4 = new BoxA1[5];

        System.out.println("배열 ar1 길이: " + ar1.length);
        System.out.println("배열 ar2 길이: " + ar2.length);
        System.out.println("배열 ar3 길이: " + ar3.length);
        System.out.println("배열 ar4 길이: " + ar4.length);
    }
}