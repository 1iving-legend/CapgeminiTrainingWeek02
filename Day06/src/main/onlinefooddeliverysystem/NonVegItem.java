package main.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
    }

    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity();
    }

    public double applyDiscount(double percentage) {
        return calculateTotalPrice() - (calculateTotalPrice() * percentage / 100);
    }

    public String getDiscountDetails() {
        return "Discount available for Non-Veg Items.";
    }
}
