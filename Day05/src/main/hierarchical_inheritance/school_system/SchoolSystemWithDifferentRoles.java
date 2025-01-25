package main.hierarchical_inheritance.school_system;

public class SchoolSystemWithDifferentRoles {
    public static void main(String[] args) {

        // Create instances of each role
        Teacher teacher = new Teacher("anil",21,"Maths");
        Student student = new Student("Mohit", 23,'A');
        Staff staff = new Staff("Soham",27,20000);

        // Display details for each role
        System.out.println("--- main.hierarchical_inheritance.school_system.Teacher Details ---");
        teacher.displayDetails();
        teacher.displayRole();

        System.out.println("\n--- main.hierarchical_inheritance.school_system.Student Details ---");
        student.displayDetails();
        student.displayRole();

        System.out.println("\n--- main.hierarchical_inheritance.school_system.Staff Details ---");
        staff.displayDetails();
        staff.displayRole();

    }
}
