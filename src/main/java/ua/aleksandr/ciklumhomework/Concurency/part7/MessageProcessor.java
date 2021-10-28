package ua.aleksandr.ciklumhomework.Concurency.part7;

public class MessageProcessor implements Runnable{

    private int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run() {
        Part7.log.info(Thread.currentThread().getName() + " received message: " + message);
        respond();
        Part7.log.info(Thread.currentThread().getName() + " processed message: " + message);
    }

    private void respond() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Part7.log.error(e.getMessage());
        }
    }
}
