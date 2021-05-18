package HomeworkBook;

import java.time.LocalDate;
import java.util.Scanner;

public class Homework_8_6 {
    public static void main(String[] args) {
        // 2017年第256天
        LocalDate pDay = LocalDate.of(2017, 1, 1).plusDays(255);
        System.out.println(pDay);

        // 任意年份任意一天
        System.out.println("请输入年份");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("请输入天数");
        int day = input.nextInt();
        LocalDate rDay = LocalDate.of(year, 1, 1).plusDays(day - 1);
        System.out.println(rDay);
    }
}
