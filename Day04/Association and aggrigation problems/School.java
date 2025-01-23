import java.util.ArrayList;




public class Main {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Greenfield High School");

        // Create students
        Student student1 = new Student("Alice", 1);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Charlie", 3);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Create courses
        Course course1 = new Course("Mathematics", 101);
        Course course2 = new Course("Science", 102);
        Course course3 = new Course("History", 103);

        // Enroll students in courses
        student1.enrollInCourse(course1);
        student1.enrollInCourse(course2);

        student2.enrollInCourse(course2);
        student2.enrollInCourse(course3);

        student3.enrollInCourse(course1);

        // Display students in the school
        school.displayStudents();

        // Display courses for each student
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();
        student3.displayEnrolledCourses();

        // Display enrolled students for each course
        course1.displayEnrolledStudents();
        course2.displayEnrolledStudents();
        course3.displayEnrolledStudents();
    }
}

class School {
    private String name;
    private ArrayList<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Students in " + name + ":");
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }
}

class Student {
    private String name;
    private int id;
    private ArrayList<Course> courses;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this); // Ensures bidirectional association
        }
    }

    public void displayEnrolledCourses() {
        System.out.println("Courses for Student " + name + ":");
        for (Course course : courses) {
            System.out.println(" - " + course.getName());
        }
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String name;
    private int courseCode;
    private ArrayList<Student> enrolledStudents;

    public Course(String name, int courseCode) {
        this.name = name;
        this.courseCode = courseCode;
        this.enrolledStudents = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + name + ":");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }

    public String getName() {
        return name;
    }
}

