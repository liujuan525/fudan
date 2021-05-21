package chapter10;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("one", "two", "three", "four");
        list.forEach(x -> System.out.println(x));
    }
}
