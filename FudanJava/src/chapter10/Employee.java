package chapter10;

public class Employee implements Person, Identified {
    String name;

    public String getName() {
        return this.name;
    }

    public int getID() {
        return Identified.super.getID();
    }
}
