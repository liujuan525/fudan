package chapter10;

import java.util.function.BiFunction;

public class FunctionDmeo {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> fun = (width, length) -> width * length;

        double width = 7.0;
        double length = 10.0;
        double area = fun.apply(width, length);
        System.out.printf("%4.2f%n",area);
    }
}
