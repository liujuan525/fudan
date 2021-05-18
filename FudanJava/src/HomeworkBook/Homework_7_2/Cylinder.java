package HomeworkBook.Homework_7_2;

import chapter4.practise2.Circle;

import java.util.Scanner;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){}

    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    // 圆柱的表面积
    @Override
    public double getArea(){
        double area = getPerimeter() * height;
        return area;
    }

    // 圆柱体积
    public double getVolume(){
        return super.getArea() * height;
    }

    public static void main(String[] args){
        double radius, height;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入圆柱的底面半径：");
        radius = input.nextDouble();
        System.out.println("请输入圆柱的高：");
        height = input.nextDouble();
        Cylinder c = new Cylinder(radius, height);
        System.out.println("圆柱表面积是：" + c.getArea());
        System.out.println("圆柱体积是：" + c.getVolume());
    }
}
