package chapter4;

public class Student {
    int id;
    String name;
    double marks;
    boolean pass;

    // 定义成员方法
    public void display() {
        System.out.println("id = " + id);
        System.out.println("name = " + name);
        System.out.println("marks = " + marks);
        System.out.println("pass = " + pass);
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
