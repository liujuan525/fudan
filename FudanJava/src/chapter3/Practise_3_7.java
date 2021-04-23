package chapter3;

import java.util.Scanner;

public class Practise_3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = input.nextInt();
        System.out.print("请输入月份:");
        int month = input.nextInt();
        int numDays = 0;
        switch (month) {
            case 1: case 3: case 5:
            case 7: case 8: case 10:
            case 12:
                numDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numDays = 30;
                break;
            case 2:     // 对于2月需要判断是否是闰年
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
