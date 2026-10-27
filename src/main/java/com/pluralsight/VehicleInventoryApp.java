package com.pluralsight;
import java.util.Scanner;

/**
 * Vehicle Inventory App
 * A command-line program that stores vehicles in an array and lets the user
 * list, search, and add vehicles from a menu.
 */
public class VehicleInventoryApp {
    // Array that holds up to 20 vehicles
    static Vehicle[] vehicles = new Vehicle[20];
    // How many vehicles are actually stored (also the next open slot in the array)
    static int vehicleCount = 0;
    // One shared Scanner for all user input
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Load the starting inventory: 6 vehicles
        // Each time: put the vehicle in the next open slot, then move the counter up
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


        // Main menu: keeps showing until the user picks 6 (Quit)
        int command;
        do{
            // Show the menu options
            System.out.println("What do you want to do?");
            System.out.println(" 1 - List all vehicles");
            System.out.println(" 2 - Search by make/model");
            System.out.println(" 3 - Search by price range");
            System.out.println(" 4 - Search by color");
            System.out.println(" 5 - Add a vehicle");
            System.out.println(" 6 - Quit");
            System.out.println("Enter your command: ");

            //Store the answer
            command = input.nextInt();

            // Do something based on the answer
            switch (command) {
                case 1 ->listAllVehicles();
                case 2 -> searchByMake();
                case 3 -> searchByPrice();
                case 4 -> searchByColor();
                case 5 -> addVehicle();
                case 6 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid command");
            }
        } while (command!=6);

    }

    /**
     * Prints the total number of vehicles, then every vehicle in the inventory.
     */

    public static void listAllVehicles() {
        System.out.println("Total: " +vehicleCount);
        // Loop only up to vehicleCount so we skip the empty (null) slots
        for (int i = 0; i < vehicleCount; i++) {
            System.out.println(vehicles[i]);
        }
    }


    /**
     * Asks for a make/model and prints every vehicle that matches it.
     * The match ignores upper/lower case.
     */

    public static void searchByMake() {
        // Clear the leftover Enter key from nextInt in the menu
        input.nextLine();
        System.out.println("Enter make model:");
        String model = input.nextLine();
        // Check each vehicle and print the ones that match
        for ( int i = 0; i < vehicleCount; i++ ) {
            if ( vehicles[i].getMakeModel().equalsIgnoreCase(model) ) {
                System.out.println(vehicles[i]);
            }
        }
    }

    /**
     * Asks the user for a new vehicle's details and adds it to the inventory.
     */

    public static void addVehicle() {

        // Get the vehicles details from the user
        System.out.print("Enter Vehicle ID: ");
        long vehicleId = input.nextLong();

        // Clear the leftover Enter key before reading text with nextLine()
        input.nextLine();

        System.out.print("Enter Vehicle Make Model: ");
        String makeModel = input.nextLine();

        System.out.print("Enter Vehicle Color: ");
        String color = input.nextLine();

        System.out.print("Enter Vehicle Odometer Reading: ");
        int odometerReading = input.nextInt();

        System.out.print("Enter Vehicle Price: ");
        double price = input.nextDouble();

        // Create the new vehicle and put it in the next open slot then move the counter
        vehicles[vehicleCount] = new Vehicle(vehicleId, makeModel, color, odometerReading, price);
        vehicleCount++;

        System.out.println("Vehicle added successfully!");
    }

    /**
     * Asks for a color and prints every vehicle with that color.
     * The match ignores upper/lower case.
     */

    public static void searchByColor() {
        // Clear the leftover Enter key
        input.nextLine();
        System.out.print("Enter color: ");
        String color = input.nextLine();
        // Check each vehicle and print the ones that match
        for ( int i = 0; i < vehicleCount; i++ ) {
            if ( vehicles[i].getColor().equalsIgnoreCase(color) ) {
                System.out.println(vehicles[i]);
            }
        }
    }

    /**
     * Asks for a minimum and maximum price and prints every vehicle
     * priced within that range (including the min and max).
     */

    public static void searchByPrice() {
        input.nextLine();
        System.out.print("Enter Minimum price: ");
        double minPrice = input.nextDouble();

        System.out.println("Enter Maximum price: ");
        double maxPrice = input.nextDouble();

        // Print each vehicle whose price is between min and max
        for ( int i = 0; i < vehicleCount; i++ ) {
            double price = vehicles[i].getPrice();
            if ( price >= minPrice && price <= maxPrice ) {
                System.out.println(vehicles[i]);
            }
        }


    }
}
