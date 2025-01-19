public class Main {
    public static void main(String[] args) {
        // Create product objects
        Product product1 = new Product("Laptop", 1200.99);
        Product product2 = new Product("Smartphone", 799.49);
        Product product3 = new Product("Headphones", 199.99);

        // Display details of each product
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Display total number of products created
        Product.displayTotalProducts();
    }
}

class Product {
    // Instance Variables
    private String productName;
    private double price;

    // Class Variable
    private static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance Method: Display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method: Display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}