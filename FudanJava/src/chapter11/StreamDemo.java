package chapter11;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        String[] words = {"this", "is", "a", "java", "string"};
        Stream<String> stream = Stream.of(words);
        Optional<String> result = stream.max(String::compareTo);

        System.out.println(result.orElse(""));
    }
}
