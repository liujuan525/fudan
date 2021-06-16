package chapter17;

public class CounterThread extends Thread {
    CounterThread(String name) {
        super(name);
    }
    public void run() {
        int count = 0;
        while (true) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            count++;
            if (count == 1000) {
                break;
            }
            System.out.println(getName() + ":" + count);
        }
    }

    public static void main(String[] args) {
        CounterThread t1 = new CounterThread("Runner-A");
        CounterThread t2 = new CounterThread("Runner-B");
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
        t2.start();
    }

}
