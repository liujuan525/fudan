package review;

// 计算 1/3 + 3/5 + ... + 97/99 之和

public class Sum {
    public static void main(String[] args) {
        int n = 1;
        double sum = 0;
        while (n < 99) {
            sum = sum + (double) n / (n + 2);
            n = n + 2;
        }
        System.out.println("sum = " + sum);
    }
}
