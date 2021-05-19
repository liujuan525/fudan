package chapter7;

class Parent {
    public void display(double i) {
        System.out.println(i);
    }
}

class Child extends Parent {
    @Override
    public void display(double i) {
        System.out.println(2 * i);
    }
}

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.display(10);
        Parent parent = new Parent();
        parent.display(10.0);
    }
}
