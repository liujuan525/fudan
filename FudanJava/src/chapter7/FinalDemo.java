package chapter7;

public class FinalDemo {
    public static final int SIZE = 50;

    public void methodA(final int i) {
//        i = i + 1;
    }

    public int methodB(final int i) {
        final int j = i + 1;
//        j = 100;
        return j;
    }

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo();
        finalDemo.methodA(1);
        int j = finalDemo.methodB(1);
        System.out.println("j = " + j);
        System.out.println("SIZE = " + SIZE);
    }
}
