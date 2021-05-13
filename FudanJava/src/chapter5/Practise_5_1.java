package chapter5;

import java.util.Scanner;

public class Practise_5_1 {
    public static void main(String[] args) {
        int [] a = new int[5];
        int sum, max, min;
        double avg = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("请输入5个整数：");
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
        }
        max = a[0];
        min = a[0];
        sum = a[0];
        for (int i = 1; i < a.length; i++) {
            sum = sum + a[i];
            if (a[i] >= max) {
                max = a[i];
            }
            if (a[i] <= min) {
                min = a[i];
            }
        }
        avg = ((double) sum) / a.length;
        System.out.println("max=" + max);
        System.out.println("min=" + min);
        System.out.println("sum=" + sum);
        System.out.println("avg=" + avg);

    }

}
