package chapter7;

public class ElectricBicycle extends Bicycle {
    String factory;

    public ElectricBicycle() {
        System.out.println("ElectricBicycle");
    }

    public static void main(String[] args) {
        ElectricBicycle myBicycle = new ElectricBicycle();
        System.out.println(myBicycle);
    }
}
