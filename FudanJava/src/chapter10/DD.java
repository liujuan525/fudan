package chapter10;

public class DD implements CC {
    // 实现AA接口中的display方法
    public void display() {
        System.out.println("接口AA的display方法");
    }

    // 实现BB接口中的show方法
    public void show() {
        System.out.println("接口BB的show方法");
    }

    // 测试DD类的使用
    public static void main(String[] args) {
        DD dd = new DD();
        System.out.println(DD.STATUS);
        dd.show();
        dd.print(); // 调用继承来的默认方法
        AA aa = new DD();
        aa.display();
    }
}
