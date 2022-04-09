package com.company.Main;

import com.sun.xml.internal.bind.v2.TODO;

public class Train {
    private String brand;
    private String model;
    private Trip assignedTrip;
    private Company trainOwner;
    private final double fuelConsumptionPerKm;
    private final int capacity;
    private final int numberOfFirstClassSeats;
    private final int numberOfSecondClassSeats;

    public Train(Company trainOwner)
    {
        this.brand = "NS";
        this.model = "123";
        this.trainOwner = trainOwner;
        this.fuelConsumptionPerKm = 5;
        this.capacity = 200;
        this.numberOfFirstClassSeats = 50;
        this.numberOfSecondClassSeats = 150;
    }

    // TODO: add seatIsAvailable() method
    // TODO: add checkFirstClassTicket() method

    /**
     * @return the assignedTrip
     * @param trip
     * @return
     */
    public String assignTrip(Trip trip)
    {
        if(this.assignedTrip == null)
        {
            this.assignedTrip = trip;
            return "Trip assigned to train";
        }
        else
        {
            return "Trip already assigned to another train";
        }
    }

    //Getters and setters

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

    public Trip getAssignedTrip() {
        return assignedTrip;
    }

    public void setAssignedTrip(Trip assignedTrip) {
        this.assignedTrip = assignedTrip;
    }

    public Company getTrainOwner() {
        return trainOwner;
    }

    public void setTrainOwner(Company trainOwner) {
        this.trainOwner = trainOwner;
    }

    public double getFuelConsumptionPerKm() {
        return fuelConsumptionPerKm;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfFirstClassSeats() {
        return numberOfFirstClassSeats;
    }

    public int getNumberOfSecondClassSeats() {
        return numberOfSecondClassSeats;
    }
}
