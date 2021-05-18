package HomeworkBook;

/**
 * 统计一个字符串中包含字母的个数
 */
public class Homework_6_4 {

    public static int countLetters(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ( c >= 'a' && c <= 'z' || c >='A' && c <= 'Z') {
                n = n + 1;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(countLetters("Beijing 2008"));
    }
}
