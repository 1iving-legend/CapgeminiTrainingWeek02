package main.multilevel_inheritance.edu_course;

// Subclass: main.multilevel_inheritance.edu_course.OnlineCourse
public class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    // Constructor for main.multilevel_inheritance.edu_course.OnlineCourse
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call to the base class constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Method to display online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Call to the superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
