package chapter7;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Shape shapes[] = new Shape[3];
        double sumArea = 0;             // 求几个形状的面积和
        shapes[0] = new Circle(10);
//        shapes[1] = new Rectangle(5, 20);
//        shapes[2] = new Square(10);
        // 计算所有形状面积和
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());    // 计算实际类型的面积
            // 根据对象类型调用不同的getArea()方法
            sumArea = sumArea + shape.getArea();
        }
        System.out.println("所有形状的面积和是：" + sumArea);
    }
}
