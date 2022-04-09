package com.company.Main;

import java.time.LocalDate;
import java.util.ArrayList;

public class Passenger {
    private String name;
    private LocalDate dateOfBirth;
    private Ticket ticket;
    private ArrayList<Meal> passengerMeals;

    public Passenger(String name, LocalDate dateOfBirth, Ticket ticket, ArrayList<Meal> passengerMeals) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.ticket = ticket;
        this.passengerMeals = passengerMeals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ArrayList<Meal> getPassengerMeals() {
        return passengerMeals;
    }

    public void setPassengerMeals(ArrayList<Meal> passengerMeals) {
        this.passengerMeals = passengerMeals;
    }
}
