package chapter12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0, area = 0;
        System.out.print("请输入半径值：");
        try {
            radius = input.nextDouble();
            if (radius < 0) {
                throw new NegativeValueException("半径值不能小于0");
            } else {
                area = Math.PI * radius * radius;
                System.out.printf("圆的面积是：%6.2f%n", area );
            }

        } catch (NegativeValueException ne) {
            System.out.println("发生异常：" + ne.getMessage());
        } catch (InputMismatchException ie) {
            System.out.println("发生异常：" + ie.getMessage());
        }
    }
}
