package Lesson22;

public class Test3 {
    void uvelichZP(Employee e){
        e.salary = e.salary + 100;
    }
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name = "Ivan";
        doctor.age = 50;
        doctor.experience = 25;
        //doctor.spec = "Hirurg";
        doctor.eat();
        doctor.sleep();
        doctor.lechit();
    }
}

class Employee extends java.lang.Object{
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat(){ System.out.println("Kushat"); }
    void sleep(){ System.out.println("Spat"); }
}

class Doctor extends Employee{
    void lechit(){ System.out.println("Lechit'"); }
}

class Hirurg extends Doctor{
    String scalpel;
    void operaciya(){
    }
}
class Dantist extends Doctor{

}













class Uchitel extends Employee{
    int kolvoUchenikov;
    void uchit(){ System.out.println("Uchit'"); }
}

class Drivet extends Employee{
    String nazvanieMAchiny;
    void vodit(){ System.out.println("Vodit'"); }
}