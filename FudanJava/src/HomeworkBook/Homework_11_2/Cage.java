package HomeworkBook.Homework_11_2;

import java.util.HashSet;

public class Cage <E> extends HashSet <E> {
    Animal animal = new Animal();
    Lion lion = new Lion();
    Bird bird = new Bird();

    Cage<Animal> animalCage = new Cage<Animal>();
    Cage<Lion> lionCage = new Cage<Lion>();
    Cage<Bird> birdCage = new Cage<Bird>();

//        animalCage.add(animal);
//		lionCage.add(lion);
//		birdCage.add(bird);
}

/**
 * 笼子对象之间不具有子类关系，如果要创建一个能装各种动物的笼子，应该使用下面的形式声明Cage对象。
 * Cage<? extends Animal> someCage;
 */