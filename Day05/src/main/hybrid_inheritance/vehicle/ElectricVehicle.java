package main.hybrid_inheritance.vehicle;

public class ElectricVehicle extends Vehicle {

    // Constructor
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);  // Call the superclass constructor
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle...");
    }
}
