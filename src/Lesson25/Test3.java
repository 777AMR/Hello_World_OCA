package Lesson25;

public class Test3 {
    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();

        Employee[] array = {emp1, emp2, emp3, emp4};
        for (Employee e :array){
            if (e instanceof Driver){
                System.out.println(((Driver) e).nazvanieMAchiny);
                ((Driver) e).vodit();
            }
        }
    }
}

class Employee extends java.lang.Object{
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void eat(){ System.out.println("Kushat"); }
    void sleep(){ System.out.println("Spat"); }
}

class Doctor extends Employee implements Hepl_able{
    String specializacya = "Hirurg";
    public void help(){System.out.println("Doctor okaz pomosh");}
    void lechit(){ System.out.println("Lechit'"); }
}

class Teacher extends Employee{
    int kolvoUchenikov;
    void uchit(){ System.out.println("Uchit'"); }
}

class Driver extends Employee{
    String nazvanieMAchiny = "Mercedes";
    void vodit(){ System.out.println("Vodit'"); }
}

interface Hepl_able{
    void help();
}