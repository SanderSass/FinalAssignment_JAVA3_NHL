package com.company.Main;

import com.company.Main.Destination.Destination;
import com.company.Main.Person.Employee;
import com.company.Main.Person.Passenger;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

public class Trip {
    private Train assignedTrain;
    private Company company;
    private String tripNo;
    private Destination destination;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private Boolean cancelled;
    private double distance;
    private boolean complete;
    private HashSet<Employee> crew;
    private HashSet<Passenger> passengers;

    public Trip(Train train, String tripNo, Destination destination, LocalDate departureDate, LocalTime departureTime, double distance, Company company) {
        this.assignedTrain = train;
        this.tripNo = tripNo;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.distance = distance;
        this.company = company;
        this.cancelled = false;
        this.complete = false;
        this.crew = new HashSet<>();
        this.passengers = new HashSet<>();
        company.addTrip(this);
    }

    /**
     * Mark this trip as complete and add this trip to the train's past trips
     */
    public void completeTrip() {
        for(Employee employee : this.crew) {
            employee.setFree();
            this.company.addToPastTrips(this);
            this.company.getTrips().remove(this);
        }
    }

    /**
     * Get total trip expenses
     * @return  total trip expenses
     */
    public double getTotalTripExpense() {
        double total = 0;
        total += this.assignedTrain.getFuelConsumptionPerKm() * this.distance;
        total += getCrewSalary();
        return total;
    }

    /**
     * Gets total salary need to be paid to the crew
     * @return total salary
     */
    public double getCrewSalary(){
        double salary = 0;
        for(Employee employee : this.crew) {
            salary += employee.getSalary();
        }
        return salary;
    }

    /**
     * Get total profit made by this trip
     * @return  profit
     */
    public double getProfit(){
        double totalSpent = 0;
        double totalGained = 0;
        totalSpent += this.assignedTrain.getFuelConsumptionPerKm() * this.distance;
        totalSpent += getCrewSalary();
        //TODO: add passengers' ticket price
        return totalGained - totalSpent;
    }

    //TODO: add method checkSeat(seatNum, Passenger person)

    public void addPassenger(Passenger passenger) {
        this.passengers.add(passenger);
    }

    //Getters and Setters

    public Train getAssignedTrain() {
        return assignedTrain;
    }

    public void setAssignedTrain(Train assignedTrain) {
        this.assignedTrain = assignedTrain;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String getTripNo() {
        return tripNo;
    }

    public void setTripNo(String tripNo) {
        this.tripNo = tripNo;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public Boolean getCancelled() {
        return cancelled;
    }

    public void setCancelled(Boolean cancelled) {
        this.cancelled = cancelled;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete() {
        this.complete = true;
    }

    public HashSet<Employee> getCrew() {
        return crew;
    }

    public void setCrew(HashSet<Employee> crew) {
        this.crew = crew;
    }

    public HashSet<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(HashSet<Passenger> passengers) {
        this.passengers = passengers;
    }
}
