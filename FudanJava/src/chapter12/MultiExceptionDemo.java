package chapter12;

public class MultiExceptionDemo {
    public static void method(int value) {
        try {
            if (value == 0) {
                System.out.println("无异常发生.");
                return;
            } else if (value == 1) {
                int i = 0;
                System.out.println(4 / i);
            } else if (value == 2) {
                int iArray[] = new int [4];
                iArray[4] = 10;
            }
        } catch (ArithmeticException e) {
            System.out.println("捕获到:" + e.toString());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("捕获到:" + e.toString());
        } catch(Exception e) {
            System.out.println("Will not be excecuted");
        } finally {
            System.out.println("执行finally块:" + value);
        }
    }
    public static void main(String[] args){
        method(0);
        method(1);
        method(2);
    }
}
