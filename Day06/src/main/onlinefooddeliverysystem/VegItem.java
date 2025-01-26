package main.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount(double percentage) {
        return calculateTotalPrice() - (calculateTotalPrice() * percentage / 100);
    }

    public String getDiscountDetails() {
        return "Discount available for Veg Items.";
    }
}
