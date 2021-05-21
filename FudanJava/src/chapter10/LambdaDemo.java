package chapter10;

import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        String[] names = {"Shanghai", "Guangzhou", "Beijing", "London"};
        Arrays.sort(names, (a, b) -> b.compareTo(a));

        for (String n : names) {
            System.out.println(n);
        }
    }
}
