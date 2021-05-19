package HomeworkBook.Homework_10_2;

public class RandomIntSequence implements IntSequence {
    private int n;

    public boolean hasNext() {
        n = 10 + (int)(Math.random() * 90);
        return true;
    }

    public int next() {
        return n;
    }
}
