package chapter4;

public class Sun {
    private static final Sun INSTANCE = new Sun();
    private int a = 0;
    private Sun(){}  // 构造方法
    public static synchronized Sun getInstance() {
        return INSTANCE;
    }
    public void methodA() {
        a++;
        System.out.println("a = " + a);
    }
    public static void main(String[] args){
        Sun sun1 = Sun.getInstance();
        Sun sun2 = Sun.getInstance();
        sun1.methodA();
        sun2.methodA();
        System.out.println(sun1==sun2);
    }
}
