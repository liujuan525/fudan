package chapter17;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    AtomicInteger count = new AtomicInteger(0);

    public void increment() {
        count.getAndIncrement();
    }
    public void decrement() {
        count.decrementAndGet();
    }
    public int getCount() {
        return count.get();
    }
}
