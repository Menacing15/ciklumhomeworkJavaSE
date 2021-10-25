package CarDealership;

import org.apache.log4j.Logger;

import java.util.Random;

public class Dealership {

    static Logger log = Logger.getLogger(Dealership.class.getName());

    public static void main(String[] args) {
        Customer me = new Customer("Al And", 300000);
        Car bmw = new Car("BMW Z3", 17000);
        Customer friend = new Customer("Tar Dmyt", 300000);
        Car benz = new Car("Mercedes-Benz G-Class", 215000);
        Customer bum = new Customer("No Name", 20000);
        Car juke = new Car("Nissan Juke 2021", 30000);
        Employee facelessEmployee = new Employee();

        me.purchaseCar(bmw, facelessEmployee, new Random().nextBoolean());
        friend.purchaseCar(benz, facelessEmployee, new Random().nextBoolean());
        bum.purchaseCar(juke, facelessEmployee, new Random().nextBoolean());
    }
}
