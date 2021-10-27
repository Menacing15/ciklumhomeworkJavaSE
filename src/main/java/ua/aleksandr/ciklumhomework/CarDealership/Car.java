package ua.aleksandr.ciklumhomework.CarDealership;

public class Car {
    private String brand;
    private int price;

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String name) {
        this.brand = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + " for " + price + "$";
    }
}
