package Lesson12;

import Lesson11.Student;

public class Test10 {

    void sravnenie(Student s1, Student s2) {
        if (s1 == s2) {
            System.out.println("Ssilki odinakovy");
        } else {
            System.out.println("Ssilki raznye");
        }
        if (s1.equals(s2)) {
            System.out.println("Studenty odinakovy\n");
        } else {
            System.out.println("Studenty raznye\n");
        }
    }

    void sravnenieArg(Student s1, Student s2) {
        if (s1.name.equals(s2.name)) {
            System.out.println("imya odinakovy");
        } else {
            System.out.println("imya raznye");
        }
        if (s1.course == s2.course) {
            System.out.println("kurs odinakovy");
        } else {
            System.out.println("kurs raznye");
        }
        if (s1.grade == s2.grade) {
            System.out.println("ocenka odinakovy");
        } else {
            System.out.println("ocenka raznye");
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ivan", 2, 3);
        Student student2 = new Student("Ivan", 2, 3.1);
        Test10 test10 = new Test10();
        test10.sravnenie(student1, student2);
        test10.sravnenieArg(student1, student2);
    }
}
