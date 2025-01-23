import java.util.ArrayList;

// Student class
class Student {
    private String name;
    private int id;
    private ArrayList<Course> enrolledCourses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.enrolledCourses = new ArrayList<>();
    }

    // Enroll in a course
    public void enrollCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
            course.addStudent(this); // Ensure bidirectional association
        }
        System.out.println(name + " has enrolled in " + course.getName());
    }

    // Display enrolled courses
    public void displayCourses() {
        System.out.println("Student: " + name + " (ID: " + id + ")");
        System.out.println("Enrolled Courses:");
        for (Course course : enrolledCourses) {
            System.out.println(" - " + course.getName());
        }
    }

    public String getName() {
        return name;
    }
}

// Professor class
class Professor {
    private String name;
    private int id;
    private ArrayList<Course> assignedCourses;

    public Professor(String name, int id) {
        this.name = name;
        this.id = id;
        this.assignedCourses = new ArrayList<>();
    }

    // Assign a course to the professor
    public void assignCourse(Course course) {
        if (!assignedCourses.contains(course)) {
            assignedCourses.add(course);
            course.setProfessor(this); // Ensure bidirectional association
        }
        System.out.println(name + " has been assigned to teach " + course.getName());
    }

    // Display assigned courses
    public void displayCourses() {
        System.out.println("Professor: " + name + " (ID: " + id + ")");
        System.out.println("Assigned Courses:");
        for (Course course : assignedCourses) {
            System.out.println(" - " + course.getName());
        }
    }

    public String getName() {
        return name;
    }
}

// Course class
class Course {
    private String name;
    private int code;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    public Course(String name, int code) {
        this.name = name;
        this.code = code;
        this.enrolledStudents = new ArrayList<>();
    }

    // Add a student to the course
    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    // Set the professor for the course
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    // Display course details
    public void displayDetails() {
        System.out.println("Course: " + name + " (Code: " + code + ")");
        System.out.println("Professor: " + (professor != null ? professor.getName() : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }

    public String getName() {
        return name;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Student student3 = new Student("Charlie", 103);

        // Create professors
        Professor professor1 = new Professor("Dr. Smith", 201);
        Professor professor2 = new Professor("Dr. Johnson", 202);

        // Create courses
        Course course1 = new Course("Computer Science", 301);
        Course course2 = new Course("Mathematics", 302);
        Course course3 = new Course("Physics", 303);

        // Students enroll in courses
        student1.enrollCourse(course1);
        student2.enrollCourse(course1);
        student2.enrollCourse(course2);
        student3.enrollCourse(course3);

        // Professors are assigned to courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);
        professor2.assignCourse(course3);

        // Display details
        System.out.println("\nCourse Details:");
        course1.displayDetails();
        course2.displayDetails();
        course3.displayDetails();

        System.out.println("\nStudent Details:");
        student1.displayCourses();
        student2.displayCourses();
        student3.displayCourses();

        System.out.println("\nProfessor Details:");
        professor1.displayCourses();
        professor2.displayCourses();
    }
}
