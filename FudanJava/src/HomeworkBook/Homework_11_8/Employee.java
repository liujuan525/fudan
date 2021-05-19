package HomeworkBook.Homework_11_8;

import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
    private int id;

    public Employee(int id) {
        this.id = id;
    }

    // 实现了compareTo()方法
    public int compareTo(Employee obj){
        return this.id - obj.id;
    }

    public static void main(String[] args) {
        Employee[] employeesList = new Employee[3];
        employeesList[0] = new Employee(101);
        employeesList[1] = new Employee(108);
        employeesList[2] = new Employee(100);

        TreeSet<Employee> treeSetList = new TreeSet<>();
        // 按id值顺序存放
        treeSetList.add(employeesList[0]);
        treeSetList.add(employeesList[1]);
        treeSetList.add(employeesList[2]);
        for (Employee emp:treeSetList) {
            System.out.println(emp.id);
        }
    }
}
