package review.code3;

//3.按照下面要求定义类和创建对象。
//（1）定义一个名为Person的类，其中含有一个String类型的成员变量name和一个int类型的成员变量age，为该类定义一个名为speak的方法，在其中输出其name和age的值。
//（2）为Person类定义一个带参数构造方法，通过给出姓名和年龄创建Person对象。定义默认构造方法，在该方法中调用有参数构造方法，将人的姓名设置为“张三”，年龄设置为20。
//定义一个名为Employee类表示员工，它继承Person类，要求定义一个变量salary表示员工工资。定义computeSalary(double hours, int rate)方法计算员工工资，这里hours表示员工工作时间，rate表示每小时工资。定义默认构造方法和带name、age和salary参数的构造方法。

public class Person {
    String name;
    int age;

    public Person() {
        new Person("张三", 20);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void speak() {
        System.out.println("姓名：" + name);
        System.out.println("年龄：" + age);
    }
}
