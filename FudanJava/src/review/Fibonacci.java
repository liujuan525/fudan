package review;

//5.编程打印输出Fibonacci数列的前20个数。Fibonacci数列是第一和第二个数都是1，以后每个数是前两个数之和，用公式表示为: f1 = f2 = 1, fn = fn-1 + fn-2 (n >= 3)。要求使用数组存储Fibonacci数。

public class Fibonacci {
    public static void main(String[] args) {
        int f1 = 1, f2 = 1;
        int sum = 2;
        int[] f = new int[20];
        f[0] = f1;
        f[1] = f2;
        for (int i = 2; i < 20; i++) {
            f[i] = f[i - 2] + f[i - 1];
            System.out.println(f[i - 2] + " + " + f[i - 1] + " = " + f[i]);
            sum += f[i];
        }
        System.out.println("sum = " + sum);
    }

}
