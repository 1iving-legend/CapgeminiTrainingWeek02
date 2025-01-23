import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Tech University");

        // Create departments (composition relationship)
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");
        Department department3 = new Department("Physics");

        // Add departments to the university
        university.addDepartment(department1);
        university.addDepartment(department2);
        university.addDepartment(department3);

        // Create faculty members (aggregation relationship)
        Faculty faculty1 = new Faculty("Dr. Smith", "Professor");
        Faculty faculty2 = new Faculty("Dr. Johnson", "Assistant Professor");
        Faculty faculty3 = new Faculty("Dr. Brown", "Lecturer");

        // Add faculty members to the university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.addFaculty(faculty3);

        // Display university details
        university.displayDetails();

        // Delete the university (composition behavior)
        university.deleteUniversity();

        // Display university details after deletion
        university.displayDetails(); // Departments will be cleared, but faculty still exists
    }
}




class University {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add a department to the university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Add a faculty member to the university
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Display departments and faculty members
    public void displayDetails() {
        System.out.println("University: " + name);

        System.out.println("\nDepartments:");
        for (Department department : departments) {
            System.out.println(" - " + department.getName());
        }

        System.out.println("\nFaculty Members:");
        for (Faculty faculty : faculties) {
            System.out.println(" - " + faculty.getName());
        }
    }

    // Delete the university (composition behavior)
    public void deleteUniversity() {
        System.out.println("\nDeleting University and all its departments...");
        departments.clear(); // All departments are deleted.
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Faculty {
    private String name;
    private String designation;

    public Faculty(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }
}

