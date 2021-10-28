package ua.aleksandr.ciklumhomework.Concurency.part4;

import org.apache.log4j.Logger;

public class Part4 {

    static Logger log = Logger.getLogger(InventoryManager.class.getName());

    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();
        Thread populate = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });

        Thread display = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        });

        populate.start();
        Thread.sleep(2000);
        //populate.join();
        display.start();
    }
}
