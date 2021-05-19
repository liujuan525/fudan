package HomeworkBook;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Homework_8_7 {
    public static void main(String[] args) {
        System.out.println("请输入出生年:");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        System.out.println("请输入出生月:");
        int month = input.nextInt();
        System.out.println("请输入出生日:");
        int day = input.nextInt();
        LocalDate birthday = LocalDate.of(year, month, day);

        LocalDate today = LocalDate.now();
        Long days = ChronoUnit.DAYS.between(birthday, today);
        System.out.println("从出生到现在已经过去 " + days + " 天");
    }

}
