package chapter3;

public class Practise_3_14 {
    public static void main(String[] args) {
        int n = 1;
        double sum = 0;
        while ( n < 99) {
            sum = sum + (double) n / (n + 2);  // 将一个操作数转换成double
            n = n + 2;
        }
        System.out.println("级数之和为：" + sum);
    }
}
