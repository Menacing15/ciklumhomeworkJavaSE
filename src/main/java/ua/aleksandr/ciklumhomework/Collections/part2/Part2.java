package ua.aleksandr.ciklumhomework.Collections.part2;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Part2 {

    static Logger log = Logger.getLogger(Part2.class.getName());

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle beamer = new Vehicle("BMW", "Z3",18000, false);
        vehicles.add(beamer);
        vehicles.add(new Vehicle("Mercedez-Benz","G-Class", 50000, true));

        for (Vehicle v : vehicles) {
            log.info(v.toString());
        }

        printList(vehicles);
    }

    public static <E> void printList(List<E> list) {
        for(E el : list) {
            log.info(el.toString());
        }
    }
}
