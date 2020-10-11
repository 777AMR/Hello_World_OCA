package Homework.Lesson6;

public class Student {
    public Student(int studentId2, String name2, String surname2, int course2, double mathAverageGrade2,
                   double economicsAverage2, double foreignLanguageAverageGrade2) {
        studentId = studentId2;
        name = name2;
        surname = surname2;
        course = course2;
        mathAverageGrade = mathAverageGrade2;
        economicsAverage = economicsAverage2;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade2;
    }

    Student(int studentId3, String name3, String surname3, int course3) {
        this(studentId3, name3, surname3, course3, 0, 0, 0);
    }

    public Student() {
    }

    int studentId;
    String name;
    String surname;
    int course;
    double mathAverageGrade;
    double economicsAverage;
    double foreignLanguageAverageGrade;

    static class StudentTest{

        double sredArifmOcenka(Student st){
        double sredOcenka = (st.mathAverageGrade + st.economicsAverage + st.foreignLanguageAverageGrade) / 3;
            System.out.println("Srednyaya Arifmeticheskaya Ocenka Studenta " + st.name + " " + st.surname + ": " + sredOcenka);
            return sredOcenka;
        }

        public static void main(String[] args) {
            Student st1 = new Student();
            st1.studentId = 1;
            st1.name = "Nikolay";
            st1.surname = "Ivanov";
            st1.course = 3;
            st1.mathAverageGrade = 7.8;
            st1.economicsAverage = 9.2;
            st1.foreignLanguageAverageGrade = 8.8;

            Student st2 = new Student(2, "Alexey", "Petrov", 1);
            st2.mathAverageGrade = 6.3;
            st2.economicsAverage = 7;
            st2.foreignLanguageAverageGrade = 8.5;

            Student st3 = new Student(3, "Anton", "Sidorov", 4, 9.1, 9, 10);

            StudentTest sTest = new StudentTest();
            sTest.sredArifmOcenka(st1);
            sTest.sredArifmOcenka(st2);
            sTest.sredArifmOcenka(st3);
        }

    }

}


