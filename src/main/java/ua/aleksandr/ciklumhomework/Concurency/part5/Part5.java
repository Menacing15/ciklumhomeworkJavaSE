package ua.aleksandr.ciklumhomework.Concurency.part5;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Part5 {

    static Logger log = Logger.getLogger(Part5.class.getName());

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        Thread producer = new Thread(new Producer(list));
        Thread consumer = new Thread(new Consumer(list));

        producer.start();
        consumer.start();

    }
}
