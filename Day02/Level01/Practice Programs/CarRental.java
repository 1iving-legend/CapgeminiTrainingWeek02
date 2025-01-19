
public class Main {
    public static void main(String[] args) {
        // CarRental Example
        CarRental rental = new CarRental("Emily", "Sedan", 5, 100.0);
        System.out.println("Total Rental Cost: $" + rental.calculateTotalCost());
    }
}




class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    // Default Constructor
    public CarRental() {
        this.customerName = "Customer";
        this.carModel = "Economy";
        this.rentalDays = 1;
        this.costPerDay = 50.0;
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Method to Calculate Total Cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }
}



