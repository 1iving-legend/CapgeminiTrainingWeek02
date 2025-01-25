package main.multilevel_inheritance.retail_order_management;

// Subclass: main.multilevel_inheritance.retail_order_management.ShippedOrder
public class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor for main.multilevel_inheritance.retail_order_management.ShippedOrder
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate); // Call to the base class constructor
        this.trackingNumber = trackingNumber;
    }

    // Override getOrderStatus method
    @Override
    public String getOrderStatus() {
        return "main.multilevel_inheritance.retail_order_management.Order shipped. Tracking Number: " + trackingNumber;
    }

    // Method to display shipped order details
    @Override
    public void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
