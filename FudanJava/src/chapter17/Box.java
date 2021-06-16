package chapter17;

public class Box {
    private int data;
    private boolean available = false;
    public synchronized void put(int value) {
        while(available) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }
        data = value;
        System.out.println("Producer " + " put: " + data);
        available = true;
        notifyAll();
    }

    public synchronized int get() {
        while(!available) {
            try {
                wait();
            } catch(InterruptedException e) {
                System.out.println(e);
            }
        }

        available = false;
        notifyAll();
        System.out.println("Consumer " +" get: " + data);
        return data;
    }
}
