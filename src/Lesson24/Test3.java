package Lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Employee();

        System.out.println(h.a);
        h.pomosh();
        h.tushitPozhar("Voda");
        s.swim();
    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;
    void eat() { System.out.println("Kushat"); }
    void sleep() { System.out.println("Spat"); }
}

class Uchitel extends Employee implements Help_able{
    int kolvoUchenikov;
    void uchit() { System.out.println("Uchit'"); }
    public void pomosh(){
        System.out.println("Uchitel okaz. pomosh");
    };
    public void tushitPozhar(String s){
        System.out.println("Uchitel tushit pozhar s pomowiu " + s);
    };
}

class Driver extends Employee implements Help_able, Swim_able{
    String nazvanieMAchiny;
    void vodit() { System.out.println("Vodit'"); }
    public void pomosh(){
        System.out.println("Driver okaz. pomosh");
        System.out.println(a);
    };
    public void tushitPozhar(String s){
        System.out.println("Driver tushit pozhar s pomowiu " + s);
    };
    public void swim(){
        System.out.println("Driver mozhet plavat'");
    };
}

interface Help_able {

    void pomosh();
    void tushitPozhar(String predmet);
    public final static int a = 10;
}
interface Swim_able{
    void swim();
}