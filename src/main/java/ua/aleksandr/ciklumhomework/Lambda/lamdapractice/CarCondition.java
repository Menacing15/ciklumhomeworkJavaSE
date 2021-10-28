package ua.aleksandr.ciklumhomework.Lambda.lamdapractice;

@FunctionalInterface
interface CarCondition<T> {
    boolean test(T c);
}