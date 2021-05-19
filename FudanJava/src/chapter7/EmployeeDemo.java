package chapter7;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("刘明",30,5000.00);
        Employee p = employee;

        System.out.println(p instanceof Employee);
        p.sayHello();
        p.computeSalary(10,200.00);
    }
}
