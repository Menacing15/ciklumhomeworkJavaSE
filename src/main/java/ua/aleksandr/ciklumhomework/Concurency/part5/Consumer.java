package ua.aleksandr.ciklumhomework.Concurency.part5;

import java.util.List;

public class Consumer implements Runnable {
    private List<Integer> questions;

    public Consumer(List<Integer> questions) {
        this.questions = questions;
    }

    public void answerQuestions() throws InterruptedException {
        synchronized (questions) {
            if (questions.isEmpty()) {
                Part5.log.info("No questions");
                questions.wait();
            }
        }

        synchronized (questions) {
            Thread.sleep(1000);
            Part5.log.info("Answered question: " + questions.remove(0));
            questions.notify();
        }

    }

    @Override
    public void run() {
        try {
            while(true) {
                answerQuestions();
            }
        } catch (InterruptedException e) {
            Part5.log.error(e.getMessage());
        }
    }
}
