package chapter7;

public class Bicycle extends Vehicle {
    private String brand;

    public Bicycle() {
        this("");
        System.out.println("Bicycle");
    }

    public Bicycle (String brand) {
        this.brand = brand;
    }
}
