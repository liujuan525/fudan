package chapter11;

import java.util.ArrayDeque;

public class DequeDemo {
    public static void main(String[] args) {
        int[] elements = { 1, 2, 3, 0, 7, 8, 9 };
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        // 将元素5添加到队列中
        queue.addFirst(5);
        // 将数组中前3个元素添加到queue中
        for (int i = 0; i < 3; i++) {
            queue.addFirst(elements[i]);
        }
        // 将数组中后3个元素添加到queue中
        for (int i = 4; i < 7; i++) {
            queue.offerLast(elements[i]);
        }
        // 访问queue中每个元素
        for (Integer v : queue ) {
            System.out.print(v + "  ");
        }
        System.out.println("\nsize = " + queue.size());
    }
}
