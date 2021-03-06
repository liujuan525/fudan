package chapter3;

import java.util.Scanner;

/**
 * 从键盘输入一个年份（如2016年）和一个月 份（如2月），输出该月的天数（29）
 */

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("输入一个年份：");
        int year = input.nextInt();
        System.out.print("输入一个月份：");
        int month = input.nextInt();

        int numDays = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:     // 对2月需要判断是否是闰年
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("月份非法.");
                break;
        }
        System.out.println("该月的天数为："  + numDays);
    }
}
