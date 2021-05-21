package chapter11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        Integer[] num = {30, -20, 99, 50, 0, 8};
        List<Integer> list = Arrays.asList(num);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
