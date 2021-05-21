package chapter11;

import java.util.Set;
import java.util.TreeSet;

public class DescSortDemo {
    public static void main(String[] args) {
        String[] s = {"China", "England", "France", "America", "Russia", };
        Set<String> ts = new TreeSet<>();
        for (int i = 0; i < s.length; i++) {
            ts.add(s[i]);
        }
        System.out.println(ts);
        //使用Lambda表达式实现字符串倒序
        ts = new TreeSet<>((String s1, String s2) -> s2.compareTo(s1));
        // 将数组s中元素添加到TreeSet对象中
        for (int i = 0; i < s.length; i++) {
            ts.add(s[i]);
        }
        System.out.println(ts);
    }
}
