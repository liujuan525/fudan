package chapter7;

public class Rectangle extends Shape {
    private double length;

    private double height;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(double length, double height) {
        super("Rectangle");
        this.length = length;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + height);
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public String toString() {
        return "[Rectangle] length = "+ length + ", height =" + height;
    }
}
