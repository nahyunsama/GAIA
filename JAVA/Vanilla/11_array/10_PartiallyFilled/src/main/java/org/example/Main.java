package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {11},
                {22, 33},
                {44, 55, 56}
        };

        // 배열의 구조대로 출력
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}