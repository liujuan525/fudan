package chapter18;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) {
        byte[] buf = new byte[1024];
        try {
            DatagramSocket socket = new DatagramSocket(8888);
            System.out.println("服务器等待...");
            while (true) {
                //用于接收数据的数据报
                DatagramPacket packet = new DatagramPacket(buf, 1024);
                socket.receive(packet);
                String data = new String(buf, 0, packet.getLength());
                if (data.toLowerCase().equals("bye")) {
                    break;
                }
                System.out.println("客户数据：" + data);
                String send = data.toUpperCase();
                InetAddress clientIP = packet.getAddress(); // 返回客户端的IP地址
                int clientPort = packet.getPort(); // 返回客户端的端口号
                byte[] msg = send.getBytes();
                //用于发送数据的数据报
                DatagramPacket sendPacket = new DatagramPacket(msg, msg.length, clientIP, clientPort);
                socket.send(sendPacket);
            }
            socket.close();
            System.out.println("Server is closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
