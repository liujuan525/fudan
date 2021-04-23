package chapter3;

import java.util.Scanner;

public class Practise_3_9 {
    public static void main(String[] args) {
        int comp = (int)(Math.random() * 3);
        int your;
        Scanner input = new Scanner(System.in);
        System.out.print("你出什么？（石头（2）、剪刀（1）、布（0））：");
        your = input.nextInt();
        System.out.print("计算机出的是：" + ((comp == 2) ? "石头" : ((comp == 1) ? "剪刀" : "布")));
        System.out.print(",你出" + ((your == 2) ? "石头" : ((your == 1) ? "剪刀" : "布")));
        if (comp == your) {
            System.out.print(",平局");
        } else if ((your - comp == 1 || your - comp == -2)){
            System.out.print(",你赢了");
        } else {
            System.out.print(",你输了");
        }
    }
}
