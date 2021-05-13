package chapter7;

public class CastDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("刘明",30,5000);
        System.out.println(emp);
        Person p = emp;            // 自动类型转换
        System.out.println(p);
        p.sayHello();
        emp = (Employee)p;        // 强制类型转换
//        emp.printState();
    }
}
