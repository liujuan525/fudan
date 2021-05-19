package chapter8;

import java.time.LocalTime;

public class LocalDateDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        System.out.println(localTime.getNano());
    }
}
