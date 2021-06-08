package chapter13;

import java.io.*;

public class FileCopyDemo {
    public static void main(String[] args) {
        File inputFile = new File("input.txt");
        File outputFile = new File("output.txt");
        try(
                FileReader in = new FileReader(inputFile);
                FileWriter out = new FileWriter(outputFile);
        ){
            int c = in.read();
            while(c != -1) {
                out.write(c);
                c = in.read();
            }
        } catch(IOException e) {
            System.out.println(e.toString());
        }
        System.out.println("文件复制完毕！");
    }
}
