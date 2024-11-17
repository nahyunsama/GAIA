class Book {
    String title;
    int price;
    int num = 0;

    //Default Constructor
    Book() {
        title = "자바 프로그래밍";
        price = 30000;
    }

    //Constructor Overloading
    Book(String t, int p) {
        title = t;
        price = p;
    }

    void print() {
        System.out.println("제   목 : " + title);
        System.out.println("가   격 : " + price);
        System.out.println("주문수량 : " + num);
        System.out.println("합계금액 : " + price * num);
    }
}

public class ConstructorUse {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.print();

        Book book2 = new Book("자바 디자인 패턴", 35000);
        book2.num = 10;
        book2.print();
    }
}
