package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> bigCities = new ArrayList<>();
        bigCities.add("北京");
        bigCities.add("上海");
        bigCities.add("广州");

        for (Iterator iterator = bigCities.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
