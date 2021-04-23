package chapter4;

public class PassByValue {
    public static void changeValue(int number, Employee employee){
        number = 200;
        System.out.println(number);
        // 在方法体中修改员工的工资
        employee.setSalary(5000);
    }

    public static void main(String[]args){
        int number = 100;
        Employee employee = new Employee();
        employee.setSalary(3000);
        changeValue(number,employee);
        // 方法调用后输出number和员工的工资
        System.out.println(number);
        System.out.println(employee.getSalary());
    }
}
