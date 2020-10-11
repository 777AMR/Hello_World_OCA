package Lesson8;

public class Student {
    static double umnozhenie(double a, double b, double c){
        return a * b * c;

    }
    static void delenie(int d, int e){
        System.out.println("Delenie: " + d / e);
        System.out.println("Ostatok: " + d % e);
    }
}

class StudentTest{
    public static void main(String[] args) {
        System.out.println(Student.umnozhenie(2, 3, 4));
        Student.delenie(9, 2);
        System.out.println(Student.umnozhenie(2.5, 3.5, 4));
        Student.delenie(15, 4);
    }
}


