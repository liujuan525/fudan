package chapter4;

public class Employee {
    public String name;
    public int age;
    public double salary;

    // 无参数构造方法
    public Employee(){};

    public void sayHello() {
        System.out.println("My name is " + name);
    }

    public double computeSalary(int hours, double rate) {
        salary = salary + hours * rate;
        return salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
