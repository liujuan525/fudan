package chapter12;

public class MultiCatchDemo {
    public static void main(String[] args) {
        int a = 88, b = 0;
        int result;
        char[] letter = {'A', 'B', 'C'};
        for (int i = 0; i < 2; i ++) {
            try {
                if (i == 0) {
                    result = a / b;   // 产生ArithmeticException
                } else {
                    letter[5] = 'X';  // 产生ArrayIndexOutOfBoundsException
                }
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException me) {
                System.out.println("捕获到异常：" + me);
            }
        }
        System.out.println("处理多重捕获之后。");
    }
}
