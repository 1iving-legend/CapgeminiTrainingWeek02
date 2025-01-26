package main.vehicle_rental_system;

public class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    public double calculateInsurance() {
        return getRentalRate() * 0.05;
    }

    public String getInsuranceDetails() {
        return "main.vehicle_rental_system.main.ridehailingapplication.Bike Insurance: 5% of rental rate.";
    }
}
