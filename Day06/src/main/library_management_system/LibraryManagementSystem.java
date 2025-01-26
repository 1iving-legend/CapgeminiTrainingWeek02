package main.library_management_system;

import java.util.*;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(new Book("B101", "Java Programming", "James Gosling"));
        libraryItems.add(new Magazine("M202", "Tech Monthly", "Various"));
        libraryItems.add(new DVD("D303", "Inception", "Christopher Nolan"));

        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                reservable.reserveItem();
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
            }
            System.out.println();
        }
    }
}