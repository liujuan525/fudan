package chapter5;

public class VarargsDemo {
    // 可变参数要放置到最后
    public static double average(double ... values) {
        double sum = 0;
        for (double value:values) {
            sum = sum + value;   // 求数组元素之和
        }
        double average = sum / values.length;
        return average;
    }

    public static void main(String[] args){
        System.out.println(average(60, 70, 86));
    }
}
