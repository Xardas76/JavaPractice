package com.company;

public class Ball {
    private String purpose;
    private String manufacturer;
    private int radius;

    public Ball(String purpose, String manufacturer, int radius) {
        this.purpose = purpose;
        this.manufacturer = manufacturer;
        this.radius = radius;
    }

    public Ball(int radius) {
        this.purpose = "general purpose";
        this.manufacturer = "Unknown";
        this.radius = radius;
    }

    public Ball() {
        this.purpose = "general purpose";
        this.manufacturer = "Unknown";
        this.radius = 0;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Ball for " + purpose + " by " +
                manufacturer + ", " +
                radius + " inches";
    }
}
