class EBook extends Book {
    private double fileSize;

    // Constructor
    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    // Display details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
        System.out.println("File Size: " + fileSize + " MB");
    }

    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16-148410-0", "Learn Java", "John Doe", 1.5);
        ebook.displayDetails();

        // Access and modify author
        System.out.println("Author: " + ebook.getAuthor());
        ebook.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}


class Book {
    public String ISBN;
    protected String title;
    private String author;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
}

