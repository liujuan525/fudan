package chapter13;

import java.io.*;
import java.nio.file.*;

public class FileDemo {
    public static void main(String[] args) {
        Path source = Paths.get("report.txt");
        Path target = Paths.get("backup.bmp");

        try {
            Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
        } catch (NoSuchFileException nse) {
            nse.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        System.out.println("文件移动完毕！");
    }
}

