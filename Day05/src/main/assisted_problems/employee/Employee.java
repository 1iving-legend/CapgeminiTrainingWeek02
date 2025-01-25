package main.assisted_problems.employee;

public class Employee {

    String name;
    int id;
    int salary;

    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public Employee() {
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
        System.out.println("Salary: " + salary);
    }
}

