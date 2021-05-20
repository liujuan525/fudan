package chapter9;

interface Printable {
    public abstract void print(String message);
}
public class PrintableTest {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printable.print("这是惠普打印机");
    }
}
