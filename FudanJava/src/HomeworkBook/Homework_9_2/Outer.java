package HomeworkBook.Homework_9_2;

public class Outer {
    class Inner {
        public void show() {
            System.out.println("Class Inner");
        }
    }

    public Inner makeInner() {
        return new Inner();
    }

    public static void main(String [] args) {
        Inner inner = new Outer().makeInner();
        inner.show();
    }
}
