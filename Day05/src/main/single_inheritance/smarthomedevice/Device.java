package main.single_inheritance.smarthomedevice;

class Device {
    String deviceId;
    String status;

    // Constructor for main.single_inheritance.smarthomedevice.Device
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display the device's general status
    public void displayStatus() {
        System.out.println("main.single_inheritance.smarthomedevice.Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

