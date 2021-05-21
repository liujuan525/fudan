package chapter11;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        int [] elements = {1, 2, 3, 0, 7, 8, 9};
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.addFirst(5);     // 5
        for (int i = 0; i < 3; i++) {
            queue.addFirst(elements[i]);   //  3  2  1  5
        }
        for (int i = 4; i < 7; i++) {
            queue.offerLast(elements[i]);  // 3 2 1 5 7 8 9
        }
        for (Integer v : queue) {
            System.out.print(v + "   ");
        }
        System.out.println("\n 队列大小：" + queue.size());
    }
}
