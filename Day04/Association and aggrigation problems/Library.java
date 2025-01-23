import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book obj= new Book("java","Herbert Schildt");//here book exist independent of library class
        Book obj1= new Book("Cpp","Bjarne Stroustrup");
        Library lib= new Library();
        lib.addBook(obj);
        lib.addBook(obj1);
        lib.displayBook();
    }
}

class Book {
  private  String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class Library{
ArrayList<Book> books;

    public Library()
    {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book)
    {
        books.add(book);
    }
    public void displayBook() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book.getTitle() + " - " + book.getAuthor());
            }
        }
    }
}


