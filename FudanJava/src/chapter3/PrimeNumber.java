package chapter3;

/**
 * 素数又称质数，有无限个。素数定义为在大于1的正整数中，除了1和它本身以外不再有其他因数的数。 思路：
 * 判断一个正整数number是否是素数，从2开始判断number是否能被这个数整除，若能被它整除，则不是素数，一直到number-1为止，若都不能整除，则是素数。
 */
public class PrimeNumber {
    public static void main(String[] args) {
        for (int n = 1;n <= 1000; n++) {
            int sum = 1;
            for (int k = 2;k < n;k++){
                if (n % k == 0)
                    sum = sum + k;
            }
            if (sum == n) {
                System.out.println(n);
            } else {
                continue;
            }
        }
    }
}
