package com.company;

import com.company.Persons.Employee;
import com.company.Trains.Train;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Train> trains;
    private ArrayList<Employee> employees;
    private ArrayList<Trip> trips;
    private ArrayList<Trip> completedTrips;

    public Company(String name, ArrayList<Train> trains, ArrayList<Employee> employees, ArrayList<Trip> trips) {
        this.name = name;
        this.trains = trains;
        this.employees = employees;
        this.trips = trips;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Train> getTrains() {
        return trains;
    }

    public void setTrains(ArrayList<Train> trains) {
        this.trains = trains;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Trip> getTrips() {
        return trips;
    }

    public void setTrips(ArrayList<Trip> trips) {
        this.trips = trips;
    }
}
