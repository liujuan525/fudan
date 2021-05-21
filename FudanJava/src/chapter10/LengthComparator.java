package chapter10;

import java.util.Arrays;
import java.util.Comparator;

public class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return first.length() - second.length();
    }

    public static void main(String[] args) {
        String[] ss = {"this", "is", "a", "test", "string"};
        Arrays.sort(ss, new LengthComparator());
        for (String s : ss) {
            System.out.print(s + " ");
        }
    }
}
