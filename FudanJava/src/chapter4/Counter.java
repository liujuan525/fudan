package chapter4;

public class Counter {
    public int x ;                   // 实例变量
    public static int y = 0 ;      // 静态变量
    public Counter() {
        x = 100;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        c1.y = 100;
        c2.y = 200;
        System.out.println(Counter.y);
    }
}
