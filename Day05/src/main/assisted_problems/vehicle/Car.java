package main.assisted_problems.vehicle;

public class Car extends Vehicle {
    int seatCount;


    public Car(String fuelType, int maxSpeed, int seatCount) {
        super(fuelType, maxSpeed);
        this.seatCount = seatCount;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Count: " + seatCount);
    }
}
