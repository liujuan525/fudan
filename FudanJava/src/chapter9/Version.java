package chapter9;

public @interface Version {
    int major() default 1;
    int minor() default 0;
}
