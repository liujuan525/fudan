package chapter11;

public class WarningDemo {
    // 该方法是非泛型方法
    public static Node createNode() {
        return new Node();
    }

    public static void main(String[] args) {
        Node<String> node = createNode();
        node.setData("hello");
        node.showType();
    }
}
