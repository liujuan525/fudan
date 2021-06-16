package chapter18;

import java.io.*;
import java.net.*;

public class ReverseString {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/helloweb/reverseServlet.do");
            String stringToReverse = "HELLO";
            URLConnection connection = url.openConnection();
            connection.setDoOutput(true); //设置连接对象作为输出对象使用
            OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
            // 向服务器发送字符串
            out.write("string=" + stringToReverse);
            out.close();
            // 创建输入流读取返回的字符串
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            // 从服务器读取反转后的字符串
            String decodedString;
            while ((decodedString = in.readLine()) != null) {
                System.out.println(decodedString);
            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
