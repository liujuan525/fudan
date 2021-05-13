package chapter7;

public class Person {
    public String name;
    public int age;
    public Person(){

    }
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public void sayHello() {
        System.out.println("My name is " + name);
    }
}
