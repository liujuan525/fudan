package chapter2;

import java.util.Scanner;

public class Practise_2_2 {
    public static void main(String[] args) {
        double radius;
        double high;
        double volume;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆柱底面半径：");
        radius = input.nextDouble();
        System.out.println("请输入圆柱高：");
        high = input.nextDouble();
        // 圆柱体积=πr²h=S底面积×高（h）
        volume = Math.PI * radius * radius * high;
        System.out.println("圆柱的体积：" + volume);
    }
}
