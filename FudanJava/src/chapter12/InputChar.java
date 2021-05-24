package chapter12;

import java.io.IOException;

public class InputChar {
    public static void main(String[] args) throws IOException {
        System.out.print("请输入一个字符：");
        char c = (char)System.in.read();
        System.out.println("c = " + c);
    }
}
