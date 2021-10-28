package ua.aleksandr.ciklumhomework.Concurency.part4;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

    List<Product> soldProducts = new CopyOnWriteArrayList<>();
    //List<Product> purchaseProducts = new ArrayList<>();

    public void populateSoldProducts() {
        for (int i = 0; i < 1000; i++) {
            Product product = new Product(i, " milk" + i);
            soldProducts.add(product);
            Part4.log.info("ADDED: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void displaySoldProducts() {
        for (Product p : soldProducts) {
            Part4.log.info("SOLD: " + p);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
