package chapter2;

import java.util.Scanner;

public class Practise_2_3 {
    public static void main(String[] args) {
        double weight, height;
        double bmi;
        Scanner input = new Scanner(System.in);
        System.out.println("输入你的体重（单位：公斤）：");
        weight = input.nextDouble();
        System.out.println("请输入你的身高（单位：米）：");
        height = input.nextDouble();
        bmi = weight / (height * height);
        System.out.println("你的身体质量指数是：" + bmi);
    }
}
