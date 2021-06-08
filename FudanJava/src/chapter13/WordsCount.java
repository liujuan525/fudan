package chapter13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordsCount {
    public static void main(String[] args) throws Exception {
        String fileName = "article.txt";
        int sum = 0;
        try(
                FileReader inFile = new FileReader(fileName);
                BufferedReader reader = new BufferedReader(inFile);
        ){
            String aLine = reader.readLine();
            while(aLine != null){
                String [] words = aLine.split("[ ,.]");
                sum = sum + words.length;
                aLine = reader.readLine();
            }
        }catch(IOException e) {
            System.out.println(e.toString());
        }
        System.out.println("单词数量为：" + sum);
    }
}
