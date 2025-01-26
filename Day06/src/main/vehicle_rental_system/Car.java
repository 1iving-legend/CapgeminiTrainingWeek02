package main.vehicle_rental_system;

public class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.1;
    }

    public String getInsuranceDetails() {
        return "main.vehicle_rental_system.main.ridehailingapplication.Car Insurance: 10% of rental rate.";
    }
}
