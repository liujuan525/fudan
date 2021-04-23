package chapter3;

import java.util.Scanner;

/**
 * 3.2 编写程序，要求用户从键盘上输入一个年份，输出该年是否是闰年。符合下面两个条件之一的年份即为闰年：
 * （1）能被4整除，但不能被100整除；
 * （2）能被400整除。
 *  请输入年份：2017
 *  2017年不是闰年。
 */
public class Practise_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "年是闰年。");
        } else {
            System.out.println(year + "年不是闰年。");
        }
    }
}
