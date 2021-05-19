package chapter7;

public class Square extends Shape {
    private double length;

    public Square() {
        this(0.0);
    }

    public Square(double length) {
        super("Square");
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return 4 * length;
    }

    @Override
    public String toString() {
        return "[Square] length = " + length;
    }

    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1);
        Square square2 = new Square(1);
        System.out.println(square2);
        System.out.println("area = " + square2.getArea());
        System.out.println("perimeter = " + square2.getPerimeter());
    }

}
