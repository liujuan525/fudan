package chapter3;

import java.util.Scanner;

/**
 * 从键盘输入一个百分制的成绩，输出五级制的成绩，如输入85，输出"良好"，要求使用switch结构实现。
 */
public class Practise_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入成绩：");
        double score = input.nextDouble() ;
        String grade = "";
        if (score > 100 || score < 0) {
            System.out.println("输入的成绩不正确。");
            System.exit(0);      // 结束程序运行
        } else {
            int g = (int)score / 10;
            switch(g)
            {
                case 10:
                case 9:
                    grade = "优秀";
                    break;
                case 8:
                    grade = "良好";
                    break;
                case 7:
                    grade = "中等";
                    break;
                case 6:
                    grade = "及格";
                    break;
                default:
                    grade = "不及格";
                    break;
            }
        }
        System.out.println("你的成绩为：" + grade);
    }
}
