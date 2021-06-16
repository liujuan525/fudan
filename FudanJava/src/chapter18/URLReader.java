package chapter18;

import java.net.*;
import java.io.*;

public class URLReader {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.baidu.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            FileWriter out = new FileWriter("index.html");
            String inputLine = in.readLine();
            while (inputLine != null) {
                out.write(inputLine);
            }
            in.close();
            out.close();
        } catch(IOException me) {
            System.out.println(me);
        }
    }
}
