package chapter18;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerDemo {
    public static void main(String[] args) {
        try(
                ServerSocket server = new ServerSocket(8080);
                Socket socket = server.accept();
                BufferedReader is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter os = new PrintWriter(socket.getOutputStream());
                Scanner input = new Scanner(System.in);
        ){
            System.out.println("客户端:" + is.readLine()); // 显示从客户端读的数据
            System.out.print("服务器端:");
            String line = input.nextLine(); // 从键盘读一行数据
            while (!line.equals("bye")) {
                os.println(line); // 将数据发送到客户端
                os.flush();
                System.out.println("客户端:" + is.readLine()); // 显示从客户端读的数据
                System.out.print("服务器端:");
                line = input.nextLine();         // 从键盘读一行数据
            }
        } catch(Exception e) {
            System.out.println("发生异常:" + e);
        }
    }
}
