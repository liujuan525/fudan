package review;
//2.编写一个方法，合并给定的两个数组，方法的声明格式如下：
//public static int[] arrayMerge(int[] a, int[] b)
//例如，一个数组是{16,13,15,18}，另一个数组是{29,36,100}，返回的数组应该是{16,13,15,18,29,36,100}。

public class ArrayMerge {
    public static void main(String[] args) {
        int[] a = {16, 13, 15, 18};
        int[] b = {29, 36, 100};
        int[] result = arrayMerge(a, b);

        for (int s : result) {
            System.out.print(s + "  ");
        }
    }

    public static int[] arrayMerge(int[] a, int[] b) {
        int size = a.length + b.length;
        int[] result = new int[size];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            result[a.length + j] = b[j];
        }
        return result;
    }
}
