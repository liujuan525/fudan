package chapter5;

public class StackOfIntegers {
    private int[] elements;  // 用数组存放栈的元素
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    // 构造方法定义
    public StackOfIntegers() {
        this(DEFAULT_CAPACITY);
    }
    public StackOfIntegers(int capacity) {
        elements = new int[capacity];
    }
    // 进栈方法
    public void push(int value) {
        if (size >= elements.length) {
            // 创建一个长度是原数组长度2倍的数组
            int[] temp = new int[elements.length * 2];
            // 将原来数组元素复制到新数组中
            System.arraycopy(elements,0, temp,0,elements.length);
            elements = temp;
        }
        elements[size++] = value;
    }
    // 出栈方法
    public int pop() {
        return elements[--size];
    }
    // 返回栈顶元素方法
    public int peek() {
        return elements[size - 1];
    }
    // 判空方法
    public boolean empty() {
        return size == 0;
    }
    public int getSize() {
        return size;
    }
}
