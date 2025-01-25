package main.multilevel_inheritance.edu_course;

// Main Class
public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        // Create an instance of main.multilevel_inheritance.edu_course.Course
        Course course = new Course("Java Basics", 40);
        System.out.println("--- main.multilevel_inheritance.edu_course.Course Details ---");
        course.displayCourseDetails();

        // Create an instance of main.multilevel_inheritance.edu_course.OnlineCourse
        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 50, "Udemy", true);
        System.out.println("\n--- Online main.multilevel_inheritance.edu_course.Course Details ---");
        onlineCourse.displayCourseDetails();

        // Create an instance of main.multilevel_inheritance.edu_course.PaidOnlineCourse
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Spring Framework", 60, "Coursera", true, 200, 20);
        System.out.println("\n--- Paid Online main.multilevel_inheritance.edu_course.Course Details ---");
        paidOnlineCourse.displayCourseDetails();
    }
}
