package main.hybrid_inheritance.vehicle;

public class PetrolVehicle extends Vehicle implements Refuelable {

    // Constructor
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);  // Call the superclass constructor
    }

    // Implementation of refuel method from main.hybrid_inheritance.vehicle.Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }
}
