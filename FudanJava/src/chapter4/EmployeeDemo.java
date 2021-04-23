package chapter4;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee;
        employee = new Employee();
        employee.name = "李明";
        employee.age = 28;
        employee.salary = 5000.00;
        System.out.println("姓名 = " + employee.name);
        System.out.println("年龄 = " + employee.age);
        System.out.println("工资 = " + employee.salary);
        employee.sayHello();
    }
}
