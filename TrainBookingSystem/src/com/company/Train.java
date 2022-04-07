package com.company;

abstract class Train {
    private String brand;
    private String model;
    private int capacity;
    private boolean hasAssignedTrip;
    private int electricityPerKm;
    private int numberOfFirstClassSeat;
    private int numberOfSecondClassSeat;
    private int distanceTravelled;

//    public Train(String brand, String model, int capacity, boolean hasAssignedTrip, int electricityPerKm, int distanceTravelled) {
//        this.brand = brand;
//        this.model = model;
//        this.capacity = capacity;
//        this.hasAssignedTrip = hasAssignedTrip;
//        this.electricityPerKm = electricityPerKm;
//        this.distanceTravelled = distanceTravelled;
//    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isHasAssignedTrip() {
        return hasAssignedTrip;
    }

    public void setHasAssignedTrip(boolean hasAssignedTrip) {
        this.hasAssignedTrip = hasAssignedTrip;
    }

    public int getElectricityPerKm() {
        return electricityPerKm;
    }

    public void setElectricityPerKm(int electricityPerKm) {
        this.electricityPerKm = electricityPerKm;
    }

    public int getNumberOfFirstClassSeat() {
        return numberOfFirstClassSeat;
    }

    public void setNumberOfFirstClassSeat(int numberOfFirstClassSeat) {
        this.numberOfFirstClassSeat = numberOfFirstClassSeat;
    }

    public int getNumberOfSecondClassSeat() {
        return numberOfSecondClassSeat;
    }

    public void setNumberOfSecondClassSeat(int numberOfSecondClassSeat) {
        this.numberOfSecondClassSeat = numberOfSecondClassSeat;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
}
