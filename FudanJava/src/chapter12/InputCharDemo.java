package chapter12;

import java.io.IOException;

public class InputCharDemo {
    public static void main(String[] args) {
        System.out.print("请输入一个字符：");
        try {
            char c = (char) System.in.read();
            System.out.println("c = " + c);
        } catch (IOException  e) {
            System.out.println(e);
        }
    }
}
