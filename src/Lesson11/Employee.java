package Lesson11;

public class Employee {
    public String name;
    public double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel(double a) {
        a = a * 2;
        return a;
    }

    public double setSalary() {
        this.salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double d = emp1.uvelichitel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        emp1.setSalary();
        System.out.println(emp1.salary);
    }
}