package main.library_management_system;

public class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }

    public void reserveItem() {
        System.out.println("main.library_management_system.DVD reserved: " + getTitle());
    }

    public boolean checkAvailability() {
        return false;
    }
}
