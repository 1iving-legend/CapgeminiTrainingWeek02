package main.employ_management_system;

import java.util.*;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("FT101", "Alice", 50000, 20000));
        employees.add(new PartTimeEmployee("PT202", "Bob", 20000, 500, 40));

        EmployeeWithDepartment empWithDept = new EmployeeWithDepartment("FT303", "Charlie", 60000, 25000);
        empWithDept.assignDepartment("IT");
        employees.add(empWithDept);

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println();
        }
    }
}
