

public class Main {
    public static void main(String[] args) {
       
        Book book1 = new Book("Java Programming", "John Doe", 599.99, true);
        book1.borrowBook();

    }
}




class Book {
    String title;
    String author;
    double price;
    boolean availability;


    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.availability = true;
    }

    
    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

   
    public boolean borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("The book \"" + title + "\" has been borrowed.");
            return true;
        } else {
            System.out.println("The book \"" + title + "\" is not available.");
            return false;
        }
    }
}







