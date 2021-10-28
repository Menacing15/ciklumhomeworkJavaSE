package ua.aleksandr.ciklumhomework.Concurency.part3;

public class Sequence {

    private int value;

    public synchronized int getNext() {
        //synchronized () {
        value++;
        return value;
        //}
    }
}
