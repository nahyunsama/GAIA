public class consoleout {
    public static void main(String[] args) {
        String name = "Hong Gil Dong";
        int age = 20;
        double height = 175.5;

        System.out.printf("%s의 나이는 %d이고, 키는 %f 입니다.\n", name, age, height);
        System.out.printf("%s의 나이는 %d이고, 키는 %.2f 입니다.\n", name, age, height);
    }
}
