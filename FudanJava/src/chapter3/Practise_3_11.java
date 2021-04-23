package chapter3;

/**
 * 编写一个程序，显示从100-1000所有能被5和6整除的数，每行显示10个，数字之间用一个空格字符隔开。
 */
public class Practise_3_11 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 1000; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                count++;
                if (count % 10 == 0) {
                    System.out.println(i);
                    count = 0;
                } else {
                    System.out.print(i + " ");
                }
            }

        }
    }
}
