package chapter13;

import java.io.*;

public class OutputInputDemo {
    public static void main(String[] args) throws IOException {
        // 向文件中写数据
        File outputFile = new File("output.dat");
        try(
                FileOutputStream out = new FileOutputStream(outputFile);)
        {
            for (int i = 0; i < 10;i++) {
                int x = (int)(Math.random() * 90) + 10;
                out.write(x);     // 只把整数低8位写入输出流
            }
            out.flush();        // 刷新输出流
        } catch(IOException e) {
            System.out.println(e.toString());
        }
        // 从文件中读数据
        File inputFile = new File("output.dat");
        try(
                FileInputStream in = new FileInputStream(inputFile);)
        {
            int c;
            while ((c = in.read()) != -1){
                System.out.print(c + " ");
            }
        }catch(IOException e){
            System.out.println(e.toString());
        }
    }
}
