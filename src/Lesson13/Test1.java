package Lesson13;

public class Test1 {
}

class Student {
    int grade;

    public Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);

        switch (st1.grade) {
            case 2:
                System.out.println("Student 2");
                break;
            case 3:
                System.out.println("Student 3");
                break;
            case 4:
                System.out.println("Student 4");
                break;
            case 5:
                System.out.println("Student 5");
            default:
                System.out.println("Ocenka ne vidna");
                break;
        }
    }
}