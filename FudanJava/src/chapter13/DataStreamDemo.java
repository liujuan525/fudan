package chapter13;

import java.io.*;

public class DataStreamDemo {
    public static void main(String[] args) {
        // 向文件中写数据
        try(
                FileOutputStream output = new FileOutputStream("data.dat");
                DataOutputStream dataOutStream = new DataOutputStream(
                        new BufferedOutputStream(output));
        ){
            dataOutStream.writeDouble(123.456);
            dataOutStream.writeInt(100);
            dataOutStream.writeUTF("Java语言");
        } catch(IOException e) {
            e.printStackTrace();
        }
        System.out.println("数据已写到文件中。");
        // 从文件中读取数据
        try(
                FileInputStream input = new FileInputStream("data.dat");
                DataInputStream dataInStream = new DataInputStream(
                        new BufferedInputStream(input));
        ){
            while (dataInStream.available() > 0) {
                double d = dataInStream.readDouble();
                int i = dataInStream.readInt();
                String s = dataInStream.readUTF();
                System.out.println("d = "+ d);
                System.out.println("i = "+ i);
                System.out.println("s = "+ s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
