package ua.aleksandr.ciklumhomework.Concurency.part7;

import org.apache.log4j.Logger;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Part7 {

    static Logger log = Logger.getLogger(Part7.class.getName());

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable processor = new MessageProcessor(2);
        executor.execute(processor);

        Runnable processor2 = new MessageProcessor(3);
        executor.execute(processor2);

        Runnable processor3 = new MessageProcessor(4);
        executor.execute(processor3);

        executor.shutdown();
        //executor.shutdownNow();

        //while(!executor.isTerminated()) {

        //}

        executor.awaitTermination(10, TimeUnit.SECONDS);

        log.info("Executor is done");
    }
}
