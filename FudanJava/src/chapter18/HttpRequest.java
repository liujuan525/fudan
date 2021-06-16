package chapter18;

import java.io.InputStream;
import java.io.IOException;

public class HttpRequest {
    private InputStream input;
    private String uri;
    public HttpRequest(InputStream input) {
        this.input = input;
    }
    public void parse() {
        // 从socket读取一组字符
        StringBuilder request = new StringBuilder(2048);
        int i;
        byte[] buffer = new byte[2048];
        try {
            i = input.read(buffer);
        } catch (IOException e) {
            e.printStackTrace();
            i = -1;
        }
        for (int j = 0; j < i; j++) {
            request.append((char) buffer[j]);
        }
        System.out.print(request.toString());
        uri = parseUri(request.toString());
    }

    private String parseUri(String requestString) {
        int index1 = requestString.indexOf(' ');
        int index2;
        if (index1 != -1) {
            index2 = requestString.indexOf(' ', index1 + 1);
            if (index2 > index1) {
                return requestString.substring(index1 + 1, index2);
            }
        }
        return null;
    }
    public String getUri() {
        return uri;
    }
}

