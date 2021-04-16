package chapter2;

import java.util.Scanner;

public class Practise_2_6 {
    public static void main(String[] args) {
        double a, b, c;
        double result;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入a：");
        a = input.nextDouble();
        System.out.println("请输入b：");
        b = input.nextDouble();
        System.out.println("请输入c：");
        c = input.nextDouble();
        result = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("表达式的值是：" + result);
    }
}
