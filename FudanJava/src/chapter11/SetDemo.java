package chapter11;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        s1.add(new Integer(1));
        s1.add(new Integer(3));
        s1.add(new Integer(5));
        s1.add(new Integer(7));
        s2.add(new Integer(2));
        s2.add(new Integer(3));
        s2.add(new Integer(5));
        s2.add(new Integer(6));
        System.out.println(s1.containsAll(s2));
    }
}
