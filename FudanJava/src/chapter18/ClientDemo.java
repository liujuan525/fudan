package chapter18;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket("127.0.0.1", 8080);
                BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter os = new PrintWriter(socket.getOutputStream());
                Scanner input = new Scanner(System.in);
        ) {
            System.out.print("客户端:");
            String line = input.nextLine();   // 从键盘读一行数据
            while (!line.equals("bye")) {
                os.println(line);       // 将数据发送到服务器
                os.flush();
                // 输出从服务器端读的一行数据
                System.out.println("服务器端:" + is.readLine());
                System.out.print("客户端:");
                line = input.nextLine();       // 从键盘读一行数据
            }
        } catch (Exception e) {
            System.out.println("发生异常:" + e);
        }
    }
}
