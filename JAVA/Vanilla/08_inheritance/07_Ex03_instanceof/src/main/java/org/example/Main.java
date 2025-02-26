package org.example;

interface Cry {
    void cry();
}

class Cat implements Cry {
    public void cry() {
        System.out.println("야옹~");
    }
}

class Dog implements Cry {
    public void cry() {
        System.out.println("멍멍!");
    }
}

public class Main {
    public static void main(String[] args) {
        Cry test1 = new Cat();
        // Cry test1 = new Dog();

        if (test1 instanceof Cat) {
            test1.cry();
        }
        else if (test1 instanceof Dog) {
            System.out.println("고양이 아닙니다.");
        }
    }
}