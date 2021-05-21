package chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class CountDown {
    public static void main(String[] args) {
        int time = 10;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = time; i > 0; i--) {
            queue.add(i); // 将10到1存储到队列中
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.remove()); // 从队列中删除一个元素
            try {
                Thread.sleep(1000); // 当前线程睡眠1秒钟
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
