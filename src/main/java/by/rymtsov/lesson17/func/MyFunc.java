package main.java.by.rymtsov.lesson17.func;

@FunctionalInterface
public interface MyFunc<T> {
    T doAction(T t);
}
