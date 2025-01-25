package main.assisted_problems.employee;

public class Intern extends Manager {
    public Intern(String name, int salary, int id, String department) {
        super(name, salary, id, department);
    }

    @Override
    public void displayDetails() {
      super.displayDetails();
      System.out.println("Inheritance.employee.Intern Department: " + department);
  }
}
