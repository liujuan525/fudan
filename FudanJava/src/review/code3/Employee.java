package review.code3;

public class Employee extends Person {
    public double salary;

    public Employee() {

    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double computeSalary(double hours, int rate) {
        double salary = hours * rate;
        return this.salary + salary;
    }
}
