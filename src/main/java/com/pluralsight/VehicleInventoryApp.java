package com.pluralsight;

public class VehicleInventoryApp {
    static Vehicle[] vehicles = new Vehicle[20];
    static int vehicleCount = 0;

    public static void main(String[] args) {

        vehicles[vehicleCount] = new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500);
        vehicleCount++;

        vehicles[vehicleCount] = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        vehicleCount++;

        vehicles[vehicleCount] = new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700);
        vehicleCount++;

        vehicles[vehicleCount] = new Vehicle(101124, "Honda Civic", "White", 70000, 7500);
        vehicleCount++;

        vehicles[vehicleCount] = new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500);
        vehicleCount++;

        vehicles[vehicleCount] = new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000);
        vehicleCount++;

        listAllVehicles();

    }
    public static void listAllVehicles() {
        System.out.println(vehicleCount);
    }
}
