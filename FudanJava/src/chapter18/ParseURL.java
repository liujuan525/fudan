package chapter18;

import java.net.*;

public class ParseURL {
    public static void main(String[] args) {
        try {
            URL aURL = new URL("http://docs.oracle.com/javase/tutorial"
                    + "/index.html?name=networking");
            System.out.println("协议 = " + aURL.getProtocol());
            System.out.println("主机名 = " + aURL.getHost());
            System.out.println("端口号 = " + aURL.getPort());
            System.out.println("查询串 = " + aURL.getQuery());
            System.out.println("文件名 = " + aURL.getFile());

        } catch(MalformedURLException e) {
            System.out.println("URL不合法");
        }
    }
}
