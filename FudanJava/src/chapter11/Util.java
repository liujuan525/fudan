package chapter11;

public class Util {
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 5, 7};
        Util.<Integer>swap(numbers, 0, 3);
        for (Integer n : numbers) {
            System.out.println(n + " ");   // 输出7 3 5 1
        }

        Pair<Integer, String> p1 = new Pair<>(1, "apple");
        Pair<Integer, String> p2 = new Pair<>(1, "apple");
        //调用泛型方法
        boolean same = Util.<Integer, String>compare(p1, p2);
        System.out.println(same);     // 输出false

    }
}
