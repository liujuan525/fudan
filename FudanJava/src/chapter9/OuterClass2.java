package chapter9;

public class OuterClass2 {
    private String x = "hello";

    public void makeInner(int param) {
        final String y = "local variable";
        class InnerClass { // 局部内部类
            public void seeOuter() {
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("param = " + param);
            }
        }
        new InnerClass().seeOuter();
    }

    public static void main(String[] args) {
        OuterClass2 oc = new OuterClass2();
        oc.makeInner(47);
    }
}
