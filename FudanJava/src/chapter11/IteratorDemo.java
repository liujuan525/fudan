package chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        ListIterator<String> iterator = myList.listIterator();
        // 将迭代器指针移到线性表末尾
        while (iterator.hasNext()) {
            iterator.next();
        }
        // 从后向前访问线性表每个元素
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
