package chapter9;

import java.util.Date;

public class DeprecatedDemo {
    @Deprecated
    public void badMethod() {
        System.out.println("Deprecated");
    }

    public static void main(String[] args) {
        Date date = new Date(2021, 5, 19);
        System.out.println(date.getMonth());
        System.out.println(date.getYear());

        DeprecatedDemo deprecatedDemo = new DeprecatedDemo();
        deprecatedDemo.badMethod();
    }
}
