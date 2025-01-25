package main.assisted_problems.vehicle;

public class Motorcycle extends Vehicle {
     String  type;
     public Motorcycle(String fuelType, int maxSpeed, String type) {
         super(fuelType, maxSpeed);
         this.type = type;
     }

     @Override
    public void displayInfo() {
         super.displayInfo();
         System.out.println("Type: " + type);
     }

}
