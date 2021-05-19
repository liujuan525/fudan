package HomeworkBook;

import java.io.IOException;

public class Homework_12_5 {
    public static void methodA() throws IOException {
        System.out.println("methodA");
    }

    public static void methodB() {
//        methodA();
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("methodB");
    }

    public static void main(String args[]) {
        methodB();
    }


}

/**
 * 编译器报错信息如下：
 * java: 未报告的异常错误java.io.IOException; 必须对其进行捕获或声明以便抛出
 */

/**
 * 如何处理：
 * 应该在 methodB() 方法中捕获异常，代码如上
 */

/**
 * 结论：
 * 如果方法中会抛出异常，则应该去捕获异常并进行处理，否则代码报错，后续代码会中断。
 */

