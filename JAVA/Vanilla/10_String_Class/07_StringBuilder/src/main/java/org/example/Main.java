package org.example;

public class Main {
    public static void main(String[] args) {
        StringBuilder buf = new StringBuilder("동해물과");

        buf.append("백두산이");
        System.out.println(buf.toString());

        buf.append("12345");
        System.out.println(buf.toString());

        buf.delete(0, 4);
        System.out.println(buf.toString());

        buf.replace(4, 8, "ABC");
        System.out.println(buf.toString());

        buf.reverse();
        System.out.println(buf.toString());
    }
}