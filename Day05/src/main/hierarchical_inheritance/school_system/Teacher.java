package main.hierarchical_inheritance.school_system;

public class Teacher extends Person{
    String subject;

    // Constructor for main.hierarchical_inheritance.school_system.Teacher
    Teacher(String name, int age, String subject){
        super(name,age); // Call to the superclass constructor
        this.subject = subject;
    }
    // Method to display role
    void displayRole(){
        System.out.println("Roll is main.hierarchical_inheritance.school_system.Teacher");
        System.out.println("Subject: "+ subject);
    }

}
