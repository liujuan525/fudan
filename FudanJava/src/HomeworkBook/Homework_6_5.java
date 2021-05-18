package HomeworkBook;

/**
 * 编写一个方法，将十进制数转换为二进制数的字符串
 */
public class Homework_6_5 {

    public static String toBinary(int value) {
        String s = "";
        while( value != 0) {
            int r = value % 2;  // 反复除以2取余数
            s = r + s;
            value = value / 2;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(toBinary(10));
    }
}
