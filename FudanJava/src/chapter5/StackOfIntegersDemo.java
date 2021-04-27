package chapter5;

public class StackOfIntegersDemo {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        // 向栈中存入10个整数
        for (int i = 10; i < 20; i++) {
            stack.push(i);
        }
        // 弹出栈中的所有元素
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
