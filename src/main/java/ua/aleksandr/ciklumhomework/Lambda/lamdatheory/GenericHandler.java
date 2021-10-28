package ua.aleksandr.ciklumhomework.Lambda.lamdatheory;

@FunctionalInterface
public interface GenericHandler <T> {
    T work(T t);
}
