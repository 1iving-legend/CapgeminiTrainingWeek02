package main.assisted_problems.vehicle;

public class Vehicle {

    private int  maxSpeed;
    private String fuelType;

    public Vehicle(String fuelType, int maxSpeed) {
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }


    public String getFuelType() {
        return fuelType;
    }

    public void displayInfo()
    {
        System.out.println("Fuel Type: " + getFuelType());
        System.out.println("Max Speed: " + getMaxSpeed());
    }

}

