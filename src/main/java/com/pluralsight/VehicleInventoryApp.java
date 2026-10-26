package com.pluralsight;
import java.util.Scanner;

public class VehicleInventoryApp {
    static Vehicle[] vehicles = new Vehicle[20];
    static int vehicleCount = 0;
    static Scanner input = new Scanner(System.in);

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

//        listAllVehicles();

        int command;
        do{
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");

            //store the answer
            command = input.nextInt();

            //do something based on the answer
            switch (command) {
                case 1 -> System.out.println("Coming Soon");
                case 2 -> System.out.println("Coming Soon");
                case 3 -> System.out.println("Coming Soon");
                case 4 -> System.out.println("Coming Soon");
                case 5 -> System.out.println("Coming Soon");
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid command");
            }
        } while (command!=6);







    }
    public static void listAllVehicles() {
        System.out.println(vehicleCount);
    }
}
