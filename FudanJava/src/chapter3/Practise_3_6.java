package chapter3;

import java.util.Scanner;

/**
 * 编写程序，接收用户从键盘输入10个整数，比较并输出其中的最大值和最小值。
 */
public class Practise_3_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第1个整数：");
        int max = input.nextInt();
        int min = max;
        for(int i = 2;i <= 10 ; i++){
            System.out.print("请输入第" + i + "个整数：");
            int num = input.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
