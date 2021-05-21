package chapter11;

import java.util.stream.Stream;

public class StreamConcateDemo {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("Beijing", "Shanghai");
        Stream<String> stream2 = Stream.of("Sydney", "London", "Paris");
        Stream.concat(stream1, stream2).sorted().forEach(System.out::println);
    }
}
