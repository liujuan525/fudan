package chapter13;

import java.io.*;

public class PrintWriterDemo {
    public static void main(String[]args) throws IOException {
        String fileName = "number.txt";
        try(
                FileWriter out = new FileWriter(new File(fileName));
                PrintWriter pw = new PrintWriter(out,true);
        ){
            for (int i = 0; i < 10; i++) {
                int num = (int)(Math.random() * 101) + 100;
                pw.println(num);
            }
        }

        try(
                FileReader in = new FileReader(new File(fileName));
                BufferedReader reader = new BufferedReader(in);
        ){
            String aLine = reader.readLine();
            while(aLine != null){
                System.out.println(aLine);
                aLine = reader.readLine();
            }
        }
    }
}
