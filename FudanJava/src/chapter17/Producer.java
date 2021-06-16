package chapter17;

public class Producer extends Thread {
    private Box box;   // 被共享的对象
    public Producer(Box c) {
        box = c;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            box.put(i); // 生产一个整数
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
