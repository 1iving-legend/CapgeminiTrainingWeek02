package main.multilevel_inheritance.retail_order_management;

// Main Class
public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        // Create an instance of main.multilevel_inheritance.retail_order_management.Order
        Order order = new Order(1001, "2025-01-15");
        System.out.println("--- main.multilevel_inheritance.retail_order_management.Order Details ---");
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());

        // Create an instance of main.multilevel_inheritance.retail_order_management.ShippedOrder
        ShippedOrder shippedOrder = new ShippedOrder(1002, "2025-01-16", "123456789");
        System.out.println("\n--- Shipped main.multilevel_inheritance.retail_order_management.Order Details ---");
        shippedOrder.displayOrderDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());

        // Create an instance of main.multilevel_inheritance.retail_order_management.DeliveredOrder
        DeliveredOrder deliveredOrder = new DeliveredOrder(1003, "2025-01-17", "987654321", "2025-01-20");
        System.out.println("\n--- Delivered main.multilevel_inheritance.retail_order_management.Order Details ---");
        deliveredOrder.displayOrderDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
