package chapter3;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        int num = input.nextInt() ;
        if (num % 5 == 0 && num % 6 == 0) {
            System.out.println( num + " 能被5和6同时整除。") ;
        }
        if (num % 5 == 0 || num % 6 == 0) {
            System.out.println( num + " 能被5或6整除。") ;
        }
        if (num % 5 == 0 ^ num % 6 == 0) {
            System.out.println( num + " 只能被5或只被6整除。") ;
        }
    }
}
