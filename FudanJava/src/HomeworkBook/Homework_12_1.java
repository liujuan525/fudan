package HomeworkBook;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework_12_1 {
    public static void main(String[] args) {
        System.out.println("请输入圆的半径：");
        Scanner input = new Scanner(System.in);

        try{
            double radius = input.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.printf("area = %.2f%n", area);
        }catch(InputMismatchException e){
            System.out.println(e);
            System.out.println("输入的数据格式不正确!");
        }
    }
}

// 当输入数据不是字符串时抛出InputMismatchException异常，程序中应对该异常处理。