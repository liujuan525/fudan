package chapter17;

public class ThreadDemo extends Thread {
    public ThreadDemo(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + " = " + i);
        }
        System.out.println(getName() + " 到达终点");
    }
    public static void main(String[] args){
        Thread t1 = new ThreadDemo("运动员 A");
        Thread t2 = new ThreadDemo("运动员 B");
        t1.start();
        t2.start();
    }
}
