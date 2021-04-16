package chapter2;

import java.util.Random;
import java.util.Scanner;

public class Practise_2_4 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int a, b, c;
        System.out.print("请输入一个整数（0-1000）：");
        int num = input.nextInt();
        a = num % 10;
        b = num / 10 %10;
        c = num /100;
        sum = a + b + c;
        System.out.print("各位数字的和是：" + sum);
    }

//    方法二
//    public static void main(String[] args)
//    {
//        int max = 1000;
//        int min = 0;
//        Random random = new Random();
//        // 获取 0-1000 的随机数
//        int randomInt = random.nextInt(max) % (max - min + 1) + min;
//        System.out.println("0-1000的随机数是：" + randomInt);
//
//        long total = 0;
//        long number = randomInt;
//        while (number != 0) {
//            total = total + number % 10;
//            number = (number - number % 10) / 10;
//        }
//        System.out.println("随机数的各位数字相加的结果是：" + total);
//    }
}
