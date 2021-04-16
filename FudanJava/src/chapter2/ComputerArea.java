package chapter2;

import java.util.Scanner;

public class ComputerArea {
    public static void main(String[] args) {
        double radius;
        double area;
        // 创建一个 Scanner 实例 input
        Scanner input = new Scanner(System.in);
        System.out.print("请输入半径值：");
        // 通过 input 实例读取一个 double 型数
        radius = input.nextDouble();
        area = Math.PI * radius * radius;
        System.out.println("圆的面积为：" + area);
    }
}
