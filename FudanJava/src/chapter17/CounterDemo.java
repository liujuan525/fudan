package chapter17;

public class CounterDemo extends Thread {
    private Counter counter;
    public CounterDemo(Counter counter, String name) {
        this.counter = counter;
        setName(name);
    }
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.increment();
            System.out.println(getName() + "  " + counter.getCount());
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        Counter c = new Counter();
        Thread t1 = new CounterDemo(c, "A");
        Thread t2 = new CounterDemo(c, "B");
        t1.start();
        t2.start();
    }
}
