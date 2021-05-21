package chapter10;

import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerDemo {
    public static void main(String[] args) {
        Function<Integer, String> spacer = (count) -> {
            StringBuilder sb = new StringBuilder(count);
            for (int i = 0; i < count; i++) {
                sb.append(" ");
            }
            return sb.toString();
        };

        int lineLength = 60; // 每行最大字符串
        Consumer<String> printCentered = (input) -> {
            int length = input.length();
            String spaces = spacer.apply((lineLength - length) / 2);
            System.out.println(spaces + input);
        };
        printCentered.accept("A lambda expression a day");
        printCentered.accept("makes you");
        printCentered.accept("look smarter");
    }
}
