
class Book {
    String title;
    String author;
    double price;
  

    // Default Constructor
    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
      
    }




public class Main {
    public static void main(String[] args) {
        // Book Example
        Book book1 = new Book("Java Programming", "John Doe", 599.99, true);
		Book book2 = new Book();
    }
}
