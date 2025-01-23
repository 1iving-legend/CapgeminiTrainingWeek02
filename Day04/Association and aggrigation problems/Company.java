import java.util.ArrayList;

public class Company {
    private ArrayList<Department> departments;

    Company() {
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void closeCompany() {
        System.out.println("Closing Company...");
        departments.clear();
    }

    public void displayCompany() {
        for (Department department : departments) {
            System.out.println("Department: " + department.getName() + " (ID: " + department.getId() + ")");
            for (Employee employee : department.getEmployees()) {
                System.out.println(" - Employee ID: " + employee.getId() + ", Name: " + employee.getName() + ", Salary: " + employee.getSalary());
            }
        }
    }

    public static void main(String[] args) {
        Company company = new Company();

        // Creating departments
        Department department1 = new Department("Human Resource", 10);
        Department department2 = new Department("Computer Science", 20);

        company.addDepartment(department1);
        company.addDepartment(department2);

        // Adding employees
        Employee e1 = new Employee("Vivek", 100000, 1);
        Employee e2 = new Employee("Survesh", 120000, 21);
        Employee e3 = new Employee("Shivraj", 100000, 22);
        Employee e4 = new Employee("Sujal", 120000, 23);

        department1.addEmployee(e1);
        department1.addEmployee(e3);
        department2.addEmployee(e2);
        department2.addEmployee(e4);

        // Display company details
        company.displayCompany();

        // Close the company
        company.closeCompany();

        // Attempt to display after closing
        company.displayCompany();
    }
}

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}

class Department {
    private String name;
    private int id;
    private ArrayList<Employee> employees;

    public Department(String name, int id) {
        this.name = name;
        this.id = id;
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee obj) {
        employees.add(obj);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }
}
