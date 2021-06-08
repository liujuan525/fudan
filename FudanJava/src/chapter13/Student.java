package chapter13;

import java.io.Serializable;

public class Student implements Serializable {
    int id;
    String name;
    int age;
    String department;
    public Student(int id, String name, int age, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
    }
}
