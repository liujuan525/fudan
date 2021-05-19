package HomeworkBook;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Homework_8_6 {
    public static void main(String[] args) throws ParseException {
        // 2017年第256天
        LocalDate pDay = LocalDate.of(2017, 1, 1).plusDays(255);
        System.out.println(pDay);

        // 输入任意年份、任意一天
        System.out.println("请输入年份");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("请输入天数");
        int day = input.nextInt();
        LocalDate rDay = LocalDate.of(year, 1, 1).plusDays(day - 1);
        System.out.println(rDay);

        // 输入一个日期，输入过了多少天
        System.out.println("请输入日期");
        Scanner inputs = new Scanner(System.in);
        String inputS = inputs.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date inputDate = format.parse(inputS);

        System.out.println("请输入过了多少天");
        int passDay = inputs.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(inputDate);
        calendar.add(Calendar.DATE, passDay);
        String sNextDate = format.format(calendar.getTime());

        System.out.println(sNextDate);
    }
}
