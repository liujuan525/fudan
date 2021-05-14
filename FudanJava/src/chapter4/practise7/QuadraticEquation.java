package chapter4.practise7;

import java.util.Scanner;

// 4-7
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        double discriminant;
        discriminant = b * b - 4 * a * c;
        return discriminant;
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public static void main(String[] args) {
        double a, b, c;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入a,b,c值");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();
        System.out.println(discriminant);
        if (discriminant < 0) {
            System.out.println("方程无实数根");
        } else if (discriminant == 0) {
            System.out.println("方程的根为x = " + equation.getRoot1());
        } else {
            System.out.println("方程的根x1 = " + equation.getRoot1());
            System.out.println("方程的根x2 = " + equation.getRoot2());
        }
    }

}
