package main.multilevel_inheritance.edu_course;


// Base Class: main.multilevel_inheritance.edu_course.Course
class Course {
    String courseName;
    int duration; // in hours

    // Constructor for main.multilevel_inheritance.edu_course.Course
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course details
    public void displayCourseDetails() {
        System.out.println("main.multilevel_inheritance.edu_course.Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}



