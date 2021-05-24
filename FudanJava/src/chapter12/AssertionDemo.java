package chapter12;

public class AssertionDemo {
    public static void main(String[]args) {
        int i;
        int sum = 0;
        for (i = 0; i < 100; i++) {
            sum = sum + i;
        }
        assert i == 10;   // 断言i的值为10
        assert sum > 10 && sum < 50: "sum is " + sum;
        System.out.println("sum = " + sum);
    }
}
