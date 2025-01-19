
class Course {
    // Instance Variables
    private String courseName;
    private int duration; // Duration in weeks
    private double fee;

    // Class Variable
    private static String instituteName = "Tech Academy";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method: Display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class Method: Update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method for testing
    public static void main(String[] args) {
        Course course1 = new Course("Java Programming", 12, 300.0);
        Course course2 = new Course("Web Development", 10, 250.0);

        // Display initial details
        course1.displayCourseDetails();
        course2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("Global Tech Institute");

        // Display updated details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
