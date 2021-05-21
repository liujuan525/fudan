package chapter11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamFilterDemo {
    public static void main(String[] args) {
        Path parent = Paths.get("..");
        try {
            Stream<Path> list = Files.walk(parent);
            list.filter((Path p) -> p.toString().endsWith(".java")).forEach(System.out::println);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
