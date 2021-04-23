package chapter3;

import java.util.Scanner;

/**
 * 两个正整数的最大公约数（Greatest Common Divisor，GCD）是能够同时被两个数整除的最大整数。例如，4和2 的最大公约数是2，16和24的最大公约数是8。
 * 一种方法是，假设求两个整数m和n的最大公约数，显然1 是一个公约数，但它可能不是最大的。可以依次检查k（k=2,3,4,…）是否是m和n的最大公约数，直到k大于m或n 为止。
 */
public class GCD {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入a的值：");
        a = input.nextInt();
        System.out.println("请输入b的值：");
        b = input.nextInt();
        while (a % b != 0) {
            int m = a % b;
            a = b;
            b = m;
        }
        System.out.println("最大公约数=" + b);
    }
}
