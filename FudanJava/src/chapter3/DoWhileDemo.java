package chapter3;

import java.util.Scanner;

/**
 * 从键盘输入若干个 double 型数（输入0则结束），程序计算并输入这些数的总和与平均值
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        double sum = 0, avg = 0;
        int n = 0;
        double number;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("请输入一个数（输0结束）：");
            number = input.nextDouble();
            if (number != 0) {
                sum += number;
                n += 1;
            }
        } while (number != 0);
        avg = sum / n;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
