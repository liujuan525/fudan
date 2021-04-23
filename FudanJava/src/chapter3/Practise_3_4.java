package chapter3;

import java.util.Scanner;

/**
 * b方-4ac, >0,
 */
public class Practise_3_4 {
    public static void main(String[] args) {
        double a, b, c, discrim;
        double root1, root2;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入a,b,c的值：");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        discrim = b * b - 4 * a * c;
        if (discrim < 0) {
            System.out.println("方程无实根");
        } else {
            root1 = (-b + Math.sqrt(discrim)) / (2 * a);
            root2 = (-b - Math.sqrt(discrim)) / (2 * a);
            System.out.println("第一个根是：" + root1);
            System.out.println("第二个根是：" + root2);
        }
    }
}
