package chapter18;

import java.net.*;

public class SearchIP {
    public static void main(String[] args) {
        String hostname = "www.baidu.com";
        try {
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println(address);
            System.out.println("主机名：" + address.getHostName());
            System.out.println("IP地址：" + address.getHostAddress());
        } catch(UnknownHostException ex) {
            System.out.println(ex);
            System.out.println("给定的主机不存在");
        }
    }
}
