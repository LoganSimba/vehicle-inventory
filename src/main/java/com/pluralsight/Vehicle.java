package com.pluralsight;

public class Vehicle {
    private long vehicelId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private double price;

    // cunstroctor for the vehicle class
    public Vehicle(long vehicelId, String makeModel, String color, int odometerReading, double price) {
        this.vehicelId = vehicelId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }


    public long getVehicelId() {
        return vehicelId;
    }

    public void setVehicelId(long vehicelId) {
        this.vehicelId = vehicelId;
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
}
