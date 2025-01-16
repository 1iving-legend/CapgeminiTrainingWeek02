import java.util.Scanner;

class CircleMain {
    public static void main(String[] args) {
        Circle obj = new Circle();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        System.out.println("Area of circle: " + obj.area(r));
        System.out.println("Circumference of circle: " + obj.circumference(r));

        sc.close();
    }
}

class Circle {
    public double area(double radii) {
        return Math.PI * radii * radii;
    }

    public double circumference(double radii) {
        return Math.round((2 * Math.PI * radii)*100.0)/100.0;
    }
}
