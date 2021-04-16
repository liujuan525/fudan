package chapter3;

import java.util.Scanner;

/**
 * 输入学生的百分制成绩，打印输出等级的成绩。等级规 定为，90分（包括）以上的为“优秀”，80分（包括） 以上的为“良好”，70分（包括）以上的为“中等”，
 * 60分（包括）以上的为“及格”，60分以下为“不及格 ”。
 */
public class ScoreLevel {
    public static void main(String[] args) {
        double score;
        Scanner input = new Scanner(System.in);
        System.out.println("输入学生的百分之成绩：");
        score = input.nextDouble();
        String level = "";
        if (score > 100 || score < 0) {
            System.out.println("输入的成绩不正确！");
            System.exit(0);
        } else if (score >= 90) {
            level = "优秀";
        } else if (score >= 80) {
            level = "良好";
        } else if (score >= 70) {
            level = "中等";
        } else if (score >= 60) {
            level = "及格";
        } else {
            level = "不及格";
        }
        System.out.println("你的成绩等级是："+ level);
    }
}
