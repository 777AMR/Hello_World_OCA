package Lesson16;

public class Test1 {

}

class Employee{
    double salary;
    boolean isManager;

    public Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee{
    public static void main(String[] args) {
        Employee employee = new Employee(100.5, true);
        System.out.println(employee.isManager + "" + employee.salary);
    }
}
