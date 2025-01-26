package main.employ_management_system;

public class FullTimeEmployee extends Employee {
    private double fixedSalary;

    public FullTimeEmployee(String employeeId, String name, double baseSalary, double fixedSalary) {
        super(employeeId, name, baseSalary);
        this.fixedSalary = fixedSalary;
    }

    public double calculateSalary() {
        return getBaseSalary() + fixedSalary;
    }
}
