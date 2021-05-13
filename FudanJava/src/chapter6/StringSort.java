package chapter6;
// 起泡排序法，由小到大排序

public class StringSort {
    public static void main(String[] args) {
        String[] str = {"China", "USA", "Russia", "France", "England"};
        for (int i = str.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (str[j].compareTo(str[j+1]) > 0) {
                    String temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        for (String s: str) {
            System.out.print(s + " ");
        }
    }

}
