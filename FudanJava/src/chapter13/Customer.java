package chapter13;

import java.io.Serializable;

public class Customer implements Serializable {
    public int id;            // 客户号
    public String name;       // 姓名
    public String address;     // 地址
    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
