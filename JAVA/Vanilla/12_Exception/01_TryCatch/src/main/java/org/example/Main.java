package org.example;
import java.util.Scanner;
import java.util.InputMismatchException;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int num1 = sc.nextInt();
            int num2 = 10 / num1;
            System.out.println(num2);
            System.out.println("Good bye~~!");
        }
        catch(ArithmeticException e) {
            String str = e.getMessage();
            System.out.println(str);
            if (str.equals("/ by zero"));
                System.out.println("0 으로 나눌 수 없습니다.");
        }
        catch(InputMismatchException e) {
            System.out.println(e.getMessage());
            //e.printStackTrace();
        }
    }
}