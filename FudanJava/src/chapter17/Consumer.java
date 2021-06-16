package chapter17;

public class Consumer extends Thread{
    private Box box;
    public Consumer(Box c) {
        box = c;
    }
    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = box.get();  // 消费一个整数i
            try {
                sleep((int)(Math.random() * 100));
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
