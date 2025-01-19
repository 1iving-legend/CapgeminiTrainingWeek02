
public class Main {
    public static void main(String[] args) {
      

       
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person(person1); // Copy constructor
        System.out.println("Cloned Person: " + person2.name + ", " + person2.age);

       
    }
}


class Person {
    String name;
    int age;

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
}

