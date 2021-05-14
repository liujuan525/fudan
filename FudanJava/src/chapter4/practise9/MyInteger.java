package chapter4.practise9;

// 4-9
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return value % 2 == 0 ? true : false;
    }

    public boolean isOdd() {
        return value % 2 == 1 ? true : false;
    }

    public boolean isPrime() {
        for (int divisor = 2; divisor < value / 2; divisor++) {
            if (value % divisor == 0) {
                return false;    // value is not prime
            }
        }
        return true;    // value is a prime
    }

    public static boolean isEven(int value) {
        return value % 2 == 0 ? true : false;
    }

    public static boolean isOdd(int value) {
        return value % 2 == 1 ? true : false;
    }

    public static boolean isPrime(int value) {
        for (int divisor = 2; divisor < value / 2; divisor++) {
            if (value % divisor == 0) {
                return false;    // value is not prime
            }
        }
        return true;    // value is a prime
    }

    public static boolean isEven(MyInteger myint) {
        int value = myint.getValue();
        return value % 2 == 0 ? true : false;
    }

    public static boolean isOdd(MyInteger myint) {
        int value = myint.getValue();
        return value % 2 == 1 ? true : false;
    }

    public static boolean isPrime(MyInteger myint) {
        int value = myint.getValue();
        for (int divisor = 2; divisor < value / 2; divisor++) {
            if (value % divisor == 0) {
                return false;    // value is not prime
            }
        }
        return true;    // value is a prime
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myint) {
        return this.value == myint.getValue();
    }

    public static int parseInt(char[] c) {
        int result = 0;
        int scale = 1;
        for (int i = c.length - 1; i >= 0; i--) {
            int d = c[i] - '0';
            result = result + d * scale;
            scale = scale * 10;
        }
        return result;
    }

    public static int parseInt(String s) {
        int result = 0;
        int scale = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int d = s.charAt(i) - '0';
            result = result + d * scale;
            scale = scale * 10;
        }
        return result;
    }

    public static void main(String[] args) {
        MyInteger myint = new MyInteger(7);
        System.out.println(myint.isEven());
        System.out.println(myint.isOdd());
        System.out.println(myint.isPrime());
        char []c = {'3','1','4'};
        System.out.println(MyInteger.parseInt(c) + 1);
        System.out.println(MyInteger.parseInt("9988123") + 1);
    }



}
