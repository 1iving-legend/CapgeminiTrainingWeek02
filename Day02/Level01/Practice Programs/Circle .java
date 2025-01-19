



public class Main {
    public static void main(String[] args) {
        

        
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.0);
        System.out.println("Default Circle Radius: " + defaultCircle.radius);
        System.out.println("Custom Circle Radius: " + customCircle.radius);

    }
}


class Circle {
    double radius;

    // Default Constructor
    public Circle() {
        this(1.0); 
    }

    // Parameterized Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
}


