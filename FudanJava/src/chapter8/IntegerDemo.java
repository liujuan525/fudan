package chapter8;

public class IntegerDemo {
    public static void main (String[] args) {
        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toHexString(13));
        System.out.println(Integer.toOctalString(13));
        System.out.println(Integer.toBinaryString(Integer.reverse(13)));
        System.out.println(Integer.highestOneBit(13));
        System.out.println(Integer.lowestOneBit(13));
    }
}
