package chapter10;

import java.util.Arrays;
import java.util.Comparator;

public class CoparatorDemo {
    public static void main(String[] args) {
        String[] s = {"this", "is", "a", "java", "string"};
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String first, String second) {
                return first.length() - second.length();
            }
        });
        for (String str : s) {
            System.out.println(str);
        }
    }
}
