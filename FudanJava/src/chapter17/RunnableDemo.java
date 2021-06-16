package chapter17;

class RunnerN implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i ++) {
            System.out.println(Thread.currentThread().getName() + " = " + i);
        }
        System.out.println(Thread.currentThread().getName() + " 到达终点");
    }
}

public class RunnableDemo {
    public static void main(String[] args) throws InterruptedException {
        RunnerN task = new RunnerN();
        Thread t1 = new Thread(task, "运动员 A");
        Thread t2 = new Thread(task ,"运动员 B");

        System.out.println(t1.getState());
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(t1.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
