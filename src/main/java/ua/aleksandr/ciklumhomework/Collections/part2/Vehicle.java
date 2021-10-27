package ua.aleksandr.ciklumhomework.Collections.part2;

public class Vehicle {
    private String make;
    private String model;
    private int price;
    private boolean fourWheelDrive;

    public Vehicle(String make, String model, int price, boolean fourWheelDrive) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fourWheelDrive=" + fourWheelDrive +
                '}';
    }
}
