package Lesson9;

public class Student {
    public static int c = 5;
    public int z = this.c;
}

class StudentTest {
    public static void main(String[] args) {

        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();
        Student st6 = new Student();
        Student st7 = new Student();
        Student st8 = new Student();

        st1 = null;
        st2 = null;
        st3 = null;
        st4 = null;
        st5 = null;
        st6 = null;
    }
}