package chapter11;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        int time = 10;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = time; i > 0; i--) {
            list.add(i);
        }
        while (!list.isEmpty()) {
            System.out.println(list.remove());
            try {
                Thread.sleep(1000); // 1秒
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("点火！");
    }
}
