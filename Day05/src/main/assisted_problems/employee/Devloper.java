package main.assisted_problems.employee;

public class Devloper extends Manager {
    String programmingLanguage;
    public Devloper() {};

    public Devloper(String name, int salary, int id, String department, String programmingLanguage) {
        super(name, salary, id, department);
        this.programmingLanguage = programmingLanguage;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
