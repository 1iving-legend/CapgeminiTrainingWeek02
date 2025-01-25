package main.hierarchical_inheritance.school_system;

public class Staff extends  Person{
    int salary;

    // Constructor for main.hierarchical_inheritance.school_system.Staff
    Staff(String name, int age, int salary){
        super(name,age); // Call to the superclass constructor
        this.salary = salary;
    }
    // Method to display role
    void displayRole(){
        System.out.println("Roll is main.hierarchical_inheritance.school_system.Staff");
        System.out.println("Salary: "+ salary);
    }
}
