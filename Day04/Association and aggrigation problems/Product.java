import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1500);
        Product product2 = new Product("Smartphone", 800);
        Product product3 = new Product("Headphones", 200);

        // Create a customer
        Customer customer = new Customer("Alice");

        // Create orders and add products
        Order order1 = new Order(101);
        order1.addProduct(product1);
        order1.addProduct(product2);

        Order order2 = new Order(102);
        order2.addProduct(product3);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Display customer details and their orders
        customer.displayCustomerDetails();
    }
}




// Product class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

// Order class
class Order {
    private int orderId;
    private ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        double total = 0;
        for (Product product : products) {
            System.out.println(" - " + product.getName() + " ($" + product.getPrice() + ")");
            total += product.getPrice();
        }
        System.out.println("Total: $" + total);
    }

    public int getOrderId() {
        return orderId;
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // Display customer details and their orders
    public void displayCustomerDetails() {
        System.out.println("Customer: " + name);
        if (orders.isEmpty()) {
            System.out.println("No orders placed.");
        } else {
            System.out.println("Orders placed:");
            for (Order order : orders) {
                order.displayOrderDetails();
            }
        }
    }

    public String getName() {
        return name;
    }
}



