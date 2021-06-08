package chapter13;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

public class TextWriteRead {
    public static void main(String[] args) {
        Path path = Paths.get("article.txt");
        Charset chinaSet = Charset.forName("GB2312");
        char[] chars = { '\u4F60', '\u597D', ',', '中', '国' };
        // 向文件中写入数据
        try (BufferedWriter output = Files.newBufferedWriter(path, chinaSet)) {
            output.write(chars); // 将字符数组写入文件
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 从文件中读出数据
        try (BufferedReader input = Files.newBufferedReader(path, chinaSet)) {
            String line = input.readLine();
            while (line != null) {
                System.out.println(line);
                line = input.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
