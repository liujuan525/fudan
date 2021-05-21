package chapter10;

import java.util.Arrays;

public class Circle implements Comparable<Circle> {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() { // 求周长方法
        return 2 * radius * Math.PI;
    }

    public double getArea() { // 求面积方法
        return radius * radius * Math.PI;
    }

    @Override
    public int compareTo(Circle circle) {
        if (getArea() > circle.getArea()) {
            return 1;
        } else if (getArea() < circle.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Circle[] circles = new Circle[] { new Circle(3.4), new Circle(2.5), new Circle(5.8), };
        System.out.println(circles[0].compareTo(circles[1]));
        // 对circles数组中3个Circle对象排序
        Arrays.sort(circles);
        for (Circle c : circles) {
            System.out.printf("%6.2f%n", c.getArea());
        }
    }
}
