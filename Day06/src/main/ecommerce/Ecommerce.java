package main.ecommerce;

import java.util.*;

public class Ecommerce {
    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double tax = product instanceof Taxable ? ((Taxable) product).calculateTax() : 0;
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("main.ecommerce.Product: " + product.getName());
            System.out.println("Base Price: " + product.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E101", "Laptop", 50000));
        products.add(new Clothing("C202", "T-Shirt", 1000));
        products.add(new Groceries("G303", "Apple", 200));

        calculateFinalPrice(products);
    }
}
