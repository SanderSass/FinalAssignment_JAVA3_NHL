package com.company;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Trip {
    private Train train;
    private String tripId;
    private ArrayList<Employee> crew;
    private ArrayList<Passenger> passengers;
    private LocalDateTime departureDate;
    private boolean cancelled;
    private double kmDistance;
    private boolean complete;
    private String destination;

    public Trip(Train train,
                String tripId,
                ArrayList<Employee> crew,
                ArrayList<Passenger> passengers,
                LocalDateTime departureDate,
                boolean cancelled,
                double kmDistance,
                boolean complete,
                String destination) {
        this.train = train;
        this.tripId = tripId;
        this.crew = crew;
        this.passengers = passengers;
        this.departureDate = departureDate;
        this.cancelled = cancelled;
        this.kmDistance = kmDistance;
        this.complete = complete;
        this.destination = destination;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public String getTripId() {
        return tripId;
    }

    public void setTripId(String tripId) {
        this.tripId = tripId;
    }

    public ArrayList<Employee> getCrew() {
        return crew;
    }

    public void setCrew(ArrayList<Employee> crew) {
        this.crew = crew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public LocalDateTime getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDateTime departureDate) {
        this.departureDate = departureDate;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public double getKmDistance() {
        return kmDistance;
    }

    public void setKmDistance(double kmDistance) {
        this.kmDistance = kmDistance;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
