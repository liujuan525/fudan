package chapter9;

class Animal {
    public void eat() {
        System.out.println("I like eat anything.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public void eat() {
                System.out.println("I like eat bones.");
            }
        };
        dog.eat();
    }
}
