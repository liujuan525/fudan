package chapter16.entity;

public class Product {
    private int id;
    private String pname;
    private String brand;
    private double price;
    private int stock;

    public Product() {
        super();
    }

    public Product (int id, String pname, String brand, double price, int stock) {
        this.id = id;
        this.pname = pname;
        this.brand = brand;
        this.price = price;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getId() + "  " + getPname() + "  "  + getPrice();
    }


}
