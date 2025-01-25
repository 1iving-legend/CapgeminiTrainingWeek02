package main.hybrid_inheritance.restaurant;

public class Person {
    protected String name;
    protected int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getter methods for name and id
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
