package main.assisted_problems.employee;

public class Manager extends Employee {
    String department;

    public Manager() {
    }

    public Manager(String name, int salary, int id, String department) {
        super(name, salary, id);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}
