package chapter9;

public class MyOuter {
    private static int x = 100;

    public static class MyInner { // 静态内部类
        private String y = "hello";

        public void innerMethod() {
            System.out.println("x is " + x); // 可以访问外层类的静态成员x
            System.out.println("y is " + y);
        }
    }

    public static void main(String[] args) {
        // 不需要外层类的实例就可以直接创建一个静态内部类实例
        MyOuter.MyInner snc = new MyOuter.MyInner();
        snc.innerMethod();
    }
}
