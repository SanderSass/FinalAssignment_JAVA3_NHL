package com.company.Main.Person;

import com.company.Main.Meal.Meal;
import com.company.Main.Ticket.Ticket;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;

public class Passenger extends Person {
    private HashSet<Ticket> boughtTicket;

    public Passenger(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.boughtTicket = new HashSet<>();
        this.meal = new HashSet<>();
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

    public int getAge() {
        LocalDate curDate = LocalDate.now();
        if ((dateOfBirth != null && (curDate != null)))
        {
            int age = Period.between(dateOfBirth, curDate).getYears();
            return age;
        }
        return 0;
    }

    // TODO finish this method
    //public String buyFirstClassTicket() {}
}
