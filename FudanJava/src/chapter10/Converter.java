package chapter10;

@FunctionalInterface
interface Converter<F, T> {
    T convert(F from);
}
