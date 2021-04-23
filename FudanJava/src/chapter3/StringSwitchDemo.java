package chapter3;

import java.util.Locale;
import java.util.Scanner;

/**
 * 根据英文月份的字符串名称输出数字月份
 */
public class StringSwitchDemo {
    public static void main(String[] args) {
        String month = "";
        int monthNumber = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个月份的英文名称：");
        month = input.next();
        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }
        if (monthNumber == 0) {
            System.out.println("输入的月份名非法");
        } else {
            System.out.println(month + "是" + monthNumber + "月");
        }
    }
}
