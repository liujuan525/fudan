package chapter17;

public class ThreadPriorityDemo extends Thread {
    ThreadPriorityDemo(String name) {
        super(name);
    }
    public void run() {
        int count = 0;
        while (true) {
            try {
                sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            if (count == 5000) {
                break;
            }
            System.out.println(getName() + ":" + count++);
        }
    }
    public static void main(String[] args) {
        CounterThread thread1 = new CounterThread("Runner-A");
        CounterThread thread2 = new CounterThread("Runner-B");
        thread1.setPriority(1);
        thread2.setPriority(10);
        thread1.start();
        thread2.start();
    }
}
