package chapter5;

public class ArrayDemo {
    public static void main(String[] args) {
        double[] marks = new double[5];
        marks[0] = 79;
        marks[1] = 84.5;
        marks[2] = 63;
        marks[3] = 90;
        marks[4] = 98;
        System.out.println(marks[2]);
        System.out.println(marks.length);
        // 输出每个元素值
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + "  " );
        }
//        对数组元素的范围进行越界检查
        System.out.println(marks[5]);
    }
}
