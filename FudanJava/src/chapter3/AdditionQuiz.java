package chapter3;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args)
    {
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        System.err.print(number1 + "+" + number2 + "=");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();
        if (answer == (number1 + number2)) {
            System.out.println("恭喜你，答对了！");
        } else {
            System.out.println("很遗憾，答错了！");
            System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
        }
    }
}
