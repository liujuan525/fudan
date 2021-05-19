package chapter8;

public class Student implements Cloneable {
    private int id;

    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object obj) {
        return this.id == ((Student) obj).id;
    }

    public String toString() {
        return "Student:id = " + id + ",name = " + name;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(101, "May");
        Student s2 = (Student) s1.clone();
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.getClass().getName());
        System.out.println(s1.hashCode());
        System.out.println(s1);
    }
}
