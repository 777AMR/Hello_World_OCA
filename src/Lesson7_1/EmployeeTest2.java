package Lesson7_1;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Lesson7.Employee emp1 = new Lesson7.Employee(5);
//        Lesson7.Employee emp2 = new Lesson7.Employee("Ivanov");
//        Lesson7.Employee emp3 = new Lesson7.Employee(555.5);


//        System.out.println(emp1.id);
        System.out.println(emp1.surname);
//        System.out.println(emp1.salary);

        emp1.getId();
        emp1.getSurname();
        emp1.getSalary();
    }
}
