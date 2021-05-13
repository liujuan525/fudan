package chapter6;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder ss = new StringBuilder("Hello");
        System.out.println(ss.length());
        System.out.println(ss.capacity());
        ss.append("Java");
        System.out.println(ss);
        System.out.println(ss.insert(5,","));
        System.out.println(ss.replace(6,10,"World!"));
        System.out.println(ss.reverse());
    }
}
