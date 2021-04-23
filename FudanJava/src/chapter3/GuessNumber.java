package chapter3;

import java.util.Scanner;

/**
 * 随机产生一个100~200之间的整数，用户从键盘上输入所猜 的数，程序显示是否猜中的消息，如果没有猜中要求用户 继续猜，直到猜中为止。
 */

public class GuessNumber {
    public static void main(String[] args) {
        int magic = (int)(Math.random() * 101) + 100;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你猜的数：");
        int guess = input.nextInt();
        while (guess != magic) {
            if (guess > magic) {
                System.out.println("错误！太大，请重猜：");
            } else {
                System.out.println("错误！太小，请重猜：");
            }
            // 输入下一次猜的数
            guess = input.nextInt();
        }
        System.out.println("恭喜你，答对了！\n该数是：" + magic);
    }
}
