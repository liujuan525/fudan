package chapter9;

import java.time.DayOfWeek;

public class EnumSwitch {
    public static void describe (DayOfWeek day) {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best.");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }

    public static void main(String[] args) {
        DayOfWeek firstDay = DayOfWeek.MONDAY;
        describe (firstDay);
        DayOfWeek thirdDay = DayOfWeek.WEDNESDAY;
        describe (thirdDay);
        DayOfWeek seventhDay = DayOfWeek.SUNDAY;
        describe(seventhDay);
    }
}
