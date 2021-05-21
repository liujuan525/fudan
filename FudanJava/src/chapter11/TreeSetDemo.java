package chapter11;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> ts = new TreeSet<>();
        String[] s = new String[]{"one", "two", "three", "four"};
        for (int i = 0; i < s.length; i++) {
            ts.add(s[i]);
        }
        System.out.println(ts);
    }
}
