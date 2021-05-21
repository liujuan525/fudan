package chapter11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WordFrequency {
    public static void main(String[] args) throws IOException {
        String line = null;
        String[] words = null;
        Map<String, Integer> m = new TreeMap<>();
        // 创建文件输入流
        BufferedReader br = new BufferedReader(new FileReader("proverb.txt"));
        while ((line = br.readLine()) != null) {
            words = line.split("[ ,.]"); // 每读一行将其解析成字符串数组
            for (String s : words) {
                Integer count = m.get(s);  // 返回单词的数量
                if (count == null) {          // 表示s不在m中
                    m.put(s, 1);
                } else {
                    m.put(s, count + 1);
                }
            }
        }
        System.out.println("共有" + m.size() + "个不同单词。");
        System.out.println(m);
    }
}
