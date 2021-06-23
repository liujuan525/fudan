package review;

//9. 使用下面的格式编写一个方法，统计参数字符串中包含字母的个数。
//public static int countLetters(String s)
//        例如，按如下调用该方法将输出7.
//        System.out.println(countLetters(“Beijing 2022”));

public class countLetters {
    public static void main(String[] args) {
        System.out.println(countLetters("Beijing 2022"));
    }

    public static int countLetters(String s) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                n = n + 1;
//                System.out.println(c);
            }
        }
        return n;
    }
}
