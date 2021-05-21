package chapter10;

public interface Person {
    public String getName();

    public default int getID() {
        return 0;
    }
}
