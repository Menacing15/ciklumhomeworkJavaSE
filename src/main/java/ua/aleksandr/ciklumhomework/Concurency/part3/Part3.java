package ua.aleksandr.ciklumhomework.Concurency.part3;

import org.apache.log4j.Logger;

public class Part3 {

    static Logger log = Logger.getLogger(Part3.class.getName());

    public static void main(String[] args) {
        Sequence sequence = new Sequence();

        for(int i = 0; i < 50; i++) {
            sequence.getNext();
        }

        Worker worker1 = new Worker(sequence);
        worker1.start();
        Worker worker2 = new Worker(sequence);
        worker2.start();
    }
}

class Worker extends Thread {

    private Sequence sequence;

    public Worker(Sequence sequence) {
        this.sequence = sequence;
    }

    public void run() {
        for(int i = 0; i < 50; i++) {
            Part3.log.info(this.getName() + " got value: " + sequence.getNext());
        }
    }
}
