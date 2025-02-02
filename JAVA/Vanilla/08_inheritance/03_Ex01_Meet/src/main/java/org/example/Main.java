package org.example;

interface Greet {
    void greet();
}

interface  Talk {
    void talk();
}

class Morning implements Greet, Talk {
    public void greet() {
        System.out.println("안녕하세요!");
    }

    public void talk() {
        System.out.println("날씨 좋네요.");
    }
}
public class Main {
    public static void main(String[] args) {
        Morning morning = new Morning();
        morning.greet();
        morning.talk();
    }
}