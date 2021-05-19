package chapter8;

import java.math.*;

public class LargeFactorial {
    public static BigInteger factorial(long n) {
        BigInteger bigInteger = BigInteger.ONE;
        System.out.println(bigInteger);

        for (long i = 1; i <= n; i++) {
            bigInteger = bigInteger.multiply(new BigInteger(i + ""));
        }
        return bigInteger;
    }

    public static void main(String[] args) {
        System.out.println("50! is \n" + factorial(50));
    }
}
