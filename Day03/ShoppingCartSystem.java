class Product {
    static double discount; // Static variable for discount applicable to all products
    String productName; // Instance variable
    int price; // Instance variable
    int quantity; // Instance variable
    final int productId; // Final instance variable, product ID cannot be changed after initialization

    // Constructor to initialize a product with name, price, quantity, and ID
    public Product(String productName, int price, int quantity, int productId) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productId = productId; // Set the product ID (final, so can't be changed later)
    }

    // Static method to update the discount. This will affect all instances of Product.
    static void updateDiscount(double newDiscount) {
        discount = newDiscount; // Update the static discount variable
        System.out.println("Updated Discount: " + discount + " %"); // Print the updated discount
    }

    // Method to display the details of the product
    public void displayDetails() {
        System.out.println("Product name: " + productName); // Print product name
        System.out.println("Price: " + price); // Print price
        System.out.println("Quantity: " + quantity); // Print quantity
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Create a new product instance
        Product p1 = new Product("Coffee", 50, 1, 21);
        Product p2 = new Product("tea",10,1,22);

        // Check if p1 is an instance of Product class
        if (p1 instanceof Product) {
            p1.displayDetails(); // Display details of the product
            Product.updateDiscount(10); // Update discount for all products (static method)
            p2.displayDetails();
            Product.updateDiscount(20);
        }
    }
}
