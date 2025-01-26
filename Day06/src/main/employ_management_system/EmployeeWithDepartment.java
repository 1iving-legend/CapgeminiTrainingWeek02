package main.employ_management_system;

public class EmployeeWithDepartment extends FullTimeEmployee implements Department {
    private String departmentName;

    public EmployeeWithDepartment(String employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary, fixedSalary);
    }

    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentDetails() {
        return "main.employ_management_system.Department: " + departmentName;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println(getDepartmentDetails());
    }
}
