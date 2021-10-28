package ua.aleksandr.ciklumhomework.Concurency.part6;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private int questionNumber;
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        //while (true) {
        try {
            synchronized (this) {
                Part6.log.info("Got new question " + ++questionNumber);
                queue.put(questionNumber);
            }
        } catch (InterruptedException e) {
            Part6.log.error(e.getMessage());
        }
        //}
    }

    private synchronized int getNext() {
        int nextQuestion = questionNumber++;
        Part6.log.info("Got new question " + nextQuestion);
        return nextQuestion;
    }
}
