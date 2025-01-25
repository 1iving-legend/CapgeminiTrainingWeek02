package main.hybrid_inheritance.vehicle;

public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Create main.hybrid_inheritance.vehicle.ElectricVehicle and main.hybrid_inheritance.vehicle.PetrolVehicle objects
        ElectricVehicle electricCar = new ElectricVehicle("Tesla Model S", 250);
        PetrolVehicle petrolCar = new PetrolVehicle("Ford Mustang", 220);

        // Perform operations on main.hybrid_inheritance.vehicle.ElectricVehicle
        System.out.println("Electric main.hybrid_inheritance.vehicle.Vehicle: " + electricCar.getModel() + " with max speed: " + electricCar.getMaxSpeed() + " km/h");
        electricCar.charge();  // Charge the electric vehicle

        // Perform operations on main.hybrid_inheritance.vehicle.PetrolVehicle
        System.out.println("\nPetrol main.hybrid_inheritance.vehicle.Vehicle: " + petrolCar.getModel() + " with max speed: " + petrolCar.getMaxSpeed() + " km/h");
        petrolCar.refuel();  // Refuel the petrol vehicle
    }
}



