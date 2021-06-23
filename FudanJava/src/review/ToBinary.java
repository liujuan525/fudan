package review;
//6. 编写一个方法，将十进制数转换为二进制数的字符串，方法签名如下：
//public static String toBinary(int value)
//        例如，按如下调用该方法将输出101010.
//        System.out.println(toBinary(42));

public class ToBinary {
    public static void main(String[] args) {
        System.out.println(toBinary(42));
    }

    public static String toBinary(int value) {
        String s = "";
        while (value != 0) {
            int r = value % 2;
            s = r + s;
            value = value / 2;
        }
        return s;
    }
}
