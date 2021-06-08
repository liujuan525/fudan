package chapter13;

import java.io.*;
import java.util.Scanner;

public class TextFileDemo {
    public static void main(String[] args) {
        File file = new File("number.txt");
        try(
                InputStream input = new FileInputStream(file);
                Scanner sc = new Scanner(input)
        ){
            while (sc.hasNextInt()) {
                int token = sc.nextInt();
                System.out.println(token);
            }
        }catch(IOException e){
            e.printStackTrace();}
    }
}
