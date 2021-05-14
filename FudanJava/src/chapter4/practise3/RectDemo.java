package chapter4.practise3;

// 4-3
public class RectDemo {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle();
        rect.setLength(20);
        rect.setWidth(10);
        System.out.println("该矩形的长为：" + rect.getLength());
        System.out.println("该矩形的宽为：" + rect.getWidth());
        System.out.println("该矩形的周长为：" + rect.getPerimeter());
        System.out.println("该矩形的面积为：" + rect.getArea());
    }
}
