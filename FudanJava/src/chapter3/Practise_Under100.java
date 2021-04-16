package chapter3;

/**
 * 编程计算1+2+3+…之和，和超过100结束，输出结果。
 */

public class Practise_Under100 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += i;
            if (sum > 100) {
                System.out.println("结果为：" + sum);
                System.exit(0);
            }
        }
    }
}
