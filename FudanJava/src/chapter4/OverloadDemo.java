package chapter4;

public class OverloadDemo {
    public void display(int a) {
        System.out.println("a = " + a);
    }

    public void display(double d) {
        System.out.println("d = " + d);
    }

    public void display() {
        System.out.println("无参数方法");
    }

    public void display(int a, int b) {
        System.out.println("a = " + a + ",b = " + b);
    }

    public static void main(String[] args) {
        OverloadDemo obj = new OverloadDemo();
        obj.display();
        obj.display(10);
        obj.display(50, 60);
        obj.display(100.0);
    }
}
