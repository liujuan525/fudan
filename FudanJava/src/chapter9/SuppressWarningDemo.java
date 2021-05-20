package chapter9;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings(value = {"serial","deprecation"})
public class SuppressWarningDemo implements Serializable {
    public static void main(String[] args) {
        Date d = new Date(2017,10,30);
        System.out.println(d.getMonth());

        System.out.println(d);
    }
}
