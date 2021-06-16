package chapter18;

import java.io.*;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiServer {
    public static void  main(String[]args) throws IOException {
        int clientNo = 1;
        ServerSocket serverSocket = new ServerSocket(8088);
        // 创建线程执行器
        ExecutorService executor = Executors.newCachedThreadPool();
        try {
            System.out.println("服务器程序启动，开始接收客户的请求");
            while (true) {
                Socket socket = serverSocket.accept();
                InetAddress clientAddress = socket.getInetAddress();
                System.out.println("客户 " + clientNo + " 的主机名是 " + clientAddress.getHostName());
                System.out.println("客户 " + clientNo + " 的IP地址是 " + clientAddress.getHostAddress());
                // 将任务添加到执行器中
                executor.execute(new ComputeArea(socket, clientNo));
                clientNo++;
            }
        } finally {
            serverSocket.close();
        }
    }
}
// 计算圆面积的任务类
class ComputeArea implements Runnable {
    private Socket socket;
    private int clientNo;
    public ComputeArea(Socket socket, int clientNo) {
        this.socket = socket;
        this.clientNo = clientNo;
    }
    public void run() {
        try {
            DataInputStream isFromClient = new DataInputStream(socket.getInputStream());
            DataOutputStream osToClient = new DataOutputStream(socket.getOutputStream());
            while (true) {
                double radius = isFromClient.readDouble();
                System.out.println("从客户端接收的半径值:" + radius);
                double area = radius * radius * Math.PI;
                osToClient.writeDouble(area);
                osToClient.flush();
                // System.out.println("面积是:" + area);
            }
        } catch(IOException ex) {
            System.err.println(ex);
        }
    }
}
