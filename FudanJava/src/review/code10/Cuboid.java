package review.code10;

//        （3）定义一个名为Cuboid的长方体类，使其继承Rectangle类，其中包含一个表示高的double型成员变量height；定义一个构造方法Cuboid(double length, double width, double height)；再定义一个求长方体体积的volume()方法。

public class Cuboid extends Rectangle {
    double height;

    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public Cuboid() {
        this(0, 0, 0);
    }

    // 长方体体积
    public double volume() {
        return getArea() * height;
    }
}
