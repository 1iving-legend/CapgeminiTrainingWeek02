
class Manager extends Employee {
    private int teamSize;

    // Constructor
    public Manager(int employeeID, String department, double salary, int teamSize) {
        super(employeeID, department, salary);
        this.teamSize = teamSize;
    }

    // Display details
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID); // Accessing public member
        System.out.println("Department: " + department); // Accessing protected member
        System.out.println("Team Size: " + teamSize);
    }

    public static void main(String[] args) {
        Manager manager = new Manager(1001, "IT", 75000.0, 10);
        manager.displayDetails();

        // Access and modify salary
        System.out.println("Salary: $" + manager.getSalary());
        manager.setSalary(80000.0);
        System.out.println("Updated Salary: $" + manager.getSalary());
    }
}

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }
}


