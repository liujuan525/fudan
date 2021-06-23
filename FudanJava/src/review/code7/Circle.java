package review.code7;

//7. 按照下面要求定义类和创建对象。
//        （1）定义一个名为Circle的类表圆，其中含有double型的成员变量centerX、centerY表示圆心坐标，radius表示圆的半径。定义求圆面积的方法getArea()方法和求圆周长的方法getPerimeter()。
//        （2）定义一个带参数构造方法，通过给出圆的半径创建圆对象。定义默认构造方法，在该方法中调用有参数构造方法，将圆的半径设置为1.0。
//        （3）定义一个名为Cylinder类表示圆柱，它继承Circle类，要求定义一个变量height表示圆柱高度。定义getVolume()方法求圆柱体积。定义默认构造方法和带radius和height两个参数的构造方法。

public class Circle {
    double centerX, centerY; // 圆心坐标
    double radius; // 圆的半径

    public Circle() {
        this(1.0);
//        new Circle(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    // 求圆面积
    public double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }

    // 求圆周长
    public double getPerimeter() {
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

}
