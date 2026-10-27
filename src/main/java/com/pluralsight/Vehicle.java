package com.pluralsight;
/**
 * Represents one vehicle in the dealership inventory.
 */
public class Vehicle {

    // Vehicle details (private so they can only be changed through getters/setters)
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    /**
     * Creates a vehicle with all of its details.
     */

    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, double price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }


    // getters and setters: read or update each field
    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the vehicle's details as text, so System.out.println(vehicle)
     * prints readable info instead of a memory address.
     */

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", odometerReading=" + odometerReading +
                ", price=" + price +
                '}';
    }


}
