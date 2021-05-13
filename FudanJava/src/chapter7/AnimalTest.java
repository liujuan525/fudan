package chapter7;

class Animal{
    private String name = "Giant Panda";
    private void display(){
        System.out.println("My name is " + name);
    }
}
public class AnimalTest{
    public static void main(String[] args) {
        Animal a = new Animal();
//         System.out.println("a.name = " + a.name);
//          a.display();
    }
}
