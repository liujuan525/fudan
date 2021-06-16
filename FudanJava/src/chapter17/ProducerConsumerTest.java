package chapter17;

public class ProducerConsumerTest {
    public static void main(String[] args) {
        Box box = new Box();
        Producer p = new Producer(box);   // 将box对象传递给生产者
        Consumer c = new Consumer(box);   // 将box对象传递给消费者
        p.start();
        c.start();
    }
}
