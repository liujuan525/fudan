package HomeworkBook;

import java.util.Scanner;

public class Homework_2_1 {
    public static void main(String[] args) {
        double fDegree;
        double cDegree;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入华氏温度：");
        fDegree = input.nextDouble();

        cDegree = (5 / 9.0) * (fDegree - 32);
        System.out.println("华氏温度：" + fDegree);
        System.out.println("摄氏温度：" + cDegree);
    }
}
