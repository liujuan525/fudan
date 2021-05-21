package chapter10;

public class AB implements AA, BB{
    public void display() {
        System.out.println("AA - display");
    }
    public void show() {
        System.out.println("BB - show");
    }
}
