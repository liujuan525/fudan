package chapter12;

import java.io.IOException;

public class ThrowsExceptionDemo {
    public static void method() throws IOException {
        try {
            throw new IOException("文件未找到");
        } catch (IOException e) {
            System.out.println("捕获到异常");
            throw e;   // 将捕获到的异常对象再次抛出
        }
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (IOException e) {
            System.out.println("再次捕获：" + e);
        }
    }
}
