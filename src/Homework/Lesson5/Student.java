package Homework.Lesson4;

public class Student {
    int id;
    String name;
    String firstName;
    double ocenkaMath;
    double ocenkaEcon;
    double ocenkaIn;
}

class StudentTest{
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Nikolay";
        student1.firstName = "Dobrov";
        student1.ocenkaMath = 4.7;
        student1.ocenkaEcon = 4.3;
        student1.ocenkaIn = 4.0;

        System.out.println(student1.name + " " + student1.firstName + " : " +
                (student1.ocenkaMath + student1.ocenkaEcon + student1.ocenkaIn )/ 3);

        Student student2 = new Student();
        student2.id = 2;
        student2.name = "Denis";
        student2.firstName = "Ivanov";
        student2.ocenkaMath = 4.0;
        student2.ocenkaEcon = 3.3;
        student2.ocenkaIn = 5.0;

        System.out.println(student2.name + " " + student2.firstName + " : " +
                (student2.ocenkaMath + student2.ocenkaEcon + student2.ocenkaIn )/ 3);

        Student student3 = new Student();
        student3.id = 3;
        student3.name = "Ivan";
        student3.firstName = "Sobolev";
        student3.ocenkaMath = 5.0;
        student3.ocenkaEcon = 4.4;
        student3.ocenkaIn = 2.0;

        System.out.println(student3.name + " " + student3.firstName + " : "+
                (student3.ocenkaMath + student3.ocenkaEcon + student3.ocenkaIn )/ 3);
    }
}
