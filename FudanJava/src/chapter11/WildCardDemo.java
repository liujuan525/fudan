package chapter11;

import java.util.ArrayList;
import java.util.List;

public class WildCardDemo {
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(5);
        myList.add(7);
        printList(myList);
    }
}
