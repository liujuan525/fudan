package review;
//8.编写程序，计算并输出所有的水仙花数。水仙花数是这样的三位数，它的各位数字的立方和等于这个三位数本身，例如371=33+73+13，371就是一个水仙花数。

public class Narcissus {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i % 10; // 个位
            int b = (i / 10) % 10; // 十位
            int c = i / 100; // 百位
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
    }
}