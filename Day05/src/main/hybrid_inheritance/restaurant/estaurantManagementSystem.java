package main.hybrid_inheritance.restaurant;

class RestaurantManagementSystem {
    public static void main(String[] args) {
        // Create main.hybrid_inheritance.restaurant.Chef and main.hybrid_inheritance.restaurant.Waiter objects
        Chef chef = new Chef("John", 101);
        Waiter waiter = new Waiter("Alice", 102);

        // Perform their duties
        chef.performDuties();
        waiter.performDuties();

        // Display their details
        System.out.println("main.hybrid_inheritance.restaurant.Chef's Name: " + chef.getName() + ", ID: " + chef.getId());
        System.out.println("main.hybrid_inheritance.restaurant.Waiter's Name: " + waiter.getName() + ", ID: " + waiter.getId());
    }
}




