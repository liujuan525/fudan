package chapter4;

public class RecursionDemo {
    public static long factor(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factor(n - 1);
        }
    }

    public static void main(String[] args) {
        int k = 20;
        System.out.println(k + "!=" + factor(k));
        System.out.println("max = " + Long.MAX_VALUE);	// long型数的最大值
    }
}
