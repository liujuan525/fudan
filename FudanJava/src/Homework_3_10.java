/**
 * 3.10 编写程序，计算并输出1-1000之间含有7或者是7倍数的整数之和及个数。
 */
public class Homework_3_10 {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 7 == 0 || i / 100 == 7 || i % 10 == 7 || i / 10 % 10 == 7) {
                sum += i;
                count = count + 1;
                System.out.println(i);
            }
        }
        System.out.println("整数之和 = " + sum);
        System.out.println("整数个数 = " + count);
    }
}
