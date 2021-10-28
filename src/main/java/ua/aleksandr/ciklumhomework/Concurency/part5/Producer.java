package ua.aleksandr.ciklumhomework.Concurency.part5;

import java.util.List;

public class Producer implements Runnable {

    private List<Integer> questions;
    private final int LIMIT = 5;
    private int questionNumber;

    public Producer(List<Integer> questions) {
        this.questions = questions;
    }

    public void readQuestions(int questionNumber) throws InterruptedException {
        synchronized (questions) {
            if (questions.size() == LIMIT) {
                Part5.log.info("Too much questions, wait for answers");
                questions.wait();
            }
        }

        synchronized (questions) {
            Part5.log.info("New question: " + questionNumber);
            questions.add(questionNumber);
            Thread.sleep(100);
            questions.notify();
        }
    }

    @Override
    public void run() {
        try {
            while(true) {
                readQuestions(questionNumber++);
            }
        } catch (InterruptedException e) {
            Part5.log.error(e.getMessage());
        }
    }
}
