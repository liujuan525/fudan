package chapter8;

public class Car implements Cloneable {
    private int id;
    private String brand;
    private String color;
    public Car(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    public boolean equals(Object obj) {
        return this.id == ((Car)obj).id;
    }

    public String toString() {
        return "汽车:id = " + id + " brand =" + brand + " color =" + color;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Car c1 = new Car(101, "宝马", "棕色");
        Car c2 = (Car) c1.clone();
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));
        System.out.println(c1.getClass().getName());
        System.out.println(c1.hashCode());
        System.out.println(c1);
    }
}
