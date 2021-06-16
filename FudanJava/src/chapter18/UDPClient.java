package chapter18;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class UDPClient{
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            Scanner input = new Scanner(System.in);
            while (true) {
                System.out.print("请输入字符串：");
                String message = input.nextLine();
                byte[] bufsend = message.getBytes();
                //用于发送数据的数据报
                DatagramPacket packet = new DatagramPacket(bufsend, message.length(), InetAddress.getLocalHost(),8888);
                socket.send(packet);
                if (message.equals("bye")) {
                    break;
                }
                //用于接收数据的数据报
                byte[] bufrec = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(bufrec, bufrec.length);
                socket.receive(receivePacket);
                String received = new String(bufrec,0, receivePacket.getLength());
                System.out.println("从服务器返回的字符串：" + received);
            }
            socket.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

