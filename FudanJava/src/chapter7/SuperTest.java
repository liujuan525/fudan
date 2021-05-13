package chapter7;

class Super {
    int x, y;

    public Super() {
        System.out.println("创建父类对象");
        setXY(5, 5);
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void display() {
        System.out.println("x = " + x + ", y = " + y);
    }
}

class Sub extends Super {
    int x, z; // x隐藏了父类Super中的变量x

    public Sub() {
        this(10, 10);
        System.out.println("创建子类对象");
    }

    public Sub(int x, int z) {
        super(); // 调用父类的默认构造方法
        this.x = x;
        this.z = z;
    }

    public void display() { // 覆盖了父类Super的display()方法
        super.display(); // 访问父类的display()方法
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("super.x = " + super.x + ", super.y = " + super.y);
    }
}

public class SuperTest {
    public static void main(String[] args) {
        Sub b = new Sub();
        b.display();
    }
}
