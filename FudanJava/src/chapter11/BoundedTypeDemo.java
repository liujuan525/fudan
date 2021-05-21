package chapter11;

import java.util.ArrayList;
import java.util.List;

public class BoundedTypeDemo {
    public static double getAverage(List<? extends Number> numberList) {
        double total = 0.0;
        for (Number number :numberList) {
            total += number.doubleValue();
        }
        return total/numberList.size();
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(30);
        integerList.add(300);
        System.out.println(getAverage(integerList));

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(5.5);
        doubleList.add(55.5);
        System.out.println(getAverage(doubleList));
    }
}
