package main.hybrid_inheritance.restaurant;

public class Chef extends Person implements Worker {

    // Constructor
    public Chef(String name, int id) {
        super(name, id);  // Call the superclass constructor
    }

    // Implementation of performDuties method from main.hybrid_inheritance.restaurant.Worker interface
    @Override
    public void performDuties() {
        System.out.println(name + " is cooking delicious food.");
    }
}
