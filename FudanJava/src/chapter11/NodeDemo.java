package chapter11;

import javafx.util.Pair;

public class NodeDemo {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(20, "twenty");
        Pair<String, String> p2 = new Pair<>("china", "Beijing");
        System.out.println(p1.getKey());
        System.out.println(p1.getValue());
    }
}
