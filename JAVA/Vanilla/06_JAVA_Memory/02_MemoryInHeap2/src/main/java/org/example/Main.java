package org.example;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.num = 10;

        Book book2 = book1;

        System.out.println("book1.num : " + book1.num);
        System.out.println("book2.num : " + book2.num);
        System.out.println("------------------------");

        book2.num = 20;

        System.out.println("book1.num : " + book1.num);
        System.out.println("book2.num : " + book2.num);
    }
}