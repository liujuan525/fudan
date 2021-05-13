package chapter7;

public class Employee extends Person{
    public double salary;
    public Employee() {

    }
    public Employee(double salary) {
        this.salary = salary;
    }
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    public double computeSalary(int hours, double rate) {
        double salary = hours * rate;
        return this.salary + salary;
    }
}
