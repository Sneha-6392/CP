package CP;
/*
 * Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
 */

 class Device {
    String deviceId;
    String status;

    // constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // data display karne ke liye
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
 }

 // subclass
 class Thermostats extends Device {
    int temperatureSetting;

    // constructor
    public Thermostats(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // Device class ka constructor call kar raha hai
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus(); // Device class ka displayStatus method call kar raha hai
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
 }

 public class Smart_Home_Devices {
    public static void main(String[] args) {
        Thermostats T1 = new Thermostats("T1001", "ON", 22);
        T1.displayStatus();
    }
 }