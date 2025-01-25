package main.assisted_problems.vehicle;

public class main {

    public static void main(String[] args) {
        Car car = new Car("petrol",300,10);

        car.displayInfo();

        Truck truck = new Truck("disel",100,600);
        truck.displayInfo();

        Motorcycle motorcycle = new Motorcycle("electric",60,"scooty");
        motorcycle.displayInfo();

    }
}
