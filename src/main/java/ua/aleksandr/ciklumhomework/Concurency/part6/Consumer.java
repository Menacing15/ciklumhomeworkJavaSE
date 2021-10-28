package ua.aleksandr.ciklumhomework.Concurency.part6;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        //while (true) {
        try {
            Part6.log.info("Answered question " + queue.take());
        } catch (InterruptedException e) {
            Part6.log.error(e.getMessage());
        }
        //  }
    }
}
