package chapter11;

public class Node<T> {
    private T data;
    public Node() {

    }
    public Node(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public void showType() {
        System.out.println("T的类型是:" + data.getClass().getName());
    }
}
