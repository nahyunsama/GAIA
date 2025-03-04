package org.example;

import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StringTokenizer str1 = new StringTokenizer("a b c");
        //StringTokenizer str2 = new StringTokenizer("1,2,3",",");

        while (str1.hasMoreTokens()) { //토큰 유무 확인
            System.out.println(str1.nextToken());
        }
    }
}