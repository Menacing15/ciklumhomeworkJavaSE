package ua.aleksandr.ciklumhomework.Concurency.part1and2;

import org.apache.log4j.Logger;

public class Part1And2 {

    static Logger log = Logger.getLogger(Part1And2.class.getName());

    public static void main(String[] args) throws InterruptedException {
        Thread task1 = new TaskThread();
        task1.setName("Thread A");
        task1.start();

        Thread task2 = new TaskThread();
        task2.setName("Thread B");
        task2.start();

        Thread task3 = new TaskThread();
        task3.setName("Thread C");
        task3.start();

        Thread task4 = new TaskThread();
        task4.setName("Thread D");
        task4.start();

        Thread.sleep(1000);

        TaskRunnable runnable = new TaskRunnable("Runnable-1");
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(new TaskRunnable("Runnable-2"));
        thread2.start();

        Thread anonThread = new Thread(new Runnable() {
            @Override
            public void run() {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < 10; i++) {
                    sb.append(i);
                    sb.append(" ");
                }
                Part1And2.log.info(sb.toString());
            }
        });
        anonThread.setName("Hi anon thread!");
        anonThread.start();
    }
}

class TaskThread extends Thread {

    @Override
    public void run() {
        Part1And2.log.info("Thread execution starts - " + this.getName());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            sb.append(" ");
        }
        Part1And2.log.info(sb.toString() + " by " + this.getName());
    }
}

class TaskRunnable implements Runnable {

    private String name;

    public TaskRunnable(String name) {
        this.name = name;
    }
    @Override
    public void run() {
        Thread.currentThread().setName(name);
        Part1And2.log.info("Thread execution starts - " + name);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(i);
            sb.append(" ");
        }
        Part1And2.log.info(sb.toString() + " by " + name);
    }
}

