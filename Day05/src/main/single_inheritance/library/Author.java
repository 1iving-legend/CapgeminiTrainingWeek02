package main.single_inheritance.library;

// Subclass: main.single_inheritance.library.Author
public class Author extends Book {
    String name;
    String bio;

    // Constructor for main.single_inheritance.library.Author
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // Call to the superclass constructor
        this.name = name;
        this.bio = bio;
    }

    // Override displayInfo() to include author details
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("main.single_inheritance.library.Author Name: " + name);
        System.out.println("main.single_inheritance.library.Author Bio: " + bio);
    }
}
