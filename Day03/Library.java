

class Library extends Book {
   public static String libraryName = "Central-Library";

  public static void libraryName()
  {
      System.out.println(Library.libraryName);
  }
    // Constructor
    public Library(String ISBN, String title, String author) {
        super(ISBN, title, author);
        libraryName();
    }

    // Display details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN); // Accessing public member
        System.out.println("Title: " + title); // Accessing protected member
    }

    public static void main(String[] args) {
        Library ebook = new Library("978-3-16-148410-0", "Learn Java", "John Doe");
        Library ebook2 = new Library("978-3-16-148410-1", "Lesson of life", "vivek");

        if(ebook instanceof Library) {
            ebook.displayDetails();

            // Access and modify author
            System.out.println("Author: " + ebook.getAuthor());
            ebook.setAuthor("Jane Doe");
            System.out.println("Updated Author: " + ebook.getAuthor());
            System.out.println(Book.noOfBooks);
            
        }
        else{
            System.out.println("Not a library");
        }
    }
}


class Book {
    public final String ISBN;
    protected String title;
    private String author;
    public static int noOfBooks=0;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        noOfBooks++;
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

