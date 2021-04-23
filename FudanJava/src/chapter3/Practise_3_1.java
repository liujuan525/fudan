package chapter3;

import java.util.Scanner;

/**
 * 编写程序，要求用户从键盘上输入一个正整数，程序判断该数是奇数还是偶数
 */
public class Practise_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println( num + "是偶数");
        } else {
            System.out.println( num + "是奇数");
        }
    }
}
