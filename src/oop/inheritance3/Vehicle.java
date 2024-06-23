package oop.inheritance3;

public class Vehicle {
    protected String model;
    int year;
    public String brand;

    public void move() {
        System.out.println("Vehicle is moving");
    }

    public boolean stop() {
        System.out.println("Vehicle is stopping");
        return true;
    }

    protected boolean start() {
        System.out.println("Vehicle is starting");
        return true;
    }

     Object accelerate() {
         System.out.println("Vehicle accelerates");
        return 6;
    }

    public Vehicle(String model, int year, String brand) {
        this.model = model;
        this.year = year;
        this.brand = brand;
    }
}
