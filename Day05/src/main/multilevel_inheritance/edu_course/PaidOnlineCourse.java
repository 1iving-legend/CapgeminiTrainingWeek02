package main.multilevel_inheritance.edu_course;

// Subclass: main.multilevel_inheritance.edu_course.PaidOnlineCourse
public class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // Percentage discount

    // Constructor for main.multilevel_inheritance.edu_course.PaidOnlineCourse
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call to the superclass constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Method to calculate the final fee after applying the discount
    public double calculateFinalFee() {
        return fee - (fee * (discount / 100));
    }

    // Method to display paid online course details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails(); // Call to the superclass method
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + calculateFinalFee());
    }
}
