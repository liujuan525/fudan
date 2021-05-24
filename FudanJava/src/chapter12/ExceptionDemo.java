package chapter12;

public class ExceptionDemo {
    public static void main(String[] args) {
        int a = 5;
        try{
            int b = a / 0;
            System.out.println("b = " + b);
        }catch(ArithmeticException ae){
            System.out.println(ae);
        }
        System.out.println("a = " + a);
    }
}
