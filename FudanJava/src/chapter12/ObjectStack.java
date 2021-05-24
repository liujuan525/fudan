package chapter12;

public class ObjectStack {
    private static final int defaultSize = 10;
    private int size;
    private int top;
    private Object[] listarray;
    public ObjectStack() {
        initialize(defaultSize);
    }
    public ObjectStack(int size) {
        initialize(size);
    }
    private void initialize(int size) { // 栈初始化
        this.size = size;
        top = 0 ;
        listarray = new Object[size];
    }
    private void clear() {  // 栈清空方法
        top = 0 ;
    }
    private void push(Object it) { // 进栈方法
        assert top < size :  "栈溢出.";
        listarray[top++] = it;
    }
    private Object pop() { // 出栈方法
        assert !isEmpty(): "栈已空.";
        return listarray[--top];
    }
    private Object topValue() { // 返回栈顶元素方法
        assert !isEmpty(): "栈已空.";
        return listarray[top-1];
    }
    private boolean isEmpty() { // 判栈空方法
        return top == 0;
    }
    public static void main(String[] args) {
        ObjectStack os = new ObjectStack(3);
        System.out.println(os.isEmpty());

        try {
            os.push(new Integer(30));
            os.push(new Integer(20));
            os.push(new Integer(10));
//            os.push(new Integer(40)); // 抛出异常
            System.out.println(os.pop());
            System.out.println(os.pop());
            System.out.println(os.pop());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
