package review.code7;

public class Cylinder extends Circle {
    double height; // 圆柱高度

    public Cylinder() {

    }

    public Cylinder(double radius, double height) {
        this.height = height;
        this.radius = radius;
    }

    // 圆柱体积
    public double getVolume() {
        return super.getArea() * height;
    }

}
