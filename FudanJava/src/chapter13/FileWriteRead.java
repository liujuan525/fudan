package chapter13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileWriteRead{
    public static void main(String[] args) {
        // 写入文本
        Path textFile = Paths.get("speech.txt");
        Charset charset = Charset.forName("UTF-8");
        String line1 = "使用java.nio.file.Files类";
        String line2 = "读写文件很容易。";
        List<String> lines = Arrays.asList(line1,line2);
        try {
            Files.write(textFile, lines, charset, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        // 读取文本
        List<String> linesRead = null;
        try {
            linesRead = Files.readAllLines(textFile, charset);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (linesRead !=null) {
            for (String line:linesRead) {
                System.out.println(line);
            }
        }
    }
}
