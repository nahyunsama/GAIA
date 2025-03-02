package org.example;
import com.company.area.*;
import com.company.circumference.*;

public class Main {
    public static void main(String[] args) {
        com.company.area.Circle c1 = new com.company.area.Circle(3.5);
        //are.Circle c1 = new area.Circle(3.5) // Error
        System.out.println("반지름 3.5 원 넓이: " + c1.getArea());

        com.company.circumference.Circle c2 = new com.company.circumference.Circle(3.5);
        //circumference.Circle c2 = new circumference.Circle(3.5) // Error
        System.out.println("반지름 3.5 원 둘레: " + c2.getCircumference());
    }
}