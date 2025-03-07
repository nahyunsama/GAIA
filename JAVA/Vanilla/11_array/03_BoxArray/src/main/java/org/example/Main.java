package org.example;

class BoxA4 {
    public String name;

    BoxA4(String name) {
        this.name=name;
    }
}
public class Main {
    public static void main(String[] args) {
        BoxA4[] ar = new BoxA4[3];

        ar[0] = new BoxA4("홍길동");
        ar[1] = new BoxA4("전우치");
        ar[2] = new BoxA4("손오공");

        System.out.println(ar[0].name);
        System.out.println(ar[1].name);
        System.out.println(ar[2].name);
    }
}