package chapter17;

public class MainThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(t.getState());
        System.out.println(t.getName());
        t.setName("My Thread");
        System.out.println(t);
    }
}
