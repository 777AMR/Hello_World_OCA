package Lesson29;

import java.util.ArrayList;
import java.util.function.*;

public class Employee {
    String name;
    String departament;
    int salary;

    public Employee(String name, String departament, int salary) {
        this.name = name;
        this.departament = departament;
        this.salary = salary;
    }
}

class TestEmployee {
    void printEmployee(Employee e) {
        System.out.println("Employee name: " + e.name + ", departament: " + e.departament + ", salary: " + e.salary);
    }
    void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> t){
        for (Employee s : aL) {
            if (t.test(s)) {
                printEmployee(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee ar1 = new Employee("Ivan", "IT", 4000);
        Employee ar2 = new Employee( "Petr", "IT", 4200);
        Employee ar3 = new Employee("Nastya", "IT", 3700);
        Employee ar4 = new Employee("Roman", "IT", 4150);
        Employee ar5 = new Employee("Evgeniy", "IT", 5200);
        list.add(ar1);
        list.add(ar2);
        list.add(ar3);
        list.add(ar4);
        list.add(ar5);
        TestEmployee ti = new TestEmployee();
        ti.filtraciyaRabotnikov(list, x -> x.departament.equals("IT") && x.salary > 200);
        System.out.println("----------------------------------------------------------");
    }
}
