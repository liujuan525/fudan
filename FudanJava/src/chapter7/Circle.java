package chapter7;

public class Circle extends Shape {
    private double radius;
    public Circle(){
        this(0.0);
    }
    public Circle(double radius) {
        super("圆");                  // 调用父类的构造方法
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    @Override
    public double getPerimeter() {    // 实现父类的抽象方法
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {          // 实现父类的抽象方法
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {        // 覆盖Object类的toString()方法
        return "[圆] radius = " + radius;
    }
}
