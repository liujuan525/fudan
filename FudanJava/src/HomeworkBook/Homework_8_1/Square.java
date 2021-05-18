package HomeworkBook.Homework_8_1;

public class Square implements Cloneable{
    private double length;

    public Square(double length) {
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public boolean equals(Square s) {
        if (this.length == s.length) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "Square[length=" + length + "]";
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Square sq1 = new Square(10);
        sq1.setLength(10);
        System.out.println(sq1);
        Square sq2 = (Square)sq1.clone();
        System.out.println(sq1);
        System.out.println(sq1.equals(sq2));
    }

}
