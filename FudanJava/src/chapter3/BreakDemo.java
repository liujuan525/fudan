package chapter3;

public class BreakDemo {
    public static void main(String[] args) {
        int n = 1;
        int sum = 0;
        while (n <= 100) {
            sum += n;
            if (sum > 100) {
                break;
            }
            n = n + 2;
        }
        System.out.println("n = " + n);
        System.out.println("sum = " + sum);


//        start:
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                if (j == 2) {
//                    break start;
//                }
//                System.out.println("i=" + i + ",j=" + j);
//            }
//        }
    }
}
