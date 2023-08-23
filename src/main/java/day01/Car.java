package day01;

public class Car {
    private String make;
    private String model;
    private int year;
    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    // Method
    public void startEngine() {
        System.out.println("Engine started!");
    }
    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022);
        // Accessing attributes and calling methods
        System.out.println("I drive a " + myCar.year + " " + myCar.make + " " + myCar.model);
        myCar.startEngine();
    }
}