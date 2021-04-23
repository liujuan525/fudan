package chapter3;

import java.util.Scanner;

/**
 * 编写程序，从键盘输入一个整数，计算并输出该数的各位数字之和。
 */
public class Practise_3_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = input.nextInt();
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println("各位数字之和为：" + sum);
    }
}
