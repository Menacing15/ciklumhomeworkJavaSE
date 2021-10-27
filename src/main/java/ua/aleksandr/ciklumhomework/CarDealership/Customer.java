package ua.aleksandr.ciklumhomework.CarDealership;

public class Customer {
    private String name;
    private int cash;

    public Customer(String name, int cash) {
        this.name = name;
        this.cash = cash;
    }

    public void purchaseCar(Car car, Employee employee, boolean finance) {
        Dealership.log.info("Car " + car + " was purchased by " + this);
        employee.handle(this, car, finance);
    }

    public String getName() {
        return name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return name;
    }
}
