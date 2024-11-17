class Student1 {
    String name;
    int age;
}

class Student2 {
    public String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() { //Getter
        return age;
    }

    public void setAge(int age) { //Setter
        if (age < 0 || age > 150) {
            System.out.println("나이가 부적절합니다.");
            this.age = 0;
            return;
        }
        this.age = age;
    }
}

public class PrivateUse {
    public static void main(String[] args) {
        Student1 student1 = new Student1();
        student1.name = "홍길동";
        student1.age = -20;
        System.out.printf("%s의 나이는 %d살입니다.\n", student1.name, student1.age);

        Student2 student2 = new Student2("전우치", 20);
        student2.name = "손오공";
        student2.setAge(-10);
        int age = student2.getAge();
        System.out.printf("%s의 나이는 %d살입니다.\n", student2.name, age);
    }
}
