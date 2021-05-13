package chapter5;

import java.util.Arrays;

public class StringSort {
    public static void main(String[] args) {
        String[] ss = {"china", "england", "france", "america", "russia"};
        for (int i = 0; i < ss.length; i++) {
            System.out.print(ss[i] + " ");
        }
        System.out.println();

        // 数组排序
        Arrays.sort(ss);
        for (String s : ss) {
            System.out.print(s + " ");
        }
    }
}
