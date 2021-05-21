package chapter10;

public interface Identified {
    public default int getID() {
        return Math.abs(hashCode());
    }
}
