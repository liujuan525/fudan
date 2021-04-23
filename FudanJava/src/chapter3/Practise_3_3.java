package chapter3;

import java.util.Scanner;

/**
 * 编写程序，要求用户从键盘输入4个整数，找出其中最大值和最小值并打印输出。要求使用尽可能少的if（或if-else）语句实现。提示：4条if语句就够了
 */
public class Practise_3_3 {
    public static void main(String[] args) {
        int num1, num2, num3, num4, max, min, max1, max2, min1, min2;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入4个整数：");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        if (num1 > num2) {
            max1 = num1;
            min1 = num2;
        } else {
            max1 = num2;
            min1 = num1;
        }
        if (num3 > num4) {
            max2 = num3;
            min2 = num4;
        } else {
            max2 = num4;
            min2 = num3;
        }

        if (max1 > max2) {
            max = max1;
        } else {
            max = max2;
        }

        if (min1 < min2) {
            min = min1;
        } else {
            min = min2;
        }
        System.out.println("最大值=" + max);
        System.out.println("最小值=" + min);
    }
}
