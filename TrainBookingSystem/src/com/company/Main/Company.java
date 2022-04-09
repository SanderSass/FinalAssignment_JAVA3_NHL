package com.company.Main;

import com.company.Exceptions.ExistingEmployeeException;
import com.company.Exceptions.NotEnoughCrewMembersException;
import com.company.Main.Person.Employee;

import java.util.HashSet;

public class Company {
    private String name;
    private HashSet<Train> trains;
    private HashSet<Employee> employees;
    private HashSet<Trip> trips;
    private HashSet<Trip> pastTrips;

    public Company(String name) {
        this.name = name;
        this.trains = new HashSet<>();
        this.employees = new HashSet<>();
        this.trips = new HashSet<>();
        this.pastTrips = new HashSet<>();
    }

    /**
     * Get all past trips of the company
     *
     * @return HashSet of past trips
     */
    public HashSet<Trip> getTripHistory() {
        return pastTrips;
    }

    /**
     * Add a new employee to the company
     * @param employee
     * @return  String with the name of the employee
     */
    public String addEmployee(Employee employee) {
        try {
            if(!this.employees.contains(employee)) {
                this.employees.add(employee);
                return "Employee" + employee + " added successfully";
            }else{
                throw new ExistingEmployeeException();
            }
        }catch (ExistingEmployeeException e){
            return e.getMessage();
        }
    }

    /**
     * Add a new trip to the company
     * @param trip
     */
    public void addTrip(Trip trip) {
        if(!this.trips.contains(trip)) {
            this.trips.add(trip);
        }
    }

    public String findEmployee(Trip trip) {
        try {
            if(this.trips.contains(trip)) {
                int i = 0;
                HashSet<Employee> employees = new HashSet<>();
                if(trip.getCrew().isEmpty()) {
                    for (Employee employee : this.employees) {
                        if(i == 4) {
                            break;
                        }else {
                            if(!employee.isBusy()) {
                                employees.add(employee);
                                employee.setBusy();
                                i++;
                            }
                        }
                    }
                    if(employees.size() == 4) {
                        trip.setCrew(employees);
                    }else {
                        throw new NotEnoughCrewMembersException();
                    }
                }
            }
        }catch (NotEnoughCrewMembersException e){
            return e.getMessage();
        }
        return "Not enough crew members available in the company";
    }

    /**
     * Confirm if the company has a trip with the given tripNo
     * @param tripNo Trip number
     * @return  true if the company has a trip with the given tripNo
     */
    public Trip confirmTrip(String tripNo){
        Trip confirmedTrip = null;
        for (Trip trip : this.trips) {
            if(trip.getTripNo().equals(tripNo)) {
                confirmedTrip = trip;
            }
        }
        return confirmedTrip;
    }

    /**
     * Add a trip to the list of past trips of the company
     * @param trip
     */
    public void addToPastTrips(Trip trip) {
        if (!this.pastTrips.contains(trip)) {
            this.pastTrips.add(trip);
            trip.setComplete();
        }
    }

    /**
     * Add a new train to the company
     *
     * @param train
     */
    public void addTrain(Train train) {
        this.trains.add(train);
    }

    //Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Train> getTrains() {
        return trains;
    }

    public void setTrains(HashSet<Train> trains) {
        this.trains = trains;
    }

    public HashSet<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(HashSet<Employee> employees) {
        this.employees = employees;
    }

    public HashSet<Trip> getTrips() {
        return trips;
    }

    public void setTrips(HashSet<Trip> trips) {
        this.trips = trips;
    }

    public HashSet<Trip> getPastTrips() {
        return pastTrips;
    }

    public void setPastTrips(HashSet<Trip> pastTrips) {
        this.pastTrips = pastTrips;
    }
}
