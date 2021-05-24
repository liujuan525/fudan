package chapter12;

public class ExceptionExample {
    static void makeexcept(int a) throws MyException {
        System.out.println("called makeexcept(" + a + ")");
        if (a == 0) {
            throw new MyException(a);
        }
        System.out.println("exit without exception");
    }
    public static void main(String[] args) {
        try {
            makeexcept(5);
            makeexcept(0);
        } catch (MyException e) {
            System.out.println("caught: " + e);
        }
    }
}
