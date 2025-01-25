package main.single_inheritance.smarthomedevice;

// Subclass: main.single_inheritance.smarthomedevice.Thermostat
public class Thermostat extends Device {
    double temperatureSetting;

    // Constructor for main.single_inheritance.smarthomedevice.Thermostat
    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status); // Call to the superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Override displayStatus() to include thermostat-specific details
    @Override
    public void displayStatus() {
        super.displayStatus(); // Call the superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
