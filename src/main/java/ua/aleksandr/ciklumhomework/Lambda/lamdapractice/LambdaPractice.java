package ua.aleksandr.ciklumhomework.Lambda.lamdapractice;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaPractice {

    static Logger log = Logger.getLogger(LambdaPractice.class.getName());

    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("BENZ", "TRUCK", "BLACK ", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500)
        );


        printCarsPriceRange(cars, 18000, 22000);
        printCarByColor(cars, "Red");

        //1
        log.info("Printing cars between price 18000 and 22000");
        printCars(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car c) {
                return c.getPrice() >= 18000 && c.getPrice() <= 22000;
            }
        });

        log.info("Printing cars that are blue");
        printCars(cars, new Predicate<Car>() {

            @Override
            public boolean test(Car c) {
                return c.getColor().equals("Blue");
            }

        });

        //2
        log.info("Printing cars between price 18000 and 22000");
        printCars(cars, c -> c.getPrice() >= 18000 && c.getPrice() <= 22000);

        log.info("Printing cars that are blue");
        printCars(cars, c -> c.getColor().equals("Blue"));

        //3
        Function<Car, String> priceAndColor = (c) -> "price = " + c.getPrice() + " color = " + c.getColor();
        String stringCar = priceAndColor.apply(cars.get(0));
        log.info(stringCar);

    }

    //using built-in func interface
    public static void printCars(List<Car> cars, Predicate<Car> predicate) {
        for (Car c : cars) {
            if (predicate.test(c)) {
                c.printCar();
            }
        }
    }

    //using self-made func interface
    /*public static void printCars(List<Car> cars, CarCondition<Car>condition) {
        for(Car c: cars) {
            if(condition.test(c)) {
                c.printCar();
            }
        }
    }*/


    public static void printCarsPriceRange(List<Car> cars, int low, int high) {
        for (Car c : cars) {
            if (low <= c.getPrice() && c.getPrice() <= high) {
                c.printCar();
            }
        }
    }

    public static void printCarByColor(List<Car> cars, String color) {
        for (Car c : cars) {
            if (c.getColor().equals(color)) {
                c.printCar();
            }
        }
    }
}



