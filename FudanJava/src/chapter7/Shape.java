package chapter7;

public abstract class Shape {
    String name;

    // 抽象类可以定义构造方法
    public Shape() {
    }

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getArea(); // 定义抽象方法

    public abstract double getPerimeter(); // 定义抽象方法
}
