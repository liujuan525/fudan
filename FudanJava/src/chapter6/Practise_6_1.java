package chapter6;

import java.util.Scanner;

public class Practise_6_1 {
    public static void main(String[] args) {
        String s;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        s = input.nextLine();

        System.out.println("字符串长度是：" + s.length());
        System.out.println("字符串第一个字符是：" + s.charAt(0));
        System.out.println("字符串最后一个字符是：" + s.charAt(s.length() - 1));
    }
}
