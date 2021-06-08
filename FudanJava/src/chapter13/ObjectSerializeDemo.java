package chapter13;

import java.io.*;
import java.time.LocalDate;

public class ObjectSerializeDemo {
    public static void main(String[] args) {
        Customer customer = new Customer(101,"刘明","北京市海淀区");
        LocalDate today = LocalDate.now();
        // 序列化
        try(
            OutputStream output = new FileOutputStream("customer.dat");
            ObjectOutputStream oos = new ObjectOutputStream(output)){
            oos.writeObject(customer); // 写入一个客户对象
            oos.writeObject(today); // 写入一个日期对象
        } catch(IOException e) {
            e.printStackTrace();
        }
        // 反序列化
        try(
                InputStream input = new FileInputStream("customer.dat");
                ObjectInputStream ois = new ObjectInputStream(input)){
            while (true) {
                try {
                    customer = (Customer)ois.readObject();
                    System.out.println("客户号:" + customer.id);
                    System.out.println("姓名:" + customer.name);
                    System.out.println("地址:" + customer.address);
                    today = (LocalDate)ois.readObject();
                    System.out.println("日期:" + today);
                } catch(EOFException e) {
                    break;
                }
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}

