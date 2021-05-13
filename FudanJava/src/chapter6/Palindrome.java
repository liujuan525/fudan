package chapter6;
// 字符串回文判断

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String s = input.nextLine();
        if (isPalindrome(s)) {
            System.out.println(s + ": 是回文");
        } else {
            System.out.println(s + ": 不是回文");
        }
    }
}
