package main.library_management_system;

public class Book extends LibraryItem implements Reservable {
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("main.library_management_system.Book reserved: " + getTitle());
    }

    public boolean checkAvailability() {
        return true;
    }
}
