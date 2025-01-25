package main.assisted_problems.vehicle;

public class Truck extends Vehicle {
  int capacity;

  public Truck(String fuelType, int maxSpeed, int capacity) {
      super(fuelType, maxSpeed);
      this.capacity = capacity;
  }
  @Override
    public void displayInfo() {
      super.displayInfo();
      System.out.println("Capacity: " + capacity);
  }
}
