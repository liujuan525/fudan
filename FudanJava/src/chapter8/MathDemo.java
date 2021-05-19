package chapter8;

public class MathDemo {
    public static void main(String[] args) {
        System.out.println("sqrt(2) = " + Math.sqrt(2));
        System.out.println("pow(2,5) = " + Math.pow(2, 5));
        System.out.println("rint(2.5) = " + Math.rint(2.5));
        System.out.println("rint(-3.5) = " + Math.rint(-3.5));
        System.out.println("round(3.5) = " + Math.round(3.5));
        System.out.println("round(-3.5) = " + Math.round(-3.5));
        double pi = Math.PI;
        pi = Math.round(pi * 10000) / 10000.0; // 四舍五入到小数点后4位
        System.out.println("PI = " + pi);
    }
}
