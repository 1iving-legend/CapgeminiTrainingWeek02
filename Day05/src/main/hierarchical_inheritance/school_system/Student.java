package main.hierarchical_inheritance.school_system;

public class Student extends Person{
    char grade;

    // Constructor for main.hierarchical_inheritance.school_system.Student
    Student(String name, int age, char grade){
        super(name, age); // Call to the superclass constructor
        this.grade = grade;
    }
    // Method to display role
    void displayRole(){
        System.out.println("Roll is main.hierarchical_inheritance.school_system.Student");
        System.out.println("Grade: "+ grade);
    }

}
