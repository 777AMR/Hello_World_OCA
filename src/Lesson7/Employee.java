package Homework.Lesson7;

public class Employee {
    int id;
    private double salary;
    public String surname;

    public void showSalary() {
        System.out.println(salary);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

    public Employee(int id) {
        this.id = id;
        System.out.println(id);
    }

    Employee(String surname) {
        this.surname = surname;
        System.out.println(surname);
    }

    private Employee(double salary) {
        this.salary = salary;
        System.out.println(salary);
    }

    public double getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {

    }
}
