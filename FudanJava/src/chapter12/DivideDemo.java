package chapter12;

public class DivideDemo {
    public static void main(String[] args) {
        int a = 5;
        try {
            int b = a / 0;
            System.out.println("b = " + b);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("a = " + a);
    }
}
