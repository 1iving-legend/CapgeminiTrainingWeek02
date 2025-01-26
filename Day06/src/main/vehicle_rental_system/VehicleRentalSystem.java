package main.vehicle_rental_system;

import java.util.*;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", "Sedan", 1500));
        vehicles.add(new Bike("B202", "Sports main.vehicle_rental_system.main.ridehailingapplication.Bike", 500));
        vehicles.add(new Truck("T303", "Heavy main.vehicle_rental_system.Truck", 3000));

        for (Vehicle vehicle : vehicles) {
            System.out.println("main.vehicle_rental_system.main.ridehailingapplication.Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Type: " + vehicle.getType());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println(insurable.getInsuranceDetails());
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
            }
            System.out.println();
        }
    }
}