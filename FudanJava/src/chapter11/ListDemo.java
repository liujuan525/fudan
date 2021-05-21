package chapter11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> myPets = new ArrayList<>();
        myPets.add("cat");
        myPets.add("dog");
        myPets.add("horse");
        for (String pet : myPets) {
            System.out.println(pet + "  ");
        }
        String[] bigPets = { "tiger", "lion" };
        Collection<String> coll = new ArrayList<>();
        coll.add(bigPets[0]);
        coll.add(bigPets[1]);
        myPets.addAll(coll);
        System.out.println(myPets);
        Iterator<String> iterator = myPets.iterator();
        while (iterator.hasNext()) {
            String pet = iterator.next();
            System.out.println(pet);
        }
    }
}
