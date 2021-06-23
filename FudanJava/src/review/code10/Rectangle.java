package review.code10;

//10. 按照下面要求定义类和创建对象。
//        （1）定义一个名为Rectangle的类表示矩形，其中含有length、width 两个double型的成员变量表示矩形的长和宽。定义求矩形周长的方法getPerimeter()和求面积的方法getArea()。
//        （2）定义一个带参数构造方法，通过给出的长和宽创建矩形对象。定义默认构造方法，在该方法中调用有参数构造方法，将矩形长宽都设置为1.0。
//        （3）定义一个名为Cuboid的长方体类，使其继承Rectangle类，其中包含一个表示高的double型成员变量height；定义一个构造方法Cuboid(double length, double width, double height)；再定义一个求长方体体积的volume()方法。

public class Rectangle {
    double length;
    double width;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 矩形周长
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // 矩形面积
    public double getArea() {
        return length * width;
    }
}
