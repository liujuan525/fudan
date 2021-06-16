package chapter18;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (
                Socket socket = new Socket("localhost", 80);
             DataInputStream isFromServer = new DataInputStream(socket.getInputStream());
             DataOutputStream osToServer = new DataOutputStream(socket.getOutputStream());
             Scanner sc = new Scanner(System.in);
             ) {
            while (true) {
                System.out.print("请输入圆半径值：");
                double radius = sc.nextDouble();
                osToServer.writeDouble(radius);
                osToServer.flush();
                double area = isFromServer.readDouble();
                System.out.println("圆的面积是: " + area);
            }

        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
