

public class StudentDetails {
    public static void main(String[] args){
        Student student1 = new Student("Survesh", 92, 90);
        student1.displayDetails();
        Student student2 = new Student("Sujal", 86, 99);
        student2.displayDetails();
    }
}


class Student{
    String name;
    int rollNumber;
    double marks;

    Student(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public char calculateGrade(){

            if (marks >= 90) {
                return 'A';
            } else if (marks >= 80) {
                return 'B';
            } else if (marks >= 70) {
                return 'C';
            } else if (marks >= 60) {
                return 'D';
            } else {
                return 'F';
            }

    }
    public void displayDetails(){
        char grade = calculateGrade();
        System.out.println("Name: "+ name);
        System.out.println("Roll No.: "+ rollNumber);
        System.out.println("marks: "+ marks);
        System.out.println("Grade: " + grade);
    }
}


