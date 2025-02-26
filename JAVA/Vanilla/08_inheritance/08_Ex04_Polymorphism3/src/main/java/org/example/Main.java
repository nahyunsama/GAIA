package org.example;

abstract class Animal {
    abstract void doMove();
}

class Tiger extends Animal {
    void doMove() {
        System.out.println("호랑이는 산을 달립니다.");
    }
}

class Lion extends Animal {
    void doMove() {
        System.out.println("사자는 평원을 달립니다.");
    }
}
public class Main {
    public static void animalChoose(Animal obj) {
        if (obj instanceof Tiger) {
            Tiger tiger = (Tiger)obj;
            tiger.doMove();
        } else {
            Lion lion =(Lion)obj;
            lion.doMove();
        }
    }
    public static void main(String[] args) {
    Tiger tiger = new Tiger();
    animalChoose(tiger);

    Lion lion = new Lion();
    animalChoose(lion);

    }
}