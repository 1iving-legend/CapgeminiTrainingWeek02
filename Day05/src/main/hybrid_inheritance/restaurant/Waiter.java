package main.hybrid_inheritance.restaurant;

public class Waiter extends Person implements Worker {

    // Constructor
    public Waiter(String name, int id) {
        super(name, id);  // Call the superclass constructor
    }

    // Implementation of performDuties method from main.hybrid_inheritance.restaurant.Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is serving food to customers.");
    }
}
