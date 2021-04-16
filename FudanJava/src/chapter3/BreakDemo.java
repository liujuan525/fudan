package chapter3;

public class BreakDemo {
    public static void main(String[] args) {
        start:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 2) {
                    break start;
                }
                System.out.println("i=" + i + ",j=" + j);
            }
        }
    }
}
