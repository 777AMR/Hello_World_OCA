package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Teacher t = new Teacher();
//        t.sleep();
        Employee e = new Teacher();
        e.sleep();
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";

    final public Eda eat() {
        System.out.println("Kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

    final static void sleep() {
        System.out.println("Spit rabotnik");
    }
}

class Eda {
}

class Frukti extends Eda {
}

class Teacher extends Employee {
    /*@Override
    public Eda eat() {
        System.out.println("Kushaet uchitel");
        Frukti f = new Frukti();
        return f;
    }*/


    int kolvoUchenikov;

    void uchit() {
        System.out.println("Uchit'");
    }

//    static void sleep() {
//        System.out.println("Spit uchitel");
//    }
}
