package main.ridehailingapplication;

import java.util.*;

public class RideHailing{
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", "Alice", 10));
        vehicles.add(new Bike("B202", "Bob", 5));
        vehicles.add(new Auto("A303", "Charlie", 8));

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for 15 km: " + vehicle.calculateFare(15));

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                gps.updateLocation("City Center");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println();
        }
    }
}
