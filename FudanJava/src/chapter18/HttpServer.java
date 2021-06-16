package chapter18;

import java.net.Socket;
import java.net.ServerSocket;
import java.net.InetAddress;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;

public class HttpServer {
    // 停止服务器命令
    private static final String SHUTDOWN_COMMAND = "/shutdown";
    private boolean shutdown = false;
    public void listen() {
        ServerSocket serverSocket = null;
        int port = 8099;
        try {
            serverSocket = new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        // 循环等待一个请求
        while (!shutdown) {
            Socket socket = null;
            InputStream input = null;
            OutputStream output = null;
            try {
                socket = serverSocket.accept();    //等待客户端连接
                input = socket.getInputStream();
                output = socket.getOutputStream();
                // 创建请求对象
                HttpRequest request = new HttpRequest(input);
                request.parse();
                // 创建响应对象
                HttpResponse response = new HttpResponse(output);
                response.setRequest(request);
                response.sendStaticResource();
                // 关闭socket
                socket.close();
                // 检查URI是否是关闭服务器命令
                shutdown = request.getUri().equals(SHUTDOWN_COMMAND);
            } catch (Exception e) {
                e.printStackTrace();
                continue;
            }
        }
    }
    public static void main(String[] args) {
        HttpServer server = new HttpServer();
        server.listen();
    }
}

